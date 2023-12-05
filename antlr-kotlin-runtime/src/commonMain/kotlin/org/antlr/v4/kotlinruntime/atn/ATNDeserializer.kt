/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.IntervalSet

//import java.io.InvalidClassException
//import java.util.ArrayList
//import java.util.Locale
//import java.util.UUID

///**
// *
// * @author Sam Harwell
// */
class ATNDeserializer constructor(deserializationOptions: ATNDeserializationOptions? = ATNDeserializationOptions.defaultOptions) {

    private val deserializationOptions: ATNDeserializationOptions

    internal interface UnicodeDeserializer {
        // Wrapper for readInt() or readInt32()
        fun readUnicode(data: CharArray, p: Int): Int

        // Work around Java not allowing mutation of captured variables
        // by returning amount by which to increment p after each read
        fun size(): Int
    }

    internal enum class UnicodeDeserializingMode {
        UNICODE_BMP,
        UNICODE_SMP
    }

    init {
        var deserializationOptions = deserializationOptions
        if (deserializationOptions == null) {
            deserializationOptions = ATNDeserializationOptions.defaultOptions
        }

        this.deserializationOptions = deserializationOptions
    }

    fun decodeIntsEncodedAs16BitWords(data16: CharArray): IntArray {
        return decodeIntsEncodedAs16BitWords(data16, false)
    }

    /** Convert a list of chars (16 uint) that represent a serialized and compressed list of ints for an ATN.
     * This method pairs with [.encodeIntsWith16BitWords] above. Used only for Java Target.
     */
    fun decodeIntsEncodedAs16BitWords(data16: CharArray, trimToSize: Boolean): IntArray {
        // will be strictly smaller but we waste bit of space to avoid copying during initialization of parsers
        val data = IntArray(data16.size)
        var i = 0
        var i2 = 0
        while (i < data16.size) {
            val v = data16[i++]
            if (v.code and 0x8000 == 0) { // hi bit not set? Implies 1-word value
                data[i2++] = v.code // 7 bit int
            } else { // hi bit set. Implies 2-word value
                val vnext = data16[i++]
                if (v.code == 0xFFFF && vnext.code == 0xFFFF) { // is it -1?
                    data[i2++] = -1
                } else { // 31-bit int
                    data[i2++] = v.code and 0x7FFF shl 16 or (vnext.code and 0xFFFF)
                }
            }
        }
        return if (trimToSize) {
            data.copyOf(i2)
        } else data
    }

    fun deserialize(data: CharArray): ATN = deserialize(decodeIntsEncodedAs16BitWords(data))

