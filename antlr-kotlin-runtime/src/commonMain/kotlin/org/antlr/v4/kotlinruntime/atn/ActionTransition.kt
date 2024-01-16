// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

public class ActionTransition(
  target: ATNState,
  public val ruleIndex: Int,
  public val actionIndex: Int = -1,
  public val isCtxDependent: Boolean = false, // e.g., $i ref in action
) : Transition(target) {
  override val serializationType: Int =
    ACTION

  override val isEpsilon: Boolean =
    true

  override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean =
    false

  override fun toString(): String =
    "action_$ruleIndex:$actionIndex"
}
