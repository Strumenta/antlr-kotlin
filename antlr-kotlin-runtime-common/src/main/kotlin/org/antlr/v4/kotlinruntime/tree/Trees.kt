/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree

import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.misc.Predicate
import org.antlr.v4.kotlinruntime.misc.Utils

/** A set of utility routines useful for all kinds of ANTLR trees.  */
object Trees {

    /** Print out a whole tree in LISP form. [.getNodeText] is used on the
     * node payloads to get the text for the nodes.  Detect
     * parse trees and extract data appropriately.
     */
    fun toStringTree(t: Tree, recog: Parser?): String {
        val ruleNames = if (recog != null) recog!!.ruleNames else null
        val ruleNamesList = if (ruleNames != null) Arrays.asList<String>(*ruleNames!!) else null
        return toStringTree(t, ruleNamesList)
    }

    /** Print out a whole tree in LISP form. [.getNodeText] is used on the
     * node payloads to get the text for the nodes.
     */
    fun toStringTree(t: Tree, ruleNames: List<String>? = null): String {
        var s = Utils.escapeWhitespace(getNodeText(t, ruleNames), false)
        if (t.childCount == 0) return s
        val buf = StringBuilder()
        buf.append("(")
        s = Utils.escapeWhitespace(getNodeText(t, ruleNames), false)
        buf.append(s)
        buf.append(' ')
        for (i in 0 until t.childCount) {
            if (i > 0) buf.append(' ')
            buf.append(toStringTree(t.getChild(i)!!, ruleNames))
        }
        buf.append(")")
        return buf.toString()
    }

    fun getNodeText(t: Tree, recog: Parser?): String {
        val ruleNames = if (recog != null) recog!!.ruleNames else null
        val ruleNamesList = if (ruleNames != null) Arrays.asList<String>(*ruleNames!!) else null
        return getNodeText(t, ruleNamesList)
    }

    fun getNodeText(t: Tree, ruleNames: List<String>?): String {
        if (ruleNames != null) {
            if (t is RuleContext) {
                val ruleIndex = (t as RuleContext).ruleContext.ruleIndex
                val ruleName = ruleNames.get(ruleIndex)
                val altNumber = (t as RuleContext).altNumber
                return if (altNumber != ATN.INVALID_ALT_NUMBER) {
                    ruleName + ":" + altNumber
                } else ruleName
            } else if (t is ErrorNode) {
                return t.toString()
            } else if (t is TerminalNode) {
                val symbol = (t as TerminalNode).symbol
                if (symbol != null) {
                    return symbol!!.text!!
                }
            }
        }
        // no recog for rule names
        val payload = t.payload
        return if (payload is Token) {
            (payload as Token).text!!
        } else t.payload.toString()
    }

    /** Return ordered list of all children of this node  */
    fun getChildren(t: Tree): List<Tree> {
        val kids = ArrayList<Tree>()
        for (i in 0 until t.childCount) {
            kids.add(t.getChild(i)!!)
        }
        return kids
    }

    /** Return a list of all ancestors of this node.  The first node of
     * list is the root and the last is the parent of this node.
     *
     * @since 4.5.1
     */
    fun getAncestors(t: Tree): List<out Tree> {
        var t = t
        if (t.readParent() == null) return emptyList<Tree>()
        val ancestors = ArrayList<Tree>()
        t = t.readParent()!!
        while (t != null) {
            ancestors.add(0, t) // insert at start
            t = t.readParent()!!
        }
        return ancestors
    }

    /** Return true if t is u's parent or a node on path to root from u.
     * Use == not equals().
     *
     * @since 4.5.1
     */
    fun isAncestorOf(t: Tree?, u: Tree?): Boolean {
        if (t == null || u == null || t!!.readParent() == null) return false
        var p: Tree? = u!!.readParent()
        while (p != null) {
            if (t === p) return true
            p = p!!.readParent()
        }
        return false
    }

    fun findAllTokenNodes(t: ParseTree, ttype: Int): Collection<ParseTree> {
        return findAllNodes(t, ttype, true)
    }

