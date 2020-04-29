/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.BitSet
import com.strumenta.kotlinmultiplatform.assert
import com.strumenta.kotlinmultiplatform.errMessage
import com.strumenta.kotlinmultiplatform.outMessage
import com.strumenta.kotlinmultiplatform.synchronized
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.dfa.DFAState
import org.antlr.v4.kotlinruntime.misc.DoubleKeyMap
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.misc.IntervalSet


///**
// * The embodiment of the adaptive LL(*), ALL(*), parsing strategy.
// *
// *
// *
// * The basic complexity of the adaptive strategy makes it harder to understand.
// * We begin with ATN simulation to build paths in a DFA. Subsequent prediction
// * requests go through the DFA first. If they reach a state without an edge for
// * the current symbol, the algorithm fails over to the ATN simulation to
// * complete the DFA path for the current input (until it finds a conflict state
// * or uniquely predicting state).
// *
// *
// *
// * All of that is done without using the outer context because we want to create
// * a DFA that is not dependent upon the rule invocation stack when we do a
// * prediction. One DFA works in all contexts. We avoid using context not
// * necessarily because it's slower, although it can be, but because of the DFA
// * caching problem. The closure routine only considers the rule invocation stack
// * created during prediction beginning in the decision rule. For example, if
// * prediction occurs without invoking another rule's ATN, there are no context
// * stacks in the configurations. When lack of context leads to a conflict, we
// * don't know if it's an ambiguity or a weakness in the strong LL(*) parsing
// * strategy (versus full LL(*)).
// *
// *
// *
// * When SLL yields a configuration set with conflict, we rewind the input and
// * retry the ATN simulation, this time using full outer context without adding
// * to the DFA. Configuration context stacks will be the full invocation stacks
// * from the start rule. If we get a conflict using full context, then we can
// * definitively say we have a true ambiguity for that input sequence. If we
// * don't get a conflict, it implies that the decision is sensitive to the outer
// * context. (It is not context-sensitive in the sense of context-sensitive
// * grammars.)
// *
// *
// *
// * The next time we reach this DFA state with an SLL conflict, through DFA
// * simulation, we will again retry the ATN simulation using full context mode.
// * This is slow because we can't save the results and have to "interpret" the
// * ATN each time we get that input.
// *
// *
// *
// * **CACHING FULL CONTEXT PREDICTIONS**
// *
// *
// *
// * We could cache results from full context to predicted alternative easily and
// * that saves a lot of time but doesn't work in presence of predicates. The set
// * of visible predicates from the ATN start state changes depending on the
// * context, because closure can fall off the end of a rule. I tried to cache
// * tuples (stack context, semantic context, predicted alt) but it was slower
// * than interpreting and much more complicated. Also required a huge amount of
// * memory. The goal is not to create the world's fastest parser anyway. I'd like
// * to keep this algorithm simple. By launching multiple threads, we can improve
// * the speed of parsing across a large number of files.
// *
// *
// *
// * There is no strict ordering between the amount of input used by SLL vs LL,
// * which makes it really hard to build a cache for full context. Let's say that
// * we have input A B C that leads to an SLL conflict with full context X. That
// * implies that using X we might only use A B but we could also use A B C D to
// * resolve conflict. Input A B C D could predict alternative 1 in one position
// * in the input and A B C E could predict alternative 2 in another position in
// * input. The conflicting SLL configurations could still be non-unique in the
// * full context prediction, which would lead us to requiring more input than the
// * original A B C.	To make a	prediction cache work, we have to track	the exact
// * input	used during the previous prediction. That amounts to a cache that maps
// * X to a specific DFA for that context.
// *
// *
// *
// * Something should be done for left-recursive expression predictions. They are
// * likely LL(1) + pred eval. Easier to do the whole SLL unless error and retry
// * with full LL thing Sam does.
// *
// *
// *
// * **AVOIDING FULL CONTEXT PREDICTION**
// *
// *
// *
// * We avoid doing full context retry when the outer context is empty, we did not
// * dip into the outer context by falling off the end of the decision state rule,
// * or when we force SLL mode.
// *
// *
// *
// * As an example of the not dip into outer context case, consider as super
// * constructor calls versus function calls. One grammar might look like
// * this:
// *
// * <pre>
// * ctorBody
// * : '{' superCall? stat* '}'
// * ;
//</pre> *
// *
// *
// *
// * Or, you might see something like
// *
// * <pre>
// * stat
// * : superCall ';'
// * | expression ';'
// * | ...
// * ;
//</pre> *
// *
// *
// *
// * In both cases I believe that no closure operations will dip into the outer
// * context. In the first case ctorBody in the worst case will stop at the '}'.
// * In the 2nd case it should stop at the ';'. Both cases should stay within the
// * entry rule and not dip into the outer context.
// *
// *
// *
// * **PREDICATES**
// *
// *
// *
// * Predicates are always evaluated if present in either SLL or LL both. SLL and
// * LL simulation deals with predicates differently. SLL collects predicates as
// * it performs closure operations like ANTLR v3 did. It delays predicate
// * evaluation until it reaches and accept state. This allows us to cache the SLL
// * ATN simulation whereas, if we had evaluated predicates on-the-fly during
// * closure, the DFA state configuration sets would be different and we couldn't
// * build up a suitable DFA.
// *
// *
// *
// * When building a DFA accept state during ATN simulation, we evaluate any
// * predicates and return the sole semantically valid alternative. If there is
// * more than 1 alternative, we report an ambiguity. If there are 0 alternatives,
// * we throw an exception. Alternatives without predicates act like they have
// * true predicates. The simple way to think about it is to strip away all
// * alternatives with false predicates and choose the minimum alternative that
// * remains.
// *
// *
// *
// * When we start in the DFA and reach an accept state that's predicated, we test
// * those and return the minimum semantically viable alternative. If no
// * alternatives are viable, we throw an exception.
// *
// *
// *
// * During full LL ATN simulation, closure always evaluates predicates and
// * on-the-fly. This is crucial to reducing the configuration set size during
// * closure. It hits a landmine when parsing with the Java grammar, for example,
// * without this on-the-fly evaluation.
// *
// *
// *
// * **SHARING DFA**
// *
// *
// *
// * All instances of the same parser share the same decision DFAs through a
// * static field. Each instance gets its own ATN simulator but they share the
// * same [.decisionToDFA] field. They also share a
// * [PredictionContextCache] object that makes sure that all
// * [PredictionContext] objects are shared among the DFA states. This makes
// * a big size difference.
// *
// *
// *
// * **THREAD SAFETY**
// *
// *
// *
// * The [ParserATNSimulator] locks on the [.decisionToDFA] field when
// * it adds a new DFA object to that array. [.addDFAEdge]
// * locks on the DFA for the current decision when setting the
// * [DFAState.edges] field. [.addDFAState] locks on
// * the DFA for the current decision when looking up a DFA state to see if it
// * already exists. We must make sure that all requests to add DFA states that
// * are equivalent result in the same shared DFA object. This is because lots of
// * threads will be trying to update the DFA at once. The
// * [.addDFAState] method also locks inside the DFA lock
// * but this time on the shared context cache when it rebuilds the
// * configurations' [PredictionContext] objects using cached
// * subgraphs/nodes. No other locking occurs, even during DFA simulation. This is
// * safe as long as we can guarantee that all threads referencing
// * `s.edge[t]` get the same physical target [DFAState], or
// * `null`. Once into the DFA, the DFA simulation does not reference the
// * [DFA.states] map. It follows the [DFAState.edges] field to new
// * targets. The DFA simulator will either find [DFAState.edges] to be
// * `null`, to be non-`null` and `dfa.edges[t]` null, or
// * `dfa.edges[t]` to be non-null. The
// * [.addDFAEdge] method could be racing to set the field
// * but in either case the DFA simulator works; if `null`, and requests ATN
// * simulation. It could also race trying to get `dfa.edges[t]`, but either
// * way it will work because it's not doing a test and set operation.
// *
// *
// *
// * **Starting with SLL then failing to combined SLL/LL (Two-Stage
// * Parsing)**
// *
// *
// *
// * Sam pointed out that if SLL does not give a syntax error, then there is no
// * point in doing full LL, which is slower. We only have to try LL if we get a
// * syntax error. For maximum speed, Sam starts the parser set to pure SLL
// * mode with the [BailErrorStrategy]:
// *
// * <pre>
// * parser.[getInterpreter()][Parser.getInterpreter].[setPredictionMode][.setPredictionMode]`(`[PredictionMode.SLL]`)`;
// * parser.[setErrorHandler][Parser.setErrorHandler](new [BailErrorStrategy]());
//</pre> *
// *
// *
// *
// * If it does not get a syntax error, then we're done. If it does get a syntax
// * error, we need to retry with the combined SLL/LL strategy.
// *
// *
// *
// * The reason this works is as follows. If there are no SLL conflicts, then the
// * grammar is SLL (at least for that input set). If there is an SLL conflict,
// * the full LL analysis must yield a set of viable alternatives which is a
// * subset of the alternatives reported by SLL. If the LL set is a singleton,
// * then the grammar is LL but not SLL. If the LL set is the same size as the SLL
// * set, the decision is SLL. If the LL set has size &gt; 1, then that decision
// * is truly ambiguous on the current input. If the LL set is smaller, then the
// * SLL conflict resolution might choose an alternative that the full LL would
// * rule out as a possibility based upon better context information. If that's
// * the case, then the SLL parse will definitely get an error because the full LL
// * analysis says it's not viable. If SLL conflict resolution chooses an
// * alternative within the LL set, them both SLL and LL would choose the same
// * alternative because they both choose the minimum of multiple conflicting
// * alternatives.
// *
// *
// *
// * Let's say we have a set of SLL conflicting alternatives `{1, 2, 3}` and
// * a smaller LL set called *s*. If *s* is `{2, 3}`, then SLL
// * parsing will get an error because SLL will pursue alternative 1. If
// * *s* is `{1, 2}` or `{1, 3}` then both SLL and LL will
// * choose the same alternative because alternative one is the minimum of either
// * set. If *s* is `{2}` or `{3}` then SLL will get a syntax
// * error. If *s* is `{1}` then SLL will succeed.
// *
// *
// *
// * Of course, if the input is invalid, then we will get an error for sure in
// * both SLL and LL parsing. Erroneous input will therefore require 2 passes over
// * the input.
// */
open class ParserATNSimulator(
        /**
         * @since 4.3
         */
        val parser: Parser?, atn: ATN,
        val decisionToDFA: Array<DFA>,
        sharedContextCache: PredictionContextCache)//		DOTGenerator dot = new DOTGenerator(null);
