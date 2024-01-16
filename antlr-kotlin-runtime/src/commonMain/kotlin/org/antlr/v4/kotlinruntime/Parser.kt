// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.System
import com.strumenta.antlrkotlin.runtime.System.PrintStream
import com.strumenta.antlrkotlin.runtime.synchronized
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.misc.IntegerStack
import org.antlr.v4.kotlinruntime.misc.IntervalSet
import org.antlr.v4.kotlinruntime.tree.*
import org.antlr.v4.kotlinruntime.tree.pattern.ParseTreePattern
import org.antlr.v4.kotlinruntime.tree.pattern.ParseTreePatternMatcher

/**
 * This is all the parsing support code essentially; most of it is error recovery stuff.
 */
@Suppress("PropertyName", "MemberVisibilityCanBePrivate")
public abstract class Parser(input: TokenStream) : Recognizer<Token, ParserATNSimulator>() {
  public inner class TraceListener : ParseTreeListener {
    override fun enterEveryRule(ctx: ParserRuleContext) {
      System.out.println("enter   ${ruleNames[ctx.ruleIndex]}, LT(1)=${_input.LT(1)!!.text}")
    }

    override fun visitTerminal(node: TerminalNode) {
      System.out.println("consume ${node.symbol} rule ${ruleNames[context!!.ruleIndex]}")
    }

    override fun visitErrorNode(node: ErrorNode) {
      // Noop
    }

    override fun exitEveryRule(ctx: ParserRuleContext) {
      System.out.println("exit    ${ruleNames[ctx.ruleIndex]}, LT(1)=${_input.LT(1)!!.text}")
    }
  }

  public class TrimToSizeListener : ParseTreeListener {
    public companion object {
      public val INSTANCE: TrimToSizeListener = TrimToSizeListener()
    }

    override fun enterEveryRule(ctx: ParserRuleContext) {
      // Noop
    }

    override fun visitTerminal(node: TerminalNode) {
      // Noop
    }

    override fun visitErrorNode(node: ErrorNode) {
      // Noop
    }

    override fun exitEveryRule(ctx: ParserRuleContext) {
      if (ctx.children is ArrayList<*>) {
        (ctx.children as ArrayList<*>).trimToSize()
      }
    }
  }

  /**
   * This field holds the deserialized [ATN] with bypass alternatives, created
   * lazily upon first demand. In 4.10 I changed from `Map<serializedATNString, ATN>`
   * since we only need one per parser object, and also it complicates other targets
   * that don't use ATN strings.
   *
   * @see ATNDeserializationOptions.isGenerateRuleBypassTransitions
   */
  private var bypassAltsAtnCache: ATN? = null

  /**
   * The error handling strategy for the parser.
   *
   * The default value is a new instance of [DefaultErrorStrategy].
   */
  public var errorHandler: ANTLRErrorStrategy = DefaultErrorStrategy()

  /**
   * The input stream.
   */
  protected var _input: TokenStream = input

  protected val _precedenceStack: IntegerStack = IntegerStack().also {
    it.push(0)
  }

  /**
   * The [ParserRuleContext] object for the currently executing rule.
   *
   * This is always non-`null` during the parsing process.
   */
  public var context: ParserRuleContext? = null

  /**
   * Specifies whether the parser should construct a parse tree during
   * the parsing process.
   *
   * The default value is `true`.
   */
  public var buildParseTree: Boolean = true

  /**
   * When [isTrace]` = true` is called, a reference to the
   * [TraceListener] is stored here, so it can be easily removed in a
   * later call to [isTrace]` = false`.
   *
   * The listener itself is implemented as a parser listener
   * so this field is not directly used by other parser methods.
   */
  private var _tracer: TraceListener? = null

  /**
   * The list of [ParseTreeListener] listeners registered to receive
   * events during the parse.
   *
   * @see addParseListener
   * @see removeParseListener
   */
  protected var _parseListeners: MutableList<ParseTreeListener> = ArrayList()

