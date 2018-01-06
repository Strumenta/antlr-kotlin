/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime.dfa

import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATNConfigSet
import org.antlr.v4.kotlinruntime.atn.DecisionState
import org.antlr.v4.kotlinruntime.atn.StarLoopEntryState


class DFA constructor(
        /** From which ATN state did we create this DFA?  */

        val atnStartState: DecisionState, val decision: Int = 0) {
    /** A set of all DFA states. Use [Map] so we can get old state back
     * ([Set] only allows you to see if it's there).
     */

    val states: MutableMap<DFAState, DFAState> = HashMap<DFAState, DFAState>()

    @Volatile
    var s0: DFAState? = null

    /**
     * `true` if this DFA is for a precedence decision; otherwise,
     * `false`. This is the backing field for [.isPrecedenceDfa].
     */
    private val precedenceDfa: Boolean

    /**
     * Gets whether this DFA is a precedence DFA. Precedence DFAs use a special
     * start state [.s0] which is not stored in [.states]. The
     * [DFAState.edges] array for this start state contains outgoing edges
     * supplying individual start states corresponding to specific precedence
     * values.
     *
     * @return `true` if this is a precedence DFA; otherwise,
     * `false`.
     * @see Parser.getPrecedence
     */
    /**
     * Sets whether this is a precedence DFA.
     *
     * @param precedenceDfa `true` if this is a precedence DFA; otherwise,
     * `false`
     *
     * @throws UnsupportedOperationException if `precedenceDfa` does not
     * match the value of [.isPrecedenceDfa] for the current DFA.
     *
     */
    var isPrecedenceDfa: Boolean
        get() = precedenceDfa
        @Deprecated("This method no longer performs any action.")
        set(precedenceDfa) {
            if (precedenceDfa != isPrecedenceDfa) {
                throw UnsupportedOperationException("The precedenceDfa field cannot change after a DFA is constructed.")
            }
        }

    init {
        var precedenceDfa = false
        if (atnStartState is StarLoopEntryState) {
            if (atnStartState.isPrecedenceDecision) {
                precedenceDfa = true
                val precedenceState = DFAState(ATNConfigSet())
                precedenceState.edges = arrayOfNulls<DFAState?>(0)
                precedenceState.isAcceptState = false
                precedenceState.requiresFullContext = false
                this.s0 = precedenceState
            }
        }

        this.precedenceDfa = precedenceDfa
    }

    /**
     * Get the start state for a specific precedence value.
     *
     * @param precedence The current precedence.
     * @return The start state corresponding to the specified precedence, or
     * `null` if no start state exists for the specified precedence.
     *
     * @throws IllegalStateException if this is not a precedence DFA.
     * @see .isPrecedenceDfa
     */
    fun getPrecedenceStartState(precedence: Int): DFAState? {
        if (!isPrecedenceDfa) {
            throw IllegalStateException("Only precedence DFAs may contain a precedence start state.")
        }

        // s0.edges is never null for a precedence DFA
        return if (precedence < 0 || precedence >= s0!!.edges!!.size) {
            null
        } else s0!!.edges!![precedence]

    }

    /**
     * Set the start state for a specific precedence value.
     *
     * @param precedence The current precedence.
     * @param startState The start state corresponding to the specified
     * precedence.
     *
     * @throws IllegalStateException if this is not a precedence DFA.
     * @see .isPrecedenceDfa
     */
    fun setPrecedenceStartState(precedence: Int, startState: DFAState) {
        if (!isPrecedenceDfa) {
            throw IllegalStateException("Only precedence DFAs may contain a precedence start state.")
        }

        if (precedence < 0) {
            return
        }

        // synchronization on s0 here is ok. when the DFA is turned into a
        // precedence DFA, s0 will be initialized once and not updated again
        TODO()
//        synchronized(s0) {
//            // s0.edges is never null for a precedence DFA
//            if (precedence >= s0!!.edges!!.size) {
//                s0!!.edges = Arrays.copyOf<DFAState>(s0!!.edges!!, precedence + 1)
//            }
//
//            s0!!.edges[precedence] = startState
//        }
    }

    /**
     * Return a list of all states in this DFA, ordered by state number.
     */

    fun getStates(): List<DFAState> {
        val result = ArrayList<DFAState>(states.keys)
        TODO()
        //Collections.sort<DFAState>(result, java.util.Comparator<Any> { o1, o2 -> o1.stateNumber - o2.stateNumber })

        //return result
    }

    override fun toString(): String {
        return toString(VocabularyImpl.EMPTY_VOCABULARY) ?: "null"
    }

    fun toString(vocabulary: Vocabulary): String? {
        if (s0 == null) {
            return ""
        }

        val serializer = DFASerializer(this, vocabulary)
        return serializer.toString()
    }

    fun toLexerString(): String? {
        if (s0 == null) return ""
        val serializer = LexerDFASerializer(this)
        return serializer.toString()
    }

}
