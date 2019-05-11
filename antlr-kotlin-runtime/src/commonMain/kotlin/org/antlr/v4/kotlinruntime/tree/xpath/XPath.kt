///*
// * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
// * Use of this file is governed by the BSD 3-clause license that
// * can be found in the LICENSE.txt file in the project root.
// */
//
//package org.antlr.v4.kotlinruntime.tree.xpath
//
//import org.antlr.v4.kotlinruntime.*
//import ParseTree
//
///**
// * Represent a subset of XPath XML path syntax for use in identifying nodes in
// * parse trees.
// *
// *
// *
// * Split path into words and separators `/` and `//` via ANTLR
// * itself then walk path elements from left to right. At each separator-word
// * pair, find set of nodes. Next stage uses those as work list.
// *
// *
// *
// * The basic interface is
// * [ParseTree.findAll][XPath.findAll]`(tree, pathString, parser)`.
// * But that is just shorthand for:
// *
// * <pre>
// * [XPath] p = new [XPath][XPath.XPath](parser, pathString);
// * return p.[evaluate][.evaluate](tree);
//</pre> *
// *
// *
// *
// * See `org.antlr.v4.test.TestXPath` for descriptions. In short, this
// * allows operators:
// *
// * <dl>
// * <dt>/</dt> <dd>root</dd>
// * <dt>//</dt> <dd>anywhere</dd>
// * <dt>!</dt> <dd>invert; this must appear directly after root or anywhere
// * operator</dd>
//</dl> *
// *
// *
// *
// * and path elements:
// *
// * <dl>
// * <dt>ID</dt> <dd>token name</dd>
// * <dt>'string'</dt> <dd>any string literal token from the grammar</dd>
// * <dt>expr</dt> <dd>rule name</dd>
// * <dt>*</dt> <dd>wildcard matching any node</dd>
//</dl> *
// *
// *
// *
// * Whitespace is not allowed.
// */
//class XPath(protected var parser: Parser, protected var path: String) {
//    protected var elements: Array<XPathElement>
//
//    init {
//        elements = split(path)
//        //		System.out.println(Arrays.toString(elements));
//    }
//
//    // TODO: check for invalid token/rule names, bad syntax
//
//    fun split(path: String): Array<XPathElement> {
//        val `in`: ANTLRInputStream
//        try {
//            `in` = ANTLRInputStream(StringReader(path))
//        } catch (ioe: IOException) {
//            throw IllegalArgumentException("Could not read path: " + path, ioe)
//        }
//
//        val lexer = object : XPathLexer(`in`) {
//            fun recover(e: LexerNoViableAltException) {
//                throw e
//            }
//        }
//        lexer.removeErrorListeners()
//        lexer.addErrorListener(XPathLexerErrorListener())
//        val tokenStream = CommonTokenStream(lexer)
//        try {
//            tokenStream.fill()
//        } catch (e: LexerNoViableAltException) {
//            val pos = lexer.charPositionInLine
//            val msg = "Invalid tokens or characters at index $pos in path '$path'"
//            throw IllegalArgumentException(msg, e)
//        }
//
//        val tokens = tokenStream.getTokens()
//        //		System.out.println("path="+path+"=>"+tokens);
//        val elements = ArrayList<XPathElement>()
//        val n = tokens.size
//        var i = 0
//        loop@ while (i < n) {
//            val el = tokens.get(i)
//            var next: Token? = null
//            when (el.getType()) {
//                XPathLexer.ROOT, XPathLexer.ANYWHERE -> {
//                    val anywhere = el.getType() === XPathLexer.ANYWHERE
//                    i++
//                    next = tokens.get(i)
//                    val invert = next!!.getType() === XPathLexer.BANG
//                    if (invert) {
//                        i++
//                        next = tokens.get(i)
//                    }
//                    val pathElement = getXPathElement(next, anywhere)
//                    pathElement.invert = invert
//                    elements.add(pathElement)
//                    i++
//                }
//
//                XPathLexer.TOKEN_REF, XPathLexer.RULE_REF, XPathLexer.WILDCARD -> {
//                    elements.add(getXPathElement(el, false))
//                    i++
//                }
//
//                Token.EOF -> break@loop
//
//                else -> throw IllegalArgumentException("Unknowth path element " + el)
//            }
//        }
//        return elements.toTypedArray<XPathElement>()
//    }
//
//    /**
//     * Convert word like `*` or `ID` or `expr` to a path
//     * element. `anywhere` is `true` if `//` precedes the
//     * word.
//     */
//    protected fun getXPathElement(wordToken: Token, anywhere: Boolean): XPathElement {
//        if (wordToken.getType() === Token.EOF) {
//            throw IllegalArgumentException("Missing path element at end of path")
//        }
//        val word = wordToken.getText()
//        val ttype = parser.getTokenType(word)
//        val ruleIndex = parser.getRuleIndex(word)
//        when (wordToken.getType()) {
//            XPathLexer.WILDCARD -> return if (anywhere)
//                XPathWildcardAnywhereElement()
//            else
//                XPathWildcardElement()
//            XPathLexer.TOKEN_REF, XPathLexer.STRING -> {
//                if (ttype == Token.INVALID_TYPE) {
//                    throw IllegalArgumentException(word +
//                            " at index " +
//                            wordToken.getStartIndex() +
//                            " isn't a valid token name")
//                }
//                return if (anywhere)
//                    XPathTokenAnywhereElement(word, ttype)
//                else
//                    XPathTokenElement(word, ttype)
//            }
//            else -> {
//                if (ruleIndex == -1) {
//                    throw IllegalArgumentException(word +
//                            " at index " +
//                            wordToken.getStartIndex() +
//                            " isn't a valid rule name")
//                }
//                return if (anywhere)
//                    XPathRuleAnywhereElement(word, ruleIndex)
//                else
//                    XPathRuleElement(word, ruleIndex)
//            }
//        }
//    }
//
//    /**
//     * Return a list of all nodes starting at `t` as root that satisfy the
//     * path. The root `/` is relative to the node passed to
//     * [.evaluate].
//     */
//    fun evaluate(t: ParseTree): Collection<ParseTree> {
//        val dummyRoot = ParserRuleContext()
//        dummyRoot.children = listOf<Any>(t) // don't set t's parent.
//
//        var work: Collection<ParseTree> = setOf<ParseTree>(dummyRoot)
//
//        var i = 0
//        while (i < elements.size) {
//            val next = LinkedHashSet<ParseTree>()
//            for (node in work) {
//                if (node.getChildCount() > 0) {
//                    // only try to match next element if it has children
//                    // e.g., //func/*/stat might have a token node for which
//                    // we can't go looking for stat nodes.
//                    val matching = elements[i].evaluate(node)
//                    next.addAll(matching)
//                }
//            }
//            i++
//            work = next
//        }
//
//        return work
//    }
//
//    companion object {
//        val WILDCARD = "*" // word not operator/separator
//        val NOT = "!"       // word for invert operator
//
//
//        fun findAll(tree: ParseTree, xpath: String, parser: Parser): Collection<ParseTree> {
//            val p = XPath(parser, xpath)
//            return p.evaluate(tree)
//        }
//    }
//}
