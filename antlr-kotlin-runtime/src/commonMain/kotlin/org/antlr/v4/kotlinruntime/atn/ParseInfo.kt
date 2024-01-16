// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * This class provides access to specific and aggregate statistics gathered
 * during profiling of a parser.
 *
 * @since 4.3
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class ParseInfo(protected val atnSimulator: ProfilingATNSimulator) {
  /**
   * An array of [DecisionInfo] instances containing the profiling
   * information gathered for each decision in the ATN.
   */
  public val decisionInfo: Array<DecisionInfo>
    get() = atnSimulator.decisionInfo

  /**
   * The decision numbers for decisions that required one or more
   * full-context predictions during parsing.
   *
   * These are decisions for which [DecisionInfo.LL_Fallback] is non-zero.
   */
  public val llDecisions: List<Int>
    get() {
      val decisions = atnSimulator.decisionInfo

      @Suppress("LocalVariableName")
      val LL = ArrayList<Int>()

      for (i in decisions.indices) {
        val fallBack = decisions[i].LL_Fallback

        if (fallBack > 0) {
          LL.add(i)
        }
      }

      return LL
    }

  /**
   * The total time spent during prediction across all decisions made during parsing.
   *
   * This value is the sum of [DecisionInfo.timeInPrediction] for all decisions.
   */
  public val totalTimeInPrediction: Long
    get() {
      val decisions = atnSimulator.decisionInfo
      var t = 0L

      for (i in decisions.indices) {
        t += decisions[i].timeInPrediction
      }

      return t
    }

  /**
   * The total number of SLL lookahead operations across all decisions made during parsing.
   *
   * This value is the sum of [DecisionInfo.SLL_TotalLook] for all decisions.
   */
  public val totalSLLLookaheadOps: Long
    get() {
      val decisions = atnSimulator.decisionInfo
      var k = 0L

      for (i in decisions.indices) {
        k += decisions[i].SLL_TotalLook
      }

      return k
    }

  /**
   * The total number of LL lookahead operations across all decisions made during parsing.
   *
   * This value is the sum of [DecisionInfo.LL_TotalLook] for all decisions.
   */
  public val totalLLLookaheadOps: Long
    get() {
      val decisions = atnSimulator.decisionInfo
      var k = 0L

      for (i in decisions.indices) {
        k += decisions[i].LL_TotalLook
      }

      return k
    }

  /**
   * The total number of ATN lookahead operations for SLL prediction
   * across all decisions made during parsing.
   */
  public val totalSLLATNLookaheadOps: Long
    get() {
      val decisions = atnSimulator.decisionInfo
      var k = 0L

      for (i in decisions.indices) {
        k += decisions[i].SLL_ATNTransitions
      }

      return k
    }

  /**
   * The total number of ATN lookahead operations for LL prediction
   * across all decisions made during parsing.
   */
  public val totalLLATNLookaheadOps: Long
    get() {
      val decisions = atnSimulator.decisionInfo
      var k = 0L

      for (i in decisions.indices) {
        k += decisions[i].LL_ATNTransitions
      }

      return k
    }

  /**
   * Gets the total number of ATN lookahead operations for SLL and LL
   * prediction across all decisions made during parsing.
   *
   * This value is the sum of [totalSLLATNLookaheadOps] and [totalLLATNLookaheadOps].
   */
  public val totalATNLookaheadOps: Long
    get() {
      val decisions = atnSimulator.decisionInfo
      var k = 0L

      for (i in decisions.indices) {
        k += decisions[i].SLL_ATNTransitions
        k += decisions[i].LL_ATNTransitions
      }

      return k
    }

  /**
   * Gets the total number of DFA states stored in the DFA cache for all
   * decisions in the ATN.
   */
  public val dfaSize: Int
    get() {
      var n = 0
      val decisionToDFA = atnSimulator.decisionToDFA

      for (i in decisionToDFA.indices) {
        n += getDFASize(i)
      }

      return n
    }

  /**
   * Gets the total number of DFA states stored in the DFA cache for a
   * particular decision.
   */
  public fun getDFASize(decision: Int): Int {
    val decisionToDFA = atnSimulator.decisionToDFA[decision]
    return decisionToDFA.states.size
  }
}