    fun deserialize(data: IntArray): ATN {
        var p = 0
        val version = data[p++]
        if (version != SERIALIZED_VERSION) {
            val reason = "Could not deserialize ATN with version $version (expected $SERIALIZED_VERSION)."
            throw UnsupportedOperationException(reason)
        }

        val grammarType = ATNType.values()[data[p++]]
        val maxTokenType = data[p++]
        val atn = ATN(grammarType, maxTokenType)

        //
        // STATES
        //
        val loopBackStateNumbers = ArrayList<Pair<LoopEndState, Int>>()
        val endStateNumbers = ArrayList<Pair<BlockStartState, Int>>()
        val nstates = data[p++]
        for (i in 0 until nstates) {
            val stype = data[p++]
            // ignore bad type of states
            if (stype == ATNState.INVALID_TYPE) {
                atn.addState(null)
                continue
            }

            var ruleIndex = data[p++]
            if (ruleIndex == Char.MAX_VALUE.toInt()) {
                ruleIndex = -1
            }

            val s = stateFactory(stype, ruleIndex)
            if (stype == ATNState.LOOP_END) { // special case
                val loopBackStateNumber = data[p++]
                loopBackStateNumbers.add(Pair(s as LoopEndState, loopBackStateNumber))
            } else if (s is BlockStartState) {
                val endStateNumber = data[p++]
                endStateNumbers.add(Pair(s, endStateNumber))
            }
            atn.addState(s)
        }

        // delay the assignment of loop back and end states until we know all the state instances have been initialized
        for (pair in loopBackStateNumbers) {
            pair.first.loopBackState = atn.states[pair.second]
        }

        for (pair in endStateNumbers) {
            pair.first.endState = atn.states[pair.second] as BlockEndState
        }

        val numNonGreedyStates = data[p++]
        for (i in 0 until numNonGreedyStates) {
            val stateNumber = data[p++]
            (atn.states.get(stateNumber) as DecisionState).nonGreedy = true
        }

        val numPrecedenceStates = data[p++]
        for (i in 0 until numPrecedenceStates) {
            val stateNumber = data[p++]
            (atn.states.get(stateNumber) as RuleStartState).isLeftRecursiveRule = true
        }

        //
        // RULES
        //
        val nrules = data[p++]
        if (atn.grammarType == ATNType.LEXER) {
            atn.ruleToTokenType = IntArray(nrules)
        }

        atn.ruleToStartState = arrayOfNulls<RuleStartState>(nrules)
        for (i in 0 until nrules) {
            val s = data[p++]
            val startState = atn.states[s] as RuleStartState
            atn.ruleToStartState!![i] = startState
            if (atn.grammarType == ATNType.LEXER) {
                val tokenType = data[p++]
                atn.ruleToTokenType!![i] = tokenType
            }
        }

        atn.ruleToStopState = arrayOfNulls<RuleStopState>(nrules)
        for (state in atn.states) {
            if (state !is RuleStopState) {
                continue
            }

            val stopState = state
            atn.ruleToStopState!![state.ruleIndex] = stopState
            atn.ruleToStartState!![state.ruleIndex]!!.stopState = stopState
        }

        //
        // MODES
        //
        val nmodes = data[p++]
        for (i in 0 until nmodes) {
            val s = data[p++]
            atn.modeToStartState.add(atn.states.get(s) as TokensStartState)
        }

        //
        // SETS
        //
        val sets = ArrayList<IntervalSet>()

        // First, read all sets with 16-bit Unicode code points <= U+FFFF.
        p = deserializeSets(data, p, sets)

        //
        // EDGES
        //
        val nedges = data[p++]
        for (i in 0 until nedges) {
            val src = data[p]
            val trg = data[p + 1]
            val ttype = data[p + 2]
            val arg1 = data[p + 3]
            val arg2 = data[p + 4]
            val arg3 = data[p + 5]
            val trans = edgeFactory(atn, ttype, src, trg, arg1, arg2, arg3, sets)
            //			System.out.println("EDGE "+trans.getClass().getSimpleName()+" "+
            //							   src+"->"+trg+
            //					   " "+Transition.serializationNames[ttype]+
            //					   " "+arg1+","+arg2+","+arg3);
            val srcState = atn.states.get(src)
            srcState!!.addTransition(trans)
            p += 6
        }

        // edges for rule stop states can be derived, so they aren't serialized
        for (state in atn.states) {
            for (i in 0 until state!!.numberOfTransitions) {
                val t = state!!.transition(i) as? RuleTransition ?: continue

                val ruleTransition = t as RuleTransition
                var outermostPrecedenceReturn = -1
                if (atn.ruleToStartState!![ruleTransition.target!!.ruleIndex]!!.isLeftRecursiveRule) {
                    if (ruleTransition.precedence == 0) {
                        outermostPrecedenceReturn = ruleTransition.target!!.ruleIndex
                    }
                }

                val returnTransition = EpsilonTransition(ruleTransition.followState, outermostPrecedenceReturn)
                atn.ruleToStopState!![ruleTransition!!.target!!.ruleIndex]!!.addTransition(returnTransition)
            }
        }

        for (state in atn.states) {
            if (state is BlockStartState) {
                // we need to know the end state to set its start state
                if ((state as BlockStartState).endState == null) {
                    throw IllegalStateException()
                }

                // block end states can only be associated to a single block start state
                if ((state as BlockStartState).endState!!.startState != null) {
                    throw IllegalStateException()
                }

                (state as BlockStartState).endState!!.startState = state as BlockStartState
            }

            if (state is PlusLoopbackState) {
                val loopbackState = state as PlusLoopbackState
                for (i in 0 until loopbackState.numberOfTransitions) {
                    val target = loopbackState.transition(i).target
                    if (target is PlusBlockStartState) {
                        (target as PlusBlockStartState).loopBackState = loopbackState
                    }
                }
            } else if (state is StarLoopbackState) {
                val loopbackState = state as StarLoopbackState
                for (i in 0 until loopbackState.numberOfTransitions) {
                    val target = loopbackState.transition(i).target
                    if (target is StarLoopEntryState) {
                        (target as StarLoopEntryState).loopBackState = loopbackState
                    }
                }
            }
        }

        //
        // DECISIONS
        //
        val ndecisions = data[p++]
        for (i in 1..ndecisions) {
            val s = data[p++]
            val decState = atn.states.get(s) as DecisionState
            atn.decisionToState.add(decState)
            decState.decision = i - 1
        }

        //
        // LEXER ACTIONS
        //
        if (atn.grammarType == ATNType.LEXER) {
            atn.lexerActions = arrayOfNulls<LexerAction>(data[p++])
            for (i in atn.lexerActions!!.indices) {
                val actionType = LexerActionType.values()[data[p++]]
                var data1 = data[p++]
                if (data1 == 0xFFFF) {
                    data1 = -1
                }

                var data2 = data[p++]
                if (data2 == 0xFFFF) {
                    data2 = -1
                }

                val lexerAction = lexerActionFactory(actionType, data1, data2)

                atn.lexerActions!![i] = lexerAction
            }
        }

        markPrecedenceDecisions(atn)

        if (deserializationOptions.isVerifyATN) {
            verifyATN(atn)
        }

        if (deserializationOptions.isGenerateRuleBypassTransitions && atn.grammarType == ATNType.PARSER) {
            atn.ruleToTokenType = IntArray(atn.ruleToStartState!!.size)
            for (i in atn.ruleToStartState!!.indices) {
                atn.ruleToTokenType!![i] = atn.maxTokenType + i + 1
            }

            for (i in atn.ruleToStartState!!.indices) {
                val bypassStart = BasicBlockStartState()
                bypassStart.ruleIndex = i
                atn.addState(bypassStart)

                val bypassStop = BlockEndState()
                bypassStop.ruleIndex = i
                atn.addState(bypassStop)

                bypassStart.endState = bypassStop
                atn.defineDecisionState(bypassStart)

                bypassStop.startState = bypassStart

                var endState: ATNState?
                var excludeTransition: Transition? = null
                if (atn.ruleToStartState!![i]!!.isLeftRecursiveRule) {
                    // wrap from the beginning of the rule to the StarLoopEntryState
                    endState = null
                    for (state in atn.states) {
                        if (state!!.ruleIndex != i) {
                            continue
                        }

                        if (state !is StarLoopEntryState) {
                            continue
                        }

                        val maybeLoopEndState = state.transition(state.numberOfTransitions - 1).target as? LoopEndState
                            ?: continue

                        if (maybeLoopEndState.epsilonOnlyTransitions && maybeLoopEndState.transition(0).target is RuleStopState) {
                            endState = state
                            break
                        }
                    }

                    if (endState == null) {
                        throw UnsupportedOperationException("Couldn't identify final state of the precedence rule prefix section.")
                    }

                    excludeTransition = (endState as StarLoopEntryState).loopBackState!!.transition(0)
                } else {
                    endState = atn.ruleToStopState!![i]
                }

                // all non-excluded transitions that currently target end state need to target blockEnd instead
                for (state in atn.states) {
                    for (transition in state!!.transitions) {
                        if (transition === excludeTransition) {
                            continue
                        }

                        if (transition.target === endState) {
                            transition.target = bypassStop
                        }
                    }
                }

                // all transitions leaving the rule start state need to leave blockStart instead
                while (atn.ruleToStartState!![i]!!.numberOfTransitions > 0) {
                    val transition =
                        atn.ruleToStartState!![i]!!.removeTransition(atn.ruleToStartState!![i]!!.numberOfTransitions - 1)
                    bypassStart.addTransition(transition)
                }

                // link the new states
                atn.ruleToStartState!![i]!!.addTransition(EpsilonTransition(bypassStart))
                bypassStop.addTransition(EpsilonTransition(endState!!))

                val matchState = BasicState()
                atn.addState(matchState)
                matchState.addTransition(AtomTransition(bypassStop, atn.ruleToTokenType!![i]))
                bypassStart.addTransition(EpsilonTransition(matchState))
            }

            if (deserializationOptions.isVerifyATN) {
                // reverify after modification
                verifyATN(atn)
            }
        }

        return atn
    }

