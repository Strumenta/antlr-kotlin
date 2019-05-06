/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.IntervalSet

class RangeTransition(target: ATNState, val from: Int, val to: Int) : Transition(target) {

    override val serializationType: Int
        get() = Transition.RANGE

    override fun accessLabel(): IntervalSet? {
        return IntervalSet.of(from, to)
    }

    override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean {
        return symbol >= from && symbol <= to
    }

    override fun toString(): String {
        TODO()
//        return StringBuilder("'")
//                .appendCodePoint(from)
//                .append("'..'")
//                .appendCodePoint(to)
//                .append("'")
//                .toString()
    }
}