  /**
   * The number of syntax errors reported during parsing.
   *
   * This value is incremented each time [notifyErrorListeners] is called.
   *
   * @see notifyErrorListeners
   */
  public var numberOfSyntaxErrors: Int = 0
    protected set

  /**
   * Indicates the parser has `match()`-ed the `EOF` token.
   *
   * @see exitRule
   */
  public var isMatchedEOF: Boolean = false
    protected set

  /**
   * Whether to trim the internal lists of the parse tree during parsing to conserve memory.
   *
   * This property is set to `false` by default for a newly constructed parser.
   */
  public var trimParseTree: Boolean
    get() = parseListeners.contains(TrimToSizeListener.INSTANCE)
    set(value) {
      if (value) {
        if (trimParseTree) {
          return
        }

        addParseListener(TrimToSizeListener.INSTANCE)
      } else {
        removeParseListener(TrimToSizeListener.INSTANCE)
      }
    }

  public val parseListeners: List<ParseTreeListener>
    get() = _parseListeners

  override var tokenFactory: TokenFactory<*>
    get() = _input.tokenSource.tokenFactory
    set(value) {
      _input.tokenSource.tokenFactory = value
    }

  /**
   * The ATN with bypass alternatives is expensive to create, so we create it lazily.
   *
   * @throws UnsupportedOperationException If the current parser does not
   *   implement the [serializedATN] method
   */
  public val atnWithBypassAlts: ATN
    get() {
      // Accessing 'serializedATN' is what might throw the UnsupportedOperationException
      val serializedAtn = serializedATN
      return synchronized(this) {
        bypassAltsAtnCache ?: let {
          val deserializationOptions = ATNDeserializationOptions()
          deserializationOptions.isGenerateRuleBypassTransitions = true

          val atnDeserializer = ATNDeserializer(deserializationOptions)
          val tempBypassAltsAtnCache = atnDeserializer.deserialize(serializedAtn.toCharArray())
          bypassAltsAtnCache = tempBypassAltsAtnCache
          tempBypassAltsAtnCache
        }
      }
    }

  /**
   * Get the token stream, or set the token stream and reset the parser.
   */
  public var tokenStream: TokenStream
    get() = _input
    set(value) {
      _input = DummyTokenStream
      reset()
      _input = value
    }

  /**
   * Match needs to return the current input symbol, which gets put
   * into the label for the associated token ref, e.g., `x = ID`.
   */
  public val currentToken: Token?
    get() = _input.LT(1)

  /**
   * The precedence level for the top-most precedence rule.
   *
   * It is `-1` if the parser context is not nested within a precedence rule.
   */
  public val precedence: Int
    get() = if (_precedenceStack.isEmpty) {
      -1
    } else {
      _precedenceStack.peek()
    }

  /**
   * The set of input symbols which could follow the current parser
   * state and context, as given by [state] and [context], respectively.
   *
   * @see ATN.getExpectedTokens
   */
  public val expectedTokens: IntervalSet
    get() = atn.getExpectedTokens(state, context)

  public val expectedTokensWithinCurrentRule: IntervalSet
    get() {
      val atn = interpreter.atn
      val s = atn.states[state]
      return atn.nextTokens(s!!)
    }

  /**
   * For debugging and other purposes.
   */
  public val dfaStrings: List<String>
    get() = synchronized(interpreter.decisionToDFA) {
      val s = ArrayList<String>()

      for (d in 0..<interpreter.decisionToDFA.size) {
        val dfa = interpreter.decisionToDFA[d]
        s.add(dfa.toString(vocabulary))
      }

      return s
    }

  public val sourceName: String
    get() = _input.sourceName

  override val parseInfo: ParseInfo?
    get() {
      val interp = interpreter
      return if (interp is ProfilingATNSimulator) {
        ParseInfo(interp)
      } else {
        null
      }
    }

  /**
   * During a parse is sometimes useful to listen in on the rule entry and exit
   * events as well as token matches. This is for quick and dirty debugging.
   */
  public var isTrace: Boolean
    get() = _tracer != null
    set(trace) {
      var tempTracer = _tracer

      if (!trace) {
        if (tempTracer != null) {
          removeParseListener(tempTracer)
        }

        _tracer = null
      } else {
        if (tempTracer != null) {
          removeParseListener(tempTracer)
        } else {
          tempTracer = TraceListener()
          _tracer = tempTracer
        }

        addParseListener(tempTracer)
      }
    }