    private fun deserializeSets(data: IntArray, p: Int, sets: MutableList<IntervalSet>): Int {
        var p = p
        val nsets = data[p++]
        for (i in 0 until nsets) {
            val nintervals = data[p]
            p++
            val set = IntervalSet()
            sets.add(set)

            val containsEof = data[p++] != 0
            if (containsEof) {
                set.add(-1)
            }

            for (j in 0 until nintervals) {
                val a = data[p++]
                val b = data[p++]
                set.add(a, b)
            }
        }
        return p
    }

    /**
     * Analyze the [StarLoopEntryState] states in the specified ATN to set
     * the [StarLoopEntryState.isPrecedenceDecision] field to the
     * correct value.
     *
     * @param atn The ATN.
     */
    protected fun markPrecedenceDecisions(atn: ATN) {
        for (state in atn.states) {
            if (state !is StarLoopEntryState) {
                continue
            }

            /* We analyze the ATN to determine if this ATN decision state is the
			 * decision for the closure block that determines whether a
			 * precedence rule should continue or complete.
			 */
            if (atn.ruleToStartState!![state.ruleIndex]!!.isLeftRecursiveRule) {
                val maybeLoopEndState = state.transition(state.numberOfTransitions - 1).target
                if (maybeLoopEndState is LoopEndState) {
                    if (maybeLoopEndState.epsilonOnlyTransitions && maybeLoopEndState.transition(0).target is RuleStopState) {
                        (state as StarLoopEntryState).isPrecedenceDecision = true
                    }
                }
            }
        }
    }

