// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.BitSet
import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.TokenStream
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.dfa.DFAState
import kotlin.math.min
import kotlin.time.measureTimedValue

/**
 * @since 4.3
 */
@Suppress("PropertyName", "MemberVisibilityCanBePrivate")
public open class ProfilingATNSimulator(parser: Parser) : ParserATNSimulator(
  parser,
  parser.interpreter.atn,
  parser.interpreter.decisionToDFA,
  parser.interpreter.sharedContextCache!!,
) {
  protected var numDecisions: Int = 0
  protected var _sllStopIndex: Int = 0
  protected var _llStopIndex: Int = 0
  protected var currentDecision: Int = 0

  public var decisionInfo: Array<DecisionInfo>
  public var currentState: DFAState? = null
    protected set

  /**
   * At the point of LL failover, we record how SLL would resolve the conflict so that
   * we can determine whether a decision / input pair is context-sensitive.
   *
   * If LL gives a different result than SLL's predicted alternative, we have a
   * context sensitivity for sure. The converse is not necessarily true, however.
   *
   * It's possible that after conflict resolution chooses minimum alternatives,
   * SLL could get the same answer as LL. Regardless of whether the result indicates
   * an ambiguity, it is not treated as a context sensitivity because LL prediction
   * was not required in order to produce a correct prediction for this decision and input sequence.
   * It may in fact still be a context sensitivity, but we don't know by looking at the
   * minimum alternatives for the current input.
   */
  protected var conflictingAltResolvedBySLL: Int = 0

  init {
    numDecisions = atn.decisionToState.size
    decisionInfo = Array(numDecisions) {
      DecisionInfo(it)
    }
  }

  override fun adaptivePredict(input: TokenStream, decision: Int, outerContext: ParserRuleContext?): Int {
    try {
      _sllStopIndex = -1
      _llStopIndex = -1
      currentDecision = decision

      val (alt, duration) = measureTimedValue {
        super.adaptivePredict(input, decision, outerContext)
      }

      decisionInfo[decision].timeInPrediction += duration.inWholeNanoseconds
      decisionInfo[decision].invocations++

      @Suppress("LocalVariableName")
      val SLL_k = _sllStopIndex - _startIndex + 1
      decisionInfo[decision].SLL_TotalLook += SLL_k.toLong()
      decisionInfo[decision].SLL_MinLook = if (decisionInfo[decision].SLL_MinLook == 0L) {
        SLL_k.toLong()
      } else {
        min(decisionInfo[decision].SLL_MinLook, SLL_k.toLong())
      }

      if (SLL_k > decisionInfo[decision].SLL_MaxLook) {
        decisionInfo[decision].SLL_MaxLook = SLL_k.toLong()
        decisionInfo[decision].SLL_MaxLookEvent =
          LookaheadEventInfo(decision, null, alt, input, _startIndex, _sllStopIndex, false)
      }

      if (_llStopIndex >= 0) {
        @Suppress("LocalVariableName")
        val LL_k = _llStopIndex - _startIndex + 1
        decisionInfo[decision].LL_TotalLook += LL_k.toLong()
        decisionInfo[decision].LL_MinLook = if (decisionInfo[decision].LL_MinLook == 0L) {
          LL_k.toLong()
        } else {
          min(decisionInfo[decision].LL_MinLook, LL_k.toLong())
        }

        if (LL_k > decisionInfo[decision].LL_MaxLook) {
          decisionInfo[decision].LL_MaxLook = LL_k.toLong()
          decisionInfo[decision].LL_MaxLookEvent =
            LookaheadEventInfo(decision, null, alt, input, _startIndex, _llStopIndex, true)
        }
      }

      return alt
    } finally {
      currentDecision = -1
    }
  }

  protected override fun getExistingTargetState(previousD: DFAState, t: Int): DFAState? {
    // This method is called after each time the input position advances
    // during SLL prediction
    _sllStopIndex = _input!!.index()

    val existingTargetState = super.getExistingTargetState(previousD, t)

    if (existingTargetState != null) {
      // Count only if we transition over a DFA state
      decisionInfo[currentDecision].SLL_DFATransitions++

      if (existingTargetState === ERROR) {
        val errorInfo = ErrorInfo(currentDecision, previousD.configs, _input!!, _startIndex, _sllStopIndex, false)
        decisionInfo[currentDecision].errors.add(errorInfo)
      }
    }

    currentState = existingTargetState
    return existingTargetState
  }

  protected override fun computeTargetState(dfa: DFA, previousD: DFAState, t: Int): DFAState? {
    val state = super.computeTargetState(dfa, previousD, t)
    currentState = state
    return state
  }

  protected override fun computeReachSet(closure: ATNConfigSet, t: Int, fullCtx: Boolean): ATNConfigSet? {
    if (fullCtx) {
      // This method is called after each time the input position advances
      // during full context prediction
      _llStopIndex = _input!!.index()
    }

    val reachConfigs = super.computeReachSet(closure, t, fullCtx)

    if (fullCtx) {
      // Count computation even if error
      decisionInfo[currentDecision].LL_ATNTransitions++

      if (reachConfigs != null) {
        //
      } else {
        // No reach on current lookahead symbol. ERROR.
        // TODO: does not handle delayed errors per getSynValidOrSemInvalidAltThatFinishedDecisionEntryRule()
        val errorInfo = ErrorInfo(currentDecision, closure, _input!!, _startIndex, _llStopIndex, true)
        decisionInfo[currentDecision].errors.add(errorInfo)
      }
    } else {
      decisionInfo[currentDecision].SLL_ATNTransitions++

      if (reachConfigs != null) {
        //
      } else {
        // No reach on current lookahead symbol. ERROR.
        val errorInfo = ErrorInfo(currentDecision, closure, _input!!, _startIndex, _sllStopIndex, false)
        decisionInfo[currentDecision].errors.add(errorInfo)
      }
    }

    return reachConfigs
  }

  protected override fun evalSemanticContext(
    pred: SemanticContext,
    parserCallStack: ParserRuleContext?,
    alt: Int,
    fullCtx: Boolean,
  ): Boolean {
    val result = super.evalSemanticContext(pred, parserCallStack, alt, fullCtx)

    if (pred !is SemanticContext.PrecedencePredicate) {
      val fullContext = _llStopIndex >= 0
      val stopIndex = if (fullContext) {
        _llStopIndex
      } else {
        _sllStopIndex
      }

      val evalInfo = PredicateEvalInfo(currentDecision, _input!!, _startIndex, stopIndex, pred, result, alt, fullCtx)
      decisionInfo[currentDecision].predicateEvals.add(evalInfo)
    }

    return result
  }

  protected override fun reportAttemptingFullContext(
    dfa: DFA,
    conflictingAlts: BitSet,
    configs: ATNConfigSet,
    startIndex: Int,
    stopIndex: Int,
  ) {
    conflictingAltResolvedBySLL = conflictingAlts.nextSetBit(0)
    decisionInfo[currentDecision].LL_Fallback++
    super.reportAttemptingFullContext(dfa, conflictingAlts, configs, startIndex, stopIndex)
  }

  protected override fun reportContextSensitivity(
    dfa: DFA,
    prediction: Int,
    configs: ATNConfigSet,
    startIndex: Int,
    stopIndex: Int,
  ) {
    if (prediction != conflictingAltResolvedBySLL) {
      val info = ContextSensitivityInfo(currentDecision, configs, _input!!, startIndex, stopIndex)
      decisionInfo[currentDecision].contextSensitivities.add(info)
    }

    super.reportContextSensitivity(dfa, prediction, configs, startIndex, stopIndex)
  }

  @Suppress("LocalVariableName")
  protected override fun reportAmbiguity(
    dfa: DFA,
    D: DFAState,
    startIndex: Int,
    stopIndex: Int,
    exact: Boolean,
    ambigAlts: BitSet,
    configs: ATNConfigSet,
  ) {
    val prediction: Int = ambigAlts.nextSetBit(0)

    if (configs.fullCtx && prediction != conflictingAltResolvedBySLL) {
      // Even though this is an ambiguity we are reporting, we can
      // still detect some context sensitivities. Both SLL and LL
      // are showing a conflict, hence an ambiguity, but if they resolve
      // to different minimum alternatives we have also identified a
      // context sensitivity.
      val info = ContextSensitivityInfo(currentDecision, configs, _input!!, startIndex, stopIndex)
      decisionInfo[currentDecision].contextSensitivities.add(info)
    }

    val info = AmbiguityInfo(
      currentDecision,
      configs,
      ambigAlts,
      _input!!,
      startIndex,
      stopIndex,
      configs.fullCtx,
    )

    decisionInfo[currentDecision].ambiguities.add(info)
    super.reportAmbiguity(dfa, D, startIndex, stopIndex, exact, ambigAlts, configs)
  }
}
