// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.assert
import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.IntegerList
import org.antlr.v4.kotlinruntime.misc.IntervalSet

/**
 * This class represents a target neutral serializer for ATNs. An ATN is converted to a list of integers
 * that can be converted back to and ATN. We compute the list of integers and then generate an array
 * into the target language for a particular lexer or parser. Java is a special case where we must
 * generate strings instead of arrays, but that is handled outside of this class.
 *
 * See `ATNDeserializer.encodeIntsWith16BitWords` and `org.antlr.v4.codegen.model.SerializedJavaATN`.
 */
public open class ATNSerializer(public var atn: ATN) {
  public companion object {
    private fun serializeSets(data: IntegerList, sets: Collection<IntervalSet>) {
      val nSets = sets.size
      data.add(nSets)

      for (set in sets) {
        val containsEof = set.contains(Token.EOF)
        val intervals = set.intervals!!

        if (containsEof && intervals[0].b == Token.EOF) {
          data.add(intervals.size - 1)
        } else {
          data.add(intervals.size)
        }

        data.add(if (containsEof) 1 else 0)

        for (@Suppress("LocalVariableName") I in intervals) {
          if (I.a == Token.EOF) {
            if (I.b == Token.EOF) {
              continue
            } else {
              data.add(0)
            }
          } else {
            data.add(I.a)
          }

          data.add(I.b)
        }
      }
    }

    public fun getSerialized(atn: ATN): IntegerList =
      ATNSerializer(atn).serialize()
  }

  private val data = IntegerList()

  /**
   * Note that we use a [LinkedHashMap] as a set to maintain
   * insertion order while de-duplicating entries with the same key.
   */
  private val sets = LinkedHashMap<IntervalSet, Boolean>()
  private val nonGreedyStates = IntegerList()
  private val precedenceStates = IntegerList()

  /**
   * Serialize state descriptors, edge descriptors, and decisionstate map
   * into list of ints.
   *
   * Likely out of date, but keeping as it could be helpful:
   *
   * ```
   * SERIALIZED_VERSION
   * UUID (2 longs)
   * grammar-type, (ANTLRParser.LEXER, ...)
   * max token type,
   * num states,
   * state-0-type ruleIndex, state-1-type ruleIndex, ... state-i-type ruleIndex optional-arg ...
   * num rules,
   * rule-1-start-state rule-1-args, rule-2-start-state  rule-2-args, ...
   * (args are token type,actionIndex in lexer else 0,0)
   * num modes,
   * mode-0-start-state, mode-1-start-state, ... (parser has 0 modes)
   * num unicode-bmp-sets
   * bmp-set-0-interval-count intervals, bmp-set-1-interval-count intervals, ...
   * num unicode-smp-sets
   * smp-set-0-interval-count intervals, smp-set-1-interval-count intervals, ...
   * num total edges,
   * src, trg, edge-type, edge arg1, optional edge arg2 (present always), ...
   * num decisions,
   * decision-0-start-state, decision-1-start-state, ...
   * ```
   *
   * Convenient to pack into unsigned shorts to make as Java string.
   */
  public open fun serialize(): IntegerList {
    addPreamble()

    val nEdges = addEdges()
    addNonGreedyStates()
    addPrecedenceStates()
    addRuleStatesAndLexerTokenTypes()
    addModeStartStates()

    val setIndices = addSets()
    addEdges(nEdges, setIndices)
    addDecisionStartStates()
    addLexerActions()

    return data
  }

  private fun addPreamble() {
    data.add(ATNDeserializer.SERIALIZED_VERSION)

    // Convert grammar type to ATN const to avoid dependence on ANTLRParser
    data.add(atn.grammarType.ordinal)
    data.add(atn.maxTokenType)
  }

  private fun addLexerActions() {
    if (atn.grammarType == ATNType.LEXER) {
      data.add(atn.lexerActions!!.size)

      for (action in atn.lexerActions!!) {
        data.add(action.actionType.ordinal)

        when (action.actionType) {
          LexerActionType.CHANNEL -> {
            val channel = (action as LexerChannelAction).channel
            data.add(channel)
            data.add(0)
          }
          LexerActionType.CUSTOM -> {
            val ruleIndex = (action as LexerCustomAction).ruleIndex
            val actionIndex = action.actionIndex
            data.add(ruleIndex)
            data.add(actionIndex)
          }
          LexerActionType.MODE -> {
            val mode = (action as LexerModeAction).mode
            data.add(mode)
            data.add(0)
          }
          LexerActionType.MORE -> {
            data.add(0)
            data.add(0)
          }
          LexerActionType.POP_MODE -> {
            data.add(0)
            data.add(0)
          }
          LexerActionType.PUSH_MODE -> {
            val mode = (action as LexerPushModeAction).mode
            data.add(mode)
            data.add(0)
          }
          LexerActionType.SKIP -> {
            data.add(0)
            data.add(0)
          }
          LexerActionType.TYPE -> {
            val type = (action as LexerTypeAction).type
            data.add(type)
            data.add(0)
          }
        }
      }
    }
  }

  private fun addDecisionStartStates() {
    val nDecisions = atn.decisionToState.size
    data.add(nDecisions)

    for (decStartState in atn.decisionToState) {
      data.add(decStartState.stateNumber)
    }
  }

