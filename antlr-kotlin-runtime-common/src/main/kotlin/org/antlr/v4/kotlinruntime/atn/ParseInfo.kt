/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.dfa.DFA

/**
 * This class provides access to specific and aggregate statistics gathered
 * during profiling of a parser.
 *
 * @since 4.3
 */
class ParseInfo(protected val atnSimulator: ProfilingATNSimulator) {

    /**
     * Gets an array of [DecisionInfo] instances containing the profiling
     * information gathered for each decision in the ATN.
     *
     * @return An array of [DecisionInfo] instances, indexed by decision
     * number.
     */
    val decisionInfo: Array<DecisionInfo>
        get() = atnSimulator.decisionInfo!!

    /**
     * Gets the decision numbers for decisions that required one or more
     * full-context predictions during parsing. These are decisions for which
     * [DecisionInfo.LL_Fallback] is non-zero.
     *
     * @return A list of decision numbers which required one or more
     * full-context predictions during parsing.
     */
    val llDecisions: List<Int>
        get() {
            val decisions = atnSimulator.decisionInfo
            val LL = ArrayList<Int>()
            for (i in decisions!!.indices) {
                val fallBack = decisions[i]!!.LL_Fallback
                if (fallBack > 0) LL.add(i)
            }
            return LL
        }

    /**
     * Gets the total time spent during prediction across all decisions made
     * during parsing. This value is the sum of
     * [DecisionInfo.timeInPrediction] for all decisions.
     */
    val totalTimeInPrediction: Long
        get() {
            val decisions = atnSimulator.decisionInfo
            var t: Long = 0
            for (i in decisions!!.indices) {
                t += decisions[i]!!.timeInPrediction
            }
            return t
        }

    /**
     * Gets the total number of SLL lookahead operations across all decisions
     * made during parsing. This value is the sum of
     * [DecisionInfo.SLL_TotalLook] for all decisions.
     */
    val totalSLLLookaheadOps: Long
        get() {
            val decisions = atnSimulator.decisionInfo
            var k: Long = 0
            for (i in decisions!!.indices) {
                k += decisions[i]!!.SLL_TotalLook
            }
            return k
        }

    /**
     * Gets the total number of LL lookahead operations across all decisions
     * made during parsing. This value is the sum of
     * [DecisionInfo.LL_TotalLook] for all decisions.
     */
    val totalLLLookaheadOps: Long
        get() {
            val decisions = atnSimulator.decisionInfo
            var k: Long = 0
            for (i in decisions!!.indices) {
                k += decisions[i]!!.LL_TotalLook
            }
            return k
        }

    /**
     * Gets the total number of ATN lookahead operations for SLL prediction
     * across all decisions made during parsing.
     */
    val totalSLLATNLookaheadOps: Long
        get() {
            val decisions = atnSimulator.decisionInfo
            var k: Long = 0
            for (i in decisions!!.indices) {
                k += decisions[i]!!.SLL_ATNTransitions
            }
            return k
        }

    /**
     * Gets the total number of ATN lookahead operations for LL prediction
     * across all decisions made during parsing.
     */
    val totalLLATNLookaheadOps: Long
        get() {
            val decisions = atnSimulator.decisionInfo
            var k: Long = 0
            for (i in decisions!!.indices) {
                k += decisions[i]!!.LL_ATNTransitions
            }
            return k
        }

    /**
     * Gets the total number of ATN lookahead operations for SLL and LL
     * prediction across all decisions made during parsing.
     *
     *
     *
     * This value is the sum of [.getTotalSLLATNLookaheadOps] and
     * [.getTotalLLATNLookaheadOps].
     */
    val totalATNLookaheadOps: Long
        get() {
            val decisions = atnSimulator.decisionInfo
            var k: Long = 0
            for (i in decisions!!.indices) {
                k += decisions[i]!!.SLL_ATNTransitions
                k += decisions[i]!!.LL_ATNTransitions
            }
            return k
        }

//    /**
//     * Gets the total number of DFA states stored in the DFA cache for all
//     * decisions in the ATN.
//     */
//    val dfaSize: Int
//        get() {
//            var n = 0
//            val decisionToDFA = atnSimulator.decisionToDFA
//            for (i in decisionToDFA.indices) {
//                n += getDFASize(i)
//            }
//            return n
//        }
//
//    /**
//     * Gets the total number of DFA states stored in the DFA cache for a
//     * particular decision.
//     */
//    fun getDFASize(decision: Int): Int {
//        val decisionToDFA = atnSimulator.decisionToDFA[decision]
//        return decisionToDFA.states.size()
//    }
}
