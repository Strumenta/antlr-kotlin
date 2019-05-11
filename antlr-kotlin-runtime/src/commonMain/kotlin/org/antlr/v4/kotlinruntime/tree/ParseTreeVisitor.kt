/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree

/**
 * This interface defines the basic notion of a parse tree visitor. Generated
 * visitors implement this interface and the `XVisitor` interface for
 * grammar `X`.
 *
 * @param <T> The return type of the visit operation. Use [Void] for
 * operations with no return type.
</T> */
interface ParseTreeVisitor<T> {

    /**
     * Visit a parse tree, and return a user-defined result of the operation.
     *
     * @param tree The [ParseTree] to visit.
     * @return The result of visiting the parse tree.
     */
    fun visit(tree: ParseTree): T?

    /**
     * Visit the children of a node, and return a user-defined result of the
     * operation.
     *
     * @param node The [RuleNode] whose children should be visited.
     * @return The result of visiting the children of the node.
     */
    fun visitChildren(node: RuleNode): T?

    /**
     * Visit a terminal node, and return a user-defined result of the operation.
     *
     * @param node The [TerminalNode] to visit.
     * @return The result of visiting the node.
     */
    fun visitTerminal(node: TerminalNode): T?

    /**
     * Visit an error node, and return a user-defined result of the operation.
     *
     * @param node The [ErrorNode] to visit.
     * @return The result of visiting the node.
     */
    fun visitErrorNode(node: ErrorNode): T?

}