  init {
    tokenStream = input
  }

  /**
   * Reset the parser's state.
   */
  public open fun reset() {
    tokenStream.seek(0)
    errorHandler.reset(this)
    context = null
    numberOfSyntaxErrors = 0
    isMatchedEOF = false
    _precedenceStack.clear()
    _precedenceStack.push(0)

    // TODO(Edoardo): 'interpreter' is abstract and might be initialized
    //  only after this method has been called for the first time
    //  (at instance construction time), so here we explicitly 'reset()'
    //  it only if it's not null.
    //  We might want to find a better way to initialize 'interpreter',
    //  or a better way to initialize the Parser instance to avoid calling
    //  this method during construction
    @Suppress("UNNECESSARY_SAFE_CALL")
    interpreter?.reset()
  }

  /**
   * Match current input symbol against [ttype].
   *
   * If the symbol type matches, [ANTLRErrorStrategy.reportMatch]
   * and [consume] are called to complete the match process.
   *
   * If the symbol type does not match, [ANTLRErrorStrategy.recoverInline]
   * is called on the current error strategy to attempt recovery.
   *
   * If [buildParseTree] is `true` and the token index of the symbol returned
   * by [ANTLRErrorStrategy.recoverInline] is `-1`, the symbol is added to
   * the parse tree by calling [createErrorNode] and then [ParserRuleContext.addErrorNode].
   *
   * @param ttype The token type to match
   * @return The matched symbol
   * @throws RecognitionException If the current input symbol did not match
   *   [ttype] and the error strategy could not recover from the mismatched symbol
   */
  public open fun match(ttype: Int): Token {
    var t = currentToken

    if (t!!.type == ttype) {
      if (ttype == Token.EOF) {
        isMatchedEOF = true
      }

      errorHandler.reportMatch(this)
      consume()
    } else {
      t = errorHandler.recoverInline(this)

      if (buildParseTree && t.tokenIndex == -1) {
        // We must have conjured up a new token during single token insertion
        // if it's not the current symbol
        context!!.addErrorNode(createErrorNode(context, t))
      }
    }

    return t
  }

  /**
   * Match current input symbol as a wildcard.
   *
   * If the symbol type matches (i.e., has a value greater than `0`),
   * [ANTLRErrorStrategy.reportMatch] and [consume] are called
   * to complete the match process.
   *
   * If the symbol type does not match, [ANTLRErrorStrategy.recoverInline]
   * is called on the current error strategy to attempt recovery.
   *
   * If [buildParseTree] is `true` and the token index of the symbol returned
   * by [ANTLRErrorStrategy.recoverInline] is `-1`, the symbol is added to
   * the parse tree by calling [Parser.createErrorNode] and then [ParserRuleContext.addErrorNode].
   *
   * @return The matched symbol
   * @throws RecognitionException If the current input symbol did not match
   *   a wildcard and the error strategy could not recover from the mismatched symbol
   */
  public open fun matchWildcard(): Token {
    var t = currentToken

    if (t!!.type > 0) {
      errorHandler.reportMatch(this)
      consume()
    } else {
      t = errorHandler.recoverInline(this)

      if (buildParseTree && t.tokenIndex == -1) {
        // We must have conjured up a new token during single token insertion
        // if it's not the current symbol
        context!!.addErrorNode(createErrorNode(context, t))
      }
    }

    return t
  }

