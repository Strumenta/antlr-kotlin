// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.tree.Trees

/**
 * A parser simulator that mimics what ANTLR's generated parser code does.
 *
 * A [ParserATNSimulator] is used to make predictions via [ParserATNSimulator.adaptivePredict]
 * but this class moves a pointer through the ATN to simulate parsing.
 *
 * [ParserATNSimulator] just makes us efficient rather than having to backtrack, for example.
 *
 * This properly creates parse trees even for left recursive rules.
 *
 * We rely on the left recursive rule invocation and special predicate
 * transitions to make left recursive rules work.
 *
 * See `TestParserInterpreter` for examples.
 */
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
public open class ParserInterpreter(
  override val grammarFileName: String,
  override val vocabulary: Vocabulary,
  ruleNames: Collection<String>,
  atn: ATN,
  input: TokenStream,
) : Parser(input) {
  private var _interpreter: ParserATNSimulator
  private val _atn: ATN = atn
  private val _tokenNames: Array<String> = Array(atn.maxTokenType) { vocabulary.getDisplayName(it) }
  private val _ruleNames: Array<String> = ruleNames.toTypedArray()

  // Not shared like it is for generated parsers
  protected val decisionToDFA: Array<DFA>
  protected val sharedContextCache: PredictionContextCache = PredictionContextCache()

  /**
   * This stack corresponds to the `_parentctx`, `_parentState` pair of locals
   * that would exist on call stack frames with a recursive descent parser;
   * in the generated function for a left-recursive rule you'd see:
   *
   * ```
   * @Throws(RecognitionException::class)
   * private fun e(_p: Int): EContext {
   *   val _parentctx: ParserRuleContext? = _ctx  // Pair.first
   *   val _parentState: Int = state              // Pair.seconds
   *   ...
   * }
   * ```
   *
   * Those values are used to create new recursive rule invocation contexts
   * associated with left operand of an alt like `"expr '*' expr"`.
   */
  protected val _parentContextStack: ArrayDeque<Pair<ParserRuleContext, Int>> = ArrayDeque()

  /**
   * We need a map from (decision, inputIndex) -> forced alt for computing ambiguous
   * parse trees. For now, we allow exactly one override.
   */
  protected var overrideDecision: Int = -1
  protected var overrideDecisionInputIndex: Int = -1
  protected var overrideDecisionAlt: Int = -1

  // Latch and only override once; error might trigger infinite loop
  protected var overrideDecisionReached: Boolean = false

  protected val atnState: ATNState?
    get() = atn.states[state]


  override var interpreter: ParserATNSimulator
    get() = _interpreter
    set(value) {
      _interpreter = value
    }

  override val atn: ATN
    get() = _atn

  @Deprecated("Use vocabulary instead", ReplaceWith("vocabulary"))
  override val tokenNames: Array<String>
    get() = _tokenNames

  override val ruleNames: Array<String>
    get() = _ruleNames

  /**
   * What is the current context when we override a decisions?
   *
   * This tells us what the root of the parse tree is when using override
   * for an ambiguity/lookahead check.
   */
  public var overrideDecisionRoot: InterpreterRuleContext? = null
    protected set

  /**
   * Return the root of the parse, which can be useful if the parser bails out.
   *
   * You still can access the top node. Note that, because of the way left
   * recursive rules add children, it's possible that the root will not have
   * any children if the start rule immediately called and left recursive
   * rule that fails.
   *
   * @since 4.5.1
   */
  public var rootContext: InterpreterRuleContext? = null
    protected set

  init {
    // Init decision DFA
    val numberOfDecisions = atn.numberOfDecisions
    decisionToDFA = Array(numberOfDecisions) {
      DFA(atn.getDecisionState(it)!!, it)
    }

    // Get ATN simulator that knows how to do predictions
    @Suppress("LeakingThis")
    _interpreter = ParserATNSimulator(this, atn, decisionToDFA, sharedContextCache)
  }

  override fun reset() {
    super.reset()
    overrideDecisionReached = false
    overrideDecisionRoot = null
  }

  /**
   * Begin parsing at [startRuleIndex].
   */
  public open fun parse(startRuleIndex: Int): ParserRuleContext {
    val startRuleStartState = atn.ruleToStartState!![startRuleIndex]
    rootContext = createInterpreterRuleContext(null, ATNState.INVALID_STATE_NUMBER, startRuleIndex)

    if (startRuleStartState.isLeftRecursiveRule) {
      enterRecursionRule(rootContext!!, startRuleStartState.stateNumber, startRuleIndex, 0)
    } else {
      enterRule(rootContext!!, startRuleStartState.stateNumber, startRuleIndex)
    }

    while (true) {
      val p = atnState!!

      when (p.stateType) {
        ATNState.RULE_STOP -> {
          // Pop, return from rule
          if (context!!.isEmpty) {
            if (startRuleStartState.isLeftRecursiveRule) {
              val result = context
              val parentContext = _parentContextStack.removeFirst()
              unrollRecursionContexts(parentContext.first)
              return result!!
            } else {
              exitRule()
              return rootContext!!
            }
          }

          visitRuleStopState(p)
        }
        else -> {
          try {
            visitState(p)
          } catch (e: RecognitionException) {
            state = atn.ruleToStopState!![p.ruleIndex]!!.stateNumber
            context!!.exception = e
            errorHandler.reportError(this, e)
            recover(e)
          }
        }
      }
    }
  }

  override fun enterRecursionRule(localctx: ParserRuleContext, state: Int, ruleIndex: Int, precedence: Int) {
    val pair = Pair(context!!, localctx.invokingState)
    _parentContextStack.addFirst(pair)
    super.enterRecursionRule(localctx, state, ruleIndex, precedence)
  }

  protected open fun visitState(p: ATNState) {
    var predictedAlt = 1

    if (p is DecisionState) {
      predictedAlt = visitDecisionState(p)
    }

    val transition = p.transition(predictedAlt - 1)

    when (transition.serializationType) {
      Transition.EPSILON -> {
        if (
          p.stateType == ATNState.STAR_LOOP_ENTRY &&
          (p as StarLoopEntryState).isPrecedenceDecision &&
          transition.target !is LoopEndState
        ) {
          // We are at the start of a left recursive rule's (...)* loop,
          // and we're not taking the exit branch of loop.
          val localctx = createInterpreterRuleContext(
            _parentContextStack.first().first,
            _parentContextStack.first().second,
            context!!.ruleIndex,
          )

          pushNewRecursionContext(
            localctx,
            atn.ruleToStartState!![p.ruleIndex].stateNumber,
            context!!.ruleIndex,
          )
        }
      }
      Transition.ATOM -> {
        match((transition as AtomTransition).label)
      }
      Transition.RANGE,
      Transition.SET,
      Transition.NOT_SET -> {
        if (!transition.matches(_input.LA(1), Token.MIN_USER_TOKEN_TYPE, 65535)) {
          recoverInline()
        }

        matchWildcard()
      }
      Transition.WILDCARD -> {
        matchWildcard()
      }
      Transition.RULE -> {
        val ruleStartState = transition.target as RuleStartState
        val ruleIndex = ruleStartState.ruleIndex
        val newCtx = createInterpreterRuleContext(context, p.stateNumber, ruleIndex)

        if (ruleStartState.isLeftRecursiveRule) {
          enterRecursionRule(newCtx, ruleStartState.stateNumber, ruleIndex, (transition as RuleTransition).precedence)
        } else {
          enterRule(newCtx, transition.target.stateNumber, ruleIndex)
        }
      }
      Transition.PREDICATE -> {
        val predicateTransition = transition as PredicateTransition

        if (!sempred(context, predicateTransition.ruleIndex, predicateTransition.predIndex)) {
          throw FailedPredicateException(this)
        }
      }
      Transition.ACTION -> {
        val actionTransition = transition as ActionTransition
        action(context, actionTransition.ruleIndex, actionTransition.actionIndex)
      }
      Transition.PRECEDENCE -> {
        if (!precpred(context!!, (transition as PrecedencePredicateTransition).precedence)) {
          throw FailedPredicateException(this, "precpred(_ctx, ${transition.precedence})")
        }
      }
      else -> {
        throw UnsupportedOperationException("Unrecognized ATN transition type.")
      }
    }

    state = transition.target.stateNumber
  }

  /**
   * Method [visitDecisionState] is called when the interpreter reaches
   * a decision state (instance of [DecisionState]).
   *
   * It gives an opportunity for subclasses to track interesting things.
   */
  protected open fun visitDecisionState(p: DecisionState): Int {
    var predictedAlt = 1

    if (p.numberOfTransitions > 1) {
      errorHandler.sync(this)
      val decision = p.decision

      if (
        decision == overrideDecision &&
        _input.index() == overrideDecisionInputIndex &&
        !overrideDecisionReached
      ) {
        predictedAlt = overrideDecisionAlt
        overrideDecisionReached = true
      } else {
        predictedAlt = interpreter.adaptivePredict(_input, decision, context)
      }
    }

    return predictedAlt
  }

  /**
   * Provide simple "factory" for [InterpreterRuleContext]'s.
   *
   * @since 4.5.1
   */
  protected open fun createInterpreterRuleContext(
    parent: ParserRuleContext?,
    invokingStateNumber: Int,
    ruleIndex: Int,
  ): InterpreterRuleContext =
    InterpreterRuleContext(parent, invokingStateNumber, ruleIndex)

  protected open fun visitRuleStopState(p: ATNState) {
    val ruleStartState = atn.ruleToStartState!![p.ruleIndex]

    if (ruleStartState.isLeftRecursiveRule) {
      val parentContext = _parentContextStack.removeFirst()
      unrollRecursionContexts(parentContext.first)
      state = parentContext.second
    } else {
      exitRule()
    }

    val ruleTransition = atn.states[state]!!.transition(0) as RuleTransition
    state = ruleTransition.followState.stateNumber
  }

  /**
   * Override this parser interpreters normal decision-making process
   * at a particular decision and input token index. Instead of
   * allowing the adaptive prediction mechanism to choose the
   * first alternative within a block that leads to a successful parse,
   * force it to take the alternative, `1..n` for `n` alternatives.
   *
   * As an implementation limitation right now, you can only specify one
   * override. This is sufficient to allow construction of different
   * parse trees for ambiguous input. It means re-parsing the entire input
   * in general because you're never sure where an ambiguous sequence would
   * live in the various parse trees. For example, in one interpretation,
   * an ambiguous input sequence would be matched completely in expression
   * but in another it could match all the way back to the root.
   *
   * ```
   * s : e '!'? ;
   * e : ID
   * | ID '!'
   * ;
   * ```
   *
   * Here, `x!` can be matched as `(s (e ID) !)` or `(s (e ID !))`.
   * In the first case, the ambiguous sequence is fully contained only by the root.
   * In the second case, the ambiguous sequences fully contained within just
   * e, as in: `(e ID !)`.
   *
   * Rather than trying to optimize this and make
   * some intelligent decisions for optimization purposes, I settled on
   * just re-parsing the whole input and then using
   * [Trees.getRootOfSubtreeEnclosingRegion] to find the minimal
   * subtree that contains the ambiguous sequence. I originally tried to
   * record the call stack at the point the parser detected and ambiguity but
   * left recursive rules create a parse tree stack that does not reflect
   * the actual call stack. That impedance mismatch was enough to make
   * it challenging to restart the parser at a deeply nested rule
   * invocation.
   *
   * Only parser interpreters can override decisions to avoid inserting
   * override checking code in the critical `ALL(*)` prediction execution path.
   *
   * @since 4.5.1
   */
  public open fun addDecisionOverride(decision: Int, tokenIndex: Int, forcedAlt: Int) {
    overrideDecision = decision
    overrideDecisionInputIndex = tokenIndex
    overrideDecisionAlt = forcedAlt
  }

  /**
   * Rely on the error handler for this parser but, if no tokens are consumed
   * to recover, add an error node. Otherwise, nothing is seen in the parse tree.
   */
  protected open fun recover(e: RecognitionException) {
    val i = _input.index()
    errorHandler.recover(this, e)

    if (_input.index() == i) {
      // No input consumed, better add an error node
      if (e is InputMismatchException) {
        val tok = e.offendingToken
        var expectedTokenType = Token.INVALID_TYPE

        if (!e.expectedTokens!!.isNil) {
          // Get any element
          expectedTokenType = e.expectedTokens!!.minElement
        }

        val errToken = tokenFactory.create(
          Pair(tok!!.tokenSource, tok.inputStream),
          expectedTokenType,
          tok.text,
          Token.DEFAULT_CHANNEL,
          -1, // Invalid start/stop
          -1, // Invalid start/stop
          tok.line,
          tok.charPositionInLine,
        )

        context!!.addErrorNode(createErrorNode(context, errToken))
      } else {
        // NoViableAlt
        val tok = e.offendingToken
        val errToken = tokenFactory.create(
          Pair(tok!!.tokenSource, tok.inputStream),
          Token.INVALID_TYPE,
          tok.text,
          Token.DEFAULT_CHANNEL,
          -1, // Invalid start/stop
          -1, // Invalid start/stop
          tok.line,
          tok.charPositionInLine
        )

        context!!.addErrorNode(createErrorNode(context, errToken))
      }
    }
  }

  protected open fun recoverInline(): Token =
    errorHandler.recoverInline(this)
}
