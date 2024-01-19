// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.antlrkotlin.runtime.System
import com.strumenta.antlrkotlin.runtime.assert
import com.strumenta.antlrkotlin.runtime.synchronized
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.dfa.DFAState
import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * "dup" of [ParserInterpreter].
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class LexerATNSimulator(
  protected val recog: Lexer?,
  atn: ATN,
  public val decisionToDFA: Array<DFA>,
  sharedContextCache: PredictionContextCache,
) : ATNSimulator(atn, sharedContextCache) {
  public companion object {
    @Suppress("ConstPropertyName")
    public const val debug: Boolean = false

    @Suppress("ConstPropertyName")
    public const val dfa_debug: Boolean = false

    public const val MIN_DFA_EDGE: Int = 0
    public const val MAX_DFA_EDGE: Int = 127 // Forces unicode to stay in ATN
  }

  /**
   * The current token's starting index into the character stream.
   *
   * Shared across DFA to ATN simulation in case the ATN fails and the
   * DFA did not have a previous accept state. In this case, we use the
   * ATN-generated exception object.
   */
  protected var startIndex: Int = -1

  /**
   * Line number `1..n` within the input.
   */
  public var line: Int = 1

  /**
   * The index of the character relative to the beginning of the line `0..n-1`.
   */
  public var charPositionInLine: Int = 0

  protected var mode: Int = Lexer.DEFAULT_MODE

  /**
   * Used during DFA/ATN exec to record the most recent accept configuration info.
   */
  protected val prevAccept: SimState = SimState()

  /**
   * When we hit an accept state in either the DFA or the ATN, we
   * have to notify the character stream to start buffering characters
   * via [IntStream.mark] and record the current state. The current sim state
   * includes the current index into the input, the current line,
   * and current character position in that line. Note that the Lexer is
   * tracking the starting line and characterization of the token. These
   * variables track the "state" of the simulator when it hits an accept state.
   *
   * We track these variables separately for the DFA and ATN simulation
   * because the DFA simulation often has to fail over to the ATN
   * simulation. If the ATN simulation fails, we need the DFA to fall
   * back to its previously accepted state, if any. If the ATN succeeds,
   * then the ATN does the accept and the DFA simulator that invoked it
   * can simply return the predicted token type.
   */
  protected class SimState {
    public var index: Int = -1
    public var line: Int = 0
    public var charPos: Int = -1
    public var dfaState: DFAState? = null

    public fun reset() {
      index = -1
      line = 0
      charPos = -1
      dfaState = null
    }
  }

  public constructor(
    atn: ATN,
    decisionToDFA: Array<DFA>,
    sharedContextCache: PredictionContextCache,
  ) : this(null, atn, decisionToDFA, sharedContextCache)

  public open fun copyState(simulator: LexerATNSimulator) {
    charPositionInLine = simulator.charPositionInLine
    line = simulator.line
    mode = simulator.mode
    startIndex = simulator.startIndex
  }

  public open fun match(input: CharStream, mode: Int): Int {
    this.mode = mode
    val mark = input.mark()

    try {
      this.startIndex = input.index()
      this.prevAccept.reset()
      val dfa = decisionToDFA[mode]

      return if (dfa.s0 == null) {
        matchATN(input)
      } else {
        execATN(input, dfa.s0 as DFAState)
      }
    } finally {
      input.release(mark)
    }
  }

  override fun reset() {
    prevAccept.reset()
    startIndex = -1
    line = 1
    charPositionInLine = 0
    mode = Lexer.DEFAULT_MODE
  }

  override fun clearDFA() {
    for (d in decisionToDFA.indices) {
      decisionToDFA[d] = DFA(atn.getDecisionState(d)!!, d)
    }
  }

  protected open fun matchATN(input: CharStream): Int {
    val startState = atn.modeToStartState[mode]

    if (debug) {
      System.out.println("matchATN mode $mode start: $startState")
    }

    val oldMode = mode
    val s0Closure = computeStartState(input, startState)
    val suppressEdge = s0Closure.hasSemanticContext
    s0Closure.hasSemanticContext = false

    val next = addDFAState(s0Closure)

    if (!suppressEdge) {
      decisionToDFA[mode].s0 = next
    }

    val predict = execATN(input, next)

    if (debug) {
      System.out.println("DFA after matchATN: ${decisionToDFA[oldMode].toLexerString()}")
    }

    return predict
  }

  protected open fun execATN(input: CharStream, ds0: DFAState): Int {
    if (debug) {
      System.out.println("start state closure=${ds0.configs}")
    }

    if (ds0.isAcceptState) {
      // Allow zero-length tokens
      captureSimState(prevAccept, input, ds0)
    }

    var t = input.LA(1)

    // s is current/from DFA state
    var s = ds0

    while (true) {
      if (debug) {
        System.out.println("execATN loop starting closure: ${s.configs}")
      }

      // As we move src->trg, src->trg, we keep track of the previous trg to
      // avoid looking up the DFA state again, which is expensive.
      // If the previous target was already part of the DFA, we might
      // be able to avoid doing a reach operation upon t. If s!=null,
      // it means that semantic predicates didn't prevent us from
      // creating a DFA state. Once we know s!=null, we check to see if
      // the DFA state has an edge already for t. If so, we can just reuse
      // its configuration set; there's no point in re-computing it.
      // This is kind of like doing DFA simulation within the ATN
      // simulation because DFA simulation is really just a way to avoid
      // computing reach/closure sets. Technically, once we know that
      // we have a previously added DFA state, we could jump over to
      // the DFA simulator. But, that would mean popping back and forth
      // a lot and making things more complicated algorithmically.
      // This optimization makes a lot of sense for loops within DFA.
      // A character will take us back to an existing DFA state
      // that already has lots of edges out of it. e.g., .* in comments.
      val target = getExistingTargetState(s, t) ?: computeTargetState(input, s, t)

      if (target === ERROR) {
        break
      }

      // If this is a consumable input element, make sure to consume before
      // capturing the accept state so the input index, line, and char
      // position accurately reflect the state of the interpreter at the
      // end of the token.
      if (t != IntStream.EOF) {
        consume(input)
      }

      if (target.isAcceptState) {
        captureSimState(prevAccept, input, target)

        if (t == IntStream.EOF) {
          break
        }
      }

      t = input.LA(1)

      // Flip, current DFA target becomes new src/from state
      s = target
    }

    return failOrAccept(prevAccept, input, s.configs, t)
  }

  /**
   * Get an existing target state for an edge in the DFA.
   *
   * If the target state for the edge has not yet been computed
   * or is otherwise not available, this method returns `null`.
   *
   * @param s The current DFA state
   * @param t The next input symbol
   * @return The existing target DFA state for the given input symbol [t],
   *   or `null` if the target state for this edge is not already cached
   */
  public open fun getExistingTargetState(s: DFAState, t: Int): DFAState? {
    if (s.edges == null || t < MIN_DFA_EDGE || t > MAX_DFA_EDGE) {
      return null
    }

    val target = s.edges!![t - MIN_DFA_EDGE]

    if (debug && target != null) {
      System.out.println("reuse state ${s.stateNumber} edge to ${target.stateNumber}")
    }

    return target
  }

  /**
   * Compute a target state for an edge in the DFA, and attempt to add the
   * computed state and corresponding edge to the DFA.
   *
   * @param input The input stream
   * @param s The current DFA state
   * @param t The next input symbol
   *
   * @return The computed target DFA state for the given input symbol [t].
   *   If [t] does not lead to a valid DFA state, this method returns [ATNSimulator.ERROR]
   */
  public open fun computeTargetState(input: CharStream, s: DFAState, t: Int): DFAState {
    val reach = OrderedATNConfigSet()

    // If we don't find an existing DFA state
    // Fill reach starting from closure, following t transitions
    getReachableConfigSet(input, s.configs, reach, t)

    if (reach.isEmpty()) {
      // We got nowhere on t from s
      if (!reach.hasSemanticContext) {
        // We got nowhere on t, don't throw out this knowledge; it'd
        // cause a failover from DFA later.
        addDFAEdge(s, t, ERROR)
      }

      // Stop when we can't match any more char
      return ERROR
    }

    // Add an edge from s to target DFA found/created for reach
    return addDFAEdge(s, t, reach)
  }

  protected open fun failOrAccept(
    prevAccept: SimState,
    input: CharStream,
    reach: ATNConfigSet,
    t: Int,
  ): Int {
    if (prevAccept.dfaState != null) {
      val lexerActionExecutor = prevAccept.dfaState!!.lexerActionExecutor
      accept(
        input = input,
        lexerActionExecutor = lexerActionExecutor,
        startIndex = startIndex,
        index = prevAccept.index,
        line = prevAccept.line,
        charPos = prevAccept.charPos,
      )

      return prevAccept.dfaState!!.prediction
    }

    // If no accept and EOF is first char, return EOF
    if (t == IntStream.EOF && input.index() == startIndex) {
      return Token.EOF
    }

    throw LexerNoViableAltException(recog!!, input, startIndex, reach)
  }

  /**
   * Given a starting configuration set, figure out all ATN configurations
   * we can reach upon input [t].
   *
   * Parameter [reach] is a return parameter.
   */
  protected open fun getReachableConfigSet(input: CharStream, closure: ATNConfigSet, reach: ATNConfigSet, t: Int) {
    // This is used to skip processing for configs which have a lower priority
    // than a config that already reached an accept state for the same rule
    var skipAlt = ATN.INVALID_ALT_NUMBER

    for (c in closure) {
      val currentAltReachedAcceptState = c.alt == skipAlt

      if (currentAltReachedAcceptState && (c as LexerATNConfig).hasPassedThroughNonGreedyDecision()) {
        continue
      }

      if (debug) {
        System.out.println("testing ${getTokenName(t)} at ${c.toString(recog, true)}")
      }

      val n = c.state.numberOfTransitions

      for (ti in 0..<n) {
        val trans = c.state.transition(ti)
        val target = getReachableTarget(trans, t)

        if (target != null) {
          var lexerActionExecutor = (c as LexerATNConfig).lexerActionExecutor

          if (lexerActionExecutor != null) {
            lexerActionExecutor = lexerActionExecutor.fixOffsetBeforeMatch(input.index() - startIndex)
          }

          val treatEofAsEpsilon = t == CharStream.EOF

          if (
            closure(
              input = input,
              config = LexerATNConfig(c, target, lexerActionExecutor),
              configs = reach,
              currentAltReachedAcceptState = currentAltReachedAcceptState,
              speculative = true,
              treatEofAsEpsilon = treatEofAsEpsilon,
            )
          ) {
            // Any remaining configs for this alt have a lower priority than
            // the one that just reached an accept state.
            skipAlt = c.alt
            break
          }
        }
      }
    }
  }

  protected open fun accept(
    input: CharStream,
    lexerActionExecutor: LexerActionExecutor?,
    startIndex: Int,
    index: Int,
    line: Int,
    charPos: Int,
  ) {
    if (debug) {
      System.out.println("ACTION $lexerActionExecutor")
    }

    // Seek to after last char in token
    input.seek(index)
    this.line = line
    charPositionInLine = charPos

    if (lexerActionExecutor != null && recog != null) {
      lexerActionExecutor.execute(recog, input, startIndex)
    }
  }

  protected open fun getReachableTarget(trans: Transition, t: Int): ATNState? =
    if (trans.matches(t, Lexer.MIN_CHAR_VALUE, Lexer.MAX_CHAR_VALUE)) {
      trans.target
    } else {
      null
    }

  protected open fun computeStartState(input: CharStream, p: ATNState): ATNConfigSet {
    val initialContext = EmptyPredictionContext.Instance
    val configs = OrderedATNConfigSet()

    for (i in 0..<p.numberOfTransitions) {
      val target = p.transition(i).target
      val c = LexerATNConfig(target, i + 1, initialContext)
      closure(
        input = input,
        config = c,
        configs = configs,
        currentAltReachedAcceptState = false,
        speculative = false,
        treatEofAsEpsilon = false,
      )
    }

    return configs
  }

  /**
   * Since the alternatives within any lexer decision are ordered by
   * preference, this method stops pursuing the closure as soon as an accept
   * state is reached. After the first accept state is reached by depth-first
   * search from [config], all other (potentially reachable) states for
   * this rule would have a lower priority.
   *
   * @return `true` if an accept state is reached, otherwise `false`
   */
  protected open fun closure(
    input: CharStream,
    config: LexerATNConfig,
    configs: ATNConfigSet,
    currentAltReachedAcceptState: Boolean,
    speculative: Boolean,
    treatEofAsEpsilon: Boolean,
  ): Boolean {
    var tempCurrentAltReachedAcceptState = currentAltReachedAcceptState

    if (debug) {
      System.out.println("closure(${config.toString(recog, true)})")
    }

    if (config.state is RuleStopState) {
      if (debug) {
        if (recog != null) {
          System.out.println("closure at ${recog.ruleNames[config.state.ruleIndex]} rule stop $config")
        } else {
          System.out.println("closure at rule stop $config")
        }
      }

      if (config.context == null || config.context!!.hasEmptyPath()) {
        if (config.context == null || config.context!!.isEmpty) {
          configs.add(config)
          return true
        }

        configs.add(LexerATNConfig(config, config.state, EmptyPredictionContext.Instance))
        tempCurrentAltReachedAcceptState = true
      }

      if (config.context != null && !config.context!!.isEmpty) {
        for (i in 0..<config.context!!.size()) {
          if (config.context!!.getReturnState(i) != PredictionContext.EMPTY_RETURN_STATE) {
            val newContext = config.context!!.getParent(i) // "pop" return state
            val returnState = atn.states[config.context!!.getReturnState(i)]
            val c = LexerATNConfig(config, returnState!!, newContext!!)
            tempCurrentAltReachedAcceptState =
              closure(
                input = input,
                config = c,
                configs = configs,
                currentAltReachedAcceptState = tempCurrentAltReachedAcceptState,
                speculative = speculative,
                treatEofAsEpsilon = treatEofAsEpsilon,
              )
          }
        }
      }

      return tempCurrentAltReachedAcceptState
    }

    // Optimization
    if (!config.state.onlyHasEpsilonTransitions()) {
      if (!tempCurrentAltReachedAcceptState || !config.hasPassedThroughNonGreedyDecision()) {
        configs.add(config)
      }
    }

    val p = config.state

    for (i in 0..<p.numberOfTransitions) {
      val t = p.transition(i)
      val c = getEpsilonTarget(input, config, t, configs, speculative, treatEofAsEpsilon)

      if (c != null) {
        tempCurrentAltReachedAcceptState =
          closure(
            input = input,
            config = c,
            configs = configs,
            currentAltReachedAcceptState = tempCurrentAltReachedAcceptState,
            speculative = speculative,
            treatEofAsEpsilon = treatEofAsEpsilon,
          )
      }
    }

    return tempCurrentAltReachedAcceptState
  }

  // Side-effect: can alter configs.hasSemanticContext
  protected open fun getEpsilonTarget(
    input: CharStream,
    config: LexerATNConfig,
    t: Transition,
    configs: ATNConfigSet,
    speculative: Boolean,
    treatEofAsEpsilon: Boolean,
  ): LexerATNConfig? {
    var c: LexerATNConfig? = null

    when (t.serializationType) {
      Transition.RULE -> {
        val ruleTransition = t as RuleTransition
        val newContext = SingletonPredictionContext.create(config.context, ruleTransition.followState.stateNumber)
        c = LexerATNConfig(config, t.target, newContext)
      }
      Transition.PRECEDENCE -> throw UnsupportedOperationException("Precedence predicates are not supported in lexers.")
      Transition.PREDICATE -> {
        // Track traversing semantic predicates. If we traverse,
        // we cannot add a DFA state for this "reach" computation
        // because the DFA would not test the predicate again in the
        // future. Rather than creating collections of semantic predicates
        // like v3 and testing them on prediction, v4 will test them on the
        // fly all the time using the ATN not the DFA. This is slower, but
        // semantically it's not used that often. One of the key elements to
        // this predicate mechanism is not adding DFA states that see
        // predicates immediately afterward in the ATN. For example,
        //
        // a : ID {p1}? | ID {p2}? ;
        //
        // should create the start state for rule 'a' (to save start state
        // competition), but should not create target of ID state. The
        // collection of ATN states the following ID references includes
        // states reached by traversing predicates. Since this is when we
        // test them, we cannot cash the DFA state target of ID.
        val pt = t as PredicateTransition

        if (debug) {
          System.out.println("EVAL rule " + pt.ruleIndex + ":" + pt.predIndex)
        }

        configs.hasSemanticContext = true

        if (evaluatePredicate(input, pt.ruleIndex, pt.predIndex, speculative)) {
          c = LexerATNConfig(config, t.target)
        }
      }
      Transition.ACTION -> {
        if (config.context == null || config.context!!.hasEmptyPath()) {
          // Execute actions anywhere in the start rule for a token.
          //
          // TODO: if the entry rule is invoked recursively, some
          // actions may be executed during the recursive call. The
          // problem can appear when hasEmptyPath() is true but
          // isEmpty() is false. In this case, the config needs to be
          // split into two contexts - one with just the empty path
          // and another with everything but the empty path.
          // Unfortunately, the current algorithm does not allow
          // getEpsilonTarget to return two configurations, so
          // additional modifications are needed before we can support
          // the split operation.
          val lexerActionExecutor = LexerActionExecutor.append(
            config.lexerActionExecutor,
            atn.lexerActions!![(t as ActionTransition).actionIndex],
          )

          c = LexerATNConfig(config, t.target, lexerActionExecutor)
        } else {
          // Ignore actions in referenced rules
          c = LexerATNConfig(config, t.target)
        }
      }
      Transition.EPSILON -> {
        c = LexerATNConfig(config, t.target)
      }
      Transition.ATOM,
      Transition.RANGE,
      Transition.SET -> {
        if (treatEofAsEpsilon) {
          if (t.matches(CharStream.EOF, Lexer.MIN_CHAR_VALUE, Lexer.MAX_CHAR_VALUE)) {
            c = LexerATNConfig(config, t.target)
          }
        }
      }
    }

    return c
  }

  /**
   * Evaluate a predicate specified in the lexer.
   *
   * If [speculative] is `true`, this method was called before
   * [consume] for the matched character. This method should call
   * [consume] before evaluating the predicate to ensure position
   * sensitive values, including [Lexer.text], [Lexer.line],
   * and [Lexer.charPositionInLine], properly reflect the current
   * lexer state. This method should restore [input] and the simulator
   * to the original state before returning (i.e., undo the actions made by the
   * call to [consume]).
   *
   * @param input The input stream
   * @param ruleIndex The rule containing the predicate
   * @param predIndex The index of the predicate within the rule
   * @param speculative `true` if the current index in [input] is
   *   one character before the predicate's location
   * @return `true` if the specified predicate evaluates to `true`
   */
  protected open fun evaluatePredicate(
    input: CharStream,
    ruleIndex: Int,
    predIndex: Int,
    speculative: Boolean
  ): Boolean {
    // Assume true if no recognizer was provided
    if (recog == null) {
      return true
    }

    if (!speculative) {
      return recog.sempred(null, ruleIndex, predIndex)
    }

    val savedCharPositionInLine = charPositionInLine
    val savedLine = line
    val index = input.index()
    val marker = input.mark()

    try {
      consume(input)
      return recog.sempred(null, ruleIndex, predIndex)
    } finally {
      charPositionInLine = savedCharPositionInLine
      line = savedLine
      input.seek(index)
      input.release(marker)
    }
  }

  protected open fun captureSimState(settings: SimState, input: CharStream, dfaState: DFAState) {
    settings.index = input.index()
    settings.line = line
    settings.charPos = charPositionInLine
    settings.dfaState = dfaState
  }

  protected open fun addDFAEdge(from: DFAState, t: Int, q: ATNConfigSet): DFAState {
    // Leading to this call, ATNConfigSet.hasSemanticContext is used as a
    // marker indicating dynamic predicate evaluation makes this edge
    // dependent on the specific input sequence, so the static edge in the
    // DFA should be omitted. The target DFAState is still created since
    // execATN has the ability to resynchronize with the DFA state cache
    // following the predicate evaluation step.
    //
    // TJP notes: next time through the DFA, we see a pred again and eval.
    // If that gets us to a previously created (but dangling) DFA
    // state, we can continue in pure DFA mode from there.
    val suppressEdge = q.hasSemanticContext
    q.hasSemanticContext = false

    val to = addDFAState(q)

    if (suppressEdge) {
      return to
    }

    addDFAEdge(from, t, to)
    return to
  }

  protected open fun addDFAEdge(p: DFAState, t: Int, q: DFAState) {
    if (t < MIN_DFA_EDGE || t > MAX_DFA_EDGE) {
      // Only track edges within the DFA bounds
      return
    }

    if (debug) {
      System.out.println("EDGE $p -> $q upon ${t.toChar()}")
    }

    synchronized(p) {
      if (p.edges == null) {
        // Make room for tokens 1..n and -1 masquerading as index 0
        p.edges = arrayOfNulls(MAX_DFA_EDGE - MIN_DFA_EDGE + 1)
      }

      // Connect
      p.edges!![t - MIN_DFA_EDGE] = q
    }
  }

  /**
   * Add a new DFA state if there isn't one with this set of
   * configurations already.
   *
   * This method also detects the first configuration containing
   * an ATN rule stop state. Later, when traversing the DFA,
   * we will know which rule to accept.
   */
  protected open fun addDFAState(configs: ATNConfigSet): DFAState {
    // The lexer evaluates predicates on-the-fly; by this point configs
    // should not contain any configurations with unevaluated predicates
    assert(!configs.hasSemanticContext)

    val proposed = DFAState(configs)
    var firstConfigWithRuleStopState: ATNConfig? = null

    for (c in configs) {
      if (c.state is RuleStopState) {
        firstConfigWithRuleStopState = c
        break
      }
    }

    if (firstConfigWithRuleStopState != null) {
      proposed.isAcceptState = true
      proposed.lexerActionExecutor = (firstConfigWithRuleStopState as LexerATNConfig).lexerActionExecutor
      proposed.prediction = atn.ruleToTokenType!![firstConfigWithRuleStopState.state.ruleIndex]
    }

    val dfa = decisionToDFA[mode]
    synchronized(dfa.states) {
      val existing = dfa.states[proposed]

      if (existing != null) {
        return existing
      }

      proposed.stateNumber = dfa.states.size
      configs.isReadonly = true
      proposed.configs = configs
      dfa.states[proposed] = proposed
      return proposed
    }
  }

  public open fun getDFA(mode: Int): DFA =
    decisionToDFA[mode]

  /**
   * Get the text matched so far for the current token.
   */
  public open fun getText(input: CharStream): String =
    // Index is first lookahead char, don't include
    input.getText(Interval.of(startIndex, input.index() - 1))

  public open fun consume(input: CharStream) {
    val curChar = input.LA(1)

    if (curChar.toChar() == '\n') {
      line++
      charPositionInLine = 0
    } else {
      charPositionInLine++
    }

    input.consume()
  }

  public open fun getTokenName(t: Int): String =
    if (t == -1) {
      "EOF"
    } else {
      "'${t.toChar()}'"
    }
}