  /**
   * Registers [listener] to receive events during the parsing process.
   *
   * To support output-preserving grammar transformations (including but not
   * limited to left-recursion removal, automated left-factoring, and
   * optimized code generation), calls to listener methods during the parse
   * may differ substantially from calls made by [ParseTreeWalker.DEFAULT]
   * used after the parse is complete.
   *
   * In particular, rule entry and exit events may occur in a different order
   * during the parse than after the parser. In addition, calls to certain
   * rule entry methods may be omitted.
   *
   * With the following specific exceptions, calls to listener events are
   * *deterministic*, i.e., for identical input the calls to listener
   * methods will be the same.
   *
   * - Alterations to the grammar used to generate code may change the
   *   behavior of the listener calls
   * - Alterations to the command line options passed to ANTLR 4 when
   *   generating the parser may change the behavior of the listener calls
   * - Changing the version of the ANTLR Tool used to generate the parser
   *   may change the behavior of the listener calls
   *
   * @param listener The listener to add
   */
  public open fun addParseListener(listener: ParseTreeListener) {
    _parseListeners.add(listener)
  }

  /**
   * Remove [listener] from the list of parse listeners.
   *
   * If [listener] has not been added as a parse listener, this method does nothing.
   *
   * @param listener The listener to remove
   * @see addParseListener
   */
  public open fun removeParseListener(listener: ParseTreeListener) {
    _parseListeners.remove(listener)
  }

  /**
   * Remove all parse listeners.
   *
   * @see addParseListener
   */
  public open fun removeParseListeners() {
    _parseListeners.clear()
  }

  /**
   * Notify any parse listeners of an enter rule event.
   *
   * @see addParseListener
   */
  protected open fun triggerEnterRuleEvent() {
    for (listener in _parseListeners) {
      listener.enterEveryRule(context!!)
      context!!.enterRule(listener)
    }
  }

  /**
   * Notify any parse listeners of an exit rule event.
   *
   * @see addParseListener
   */
  protected open fun triggerExitRuleEvent() {
    // Reverse order walk of listeners
    for (listener in _parseListeners.asReversed()) {
      context!!.exitRule(listener)
      listener.exitEveryRule(context!!)
    }
  }

  /**
   * The preferred method of getting a tree pattern.
   *
   * For example, here's a sample use:
   *
   * ```
   * val t: ParseTree = parser.expr()
   * val p: ParseTreePattern = parser.compileParseTreePattern("<ID>+0", MyParser.RULE_expr)
   * val m: ParseTreeMatch = p.match(t)
   * val id = m.get("ID")
   * ```
   */
  public open fun compileParseTreePattern(pattern: String, patternRuleIndex: Int): ParseTreePattern {
    val tokenSource = tokenStream.tokenSource

    if (tokenSource is Lexer) {
      return compileParseTreePattern(pattern, patternRuleIndex, tokenSource)
    }

    throw UnsupportedOperationException("Parser can't discover a lexer to use")
  }

  /**
   * The same as [compileParseTreePattern] but specify a
   * [Lexer] rather than trying to deduce it from this parser.
   */
  public open fun compileParseTreePattern(
    pattern: String,
    patternRuleIndex: Int,
    lexer: Lexer,
  ): ParseTreePattern {
    val m = ParseTreePatternMatcher(lexer, this)
    return m.compile(pattern, patternRuleIndex)
  }

  public open fun notifyErrorListeners(msg: String): Unit =
    notifyErrorListeners(currentToken!!, msg, null)

  public open fun notifyErrorListeners(
    offendingToken: Token,
    msg: String,
    e: RecognitionException?,
  ) {
    numberOfSyntaxErrors++

    val line = offendingToken.line
    val charPositionInLine = offendingToken.charPositionInLine
    val listener = errorListenerDispatch
    listener.syntaxError(this, offendingToken, line, charPositionInLine, msg, e)
  }

  /**
   * Consume and return the [current symbol][currentToken].
   *
   * E.g., given the following input with `A` being the current
   * lookahead symbol, this function moves the cursor to `B` and returns `A`.
   *
   * ```
   * A B
   * ^
   * ```
   *
   * If the parser is not in error recovery mode, the consumed symbol is added
   * to the parse tree using [ParserRuleContext.addChild], and
   * [ParseTreeListener.visitTerminal] is called on any parse listeners.
   *
   * If the parser *is* in error recovery mode, the consumed symbol is
   * added to the parse tree using [createErrorNode], then
   * [ParserRuleContext.addErrorNode], and then [ParseTreeListener.visitErrorNode]
   * is called on any parse listeners.
   */
  public open fun consume(): Token {
    val o = currentToken

    if (o!!.type != EOF) {
      tokenStream.consume()
    }

    if (buildParseTree || _parseListeners.isNotEmpty()) {
      if (errorHandler.inErrorRecoveryMode(this)) {
        val node = context!!.addErrorNode(createErrorNode(context, o))

        for (listener in _parseListeners) {
          listener.visitErrorNode(node)
        }
      } else {
        val node = context!!.addChild(createTerminalNode(context, o))

        for (listener in _parseListeners) {
          listener.visitTerminal(node)
        }
      }
    }

    return o
  }

