// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.BitSet
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.Token
import org.antlr.v4.kotlinruntime.misc.IntervalSet

@Suppress("MemberVisibilityCanBePrivate")
public open class LL1Analyzer(public val atn: ATN) {
  public companion object {
    /**
     * Special value added to the lookahead sets to indicate that we hit
     * a predicate during analysis if `seeThruPreds == false`.
     */
    public const val HIT_PRED: Int = Token.INVALID_TYPE
  }

  /**
   * Calculates the `SLL(1)` expected lookahead set for each outgoing transition
   * of an [ATNState].
   *
   * The returned array has one element for each outgoing transition in [s].
   *
   * If the closure from transition *i* leads to a semantic predicate
   * before matching a symbol, the element at index *i* of the result will be `null`.
   *
   * @param s The ATN state
   * @return The expected symbols for each outgoing transition of [s]
   */
  public open fun getDecisionLookahead(s: ATNState?): Array<IntervalSet?>? {
    if (s == null) {
      return null
    }

    val look = arrayOfNulls<IntervalSet>(s.numberOfTransitions)

    for (alt in 0..<s.numberOfTransitions) {
      look[alt] = IntervalSet()

      val lookBusy = HashSet<ATNConfig>()

      // Fail to get lookahead upon pred
      val seeThruPreds = false

      _LOOK(
        s = s.transition(alt).target,
        stopState = null,
        ctx = EmptyPredictionContext.Instance,
        look = look[alt]!!,
        lookBusy = lookBusy,
        calledRuleStack = BitSet(),
        seeThruPreds = seeThruPreds,
        addEOF = false,
      )

      // Wipe out lookahead for this alternative if we found nothing,
      // or we had a predicate when we !seeThruPreds
      if (look[alt]!!.size() == 0 || look[alt]!!.contains(HIT_PRED)) {
        look[alt] = null
      }
    }

    return look
  }

  /**
   * Compute set of tokens that can follow [s] in the ATN in the specified [ctx].
   *
   * If [ctx] is `null` and the end of the rule containing
   * [s] is reached, [Token.EPSILON] is added to the result set.
   *
   * If [ctx] is not `null` and the end of the outermost rule is
   * reached, [Token.EOF] is added to the result set.
   *
   * @param s The ATN state
   * @param ctx The complete parser context, or `null` if the context should be ignored
   *
   * @return The set of tokens that can follow [s] in the ATN in the specified [ctx]
   */
  @Suppress("FunctionName")
  public open fun LOOK(s: ATNState, ctx: RuleContext?): IntervalSet =
    LOOK(s, null, ctx)

  /**
   * Compute set of tokens that can follow [s] in the ATN in the specified [ctx].
   *
   * If [ctx] is `null` and the end of the rule containing
   * [s] is reached, [Token.EPSILON] is added to the result set.
   *
   * If [ctx] is not `null` and the end of the outermost rule is
   * reached, [Token.EOF] is added to the result set.
   *
   * @param s The ATN state
   * @param stopState The ATN state to stop at.
   *   This can be a [BlockEndState] to detect epsilon paths through a closure
   * @param ctx The complete parser context, or `null` if the context should be ignored
   *
   * @return The set of tokens that can follow [s] in the ATN in the specified [ctx]
   */
  @Suppress("FunctionName")
  public open fun LOOK(s: ATNState, stopState: ATNState?, ctx: RuleContext?): IntervalSet {
    val r = IntervalSet()

    // Ignore preds, get all lookahead
    val seeThruPreds = true
    val lookContext = if (ctx != null) {
      PredictionContext.fromRuleContext(s.atn!!, ctx)
    } else {
      null
    }

    _LOOK(
      s = s,
      stopState = stopState,
      ctx = lookContext,
      look = r,
      lookBusy = HashSet(),
      calledRuleStack = BitSet(),
      seeThruPreds = seeThruPreds,
      addEOF = true,
    )

    return r
  }

