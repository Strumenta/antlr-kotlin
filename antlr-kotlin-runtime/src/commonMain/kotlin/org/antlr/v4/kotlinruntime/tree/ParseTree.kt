/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.Token

/**
 * An interface to access the tree of [RuleContext] objects created
 * during a parse that makes the data structure look like a simple parse tree.
 * This node represents both internal nodes, rule invocations,
 * and leaf nodes, token matches.
 *
 * The payload is either a [Token] or a [RuleContext] object.
 */
public interface ParseTree : SyntaxTree {
  /**
   * Return the combined text of all leaf nodes. Does not get any
   * off-channel tokens (if any) so won't return whitespace and
   * comments if they are sent to parser on hidden channel.
   */
  public val text: String

  override fun readParent(): ParseTree?

  public fun assignParent(value: ParseTree?)

  override fun getChild(i: Int): ParseTree?

  /**
   * The [ParseTreeVisitor] needs a double dispatch method.
   */
  public fun <T> accept(visitor: ParseTreeVisitor<out T>): T?

  /**
   * Specialize [toStringTree] so that it can print out more information
   * based upon the parser.
   */
  public fun toStringTree(parser: Parser): String
}
