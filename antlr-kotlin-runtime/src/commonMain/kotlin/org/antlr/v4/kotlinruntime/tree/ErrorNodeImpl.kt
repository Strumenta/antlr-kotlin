// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.Token

/**
 * Represents a token that was consumed during resynchronization
 * rather than during a valid match operation. For example,
 * we will create this kind of node during single token insertion
 * and deletion as well as during "consume until error recovery set"
 * upon no viable alternative exceptions.
 */
public class ErrorNodeImpl(token: Token) : TerminalNodeImpl(token), ErrorNode {
  override fun <T> accept(visitor: ParseTreeVisitor<out T>): T? =
    visitor.visitErrorNode(this)
}
