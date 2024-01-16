// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * The Tokens rule start state linking to each lexer rule start state.
 */
public class TokensStartState : DecisionState() {
  override val stateType: Int =
    TOKEN_START
}
