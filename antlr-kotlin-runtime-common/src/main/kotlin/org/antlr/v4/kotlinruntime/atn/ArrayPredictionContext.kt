/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

class ArrayPredictionContext(
        /** Parent can be null only if full ctx mode and we make an array
         * from [.EMPTY] and non-empty. We merge [.EMPTY] by using null parent and
         * returnState == [.EMPTY_RETURN_STATE].
         */
        val parents: Array<PredictionContext?>?,
        /** Sorted for merge, no duplicates; if present,
         * [.EMPTY_RETURN_STATE] is always last.
         */
        val returnStates: IntArray?) : PredictionContext(PredictionContext.calculateHashCode(parents!!, returnStates!!)) {
//
//    override// since EMPTY_RETURN_STATE can only appear in the last position, we
//            // don't need to verify that size==1
//    val isEmpty: Boolean
//        get() = returnStates[0] == PredictionContext.EMPTY_RETURN_STATE
//
    constructor(a: SingletonPredictionContext) : this(arrayOf<PredictionContext?>(a.parent), intArrayOf(a.returnState)) {}
//
//    init {
//        assert(parents != null && parents.size > 0)
//        assert(returnStates != null && returnStates.size > 0)
//    }//		System.err.println("CREATE ARRAY: "+Arrays.toString(parents)+", "+Arrays.toString(returnStates));
//
    override fun size(): Int {
        return returnStates!!.size
    }

    override fun getParent(index: Int): PredictionContext? {
        return parents!![index]!!
    }

    override fun getReturnState(index: Int): Int {
        return returnStates!![index]
    }
//
//    //	@Override
//    //	public int findReturnState(int returnState) {
//    //		return Arrays.binarySearch(returnStates, returnState);
//    //	}
//
    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        } else if (o !is ArrayPredictionContext) {
            return false
        }

        if (this.hashCode() != o.hashCode()) {
            return false // can't be same if hash is different
        }

        val a = o as ArrayPredictionContext?
        TODO()
        //return Arrays.equals(returnStates, a!!.returnStates) && Arrays.equals(parents, a.parents)
    }
//
//    override fun toString(): String {
//        if (isEmpty) return "[]"
//        val buf = StringBuilder()
//        buf.append("[")
//        for (i in returnStates.indices) {
//            if (i > 0) buf.append(", ")
//            if (returnStates[i] == PredictionContext.EMPTY_RETURN_STATE) {
//                buf.append("$")
//                continue
//            }
//            buf.append(returnStates[i])
//            if (parents[i] != null) {
//                buf.append(' ')
//                buf.append(parents[i].toString())
//            } else {
//                buf.append("null")
//            }
//        }
//        buf.append("]")
//        return buf.toString()
//    }
}
