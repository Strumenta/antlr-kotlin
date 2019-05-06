/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.BitSet
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.IntervalSet

class LL1Analyzer(val atn: ATN) {

    /**
     * Calculates the SLL(1) expected lookahead set for each outgoing transition
     * of an [ATNState]. The returned array has one element for each
     * outgoing transition in `s`. If the closure from transition
     * *i* leads to a semantic predicate before matching a symbol, the
     * element at index *i* of the result will be `null`.
     *
     * @param s the ATN state
     * @return the expected symbols for each outgoing transition of `s`.
     */
    fun getDecisionLookahead(s: ATNState?): Array<IntervalSet?>? {
        //		System.out.println("LOOK("+s.stateNumber+")");
        if (s == null) {
            return null
        }

        val look = arrayOfNulls<IntervalSet>(s!!.numberOfTransitions)
        for (alt in 0 until s!!.numberOfTransitions) {
            look[alt] = IntervalSet()
            val lookBusy = HashSet<ATNConfig>()
            val seeThruPreds = false // fail to get lookahead upon pred
            _LOOK(s!!.transition(alt).target!!, null, PredictionContext.EMPTY,
                    look[alt]!!, lookBusy, BitSet(), seeThruPreds, false)
            // Wipe out lookahead for this alternative if we found nothing
            // or we had a predicate when we !seeThruPreds
            if (look[alt]!!.size() === 0 || look[alt]!!.contains(HIT_PRED)) {
                look[alt] = null
            }
        }
        return look
    }

    /**
     * Compute set of tokens that can follow `s` in the ATN in the
     * specified `ctx`.
     *
     *
     * If `ctx` is `null` and the end of the rule containing
     * `s` is reached, [Token.EPSILON] is added to the result set.
     * If `ctx` is not `null` and the end of the outermost rule is
     * reached, [Token.EOF] is added to the result set.
     *
     * @param s the ATN state
     * @param ctx the complete parser context, or `null` if the context
     * should be ignored
     *
     * @return The set of tokens that can follow `s` in the ATN in the
     * specified `ctx`.
     */
    fun LOOK(s: ATNState, ctx: RuleContext?): IntervalSet {
        return LOOK(s, null, ctx)
    }

    /**
     * Compute set of tokens that can follow `s` in the ATN in the
     * specified `ctx`.
     *
     *
     * If `ctx` is `null` and the end of the rule containing
     * `s` is reached, [Token.EPSILON] is added to the result set.
     * If `ctx` is not `null` and the end of the outermost rule is
     * reached, [Token.EOF] is added to the result set.
     *
     * @param s the ATN state
     * @param stopState the ATN state to stop at. This can be a
     * [BlockEndState] to detect epsilon paths through a closure.
     * @param ctx the complete parser context, or `null` if the context
     * should be ignored
     *
     * @return The set of tokens that can follow `s` in the ATN in the
     * specified `ctx`.
     */

    fun LOOK(s: ATNState, stopState: ATNState?, ctx: RuleContext?): IntervalSet {
        val r = IntervalSet()
        val seeThruPreds = true // ignore preds; get all lookahead
        val lookContext = if (ctx != null) PredictionContext.fromRuleContext(s.atn!!, ctx) else null
        _LOOK(s, stopState, lookContext,
                r, HashSet<ATNConfig>(), BitSet(), seeThruPreds, true)
        return r
    }

