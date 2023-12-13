/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

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
