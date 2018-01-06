/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

class EmptyPredictionContext : SingletonPredictionContext(null, PredictionContext.EMPTY_RETURN_STATE) {

    override val isEmpty: Boolean
        get() = true

    override fun size(): Int {
        return 1
    }

    override fun getParent(index: Int): PredictionContext? {
        return null
    }

    override fun getReturnState(index: Int): Int {
        // It was: return returnState
        // Changed because of https://youtrack.jetbrains.com/issue/KT-22161
        return PredictionContext.EMPTY_RETURN_STATE
    }

    override fun equals(o: Any?): Boolean {
        return this === o
    }

    override fun toString(): String {
        return "$"
    }
}
