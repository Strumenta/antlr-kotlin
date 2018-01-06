/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.IntegerList
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.misc.IntervalSet
import org.antlr.v4.kotlinruntime.misc.Utils

//import java.io.InvalidClassException
//import java.util.*
//
//class ATNSerializer {
//    var atn: ATN
//    private val tokenNames: List<String>?
//
//    private interface CodePointSerializer {
//        fun serializeCodePoint(data: IntegerList, cp: Int)
//    }
//
//    constructor(atn: ATN) {
//        assert(atn.grammarType != null)
//        this.atn = atn
//    }
//
//    constructor(atn: ATN, tokenNames: List<String>) {
//        assert(atn.grammarType != null)
//        this.atn = atn
//        this.tokenNames = tokenNames
//    }
//
//    /** Serialize state descriptors, edge descriptors, and decisionstate map
//     * into list of ints:
//     *
//     * grammar-type, (ANTLRParser.LEXER, ...)
//     * max token type,
//     * num states,
//     * state-0-type ruleIndex, state-1-type ruleIndex, ... state-i-type ruleIndex optional-arg ...
//     * num rules,
//     * rule-1-start-state rule-1-args, rule-2-start-state  rule-2-args, ...
//     * (args are token type,actionIndex in lexer else 0,0)
//     * num modes,
//     * mode-0-start-state, mode-1-start-state, ... (parser has 0 modes)
//     * num unicode-bmp-sets
//     * bmp-set-0-interval-count intervals, bmp-set-1-interval-count intervals, ...
//     * num unicode-smp-sets
//     * smp-set-0-interval-count intervals, smp-set-1-interval-count intervals, ...
//     * num total edges,
//     * src, trg, edge-type, edge arg1, optional edge arg2 (present always), ...
//     * num decisions,
//     * decision-0-start-state, decision-1-start-state, ...
//     *
//     * Convenient to pack into unsigned shorts to make as Java string.
//     */
//    fun serialize(): IntegerList {
//        val data = IntegerList()
//        data.add(ATNDeserializer.SERIALIZED_VERSION)
//        serializeUUID(data, ATNDeserializer.SERIALIZED_UUID)
//
//        // convert grammar type to ATN const to avoid dependence on ANTLRParser
//        data.add(atn.grammarType.ordinal)
//        data.add(atn.maxTokenType)
//        var nedges = 0
//
//        // Note that we use a LinkedHashMap as a set to
//        // maintain insertion order while deduplicating
//        // entries with the same key.
//        val sets = LinkedHashMap<K, V>()
//
//        // dump states, count edges and collect sets while doing so
//        val nonGreedyStates = IntegerList()
//        val precedenceStates = IntegerList()
//        data.add(atn.states.size)
//        for (s in atn.states) {
//            if (s == null) { // might be optimized away
//                data.add(ATNState.INVALID_TYPE)
//                continue
//            }
//
//            val stateType = s!!.stateType
//            if (s is DecisionState && (s as DecisionState).nonGreedy) {
//                nonGreedyStates.add(s!!.stateNumber)
//            }
//
//            if (s is RuleStartState && (s as RuleStartState).isLeftRecursiveRule) {
//                precedenceStates.add(s!!.stateNumber)
//            }
//
//            data.add(stateType)
//
//            if (s!!.ruleIndex == -1) {
//                data.add(Character.MAX_VALUE)
//            } else {
//                data.add(s!!.ruleIndex)
//            }
//
//            if (s!!.stateType == ATNState.LOOP_END) {
//                data.add((s as LoopEndState).loopBackState!!.stateNumber)
//            } else if (s is BlockStartState) {
//                data.add((s as BlockStartState).endState!!.stateNumber)
//            }
//
//            if (s!!.stateType != ATNState.RULE_STOP) {
//                // the deserializer can trivially derive these edges, so there's no need to serialize them
//                nedges += s!!.numberOfTransitions
//            }
//
//            for (i in 0 until s!!.numberOfTransitions) {
//                val t = s!!.transition(i)
//                val edgeType = Transition.serializationTypes.get(t.javaClass)
//                if (edgeType == Transition.SET || edgeType == Transition.NOT_SET) {
//                    val st = t as SetTransition
//                    sets.put(st.set, true)
//                }
//            }
//        }
//
//        // non-greedy states
//        data.add(nonGreedyStates.size())
//        for (i in 0 until nonGreedyStates.size()) {
//            data.add(nonGreedyStates.get(i))
//        }
//
//        // precedence states
//        data.add(precedenceStates.size())
//        for (i in 0 until precedenceStates.size()) {
//            data.add(precedenceStates.get(i))
//        }
//
//        val nrules = atn.ruleToStartState!!.size
//        data.add(nrules)
//        for (r in 0 until nrules) {
//            val ruleStartState = atn.ruleToStartState!![r]
//            data.add(ruleStartState.stateNumber)
//            if (atn.grammarType == ATNType.LEXER) {
//                if (atn.ruleToTokenType!![r] == Token.EOF) {
//                    data.add(Character.MAX_VALUE)
//                } else {
//                    data.add(atn.ruleToTokenType!![r])
//                }
//            }
//        }
//
//        val nmodes = atn.modeToStartState.size
//        data.add(nmodes)
//        if (nmodes > 0) {
//            for (modeStartState in atn.modeToStartState) {
//                data.add(modeStartState.stateNumber)
//            }
//        }
//        val bmpSets = ArrayList<E>()
//        val smpSets = ArrayList<E>()
//        for (set in sets.keys) {
//            if (set.getMaxElement() <= Character.MAX_VALUE) {
//                bmpSets.add(set)
//            } else {
//                smpSets.add(set)
//            }
//        }
//        serializeSets(
//                data,
//                bmpSets,
//                object : CodePointSerializer {
//                    override fun serializeCodePoint(data: IntegerList, cp: Int) {
//                        data.add(cp)
//                    }
//                })
//        serializeSets(
//                data,
//                smpSets,
//                object : CodePointSerializer {
//                    override fun serializeCodePoint(data: IntegerList, cp: Int) {
//                        serializeInt(data, cp)
//                    }
//                })
//        val setIndices = HashMap<K, V>()
//        var setIndex = 0
//        for (bmpSet in bmpSets) {
//            setIndices.put(bmpSet, setIndex++)
//        }
//        for (smpSet in smpSets) {
//            setIndices.put(smpSet, setIndex++)
//        }
//
//        data.add(nedges)
//        for (s in atn.states) {
//            if (s == null) {
//                // might be optimized away
//                continue
//            }
//
//            if (s!!.stateType == ATNState.RULE_STOP) {
//                continue
//            }
//
//            for (i in 0 until s!!.numberOfTransitions) {
//                val t = s!!.transition(i)
//
//                if (atn.states.get(t.target.stateNumber) == null) {
//                    throw IllegalStateException("Cannot serialize a transition to a removed state.")
//                }
//
//                val src = s!!.stateNumber
//                var trg = t.target.stateNumber
//                val edgeType = Transition.serializationTypes.get(t.javaClass)
//                var arg1 = 0
//                var arg2 = 0
//                var arg3 = 0
//                when (edgeType) {
//                    Transition.RULE -> {
//                        trg = (t as RuleTransition).followState.stateNumber
//                        arg1 = (t as RuleTransition).target.stateNumber
//                        arg2 = (t as RuleTransition).ruleIndex
//                        arg3 = (t as RuleTransition).precedence
//                    }
//                    Transition.PRECEDENCE -> {
//                        val ppt = t as PrecedencePredicateTransition
//                        arg1 = ppt.precedence
//                    }
//                    Transition.PREDICATE -> {
//                        val pt = t as PredicateTransition
//                        arg1 = pt.ruleIndex
//                        arg2 = pt.predIndex
//                        arg3 = if (pt.isCtxDependent) 1 else 0
//                    }
//                    Transition.RANGE -> {
//                        arg1 = (t as RangeTransition).from
//                        arg2 = (t as RangeTransition).to
//                        if (arg1 == Token.EOF) {
//                            arg1 = 0
//                            arg3 = 1
//                        }
//                    }
//                    Transition.ATOM -> {
//                        arg1 = (t as AtomTransition).accessLabel
//                        if (arg1 == Token.EOF) {
//                            arg1 = 0
//                            arg3 = 1
//                        }
//                    }
//                    Transition.ACTION -> {
//                        val at = t as ActionTransition
//                        arg1 = at.ruleIndex
//                        arg2 = at.actionIndex
//                        if (arg2 == -1) {
//                            arg2 = 0xFFFF
//                        }
//
//                        arg3 = if (at.isCtxDependent) 1 else 0
//                    }
//                    Transition.SET -> arg1 = setIndices[(t as SetTransition).set]
//                    Transition.NOT_SET -> arg1 = setIndices[(t as SetTransition).set]
//                    Transition.WILDCARD -> {
//                    }
//                }
//
//                data.add(src)
//                data.add(trg)
//                data.add(edgeType)
//                data.add(arg1)
//                data.add(arg2)
//                data.add(arg3)
//            }
//        }
//
//        val ndecisions = atn.decisionToState.size
//        data.add(ndecisions)
//        for (decStartState in atn.decisionToState) {
//            data.add(decStartState.stateNumber)
//        }
//
//        //
//        // LEXER ACTIONS
//        //
//        if (atn.grammarType == ATNType.LEXER) {
//            data.add(atn.lexerActions!!.size)
//            for (action in atn.lexerActions!!) {
//                data.add(action.actionType.ordinal)
//                when (action.actionType) {
//                    LexerActionType.CHANNEL -> {
//                        val channel = (action as LexerChannelAction).channel
//                        data.add(if (channel != -1) channel else 0xFFFF)
//                        data.add(0)
//                    }
//
//                    LexerActionType.CUSTOM -> {
//                        val ruleIndex = (action as LexerCustomAction).ruleIndex
//                        val actionIndex = (action as LexerCustomAction).actionIndex
//                        data.add(if (ruleIndex != -1) ruleIndex else 0xFFFF)
//                        data.add(if (actionIndex != -1) actionIndex else 0xFFFF)
//                    }
//
//                    LexerActionType.MODE -> {
//                        var mode = (action as LexerModeAction).mode
//                        data.add(if (mode != -1) mode else 0xFFFF)
//                        data.add(0)
//                    }
//
//                    LexerActionType.MORE -> {
//                        data.add(0)
//                        data.add(0)
//                    }
//
//                    LexerActionType.POP_MODE -> {
//                        data.add(0)
//                        data.add(0)
//                    }
//
//                    LexerActionType.PUSH_MODE -> {
//                        mode = (action as LexerPushModeAction).mode
//                        data.add(if (mode != -1) mode else 0xFFFF)
//                        data.add(0)
//                    }
//
//                    LexerActionType.SKIP -> {
//                        data.add(0)
//                        data.add(0)
//                    }
//
//                    LexerActionType.TYPE -> {
//                        val type = (action as LexerTypeAction).type
//                        data.add(if (type != -1) type else 0xFFFF)
//                        data.add(0)
//                    }
//
//                    else -> {
//                        val message = String.format(Locale.getDefault(), "The specified lexer action type %s is not valid.", action.actionType)
//                        throw IllegalArgumentException(message)
//                    }
//                }
//            }
//        }
//
//        // Note: This value shifting loop is documented in ATNDeserializer.
//        // don't adjust the first value since that's the version number
//        for (i in 1 until data.size()) {
//            if (data.get(i) < Character.MIN_VALUE || data.get(i) > Character.MAX_VALUE) {
//                throw UnsupportedOperationException("Serialized ATN data element " +
//                        data.get(i) +
//                        " element " + i + " out of range " +
//                        Character.MIN_VALUE.toInt() +
//                        ".." +
//                        Character.MAX_VALUE.toInt())
//            }
//
//            val value = data.get(i) + 2 and 0xFFFF
//            data.set(i, value)
//        }
//
//        return data
//    }
//
//    fun decode(data: CharArray): String {
//        var data = data
//        data = data.clone()
//        // don't adjust the first value since that's the version number
//        for (i in 1 until data.size) {
//            data[i] = (data[i].toInt() - 2).toChar()
//        }
//
//        val buf = StringBuilder()
//        var p = 0
//        val version = ATNDeserializer.toInt(data[p++])
//        if (version != ATNDeserializer.SERIALIZED_VERSION) {
//            val reason = String.format("Could not deserialize ATN with version %d (expected %d).", version, ATNDeserializer.SERIALIZED_VERSION)
//            throw UnsupportedOperationException(InvalidClassException(ATN::class.java!!.getName(), reason))
//        }
//
//        val uuid = ATNDeserializer.toUUID(data, p)
//        p += 8
//        if (uuid != ATNDeserializer.SERIALIZED_UUID) {
//            val reason = String.format(Locale.getDefault(), "Could not deserialize ATN with UUID %s (expected %s).", uuid, ATNDeserializer.SERIALIZED_UUID)
//            throw UnsupportedOperationException(InvalidClassException(ATN::class.java!!.getName(), reason))
//        }
//
//        p++ // skip grammarType
//        val maxType = ATNDeserializer.toInt(data[p++])
//        buf.append("max type ").append(maxType).append("\n")
//        val nstates = ATNDeserializer.toInt(data[p++])
//        for (i in 0 until nstates) {
//            val stype = ATNDeserializer.toInt(data[p++])
//            if (stype == ATNState.INVALID_TYPE) continue // ignore bad type of states
//            var ruleIndex = ATNDeserializer.toInt(data[p++])
//            if (ruleIndex == Character.MAX_VALUE.toInt()) {
//                ruleIndex = -1
//            }
//
//            var arg = ""
//            if (stype == ATNState.LOOP_END) {
//                val loopBackStateNumber = ATNDeserializer.toInt(data[p++])
//                arg = " " + loopBackStateNumber
//            } else if (stype == ATNState.PLUS_BLOCK_START || stype == ATNState.STAR_BLOCK_START || stype == ATNState.BLOCK_START) {
//                val endStateNumber = ATNDeserializer.toInt(data[p++])
//                arg = " " + endStateNumber
//            }
//            buf.append(i).append(":")
//                    .append(ATNState.serializationNames.get(stype)).append(" ")
//                    .append(ruleIndex).append(arg).append("\n")
//        }
//        // this code is meant to model the form of ATNDeserializer.deserialize,
//        // since both need to be updated together whenever a change is made to
//        // the serialization format. The "dead" code is only used in debugging
//        // and testing scenarios, so the form you see here was kept for
//        // improved maintainability.
//        // start
//        val numNonGreedyStates = ATNDeserializer.toInt(data[p++])
//        for (i in 0 until numNonGreedyStates) {
//            val stateNumber = ATNDeserializer.toInt(data[p++])
//        }
//        val numPrecedenceStates = ATNDeserializer.toInt(data[p++])
//        for (i in 0 until numPrecedenceStates) {
//            val stateNumber = ATNDeserializer.toInt(data[p++])
//        }
//        // finish
//        val nrules = ATNDeserializer.toInt(data[p++])
//        for (i in 0 until nrules) {
//            val s = ATNDeserializer.toInt(data[p++])
//            if (atn.grammarType == ATNType.LEXER) {
//                val arg1 = ATNDeserializer.toInt(data[p++])
//                buf.append("rule ").append(i).append(":").append(s).append(" ").append(arg1).append('\n')
//            } else {
//                buf.append("rule ").append(i).append(":").append(s).append('\n')
//            }
//        }
//        val nmodes = ATNDeserializer.toInt(data[p++])
//        for (i in 0 until nmodes) {
//            val s = ATNDeserializer.toInt(data[p++])
//            buf.append("mode ").append(i).append(":").append(s).append('\n')
//        }
//        val numBMPSets = ATNDeserializer.toInt(data[p++])
//        p = appendSets(buf, data, p, numBMPSets, 0, ATNDeserializer.getUnicodeDeserializer(ATNDeserializer.UnicodeDeserializingMode.UNICODE_BMP))
//        val numSMPSets = ATNDeserializer.toInt(data[p++])
//        p = appendSets(buf, data, p, numSMPSets, numBMPSets, ATNDeserializer.getUnicodeDeserializer(ATNDeserializer.UnicodeDeserializingMode.UNICODE_SMP))
//        val nedges = ATNDeserializer.toInt(data[p++])
//        for (i in 0 until nedges) {
//            val src = ATNDeserializer.toInt(data[p])
//            val trg = ATNDeserializer.toInt(data[p + 1])
//            val ttype = ATNDeserializer.toInt(data[p + 2])
//            val arg1 = ATNDeserializer.toInt(data[p + 3])
//            val arg2 = ATNDeserializer.toInt(data[p + 4])
//            val arg3 = ATNDeserializer.toInt(data[p + 5])
//            buf.append(src).append("->").append(trg)
//                    .append(" ").append(Transition.serializationNames.get(ttype))
//                    .append(" ").append(arg1).append(",").append(arg2).append(",").append(arg3)
//                    .append("\n")
//            p += 6
//        }
//        val ndecisions = ATNDeserializer.toInt(data[p++])
//        for (i in 0 until ndecisions) {
//            val s = ATNDeserializer.toInt(data[p++])
//            buf.append(i).append(":").append(s).append("\n")
//        }
//        if (atn.grammarType == ATNType.LEXER) {
//            // this code is meant to model the form of ATNDeserializer.deserialize,
//            // since both need to be updated together whenever a change is made to
//            // the serialization format. The "dead" code is only used in debugging
//            // and testing scenarios, so the form you see here was kept for
//            // improved maintainability.
//            val lexerActionCount = ATNDeserializer.toInt(data[p++])
//            for (i in 0 until lexerActionCount) {
//                val actionType = LexerActionType.values()[ATNDeserializer.toInt(data[p++])]
//                val data1 = ATNDeserializer.toInt(data[p++])
//                val data2 = ATNDeserializer.toInt(data[p++])
//            }
//        }
//        return buf.toString()
//    }
//
//    private fun appendSets(buf: StringBuilder, data: CharArray, p: Int, nsets: Int, setIndexOffset: Int, unicodeDeserializer: ATNDeserializer.UnicodeDeserializer): Int {
//        var p = p
//        for (i in 0 until nsets) {
//            val nintervals = ATNDeserializer.toInt(data[p++])
//            buf.append(i + setIndexOffset).append(":")
//            val containsEof = data[p++].toInt() != 0
//            if (containsEof) {
//                buf.append(getTokenName(Token.EOF))
//            }
//
//            for (j in 0 until nintervals) {
//                if (containsEof || j > 0) {
//                    buf.append(", ")
//                }
//
//                val a = unicodeDeserializer.readUnicode(data, p)
//                p += unicodeDeserializer.size()
//                val b = unicodeDeserializer.readUnicode(data, p)
//                p += unicodeDeserializer.size()
//                buf.append(getTokenName(a)).append("..").append(getTokenName(b))
//            }
//            buf.append("\n")
//        }
//        return p
//    }
//
//    fun getTokenName(t: Int): String {
//        if (t == -1) return "EOF"
//
//        if (atn.grammarType == ATNType.LEXER &&
//                t >= Character.MIN_VALUE.toInt() && t <= Character.MAX_VALUE.toInt()) {
//            when (t) {
//                '\n' -> return "'\\n'"
//                '\r' -> return "'\\r'"
//                '\t' -> return "'\\t'"
//                '\b' -> return "'\\b'"
//                '\f' -> return "'\\f'"
//                '\\' -> return "'\\\\'"
//                '\'' -> return "'\\''"
//                else -> {
//                    if (Character.UnicodeBlock.of(t.toChar()) === Character.UnicodeBlock.BASIC_LATIN && !Character.isISOControl(t.toChar())) {
//                        return '\'' + Character.toString(t.toChar()) + '\''
//                    }
//                    // turn on the bit above max "\uFFFF" value so that we pad with zeros
//                    // then only take last 4 digits
//                    val hex = Integer.toHexString(t or 0x10000).toUpperCase().substring(1, 5)
//                    return "'\\u$hex'"
//                }
//            }
//        }
//
//        return if (tokenNames != null && t >= 0 && t < tokenNames.size) {
//            tokenNames.get(t)
//        } else t.toString()
//
//    }
//
//    private fun serializeUUID(data: IntegerList, uuid: UUID) {
//        serializeLong(data, uuid.getLeastSignificantBits())
//        serializeLong(data, uuid.getMostSignificantBits())
//    }
//
//    private fun serializeLong(data: IntegerList, value: Long) {
//        serializeInt(data, value.toInt())
//        serializeInt(data, (value shr 32).toInt())
//    }
//
//    private fun serializeInt(data: IntegerList, value: Int) {
//        data.add(value.toChar())
//        data.add((value shr 16).toChar())
//    }
//
//    companion object {
//
//        private fun serializeSets(
//                data: IntegerList,
//                sets: Collection<IntervalSet>,
//                codePointSerializer: CodePointSerializer) {
//            val nSets = sets.size
//            data.add(nSets)
//
//            for (set in sets) {
//                val containsEof = set.contains(Token.EOF)
//                if (containsEof && set.getIntervals().get(0).b === Token.EOF) {
//                    data.add(set.getIntervals().size() - 1)
//                } else {
//                    data.add(set.getIntervals().size())
//                }
//
//                data.add(if (containsEof) 1 else 0)
//                for (I in set.getIntervals()) {
//                    if (I.a === Token.EOF) {
//                        if (I.b === Token.EOF) {
//                            continue
//                        } else {
//                            codePointSerializer.serializeCodePoint(data, 0)
//                        }
//                    } else {
//                        codePointSerializer.serializeCodePoint(data, I.a)
//                    }
//
//                    codePointSerializer.serializeCodePoint(data, I.b)
//                }
//            }
//        }
//
//        /** Used by Java target to encode short/int array as chars in string.  */
//        fun getSerializedAsString(atn: ATN): String {
//            return String(getSerializedAsChars(atn))
//        }
//
//        fun getSerialized(atn: ATN): IntegerList {
//            return ATNSerializer(atn).serialize()
//        }
//
//        fun getSerializedAsChars(atn: ATN): CharArray {
//            return Utils.toCharArray(getSerialized(atn))
//        }
//
//        fun getDecoded(atn: ATN, tokenNames: List<String>): String {
//            val serialized = getSerialized(atn)
//            val data = Utils.toCharArray(serialized)
//            return ATNSerializer(atn, tokenNames).decode(data)
//        }
//    }
//}
