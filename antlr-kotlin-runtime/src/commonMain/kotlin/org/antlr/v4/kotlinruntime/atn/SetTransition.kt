// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.IntervalSet

/**
 * A transition containing a set of values.
 *
 * TODO(sam): should we really allow null here?
 */
public open class SetTransition(target: ATNState, set: IntervalSet?) : Transition(target) {
  public val set: IntervalSet = set ?: IntervalSet.of(Token.INVALID_TYPE)

  override val serializationType: Int =
    SET

  override fun label(): IntervalSet =
    set

  override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean =
    set.contains(symbol)

  override fun toString(): String =
    set.toString()
}
