// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.Interval

public open class TerminalNodeImpl(override var symbol: Token) : TerminalNode {
  private var parent: ParseTree? = null

  override val childCount: Int = 0

  override val text: String
    get() = symbol.text!!

  override val payload: Token
    get() = symbol

  override val sourceInterval: Interval
    get() {
      val tokenIndex = symbol.tokenIndex
      return Interval(tokenIndex, tokenIndex)
    }

  override fun readParent(): ParseTree? =
    parent

  override fun assignParent(value: RuleContext?) {
    parent = value
  }

  override fun getChild(i: Int): ParseTree? =
    null

  override fun <T> accept(visitor: ParseTreeVisitor<out T>): T? =
    visitor.visitTerminal(this)

  override fun toStringTree(parser: Parser): String =
    toString()

  override fun toString(): String =
    if (symbol.type == Token.EOF) {
      "<EOF>"
    } else {
      symbol.text!!
    }

  override fun toStringTree(): String =
    toString()
}
