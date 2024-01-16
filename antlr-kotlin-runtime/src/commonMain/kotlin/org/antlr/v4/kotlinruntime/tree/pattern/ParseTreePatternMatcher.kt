// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree.pattern

import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.misc.MultiMap
import org.antlr.v4.kotlinruntime.misc.ParseCancellationException
import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.RuleNode
import org.antlr.v4.kotlinruntime.tree.TerminalNode

/**
 * A tree pattern matching mechanism for ANTLR [ParseTree]s.
 *
 * Patterns are strings of source input text with special tags representing
 * token or rule references such as:
 *
 * `<ID> = <expr>;`
 *
 * Given a pattern start rule such as `statement`, this object constructs
 * a [ParseTree] with placeholders for the `ID` and `expr`
 * subtree. Then the [.match] routines can compare an actual
 * [ParseTree] from a parse with this pattern. Tag `<ID>` matches
 * any `ID` token and tag `<expr>` references the result of the
 * `expr` rule (generally an instance of `ExprContext`).
 *
 * Pattern `x = 0;` is a similar pattern that matches the same pattern
 * except that it requires the identifier to be `x` and the expression to
 * be `0`.
 *
 * The [matches] routines return `true` or `false` based
 * upon a match for the tree rooted at the parameter sent in. The
 * [match] routines return a [ParseTreeMatch] object that
 * contains the parse tree, the parse tree pattern, and a map from tag name to
 * matched nodes (more below). A subtree that fails to match, returns with
 * [ParseTreeMatch.mismatchedNode] set to the first tree node that did not
 * match.
 *
 * For efficiency, you can compile a tree pattern in string form to a
 * [ParseTreePattern] object.
 *
 * See `TestParseTreeMatcher` for lots of examples.
 * [ParseTreePattern] has two static helper methods:
 * [ParseTreePattern.findAll] and [ParseTreePattern.match] that
 * are easy to use but not super efficient because they create new
 * [ParseTreePatternMatcher] objects each time and have to compile the
 * pattern in string form before using it.
 *
 * The lexer and parser that you pass into the [ParseTreePatternMatcher]
 * constructor are used to parse the pattern in string form. The lexer converts
 * the `<ID> = <expr>;` into a sequence of four tokens (assuming lexer
 * throws out whitespace or puts it on a hidden channel). Be aware that the
 * input stream is reset for the lexer (but not the parser; a
 * [ParserInterpreter] is created to parse the input.). Any user-defined
 * fields you have put into the lexer might get changed when this mechanism asks
 * it to scan the pattern string.
 *
 * Normally a parser does not accept token `<expr>` as a valid
 * `expr` but, from the parser passed in, we create a special version of
 * the underlying grammar representation (an [ATN]) that allows imaginary
 * tokens representing rules (`<expr>`) to match entire rules. We call
 * these *bypass alternatives*.
 *
 * Delimiters are `<` and `>`, with `\` as the escape string
 * by default, but you can set them to whatever you want using
 * [setDelimiters]. You must escape both start and stop strings
 * `\<` and `\>`.
 *
 * @param lexer Used to convert the tree pattern string into a series of tokens.
 *   The input stream is reset
 * @param parser Used to collect to the grammar file name, token names, rule names
 *   used to parse the pattern into a parse tree
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class ParseTreePatternMatcher(public val lexer: Lexer, public val parser: Parser) {
  public class CannotInvokeStartRule(e: Throwable) : RuntimeException(e)

  // Fixes https://github.com/antlr/antlr4/issues/413
  // "Tree pattern compilation doesn't check for a complete parse"
  public class StartRuleDoesNotConsumeFullPattern : RuntimeException()

  protected var start: String = "<"
  protected var stop: String = ">"
  protected var escape: String = "\\" // e.g., \< and \> must escape BOTH!

  /**
   * Set the delimiters used for marking rule and token tags within concrete
   * syntax used by the tree pattern parser.
   *
   * @param start The start delimiter
   * @param stop The stop delimiter
   * @param escapeLeft The escape sequence to use for escaping a start or stop delimiter
   *
   * @throws IllegalArgumentException If [start] is empty, or if [stop] is empty
   */
  public fun setDelimiters(start: String, stop: String, escapeLeft: String) {
    if (start.isEmpty()) {
      throw IllegalArgumentException("start cannot be null or empty")
    }

    if (stop.isEmpty()) {
      throw IllegalArgumentException("stop cannot be null or empty")
    }

    this.start = start
    this.stop = stop
    escape = escapeLeft
  }

  /**
   * Does [pattern] matched as rule [patternRuleIndex] match [tree]?
   */
  public fun matches(tree: ParseTree, pattern: String, patternRuleIndex: Int): Boolean {
    val p = compile(pattern, patternRuleIndex)
    return matches(tree, p)
  }

  /**
   * Does [pattern] matched as rule `patternRuleIndex` match [tree]? Pass in a
   * compiled pattern instead of a string representation of a tree pattern.
   */
  public fun matches(tree: ParseTree, pattern: ParseTreePattern): Boolean {
    val labels = MultiMap<String, ParseTree>()
    val mismatchedNode = matchImpl(tree, pattern.patternTree, labels)
    return mismatchedNode == null
  }

  /**
   * Compare [pattern] matched as rule [patternRuleIndex] against
   * [tree] and return a [ParseTreeMatch] object that contains the
   * matched elements, or the node at which the match failed.
   */
  public fun match(tree: ParseTree, pattern: String, patternRuleIndex: Int): ParseTreeMatch {
    val p = compile(pattern, patternRuleIndex)
    return match(tree, p)
  }

  /**
   * Compare [pattern] matched against [tree] and return a
   * [ParseTreeMatch] object that contains the matched elements, or the
   * node at which the match failed. Pass in a compiled pattern instead of a
   * string representation of a tree pattern.
   */
  public fun match(tree: ParseTree, pattern: ParseTreePattern): ParseTreeMatch {
    val labels = MultiMap<String, ParseTree>()
    val mismatchedNode = matchImpl(tree, pattern.patternTree, labels)
    return ParseTreeMatch(tree, pattern, labels, mismatchedNode)
  }

  /**
   * For repeated use of a tree pattern, compile it to a
   * [ParseTreePattern] using this method.
   */
  public fun compile(pattern: String, patternRuleIndex: Int): ParseTreePattern {
    val tokenList = tokenize(pattern)
    val tokenSrc = ListTokenSource(tokenList)
    val tokens = CommonTokenStream(tokenSrc)
    val parserInterp = ParserInterpreter(
      parser.grammarFileName,
      parser.vocabulary,
      parser.ruleNames.asList(),
      parser.atnWithBypassAlts,
      tokens,
    )

    val tree: ParseTree?

    try {
      parserInterp.errorHandler = BailErrorStrategy()
      tree = parserInterp.parse(patternRuleIndex)
    } catch (e: ParseCancellationException) {
      throw e.cause as RecognitionException
    } catch (re: RecognitionException) {
      throw re
    } catch (e: Exception) {
      throw CannotInvokeStartRule(e)
    }

    // Make sure tree pattern compilation checks for a complete parse
    if (tokens.LA(1) != Token.EOF) {
      throw StartRuleDoesNotConsumeFullPattern()
    }

    return ParseTreePattern(this, pattern, patternRuleIndex, tree)
  }

  // ---- SUPPORT CODE ----

  /**
   * Recursively walk [tree] against [patternTree], filling [labels].
   *
   * @return The first node encountered in [tree] which does not match
   *   a corresponding node in [patternTree], or `null` if the match
   *   was successful. The specific node returned depends on the matching
   *   algorithm used by the implementation, and may be overridden
   */
  protected fun matchImpl(
    tree: ParseTree,
    patternTree: ParseTree,
    labels: MultiMap<String, ParseTree>,
  ): ParseTree? {
    // x and <ID>, x and y, or x and x; or could be mismatched types
    if (tree is TerminalNode && patternTree is TerminalNode) {
      var mismatchedNode: ParseTree? = null

      // Both are tokens and they have same type
      if (tree.symbol.type == patternTree.symbol.type) {
        if (patternTree.symbol is TokenTagToken) { // x and <ID>
          val tokenTagToken = patternTree.symbol as TokenTagToken

          // Track label->list-of-nodes for both token name and label (if any)
          labels.map(tokenTagToken.tokenName, tree)

          if (tokenTagToken.label != null) {
            labels.map(tokenTagToken.label, tree)
          }
        } else if (tree.text == patternTree.text) {
          // x and x
        } else {
          // x and y
          if (mismatchedNode == null) {
            mismatchedNode = tree
          }
        }
      } else {
        if (mismatchedNode == null) {
          mismatchedNode = tree
        }
      }

      return mismatchedNode
    }

    if (tree is ParserRuleContext && patternTree is ParserRuleContext) {
      var mismatchedNode: ParseTree? = null

      // (expr ...) and <expr>
      val ruleTagToken = getRuleTagToken(patternTree)

      if (ruleTagToken != null) {
        if (tree.ruleContext.ruleIndex == patternTree.ruleContext.ruleIndex) {
          // Track label->list-of-nodes for both rule name and label (if any)
          labels.map(ruleTagToken.ruleName, tree)

          if (ruleTagToken.label != null) {
            labels.map(ruleTagToken.label, tree)
          }
        } else {
          if (mismatchedNode == null) {
            mismatchedNode = tree
          }
        }

        return mismatchedNode
      }

      // (expr ...) and (expr ...)
      if (tree.childCount != patternTree.childCount) {
        if (mismatchedNode == null) {
          mismatchedNode = tree
        }

        return mismatchedNode
      }

      val n = tree.childCount

      for (i in 0..<n) {
        val childMatch = matchImpl(tree.getChild(i)!!, patternTree.getChild(i)!!, labels)

        if (childMatch != null) {
          return childMatch
        }
      }

      return mismatchedNode
    }

    // If nodes aren't both tokens or both rule nodes, can't match
    return tree
  }

  /**
   * Is [t] `(expr <expr>)` subtree?
   */
  protected fun getRuleTagToken(t: ParseTree): RuleTagToken? {
    if (t is RuleNode && t.childCount == 1) {
      val firstChild = t.getChild(0)

      if (firstChild is TerminalNode) {
        val symbol = firstChild.symbol

        if (symbol is RuleTagToken) {
          return symbol
        }
      }
    }

    return null
  }

  public fun tokenize(pattern: String): List<Token> {
    // Split pattern into chunks: sea (raw input) and islands (<ID>, <expr>)
    val chunks = split(pattern)

    // Create token stream from text and tags
    val tokens = ArrayList<Token>()

    for (chunk in chunks) {
      if (chunk is TagChunk) {
        // add special rule token or conjure up new token from name
        if (chunk.tag[0].isUpperCase()) {
          val ttype = parser.getTokenType(chunk.tag)

          if (ttype == Token.INVALID_TYPE) {
            throw IllegalArgumentException("Unknown token ${chunk.tag} in pattern: $pattern")
          }

          val t = TokenTagToken(chunk.tag, ttype, chunk.label)
          tokens.add(t)
        } else if (chunk.tag[0].isLowerCase()) {
          val ruleIndex = parser.getRuleIndex(chunk.tag)

          if (ruleIndex == -1) {
            throw IllegalArgumentException("Unknown rule ${chunk.tag} in pattern: $pattern")
          }

          val ruleImaginaryTokenType = parser.atnWithBypassAlts.ruleToTokenType!![ruleIndex]
          tokens.add(RuleTagToken(chunk.tag, ruleImaginaryTokenType, chunk.label))
        } else {
          throw IllegalArgumentException("invalid tag: ${chunk.tag} in pattern: $pattern")
        }
      } else {
        val textChunk = chunk as TextChunk

        @Suppress("DEPRECATION")
        val stream = ANTLRInputStream(textChunk.text)
        lexer.inputStream = stream

        var t = lexer.nextToken()

        while (t.type != Token.EOF) {
          tokens.add(t)
          t = lexer.nextToken()
        }
      }
    }

    return tokens
  }

  /**
   * Split `<ID> = <e:expr> ;` into 4 chunks for tokenizing by [.tokenize].
   */
  internal fun split(pattern: String): List<Chunk> {
    var p = 0
    val n = pattern.length
    val chunks = ArrayList<Chunk>()

    // find all start and stop indexes first, then collect
    val starts = ArrayList<Int>()
    val stops = ArrayList<Int>()

    while (p < n) {
      when (p) {
        pattern.indexOf(escape + start, p) -> {
          p += escape.length + start.length
        }
        pattern.indexOf(escape + stop, p) -> {
          p += escape.length + stop.length
        }
        pattern.indexOf(start, p) -> {
          starts.add(p)
          p += start.length
        }
        pattern.indexOf(stop, p) -> {
          stops.add(p)
          p += stop.length
        }
        else -> p++
      }
    }

    if (starts.size > stops.size) {
      throw IllegalArgumentException("unterminated tag in pattern: $pattern")
    }

    if (starts.size < stops.size) {
      throw IllegalArgumentException("missing start tag in pattern: $pattern")
    }

    val nTags = starts.size

    for (i in 0..<nTags) {
      if (starts[i] >= stops[i]) {
        throw IllegalArgumentException("tag delimiters out of order in pattern: $pattern")
      }
    }

    // Collect into chunks now
    if (nTags == 0) {
      val text = pattern.substring(0, n)
      chunks.add(TextChunk(text))
    }

    if (nTags > 0 && starts[0] > 0) {
      // Copy text up to first tag into chunks
      val text = pattern.substring(0, starts[0])
      chunks.add(TextChunk(text))
    }

    for (i in 0..<nTags) {
      // Copy inside of <tag>
      val tag = pattern.substring(starts[i] + start.length, stops[i])
      var ruleOrToken = tag
      var label: String? = null
      val colon = tag.indexOf(':')

      if (colon >= 0) {
        label = tag.substring(0, colon)
        ruleOrToken = tag.substring(colon + 1, tag.length)
      }

      chunks.add(TagChunk(label, ruleOrToken))

      if (i + 1 < nTags) {
        // Copy from end of <tag> to start of next
        val text = pattern.substring(stops[i] + stop.length, starts[i + 1])
        chunks.add(TextChunk(text))
      }
    }

    if (nTags > 0) {
      val afterLastTag = stops[nTags - 1] + stop.length

      if (afterLastTag < n) {
        // Copy text from end of last tag to end
        val text = pattern.substring(afterLastTag, n)
        chunks.add(TextChunk(text))
      }
    }

    // Strip out the escape sequences from text chunks but not tags
    for (i in chunks.indices) {
      val c = chunks[i]

      if (c is TextChunk) {
        val unescaped = c.text.replace(escape, "")

        if (unescaped.length < c.text.length) {
          chunks[i] = TextChunk(unescaped)
        }
      }
    }

    return chunks
  }
}
