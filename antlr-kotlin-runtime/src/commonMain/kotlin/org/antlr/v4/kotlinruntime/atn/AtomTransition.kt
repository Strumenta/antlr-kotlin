// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.IntervalSet

/**
 * TODO: make all transitions sets? No, should remove set edges.
 *
 * @param label The token type or character value. Or, signifies special label
 */
public class AtomTransition(target: ATNState, public val label: Int) : Transition(target) {
  override val serializationType: Int =
    ATOM

  override fun label(): IntervalSet =
    IntervalSet.of(label)

  override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean =
    label == symbol

  override fun toString(): String =
    label.toString()
}