  /**
   * Compute set of tokens that can follow [s] in the ATN in the specified [ctx].
   *
   * If [ctx] is `null` and [stopState] or the end of the
   * rule containing [s] is reached, [Token.EPSILON] is added to
   * the result set.
   *
   * If [ctx] is not `null` and [addEOF] is `true` and [stopState]
   * or the end of the outermost rule is reached, [Token.EOF] is added
   * to the result set.
   *
   * @param s The ATN state
   * @param stopState The ATN state to stop at.
   *   This can be a [BlockEndState] to detect epsilon paths through a closure
   * @param ctx The outer context, or `null` if the outer context should not be used
   * @param look The result lookahead set
   * @param lookBusy A set used for preventing epsilon closures in the ATN
   *   from causing a stack overflow. Outside code should pass
   *   `HashSet<ATNConfig>()` for this argument
   * @param calledRuleStack A set used for preventing left recursion in the
   *   ATN from causing a stack overflow. Outside code should pass
   *   `BitSet()` for this argument
   * @param seeThruPreds `true` to true semantic predicates as
   *   implicitly `true` and "see through them", otherwise `false`
   *   to treat semantic predicates as opaque and add [HIT_PRED] to the
   *   result if one is encountered
   * @param addEOF Add [Token.EOF] to the result if the end of the
   *   outermost context is reached.
   *   This parameter has no effect if [ctx] is `null`
   */
  @Suppress("FunctionName")
  protected open fun _LOOK(
    s: ATNState,
    stopState: ATNState?,
    ctx: PredictionContext?,
    look: IntervalSet,
    lookBusy: MutableSet<ATNConfig>,
    calledRuleStack: BitSet,
    seeThruPreds: Boolean,
    addEOF: Boolean,
  ) {
    val c = ATNConfig(s, 0, ctx)

    if (!lookBusy.add(c)) {
      return
    }

    if (s === stopState) {
      if (ctx == null) {
        look.add(Token.EPSILON)
        return
      } else if (ctx.isEmpty && addEOF) {
        look.add(Token.EOF)
        return
      }
    }

    if (s is RuleStopState) {
      if (ctx == null) {
        look.add(Token.EPSILON)
        return
      } else if (ctx.isEmpty && addEOF) {
        look.add(Token.EOF)
        return
      }

      if (ctx !== EmptyPredictionContext.Instance) {
        // Run through all possible stack tops in ctx
        val removed = calledRuleStack.get(s.ruleIndex)

        try {
          calledRuleStack.clear(s.ruleIndex)

          for (i in 0..<ctx.size()) {
            val returnState = atn.states[ctx.getReturnState(i)]
            _LOOK(
              s = returnState!!,
              stopState = stopState,
              ctx = ctx.getParent(i),
              look = look,
              lookBusy = lookBusy,
              calledRuleStack = calledRuleStack,
              seeThruPreds = seeThruPreds,
              addEOF = addEOF,
            )
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

    for (i in 0..<n) {
      val t = s.transition(i)

      if (t is RuleTransition) {
        if (calledRuleStack.get(t.target.ruleIndex)) {
          continue
        }

        val newContext = SingletonPredictionContext.create(ctx, t.followState.stateNumber)

        try {
          calledRuleStack.set(t.target.ruleIndex)
          _LOOK(
            s = t.target,
            stopState = stopState,
            ctx = newContext,
            look = look,
            lookBusy = lookBusy,
            calledRuleStack = calledRuleStack,
            seeThruPreds = seeThruPreds,
            addEOF = addEOF,
          )
        } finally {
          calledRuleStack.clear(t.target.ruleIndex)
        }
      } else if (t is AbstractPredicateTransition) {
        if (seeThruPreds) {
          _LOOK(
            s = t.target,
            stopState = stopState,
            ctx = ctx,
            look = look,
            lookBusy = lookBusy,
            calledRuleStack = calledRuleStack,
            seeThruPreds = seeThruPreds,
            addEOF = addEOF,
          )
        } else {
          look.add(HIT_PRED)
        }
      } else if (t.isEpsilon) {
        _LOOK(
          s = t.target,
          stopState = stopState,
          ctx = ctx,
          look = look,
          lookBusy = lookBusy,
          calledRuleStack = calledRuleStack,
          seeThruPreds = seeThruPreds,
          addEOF = addEOF,
        )
      } else if (t is WildcardTransition) {
        look.addAll(IntervalSet.of(Token.MIN_USER_TOKEN_TYPE, atn.maxTokenType))
      } else {
        var set = t.label()

        if (set != null) {
          if (t is NotSetTransition) {
            set = set.complement(IntervalSet.of(Token.MIN_USER_TOKEN_TYPE, atn.maxTokenType))
          }

          look.addAll(set)
        }
      }
    }
  }
}
