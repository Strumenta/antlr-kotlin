/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.UUID
import com.strumenta.kotlinmultiplatform.maxValue
import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.IntervalSet
import org.antlr.v4.kotlinruntime.misc.Pair

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

    fun deserialize(data: CharArray): ATN {
        var data = data
        data = data.copyOf()

        // Each char value in data is shifted by +2 at the entry to this method.
        // This is an encoding optimization targeting the serialized values 0
        // and -1 (serialized to 0xFFFF), each of which are very common in the
        // serialized form of the ATN. In the modified UTF-8 that Java uses for
        // compiled string literals, these two character values have multi-byte
        // forms. By shifting each value by +2, they become characters 2 and 1
        // prior to writing the string, each of which have single-byte
        // representations. Since the shift occurs in the tool during ATN
        // serialization, each target is responsible for adjusting the values
        // during deserialization.
        //
        // As a special case, note that the first element of data is not
        // adjusted because it contains the major version number of the
        // serialized ATN, which was fixed at 3 at the time the value shifting
        // was implemented.
        for (i in 1 until data.size) {
            data[i] = (data[i].toInt() - 2).toChar()
        }

        var p = 0
        val version = toInt(data[p++])
        if (version != SERIALIZED_VERSION) {
            val reason = "Could not deserialize ATN with version $version (expected $SERIALIZED_VERSION)."
            throw UnsupportedOperationException(reason)
        }

        val uuid = toUUID(data, p)
        p += 8
        if (!SUPPORTED_UUIDS.contains(uuid)) {
            val reason = "Could not deserialize ATN with UUID $uuid (expected $SERIALIZED_UUID or a legacy UUID)."
            throw UnsupportedOperationException(reason)
        }

        val supportsPrecedencePredicates = isFeatureSupported(ADDED_PRECEDENCE_TRANSITIONS, uuid)
        val supportsLexerActions = isFeatureSupported(ADDED_LEXER_ACTIONS, uuid)

        val grammarType = ATNType.values()[toInt(data[p++])]
        val maxTokenType = toInt(data[p++])
        val atn = ATN(grammarType, maxTokenType)

        //
        // STATES
        //
        val loopBackStateNumbers = ArrayList<Pair<LoopEndState, Int>>()
        val endStateNumbers = ArrayList<Pair<BlockStartState, Int>>()
        val nstates = toInt(data[p++])
        for (i in 0 until nstates) {
            val stype = toInt(data[p++])
            // ignore bad type of states
            if (stype == ATNState.INVALID_TYPE) {
                atn.addState(null)
                continue
            }

            var ruleIndex = toInt(data[p++])
            if (ruleIndex == Char.maxValue().toInt()) {
                ruleIndex = -1
            }

            val s = stateFactory(stype, ruleIndex)
            if (stype == ATNState.LOOP_END) { // special case
                val loopBackStateNumber = toInt(data[p++])
                loopBackStateNumbers.add(Pair<LoopEndState, Int>(s as LoopEndState?, loopBackStateNumber))
            } else if (s is BlockStartState) {
                val endStateNumber = toInt(data[p++])
                endStateNumbers.add(Pair<BlockStartState, Int>(s as BlockStartState?, endStateNumber))
            }
            atn.addState(s)
        }

        // delay the assignment of loop back and end states until we know all the state instances have been initialized
        for (pair in loopBackStateNumbers) {
            pair.a!!.loopBackState = atn.states.get(pair.b!!)
        }

        for (pair in endStateNumbers) {
            pair.a!!.endState = atn.states.get(pair.b!!) as BlockEndState
        }

        val numNonGreedyStates = toInt(data[p++])
        for (i in 0 until numNonGreedyStates) {
            val stateNumber = toInt(data[p++])
            (atn.states.get(stateNumber) as DecisionState).nonGreedy = true
        }

        if (supportsPrecedencePredicates) {
            val numPrecedenceStates = toInt(data[p++])
            for (i in 0 until numPrecedenceStates) {
                val stateNumber = toInt(data[p++])
                (atn.states.get(stateNumber) as RuleStartState).isLeftRecursiveRule = true
            }
        }

        //
        // RULES
        //
        val nrules = toInt(data[p++])
        if (atn.grammarType == ATNType.LEXER) {
            atn.ruleToTokenType = IntArray(nrules)
        }

        atn.ruleToStartState = arrayOfNulls<RuleStartState>(nrules)
        for (i in 0 until nrules) {
            val s = toInt(data[p++])
            val startState = atn.states.get(s) as RuleStartState
            atn.ruleToStartState!![i] = startState
            if (atn.grammarType == ATNType.LEXER) {
                var tokenType = toInt(data[p++])
                if (tokenType == 0xFFFF) {
                    tokenType = Token.EOF
                }

                atn.ruleToTokenType!![i] = tokenType

                if (!isFeatureSupported(ADDED_LEXER_ACTIONS, uuid)) {
                    // this piece of unused metadata was serialized prior to the
                    // addition of LexerAction
                    val actionIndexIgnored = toInt(data[p++])
                }
            }
        }

        atn.ruleToStopState = arrayOfNulls<RuleStopState>(nrules)
        for (state in atn.states) {
            if (state !is RuleStopState) {
                continue
            }

            val stopState = state as RuleStopState
            atn.ruleToStopState!![state.ruleIndex] = stopState
            atn.ruleToStartState!![state.ruleIndex]!!.stopState = stopState
        }

        //
        // MODES
        //
        val nmodes = toInt(data[p++])
        for (i in 0 until nmodes) {
            val s = toInt(data[p++])
            atn.modeToStartState.add(atn.states.get(s) as TokensStartState)
        }

        //
        // SETS
        //
        val sets = ArrayList<IntervalSet>()

        // First, read all sets with 16-bit Unicode code points <= U+FFFF.
        p = deserializeSets(data, p, sets, getUnicodeDeserializer(UnicodeDeserializingMode.UNICODE_BMP))

        // Next, if the ATN was serialized with the Unicode SMP feature,
        // deserialize sets with 32-bit arguments <= U+10FFFF.
        if (isFeatureSupported(ADDED_UNICODE_SMP, uuid)) {
            p = deserializeSets(data, p, sets, getUnicodeDeserializer(UnicodeDeserializingMode.UNICODE_SMP))
        }

        //
        // EDGES
        //
        val nedges = toInt(data[p++])
        for (i in 0 until nedges) {
            val src = toInt(data[p])
            val trg = toInt(data[p + 1])
            val ttype = toInt(data[p + 2])
            val arg1 = toInt(data[p + 3])
            val arg2 = toInt(data[p + 4])
            val arg3 = toInt(data[p + 5])
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
        val ndecisions = toInt(data[p++])
        for (i in 1..ndecisions) {
            val s = toInt(data[p++])
            val decState = atn.states.get(s) as DecisionState
            atn.decisionToState.add(decState)
            decState.decision = i - 1
        }

        //
        // LEXER ACTIONS
        //
        if (atn.grammarType == ATNType.LEXER) {
            if (supportsLexerActions) {
                atn.lexerActions = arrayOfNulls<LexerAction>(toInt(data[p++]))
                for (i in atn.lexerActions!!.indices) {
                    val actionType = LexerActionType.values()[toInt(data[p++])]
                    var data1 = toInt(data[p++])
                    if (data1 == 0xFFFF) {
                        data1 = -1
                    }

                    var data2 = toInt(data[p++])
                    if (data2 == 0xFFFF) {
                        data2 = -1
                    }

                    val lexerAction = lexerActionFactory(actionType, data1, data2)

                    atn.lexerActions!![i] = lexerAction
                }
            } else {
                // for compatibility with older serialized ATNs, convert the old
                // serialized action index for action transitions to the new
                // form, which is the index of a LexerCustomAction
                val legacyLexerActions = ArrayList<LexerAction>()
                for (state in atn.states) {
                    for (i in 0 until state!!.numberOfTransitions) {
                        val transition = state!!.transition(i) as? ActionTransition ?: continue

                        val ruleIndex = (transition as ActionTransition).ruleIndex
                        val actionIndex = (transition as ActionTransition).actionIndex
                        val lexerAction = LexerCustomAction(ruleIndex, actionIndex)
                        state.setTransition(i, ActionTransition(transition.target!!, ruleIndex, legacyLexerActions.size, false))
                        legacyLexerActions.add(lexerAction)
                    }
                }

                atn.lexerActions = legacyLexerActions.toTypedArray<LexerAction?>()
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

                        val maybeLoopEndState = state.transition(state.numberOfTransitions - 1).target as? LoopEndState ?: continue

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
                    val transition = atn.ruleToStartState!![i]!!.removeTransition(atn.ruleToStartState!![i]!!.numberOfTransitions - 1)
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

    private fun deserializeSets(data: CharArray, p: Int, sets: MutableList<IntervalSet>, unicodeDeserializer: UnicodeDeserializer): Int {
        var p = p
        val nsets = toInt(data[p++])
        for (i in 0 until nsets) {
            val nintervals = toInt(data[p])
            p++
            val set = IntervalSet()
            sets.add(set)

            val containsEof = toInt(data[p++]) != 0
            if (containsEof) {
                set.add(-1)
            }

            for (j in 0 until nintervals) {
                val a = unicodeDeserializer.readUnicode(data, p)
                p += unicodeDeserializer.size()
                val b = unicodeDeserializer.readUnicode(data, p)
                p += unicodeDeserializer.size()
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


    fun edgeFactory(atn: ATN,
                    type: Int, src: Int, trg: Int,
                    arg1: Int, arg2: Int, arg3: Int,
                    sets: List<IntervalSet>): Transition {
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
            SERIALIZED_VERSION = 3
        }

        /**
         * This is the earliest supported serialized UUID.
         */
        private val BASE_SERIALIZED_UUID: UUID
        /**
         * This UUID indicates an extension of [BASE_SERIALIZED_UUID] for the
         * addition of precedence predicates.
         */
        private val ADDED_PRECEDENCE_TRANSITIONS: UUID
        /**
         * This UUID indicates an extension of [.ADDED_PRECEDENCE_TRANSITIONS]
         * for the addition of lexer actions encoded as a sequence of
         * [LexerAction] instances.
         */
        private val ADDED_LEXER_ACTIONS: UUID
        /**
         * This UUID indicates the serialized ATN contains two sets of
         * IntervalSets, where the second set's values are encoded as
         * 32-bit integers to support the full Unicode SMP range up to U+10FFFF.
         */
        private val ADDED_UNICODE_SMP: UUID
        /**
         * This list contains all of the currently supported UUIDs, ordered by when
         * the feature first appeared in this branch.
         */
        private val SUPPORTED_UUIDS: MutableList<UUID>
//
        /**
         * This is the current serialized UUID.
         */
        val SERIALIZED_UUID: UUID

        init {
            /* WARNING: DO NOT MERGE THESE LINES. If UUIDs differ during a merge,
		 * resolve the conflict by generating a new ID!
		 */
            BASE_SERIALIZED_UUID = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3")
            ADDED_PRECEDENCE_TRANSITIONS = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61")
            ADDED_LEXER_ACTIONS = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E")
            ADDED_UNICODE_SMP = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089")

            SUPPORTED_UUIDS = ArrayList()
            SUPPORTED_UUIDS.add(BASE_SERIALIZED_UUID)
            SUPPORTED_UUIDS.add(ADDED_PRECEDENCE_TRANSITIONS)
            SUPPORTED_UUIDS.add(ADDED_LEXER_ACTIONS)
            SUPPORTED_UUIDS.add(ADDED_UNICODE_SMP)

            SERIALIZED_UUID = ADDED_UNICODE_SMP
        }

        internal fun getUnicodeDeserializer(mode: UnicodeDeserializingMode): UnicodeDeserializer {
            return if (mode == UnicodeDeserializingMode.UNICODE_BMP) {
                object : UnicodeDeserializer {
                    override fun readUnicode(data: CharArray, p: Int): Int {
                        return data[p].toInt()
                    }

                    override fun size(): Int {
                        return 1
                    }
                }
            } else {
                object : UnicodeDeserializer {
                    override fun readUnicode(data: CharArray, p: Int): Int {
                        return toInt32(data, p)
                    }

                    override fun size(): Int {
                        return 2
                    }
                }
            }
        }

        /**
         * Determines if a particular serialized representation of an ATN supports
         * a particular feature, identified by the [UUID] used for serializing
         * the ATN at the time the feature was first introduced.
         *
         * @param feature The [UUID] marking the first time the feature was
         * supported in the serialized ATN.
         * @param actualUuid The [UUID] of the actual serialized ATN which is
         * currently being deserialized.
         * @return `true` if the `actualUuid` value represents a
         * serialized ATN at or after the feature identified by `feature` was
         * introduced; otherwise, `false`.
         */
        protected fun isFeatureSupported(feature: UUID, actualUuid: UUID): Boolean {
            val featureIndex = SUPPORTED_UUIDS.indexOf(feature)
            return if (featureIndex < 0) {
                false
            } else SUPPORTED_UUIDS.indexOf(actualUuid) >= featureIndex

        }

        fun toInt(c: Char): Int {
            return c.toInt()
        }

        fun toInt32(data: CharArray, offset: Int): Int {
            return data[offset].toInt() or (data[offset + 1].toInt() shl 16)
        }

        fun toLong(data: CharArray, offset: Int): Long {
            val lowOrder = toInt32(data, offset).toLong() and 0x00000000FFFFFFFFL
            return lowOrder or (toInt32(data, offset + 2).toLong() shl 32)
        }

        fun toUUID(data: CharArray, offset: Int): UUID {
            val leastSigBits = toLong(data, offset)
            val mostSigBits = toLong(data, offset + 4)
            return UUID(mostSigBits, leastSigBits)
        }
    }

    fun deserializeIntegers(serializedIntegersATN: Array<Int>): ATN {
        val chars = serializedIntegersATN.map { it.toChar() }.toCharArray()
        return deserialize(chars)
    }

}
