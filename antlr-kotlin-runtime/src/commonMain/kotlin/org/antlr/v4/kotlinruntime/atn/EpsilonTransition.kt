/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

public class EpsilonTransition(target: ATNState, outermostPrecedenceReturn: Int = -1) : Transition(target) {
  override val serializationType: Int =
    EPSILON

  override val isEpsilon: Boolean =
    true

  /**
   * The rule index of a precedence rule for which this transition is
   * returning from, where the precedence value is `0`, otherwise `-1`.
   *
   * @see ATNConfig.isPrecedenceFilterSuppressed
   * @see ParserATNSimulator.applyPrecedenceFilter
   *
   * @since 4.4.1
   */
  @Suppress("CanBePrimaryConstructorProperty")
  public val outermostPrecedenceReturn: Int =
    outermostPrecedenceReturn

  override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean =
    false

  override fun toString(): String =
    "epsilon"
}
