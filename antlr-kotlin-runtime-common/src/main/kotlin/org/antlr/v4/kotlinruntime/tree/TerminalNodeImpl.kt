/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.Interval

open class TerminalNodeImpl(override var symbol: Token?) : TerminalNode {

    private var parent : ParseTree? = null

    override fun assignParent(value: ParseTree?) {
        this.parent = value
    }

    override fun readParent(): ParseTree? {
        return this.parent
    }
    //override var parent: ParseTree? = null

    override val sourceInterval: Interval
        get() {
            if (symbol == null) return Interval.INVALID

            val tokenIndex = symbol!!.tokenIndex
            return Interval(tokenIndex, tokenIndex)
        }

    override val childCount: Int
        get() = 0

    override val text: String
        get() = symbol!!.text!!

    override fun getChild(i: Int): ParseTree? {
        return null
    }

//    override fun setParent(parent: RuleContext) {
//        this.parent = parent
//    }

    override val payload: Token?
        get() = symbol

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T? {
        return visitor.visitTerminal(this)
    }

    override fun toStringTree(parser: Parser): String {
        return toString()
    }

    override fun toString(): String {
        return if (symbol!!.type === Token.EOF) "<EOF>" else symbol!!.text!!
    }

    override fun toStringTree(): String {
        return toString()
    }
}
