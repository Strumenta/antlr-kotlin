// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.misc.Predicate
import org.antlr.v4.kotlinruntime.misc.Utils
import org.antlr.v4.kotlinruntime.tree.Trees.getNodeText

/**
 * A set of utility routines useful for all kinds of ANTLR trees.
 */
@Suppress("MemberVisibilityCanBePrivate")
public object Trees {
  /**
   * Print out a whole tree in LISP form.
   *
   * [getNodeText] is used on the node payloads to get the text for the nodes.
   * Detect parse trees and extract data appropriately.
   */
  public fun toStringTree(t: Tree, recog: Parser?): String {
    val ruleNames = recog?.ruleNames
    val ruleNamesList = if (ruleNames != null) {
      listOf(*ruleNames)
    } else {
      null
    }

    return toStringTree(t, ruleNamesList)
  }

  /**
   * Print out a whole tree in LISP form.
   *
   * [getNodeText] is used on the node payloads to get the text for the nodes.
   */
  public fun toStringTree(t: Tree, ruleNames: List<String>? = null): String {
    val s = Utils.escapeWhitespace(getNodeText(t, ruleNames), false)

    if (t.childCount == 0) {
      return s
    }

    val buf = StringBuilder()
    buf.append("(")
    buf.append(Utils.escapeWhitespace(getNodeText(t, ruleNames), false))
    buf.append(" ")

    for (i in 0..<t.childCount) {
      if (i > 0) {
        buf.append(" ")
      }

      buf.append(toStringTree(t.getChild(i)!!, ruleNames))
    }

    buf.append(")")
    return buf.toString()
  }

  public fun getNodeText(t: Tree, recog: Parser?): String {
    val ruleNames = recog?.ruleNames
    val ruleNamesList = if (ruleNames != null) {
      listOf(*ruleNames)
    } else {
      null
    }

    return getNodeText(t, ruleNamesList)
  }

  public fun getNodeText(t: Tree, ruleNames: List<String>?): String {
    if (ruleNames != null) {
      when (t) {
        is RuleContext -> {
          val ruleIndex = t.ruleContext.ruleIndex
          val ruleName = ruleNames[ruleIndex]
          val altNumber = t.altNumber
          return if (altNumber != ATN.INVALID_ALT_NUMBER) {
            "$ruleName:$altNumber"
          } else {
            ruleName
          }
        }
        is ErrorNode -> {
          return t.toString()
        }
        is TerminalNode -> {
          val text = t.symbol.text
          return text ?: throw IllegalStateException("Symbol text should not be null")
        }
      }
    }

    // No recog for rule names
    val payload = t.payload

    return if (payload is Token) {
      payload.text!!
    } else {
      t.payload.toString()
    }
  }

  /**
   * Return ordered list of all children of this node.
   */
  public fun getChildren(t: Tree): List<Tree> {
    val kids = ArrayList<Tree>()

    for (i in 0..<t.childCount) {
      kids.add(t.getChild(i)!!)
    }

    return kids
  }

  /**
   * Return a list of all ancestors of this node.
   *
   * The first node of list is the root, and the last is the parent of this node.
   *
   * @since 4.5.1
   */
  public fun getAncestors(t: Tree): List<Tree> {
    if (t.readParent() == null) {
      return emptyList()
    }

    val ancestors = ArrayList<Tree>()
    var t1 = t.readParent()

    while (t1 != null) {
      // Insert at start
      ancestors.add(0, t1)
      t1 = t1.readParent()
    }

    return ancestors
  }

  /**
   * Return true if [t] is [u]'s parent or a node on path to root from [u].
   *
   * @since 4.5.1
   */
  public fun isAncestorOf(t: Tree?, u: Tree?): Boolean {
    if (t == null || u == null || t.readParent() == null) {
      return false
    }

    var p = u.readParent()

    while (p != null) {
      // Keep reference equality!
      if (t === p) {
        return true
      }

      p = p.readParent()
    }

    return false
  }

  public fun findAllTokenNodes(t: ParseTree, ttype: Int): Collection<ParseTree> =
    findAllNodes(t, ttype, true)

