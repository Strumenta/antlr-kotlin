// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

/**
 * This interface defines the basic notion of a parse tree visitor. Generated
 * visitors implement this interface and the `XVisitor` interface for grammar `X`.
 *
 * @param T The return type of the visit operation.
 *   Use [Unit] for operations with no return type
 */
public interface ParseTreeVisitor<T> {
  /**
   * Visit a parse tree, and return a user-defined result of the operation.
   *
   * @param tree The [ParseTree] to visit
   * @return The result of visiting the parse tree
   */
  public fun visit(tree: ParseTree): T?

  /**
   * Visit the children of a node, and return a user-defined result of the
   * operation.
   *
   * @param node The [RuleNode] whose children should be visited
   * @return The result of visiting the children of the node
   */
  public fun visitChildren(node: RuleNode): T?

  /**
   * Visit a terminal node, and return a user-defined result of the operation.
   *
   * @param node The [TerminalNode] to visit
   * @return The result of visiting the node
   */
  public fun visitTerminal(node: TerminalNode): T?

  /**
   * Visit an error node, and return a user-defined result of the operation.
   *
   * @param node The [ErrorNode] to visit
   * @return The result of visiting the node
   */
  public fun visitErrorNode(node: ErrorNode): T?
}
