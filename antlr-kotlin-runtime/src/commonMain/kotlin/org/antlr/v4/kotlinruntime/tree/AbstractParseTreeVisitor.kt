// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

public abstract class AbstractParseTreeVisitor<T> : ParseTreeVisitor<T> {
  /**
   * The default implementation calls [ParseTree.accept] on the specified tree.
   */
  override fun visit(tree: ParseTree): T? =
    tree.accept(this)

  /**
   * The default implementation initializes the aggregate result to
   * [defaultResult]. Before visiting each child, it calls [shouldVisitNextChild];
   * if the result is `false` no more children are visited and the current
   * aggregate result is returned.
   *
   * After visiting a child, the aggregate result is updated by calling
   * [aggregateResult] with the previous aggregate result and the result of
   * visiting the child.
   *
   * The default implementation is not safe for use in visitors that modify
   * the tree structure. Visitors that modify the tree should override this
   * method to behave properly in respect to the specific algorithm in use.
   */
  override fun visitChildren(node: RuleNode): T? {
    var result = defaultResult()
    val n = node.childCount

    for (i in 0..<n) {
      if (!shouldVisitNextChild(node, result)) {
        break
      }

      val c = node.getChild(i)!!
      val childResult = c.accept(this)!!
      result = aggregateResult(result, childResult)
    }

    return result
  }

  /**
   * The default implementation returns the result of [defaultResult].
   */
  override fun visitTerminal(node: TerminalNode): T? =
    defaultResult()

  /**
   * The default implementation returns the result of [defaultResult].
   */
  override fun visitErrorNode(node: ErrorNode): T? =
    defaultResult()

  /**
   * Gets the default value returned by visitor methods.
   *
   * This value is returned by the default implementations of
   * [visitTerminal], [visitErrorNode].
   *
   * The default implementation of [visitChildren] initializes
   * its aggregate result to this value.
   *
   * The base implementation returns `null`.
   *
   * @return The default value returned by visitor methods
   */
  protected open fun defaultResult(): T? =
    null

  /**
   * Aggregates the results of visiting multiple children of a node.
   *
   * After either all children are visited or [shouldVisitNextChild] returns `false`,
   * the aggregate value is returned as the result of [visitChildren].
   *
   * The default implementation returns [nextResult], meaning
   * [visitChildren] will return the result of the last child visited
   * (or return the initial value if the node has no children).
   *
   * @param aggregate The previous aggregate value.
   *   In the default implementation, the aggregate value is initialized to [defaultResult],
   *   which is passed as the [aggregate] argument to this method after the first
   *   child node is visited
   * @param nextResult The result of the immediately preceding call to visit a child node
   *
   * @return The updated aggregate result
   */
  protected open fun aggregateResult(aggregate: T?, nextResult: T): T =
    nextResult

  /**
   * This method is called after visiting each child in [visitChildren].
   *
   * This method is first called before the first child is visited;
   * at that point [currentResult] will be the initial value
   * (in the default implementation, the initial value is returned by a
   * call to [defaultResult]). This method is not called after the last
   * child is visited.
   *
   * The default implementation always returns `true`, indicating that
   * [visitChildren] should only return after all children are visited.
   * One reason to override this method is to provide a "short circuit"
   * evaluation option for situations where the result of visiting a single
   * child has the potential to determine the result of the visit operation as
   * a whole.
   *
   * @param node The [RuleNode] whose children are currently being visited
   * @param currentResult The current aggregate result of the children visited to the current point
   *
   * @return `true` to continue visiting children. Otherwise, return
   *   `false` to stop visiting children and immediately return the
   *   current aggregate result from [visitChildren]
   */
  protected open fun shouldVisitNextChild(node: RuleNode, currentResult: T?): Boolean =
    true
}