  private fun addEdges(nEdges: Int, setIndices: Map<IntervalSet, Int>) {
    data.add(nEdges)

    for (s in atn.states) {
      if (s == null) {
        // Might be optimized away
        continue
      }

      if (s.stateType == ATNState.RULE_STOP) {
        continue
      }

      for (i in 0..<s.numberOfTransitions) {
        val t = s.transition(i)

        if (atn.states[t.target.stateNumber] == null) {
          throw IllegalStateException("Cannot serialize a transition to a removed state.")
        }

        val src = s.stateNumber
        var trg = t.target.stateNumber
        val edgeType = Transition.serializationTypes[t::class]!!
        var arg1 = 0
        var arg2 = 0
        var arg3 = 0

        when (edgeType) {
          Transition.RULE -> {
            trg = (t as RuleTransition).followState.stateNumber
            arg1 = t.target.stateNumber
            arg2 = t.ruleIndex
            arg3 = t.precedence
          }
          Transition.PRECEDENCE -> {
            val ppt = t as PrecedencePredicateTransition
            arg1 = ppt.precedence
          }
          Transition.PREDICATE -> {
            val pt = t as PredicateTransition
            arg1 = pt.ruleIndex
            arg2 = pt.predIndex
            arg3 = if (pt.isCtxDependent) 1 else 0
          }
          Transition.RANGE -> {
            arg1 = (t as RangeTransition).from
            arg2 = t.to

            if (arg1 == Token.EOF) {
              arg1 = 0
              arg3 = 1
            }
          }
          Transition.ATOM -> {
            arg1 = (t as AtomTransition).label

            if (arg1 == Token.EOF) {
              arg1 = 0
              arg3 = 1
            }
          }
          Transition.ACTION -> {
            val at = t as ActionTransition
            arg1 = at.ruleIndex
            arg2 = at.actionIndex
            arg3 = if (at.isCtxDependent) 1 else 0
          }
          Transition.SET -> {
            arg1 = setIndices[(t as SetTransition).set]!!
          }
          Transition.NOT_SET -> {
            arg1 = setIndices[(t as SetTransition).set]!!
          }
          Transition.WILDCARD -> {
            // Noop
          }
        }

        data.add(src)
        data.add(trg)
        data.add(edgeType)
        data.add(arg1)
        data.add(arg2)
        data.add(arg3)
      }
    }
  }

  private fun addSets(): Map<IntervalSet, Int> {
    serializeSets(data, sets.keys)

    val setIndices = HashMap<IntervalSet, Int>()
    var setIndex = 0

    for (s in sets.keys) {
      setIndices[s] = setIndex++
    }

    return setIndices
  }

  private fun addModeStartStates() {
    val nModes = atn.modeToStartState.size
    data.add(nModes)

    if (nModes > 0) {
      for (modeStartState in atn.modeToStartState) {
        data.add(modeStartState.stateNumber)
      }
    }
  }

  private fun addRuleStatesAndLexerTokenTypes() {
    val nRules = atn.ruleToStartState!!.size
    data.add(nRules)

    for (r in 0..<nRules) {
      val ruleStartState = atn.ruleToStartState!![r]
      data.add(ruleStartState.stateNumber)

      if (atn.grammarType == ATNType.LEXER) {
        val tt = atn.ruleToTokenType!![r]
        assert(tt >= 0 /* 0 implies fragment rule, other token types > 0 */)
        data.add(tt)
      }
    }
  }

  private fun addPrecedenceStates() {
    data.add(precedenceStates.size())

    for (i in 0..<precedenceStates.size()) {
      data.add(precedenceStates[i])
    }
  }

  private fun addNonGreedyStates() {
    data.add(nonGreedyStates.size())

    for (i in 0..<nonGreedyStates.size()) {
      data.add(nonGreedyStates[i])
    }
  }

  private fun addEdges(): Int {
    var nEdges = 0
    data.add(atn.states.size)

    for (s in atn.states) {
      // Might be optimized away
      if (s == null) {
        data.add(ATNState.INVALID_TYPE)
        continue
      }

      val stateType = s.stateType

      if (s is DecisionState && s.nonGreedy) {
        nonGreedyStates.add(s.stateNumber)
      }

      if (s is RuleStartState && s.isLeftRecursiveRule) {
        precedenceStates.add(s.stateNumber)
      }

      data.add(stateType)
      data.add(s.ruleIndex)

      if (s.stateType == ATNState.LOOP_END) {
        data.add((s as LoopEndState).loopBackState!!.stateNumber)
      } else if (s is BlockStartState) {
        data.add(s.endState!!.stateNumber)
      }

      if (s.stateType != ATNState.RULE_STOP) {
        // The deserializer can trivially derive these edges, so there's no need to serialize them
        nEdges += s.numberOfTransitions
      }

      for (i in 0..<s.numberOfTransitions) {
        val t = s.transition(i)
        val edgeType = Transition.serializationTypes[t::class]!!

        if (edgeType == Transition.SET || edgeType == Transition.NOT_SET) {
          val st = t as SetTransition
          sets[st.set] = true
        }
      }
    }

    return nEdges
  }
}
