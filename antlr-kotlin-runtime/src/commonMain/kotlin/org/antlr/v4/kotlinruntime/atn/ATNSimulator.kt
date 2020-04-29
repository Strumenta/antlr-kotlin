/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.IdentityHashMap
import com.strumenta.kotlinmultiplatform.synchronized
import com.strumenta.kotlinmultiplatform.UUID
import org.antlr.v4.kotlinruntime.dfa.DFAState
import org.antlr.v4.kotlinruntime.misc.IntervalSet

abstract class ATNSimulator(val atn: ATN,
                            /** The context cache maps all PredictionContext objects that are equals()
                             * to a single cached copy. This cache is shared across all contexts
                             * in all ATNConfigs in all DFA states.  We rebuild each ATNConfigSet
                             * to use only cached nodes/graphs in addDFAState(). We don't want to
                             * fill this during closure() since there are lots of contexts that
                             * pop up but are not used ever again. It also greatly slows down closure().
                             *
                             *
                             * This cache makes a huge difference in memory and a little bit in speed.
                             * For the Java grammar on java.*, it dropped the memory requirements
                             * at the end from 25M to 16M. We don't store any of the full context
                             * graphs in the DFA because they are limited to local context only,
                             * but apparently there's a lot of repetition there as well. We optimize
                             * the config contexts before storing the config set in the DFA states
                             * by literally rebuilding them with cached subgraphs only.
                             *
                             *
                             * I tried a cache for use during closure operations, that was
                             * whacked after each adaptivePredict(). It cost a little bit
                             * more time I think and doesn't save on the overall footprint
                             * so it's not worth the complexity.
                             */
                            val sharedContextCache: PredictionContextCache?) {

    abstract fun reset()

    /**
     * Clear the DFA cache used by the current instance. Since the DFA cache may
     * be shared by multiple ATN simulators, this method may affect the
     * performance (but not accuracy) of other parsers which are being used
     * concurrently.
     *
     * @throws UnsupportedOperationException if the current instance does not
     * support clearing the DFA.
     *
     * @since 4.3
     */
    open fun clearDFA() {
        throw UnsupportedOperationException("This ATN simulator does not support clearing the DFA.")
    }

    fun getCachedContext(context: PredictionContext): PredictionContext {
        if (sharedContextCache == null) return context

        synchronized(sharedContextCache) {
            val visited = IdentityHashMap<PredictionContext, PredictionContext>()
            return PredictionContext.getCachedContext(context,
                    sharedContextCache,
                    visited)
        }
    }

    companion object {

        @Deprecated("Use {@link ATNDeserializer#SERIALIZED_VERSION} instead.")
        val SERIALIZED_VERSION: Int

        init {
            SERIALIZED_VERSION = ATNDeserializer.SERIALIZED_VERSION
        }

        /**
         * This is the current serialized UUID.
         */
        @Deprecated("Use {@link ATNDeserializer#checkCondition(boolean)} instead.")
        val SERIALIZED_UUID: UUID

        init {
            SERIALIZED_UUID = ATNDeserializer.SERIALIZED_UUID
        }

        /** Must distinguish between missing edge and edge we know leads nowhere  */

        val ERROR: DFAState

        init {
            ERROR = DFAState(ATNConfigSet())
            ERROR.stateNumber = Int.MAX_VALUE
        }


        @Deprecated("Use {@link ATNDeserializer#deserialize} instead.")
        fun deserialize(data: CharArray): ATN {
            TODO()
            //return ATNDeserializer().deserialize(data)
        }


        @Deprecated("Use {@link ATNDeserializer#checkCondition(boolean)} instead.")
        fun checkCondition(condition: Boolean) {
            TODO()
            //ATNDeserializer().checkCondition(condition)
        }


        @Deprecated("Use {@link ATNDeserializer#checkCondition(boolean, String)} instead.")
        fun checkCondition(condition: Boolean, message: String) {
            TODO()
            //ATNDeserializer().checkCondition(condition, message)
        }


        @Deprecated("Use {@link ATNDeserializer#toInt} instead.")
        fun toInt(c: Char): Int {
            TODO()
            //return ATNDeserializer.toInt(c)
        }


        @Deprecated("Use {@link ATNDeserializer#toInt32} instead.")
        fun toInt32(data: CharArray, offset: Int): Int {
            TODO()
            //return ATNDeserializer.toInt32(data, offset)
        }


        @Deprecated("Use {@link ATNDeserializer#toLong} instead.")
        fun toLong(data: CharArray, offset: Int): Long {
            TODO()
            //return ATNDeserializer.toLong(data, offset)
        }


        @Deprecated("Use {@link ATNDeserializer#toUUID} instead.")
        fun toUUID(data: CharArray, offset: Int): UUID {
            TODO()
            //return ATNDeserializer.toUUID(data, offset)
        }


        @Deprecated("Use {@link ATNDeserializer#edgeFactory} instead.")
        fun edgeFactory(atn: ATN,
                        type: Int, src: Int, trg: Int,
                        arg1: Int, arg2: Int, arg3: Int,
                        sets: List<IntervalSet>): Transition {
            TODO()
            //return ATNDeserializer().edgeFactory(atn, type, src, trg, arg1, arg2, arg3, sets)
        }


        @Deprecated("Use {@link ATNDeserializer#stateFactory} instead.")
        fun stateFactory(type: Int, ruleIndex: Int): ATNState? {
            TODO()
            //return ATNDeserializer().stateFactory(type, ruleIndex)
        }
    }

}
