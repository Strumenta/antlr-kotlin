// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.IntervalSet

/**
 * @author Sam Harwell
 */
public open class ATNDeserializer(deserializationOptions: ATNDeserializationOptions? = ATNDeserializationOptions.defaultOptions) {
  public companion object {
    public const val SERIALIZED_VERSION: Int = 4
  }

  private val deserializationOptions: ATNDeserializationOptions =
    deserializationOptions ?: ATNDeserializationOptions.defaultOptions

  public open fun deserialize(data: CharArray): ATN =
    deserialize(decodeIntsEncodedAs16BitWords(data))

  public open fun deserialize(data: IntArray): ATN {
    var p = 0
    val version = data[p++]

    if (version != SERIALIZED_VERSION) {
      val reason = "Could not deserialize ATN with version $version (expected $SERIALIZED_VERSION)."
      throw UnsupportedOperationException(/* InvalidClassException(ATN::class), */ reason)
    }

    val grammarType = ATNType.entries[data[p++]]
    val maxTokenType = data[p++]
    val atn = ATN(grammarType, maxTokenType)

    //
    // STATES
    //
    val loopBackStateNumbers = ArrayList<Pair<LoopEndState, Int>>()
    val endStateNumbers = ArrayList<Pair<BlockStartState, Int>>()
    val nStates = data[p++]

    for (i in 0..<nStates) {
      val sType = data[p++]

      // Ignore bad type of states
      if (sType == ATNState.INVALID_TYPE) {
        atn.addState(null)
        continue
      }

      val ruleIndex = data[p++]
      val s = stateFactory(sType, ruleIndex)

      if (sType == ATNState.LOOP_END) {
        // Special case
        val loopBackStateNumber = data[p++]
        loopBackStateNumbers.add(Pair(s as LoopEndState, loopBackStateNumber))
      } else if (s is BlockStartState) {
        val endStateNumber = data[p++]
        endStateNumbers.add(Pair(s, endStateNumber))
      }

      atn.addState(s)
    }

    // Delay the assignment of loop back and end states until
    // we know all the state instances have been initialized
    for (pair in loopBackStateNumbers) {
      pair.first.loopBackState = atn.states[pair.second]
    }

    for (pair in endStateNumbers) {
      pair.first.endState = atn.states[pair.second] as BlockEndState
    }

    val numNonGreedyStates = data[p++]

    for (i in 0..<numNonGreedyStates) {
      val stateNumber = data[p++]
      (atn.states[stateNumber] as DecisionState).nonGreedy = true
    }

    val numPrecedenceStates = data[p++]

    for (i in 0..<numPrecedenceStates) {
      val stateNumber = data[p++]
      (atn.states[stateNumber] as RuleStartState).isLeftRecursiveRule = true
    }

    //
    // RULES
    //
    val nRules = data[p++]

    if (atn.grammarType == ATNType.LEXER) {
      atn.ruleToTokenType = IntArray(nRules)
    }

    atn.ruleToStartState = Array(nRules) {
      val s = data[p++]
      val startState = atn.states[s] as RuleStartState

      if (atn.grammarType == ATNType.LEXER) {
        val tokenType = data[p++]
        atn.ruleToTokenType!![it] = tokenType
      }

      startState
    }

    atn.ruleToStopState = arrayOfNulls(nRules)

    for (state in atn.states) {
      if (state !is RuleStopState) {
        continue
      }

      atn.ruleToStopState!![state.ruleIndex] = state
      atn.ruleToStartState!![state.ruleIndex].stopState = state
    }

    //
    // MODES
    //
    val nModes = data[p++]

    for (i in 0..<nModes) {
      val s = data[p++]
      atn.modeToStartState.add(atn.states[s] as TokensStartState)
    }

    //
    // SETS
    //
    val sets = ArrayList<IntervalSet>()
    p = deserializeSets(data, p, sets)

    //
    // EDGES
    //
    val nEdges = data[p++]

    for (i in 0..<nEdges) {
      val src = data[p]
      val trg = data[p + 1]
      val ttype = data[p + 2]
      val arg1 = data[p + 3]
      val arg2 = data[p + 4]
      val arg3 = data[p + 5]
      val trans = edgeFactory(atn, ttype, src, trg, arg1, arg2, arg3, sets)
      val srcState = atn.states[src]
      srcState!!.addTransition(trans)
      p += 6
    }

    // Edges for rule stop states can be derived, so they aren't serialized
    for (state in atn.states) {
      for (i in 0..<state!!.numberOfTransitions) {
        val t = state.transition(i) as? RuleTransition ?: continue
        var outermostPrecedenceReturn = -1

        if (atn.ruleToStartState!![t.target.ruleIndex].isLeftRecursiveRule) {
          if (t.precedence == 0) {
            outermostPrecedenceReturn = t.target.ruleIndex
          }
        }

        val returnTransition = EpsilonTransition(t.followState, outermostPrecedenceReturn)
        atn.ruleToStopState!![t.target.ruleIndex]!!.addTransition(returnTransition)
      }
    }

    for (state in atn.states) {
      if (state is BlockStartState) {
        // We need to know the end state to set its start state
        if (state.endState == null) {
          throw IllegalStateException()
        }

        // Block end states can only be associated to a single block start state
        if (state.endState!!.startState != null) {
          throw IllegalStateException()
        }

        state.endState!!.startState = state
      }

      if (state is PlusLoopbackState) {
        for (i in 0..<state.numberOfTransitions) {
          val target = state.transition(i).target

          if (target is PlusBlockStartState) {
            target.loopBackState = state
          }
        }
      } else if (state is StarLoopbackState) {
        for (i in 0..<state.numberOfTransitions) {
          val target = state.transition(i).target

          if (target is StarLoopEntryState) {
            target.loopBackState = state
          }
        }
      }
    }

    //
    // DECISIONS
    //
    val nDecisions = data[p++]

    for (i in 1..nDecisions) {
      val s = data[p++]
      val decState = atn.states[s] as DecisionState
      atn.decisionToState.add(decState)
      decState.decision = i - 1
    }

    //
    // LEXER ACTIONS
    //
    if (atn.grammarType == ATNType.LEXER) {
      atn.lexerActions = Array(data[p++]) {
        val actionType = LexerActionType.entries[data[p++]]
        val data1 = data[p++]
        val data2 = data[p++]
        lexerActionFactory(actionType, data1, data2)
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

        if (atn.ruleToStartState!![i].isLeftRecursiveRule) {
          // Wrap from the beginning of the rule to the StarLoopEntryState
          endState = null

          for (state in atn.states) {
            if (state!!.ruleIndex != i) {
              continue
            }

            if (state !is StarLoopEntryState) {
              continue
            }

            val maybeLoopEndState = state.transition(state.numberOfTransitions - 1).target

            if (maybeLoopEndState !is LoopEndState) {
              continue
            }

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

        // All non-excluded transitions that currently target end state need to target blockEnd instead
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

        // All transitions leaving the rule start state need to leave blockStart instead
        while (atn.ruleToStartState!![i].numberOfTransitions > 0) {
          val transition = atn.ruleToStartState!![i].removeTransition(atn.ruleToStartState!![i].numberOfTransitions - 1)
          bypassStart.addTransition(transition)
        }

        // Link the new states
        atn.ruleToStartState!![i].addTransition(EpsilonTransition(bypassStart))
        bypassStop.addTransition(EpsilonTransition(endState!!))

        val matchState = BasicState()
        atn.addState(matchState)
        matchState.addTransition(AtomTransition(bypassStop, atn.ruleToTokenType!![i]))
        bypassStart.addTransition(EpsilonTransition(matchState))
      }

      if (deserializationOptions.isVerifyATN) {
        // Re-verify after modification
        verifyATN(atn)
      }
    }

    return atn
  }

  private fun deserializeSets(data: IntArray, p: Int, sets: MutableList<IntervalSet>): Int {
    var pp = p
    val nSets = data[pp++]

    for (i in 0..<nSets) {
      val nIntervals = data[pp]
      pp++

      val set = IntervalSet()
      sets.add(set)

      val containsEof = data[pp++] != 0

      if (containsEof) {
        set.add(-1)
      }

      for (j in 0..<nIntervals) {
        val a = data[pp++]
        val b = data[pp++]
        set.add(a, b)
      }
    }

    return pp
  }

  /**
   * Analyze the [StarLoopEntryState] states in the specified ATN to set
   * the [StarLoopEntryState.isPrecedenceDecision] field to the correct value.
   *
   * @param atn The ATN
   */
  protected open fun markPrecedenceDecisions(atn: ATN) {
    for (state in atn.states) {
      if (state !is StarLoopEntryState) {
        continue
      }

      // We analyze the ATN to determine if this ATN decision state is the
      // decision for the closure block that determines whether a
      // precedence rule should continue or complete.
      if (atn.ruleToStartState!![state.ruleIndex].isLeftRecursiveRule) {
        val maybeLoopEndState = state.transition(state.numberOfTransitions - 1).target

        if (maybeLoopEndState is LoopEndState) {
          if (maybeLoopEndState.epsilonOnlyTransitions && maybeLoopEndState.transition(0).target is RuleStopState) {
            state.isPrecedenceDecision = true
          }
        }
      }
    }
  }

  protected open fun verifyATN(atn: ATN) {
    // Verify assumptions
    for (state in atn.states) {
      if (state == null) {
        continue
      }

      checkCondition(state.onlyHasEpsilonTransitions() || state.numberOfTransitions <= 1)

      if (state is PlusBlockStartState) {
        checkCondition(state.loopBackState != null)
      }

      if (state is StarLoopEntryState) {
        checkCondition(state.loopBackState != null)
        checkCondition(state.numberOfTransitions == 2)

        when (state.transition(0).target) {
          is StarBlockStartState -> {
            checkCondition(state.transition(1).target is LoopEndState)
            checkCondition(!state.nonGreedy)
          }
          is LoopEndState -> {
            checkCondition(state.transition(1).target is StarBlockStartState)
            checkCondition(state.nonGreedy)
          }
          else -> throw IllegalStateException()
        }
      }

      if (state is StarLoopbackState) {
        checkCondition(state.numberOfTransitions == 1)
        checkCondition(state.transition(0).target is StarLoopEntryState)
      }

      if (state is LoopEndState) {
        checkCondition(state.loopBackState != null)
      }

      if (state is RuleStartState) {
        checkCondition(state.stopState != null)
      }

      if (state is BlockStartState) {
        checkCondition(state.endState != null)
      }

      if (state is BlockEndState) {
        checkCondition(state.startState != null)
      }

      if (state is DecisionState) {
        checkCondition(state.numberOfTransitions <= 1 || state.decision >= 0)
      } else {
        checkCondition(state.numberOfTransitions <= 1 || state is RuleStopState)
      }
    }
  }

  public open fun checkCondition(condition: Boolean, message: String? = null) {
    if (!condition) {
      throw IllegalStateException(message)
    }
  }

  public open fun edgeFactory(
    atn: ATN,
    type: Int,
    src: Int,
    trg: Int,
    arg1: Int,
    arg2: Int,
    arg3: Int,
    sets: List<IntervalSet>,
  ): Transition {
    val target = atn.states[trg]!!
    return when (type) {
      Transition.EPSILON -> {
        EpsilonTransition(target)
      }
      Transition.RANGE -> {
        if (arg3 != 0) {
          RangeTransition(target, Token.EOF, arg2)
        } else {
          RangeTransition(target, arg1, arg2)
        }
      }
      Transition.RULE -> {
        RuleTransition(atn.states[arg1] as RuleStartState, arg2, arg3, target)
      }
      Transition.PREDICATE -> {
        PredicateTransition(target, arg1, arg2, arg3 != 0)
      }
      Transition.PRECEDENCE -> {
        PrecedencePredicateTransition(target, arg1)
      }
      Transition.ATOM -> {
        if (arg3 != 0) {
          AtomTransition(target, Token.EOF)
        } else {
          AtomTransition(target, arg1)
        }
      }
      Transition.ACTION -> {
        ActionTransition(target, arg1, arg2, arg3 != 0)
      }
      Transition.SET -> {
        SetTransition(target, sets[arg1])
      }
      Transition.NOT_SET -> {
        NotSetTransition(target, sets[arg1])
      }
      Transition.WILDCARD -> {
        WildcardTransition(target)
      }
      else -> throw IllegalArgumentException("The specified transition type is not valid.")
    }
  }

  public open fun stateFactory(type: Int, ruleIndex: Int): ATNState? {
    val s: ATNState = when (type) {
      ATNState.INVALID_TYPE -> return null
      ATNState.BASIC -> BasicState()
      ATNState.RULE_START -> RuleStartState()
      ATNState.BLOCK_START -> BasicBlockStartState()
      ATNState.PLUS_BLOCK_START -> PlusBlockStartState()
      ATNState.STAR_BLOCK_START -> StarBlockStartState()
      ATNState.TOKEN_START -> TokensStartState()
      ATNState.RULE_STOP -> RuleStopState()
      ATNState.BLOCK_END -> BlockEndState()
      ATNState.STAR_LOOP_BACK -> StarLoopbackState()
      ATNState.STAR_LOOP_ENTRY -> StarLoopEntryState()
      ATNState.PLUS_LOOP_BACK -> PlusLoopbackState()
      ATNState.LOOP_END -> LoopEndState()
      else -> throw IllegalArgumentException("The specified state type $type is not valid.")
    }

    s.ruleIndex = ruleIndex
    return s
  }

  protected open fun lexerActionFactory(type: LexerActionType, data1: Int, data2: Int): LexerAction =
    when (type) {
      LexerActionType.CHANNEL -> LexerChannelAction(data1)
      LexerActionType.CUSTOM -> LexerCustomAction(data1, data2)
      LexerActionType.MODE -> LexerModeAction(data1)
      LexerActionType.MORE -> LexerMoreAction.INSTANCE
      LexerActionType.POP_MODE -> LexerPopModeAction.INSTANCE
      LexerActionType.PUSH_MODE -> LexerPushModeAction(data1)
      LexerActionType.SKIP -> LexerSkipAction.INSTANCE
      LexerActionType.TYPE -> LexerTypeAction(data1)
    }

  public open fun decodeIntsEncodedAs16BitWords(data16: CharArray): IntArray =
    decodeIntsEncodedAs16BitWords(data16, false)

  /**
   * Convert a list of chars (16 uint) that represent a serialized and compressed list of ints for an ATN.
   */
  public open fun decodeIntsEncodedAs16BitWords(data16: CharArray, trimToSize: Boolean): IntArray {
    // Will be strictly smaller, but we waste bit of space to avoid copying during initialization of parsers
    val data = IntArray(data16.size)
    var i = 0
    var i2 = 0

    while (i < data16.size) {
      val v = data16[i++]

      if (v.code and 0x8000 == 0) {
        // Hi-bit not set? Implies 1-word value
        // 7 bit int
        data[i2++] = v.code
      } else {
        // Hi.bit set. Implies 2-word value
        val vnext = data16[i++]

        if (v.code == 0xFFFF && vnext.code == 0xFFFF) { // Is it -1?
          data[i2++] = -1
        } else {
          // 31-bit int
          data[i2++] = (v.code and 0x7FFF) shl 16 or (vnext.code and 0xFFFF)
        }
      }
    }

    if (trimToSize) {
      return data.copyOf(i2)
    }

    return data
  }
}