//		System.out.println(dot.getDOT(atn.rules.get(0), parser.getRuleNames()));
//		System.out.println(dot.getDOT(atn.rules.get(1), parser.getRuleNames()));
    : ATNSimulator(atn, sharedContextCache) {
    override fun reset() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //
    /** SLL, LL, or LL + exact ambig detection?  */

    var predictionMode = PredictionMode.LL

    /** Each prediction operation uses a cache for merge of prediction contexts.
     * Don't keep around as it wastes huge amounts of memory. DoubleKeyMap
     * isn't synchronized but we're ok since two threads shouldn't reuse same
     * parser/atnsim object because it can only handle one input at a time.
     * This maps graphs a and b to merged result c. (a,b)c. We can avoid
     * the merge if we ever see a and b again.  Note that (b,a)c should
     * also be examined during cache lookup.
     */
    protected var mergeCache: DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>? = null

    // LAME globals to avoid parameters!!!!! I need these down deep in predTransition
    protected var _input: TokenStream? = null
    protected var _startIndex: Int = 0
    protected var _outerContext: ParserRuleContext? = null
    protected var _dfa: DFA? = null

    /** Testing only!  */
    constructor(atn: ATN, decisionToDFA: Array<DFA>,
                sharedContextCache: PredictionContextCache) : this(null, atn, decisionToDFA, sharedContextCache) {
    }

    //override fun reset() {}

    override fun clearDFA() {
        for (d in decisionToDFA.indices) {
            decisionToDFA[d] = DFA(atn.getDecisionState(d)!!, d)
        }
    }

    open fun adaptivePredict(input: TokenStream, decision: Int,
                             outerContext: ParserRuleContext?): Int {
        var outerContext = outerContext
        if (debug || debug_list_atn_decisions) {
            println("adaptivePredict decision " + decision +
                    " exec LA(1)==" + getLookaheadName(input) +
                    " line " + input.LT(1)!!.line + ":" + input.LT(1)!!.charPositionInLine)
        }

        _input = input
        _startIndex = input.index()
        _outerContext = outerContext
        val dfa = decisionToDFA[decision]
        _dfa = dfa

        val m = input.mark()
        val index = _startIndex

        // Now we are certain to have a specific decision's DFA
        // But, do we still need an initial state?
        try {
            var s0: DFAState?
            if (dfa.isPrecedenceDfa) {
                // the start state for a precedence DFA depends on the current
                // parser precedence, and is provided by a DFA method.
                s0 = dfa.getPrecedenceStartState(parser!!.precedence)
            } else {
                // the start state for a "regular" DFA is just s0
                s0 = dfa.s0
            }

            if (s0 == null) {
                if (outerContext == null) outerContext = EMPTY_RULECTX
                if (debug || debug_list_atn_decisions) {
                    outMessage("predictATN decision " + dfa.decision +
                            " exec LA(1)==" + getLookaheadName(input) +
                            ", outerContext=" + outerContext!!.toString(parser))
                }

                val fullCtx = false
                var s0_closure = computeStartState(dfa.atnStartState,
                        EMPTY_RULECTX,
                        fullCtx)

                if (dfa.isPrecedenceDfa) {
                    /* If this is a precedence DFA, we use applyPrecedenceFilter
					 * to convert the computed start state to a precedence start
					 * state. We then use DFA.setPrecedenceStartState to set the
					 * appropriate start state for the precedence level rather
					 * than simply setting DFA.s0.
					 */
                    dfa.s0!!.configs = s0_closure // not used for prediction but useful to know start configs anyway
                    s0_closure = applyPrecedenceFilter(s0_closure)
                    s0 = addDFAState(dfa, DFAState(s0_closure))
                    dfa.setPrecedenceStartState(parser!!.precedence, s0)
                } else {
                    s0 = addDFAState(dfa, DFAState(s0_closure))
                    dfa.s0 = s0
                }
            }

            val alt = execATN(dfa, s0, input, index, outerContext!!)
            if (debug) outMessage("DFA after predictATN: " + dfa.toString(parser!!.vocabulary))
            return alt
        } finally {
            mergeCache = null // wack cache after each prediction
            _dfa = null
            input.seek(index)
            input.release(m)
        }
    }

    /** Performs ATN simulation to compute a predicted alternative based
     * upon the remaining input, but also updates the DFA cache to avoid
     * having to traverse the ATN again for the same input sequence.
     *
     * There are some key conditions we're looking for after computing a new
     * set of ATN configs (proposed DFA state):
     * if the set is empty, there is no viable alternative for current symbol
     * does the state uniquely predict an alternative?
     * does the state have a conflict that would prevent us from
     * putting it on the work list?
     *
     * We also have some key operations to do:
     * add an edge from previous DFA state to potentially new DFA state, D,
     * upon current symbol but only if adding to work list, which means in all
     * cases except no viable alternative (and possibly non-greedy decisions?)
     * collecting predicates and adding semantic context to DFA accept states
     * adding rule context to context-sensitive DFA accept states
     * consuming an input symbol
     * reporting a conflict
     * reporting an ambiguity
     * reporting a context sensitivity
     * reporting insufficient predicates
     *
     * cover these cases:
     * dead end
     * single alt
     * single alt + preds
     * conflict
     * conflict + preds
     */
    protected fun execATN(dfa: DFA, s0: DFAState,
                          input: TokenStream, startIndex: Int,
                          outerContext: ParserRuleContext): Int {
        if (debug || debug_list_atn_decisions) {
            outMessage("execATN decision " + dfa.decision +
                    " exec LA(1)==" + getLookaheadName(input) +
                    " line " + input.LT(1)!!.line + ":" + input.LT(1)!!.charPositionInLine)
        }

        var previousD = s0

        if (debug) println("s0 = " + s0)

        var t = input.LA(1)

        while (true) { // while more work
            var D = getExistingTargetState(previousD, t)
            if (D == null) {
                D = computeTargetState(dfa, previousD, t)
            }

            if (D === ATNSimulator.ERROR) {
                // if any configs in previous dipped into outer context, that
                // means that input up to t actually finished entry rule
                // at least for SLL decision. Full LL doesn't dip into outer
                // so don't need special case.
                // We will get an error no matter what so delay until after
                // decision; better error message. Also, no reachable target
                // ATN states in SLL implies LL will also get nowhere.
                // If conflict in states that dip out, choose min since we
                // will get error no matter what.
                val e = noViableAlt(input, outerContext, previousD.configs!!, startIndex)
                input.seek(startIndex)
                val alt = getSynValidOrSemInvalidAltThatFinishedDecisionEntryRule(previousD.configs!!, outerContext)
                if (alt != ATN.INVALID_ALT_NUMBER) {
                    return alt
                }
                throw e
            }

            if (D!!.requiresFullContext && predictionMode != PredictionMode.SLL) {
                // IF PREDS, MIGHT RESOLVE TO SINGLE ALT => SLL (or syntax error)
                var conflictingAlts = D!!.configs!!.conflictingAlts
                if (D!!.predicates != null) {
                    if (debug) println("DFA state has preds in DFA sim LL failover")
                    val conflictIndex = input.index()
                    if (conflictIndex != startIndex) {
                        input.seek(startIndex)
                    }

                    conflictingAlts = evalSemanticContext(D!!.predicates!!, outerContext, true)
                    if (conflictingAlts.cardinality() == 1) {
                        if (debug) println("Full LL avoided")
                        return conflictingAlts.nextSetBit(0)
                    }

                    if (conflictIndex != startIndex) {
                        // restore the index so reporting the fallback to full
                        // context occurs with the index at the correct spot
                        input.seek(conflictIndex)
                    }
                }

                if (dfa_debug) println("ctx sensitive state $outerContext in $D")
                val fullCtx = true
                val s0_closure = computeStartState(dfa.atnStartState, outerContext,
                        fullCtx)
                reportAttemptingFullContext(dfa, conflictingAlts!!, D!!.configs!!, startIndex, input.index())
                return execATNWithFullContext(dfa, D, s0_closure,
                        input, startIndex,
                        outerContext)
            }

            if (D!!.isAcceptState) {
                if (D!!.predicates == null) {
                    return D!!.prediction
                }

                val stopIndex = input.index()
                input.seek(startIndex)
                val alts = evalSemanticContext(D!!.predicates!!, outerContext, true)
                when (alts.cardinality()) {
                    0 -> throw noViableAlt(input, outerContext, D!!.configs!!, startIndex)

                    1 -> return alts.nextSetBit(0)

                    else -> {
                        // report ambiguity after predicate evaluation to make sure the correct
                        // set of ambig alts is reported.
                        reportAmbiguity(dfa, D, startIndex, stopIndex, false, alts, D!!.configs!!)
                        return alts.nextSetBit(0)
                    }
                }
            }

            previousD = D

            if (t != IntStream.EOF) {
                input.consume()
                t = input.LA(1)
            }
        }
    }

    /**
     * Get an existing target state for an edge in the DFA. If the target state
     * for the edge has not yet been computed or is otherwise not available,
     * this method returns `null`.
     *
     * @param previousD The current DFA state
     * @param t The next input symbol
     * @return The existing target DFA state for the given input symbol
     * `t`, or `null` if the target state for this edge is not
     * already cached
     */
    open fun getExistingTargetState(previousD: DFAState, t: Int): DFAState? {
        val edges = previousD.edges
        return if (edges == null || t + 1 < 0 || t + 1 >= edges!!.size) {
            null
        } else edges!![t + 1]

    }

    /**
     * Compute a target state for an edge in the DFA, and attempt to add the
     * computed state and corresponding edge to the DFA.
     *
     * @param dfa The DFA
     * @param previousD The current DFA state
     * @param t The next input symbol
     *
     * @return The computed target DFA state for the given input symbol
     * `t`. If `t` does not lead to a valid DFA state, this method
     * returns [.ERROR].
     */
    open fun computeTargetState(dfa: DFA, previousD: DFAState, t: Int): DFAState? {
        val reach = computeReachSet(previousD.configs!!, t, false)
        if (reach == null) {
            addDFAEdge(dfa, previousD, t, ATNSimulator.ERROR)
            return ATNSimulator.ERROR
        }

        // create new target state; we'll add to DFA after it's complete
        var D: DFAState? = DFAState(reach)

        val predictedAlt = getUniqueAlt(reach!!)

        if (debug) {
            val altSubSets = PredictionMode.getConflictingAltSubsets(reach!!)
            println("SLL altSubSets=" + altSubSets +
                    ", configs=" + reach +
                    ", predict=" + predictedAlt + ", allSubsetsConflict=" +
                    PredictionMode.allSubsetsConflict(altSubSets) + ", conflictingAlts=" +
                    getConflictingAlts(reach))
        }

        if (predictedAlt != ATN.INVALID_ALT_NUMBER) {
            // NO CONFLICT, UNIQUELY PREDICTED ALT
            D!!.isAcceptState = true
            D!!.configs!!.uniqueAlt = predictedAlt
            D!!.prediction = predictedAlt
        } else if (PredictionMode.hasSLLConflictTerminatingPrediction(predictionMode, reach)) {
            // MORE THAN ONE VIABLE ALTERNATIVE
            D!!.configs!!.conflictingAlts = getConflictingAlts(reach)
            D!!.requiresFullContext = true
            // in SLL-only mode, we will stop at this state and return the minimum alt
            D!!.isAcceptState = true
            D!!.prediction = D!!.configs!!.conflictingAlts!!.nextSetBit(0)
        }

        if (D!!.isAcceptState && D!!.configs!!.hasSemanticContext) {
            predicateDFAState(D, atn.getDecisionState(dfa.decision))
            if (D!!.predicates != null) {
                D!!.prediction = ATN.INVALID_ALT_NUMBER
            }
        }

        // all adds to dfa are done after we've created full D state
        D = addDFAEdge(dfa, previousD, t, D)
        return D
    }

    protected fun predicateDFAState(dfaState: DFAState, decisionState: DecisionState?) {
        // We need to test all predicates, even in DFA states that
        // uniquely predict alternative.
        val nalts = decisionState!!.numberOfTransitions
        // Update DFA so reach becomes accept state with (predicate,alt)
        // pairs if preds found for conflicting alts
        val altsToCollectPredsFrom = getConflictingAltsOrUniqueAlt(dfaState.configs!!)
        val altToPred = getPredsForAmbigAlts(altsToCollectPredsFrom, dfaState.configs!!, nalts)
        if (altToPred != null) {
            dfaState.predicates = getPredicatePredictions(altsToCollectPredsFrom, altToPred)
            dfaState.prediction = ATN.INVALID_ALT_NUMBER // make sure we use preds
        } else {
            // There are preds in configs but they might go away
            // when OR'd together like {p}? || NONE == NONE. If neither
            // alt has preds, resolve to min alt
            dfaState.prediction = altsToCollectPredsFrom.nextSetBit(0)
        }
    }

    // comes back with reach.uniqueAlt set to a valid alt
    protected fun execATNWithFullContext(dfa: DFA,
                                         D: DFAState, // how far we got in SLL DFA before failing over
                                         s0: ATNConfigSet,
                                         input: TokenStream, startIndex: Int,
                                         outerContext: ParserRuleContext): Int {
        if (debug || debug_list_atn_decisions) {
            println("execATNWithFullContext " + s0)
        }
        val fullCtx = true
        var foundExactAmbig = false
        var reach: ATNConfigSet? = null
        var previous = s0
        input.seek(startIndex)
        var t = input.LA(1)
        var predictedAlt: Int
        while (true) { // while more work
            //			System.out.println("LL REACH "+getLookaheadName(input)+
            //							   " from configs.size="+previous.size()+
            //							   " line "+input.LT(1).getLine()+":"+input.LT(1).getCharPositionInLine());
            reach = computeReachSet(previous, t, fullCtx)
            if (reach == null) {
                // if any configs in previous dipped into outer context, that
                // means that input up to t actually finished entry rule
                // at least for LL decision. Full LL doesn't dip into outer
                // so don't need special case.
                // We will get an error no matter what so delay until after
                // decision; better error message. Also, no reachable target
                // ATN states in SLL implies LL will also get nowhere.
                // If conflict in states that dip out, choose min since we
                // will get error no matter what.
                val e = noViableAlt(input, outerContext, previous, startIndex)
                input.seek(startIndex)
                val alt = getSynValidOrSemInvalidAltThatFinishedDecisionEntryRule(previous, outerContext)
                if (alt != ATN.INVALID_ALT_NUMBER) {
                    return alt
                }
                throw e
            }

            val altSubSets = PredictionMode.getConflictingAltSubsets(reach!!)
            if (debug) {
                println("LL altSubSets=" + altSubSets +
                        ", predict=" + PredictionMode.getUniqueAlt(altSubSets) +
                        ", resolvesToJustOneViableAlt=" +
                        PredictionMode.resolvesToJustOneViableAlt(altSubSets))
            }

            //			System.out.println("altSubSets: "+altSubSets);
            //			System.err.println("reach="+reach+", "+reach.conflictingAlts);
            reach!!.uniqueAlt = getUniqueAlt(reach!!)
            // unique prediction?
            if (reach!!.uniqueAlt != ATN.INVALID_ALT_NUMBER) {
                predictedAlt = reach!!.uniqueAlt
                break
            }
            if (predictionMode != PredictionMode.LL_EXACT_AMBIG_DETECTION) {
                predictedAlt = PredictionMode.resolvesToJustOneViableAlt(altSubSets)
                if (predictedAlt != ATN.INVALID_ALT_NUMBER) {
                    break
                }
            } else {
                // In exact ambiguity mode, we never try to terminate early.
                // Just keeps scarfing until we know what the conflict is
                if (PredictionMode.allSubsetsConflict(altSubSets) && PredictionMode.allSubsetsEqual(altSubSets)) {
                    foundExactAmbig = true
                    predictedAlt = PredictionMode.getSingleViableAlt(altSubSets)
                    break
                }
                // else there are multiple non-conflicting subsets or
                // we're not sure what the ambiguity is yet.
                // So, keep going.
            }

            previous = reach
            if (t != IntStream.EOF) {
                input.consume()
                t = input.LA(1)
            }
        }

        // If the configuration set uniquely predicts an alternative,
        // without conflict, then we know that it's a full LL decision
        // not SLL.
        if (reach!!.uniqueAlt != ATN.INVALID_ALT_NUMBER) {
            reportContextSensitivity(dfa, predictedAlt, reach, startIndex, input.index())
            return predictedAlt
        }

        // We do not check predicates here because we have checked them
        // on-the-fly when doing full context prediction.

        /*
		In non-exact ambiguity detection mode, we might	actually be able to
		detect an exact ambiguity, but I'm not going to spend the cycles
		needed to check. We only emit ambiguity warnings in exact ambiguity
		mode.

		For example, we might know that we have conflicting configurations.
		But, that does not mean that there is no way forward without a
		conflict. It's possible to have nonconflicting alt subsets as in:

		   LL altSubSets=[{1, 2}, {1, 2}, {1}, {1, 2}]

		from

		   [(17,1,[5 $]), (13,1,[5 10 $]), (21,1,[5 10 $]), (11,1,[$]),
			(13,2,[5 10 $]), (21,2,[5 10 $]), (11,2,[$])]

		In this case, (17,1,[5 $]) indicates there is some next sequence that
		would resolve this without conflict to alternative 1. Any other viable
		next sequence, however, is associated with a conflict.  We stop
		looking for input because no amount of further lookahead will alter
		the fact that we should predict alternative 1.  We just can't say for
		sure that there is an ambiguity without looking further.
		*/
        reportAmbiguity(dfa, D, startIndex, input.index(), foundExactAmbig,
                reach!!.alts, reach)

        return predictedAlt
    }

    protected open fun computeReachSet(closure: ATNConfigSet, t: Int,
                                       fullCtx: Boolean): ATNConfigSet? {
        if (debug)
            println("in computeReachSet, starting closure: " + closure)

        if (mergeCache == null) {
            mergeCache = DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext>()
        }

        val intermediate = ATNConfigSet(fullCtx)

        /* Configurations already in a rule stop state indicate reaching the end
		 * of the decision rule (local context) or end of the start rule (full
		 * context). Once reached, these configurations are never updated by a
		 * closure operation, so they are handled separately for the performance
		 * advantage of having a smaller intermediate set when calling closure.
		 *
		 * For full-context reach operations, separate handling is required to
		 * ensure that the alternative matching the longest overall sequence is
		 * chosen when multiple such configurations can match the input.
		 */
        var skippedStopStates: MutableList<ATNConfig>? = null

        // First figure out where we can reach on input t
        for (c in closure) {
            if (debug) println("testing " + getTokenName(t) + " at " + c.toString())

            if (c.state is RuleStopState) {
                assert(c.context!!.isEmpty)
                if (fullCtx || t == IntStream.EOF) {
                    if (skippedStopStates == null) {
                        skippedStopStates = ArrayList<ATNConfig>()
                    }

                    skippedStopStates.add(c)
                }

                continue
            }

            val n = c.state.numberOfTransitions
            for (ti in 0 until n) {               // for each transition
                val trans = c.state.transition(ti)
                val target = getReachableTarget(trans, t)
                if (target != null) {
                    intermediate.add(ATNConfig(c, target), mergeCache)
                }
            }
        }

        // Now figure out where the reach operation can take us...

        var reach: ATNConfigSet? = null

        /* This block optimizes the reach operation for intermediate sets which
		 * trivially indicate a termination state for the overall
		 * adaptivePredict operation.
		 *
		 * The conditions assume that intermediate
		 * contains all configurations relevant to the reach set, but this
		 * condition is not true when one or more configurations have been
		 * withheld in skippedStopStates, or when the current symbol is EOF.
		 */
        if (skippedStopStates == null && t != Token.EOF) {
            if (intermediate.size == 1) {
                // Don't pursue the closure if there is just one state.
                // It can only have one alternative; just add to result
                // Also don't pursue the closure if there is unique alternative
                // among the configurations.
                reach = intermediate
            } else if (getUniqueAlt(intermediate) != ATN.INVALID_ALT_NUMBER) {
                // Also don't pursue the closure if there is unique alternative
                // among the configurations.
                reach = intermediate
            }
        }

        /* If the reach set could not be trivially determined, perform a closure
		 * operation on the intermediate set to compute its initial value.
		 */
        if (reach == null) {
            reach = ATNConfigSet(fullCtx)
            val closureBusy = HashSet<ATNConfig>()
            val treatEofAsEpsilon = t == Token.EOF
            for (c in intermediate) {
                closure(c, reach, closureBusy, false, fullCtx, treatEofAsEpsilon)
            }
        }

        if (t == IntStream.EOF) {
            /* After consuming EOF no additional input is possible, so we are
			 * only interested in configurations which reached the end of the
			 * decision rule (local context) or end of the start rule (full
			 * context). Update reach to contain only these configurations. This
			 * handles both explicit EOF transitions in the grammar and implicit
			 * EOF transitions following the end of the decision or start rule.
			 *
			 * When reach==intermediate, no closure operation was performed. In
			 * this case, removeAllConfigsNotInRuleStopState needs to check for
			 * reachable rule stop states as well as configurations already in
			 * a rule stop state.
			 *
			 * This is handled before the configurations in skippedStopStates,
			 * because any configurations potentially added from that list are
			 * already guaranteed to meet this condition whether or not it's
			 * required.
			 */
            reach = removeAllConfigsNotInRuleStopState(reach, reach === intermediate)
        }

        /* If skippedStopStates is not null, then it contains at least one
		 * configuration. For full-context reach operations, these
		 * configurations reached the end of the start rule, in which case we
		 * only add them back to reach if no configuration during the current
		 * closure operation reached such a state. This ensures adaptivePredict
		 * chooses an alternative matching the longest overall sequence when
		 * multiple alternatives are viable.
		 */
        if (skippedStopStates != null && (!fullCtx || !PredictionMode.hasConfigInRuleStopState(reach!!))) {
            assert(!skippedStopStates.isEmpty())
            for (c in skippedStopStates) {
                reach!!.add(c, mergeCache)
            }
        }

        return if (reach!!.isEmpty()) null else reach
    }

    /**
     * Return a configuration set containing only the configurations from
     * `configs` which are in a [RuleStopState]. If all
     * configurations in `configs` are already in a rule stop state, this
     * method simply returns `configs`.
     *
     *
     * When `lookToEndOfRule` is true, this method uses
     * [ATN.nextTokens] for each configuration in `configs` which is
     * not already in a rule stop state to see if a rule stop state is reachable
     * from the configuration via epsilon-only transitions.
     *
     * @param configs the configuration set to update
     * @param lookToEndOfRule when true, this method checks for rule stop states
     * reachable by epsilon-only transitions from each configuration in
     * `configs`.
     *
     * @return `configs` if all configurations in `configs` are in a
     * rule stop state, otherwise return a new configuration set containing only
     * the configurations from `configs` which are in a rule stop state
     */
    protected fun removeAllConfigsNotInRuleStopState(configs: ATNConfigSet, lookToEndOfRule: Boolean): ATNConfigSet {
        if (PredictionMode.allConfigsInRuleStopStates(configs)) {
            return configs
        }

        val result = ATNConfigSet(configs.fullCtx)
        for (config in configs) {
            if (config.state is RuleStopState) {
                result.add(config, mergeCache)
                continue
            }

            if (lookToEndOfRule && config.state.onlyHasEpsilonTransitions()) {
                val nextTokens = atn.nextTokens(config.state)
                if (nextTokens!!.contains(Token.EPSILON)) {
                    val endOfRuleState = atn.ruleToStopState!![config.state.ruleIndex]
                    result.add(ATNConfig(config, endOfRuleState!!), mergeCache)
                }
            }
        }

        return result
    }


    protected fun computeStartState(p: ATNState,
                                    ctx: RuleContext,
                                    fullCtx: Boolean): ATNConfigSet {
        // always at least the implicit call to start rule
        val initialContext = PredictionContext.fromRuleContext(atn, ctx)
        val configs = ATNConfigSet(fullCtx)

        for (i in 0 until p.numberOfTransitions) {
            val target = p.transition(i).target
            val c = ATNConfig(target!!, i + 1, initialContext)
            val closureBusy = HashSet<ATNConfig>()
            closure(c, configs, closureBusy, true, fullCtx, false)
        }

        return configs
    }

    /* parrt internal source braindump that doesn't mess up
	 * external API spec.
		context-sensitive in that they can only be properly evaluated
		in the context of the proper prec argument. Without pruning,
		these predicates are normal predicates evaluated when we reach
		conflict state (or unique prediction). As we cannot evaluate
		these predicates out of context, the resulting conflict leads
		to full LL evaluation and nonlinear prediction which shows up
		very clearly with fairly large expressions.

		Example grammar:

		e : e '*' e
		  | e '+' e
		  | INT
		  ;

		We convert that to the following:

		e[int prec]
			:   INT
				( {3>=prec}? '*' e[4]
				| {2>=prec}? '+' e[3]
				)*
			;

		The (..)* loop has a decision for the inner block as well as
		an enter or exit decision, which is what concerns us here. At
		the 1st + of input 1+2+3, the loop entry sees both predicates
		and the loop exit also sees both predicates by falling off the
		edge of e.  This is because we have no stack information with
		SLL and find the follow of e, which will hit the return states
		inside the loop after e[4] and e[3], which brings it back to
		the enter or exit decision. In this case, we know that we
		cannot evaluate those predicates because we have fallen off
		the edge of the stack and will in general not know which prec
		parameter is the right one to use in the predicate.

		Because we have special information, that these are precedence
		predicates, we can resolve them without failing over to full
		LL despite their context sensitive nature. We make an
		assumption that prec[-1] <= prec[0], meaning that the current
		precedence level is greater than or equal to the precedence
		level of recursive invocations above us in the stack. For
		example, if predicate {3>=prec}? is true of the current prec,
		then one option is to enter the loop to match it now. The
		other option is to exit the loop and the left recursive rule
		to match the current operator in rule invocation further up
		the stack. But, we know that all of those prec are lower or
		the same value and so we can decide to enter the loop instead
		of matching it later. That means we can strip out the other
		configuration for the exit branch.

		So imagine we have (14,1,$,{2>=prec}?) and then
		(14,2,$-dipsIntoOuterContext,{2>=prec}?). The optimization
		allows us to collapse these two configurations. We know that
		if {2>=prec}? is true for the current prec parameter, it will
		also be true for any prec from an invoking e call, indicated
		by dipsIntoOuterContext. As the predicates are both true, we
		have the option to evaluate them early in the decision start
		state. We do this by stripping both predicates and choosing to
		enter the loop as it is consistent with the notion of operator
		precedence. It's also how the full LL conflict resolution
		would work.

		The solution requires a different DFA start state for each
		precedence level.

		The basic filter mechanism is to remove configurations of the
		form (p, 2, pi) if (p, 1, pi) exists for the same p and pi. In
		other words, for the same ATN state and predicate context,
		remove any configuration associated with an exit branch if
		there is a configuration associated with the enter branch.

		It's also the case that the filter evaluates precedence
		predicates and resolves conflicts according to precedence
		levels. For example, for input 1+2+3 at the first +, we see
		prediction filtering

		[(11,1,[$],{3>=prec}?), (14,1,[$],{2>=prec}?), (5,2,[$],up=1),
		 (11,2,[$],up=1), (14,2,[$],up=1)],hasSemanticContext=true,dipsIntoOuterContext

		to

		[(11,1,[$]), (14,1,[$]), (5,2,[$],up=1)],dipsIntoOuterContext

		This filters because {3>=prec}? evals to true and collapses
		(11,1,[$],{3>=prec}?) and (11,2,[$],up=1) since early conflict
		resolution based upon rules of operator precedence fits with
		our usual match first alt upon conflict.

		We noticed a problem where a recursive call resets precedence
		to 0. Sam's fix: each config has flag indicating if it has
		returned from an expr[0] call. then just don't filter any
		config with that flag set. flag is carried along in
		closure(). so to avoid adding field, set bit just under sign
		bit of dipsIntoOuterContext (SUPPRESS_PRECEDENCE_FILTER).
		With the change you filter "unless (p, 2, pi) was reached
		after leaving the rule stop state of the LR rule containing
		state p, corresponding to a rule invocation with precedence
		level 0"
	 */

    /**
     * This method transforms the start state computed by
     * [.computeStartState] to the special start state used by a
     * precedence DFA for a particular precedence value. The transformation
     * process applies the following changes to the start state's configuration
     * set.
     *
     *
     *  1. Evaluate the precedence predicates for each configuration using
     * [SemanticContext.evalPrecedence].
     *  1. When [ATNConfig.isPrecedenceFilterSuppressed] is `false`,
     * remove all configurations which predict an alternative greater than 1,
     * for which another configuration that predicts alternative 1 is in the
     * same ATN state with the same prediction context. This transformation is
     * valid for the following reasons:
     *
     *  * The closure block cannot contain any epsilon transitions which bypass
     * the body of the closure, so all states reachable via alternative 1 are
     * part of the precedence alternatives of the transformed left-recursive
     * rule.
     *  * The "primary" portion of a left recursive rule cannot contain an
     * epsilon transition, so the only way an alternative other than 1 can exist
     * in a state that is also reachable via alternative 1 is by nesting calls
     * to the left-recursive rule, with the outer calls not being at the
     * preferred precedence level. The
     * [ATNConfig.isPrecedenceFilterSuppressed] property marks ATN
     * configurations which do not meet this condition, and therefore are not
     * eligible for elimination during the filtering process.
     *
     *
     *
     *
     *
     *
     * The prediction context must be considered by this filter to address
     * situations like the following.
     *
     * `
     * <pre>
     * grammar TA;
     * prog: statement* EOF;
     * statement: letterA | statement letterA 'b' ;
     * letterA: 'a';
    </pre> *
    ` *
     *
     *
     * If the above grammar, the ATN state immediately before the token
     * reference `'a'` in `letterA` is reachable from the left edge
     * of both the primary and closure blocks of the left-recursive rule
     * `statement`. The prediction context associated with each of these
     * configurations distinguishes between them, and prevents the alternative
     * which stepped out to `prog` (and then back in to `statement`
     * from being eliminated by the filter.
     *
     *
     * @param configs The configuration set computed by
     * [.computeStartState] as the start state for the DFA.
     * @return The transformed configuration set representing the start state
     * for a precedence DFA at a particular precedence level (determined by
     * calling [Parser.precedence]).
     */
    fun applyPrecedenceFilter(configs: ATNConfigSet): ATNConfigSet {
        val statesFromAlt1 = HashMap<Int, PredictionContext>()
        val configSet = ATNConfigSet(configs.fullCtx)
        for (config in configs) {
            // handle alt 1 first
            if (config.alt != 1) {
                continue
            }

            val updatedContext = config.semanticContext!!.evalPrecedence(parser!!, _outerContext!!)
                    ?: // the configuration was eliminated
                    continue

            statesFromAlt1.put(config.state.stateNumber, config.context!!)
            if (updatedContext !== config.semanticContext) {
                configSet.add(ATNConfig(config, updatedContext), mergeCache)
            } else {
                configSet.add(config, mergeCache)
            }
        }

        for (config in configs) {
            if (config.alt == 1) {
                // already handled
                continue
            }

            if (!config.isPrecedenceFilterSuppressed) {
                /* In the future, this elimination step could be updated to also
				 * filter the prediction context for alternatives predicting alt>1
				 * (basically a graph subtraction algorithm).
				 */
                val context = statesFromAlt1[config.state.stateNumber]
                if (context != null && context == config.context) {
                    // eliminated
                    continue
                }
            }

            configSet.add(config, mergeCache)
        }

        return configSet
    }

    protected fun getReachableTarget(trans: Transition, ttype: Int): ATNState? {
        return if (trans.matches(ttype, 0, atn.maxTokenType)) {
            trans.target
        } else null

    }

    fun getPredsForAmbigAlts(ambigAlts: BitSet,
                             configs: ATNConfigSet,
                             nalts: Int): Array<SemanticContext?>? {
        // REACH=[1|1|[]|0:0, 1|2|[]|0:1]
        /* altToPred starts as an array of all null contexts. The entry at index i
		 * corresponds to alternative i. altToPred[i] may have one of three values:
		 *   1. null: no ATNConfig c is found such that c.alt==i
		 *   2. SemanticContext.NONE: At least one ATNConfig c exists such that
		 *      c.alt==i and c.semanticContext==SemanticContext.NONE. In other words,
		 *      alt i has at least one unpredicated config.
		 *   3. Non-NONE Semantic Context: There exists at least one, and for all
		 *      ATNConfig c such that c.alt==i, c.semanticContext!=SemanticContext.NONE.
		 *
		 * From this, it is clear that NONE||anything==NONE.
		 */
        var altToPred: Array<SemanticContext?>? = arrayOfNulls<SemanticContext>(nalts + 1)
        for (c in configs) {
            if (ambigAlts.get(c.alt)) {
                altToPred!![c.alt] = SemanticContext.or(altToPred!![c.alt], c.semanticContext)
            }
        }

        var nPredAlts = 0
        for (i in 1..nalts) {
            if (altToPred!![i] == null) {
                altToPred[i] = SemanticContext.NONE
            } else if (altToPred[i] !== SemanticContext.NONE) {
                nPredAlts++
            }
        }

        //		// Optimize away p||p and p&&p TODO: optimize() was a no-op
        //		for (int i = 0; i < altToPred.length; i++) {
        //			altToPred[i] = altToPred[i].optimize();
        //		}

        // nonambig alts are null in altToPred
        if (nPredAlts == 0) altToPred = null
        if (debug) println("getPredsForAmbigAlts result " + altToPred!!.joinToString())
        return altToPred
    }

    protected fun getPredicatePredictions(ambigAlts: BitSet?,
                                          altToPred: Array<SemanticContext?>): Array<DFAState.PredPrediction?>? {
        val pairs = ArrayList<DFAState.PredPrediction>()
        var containsPredicate = false
        for (i in 1 until altToPred.size) {
            val pred = altToPred[i]

            // unpredicated is indicated by SemanticContext.NONE
            assert(pred != null)

            if (ambigAlts != null && ambigAlts.get(i)) {
                pairs.add(DFAState.PredPrediction(pred!!, i))
            }
            if (pred !== SemanticContext.NONE) containsPredicate = true
        }

        return if (!containsPredicate) {
            null
        } else pairs.toTypedArray()

        //		System.out.println(Arrays.toString(altToPred)+"->"+pairs);
    }

    /**
     * This method is used to improve the localization of error messages by
     * choosing an alternative rather than throwing a
     * [NoViableAltException] in particular prediction scenarios where the
     * [.ERROR] state was reached during ATN simulation.
     *
     *
     *
     * The default implementation of this method uses the following
     * algorithm to identify an ATN configuration which successfully parsed the
     * decision entry rule. Choosing such an alternative ensures that the
     * [ParserRuleContext] returned by the calling rule will be complete
     * and valid, and the syntax error will be reported later at a more
     * localized location.
     *
     *
     *  * If a syntactically valid path or paths reach the end of the decision rule and
     * they are semantically valid if predicated, return the min associated alt.
     *  * Else, if a semantically invalid but syntactically valid path exist
     * or paths exist, return the minimum associated alt.
     *
     *  * Otherwise, return [ATN.INVALID_ALT_NUMBER].
     *
     *
     *
     *
     * In some scenarios, the algorithm described above could predict an
     * alternative which will result in a [FailedPredicateException] in
     * the parser. Specifically, this could occur if the *only* configuration
     * capable of successfully parsing to the end of the decision rule is
     * blocked by a semantic predicate. By choosing this alternative within
     * [.adaptivePredict] instead of throwing a
     * [NoViableAltException], the resulting
     * [FailedPredicateException] in the parser will identify the specific
     * predicate which is preventing the parser from successfully parsing the
     * decision rule, which helps developers identify and correct logic errors
     * in semantic predicates.
     *
     *
     * @param configs The ATN configurations which were valid immediately before
     * the [.ERROR] state was reached
     * @param outerContext The is the \gamma_0 initial parser context from the paper
     * or the parser stack at the instant before prediction commences.
     *
     * @return The value to return from [.adaptivePredict], or
     * [ATN.INVALID_ALT_NUMBER] if a suitable alternative was not
     * identified and [.adaptivePredict] should report an error instead.
     */
    protected fun getSynValidOrSemInvalidAltThatFinishedDecisionEntryRule(configs: ATNConfigSet,
                                                                          outerContext: ParserRuleContext): Int {
        val sets = splitAccordingToSemanticValidity(configs, outerContext)
        val semValidConfigs = sets.first
        val semInvalidConfigs = sets.second
        var alt = getAltThatFinishedDecisionEntryRule(semValidConfigs!!)
        if (alt != ATN.INVALID_ALT_NUMBER) { // semantically/syntactically viable path exists
            return alt
        }
        // Is there a syntactically valid path with a failed pred?
        if (semInvalidConfigs!!.size > 0) {
            alt = getAltThatFinishedDecisionEntryRule(semInvalidConfigs!!)
            if (alt != ATN.INVALID_ALT_NUMBER) { // syntactically viable path exists
                return alt
            }
        }
        return ATN.INVALID_ALT_NUMBER
    }

    protected fun getAltThatFinishedDecisionEntryRule(configs: ATNConfigSet): Int {
        val alts = IntervalSet()
        for (c in configs) {
            if (c.outerContextDepth > 0 || c.state is RuleStopState && c.context!!.hasEmptyPath()) {
                alts.add(c.alt)
            }
        }
        return if (alts.size() === 0) ATN.INVALID_ALT_NUMBER else alts.minElement
    }

    /** Walk the list of configurations and split them according to
     * those that have preds evaluating to true/false.  If no pred, assume
     * true pred and include in succeeded set.  Returns Pair of sets.
     *
     * Create a new set so as not to alter the incoming parameter.
     *
     * Assumption: the input stream has been restored to the starting point
     * prediction, which is where predicates need to evaluate.
     */
    protected fun splitAccordingToSemanticValidity(
            configs: ATNConfigSet,
            outerContext: ParserRuleContext): Pair<ATNConfigSet, ATNConfigSet> {
        val succeeded = ATNConfigSet(configs.fullCtx)
        val failed = ATNConfigSet(configs.fullCtx)
        for (c in configs) {
            if (c.semanticContext !== SemanticContext.NONE) {
                val predicateEvaluationResult = evalSemanticContext(c.semanticContext, outerContext, c.alt, configs.fullCtx)
                if (predicateEvaluationResult) {
                    succeeded.add(c)
                } else {
                    failed.add(c)
                }
            } else {
                succeeded.add(c)
            }
        }
        return Pair<ATNConfigSet, ATNConfigSet>(succeeded, failed)
    }

    /** Look through a list of predicate/alt pairs, returning alts for the
     * pairs that win. A `NONE` predicate indicates an alt containing an
     * unpredicated config which behaves as "always true." If !complete
     * then we stop at the first predicate that evaluates to true. This
     * includes pairs with null predicates.
     */
    fun evalSemanticContext(predPredictions: Array<DFAState.PredPrediction?>,
                            outerContext: ParserRuleContext,
                            complete: Boolean): BitSet {
        val predictions = BitSet()
        for (pair in predPredictions) {
            if (pair!!.pred === SemanticContext.NONE) {
                predictions.set(pair!!.alt!!)
                if (!complete) {
                    break
                }
                continue
            }

            val fullCtx = false // in dfa
            val predicateEvaluationResult = evalSemanticContext(pair!!.pred, outerContext, pair.alt, fullCtx)
            if (debug || dfa_debug) {
                println("eval pred $pair=$predicateEvaluationResult")
            }

            if (predicateEvaluationResult) {
                if (debug || dfa_debug) outMessage("PREDICT " + pair.alt)
                predictions.set(pair.alt)
                if (!complete) {
                    break
                }
            }
        }

        return predictions
    }

    /**
     * Evaluate a semantic context within a specific parser context.
     *
     *
     *
     * This method might not be called for every semantic context evaluated
     * during the prediction process. In particular, we currently do not
     * evaluate the following but it may change in the future:
     *
     *
     *  * Precedence predicates (represented by
     * [SemanticContext.PrecedencePredicate]) are not currently evaluated
     * through this method.
     *  * Operator predicates (represented by [SemanticContext.AND] and
     * [SemanticContext.OR]) are evaluated as a single semantic
     * context, rather than evaluating the operands individually.
     * Implementations which require evaluation results from individual
     * predicates should override this method to explicitly handle evaluation of
     * the operands within operator predicates.
     *
     *
     * @param pred The semantic context to evaluate
     * @param parserCallStack The parser context in which to evaluate the
     * semantic context
     * @param alt The alternative which is guarded by `pred`
     * @param fullCtx `true` if the evaluation is occurring during LL
     * prediction; otherwise, `false` if the evaluation is occurring
     * during SLL prediction
     *
     * @since 4.3
     */
    open fun evalSemanticContext(pred: SemanticContext?, parserCallStack: ParserRuleContext?, alt: Int, fullCtx: Boolean): Boolean {
        return pred!!.eval(parser!!, parserCallStack!!)
    }

    /* TODO: If we are doing predicates, there is no point in pursuing
		 closure operations if we reach a DFA state that uniquely predicts
		 alternative. We will not be caching that DFA state and it is a
		 waste to pursue the closure. Might have to advance when we do
		 ambig detection thought :(
		  */

    protected fun closure(config: ATNConfig,
                          configs: ATNConfigSet,
                          closureBusy: MutableSet<ATNConfig>,
                          collectPredicates: Boolean,
                          fullCtx: Boolean,
                          treatEofAsEpsilon: Boolean) {
        val initialDepth = 0
        closureCheckingStopState(config, configs, closureBusy, collectPredicates,
                fullCtx,
                initialDepth, treatEofAsEpsilon)
        assert(!fullCtx || !configs.dipsIntoOuterContext)
    }

    protected fun closureCheckingStopState(config: ATNConfig,
                                           configs: ATNConfigSet,
                                           closureBusy: MutableSet<ATNConfig>,
                                           collectPredicates: Boolean,
                                           fullCtx: Boolean,
                                           depth: Int,
                                           treatEofAsEpsilon: Boolean) {
        if (debug) println("closure(" + config.toString(parser, true) + ")")

        if (config.state is RuleStopState) {
            // We hit rule end. If we have context info, use it
            // run thru all possible stack tops in ctx
            if (!config.context!!.isEmpty) {
                for (i in 0 until config.context!!.size()) {
                    if (config.context!!.getReturnState(i) == PredictionContext.EMPTY_RETURN_STATE) {
                        if (fullCtx) {
                            configs.add(ATNConfig(config, config.state, PredictionContext.EMPTY), mergeCache)
                            continue
                        } else {
                            // we have no context info, just chase follow links (if greedy)
                            if (debug)
                                println("FALLING off rule " + getRuleName(config.state.ruleIndex))
                            closure_(config, configs, closureBusy, collectPredicates,
                                    fullCtx, depth, treatEofAsEpsilon)
                        }
                        continue
                    }
                    val returnState = atn.states.get(config.context!!.getReturnState(i))
                    val newContext = config.context!!.getParent(i) // "pop" return state
                    val c = ATNConfig(returnState!!, config.alt, newContext!!,
                            config.semanticContext!!)
                    // While we have context to pop back from, we may have
                    // gotten that context AFTER having falling off a rule.
                    // Make sure we track that we are now out of context.
                    //
                    // This assignment also propagates the
                    // isPrecedenceFilterSuppressed() value to the new
                    // configuration.
                    c.reachesIntoOuterContext = config.reachesIntoOuterContext
                    assert(depth > Int.MIN_VALUE)
                    closureCheckingStopState(c, configs, closureBusy, collectPredicates,
                            fullCtx, depth - 1, treatEofAsEpsilon)
                }
                return
            } else if (fullCtx) {
                // reached end of start rule
                configs.add(config, mergeCache)
                return
            } else {
                // else if we have no context info, just chase follow links (if greedy)
                if (debug)
                    println("FALLING off rule " + getRuleName(config.state.ruleIndex))
            }
        }

        closure_(config, configs, closureBusy, collectPredicates,
                fullCtx, depth, treatEofAsEpsilon)
    }

    /** Do the actual work of walking epsilon edges  */
    protected fun closure_(config: ATNConfig,
                           configs: ATNConfigSet,
                           closureBusy: MutableSet<ATNConfig>,
                           collectPredicates: Boolean,
                           fullCtx: Boolean,
                           depth: Int,
                           treatEofAsEpsilon: Boolean) {
        val p = config.state
        // optimization
        if (!p.onlyHasEpsilonTransitions()) {
            configs.add(config, mergeCache)
            // make sure to not return here, because EOF transitions can act as
            // both epsilon transitions and non-epsilon transitions.
            //            if ( debug ) System.out.println("added config "+configs);
        }

        for (i in 0 until p.numberOfTransitions) {
            if (i == 0 && canDropLoopEntryEdgeInLeftRecursiveRule(config)) continue

            val t = p.transition(i)
            val continueCollecting = t !is ActionTransition && collectPredicates
            val c = getEpsilonTarget(config, t, continueCollecting,
                    depth == 0, fullCtx, treatEofAsEpsilon)
            if (c != null) {
                var newDepth = depth
                if (config.state is RuleStopState) {
                    assert(!fullCtx)
                    // target fell off end of rule; mark resulting c as having dipped into outer context
                    // We can't get here if incoming config was rule stop and we had context
                    // track how far we dip into outer context.  Might
                    // come in handy and we avoid evaluating context dependent
                    // preds if this is > 0.

                    if (_dfa != null && _dfa!!.isPrecedenceDfa) {
                        val outermostPrecedenceReturn = (t as EpsilonTransition).outermostPrecedenceReturn()
                        if (outermostPrecedenceReturn == _dfa!!.atnStartState.ruleIndex) {
                            c!!.isPrecedenceFilterSuppressed = true
                        }
                    }

                    c!!.reachesIntoOuterContext++

                    if (!closureBusy.add(c)) {
                        // avoid infinite recursion for right-recursive rules
                        continue
                    }

                    configs.dipsIntoOuterContext = true // TODO: can remove? only care when we add to set per middle of this method
                    assert(newDepth > Int.MIN_VALUE)
                    newDepth--
                    if (debug) println("dips into outer ctx: " + c!!)
                } else {
                    if (!t.isEpsilon && !closureBusy.add(c)) {
                        // avoid infinite recursion for EOF* and EOF+
                        continue
                    }

                    if (t is RuleTransition) {
                        // latch when newDepth goes negative - once we step out of the entry context we can't return
                        if (newDepth >= 0) {
                            newDepth++
                        }
                    }
                }

                closureCheckingStopState(c, configs, closureBusy, continueCollecting,
                        fullCtx, newDepth, treatEofAsEpsilon)
            }
        }
    }

    /** Implements first-edge (loop entry) elimination as an optimization
     * during closure operations.  See antlr/antlr4#1398.
     *
     * The optimization is to avoid adding the loop entry config when
     * the exit path can only lead back to the same
     * StarLoopEntryState after popping context at the rule end state
     * (traversing only epsilon edges, so we're still in closure, in
     * this same rule).
     *
     * We need to detect any state that can reach loop entry on
     * epsilon w/o exiting rule. We don't have to look at FOLLOW
     * links, just ensure that all stack tops for config refer to key
     * states in LR rule.
     *
     * To verify we are in the right situation we must first check
     * closure is at a StarLoopEntryState generated during LR removal.
     * Then we check that each stack top of context is a return state
     * from one of these cases:
     *
     * 1. 'not' expr, '(' type ')' expr. The return state points at loop entry state
     * 2. expr op expr. The return state is the block end of internal block of (...)*
     * 3. 'between' expr 'and' expr. The return state of 2nd expr reference.
     * That state points at block end of internal block of (...)*.
     * 4. expr '?' expr ':' expr. The return state points at block end,
     * which points at loop entry state.
     *
     * If any is true for each stack top, then closure does not add a
     * config to the current config set for edge[0], the loop entry branch.
     *
     * Conditions fail if any context for the current config is:
     *
     * a. empty (we'd fall out of expr to do a global FOLLOW which could
     * even be to some weird spot in expr) or,
     * b. lies outside of expr or,
     * c. lies within expr but at a state not the BlockEndState
     * generated during LR removal
     *
     * Do we need to evaluate predicates ever in closure for this case?
     *
     * No. Predicates, including precedence predicates, are only
     * evaluated when computing a DFA start state. I.e., only before
     * the lookahead (but not parser) consumes a token.
     *
     * There are no epsilon edges allowed in LR rule alt blocks or in
     * the "primary" part (ID here). If closure is in
     * StarLoopEntryState any lookahead operation will have consumed a
     * token as there are no epsilon-paths that lead to
     * StarLoopEntryState. We do not have to evaluate predicates
     * therefore if we are in the generated StarLoopEntryState of a LR
     * rule. Note that when making a prediction starting at that
     * decision point, decision d=2, compute-start-state performs
     * closure starting at edges[0], edges[1] emanating from
     * StarLoopEntryState. That means it is not performing closure on
     * StarLoopEntryState during compute-start-state.
     *
     * How do we know this always gives same prediction answer?
     *
     * Without predicates, loop entry and exit paths are ambiguous
     * upon remaining input +b (in, say, a+b). Either paths lead to
     * valid parses. Closure can lead to consuming + immediately or by
     * falling out of this call to expr back into expr and loop back
     * again to StarLoopEntryState to match +b. In this special case,
     * we choose the more efficient path, which is to take the bypass
     * path.
     *
     * The lookahead language has not changed because closure chooses
     * one path over the other. Both paths lead to consuming the same
     * remaining input during a lookahead operation. If the next token
     * is an operator, lookahead will enter the choice block with
     * operators. If it is not, lookahead will exit expr. Same as if
     * closure had chosen to enter the choice block immediately.
     *
     * Closure is examining one config (some loopentrystate, some alt,
     * context) which means it is considering exactly one alt. Closure
     * always copies the same alt to any derived configs.
     *
     * How do we know this optimization doesn't mess up precedence in
     * our parse trees?
     *
     * Looking through expr from left edge of stat only has to confirm
     * that an input, say, a+b+c; begins with any valid interpretation
     * of an expression. The precedence actually doesn't matter when
     * making a decision in stat seeing through expr. It is only when
     * parsing rule expr that we must use the precedence to get the
     * right interpretation and, hence, parse tree.
     *
     * @since 4.6
     */
    protected fun canDropLoopEntryEdgeInLeftRecursiveRule(config: ATNConfig): Boolean {
        //if (TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT) return false
        val p = config.state
        // First check to see if we are in StarLoopEntryState generated during
        // left-recursion elimination. For efficiency, also check if
        // the context has an empty stack case. If so, it would mean
        // global FOLLOW so we can't perform optimization
        if (p.stateType != ATNState.STAR_LOOP_ENTRY ||
                !(p as StarLoopEntryState).isPrecedenceDecision || // Are we the special loop entry/exit state?

                config.context!!.isEmpty ||                      // If SLL wildcard

                config.context!!.hasEmptyPath()) {
            return false
        }

        // Require all return states to return back to the same rule
        // that p is in.
        val numCtxs = config.context!!.size()
        for (i in 0 until numCtxs) { // for each stack context
            val returnState = atn.states.get(config.context!!.getReturnState(i))
            if (returnState!!.ruleIndex != p.ruleIndex) return false
        }

        val decisionStartState = p.transition(0).target as BlockStartState
        val blockEndStateNum = decisionStartState.endState!!.stateNumber
        val blockEndState = atn.states.get(blockEndStateNum) as BlockEndState

        // Verify that the top of each stack context leads to loop entry/exit
        // state through epsilon edges and w/o leaving rule.
        for (i in 0 until numCtxs) {                           // for each stack context
            val returnStateNumber = config.context!!.getReturnState(i)
            val returnState = atn.states.get(returnStateNumber)
            // all states must have single outgoing epsilon edge
            if (returnState!!.numberOfTransitions != 1 || !returnState.transition(0).isEpsilon) {
                return false
            }
            // Look for prefix op case like 'not expr', (' type ')' expr
            val returnStateTarget = returnState!!.transition(0).target
            if (returnState.stateType == ATNState.BLOCK_END && returnStateTarget === p) {
                continue
            }
            // Look for 'expr op expr' or case where expr's return state is block end
            // of (...)* internal block; the block end points to loop back
            // which points to p but we don't need to check that
            if (returnState === blockEndState) {
                continue
            }
            // Look for ternary expr ? expr : expr. The return state points at block end,
            // which points at loop entry state
            if (returnStateTarget === blockEndState) {
                continue
            }
            // Look for complex prefix 'between expr and expr' case where 2nd expr's
            // return state points at block end state of (...)* internal block
            if (returnStateTarget!!.stateType == ATNState.BLOCK_END &&
                    returnStateTarget.numberOfTransitions == 1 &&
                    returnStateTarget.transition(0).isEpsilon &&
                    returnStateTarget.transition(0).target === p) {
                continue
            }

            // anything else ain't conforming
            return false
        }

        return true
    }


    fun getRuleName(index: Int): String {
        return if (parser != null && index >= 0) parser!!.ruleNames!![index] else "<rule $index>"
    }


    protected fun getEpsilonTarget(config: ATNConfig,
                                   t: Transition,
                                   collectPredicates: Boolean,
                                   inContext: Boolean,
                                   fullCtx: Boolean,
                                   treatEofAsEpsilon: Boolean): ATNConfig? {
        when (t.serializationType) {
            Transition.RULE -> return ruleTransition(config, t as RuleTransition)

            Transition.PRECEDENCE -> return precedenceTransition(config, t as PrecedencePredicateTransition, collectPredicates, inContext, fullCtx)

            Transition.PREDICATE -> return predTransition(config, t as PredicateTransition,
                    collectPredicates,
                    inContext,
                    fullCtx)

            Transition.ACTION -> return actionTransition(config, t as ActionTransition)

            Transition.EPSILON -> return ATNConfig(config, t.target!!)

            Transition.ATOM, Transition.RANGE, Transition.SET -> {
                // EOF transitions act like epsilon transitions after the first EOF
                // transition is traversed
                if (treatEofAsEpsilon) {
                    if (t.matches(Token.EOF, 0, 1)) {
                        return ATNConfig(config, t.target!!)
                    }
                }

                return null
            }

            else -> return null
        }
    }


    protected fun actionTransition(config: ATNConfig, t: ActionTransition): ATNConfig {
        if (debug) println("ACTION edge " + t.ruleIndex + ":" + t.actionIndex)
        return ATNConfig(config, t.target!!)
    }


    fun precedenceTransition(config: ATNConfig,
                             pt: PrecedencePredicateTransition,
                             collectPredicates: Boolean,
                             inContext: Boolean,
                             fullCtx: Boolean): ATNConfig? {
        if (debug) {
            println("PRED (collectPredicates=" + collectPredicates + ") " +
                    pt.precedence + ">=_p" +
                    ", ctx dependent=true")
            if (parser != null) {
                outMessage("context surrounding pred is " + parser!!.ruleInvocationStack)
            }
        }

        var c: ATNConfig? = null
        if (collectPredicates && inContext) {
            if (fullCtx) {
                // In full context mode, we can evaluate predicates on-the-fly
                // during closure, which dramatically reduces the size of
                // the config sets. It also obviates the need to test predicates
                // later during conflict resolution.
                val currentPosition = _input!!.index()
                _input!!.seek(_startIndex)
                val predSucceeds = evalSemanticContext(pt.predicate, _outerContext, config.alt, fullCtx)
                _input!!.seek(currentPosition)
                if (predSucceeds) {
                    c = ATNConfig(config, pt.target!!) // no pred context
                }
            } else {
                val newSemCtx = SemanticContext.and(config.semanticContext, pt.predicate)
                c = ATNConfig(config, pt.target!!, newSemCtx!!)
            }
        } else {
            c = ATNConfig(config, pt.target!!)
        }

        if (debug) println("config from pred transition=" + c!!)
        return c
    }


    protected fun predTransition(config: ATNConfig,
                                 pt: PredicateTransition,
                                 collectPredicates: Boolean,
                                 inContext: Boolean,
                                 fullCtx: Boolean): ATNConfig? {
        if (debug) {
            println("PRED (collectPredicates=" + collectPredicates + ") " +
                    pt.ruleIndex + ":" + pt.predIndex +
                    ", ctx dependent=" + pt.isCtxDependent)
            if (parser != null) {
                outMessage("context surrounding pred is " + parser!!.ruleInvocationStack)
            }
        }

        var c: ATNConfig? = null
        if (collectPredicates && (!pt.isCtxDependent || pt.isCtxDependent && inContext)) {
            if (fullCtx) {
                // In full context mode, we can evaluate predicates on-the-fly
                // during closure, which dramatically reduces the size of
                // the config sets. It also obviates the need to test predicates
                // later during conflict resolution.
                val currentPosition = _input!!.index()
                _input!!.seek(_startIndex)
                val predSucceeds = evalSemanticContext(pt.predicate, _outerContext, config.alt, fullCtx)
                _input!!.seek(currentPosition)
                if (predSucceeds) {
                    c = ATNConfig(config, pt.target!!) // no pred context
                }
            } else {
                val newSemCtx = SemanticContext.and(config.semanticContext, pt.predicate)
                c = ATNConfig(config, pt.target!!, newSemCtx!!)
            }
        } else {
            c = ATNConfig(config, pt.target!!)
        }

        if (debug) println("config from pred transition=" + c!!)
        return c
    }


    protected fun ruleTransition(config: ATNConfig, t: RuleTransition): ATNConfig {
        if (debug) {
            println("CALL rule " + getRuleName(t.target!!.ruleIndex) +
                    ", ctx=" + config.context)
        }

        val returnState = t.followState
        val newContext = SingletonPredictionContext.create(config.context, returnState.stateNumber)
        return ATNConfig(config, t.target!!, newContext)
    }

    /**
     * Gets a [BitSet] containing the alternatives in `configs`
     * which are part of one or more conflicting alternative subsets.
     *
     * @param configs The [ATNConfigSet] to analyze.
     * @return The alternatives in `configs` which are part of one or more
     * conflicting alternative subsets. If `configs` does not contain any
     * conflicting subsets, this method returns an empty [BitSet].
     */
    protected fun getConflictingAlts(configs: ATNConfigSet?): BitSet {
        val altsets = PredictionMode.getConflictingAltSubsets(configs!!)
        return PredictionMode.getAlts(altsets)
    }

    /**
     * Sam pointed out a problem with the previous definition, v3, of
     * ambiguous states. If we have another state associated with conflicting
     * alternatives, we should keep going. For example, the following grammar
     *
     * s : (ID | ID ID?) ';' ;
     *
     * When the ATN simulation reaches the state before ';', it has a DFA
     * state that looks like: [12|1|[], 6|2|[], 12|2|[]]. Naturally
     * 12|1|[] and 12|2|[] conflict, but we cannot stop processing this node
     * because alternative to has another way to continue, via [6|2|[]].
     * The key is that we have a single state that has config's only associated
     * with a single alternative, 2, and crucially the state transitions
     * among the configurations are all non-epsilon transitions. That means
     * we don't consider any conflicts that include alternative 2. So, we
     * ignore the conflict between alts 1 and 2. We ignore a set of
     * conflicting alts when there is an intersection with an alternative
     * associated with a single alt state in the stateconfig-list map.
     *
     * It's also the case that we might have two conflicting configurations but
     * also a 3rd nonconflicting configuration for a different alternative:
     * [1|1|[], 1|2|[], 8|3|[]]. This can come about from grammar:
     *
     * a : A | A | A B ;
     *
     * After matching input A, we reach the stop state for rule A, state 1.
     * State 8 is the state right before B. Clearly alternatives 1 and 2
     * conflict and no amount of further lookahead will separate the two.
     * However, alternative 3 will be able to continue and so we do not
     * stop working on this state. In the previous example, we're concerned
     * with states associated with the conflicting alternatives. Here alt
     * 3 is not associated with the conflicting configs, but since we can continue
     * looking for input reasonably, I don't declare the state done. We
     * ignore a set of conflicting alts when we have an alternative
     * that we still need to pursue.
     */
    protected fun getConflictingAltsOrUniqueAlt(configs: ATNConfigSet): BitSet {
        val conflictingAlts: BitSet?
        if (configs.uniqueAlt != ATN.INVALID_ALT_NUMBER) {
            conflictingAlts = BitSet()
            conflictingAlts.set(configs.uniqueAlt)
        } else {
            conflictingAlts = configs.conflictingAlts
        }
        return conflictingAlts!!
    }


    fun getTokenName(t: Int): String {
        if (t == Token.EOF) {
            return "EOF"
        }

        val vocabulary = if (parser != null) parser!!.vocabulary else VocabularyImpl.EMPTY_VOCABULARY
        val displayName = vocabulary.getDisplayName(t)
        return if (displayName == t.toString()) {
            displayName
        } else displayName + "<" + t + ">"

    }

    fun getLookaheadName(input: TokenStream): String {
        return getTokenName(input.LA(1))
    }

    /** Used for debugging in adaptivePredict around execATN but I cut
     * it out for clarity now that alg. works well. We can leave this
     * "dead" code for a bit.
     */
    fun dumpDeadEndConfigs(nvae: NoViableAltException) {
        errMessage("dead end configs: ")
        for (c in nvae.deadEndConfigs!!) {
            var trans = "no edges"
            if (c.state.numberOfTransitions > 0) {
                val t = c.state.transition(0)
                if (t is AtomTransition) {
                    val at = t as AtomTransition
                    trans = "Atom " + getTokenName(at.label)
                } else if (t is SetTransition) {
                    val st = t as SetTransition
                    val not = st is NotSetTransition
                    trans = (if (not) "~" else "") + "Set " + st.set.toString()
                }
            }
            errMessage(c.toString(parser, true) + ":" + trans)
        }
    }


    protected fun noViableAlt(input: TokenStream,
                              outerContext: ParserRuleContext,
                              configs: ATNConfigSet,
                              startIndex: Int): NoViableAltException {
        return NoViableAltException(parser!!, input,
                input.get(startIndex),
                input.LT(1),
                configs, outerContext)
    }

    /**
     * Add an edge to the DFA, if possible. This method calls
     * [.addDFAState] to ensure the `to` state is present in the
     * DFA. If `from` is `null`, or if `t` is outside the
     * range of edges that can be represented in the DFA tables, this method
     * returns without adding the edge to the DFA.
     *
     *
     * If `to` is `null`, this method returns `null`.
     * Otherwise, this method returns the [DFAState] returned by calling
     * [.addDFAState] for the `to` state.
     *
     * @param dfa The DFA
     * @param from The source state for the edge
     * @param t The input symbol
     * @param to The target state for the edge
     *
     * @return If `to` is `null`, this method returns `null`;
     * otherwise this method returns the result of calling [.addDFAState]
     * on `to`
     */
    protected fun addDFAEdge(dfa: DFA,
                             from: DFAState?,
                             t: Int,
                             to: DFAState?): DFAState? {
        var to = to
        if (debug) {
            println("EDGE " + from + " -> " + to + " upon " + getTokenName(t))
        }

        if (to == null) {
            return null
        }

        to = addDFAState(dfa, to) // used existing if possible not incoming
        if (from == null || t < -1 || t > atn.maxTokenType) {
            return to
        }

        synchronized(from) {
            if (from!!.edges == null) {
                from!!.edges = arrayOfNulls<DFAState>(atn.maxTokenType + 1 + 1)
            }

            from!!.edges!![t + 1] = to // connect
        }

        if (debug) {
            outMessage("DFA=\n" + dfa.toString(if (parser != null) parser!!.vocabulary else VocabularyImpl.EMPTY_VOCABULARY))
        }

        return to
    }

    /**
     * Add state `D` to the DFA if it is not already present, and return
     * the actual instance stored in the DFA. If a state equivalent to `D`
     * is already in the DFA, the existing state is returned. Otherwise this
     * method returns `D` after adding it to the DFA.
     *
     *
     * If `D` is [.ERROR], this method returns [.ERROR] and
     * does not change the DFA.
     *
     * @param dfa The dfa
     * @param D The DFA state to add
     * @return The state stored in the DFA. This will be either the existing
     * state if `D` is already in the DFA, or `D` itself if the
     * state was not already present.
     */
    protected fun addDFAState(dfa: DFA, D: DFAState): DFAState {
        if (D === ATNSimulator.ERROR) {
            return D
        }

        synchronized(dfa.states) {
            val existing = dfa.states.get(D)
            if (existing != null) return existing

            D.stateNumber = dfa.states.size
            if (!D.configs!!.isReadonly) {
                D.configs!!.optimizeConfigs(this)
                D.configs!!.isReadonly = true
            }
            dfa.states.put(D, D)
            if (debug) println("adding new DFA state: " + D)
            return D
        }
    }

    protected open fun reportAttemptingFullContext(dfa: DFA, conflictingAlts: BitSet, configs: ATNConfigSet, startIndex: Int, stopIndex: Int) {
        if (debug || retry_debug) {
            val interval = Interval.of(startIndex, stopIndex)
            outMessage("reportAttemptingFullContext decision=" + dfa.decision + ":" + configs +
                    ", input=" + parser!!.tokenStream!!.getText(interval))
        }
        if (parser != null) parser!!.errorListenerDispatch.reportAttemptingFullContext(parser, dfa, startIndex, stopIndex, conflictingAlts, configs)
    }

    open fun reportContextSensitivity(dfa: DFA, prediction: Int, configs: ATNConfigSet, startIndex: Int, stopIndex: Int) {
        if (debug || retry_debug) {
            val interval = Interval.of(startIndex, stopIndex)
            outMessage("reportContextSensitivity decision=" + dfa.decision + ":" + configs +
                    ", input=" + parser!!.tokenStream!!.getText(interval))
        }
        if (parser != null) parser!!.errorListenerDispatch.reportContextSensitivity(parser, dfa, startIndex, stopIndex, prediction, configs)
    }

    /** If context sensitive parsing, we know it's ambiguity not conflict  */
    open fun reportAmbiguity(dfa: DFA,
                             D: DFAState, // the DFA state from execATN() that had SLL conflicts
                             startIndex: Int, stopIndex: Int,
                             exact: Boolean,
                             ambigAlts: BitSet,
                             configs: ATNConfigSet) // configs that LL not SLL considered conflicting
    {
        if (debug || retry_debug) {
            val interval = Interval.of(startIndex, stopIndex)
            println("reportAmbiguity " +
                    ambigAlts + ":" + configs +
                    ", input=" + parser!!.tokenStream!!.getText(interval))
        }
        if (parser != null)
            parser!!.errorListenerDispatch.reportAmbiguity(parser, dfa, startIndex, stopIndex,
                    exact, ambigAlts, configs)
    }

    companion object {
        val debug = false
        val debug_list_atn_decisions = false
        val dfa_debug = false
        val retry_debug = false

        /** Just in case this optimization is bad, add an ENV variable to turn it off  */
        //val TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT = Boolean.parseBoolean(getSafeEnv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT"))

        protected fun getUniqueAlt(configs: ATNConfigSet): Int {
            var alt = ATN.INVALID_ALT_NUMBER
            for (c in configs) {
                if (alt == ATN.INVALID_ALT_NUMBER) {
                    alt = c.alt // found first alt
                } else if (c.alt != alt) {
                    return ATN.INVALID_ALT_NUMBER
                }
            }
            return alt
        }

//        fun getSafeEnv(envName: String): String? {
//            try {
//                return System.getenv(envName)
//            } catch (e: SecurityException) {
//                // use the default value
//            }
//
//            return null
//        }
    }
}
