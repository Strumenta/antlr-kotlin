// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.IntervalSet

public class NotSetTransition(target: ATNState, set: IntervalSet) : SetTransition(target, set) {
  override val serializationType: Int =
    NOT_SET

  override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean =
    symbol in minVocabSymbol..maxVocabSymbol && !super.matches(symbol, minVocabSymbol, maxVocabSymbol)

  override fun toString(): String =
    "~${super.toString()}"
}