  /**
   * How to create a token leaf node associated with a parent.
   *
   * Typically, the terminal node to create is not a function of the parent.
   *
   * @since 4.7
   */
  public open fun createTerminalNode(parent: ParserRuleContext?, t: Token): TerminalNode =
    TerminalNodeImpl(t)

  /**
   * How to create an error node, given a token, associated with a parent.
   *
   * Typically, the error node to create is not a function of the parent.
   *
   * @since 4.7
   */
  public open fun createErrorNode(parent: ParserRuleContext?, t: Token): ErrorNode =
    ErrorNodeImpl(t)

  protected open fun addContextToParseTree() {
    val parent = context!!.readParent()

    // Add current context to parent if we have a parent
    parent?.addChild(context!!)
  }

  /**
   * Always called by generated parsers upon entry to a rule.
   *
   * Access field [context] to get the current context.
   */
  public open fun enterRule(localctx: ParserRuleContext, state: Int, ruleIndex: Int) {
    this.state = state
    context = localctx
    context!!.start = _input.LT(1)

    if (buildParseTree) {
      addContextToParseTree()
    }

    triggerEnterRuleEvent()
  }

  public fun exitRule() {
    if (isMatchedEOF) {
      // If we have matched EOF, it cannot consume past EOF so we use LT(1) here.
      // LT(1) will be end of file
      context!!.stop = _input.LT(1)
    } else {
      // Stop node is what we just matched
      context!!.stop = _input.LT(-1)
    }

    // Trigger event on context, before it reverts to parent
    triggerExitRuleEvent()
    state = context!!.invokingState
    context = context!!.readParent()
  }

  public fun enterOuterAlt(localctx: ParserRuleContext, altNum: Int) {
    localctx.altNumber = altNum

    // If we have new localctx, make sure we replace existing ctx
    // that is previous child of parse tree
    if (buildParseTree && context !== localctx) {
      val parent = context!!.readParent()

      if (parent != null) {
        parent.removeLastChild()
        parent.addChild(localctx)
      }
    }

    context = localctx
  }

  public open fun enterRecursionRule(localctx: ParserRuleContext, state: Int, ruleIndex: Int, precedence: Int) {
    this.state = state
    _precedenceStack.push(precedence)
    context = localctx
    context!!.start = _input.LT(1)

    // Simulates rule entry for left-recursive rules
    triggerEnterRuleEvent()
  }

  /**
   * Like [enterRule] but for recursive rules.
   *
   * Make the current context the child of the incoming [localctx].
   */
  public open fun pushNewRecursionContext(localctx: ParserRuleContext, state: Int, ruleIndex: Int) {
    val previous = context
    previous!!.assignParent(localctx)
    previous.invokingState = state
    previous.stop = _input.LT(-1)

    context = localctx
    context!!.start = previous.start

    if (buildParseTree) {
      context!!.addChild(previous)
    }

    // Simulates rule entry for left-recursive rules
    triggerEnterRuleEvent()
  }

  public open fun unrollRecursionContexts(@Suppress("LocalVariableName") _parentctx: ParserRuleContext?) {
    _precedenceStack.pop()
    context!!.stop = _input.LT(-1)

    // Save current ctx (return value)
    val retCtx = context

    // Unroll so context is as it was before call to recursive method
    if (parseListeners.isNotEmpty()) {
      while (context !== _parentctx) {
        triggerExitRuleEvent()
        context = context!!.readParent()
      }
    } else {
      context = _parentctx
    }

    // Hook into tree
    retCtx!!.assignParent(_parentctx)

    if (buildParseTree && _parentctx != null) {
      // Add return ctx into invoking rule's tree
      _parentctx.addChild(retCtx)
    }
  }

