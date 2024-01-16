// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.Token

/**
 * The basic notion of a tree has a parent, a payload, and a list of children.
 * It is the most abstract interface for all the trees used by ANTLR.
 */
public interface Tree {
  /**
   * This method returns whatever object represents the data at this node.
   * For example, for parse trees, the payload can be a [Token] representing
   * a leaf node or a [RuleContext] object representing a rule
   * invocation. For abstract syntax trees (ASTs), this is a [Token] object.
   */
  public val payload: Any?

  /**
   * How many children are there? If there is none, then this
   * node represents a leaf node.
   */
  public val childCount: Int

  /**
   * The parent of this node.
   *
   * If the return value is `null`, then this node is the root of the tree.
   */
  public fun readParent(): Tree?

  /**
   * If there are children, get the `i`th value indexed from `0`.
   */
  public fun getChild(i: Int): Tree?

  /**
   * Print out a whole tree, not just a node, in LISP format
   * `(root child1 .. childN)`. Print just a node if this is a leaf.
   */
  public fun toStringTree(): String
}
