/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.IntervalSet

/** A transition containing a set of values.  */
open class SetTransition// TODO (sam): should we really allow null here?
(target: ATNState, set: IntervalSet?) : Transition(target) {
    val set: IntervalSet

    override val serializationType: Int
        get() = Transition.SET

    init {
        var set = set
        if (set == null) set = IntervalSet.of(Token.INVALID_TYPE)
        this.set = set
    }

    override fun accessLabel(): IntervalSet? {
        return set
    }

    override fun matches(symbol: Int, minVocabSymbol: Int, maxVocabSymbol: Int): Boolean {
        return set.contains(symbol)
    }

    override fun toString(): String {
        return set.toString()
    }
}