  public open fun getInvokingContext(ruleIndex: Int): ParserRuleContext? {
    var p = context

    while (p != null) {
      if (p.ruleIndex == ruleIndex) {
        return p
      }

      p = p.readParent()
    }

    return null
  }

  override fun precpred(localctx: RuleContext, precedence: Int): Boolean =
    precedence >= _precedenceStack.peek()

  public open fun inContext(context: String): Boolean {
    // TODO: useful in parser?
    return false
  }

  /**
   * Checks whether [symbol] can follow the current state in the ATN.
   *
   * The behavior of this method is equivalent to the following, but is
   * implemented such that the complete context-sensitive follow set does not
   * need to be explicitly constructed.
   *
   * ```
   * return expectedTokens.contains(symbol)
   * ```
   *
   * @param symbol The symbol type to check
   * @return `true` if [symbol] can follow the current state in the ATN, otherwise `false`
   */
  public open fun isExpectedToken(symbol: Int): Boolean {
    val atn = interpreter.atn
    var ctx = context
    val s = atn.states[state]
    var following = atn.nextTokens(s!!)

    if (following.contains(symbol)) {
      return true
    }

    if (!following.contains(Token.EPSILON)) {
      return false
    }

    while (ctx != null && ctx.invokingState >= 0 && following.contains(Token.EPSILON)) {
      val invokingState = atn.states[ctx.invokingState]
      val rt = invokingState!!.transition(0) as RuleTransition
      following = atn.nextTokens(rt.followState)

      if (following.contains(symbol)) {
        return true
      }

      ctx = ctx.readParent()
    }

    return following.contains(Token.EPSILON) && symbol == Token.EOF
  }

  /**
   * Get a rule's index (i.e., `RULE_ruleName` field) or `-1` if not found.
   */
  public open fun getRuleIndex(ruleName: String): Int {
    val ruleIndex = ruleIndexMap[ruleName]
    return ruleIndex ?: -1
  }

  /**
   * Return a list of strings of the rule names in your parser instance
   * leading up to a call to the current rule.
   *
   * You could override if you want more details such as the file/line info
   * of where in the ATN a rule is invoked.
   *
   * This is very useful for error messages.
   */
  public fun getRuleInvocationStack(ctx: RuleContext? = context): List<String> {
    var p = ctx
    val ruleNames = ruleNames
    val stack = ArrayList<String>()

    while (p != null) {
      // Compute what follows who invoked us
      val ruleIndex = p.ruleIndex

      if (ruleIndex < 0) {
        stack.add("n/a")
      } else {
        stack.add(ruleNames[ruleIndex])
      }

      p = p.readParent()
    }

    return stack
  }

  /**
   * For debugging and other purposes.
   */
  public fun dumpDFA(dumpStream: PrintStream = System.out) {
    synchronized(interpreter.decisionToDFA) {
      var seenOne = false

      for (d in 0..<interpreter.decisionToDFA.size) {
        val dfa = interpreter.decisionToDFA[d]

        if (dfa.states.isNotEmpty()) {
          if (seenOne) {
            dumpStream.println()
          }

          dumpStream.println("Decision ${dfa.decision}:")
          dumpStream.print(dfa.toString(vocabulary))
          seenOne = true
        }
      }
    }
  }

  /**
   * @since 4.3
   */
  public fun setProfile(profile: Boolean) {
    val interp = interpreter
    val saveMode = interp.predictionMode

    if (profile) {
      if (interp !is ProfilingATNSimulator) {
        interpreter = ProfilingATNSimulator(this)
      }
    } else if (interp is ProfilingATNSimulator) {
      val sim = ParserATNSimulator(this, atn, interp.decisionToDFA, interp.sharedContextCache!!)
      interpreter = sim
    }

    interpreter.predictionMode = saveMode
  }
}
