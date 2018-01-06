/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.IntervalSet

class NotSetTransition(target: ATNState, set: IntervalSet) : SetTransition(target, set) {

    override val serializationType: Int
        get() = Transition.NOT_SET

    override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean {
        return (symbol >= minVocabSymbol
                && symbol <= maxVocabSymbol
                && !super.matches(symbol, minVocabSymbol, maxVocabSymbol))
    }

    override fun toString(): String {
        return '~' + super.toString()
    }
}
