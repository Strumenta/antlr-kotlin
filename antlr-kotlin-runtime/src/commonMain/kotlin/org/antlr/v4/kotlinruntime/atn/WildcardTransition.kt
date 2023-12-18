/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

public class WildcardTransition(target: ATNState) : Transition(target) {
  override val serializationType: Int =
    WILDCARD

  override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean =
    symbol in minVocabSymbol..maxVocabSymbol

  override fun toString(): String =
    "."
}
