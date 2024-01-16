// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import kotlin.time.measureTimedValue

/**
 * This class contains profiling gathered for a particular decision.
 *
 * Parsing performance in ANTLR 4 is heavily influenced by both static factors
 * (e.g. the form of the rules in the grammar) and dynamic factors (e.g., the
 * choice of input and the state of the DFA cache at the time profiling
 * operations are started). For best results, gather and use aggregate
 * statistics from a large sample of inputs representing the inputs expected in
 * production before using the results to make changes in the grammar.
 *
 * @param decision The decision number, which is an index into [ATN.decisionToState]
 *
 * @since 4.3
 */
@Suppress("PropertyName", "MemberVisibilityCanBePrivate")
public class DecisionInfo(public val decision: Int) {
  /**
   * The total number of times [ParserATNSimulator.adaptivePredict] was
   * invoked for this decision.
   */
  public var invocations: Long = 0

  /**
   * The total time spent in [ParserATNSimulator.adaptivePredict] for
   * this decision, in nanoseconds.
   *
   * The value of this field contains the sum of results obtained
   * by [measureTimedValue], and is not adjusted to compensate for JIT
   * and/or garbage collection overhead.
   *
   * For best accuracy, perform profiling in a separate process
   * which is warmed up by parsing the input prior to profiling.
   * If desired, call [ATNSimulator.clearDFA] to reset the DFA cache
   * to its initial state before starting the profiling measurement pass.
   */
  public var timeInPrediction: Long = 0

  /**
   * The sum of the lookahead required for SLL prediction for this decision.
   *
   * Note that SLL prediction is used before LL prediction for performance
   * reasons even when [PredictionMode.LL] or [PredictionMode.LL_EXACT_AMBIG_DETECTION] is used.
   */
  public var SLL_TotalLook: Long = 0

  /**
   * Gets the minimum lookahead required for any single SLL prediction to
   * complete for this decision, by reaching a unique prediction, reaching an
   * SLL conflict state, or encountering a syntax error.
   */
  public var SLL_MinLook: Long = 0

  /**
   * Gets the maximum lookahead required for any single SLL prediction to
   * complete for this decision, by reaching a unique prediction, reaching an
   * SLL conflict state, or encountering a syntax error.
   */
  public var SLL_MaxLook: Long = 0

  /**
   * Gets the [LookaheadEventInfo] associated with the event where
   * the [SLL_MaxLook] value was set.
   */
  public var SLL_MaxLookEvent: LookaheadEventInfo? = null

  /**
   * The sum of the lookahead required for LL prediction for this decision.
   *
   * Note that LL prediction is only used when SLL prediction reaches a
   * conflict state.
   */
  public var LL_TotalLook: Long = 0

  /**
   * Gets the minimum lookahead required for any single LL prediction to
   * complete for this decision.
   *
   * An LL prediction completes when the algorithm reaches a unique prediction,
   * a conflict state (for [PredictionMode.LL], an ambiguity state, for
   * [PredictionMode.LL_EXACT_AMBIG_DETECTION], or a syntax error).
   */
  public var LL_MinLook: Long = 0

  /**
   * Gets the maximum lookahead required for any single LL prediction to
   * complete for this decision.
   *
   * An LL prediction completes when the algorithm reaches a unique prediction,
   * a conflict state (for [PredictionMode.LL], an ambiguity state, for
   * [PredictionMode.LL_EXACT_AMBIG_DETECTION], or a syntax error).
   */
  public var LL_MaxLook: Long = 0

  /**
   * Gets the [LookaheadEventInfo] associated with the event where
   * the [LL_MaxLook] value was set.
   */
  public var LL_MaxLookEvent: LookaheadEventInfo? = null

  /**
   * A collection of [ContextSensitivityInfo] instances describing the
   * context sensitivities encountered during LL prediction for this decision.
   *
   * @see ContextSensitivityInfo
   */
  public val contextSensitivities: MutableList<ContextSensitivityInfo> = ArrayList()

