/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Parser

//
//import java.util.BitSet
//
///**
// * @since 4.3
// */
class ProfilingATNSimulator(parser: Parser) : ParserATNSimulator(parser, parser.interpreter!!.atn, parser.interpreter!!.decisionToDFA, parser.interpreter!!.sharedContextCache!!) {
//    // ---------------------------------------------------------------------
//
    var decisionInfo: Array<DecisionInfo>? = null
//    protected var numDecisions: Int = 0
//
//    protected var _sllStopIndex: Int = 0
//    protected var _llStopIndex: Int = 0
//
//    protected var currentDecision: Int = 0
//    var currentState: DFAState? = null
//        protected set
//
//    /** At the point of LL failover, we record how SLL would resolve the conflict so that
//     * we can determine whether or not a decision / input pair is context-sensitive.
//     * If LL gives a different result than SLL's predicted alternative, we have a
//     * context sensitivity for sure. The converse is not necessarily true, however.
//     * It's possible that after conflict resolution chooses minimum alternatives,
//     * SLL could get the same answer as LL. Regardless of whether or not the result indicates
//     * an ambiguity, it is not treated as a context sensitivity because LL prediction
//     * was not required in order to produce a correct prediction for this decision and input sequence.
//     * It may in fact still be a context sensitivity but we don't know by looking at the
//     * minimum alternatives for the current input.
//     */
//    protected var conflictingAltResolvedBySLL: Int = 0
//
//    init {
//        numDecisions = atn.decisionToState.size
//        decisionInfo = arrayOfNulls<DecisionInfo>(numDecisions)
//        for (i in 0 until numDecisions) {
//            decisionInfo[i] = DecisionInfo(i)
//        }
//    }
//
//    override fun adaptivePredict(input: TokenStream, decision: Int, outerContext: ParserRuleContext?): Int {
//        try {
//            this._sllStopIndex = -1
//            this._llStopIndex = -1
//            this.currentDecision = decision
//            val start = System.nanoTime() // expensive but useful info
//            val alt = super.adaptivePredict(input, decision, outerContext)
//            val stop = System.nanoTime()
//            decisionInfo[decision].timeInPrediction += stop - start
//            decisionInfo[decision].invocations++
//
//            val SLL_k = _sllStopIndex - _startIndex + 1
//            decisionInfo[decision].SLL_TotalLook += SLL_k.toLong()
//            decisionInfo[decision].SLL_MinLook = if (decisionInfo[decision].SLL_MinLook == 0L) SLL_k else Math.min(decisionInfo[decision].SLL_MinLook, SLL_k.toLong())
//            if (SLL_k > decisionInfo[decision].SLL_MaxLook) {
//                decisionInfo[decision].SLL_MaxLook = SLL_k.toLong()
//                decisionInfo[decision].SLL_MaxLookEvent = LookaheadEventInfo(decision, null, alt, input, _startIndex, _sllStopIndex, false)
//            }
//
//            if (_llStopIndex >= 0) {
//                val LL_k = _llStopIndex - _startIndex + 1
//                decisionInfo[decision].LL_TotalLook += LL_k.toLong()
//                decisionInfo[decision].LL_MinLook = if (decisionInfo[decision].LL_MinLook == 0L) LL_k else Math.min(decisionInfo[decision].LL_MinLook, LL_k.toLong())
//                if (LL_k > decisionInfo[decision].LL_MaxLook) {
//                    decisionInfo[decision].LL_MaxLook = LL_k.toLong()
//                    decisionInfo[decision].LL_MaxLookEvent = LookaheadEventInfo(decision, null, alt, input, _startIndex, _llStopIndex, true)
//                }
//            }
//
//            return alt
//        } finally {
//            this.currentDecision = -1
//        }
//    }
//
//    protected override fun getExistingTargetState(previousD: DFAState, t: Int): DFAState? {
//        // this method is called after each time the input position advances
//        // during SLL prediction
//        _sllStopIndex = _input.index()
//
//        val existingTargetState = super.getExistingTargetState(previousD, t)
//        if (existingTargetState != null) {
//            decisionInfo[currentDecision].SLL_DFATransitions++ // count only if we transition over a DFA state
//            if (existingTargetState === ATNSimulator.ERROR) {
//                decisionInfo[currentDecision].errors.add(
//                        ErrorInfo(currentDecision, previousD.configs, _input, _startIndex, _sllStopIndex, false)
//                )
//            }
//        }
//
//        currentState = existingTargetState
//        return existingTargetState
//    }
//
//    protected override fun computeTargetState(dfa: DFA, previousD: DFAState, t: Int): DFAState? {
//        val state = super.computeTargetState(dfa, previousD, t)
//        currentState = state
//        return state
//    }
//
//    protected override fun computeReachSet(closure: ATNConfigSet, t: Int, fullCtx: Boolean): ATNConfigSet? {
//        if (fullCtx) {
//            // this method is called after each time the input position advances
//            // during full context prediction
//            _llStopIndex = _input.index()
//        }
//
//        val reachConfigs = super.computeReachSet(closure, t, fullCtx)
//        if (fullCtx) {
//            decisionInfo[currentDecision].LL_ATNTransitions++ // count computation even if error
//            if (reachConfigs != null) {
//            } else { // no reach on current lookahead symbol. ERROR.
//                // TODO: does not handle delayed errors per getSynValidOrSemInvalidAltThatFinishedDecisionEntryRule()
//                decisionInfo[currentDecision].errors.add(
//                        ErrorInfo(currentDecision, closure, _input, _startIndex, _llStopIndex, true)
//                )
//            }
//        } else {
//            decisionInfo[currentDecision].SLL_ATNTransitions++
//            if (reachConfigs != null) {
//            } else { // no reach on current lookahead symbol. ERROR.
//                decisionInfo[currentDecision].errors.add(
//                        ErrorInfo(currentDecision, closure, _input, _startIndex, _sllStopIndex, false)
//                )
//            }
//        }
//        return reachConfigs
//    }
//
//    protected override fun evalSemanticContext(pred: SemanticContext?, parserCallStack: ParserRuleContext?, alt: Int, fullCtx: Boolean): Boolean {
//        val result = super.evalSemanticContext(pred, parserCallStack, alt, fullCtx)
//        if (pred !is SemanticContext.PrecedencePredicate) {
//            val fullContext = _llStopIndex >= 0
//            val stopIndex = if (fullContext) _llStopIndex else _sllStopIndex
//            decisionInfo[currentDecision].predicateEvals.add(
//                    PredicateEvalInfo(currentDecision, _input, _startIndex, stopIndex, pred, result, alt, fullCtx)
//            )
//        }
//
//        return result
//    }
//
//    protected override fun reportAttemptingFullContext(dfa: DFA, conflictingAlts: BitSet?, configs: ATNConfigSet, startIndex: Int, stopIndex: Int) {
//        if (conflictingAlts != null) {
//            conflictingAltResolvedBySLL = conflictingAlts.nextSetBit(0)
//        } else {
//            conflictingAltResolvedBySLL = configs.alts.nextSetBit(0)
//        }
//        decisionInfo[currentDecision].LL_Fallback++
//        super.reportAttemptingFullContext(dfa, conflictingAlts, configs, startIndex, stopIndex)
//    }
//
//    protected override fun reportContextSensitivity(dfa: DFA, prediction: Int, configs: ATNConfigSet, startIndex: Int, stopIndex: Int) {
//        if (prediction != conflictingAltResolvedBySLL) {
//            decisionInfo[currentDecision].contextSensitivities.add(
//                    ContextSensitivityInfo(currentDecision, configs, _input, startIndex, stopIndex)
//            )
//        }
//        super.reportContextSensitivity(dfa, prediction, configs, startIndex, stopIndex)
//    }
//
//    protected override fun reportAmbiguity(dfa: DFA, D: DFAState, startIndex: Int, stopIndex: Int, exact: Boolean,
//                                           ambigAlts: BitSet?, configs: ATNConfigSet) {
//        val prediction: Int
//        if (ambigAlts != null) {
//            prediction = ambigAlts.nextSetBit(0)
//        } else {
//            prediction = configs.alts.nextSetBit(0)
//        }
//        if (configs.fullCtx && prediction != conflictingAltResolvedBySLL) {
//            // Even though this is an ambiguity we are reporting, we can
//            // still detect some context sensitivities.  Both SLL and LL
//            // are showing a conflict, hence an ambiguity, but if they resolve
//            // to different minimum alternatives we have also identified a
//            // context sensitivity.
//            decisionInfo[currentDecision].contextSensitivities.add(
//                    ContextSensitivityInfo(currentDecision, configs, _input, startIndex, stopIndex)
//            )
//        }
//        decisionInfo[currentDecision].ambiguities.add(
//                AmbiguityInfo(currentDecision, configs, ambigAlts,
//                        _input, startIndex, stopIndex, configs.fullCtx)
//        )
//        super.reportAmbiguity(dfa, D, startIndex, stopIndex, exact, ambigAlts, configs)
//    }
}