    protected fun verifyATN(atn: ATN) {
        // verify assumptions
        for (state in atn.states) {
            if (state == null) {
                continue
            }

            checkCondition(state!!.onlyHasEpsilonTransitions() || state!!.numberOfTransitions <= 1)

            if (state is PlusBlockStartState) {
                checkCondition((state as PlusBlockStartState).loopBackState != null)
            }

            if (state is StarLoopEntryState) {
                val starLoopEntryState = state as StarLoopEntryState
                checkCondition(starLoopEntryState!!.loopBackState != null)
                checkCondition(starLoopEntryState!!.numberOfTransitions == 2)

                if (starLoopEntryState!!.transition(0).target is StarBlockStartState) {
                    checkCondition(starLoopEntryState!!.transition(1).target is LoopEndState)
                    checkCondition(!starLoopEntryState!!.nonGreedy)
                } else if (starLoopEntryState!!.transition(0).target is LoopEndState) {
                    checkCondition(starLoopEntryState!!.transition(1).target is StarBlockStartState)
                    checkCondition(starLoopEntryState!!.nonGreedy)
                } else {
                    throw IllegalStateException()
                }
            }

            if (state is StarLoopbackState) {
                checkCondition(state!!.numberOfTransitions == 1)
                checkCondition(state!!.transition(0).target is StarLoopEntryState)
            }

            if (state is LoopEndState) {
                checkCondition((state as LoopEndState).loopBackState != null)
            }

            if (state is RuleStartState) {
                checkCondition((state as RuleStartState).stopState != null)
            }

            if (state is BlockStartState) {
                checkCondition((state as BlockStartState).endState != null)
            }

            if (state is BlockEndState) {
                checkCondition((state as BlockEndState).startState != null)
            }

            if (state is DecisionState) {
                val decisionState = state as DecisionState
                checkCondition(decisionState!!.numberOfTransitions <= 1 || decisionState!!.decision >= 0)
            } else {
                checkCondition(state!!.numberOfTransitions <= 1 || state is RuleStopState)
            }
        }
    }
//

