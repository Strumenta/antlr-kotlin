// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.dfa

import com.strumenta.antlrkotlin.runtime.synchronized
import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATNConfigSet
import org.antlr.v4.kotlinruntime.atn.DecisionState
import org.antlr.v4.kotlinruntime.atn.StarLoopEntryState
import kotlin.concurrent.Volatile

public open class DFA(
  /**
   * From which ATN state did we create this DFA?
   */
  public val atnStartState: DecisionState,
  public val decision: Int = 0,
) {
  /**
   * A set of all DFA states.
   *
   * Use [Map] so we can get old state back ([Set] only allows you to see if it's there).
   */
  public val states: MutableMap<DFAState, DFAState> = HashMap()

  @Volatile
  public var s0: DFAState? = null

  /**
   * Whether this DFA is a precedence DFA, or not.
   *
   * Precedence DFAs use a special start state [s0] which is not stored in [states].
   * The [DFAState.edges] array for this start state contains outgoing edges
   * supplying individual start states corresponding to specific precedence
   * values.
   *
   * @see Parser.precedence
   */
  public val isPrecedenceDfa: Boolean

  init {
    var isPrecedenceDfa = false

    if (atnStartState is StarLoopEntryState) {
      if (atnStartState.isPrecedenceDecision) {
        isPrecedenceDfa = true

        val precedenceState = DFAState(ATNConfigSet())
        precedenceState.edges = arrayOfNulls<DFAState?>(0)
        precedenceState.isAcceptState = false
        precedenceState.requiresFullContext = false
        this.s0 = precedenceState
      }
    }

    this.isPrecedenceDfa = isPrecedenceDfa
  }

  /**
   * Get the start state for a specific precedence value.
   *
   * @param precedence The current precedence
   * @return The start state corresponding to the specified precedence,
   *   or `null` if no start state exists for the specified precedence
   *
   * @throws IllegalStateException If this is not a precedence DFA
   * @see isPrecedenceDfa
   */
  public fun getPrecedenceStartState(precedence: Int): DFAState? {
    if (!isPrecedenceDfa) {
      throw IllegalStateException("Only precedence DFAs may contain a precedence start state.")
    }

    // s0.edges is never null for a precedence DFA
    val edges = s0!!.edges!!
    return if (precedence < 0 || precedence >= edges.size) {
      null
    } else {
      edges[precedence]
    }
  }

  /**
   * Set the start state for a specific precedence value.
   *
   * @param precedence The current precedence
   * @param startState The start state corresponding to the specified precedence
   *
   * @throws IllegalStateException If this is not a precedence DFA
   * @see isPrecedenceDfa
   */
  public fun setPrecedenceStartState(precedence: Int, startState: DFAState) {
    if (!isPrecedenceDfa) {
      throw IllegalStateException("Only precedence DFAs may contain a precedence start state.")
    }

    if (precedence < 0) {
      return
    }

    // Synchronization on s0 here is ok. When the DFA is turned into a
    // precedence DFA, s0 will be initialized once and not updated again
    // s0.edges is never null for a precedence DFA
    val s0 = s0!!
    synchronized(s0) {
      if (precedence >= s0.edges!!.size) {
        s0.edges = s0.edges!!.copyOf(precedence + 1)
      }

      s0.edges!![precedence] = startState
    }
  }

  /**
   * Return a list of all states in this DFA, ordered by state number.
   */
  public fun getStates(): List<DFAState> {
    val result = ArrayList(states.keys)
    result.sortBy(DFAState::stateNumber)
    return result
  }

  override fun toString(): String =
    toString(VocabularyImpl.EMPTY_VOCABULARY)

  public fun toString(vocabulary: Vocabulary): String {
    if (s0 == null) {
      return ""
    }

    val serializer = DFASerializer(this, vocabulary)
    return serializer.toString()
  }

  public fun toLexerString(): String {
    if (s0 == null) {
      return ""
    }

    val serializer = LexerDFASerializer(this)
    return serializer.toString()
  }
}
