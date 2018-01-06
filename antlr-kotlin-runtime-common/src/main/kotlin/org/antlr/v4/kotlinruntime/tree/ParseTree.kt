/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.Token

/** An interface to access the tree of [RuleContext] objects created
 * during a parse that makes the data structure look like a simple parse tree.
 * This node represents both internal nodes, rule invocations,
 * and leaf nodes, token matches.
 *
 *
 * The payload is either a [Token] or a [RuleContext] object.
 */
interface ParseTree : SyntaxTree {
    // the following methods narrow the return type; they are not additional methods
    //override var parent: ParseTree?

    //private var parent : ParseTree? = null

    fun assignParent(value: ParseTree?)
    //    this.parent = value
    //}

    override fun readParent() : ParseTree?

    /** Return the combined text of all leaf nodes. Does not get any
     * off-channel tokens (if any) so won't return whitespace and
     * comments if they are sent to parser on hidden channel.
     */
    val text: String

    override fun getChild(i: Int): ParseTree?


    /** Set the parent for this node.
     *
     * This is not backward compatible as it changes
     * the interface but no one was able to create custom
     * nodes anyway so I'm adding as it improves internal
     * code quality.
     *
     * One could argue for a restructuring of
     * the class/interface hierarchy so that
     * setParent, addChild are moved up to Tree
     * but that's a major change. So I'll do the
     * minimal change, which is to add this method.
     *
     * @since 4.7
     */
    //fun setParent(parent: RuleContext)

    /** The [ParseTreeVisitor] needs a double dispatch method.  */
    fun <T> accept(visitor: ParseTreeVisitor<out T>): T?

    /** Specialize toStringTree so that it can print out more information
     * based upon the parser.
     */
    fun toStringTree(parser: Parser): String
}