    fun checkCondition(condition: Boolean, message: String? = null) {
        if (!condition) {
            throw IllegalStateException(message!!)
        }
    }


    fun edgeFactory(
        atn: ATN,
        type: Int, src: Int, trg: Int,
        arg1: Int, arg2: Int, arg3: Int,
        sets: List<IntervalSet>
    ): Transition {
        val target = atn.states.get(trg)!!
        when (type) {
            Transition.EPSILON -> return EpsilonTransition(target)
            Transition.RANGE -> return if (arg3 != 0) {
                RangeTransition(target, Token.EOF, arg2)
            } else {
                RangeTransition(target, arg1, arg2)
            }

            Transition.RULE -> {
                return RuleTransition(atn.states.get(arg1) as RuleStartState, arg2, arg3, target)
            }

            Transition.PREDICATE -> {
                return PredicateTransition(target, arg1, arg2, arg3 != 0)
            }

            Transition.PRECEDENCE -> return PrecedencePredicateTransition(target, arg1)
            Transition.ATOM -> return if (arg3 != 0) {
                AtomTransition(target, Token.EOF)
            } else {
                AtomTransition(target, arg1)
            }

            Transition.ACTION -> {
                return ActionTransition(target, arg1, arg2, arg3 != 0)
            }

            Transition.SET -> return SetTransition(target, sets[arg1])
            Transition.NOT_SET -> return NotSetTransition(target, sets[arg1])
            Transition.WILDCARD -> return WildcardTransition(target)
        }

        throw IllegalArgumentException("The specified transition type is not valid.")
    }

    fun stateFactory(type: Int, ruleIndex: Int): ATNState? {
        val s: ATNState
        when (type) {
            ATNState.INVALID_TYPE -> return null
            ATNState.BASIC -> s = BasicState()
            ATNState.RULE_START -> s = RuleStartState()
            ATNState.BLOCK_START -> s = BasicBlockStartState()
            ATNState.PLUS_BLOCK_START -> s = PlusBlockStartState()
            ATNState.STAR_BLOCK_START -> s = StarBlockStartState()
            ATNState.TOKEN_START -> s = TokensStartState()
            ATNState.RULE_STOP -> s = RuleStopState()
            ATNState.BLOCK_END -> s = BlockEndState()
            ATNState.STAR_LOOP_BACK -> s = StarLoopbackState()
            ATNState.STAR_LOOP_ENTRY -> s = StarLoopEntryState()
            ATNState.PLUS_LOOP_BACK -> s = PlusLoopbackState()
            ATNState.LOOP_END -> s = LoopEndState()
            else -> {
                val message = "The specified state type $type is not valid."
                throw IllegalArgumentException(message)
            }
        }

        s.ruleIndex = ruleIndex
        return s
    }

    protected fun lexerActionFactory(type: LexerActionType, data1: Int, data2: Int): LexerAction {
        when (type) {
            LexerActionType.CHANNEL -> return LexerChannelAction(data1)

            LexerActionType.CUSTOM -> return LexerCustomAction(data1, data2)

            LexerActionType.MODE -> return LexerModeAction(data1)

            LexerActionType.MORE -> return LexerMoreAction.INSTANCE

            LexerActionType.POP_MODE -> return LexerPopModeAction.INSTANCE

            LexerActionType.PUSH_MODE -> return LexerPushModeAction(data1)

            LexerActionType.SKIP -> return LexerSkipAction.INSTANCE

            LexerActionType.TYPE -> return LexerTypeAction(data1)

            else -> {
                val message = "The specified lexer action type $type is not valid."
                throw IllegalArgumentException(message)
            }
        }
    }

    companion object {
        val SERIALIZED_VERSION: Int

        init {
            /* This value should never change. Updates following this version are
		 * reflected as change in the unique ID SERIALIZED_UUID.
		 */
            SERIALIZED_VERSION = 4
        }
    }
}
