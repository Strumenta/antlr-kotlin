// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.tree.xpath

import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.xpath.XPathLexer.Tokens

/**
 * Represent a subset of XPath XML path syntax for use in identifying nodes in
 * parse trees.
 *
 * Split path into words and separators `/` and `//` via ANTLR
 * itself then walk path elements from left to right. At each separator-word
 * pair, find set of nodes. Next stage uses those as work list.
 *
 * The basic interface is [XPath.findAll]`(tree, xpath, parser)`.
 *
 * But that is just shorthand for:
 *
 * ```
 * val p = XPath(parser, xpath)
 * return p.evaluate(tree)
 * ```
 *
 * See `org.antlr.v4.test.TestXPath` for descriptions.
 *
 * In short, this allows operators:
 *
 * - `/` root
 * - `//` anywhere
 * - `!` invert, this must appear directly after root or anywhere near operator
 *
 * And path elements:
 *
 * - `ID` token name
 * - `'string'` any string literal token from the grammar
 * - `expr` rule name
 * - `*` wildcard matching any node
 *
 * Whitespace is not allowed.
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class XPath(protected var parser: Parser, protected var xpath: String) {
  public companion object {
    public const val WILDCARD: String = "*"   // Word not operator/separator
    public const val NOT: String = "!"        // Word for invert operator

    public fun findAll(tree: ParseTree, xpath: String, parser: Parser): Collection<ParseTree> {
      val p = XPath(parser, xpath)
      return p.evaluate(tree)
    }
  }

  @Suppress("LeakingThis")
  protected var elements: Array<XPathElement> = split(xpath)

  public open fun split(xpath: String): Array<XPathElement> {
    val input = CharStreams.fromString(xpath)
    val lexer = object : XPathLexer(input) {
      override fun recover(e: LexerNoViableAltException): Unit =
        throw e
    }

    lexer.removeErrorListeners()
    lexer.addErrorListener(XPathLexerErrorListener())

    val tokenStream = CommonTokenStream(lexer)

    try {
      tokenStream.fill()
    } catch (e: LexerNoViableAltException) {
      val pos = lexer.charPositionInLine
      val msg = "Invalid tokens or characters at index $pos in path '$xpath'"
      throw IllegalArgumentException(msg, e)
    }

    val tokens = tokenStream.tokens
    val n = tokens.size
    val elements = ArrayList<XPathElement>(n)
    var i = 0

    loop@ while (i < n) {
      val el = tokens[i]
      var next: Token?

      when (el.type) {
        Tokens.Root,
        Tokens.Anywhere -> {
          val anywhere = el.type == Tokens.Anywhere
          i++
          next = tokens[i]

          val invert = next.type == Tokens.Bang

          if (invert) {
            i++
            next = tokens[i]
          }

          val pathElement = getXPathElement(next, anywhere)
          pathElement.invert = invert
          elements.add(pathElement)
          i++
        }
        Tokens.TokenRef,
        Tokens.RuleRef,
        Tokens.Wildcard -> {
          elements.add(getXPathElement(el, false))
          i++
        }
        Token.EOF -> break@loop
        else -> throw IllegalArgumentException("Unknown path element $el")
      }
    }

    return elements.toTypedArray()
  }

  /**
   * Convert word like `*` or `ID` or `expr` to a path
   * element. `anywhere` is `true` if `//` precedes the
   * word.
   */
  protected open fun getXPathElement(wordToken: Token, anywhere: Boolean): XPathElement {
    if (wordToken.type == Token.EOF) {
      throw IllegalArgumentException("Missing path element at end of path")
    }

    val word = wordToken.text ?: throw IllegalStateException("Expected wordToken to have text content")
    val ttype = parser.getTokenType(word)
    val ruleIndex = parser.getRuleIndex(word)

    return when (wordToken.type) {
      Tokens.Wildcard -> {
        if (anywhere) {
          XPathWildcardAnywhereElement()
        } else {
          XPathWildcardElement()
        }
      }
      Tokens.TokenRef,
      Tokens.String -> {
        if (ttype == Token.INVALID_TYPE) {
          throw IllegalArgumentException("$word at index ${wordToken.startIndex} isn't a valid token name")
        }

        if (anywhere) {
          XPathTokenAnywhereElement(word, ttype)
        } else {
          XPathTokenElement(word, ttype)
        }
      }
      else -> {
        if (ruleIndex == -1) {
          throw IllegalArgumentException("$word at index ${wordToken.startIndex} isn't a valid rule name")
        }

        if (anywhere) {
          XPathRuleAnywhereElement(word, ruleIndex)
        } else {
          XPathRuleElement(word, ruleIndex)
        }
      }
    }
  }

  /**
   * Return a list of all nodes starting at [t] as root that satisfy the path.
   *
   * The root `/` is relative to the node passed to [evaluate].
   */
  public open fun evaluate(t: ParseTree): Collection<ParseTree> {
    val dummyRoot = ParserRuleContext()
    dummyRoot.addChild(t as ParserRuleContext)

    var work = setOf<ParseTree>(dummyRoot)
    var i = 0

    while (i < elements.size) {
      val next = LinkedHashSet<ParseTree>()

      for (node in work) {
        if (node.childCount > 0) {
          // Only try to match next element if it has children
          // e.g., //func/*/stat might have a token node for which
          // we can't go looking for stat nodes.
          val matching = elements[i].evaluate(node)
          next.addAll(matching)
        }
      }

      i++
      work = next
    }

    return work
  }
}