    /**
     * Compute set of tokens that can follow `s` in the ATN in the
     * specified `ctx`.
     *
     *
     * If `ctx` is `null` and `stopState` or the end of the
     * rule containing `s` is reached, [Token.EPSILON] is added to
     * the result set. If `ctx` is not `null` and `addEOF` is
     * `true` and `stopState` or the end of the outermost rule is
     * reached, [Token.EOF] is added to the result set.
     *
     * @param s the ATN state.
     * @param stopState the ATN state to stop at. This can be a
     * [BlockEndState] to detect epsilon paths through a closure.
     * @param ctx The outer context, or `null` if the outer context should
     * not be used.
     * @param look The result lookahead set.
     * @param lookBusy A set used for preventing epsilon closures in the ATN
     * from causing a stack overflow. Outside code should pass
     * `new HashSet<ATNConfig>` for this argument.
     * @param calledRuleStack A set used for preventing left recursion in the
     * ATN from causing a stack overflow. Outside code should pass
     * `new BitSet()` for this argument.
     * @param seeThruPreds `true` to true semantic predicates as
     * implicitly `true` and "see through them", otherwise `false`
     * to treat semantic predicates as opaque and add [.HIT_PRED] to the
     * result if one is encountered.
     * @param addEOF Add [Token.EOF] to the result if the end of the
     * outermost context is reached. This parameter has no effect if `ctx`
     * is `null`.
     */
    protected fun _LOOK(s: ATNState,
                        stopState: ATNState?,
                        ctx: PredictionContext?,
                        look: IntervalSet,
                        lookBusy: MutableSet<ATNConfig>,
                        calledRuleStack: BitSet,
                        seeThruPreds: Boolean, addEOF: Boolean) {
        //		System.out.println("_LOOK("+s.stateNumber+", ctx="+ctx);
        val c = ATNConfig(s, 0, ctx)
        if (!lookBusy.add(c)) return

        if (s === stopState) {
            if (ctx == null) {
                look.add(Token.EPSILON)
                return
            } else if (ctx!!.isEmpty && addEOF) {
                look.add(Token.EOF)
                return
            }
        }

        if (s is RuleStopState) {
            if (ctx == null) {
                look.add(Token.EPSILON)
                return
            } else if (ctx!!.isEmpty && addEOF) {
                look.add(Token.EOF)
                return
            }

            if (ctx !== PredictionContext.EMPTY) {
                // run thru all possible stack tops in ctx
                val removed = calledRuleStack.get(s.ruleIndex)
                try {
                    calledRuleStack.clear(s.ruleIndex)
                    for (i in 0 until ctx!!.size()) {
                        val returnState = atn.states.get(ctx!!.getReturnState(i))
                        //					    System.out.println("popping back to "+retState);
                        _LOOK(returnState!!, stopState, ctx!!.getParent(i), look, lookBusy, calledRuleStack, seeThruPreds, addEOF)
                    }
                } finally {
                    if (removed) {
                        calledRuleStack.set(s.ruleIndex)
                    }
                }
                return
            }
        }

        val n = s.numberOfTransitions
        for (i in 0 until n) {
            val t = s.transition(i)

            if (t is RuleTransition) {
                if (calledRuleStack.get((t as RuleTransition).target!!.ruleIndex)) {
                    continue
                }

                val newContext = SingletonPredictionContext.create(ctx, (t as RuleTransition).followState.stateNumber)

                try {
                    calledRuleStack.set((t as RuleTransition).target!!.ruleIndex)
                    _LOOK(t.target!!, stopState, newContext, look, lookBusy, calledRuleStack, seeThruPreds, addEOF)
                } finally {
                    calledRuleStack.clear((t as RuleTransition).target!!.ruleIndex)
                }
            } else if (t is AbstractPredicateTransition) {
                if (seeThruPreds) {
                    _LOOK(t.target!!, stopState, ctx, look, lookBusy, calledRuleStack, seeThruPreds, addEOF)
                } else {
                    look.add(HIT_PRED)
                }
            } else if (t.isEpsilon) {
                _LOOK(t.target!!, stopState, ctx, look, lookBusy, calledRuleStack, seeThruPreds, addEOF)
            } else if (t is WildcardTransition) {
                look.addAll(IntervalSet.of(Token.MIN_USER_TOKEN_TYPE, atn.maxTokenType))
            } else {
                //				System.out.println("adding "+ t);
                var set = t.accessLabel()
                if (set != null) {
                    if (t is NotSetTransition) {
                        set = set!!.complement(IntervalSet.of(Token.MIN_USER_TOKEN_TYPE, atn.maxTokenType))
                    }
                    look.addAll(set)
                }
            }
        }
    }

    companion object {
        /** Special value added to the lookahead sets to indicate that we hit
         * a predicate during analysis if `seeThruPreds==false`.
         */
        val HIT_PRED = Token.INVALID_TYPE
    }
}
