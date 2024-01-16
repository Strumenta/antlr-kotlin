// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * @param ruleIndex Ptr to the rule definition object for this rule rer
 * @param followState What node to begin computations following ref to rule
 */
public class RuleTransition(
  ruleStart: RuleStartState,
  public val ruleIndex: Int,
  public val precedence: Int,
  public var followState: ATNState,
) : Transition(ruleStart) {
  override val serializationType: Int =
    RULE

  override val isEpsilon: Boolean =
    true

  override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean =
    false
}