  public fun findAllRuleNodes(t: ParseTree, ruleIndex: Int): Collection<ParseTree> =
    findAllNodes(t, ruleIndex, false)

  public fun findAllNodes(t: ParseTree, index: Int, findTokens: Boolean): List<ParseTree> {
    val nodes = ArrayList<ParseTree>()
    _findAllNodes(t, index, findTokens, nodes)
    return nodes
  }

  @Suppress("FunctionName")
  public fun _findAllNodes(
    t: ParseTree,
    index: Int,
    findTokens: Boolean,
    nodes: MutableList<in ParseTree>,
  ) {
    // Check this node (the root) first
    if (findTokens && t is TerminalNode) {
      if (t.symbol.type == index) {
        nodes.add(t)
      }
    } else if (!findTokens && t is ParserRuleContext) {
      if (t.ruleIndex == index) {
        nodes.add(t)
      }
    }

    // Check children
    for (i in 0..<t.childCount) {
      _findAllNodes(t.getChild(i)!!, index, findTokens, nodes)
    }
  }

  /**
   * Get all descendents. Includes [t] itself.
   *
   * @since 4.5.1
   */
  public fun getDescendants(t: ParseTree): List<ParseTree> {
    val nodes = ArrayList<ParseTree>()
    nodes.add(t)

    val n = t.childCount

    for (i in 0..<n) {
      nodes.addAll(getDescendants(t.getChild(i)!!))
    }

    return nodes
  }

  /**
   * Find the smallest subtree of [t] enclosing range [startTokenIndex]..[stopTokenIndex]
   * inclusively using postorder traversal.
   *
   * Recursive depth-first-search.
   *
   * @since 4.5.1
   */
  public fun getRootOfSubtreeEnclosingRegion(
    t: ParseTree,
    startTokenIndex: Int,
    stopTokenIndex: Int,
  ): ParserRuleContext? {
    val n = t.childCount

    for (i in 0..<n) {
      val child = t.getChild(i)!!
      val r = getRootOfSubtreeEnclosingRegion(child, startTokenIndex, stopTokenIndex)

      if (r != null) {
        return r
      }
    }

    if (t is ParserRuleContext) {
      if (
        startTokenIndex >= t.start!!.tokenIndex &&
        // Is range fully contained in t?
        (t.stop == null || stopTokenIndex <= t.stop!!.tokenIndex)
      ) {
        // note: r.getStop()==null likely implies that we bailed out of parser and there's nothing to the right
        return t
      }
    }

    return null
  }

  /**
   * Replace any subtree siblings of root that are completely to left
   * or right of lookahead range with a `CommonToken(Token.INVALID_TYPE, "...")` node.
   * The source interval for [t] is not altered to suit smaller range!
   *
   * WARNING: destructive to [t].
   *
   * @since 4.5.1
   */
  public fun stripChildrenOutOfRange(
    t: ParserRuleContext?,
    root: ParserRuleContext,
    startIndex: Int,
    stopIndex: Int,
  ) {
    if (t == null) {
      return
    }

    for (i in 0..<t.childCount) {
      val child = t.getChild(i)
      val range = child!!.sourceInterval

      if (child is ParserRuleContext && (range.b < startIndex || range.a > stopIndex)) {
        // Replace only if subtree doesn't have displayed root
        if (isAncestorOf(child, root)) {
          val abbrev = CommonToken(Token.INVALID_TYPE, "...")
          t.children!![i] = TerminalNodeImpl(abbrev)
        }
      }
    }
  }

  /**
   * Return first node satisfying the [pred].
   *
   * @since 4.5.1
   */
  public fun findNodeSuchThat(t: Tree?, pred: Predicate<Tree?>): Tree? {
    if (pred.test(t)) {
      return t
    }

    if (t == null) {
      return null
    }

    val n = t.childCount

    for (i in 0..<n) {
      val u = findNodeSuchThat(t.getChild(i), pred)

      if (u != null) {
        return u
      }
    }

    return null
  }
}
