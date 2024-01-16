// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

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
