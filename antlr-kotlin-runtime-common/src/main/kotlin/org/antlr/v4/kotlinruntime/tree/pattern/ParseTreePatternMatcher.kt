/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.pattern

import com.strumenta.kotlinmultiplatform.*
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
 *
 * Patterns are strings of source input text with special tags representing
 * token or rule references such as:
 *
 *
 * `<ID> = <expr>;`
 *
 *
 * Given a pattern start rule such as `statement`, this object constructs
 * a [ParseTree] with placeholders for the `ID` and `expr`
 * subtree. Then the [.match] routines can compare an actual
 * [ParseTree] from a parse with this pattern. Tag `<ID>` matches
 * any `ID` token and tag `<expr>` references the result of the
 * `expr` rule (generally an instance of `ExprContext`.
 *
 *
 * Pattern `x = 0;` is a similar pattern that matches the same pattern
 * except that it requires the identifier to be `x` and the expression to
 * be `0`.
 *
 *
 * The [.matches] routines return `true` or `false` based
 * upon a match for the tree rooted at the parameter sent in. The
 * [.match] routines return a [ParseTreeMatch] object that
 * contains the parse tree, the parse tree pattern, and a map from tag name to
 * matched nodes (more below). A subtree that fails to match, returns with
 * [ParseTreeMatch.mismatchedNode] set to the first tree node that did not
 * match.
 *
 *
 * For efficiency, you can compile a tree pattern in string form to a
 * [ParseTreePattern] object.
 *
 *
 * See `TestParseTreeMatcher` for lots of examples.
 * [ParseTreePattern] has two static helper methods:
 * [ParseTreePattern.findAll] and [ParseTreePattern.match] that
 * are easy to use but not super efficient because they create new
 * [ParseTreePatternMatcher] objects each time and have to compile the
 * pattern in string form before using it.
 *
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
 *
 * Normally a parser does not accept token `<expr>` as a valid
 * `expr` but, from the parser passed in, we create a special version of
 * the underlying grammar representation (an [ATN]) that allows imaginary
 * tokens representing rules (`<expr>`) to match entire rules. We call
 * these *bypass alternatives*.
 *
 *
 * Delimiters are `<` and `>`, with `\` as the escape string
 * by default, but you can set them to whatever you want using
 * [.setDelimiters]. You must escape both start and stop strings
 * `\<` and `\>`.
 */
class ParseTreePatternMatcher
/**
 * Constructs a [ParseTreePatternMatcher] or from a [Lexer] and
 * [Parser] object. The lexer input stream is altered for tokenizing
 * the tree patterns. The parser is used as a convenient mechanism to get
 * the grammar name, plus token, rule names.
 */
(
        /**
         * This is the backing field for [.getLexer].
         */
        /**
         * Used to convert the tree pattern string into a series of tokens. The
         * input stream is reset.
         */

        val lexer: Lexer,
        /**
         * This is the backing field for [.getParser].
         */
        /**
         * Used to collect to the grammar file name, token names, rule names for
         * used to parse the pattern into a parse tree.
         */

        val parser: Parser) {

    protected var start = "<"
    protected var stop = ">"
    protected var escape = "\\" // e.g., \< and \> must escape BOTH!

    //class CannotInvokeStartRule(e: Throwable) : RuntimeException(e.message!!)

    // Fixes https://github.com/antlr/antlr4/issues/413
    // "Tree pattern compilation doesn't check for a complete parse"
    //class StartRuleDoesNotConsumeFullPattern : RuntimeException()

    /**
     * Set the delimiters used for marking rule and token tags within concrete
     * syntax used by the tree pattern parser.
     *
     * @param start The start delimiter.
     * @param stop The stop delimiter.
     * @param escapeLeft The escape sequence to use for escaping a start or stop delimiter.
     *
     * @exception IllegalArgumentException if `start` is `null` or empty.
     * @exception IllegalArgumentException if `stop` is `null` or empty.
     */
    fun setDelimiters(start: String?, stop: String?, escapeLeft: String) {
        if (start == null || start.isEmpty()) {
            throw IllegalArgumentException("start cannot be null or empty")
        }

        if (stop == null || stop.isEmpty()) {
            throw IllegalArgumentException("stop cannot be null or empty")
        }

        this.start = start
        this.stop = stop
        this.escape = escapeLeft
    }

    /** Does `pattern` matched as rule `patternRuleIndex` match `tree`?  */
    fun matches(tree: ParseTree, pattern: String, patternRuleIndex: Int): Boolean {
        val p = compile(pattern, patternRuleIndex)
        return matches(tree, p)
    }

    /** Does `pattern` matched as rule patternRuleIndex match tree? Pass in a
     * compiled pattern instead of a string representation of a tree pattern.
     */
    fun matches(tree: ParseTree, pattern: ParseTreePattern): Boolean {
        val labels = MultiMap<String, ParseTree>()
        val mismatchedNode = matchImpl(tree, pattern.patternTree, labels)
        return mismatchedNode == null
    }

    /**
     * Compare `pattern` matched as rule `patternRuleIndex` against
     * `tree` and return a [ParseTreeMatch] object that contains the
     * matched elements, or the node at which the match failed.
     */
    fun match(tree: ParseTree, pattern: String, patternRuleIndex: Int): ParseTreeMatch {
        val p = compile(pattern, patternRuleIndex)
        return match(tree, p)
    }

    /**
     * Compare `pattern` matched against `tree` and return a
     * [ParseTreeMatch] object that contains the matched elements, or the
     * node at which the match failed. Pass in a compiled pattern instead of a
     * string representation of a tree pattern.
     */

    fun match(tree: ParseTree, pattern: ParseTreePattern): ParseTreeMatch {
        val labels = MultiMap<String, ParseTree>()
        val mismatchedNode = matchImpl(tree, pattern.patternTree, labels)
        return ParseTreeMatch(tree, pattern, labels, mismatchedNode)
    }

    /**
     * For repeated use of a tree pattern, compile it to a
     * [ParseTreePattern] using this method.
     */
    fun compile(pattern: String, patternRuleIndex: Int): ParseTreePattern {
        val tokenList = tokenize(pattern)
        val tokenSrc = ListTokenSource(tokenList)
        val tokens = CommonTokenStream(tokenSrc)

        TODO()
//        val parserInterp = ParserInterpreter(parser.grammarFileName,
//                parser.vocabulary,
//                Arrays.asList(parser.ruleNames),
//                parser.atnWithBypassAlts,
//                tokens)
//
//        var tree: ParseTree? = null
//        try {
//            parserInterp.setErrorHandler(BailErrorStrategy())
//            tree = parserInterp.parse(patternRuleIndex)
//            //			System.out.println("pattern tree = "+tree.toStringTree(parserInterp));
//        } catch (e: ParseCancellationException) {
//            TODO()
//            //throw e.getCause() as RecognitionException
//        } catch (re: RecognitionException) {
//            throw re
//        } catch (e: Exception) {
//            throw CannotInvokeStartRule(e)
//        }
//
//        // Make sure tree pattern compilation checks for a complete parse
//        if (tokens.LA(1) !== Token.EOF) {
//            throw StartRuleDoesNotConsumeFullPattern()
//        }
//
//        return ParseTreePattern(this, pattern, patternRuleIndex, tree)
    }

    // ---- SUPPORT CODE ----

    /**
     * Recursively walk `tree` against `patternTree`, filling
     * `match.`[labels][ParseTreeMatch.labels].
     *
     * @return the first node encountered in `tree` which does not match
     * a corresponding node in `patternTree`, or `null` if the match
     * was successful. The specific node returned depends on the matching
     * algorithm used by the implementation, and may be overridden.
     */

    protected fun matchImpl(tree: ParseTree?,
                            patternTree: ParseTree?,
                            labels: MultiMap<String, ParseTree>): ParseTree? {
        if (tree == null) {
            throw IllegalArgumentException("tree cannot be null")
        }

        if (patternTree == null) {
            throw IllegalArgumentException("patternTree cannot be null")
        }

        // x and <ID>, x and y, or x and x; or could be mismatched types
        if (tree is TerminalNode && patternTree is TerminalNode) {
            TODO()
//            val t1 = tree as TerminalNode?
//            val t2 = patternTree as TerminalNode?
//            var mismatchedNode: ParseTree? = null
//            // both are tokens and they have same type
//            if (t1!!.getSymbol().getType() === t2!!.getSymbol().getType()) {
//                if (t2!!.getSymbol() is TokenTagToken) { // x and <ID>
//                    val tokenTagToken = t2!!.getSymbol() as TokenTagToken
//                    // track accessLabel->list-of-nodes for both token name and accessLabel (if any)
//                    labels.map(tokenTagToken.tokenName, tree)
//                    if (tokenTagToken.accessLabel != null) {
//                        labels.map(tokenTagToken.accessLabel, tree)
//                    }
//                } else if (t1!!.getText().equals(t2!!.getText())) {
//                    // x and x
//                } else {
//                    // x and y
//                    if (mismatchedNode == null) {
//                        mismatchedNode = t1
//                    }
//                }
//            } else {
//                if (mismatchedNode == null) {
//                    mismatchedNode = t1
//                }
//            }
//
//            return mismatchedNode
        }

        if (tree is ParserRuleContext && patternTree is ParserRuleContext) {
            TODO()
//            val r1 = tree as ParserRuleContext?
//            val r2 = patternTree as ParserRuleContext?
//            var mismatchedNode: ParseTree? = null
//            // (expr ...) and <expr>
//            val ruleTagToken = getRuleTagToken(r2)
//            if (ruleTagToken != null) {
//                val m: ParseTreeMatch? = null
//                if (r1!!.getRuleContext().getRuleIndex() === r2!!.getRuleContext().getRuleIndex()) {
//                    // track accessLabel->list-of-nodes for both rule name and accessLabel (if any)
//                    labels.map(ruleTagToken!!.ruleName, tree)
//                    if (ruleTagToken!!.accessLabel != null) {
//                        labels.map(ruleTagToken!!.accessLabel, tree)
//                    }
//                } else {
//                    if (mismatchedNode == null) {
//                        mismatchedNode = r1
//                    }
//                }
//
//                return mismatchedNode
//            }
//
//            // (expr ...) and (expr ...)
//            if (r1!!.getChildCount() !== r2!!.getChildCount()) {
//                if (mismatchedNode == null) {
//                    mismatchedNode = r1
//                }
//
//                return mismatchedNode
//            }
//
//            val n = r1!!.getChildCount()
//            for (i in 0 until n) {
//                val childMatch = matchImpl(r1!!.getChild(i), patternTree!!.getChild(i), labels)
//                if (childMatch != null) {
//                    return childMatch
//                }
//            }
//
//            return mismatchedNode
        }

        // if nodes aren't both tokens or both rule nodes, can't match
        return tree
    }

    /** Is `t` `(expr <expr>)` subtree?  */
    protected fun getRuleTagToken(t: ParseTree): RuleTagToken? {
        if (t is RuleNode) {
            TODO()
//            val r = t as RuleNode
//            if (r.getChildCount() === 1 && r.getChild(0) is TerminalNode) {
//                val c = r.getChild(0) as TerminalNode
//                if (c.getSymbol() is RuleTagToken) {
//                    //					System.out.println("rule tag subtree "+t.toStringTree(parser));
//                    return c.getSymbol() as RuleTagToken
//                }
//            }
        }
        return null
    }

    fun tokenize(pattern: String): List<Token> {
        // split pattern into chunks: sea (raw input) and islands (<ID>, <expr>)
        val chunks = split(pattern)

        // create token stream from text and tags
        val tokens = ArrayList<Token>()
        for (chunk in chunks) {
            if (chunk is TagChunk) {
                val tagChunk = chunk as TagChunk
                // add special rule token or conjure up new token from name
                if (isCharUppercase(tagChunk.tag!!.get(0))) {
                    val ttype = parser.getTokenType(tagChunk.tag)
                    if (ttype === Token.INVALID_TYPE) {
                        throw IllegalArgumentException("Unknown token " + tagChunk.tag + " in pattern: " + pattern)
                    }
                    val t = TokenTagToken(tagChunk.tag, ttype!!, tagChunk.label)
                    tokens.add(t)
                } else if (isCharLowerCase(tagChunk.tag.get(0))) {
                    TODO()
//                    val ruleIndex = parser.getRuleIndex(tagChunk.tag)
//                    if (ruleIndex == -1) {
//                        throw IllegalArgumentException("Unknown rule " + tagChunk.tag + " in pattern: " + pattern)
//                    }
//                    val ruleImaginaryTokenType = parser.atnWithBypassAlts().ruleToTokenType[ruleIndex]
//                    tokens.add(RuleTagToken(tagChunk.tag, ruleImaginaryTokenType, tagChunk.accessLabel))
                } else {
                    throw IllegalArgumentException("invalid tag: " + tagChunk.tag + " in pattern: " + pattern)
                }
            } else {
                TODO()
//                val textChunk = chunk as TextChunk
//                val `in` = ANTLRInputStream(textChunk.text)
//                lexer.setInputStream(`in`)
//                var t = lexer.nextToken()
//                while (t!!.type !== Token.EOF) {
//                    tokens.add(t!!)
//                    t = lexer.nextToken()
//                }
            }
        }

        //		System.out.println("tokens="+tokens);
        return tokens
    }

    /** Split `<ID> = <e:expr> ;` into 4 chunks for tokenizing by [.tokenize].  */
    internal fun split(pattern: String): List<Chunk> {
        var p = 0
        val n = pattern.length
        val chunks = ArrayList<Chunk>()
        val buf = StringBuilder()
        // find all start and stop indexes first, then collect
        val starts = ArrayList<Int>()
        val stops = ArrayList<Int>()
        while (p < n) {
            if (p == pattern.indexOf(escape + start, p)) {
                p += escape.length + start.length
            } else if (p == pattern.indexOf(escape + stop, p)) {
                p += escape.length + stop.length
            } else if (p == pattern.indexOf(start, p)) {
                starts.add(p)
                p += start.length
            } else if (p == pattern.indexOf(stop, p)) {
                stops.add(p)
                p += stop.length
            } else {
                p++
            }
        }

        //		System.out.println("");
        //		System.out.println(starts);
        //		System.out.println(stops);
        if (starts.size > stops.size) {
            throw IllegalArgumentException("unterminated tag in pattern: " + pattern)
        }

        if (starts.size < stops.size) {
            throw IllegalArgumentException("missing start tag in pattern: " + pattern)
        }

        val ntags = starts.size
        for (i in 0 until ntags) {
            if (starts[i] >= stops[i]) {
                throw IllegalArgumentException("tag delimiters out of order in pattern: " + pattern)
            }
        }

        // collect into chunks now
        if (ntags == 0) {
            val text = pattern.substring(0, n)
            chunks.add(TextChunk(text))
        }

        if (ntags > 0 && starts[0] > 0) { // copy text up to first tag into chunks
            val text = pattern.substring(0, starts[0])
            chunks.add(TextChunk(text))
        }
        for (i in 0 until ntags) {
            // copy inside of <tag>
            val tag = pattern.substring(starts[i] + start.length, stops[i])
            var ruleOrToken = tag
            var label: String? = null
            val colon = tag.indexOf(':')
            if (colon >= 0) {
                label = tag.substring(0, colon)
                ruleOrToken = tag.substring(colon + 1, tag.length)
            }
            chunks.add(TagChunk(label, ruleOrToken))
            if (i + 1 < ntags) {
                // copy from end of <tag> to start of next
                val text = pattern.substring(stops[i] + stop.length, starts[i + 1])
                chunks.add(TextChunk(text))
            }
        }
        if (ntags > 0) {
            val afterLastTag = stops[ntags - 1] + stop.length
            if (afterLastTag < n) { // copy text from end of last tag to end
                val text = pattern.substring(afterLastTag, n)
                chunks.add(TextChunk(text))
            }
        }

        // strip out the escape sequences from text chunks but not tags
        for (i in chunks.indices) {
            val c = chunks[i]
            if (c is TextChunk) {
                val tc = c as TextChunk
                val unescaped = tc.text!!.replace(escape, "")
                if (unescaped.length < tc.text!!.length) {
                    chunks[i] = TextChunk(unescaped)
                }
            }
        }

        return chunks
    }
}
