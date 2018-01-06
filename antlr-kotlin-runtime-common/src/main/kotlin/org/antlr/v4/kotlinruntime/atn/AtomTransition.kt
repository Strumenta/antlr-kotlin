/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.IntervalSet

/** TODO: make all transitions sets? no, should remove set edges  */
class AtomTransition(target: ATNState,
                     /** The token type or character value; or, signifies special accessLabel.  */
                     val label: Int) : Transition(target) {

    override val serializationType: Int
        get() = Transition.ATOM

    override fun accessLabel(): IntervalSet? {
        return IntervalSet.of(label)
    }

    override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean {
        return label == symbol
    }

    override fun toString(): String {
        return label.toString()
    }
}