  /**
   * A collection of [ErrorInfo] instances describing the parse errors
   * identified during calls to [ParserATNSimulator.adaptivePredict] for
   * this decision.
   *
   * @see ErrorInfo
   */
  public val errors: MutableList<ErrorInfo> = ArrayList()

  /**
   * A collection of [AmbiguityInfo] instances describing the
   * ambiguities encountered during LL prediction for this decision.
   *
   * @see AmbiguityInfo
   */
  public val ambiguities: MutableList<AmbiguityInfo> = ArrayList()

  /**
   * A collection of [PredicateEvalInfo] instances describing the
   * results of evaluating individual predicates during prediction for this
   * decision.
   *
   * @see PredicateEvalInfo
   */
  public val predicateEvals: MutableList<PredicateEvalInfo> = ArrayList()

  /**
   * The total number of ATN transitions required during SLL prediction for
   * this decision.
   *
   * An ATN transition is determined by the number of times the
   * DFA does not contain an edge that is required for prediction, resulting
   * in on-the-fly computation of that edge.
   *
   * If DFA caching of SLL transitions is employed by the implementation, ATN
   * computation may cache the computed edge for efficient lookup during
   * future parsing of this decision. Otherwise, the SLL parsing algorithm
   * will use ATN transitions exclusively.
   *
   * @see SLL_ATNTransitions
   * @see ParserATNSimulator.computeTargetState
   * @see LexerATNSimulator.computeTargetState
   */
  public var SLL_ATNTransitions: Long = 0

  /**
   * The total number of DFA transitions required during SLL prediction for
   * this decision.
   *
   * If the ATN simulator implementation does not use DFA caching for SLL
   * transitions, this value will be 0.
   *
   * @see ParserATNSimulator.getExistingTargetState
   * @see LexerATNSimulator.getExistingTargetState
   */
  public var SLL_DFATransitions: Long = 0

  /**
   * Gets the total number of times SLL prediction completed in a conflict
   * state, resulting in fallback to LL prediction.
   *
   * Note that this value is not related to whether or not
   * [PredictionMode.SLL] may be used successfully with a particular
   * grammar. If the ambiguity resolution algorithm applied to the SLL
   * conflicts for this decision produce the same result as LL prediction for
   * this decision, [PredictionMode.SLL] would produce the same overall
   * parsing result as [PredictionMode.LL].
   */
  public var LL_Fallback: Long = 0

  /**
   * The total number of ATN transitions required during LL prediction for
   * this decision.
   *
   * An ATN transition is determined by the number of times the
   * DFA does not contain an edge that is required for prediction,
   * resulting in on-the-fly computation of that edge.
   *
   * If DFA caching of LL transitions is employed by the implementation, ATN
   * computation may cache the computed edge for efficient lookup during
   * future parsing of this decision. Otherwise, the LL parsing algorithm will
   * use ATN transitions exclusively.
   *
   * @see LL_DFATransitions
   * @see ParserATNSimulator.computeTargetState
   * @see LexerATNSimulator.computeTargetState
   */
  public var LL_ATNTransitions: Long = 0

  /**
   * The total number of DFA transitions required during LL prediction for
   * this decision.
   *
   * If the ATN simulator implementation does not use DFA caching for LL
   * transitions, this value will be `0`.
   *
   * @see ParserATNSimulator.getExistingTargetState
   * @see LexerATNSimulator.getExistingTargetState
   */
  public var LL_DFATransitions: Long = 0

  override fun toString(): String =
    buildString {
      append("{")
      append("decision=")
      append(decision)
      append(", contextSensitivities=")
      append(contextSensitivities.size)
      append(", errors=")
      append(errors.size)
      append(", ambiguities=")
      append(ambiguities.size)
      append(", SLL_lookahead=")
      append(SLL_TotalLook)
      append(", SLL_ATNTransitions=")
      append(SLL_ATNTransitions)
      append(", SLL_DFATransitions=")
      append(SLL_DFATransitions)
      append(", LL_Fallback=")
      append(LL_Fallback)
      append(", LL_lookahead=")
      append(LL_TotalLook)
      append(", LL_ATNTransitions=")
      append(LL_ATNTransitions)
      append("}")
    }
}
