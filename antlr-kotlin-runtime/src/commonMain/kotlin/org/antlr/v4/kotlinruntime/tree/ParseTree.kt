// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

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

  /**
   * Set the parent for this node.
   *
   * This is not backward compatible as it changes
   * the interface but no one was able to create custom
   * nodes anyway, so I'm adding as it improves internal
   * code quality.
   *
   * One could argue for a restructuring of
   * the class/interface hierarchy so that
   * `assignParent`, `addChild` are moved up to [Tree]
   * but that's a major change. So I'll do the
   * minimal change, which is to add this method.
   *
   * @since 4.7
   */
  public fun assignParent(value: RuleContext?)

  /**
   * The [ParseTreeVisitor] needs a double dispatch method.
   */
  public fun <T> accept(visitor: ParseTreeVisitor<out T>): T?

  /**
   * Specialize [toStringTree] so that it can print out more information
   * based upon the parser.
   */
  public fun toStringTree(parser: Parser): String

  // Narrows down the return type to ParseTree
  override fun readParent(): ParseTree?

  // Narrows down the return type to ParseTree
  override fun getChild(i: Int): ParseTree?
}
