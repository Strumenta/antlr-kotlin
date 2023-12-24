/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

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
