/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

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