    fun findAllRuleNodes(t: ParseTree, ruleIndex: Int): Collection<ParseTree> {
        return findAllNodes(t, ruleIndex, false)
    }

    fun findAllNodes(t: ParseTree, index: Int, findTokens: Boolean): List<ParseTree> {
        val nodes = ArrayList<ParseTree>()
        _findAllNodes(t, index, findTokens, nodes)
        return nodes
    }

    fun _findAllNodes(t: ParseTree, index: Int, findTokens: Boolean,
                      nodes: MutableList<in ParseTree>) {
        // check this node (the root) first
        if (findTokens && t is TerminalNode) {
            val tnode = t as TerminalNode
            if (tnode.symbol!!.type === index) nodes.add(t)
        } else if (!findTokens && t is ParserRuleContext) {
            val ctx = t as ParserRuleContext
            if (ctx.ruleIndex === index) nodes.add(t)
        }
        // check children
        for (i in 0 until t.childCount) {
            _findAllNodes(t.getChild(i)!!, index, findTokens, nodes)
        }
    }

    /** Get all descendents; includes t itself.
     *
     * @since 4.5.1
     */
    fun getDescendants(t: ParseTree): List<ParseTree> {
        val nodes = ArrayList<ParseTree>()
        nodes.add(t)

        val n = t.childCount
        for (i in 0 until n) {
            nodes.addAll(getDescendants(t.getChild(i)!!))
        }
        return nodes
    }


    @Deprecated("")
    fun descendants(t: ParseTree): List<ParseTree> {
        return getDescendants(t)
    }

    /** Find smallest subtree of t enclosing range startTokenIndex..stopTokenIndex
     * inclusively using postorder traversal.  Recursive depth-first-search.
     *
     * @since 4.5.1
     */
    fun getRootOfSubtreeEnclosingRegion(t: ParseTree,
                                        startTokenIndex: Int, // inclusive
                                        stopTokenIndex: Int)  // inclusive
            : ParserRuleContext? {
        val n = t.childCount
        for (i in 0 until n) {
            val child = t.getChild(i)
            val r = getRootOfSubtreeEnclosingRegion(child!!, startTokenIndex, stopTokenIndex)
            if (r != null) return r
        }
        if (t is ParserRuleContext) {
            val r = t as ParserRuleContext
            if (startTokenIndex >= r.start!!.tokenIndex && // is range fully contained in t?
                    (r.stop == null || stopTokenIndex <= r.stop!!.tokenIndex)) {
                // note: r.getStop()==null likely implies that we bailed out of parser and there's nothing to the right
                return r
            }
        }
        return null
    }

    /** Replace any subtree siblings of root that are completely to left
     * or right of lookahead range with a CommonToken(Token.INVALID_TYPE,"...")
     * node. The source interval for t is not altered to suit smaller range!
     *
     * WARNING: destructive to t.
     *
     * @since 4.5.1
     */
    fun stripChildrenOutOfRange(t: ParserRuleContext?,
                                root: ParserRuleContext,
                                startIndex: Int,
                                stopIndex: Int) {
        if (t == null) return
        for (i in 0 until t!!.childCount) {
            val child = t!!.getChild(i)
            val range = child!!.sourceInterval
            if (child is ParserRuleContext && (range.b < startIndex || range.a > stopIndex)) {
                if (isAncestorOf(child, root)) { // replace only if subtree doesn't have displayed root
                    val abbrev = CommonToken(Token.INVALID_TYPE, "...")
                    t!!.children!!.set(i, TerminalNodeImpl(abbrev))
                }
            }
        }
    }

    /** Return first node satisfying the pred
     *
     * @since 4.5.1
     */
    fun findNodeSuchThat(t: Tree?, pred: Predicate<Tree>): Tree? {
        if (pred.test(t!!)) return t

        if (t == null) return null

        val n = t!!.childCount
        for (i in 0 until n) {
            val u = findNodeSuchThat(t!!.getChild(i), pred)
            if (u != null) return u
        }
        return null
    }
}
/** Print out a whole tree in LISP form. [.getNodeText] is used on the
 * node payloads to get the text for the nodes.  Detect
 * parse trees and extract data appropriately.
 */
