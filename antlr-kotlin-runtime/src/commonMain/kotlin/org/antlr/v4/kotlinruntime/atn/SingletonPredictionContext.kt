/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.assert

open class SingletonPredictionContext internal constructor(val parent: PredictionContext?, val returnState: Int) : PredictionContext(if (parent != null) PredictionContext.calculateHashCode(parent, returnState) else PredictionContext.calculateEmptyHashCode()) {

    init {
        assert(returnState != ATNState.INVALID_STATE_NUMBER)
    }

    override fun size(): Int {
        return 1
    }

    override fun getParent(index: Int): PredictionContext? {
        assert(index == 0)
        return parent
    }

    override fun getReturnState(index: Int): Int {
        assert(index == 0)
        return returnState
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        } else if (o !is SingletonPredictionContext) {
            return false
        }

        if (this.hashCode() != o.hashCode()) {
            return false // can't be same if hash is different
        }

        val s = o as SingletonPredictionContext?
        return returnState == s!!.returnState && parent != null && parent == s.parent
    }

    override fun toString(): String {
        val up = if (parent != null) parent!!.toString() else ""
        return if (up.length == 0) {
            if (returnState == PredictionContext.EMPTY_RETURN_STATE) {
                "$"
            } else returnState.toString()
        } else returnState.toString() + " " + up
    }

    companion object {

        fun create(parent: PredictionContext?, returnState: Int): SingletonPredictionContext {
            return if (returnState == PredictionContext.EMPTY_RETURN_STATE && parent == null) {
                // someone can pass in the bits of an array ctx that mean $
                PredictionContext.EMPTY
            } else SingletonPredictionContext(parent, returnState)
        }
    }
}
