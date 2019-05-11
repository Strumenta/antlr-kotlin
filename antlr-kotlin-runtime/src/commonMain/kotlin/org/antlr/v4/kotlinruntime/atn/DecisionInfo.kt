/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/**
 * This class contains profiling gathered for a particular decision.
 *
 *
 *
 * Parsing performance in ANTLR 4 is heavily influenced by both static factors
 * (e.g. the form of the rules in the grammar) and dynamic factors (e.g. the
 * choice of input and the state of the DFA cache at the time profiling
 * operations are started). For best results, gather and use aggregate
 * statistics from a large sample of inputs representing the inputs expected in
 * production before using the results to make changes in the grammar.
 *
 * @since 4.3
 */
class DecisionInfo
/**
 * Constructs a new instance of the [DecisionInfo] class to contain
 * statistics for a particular decision.
 *
 * @param decision The decision number
 */
(
        /**
         * The decision number, which is an index into [ATN.decisionToState].
         */
        val decision: Int) {

    /**
     * The total number of times [ParserATNSimulator.adaptivePredict] was
     * invoked for this decision.
     */
    var invocations: Long = 0

    /**
     * The total time spent in [ParserATNSimulator.adaptivePredict] for
     * this decision, in nanoseconds.
     *
     *
     *
     * The value of this field contains the sum of differential results obtained
     * by [System.nanoTime], and is not adjusted to compensate for JIT
     * and/or garbage collection overhead. For best accuracy, use a modern JVM
     * implementation that provides precise results from
     * [System.nanoTime], and perform profiling in a separate process
     * which is warmed up by parsing the input prior to profiling. If desired,
     * call [ATNSimulator.clearDFA] to reset the DFA cache to its initial
     * state before starting the profiling measurement pass.
     */
    var timeInPrediction: Long = 0

    /**
     * The sum of the lookahead required for SLL prediction for this decision.
     * Note that SLL prediction is used before LL prediction for performance
     * reasons even when [PredictionMode.LL] or
     * [PredictionMode.LL_EXACT_AMBIG_DETECTION] is used.
     */
    var SLL_TotalLook: Long = 0

    /**
     * Gets the minimum lookahead required for any single SLL prediction to
     * complete for this decision, by reaching a unique prediction, reaching an
     * SLL conflict state, or encountering a syntax error.
     */
    var SLL_MinLook: Long = 0

    /**
     * Gets the maximum lookahead required for any single SLL prediction to
     * complete for this decision, by reaching a unique prediction, reaching an
     * SLL conflict state, or encountering a syntax error.
     */
    var SLL_MaxLook: Long = 0

    /**
     * Gets the [LookaheadEventInfo] associated with the event where the
     * [.SLL_MaxLook] value was set.
     */
    var SLL_MaxLookEvent: LookaheadEventInfo? = null

    /**
     * The sum of the lookahead required for LL prediction for this decision.
     * Note that LL prediction is only used when SLL prediction reaches a
     * conflict state.
     */
    var LL_TotalLook: Long = 0

    /**
     * Gets the minimum lookahead required for any single LL prediction to
     * complete for this decision. An LL prediction completes when the algorithm
     * reaches a unique prediction, a conflict state (for
     * [PredictionMode.LL], an ambiguity state (for
     * [PredictionMode.LL_EXACT_AMBIG_DETECTION], or a syntax error.
     */
    var LL_MinLook: Long = 0

    /**
     * Gets the maximum lookahead required for any single LL prediction to
     * complete for this decision. An LL prediction completes when the algorithm
     * reaches a unique prediction, a conflict state (for
     * [PredictionMode.LL], an ambiguity state (for
     * [PredictionMode.LL_EXACT_AMBIG_DETECTION], or a syntax error.
     */
    var LL_MaxLook: Long = 0

    /**
     * Gets the [LookaheadEventInfo] associated with the event where the
     * [.LL_MaxLook] value was set.
     */
    var LL_MaxLookEvent: LookaheadEventInfo? = null

    /**
     * A collection of [ContextSensitivityInfo] instances describing the
     * context sensitivities encountered during LL prediction for this decision.
     *
     * @see ContextSensitivityInfo
     */
    val contextSensitivities: List<ContextSensitivityInfo> = ArrayList<ContextSensitivityInfo>()

    /**
     * A collection of [ErrorInfo] instances describing the parse errors
     * identified during calls to [ParserATNSimulator.adaptivePredict] for
     * this decision.
     *
     * @see ErrorInfo
     */
    val errors: List<ErrorInfo> = ArrayList<ErrorInfo>()

    /**
     * A collection of [AmbiguityInfo] instances describing the
     * ambiguities encountered during LL prediction for this decision.
     *
     * @see AmbiguityInfo
     */
    val ambiguities: List<AmbiguityInfo> = ArrayList<AmbiguityInfo>()

    /**
     * A collection of [PredicateEvalInfo] instances describing the
     * results of evaluating individual predicates during prediction for this
     * decision.
     *
     * @see PredicateEvalInfo
     */
    val predicateEvals: List<PredicateEvalInfo> = ArrayList<PredicateEvalInfo>()

    /**
     * The total number of ATN transitions required during SLL prediction for
     * this decision. An ATN transition is determined by the number of times the
     * DFA does not contain an edge that is required for prediction, resulting
     * in on-the-fly computation of that edge.
     *
     *
     *
     * If DFA caching of SLL transitions is employed by the implementation, ATN
     * computation may cache the computed edge for efficient lookup during
     * future parsing of this decision. Otherwise, the SLL parsing algorithm
     * will use ATN transitions exclusively.
     *
     * @see .SLL_ATNTransitions
     *
     * @see ParserATNSimulator.computeTargetState
     *
     * @see LexerATNSimulator.computeTargetState
     */
    var SLL_ATNTransitions: Long = 0

    /**
     * The total number of DFA transitions required during SLL prediction for
     * this decision.
     *
     *
     * If the ATN simulator implementation does not use DFA caching for SLL
     * transitions, this value will be 0.
     *
     * @see ParserATNSimulator.getExistingTargetState
     *
     * @see LexerATNSimulator.getExistingTargetState
     */
    var SLL_DFATransitions: Long = 0

    /**
     * Gets the total number of times SLL prediction completed in a conflict
     * state, resulting in fallback to LL prediction.
     *
     *
     * Note that this value is not related to whether or not
     * [PredictionMode.SLL] may be used successfully with a particular
     * grammar. If the ambiguity resolution algorithm applied to the SLL
     * conflicts for this decision produce the same result as LL prediction for
     * this decision, [PredictionMode.SLL] would produce the same overall
     * parsing result as [PredictionMode.LL].
     */
    var LL_Fallback: Long = 0

    /**
     * The total number of ATN transitions required during LL prediction for
     * this decision. An ATN transition is determined by the number of times the
     * DFA does not contain an edge that is required for prediction, resulting
     * in on-the-fly computation of that edge.
     *
     *
     *
     * If DFA caching of LL transitions is employed by the implementation, ATN
     * computation may cache the computed edge for efficient lookup during
     * future parsing of this decision. Otherwise, the LL parsing algorithm will
     * use ATN transitions exclusively.
     *
     * @see .LL_DFATransitions
     *
     * @see ParserATNSimulator.computeTargetState
     *
     * @see LexerATNSimulator.computeTargetState
     */
    var LL_ATNTransitions: Long = 0

    /**
     * The total number of DFA transitions required during LL prediction for
     * this decision.
     *
     *
     * If the ATN simulator implementation does not use DFA caching for LL
     * transitions, this value will be 0.
     *
     * @see ParserATNSimulator.getExistingTargetState
     *
     * @see LexerATNSimulator.getExistingTargetState
     */
    var LL_DFATransitions: Long = 0

    override fun toString(): String {
        return "{" +
                "decision=" + decision +
                ", contextSensitivities=" + contextSensitivities.size +
                ", errors=" + errors.size +
                ", ambiguities=" + ambiguities.size +
                ", SLL_lookahead=" + SLL_TotalLook +
                ", SLL_ATNTransitions=" + SLL_ATNTransitions +
                ", SLL_DFATransitions=" + SLL_DFATransitions +
                ", LL_Fallback=" + LL_Fallback +
                ", LL_lookahead=" + LL_TotalLook +
                ", LL_ATNTransitions=" + LL_ATNTransitions +
                '}'
    }
}
