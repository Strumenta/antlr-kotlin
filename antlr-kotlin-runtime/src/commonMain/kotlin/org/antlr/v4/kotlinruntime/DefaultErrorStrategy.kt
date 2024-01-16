// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.System
import org.antlr.v4.kotlinruntime.atn.ATNState
import org.antlr.v4.kotlinruntime.atn.RuleTransition
import org.antlr.v4.kotlinruntime.misc.IntervalSet

/**
 * This is the default implementation of [ANTLRErrorStrategy] used for
 * error reporting and recovery in ANTLR parsers.
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class DefaultErrorStrategy : ANTLRErrorStrategy {
  /**
   * Indicates whether the error strategy is currently "recovering from an error".
   *
   * This is used to suppress reporting multiple error messages while
   * attempting to recover from a detected syntax error.
   *
   * @see inErrorRecoveryMode
   */
  protected var errorRecoveryMode: Boolean = false

  /**
   * The index into the input stream where the last error occurred.
   *
   * This is used to prevent infinite loops where an error is found
   * but no token is consumed during recovery...another error is found,
   * ad nauseam.
   *
   * This is a failsafe mechanism to guarantee that at least
   * one token/tree node is consumed for two errors.
   */
  protected var lastErrorIndex: Int = -1
  protected var lastErrorStates: IntervalSet? = null

  /**
   * This field is used to propagate information about the lookahead following
   * the previous match.
   *
   * Since prediction prefers completing the current rule to error recovery efforts,
   * error reporting may occur later than the original point where it was discoverable.
   *
   * The original context is used to compute the true expected sets
   * as though the reporting occurred as early as possible.
   */
  protected var nextTokensContext: ParserRuleContext? = null

  /**
   * @see nextTokensContext
   */
  protected var nextTokensState: Int = 0

  /**
   * The default implementation simply calls [endErrorCondition] to
   * ensure that the handler is not in error recovery mode.
   */
  override fun reset(recognizer: Parser): Unit =
    endErrorCondition(recognizer)

  /**
   * This method is called to enter error recovery mode when a recognition
   * exception is reported.
   *
   * @param recognizer The parser instance
   */
  protected open fun beginErrorCondition(recognizer: Parser) {
    errorRecoveryMode = true
  }

  override fun inErrorRecoveryMode(recognizer: Parser): Boolean =
    errorRecoveryMode

  /**
   * This method is called to leave error recovery mode after recovering from
   * a recognition exception.
   *
   * @param recognizer
   */
  protected open fun endErrorCondition(recognizer: Parser) {
    errorRecoveryMode = false
    lastErrorStates = null
    lastErrorIndex = -1
  }

  /**
   * The default implementation simply calls [endErrorCondition].
   */
  override fun reportMatch(recognizer: Parser): Unit =
    endErrorCondition(recognizer)

  /**
   * The default implementation returns immediately if the handler is already
   * in error recovery mode. Otherwise, it calls [beginErrorCondition]
   * and dispatches the reporting task based on the runtime type of [e]
   * according to the following table.
   *
   * - [NoViableAltException]: dispatches the call to [reportNoViableAlternative]
   * - [InputMismatchException]: dispatches the call to [reportInputMismatch]
   * - [FailedPredicateException]: dispatches the call to [reportFailedPredicate]
   * - All other types: calls [Parser.notifyErrorListeners] to report the exception
   */
  override fun reportError(recognizer: Parser, e: RecognitionException) {
    // If we've already reported an error and have not matched a token
    // yet successfully, don't report any errors
    if (inErrorRecoveryMode(recognizer)) {
      // Don't report spurious errors
      return
    }

    beginErrorCondition(recognizer)

    when (e) {
      is NoViableAltException -> reportNoViableAlternative(recognizer, e)
      is InputMismatchException -> reportInputMismatch(recognizer, e)
      is FailedPredicateException -> reportFailedPredicate(recognizer, e)
      else -> {
        System.err.println("unknown recognition error type: $e")
        recognizer.notifyErrorListeners(e.offendingToken!!, e.message!!, e)
      }
    }
  }

  /**
   * The default implementation resynchronizes the parser by consuming tokens
   * until we find one in the resynchronization set--loosely the set of tokens
   * that can follow the current rule.
   */
  override fun recover(recognizer: Parser, e: RecognitionException) {
    var lastErrorStatesTemp = lastErrorStates

    if (
      lastErrorIndex == recognizer.tokenStream.index() &&
      lastErrorStatesTemp != null &&
      lastErrorStatesTemp.contains(recognizer.state)
    ) {
      // Uh oh, another error at same token index and previously-visited
      // state in ATN; must be a case where LT(1) is in the recovery
      // token set so nothing got consumed. Consume a single token
      // at least to prevent an infinite loop; this is a failsafe.
      recognizer.consume()
    }

    lastErrorIndex = recognizer.tokenStream.index()

    if (lastErrorStatesTemp == null) {
      lastErrorStatesTemp = IntervalSet()
      lastErrorStates = lastErrorStatesTemp
    }

    lastErrorStatesTemp.add(recognizer.state)

    val followSet = getErrorRecoverySet(recognizer)
    consumeUntil(recognizer, followSet)
  }

  /**
   * The default implementation of [ANTLRErrorStrategy.sync] makes sure
   * that the current lookahead symbol is consistent with what were expecting
   * at this point in the ATN. You can call this anytime but ANTLR only
   * generates code to check before sub-rules/loops and each iteration.
   *
   * Implements Jim Idle's magic sync mechanism in closures and optional
   * sub-rules. E.g.,
   *
   * ```
   * a : sync ( stuff sync )* ;
   * sync : {consume to what can follow sync} ;
   * ```
   *
   * At the start of a sub-rule upon error, [sync] performs single
   * token deletion, if possible. If it can't do that, it bails on the current
   * rule and uses the default error recovery, which consumes until the
   * resynchronization set of the current rule.
   *
   * If the sub-rule is optional (`(...)?`, `(...)*`, or block
   * with an empty alternative), then the expected set includes what follows
   * the sub-rule.
   *
   * During loop iteration, it consumes until it sees a token that can start a
   * sub-rule or what follows loop. Yes, that is pretty aggressive. We opt to
   * stay in the loop as long as possible.
   *
   * ### ORIGINS
   *
   * Previous versions of ANTLR did a poor job of their recovery within loops.
   * A single mismatch token or missing token would force the parser to bail
   * out of the entire rules surrounding the loop. So, for rule
   *
   * ```
   * classDef : 'class' ID '{' member* '}'
   * ```
   *
   * input with an extra token between members would force the parser to
   * consume until it found the next class definition rather than the next
   * member definition of the current class.
   *
   * This functionality cost a little bit of effort because the parser has to
   * compare token set at the start of the loop and at each iteration. If for
   * some reason speed is suffering for you, you can turn off this
   * functionality by simply overriding this method as a blank { }.
   */
  override fun sync(recognizer: Parser) {
    val s = recognizer.interpreter.atn.states[recognizer.state]

    // If already recovering, don't try to sync
    if (inErrorRecoveryMode(recognizer)) {
      return
    }

    val tokens = recognizer.tokenStream
    val la = tokens.LA(1)

    // Try cheaper subset first; might get lucky. Seems to shave a wee bit off
    val nextTokens = recognizer.atn.nextTokens(s!!)

    if (nextTokens.contains(la)) {
      // We are sure the token matches
      nextTokensContext = null
      nextTokensState = ATNState.INVALID_STATE_NUMBER
      return
    }

    if (nextTokens.contains(Token.EPSILON)) {
      if (nextTokensContext == null) {
        // It's possible the next token won't match; information tracked
        // by sync is restricted for performance
        nextTokensContext = recognizer.context
        nextTokensState = recognizer.state
      }

      return
    }

    when (s.stateType) {
      ATNState.BLOCK_START,
      ATNState.STAR_BLOCK_START,
      ATNState.PLUS_BLOCK_START,
      ATNState.STAR_LOOP_ENTRY -> {
        // Report error and recover if possible
        if (singleTokenDeletion(recognizer) != null) {
          return
        }

        throw InputMismatchException(recognizer)
      }
      ATNState.PLUS_LOOP_BACK,
      ATNState.STAR_LOOP_BACK -> {
        reportUnwantedToken(recognizer)

        val expecting = recognizer.expectedTokens
        val whatFollowsLoopIterationOrRule = expecting.or(getErrorRecoverySet(recognizer))
        consumeUntil(recognizer, whatFollowsLoopIterationOrRule)
      }
      else -> {
        // Do nothing if we can't identify the exact kind of ATN state
      }
    }
  }

  /**
   * This is called by [reportError] when the exception is a [NoViableAltException].
   *
   * @param recognizer The parser instance
   * @param e The recognition exception
   *
   * @see reportError
   */
  protected open fun reportNoViableAlternative(recognizer: Parser, e: NoViableAltException) {
    val tokens = recognizer.tokenStream
    val input = if (e.startToken!!.type == Token.EOF) {
      "<EOF>"
    } else {
      tokens.getText(e.startToken, e.offendingToken!!)!!
    }

    val msg = "no viable alternative at input " + escapeWSAndQuote(input)
    recognizer.notifyErrorListeners(e.offendingToken!!, msg, e)
  }

  /**
   * This is called by [reportError] when the exception is an [InputMismatchException].
   *
   * @param recognizer The parser instance
   * @param e The recognition exception
   *
   * @see reportError
   */
  protected open fun reportInputMismatch(recognizer: Parser, e: InputMismatchException) {
    val tokenErrorDisplay = getTokenErrorDisplay(e.offendingToken)
    val expectedToken = e.expectedTokens!!.toString(recognizer.vocabulary)
    val msg = "mismatched input $tokenErrorDisplay expecting $expectedToken"
    recognizer.notifyErrorListeners(e.offendingToken!!, msg, e)
  }

  /**
   * This is called by [reportError] when the exception is a [FailedPredicateException].
   *
   * @param recognizer The parser instance
   * @param e The recognition exception
   *
   * @see reportError
   */
  protected open fun reportFailedPredicate(recognizer: Parser, e: FailedPredicateException) {
    val ruleName = recognizer.ruleNames[recognizer.context!!.ruleIndex]
    val msg = "rule $ruleName ${e.message}"
    recognizer.notifyErrorListeners(e.offendingToken!!, msg, e)
  }

  /**
   * This method is called to report a syntax error which requires the removal
   * of a token from the input stream. At the time this method is called, the
   * erroneous symbol is current `LT(1)` symbol and has not yet been
   * removed from the input stream. When this method returns,
   * [recognizer] is in error recovery mode.
   *
   * This method is called when [singleTokenDeletion] identifies
   * single-token deletion as a viable recovery strategy for a mismatched
   * input error.
   *
   * The default implementation simply returns if the handler is already in
   * error recovery mode. Otherwise, it calls [beginErrorCondition] to
   * enter error recovery mode, followed by calling [Parser.notifyErrorListeners].
   *
   * @param recognizer The parser instance
   */
  protected open fun reportUnwantedToken(recognizer: Parser) {
    if (inErrorRecoveryMode(recognizer)) {
      return
    }

    beginErrorCondition(recognizer)

    val t = recognizer.currentToken!!
    val tokenName = getTokenErrorDisplay(t)
    val expecting = getExpectedTokens(recognizer)
    val msg = "extraneous input $tokenName expecting ${expecting.toString(recognizer.vocabulary)}"
    recognizer.notifyErrorListeners(t, msg, null)
  }

  /**
   * This method is called to report a syntax error which requires the
   * insertion of a missing token into the input stream. At the time this
   * method is called, the missing token has not yet been inserted. When this
   * method returns, [recognizer] is in error recovery mode.
   *
   * This method is called when [singleTokenInsertion] identifies
   * single-token insertion as a viable recovery strategy for a mismatched
   * input error.
   *
   * The default implementation simply returns if the handler is already in
   * error recovery mode. Otherwise, it calls [beginErrorCondition] to
   * enter error recovery mode, followed by calling [Parser.notifyErrorListeners].
   *
   * @param recognizer The parser instance
   */
  protected open fun reportMissingToken(recognizer: Parser) {
    if (inErrorRecoveryMode(recognizer)) {
      return
    }

    beginErrorCondition(recognizer)

    val t = recognizer.currentToken!!
    val expecting = getExpectedTokens(recognizer)
    val msg = "missing ${expecting.toString(recognizer.vocabulary)} at ${getTokenErrorDisplay(t)}"
    recognizer.notifyErrorListeners(t, msg, null)
  }

  /**
   * The default implementation attempts to recover from the mismatched input
   * by using single token insertion and deletion as described below. If the
   * recovery attempt fails, this method throws an [InputMismatchException].
   *
   * ### EXTRA TOKEN (single token deletion)
   *
   * `LA(1)` is not what we are looking for. If `LA(2)` has the
   * right token, however, then assume `LA(1)` is some extra spurious
   * token and delete it. Then consume and return the next token (which was
   * the `LA(2)` token) as the successful result of the match operation.
   *
   * This recovery strategy is implemented by [singleTokenDeletion].
   *
   * ### MISSING TOKEN (single token insertion)
   *
   * If current token (at `LA(1)`) is consistent with what could come
   * after the expected `LA(1)` token, then assume the token is missing
   * and use the parser's [TokenFactory] to create it on the fly. The
   * "insertion" is performed by returning the created token as the successful
   * result of the match operation.
   *
   * This recovery strategy is implemented by [singleTokenInsertion].
   *
   * ### EXAMPLE
   *
   * For example, input `i = (3;` is clearly missing the `')'`. When
   * the parser returns from the nested call to `expr`, it will have
   * call chain:
   *
   * ```
   * stat -> expr -> atom
   * ```
   *
   * and it will be trying to match the `')'` at this point in the
   * derivation:
   *
   * ```
   * => ID '=' '(' INT ')' ('+' atom)* ';'
   *                 ^
   * ```
   *
   * The attempt to match `')'` will fail when it sees `';'` and
   * call [recoverInline]. To recover, it sees that `LA(1) == ';'`
   * is in the set of tokens that can follow the `')'` token reference
   * in rule `atom`. It can assume that you forgot the `')'`.
   */
  override fun recoverInline(recognizer: Parser): Token {
    // SINGLE TOKEN DELETION
    val matchedSymbol = singleTokenDeletion(recognizer)

    if (matchedSymbol != null) {
      // We have deleted the extra token.
      // Now, move past ttype token as if all were ok
      recognizer.consume()
      return matchedSymbol
    }

    // SINGLE TOKEN INSERTION
    if (singleTokenInsertion(recognizer)) {
      return getMissingSymbol(recognizer)
    }

    // Even that didn't work; must throw the exception
    val e = if (nextTokensContext == null) {
      InputMismatchException(recognizer)
    } else {
      InputMismatchException(recognizer, nextTokensState, nextTokensContext!!)
    }

    throw e
  }

  /**
   * This method implements the single-token insertion inline error recovery strategy.
   *
   * It is called by [recoverInline] if the single-token deletion strategy fails
   * to recover from the mismatched input.
   *
   * If this method returns `true`, [recognizer] will be in error recovery mode.
   *
   * This method determines whether single-token insertion is viable by
   * checking if the `LA(1)` input symbol could be successfully matched
   * if it were instead the `LA(2)` symbol.
   *
   * If this method returns `true`, the caller is responsible for creating
   * and inserting a token with the correct type to produce this behavior.
   *
   * @param recognizer The parser instance
   * @return `true` if single-token insertion is a viable recovery
   *   strategy for the current mismatched input, otherwise `false`
   */
  protected open fun singleTokenInsertion(recognizer: Parser): Boolean {
    val currentSymbolType = recognizer.tokenStream.LA(1)

    // If current token is consistent with what could come after current
    // ATN state, then we know we're missing a token; error recovery
    // is free to conjure up and insert the missing token
    val currentState = recognizer.interpreter.atn.states[recognizer.state]
    val next = currentState!!.transition(0).target
    val atn = recognizer.interpreter.atn
    val expectingAtLL2 = atn.nextTokens(next, recognizer.context)

    if (expectingAtLL2.contains(currentSymbolType)) {
      reportMissingToken(recognizer)
      return true
    }

    return false
  }

  /**
   * This method implements the single-token deletion inline error recovery strategy.
   *
   * It is called by [recoverInline] to attempt to recover from mismatched input.
   *
   * If this method returns `null`, the parser and error handler state will not have changed.
   *
   * If this method returns non-`null`, [recognizer] will *not* be in error recovery mode
   * since the returned token was a successful match.
   *
   * If the single-token deletion is successful, this method calls
   * [reportUnwantedToken] to report the error, followed by
   * [Parser.consume] to actually "delete" the extraneous token.
   * Then, before returning [reportMatch] is called to signal a successful match.
   *
   * @param recognizer The parser instance
   * @return The successfully matched [Token] instance if single-token
   *   deletion successfully recovers from the mismatched input, otherwise `null`
   */
  protected open fun singleTokenDeletion(recognizer: Parser): Token? {
    val nextTokenType = recognizer.tokenStream.LA(2)
    val expecting = getExpectedTokens(recognizer)

    if (expecting.contains(nextTokenType)) {
      reportUnwantedToken(recognizer)

      // Simply delete extra token
      recognizer.consume()

      // We want to return the token we're actually matching
      val matchedSymbol = recognizer.currentToken

      // We know current token is correct
      reportMatch(recognizer)
      return matchedSymbol
    }

    return null
  }

  /**
   * Conjure up a missing token during error recovery.
   *
   * The recognizer attempts to recover from single missing
   * symbols. But, actions might refer to that missing symbol.
   * For example, `x=ID {f($x);}`. The action clearly assumes
   * that there has been an identifier matched previously and that
   * `$x` points at that token. If that token is missing, but
   * the next token in the stream is what we want we assume that
   * this token is missing, and we keep going. Because we
   * have to return some token to replace the missing token,
   * we have to conjure one up. This method gives the user control
   * over the tokens returned for missing tokens. Mostly,
   * you will want to create something special for identifier
   * tokens. For literals such as `'{'` and `','`, the default
   * action in the parser or tree parser works. It simply creates
   * a [CommonToken] of the appropriate type. The text will be the token.
   * If you change what tokens must be created by the lexer,
   * override this method to create the appropriate tokens.
   */
  protected open fun getMissingSymbol(recognizer: Parser): Token {
    val currentSymbol = recognizer.currentToken
    val expecting = getExpectedTokens(recognizer)
    var expectedTokenType = Token.INVALID_TYPE

    if (!expecting.isNil) {
      // Get any element
      expectedTokenType = expecting.minElement
    }

    val tokenText = if (expectedTokenType == Token.EOF) {
      "<missing EOF>"
    } else {
      "<missing ${recognizer.vocabulary.getDisplayName(expectedTokenType)}>"
    }

    var current = currentSymbol
    val lookback = recognizer.tokenStream.LT(-1)

    if (current!!.type == Token.EOF && lookback != null) {
      current = lookback
    }

    return recognizer.tokenFactory.create(
      Pair(current.tokenSource, current.inputStream),
      expectedTokenType,
      tokenText,
      Token.DEFAULT_CHANNEL,
      -1,
      -1,
      current.line,
      current.charPositionInLine,
    )
  }

  protected open fun getExpectedTokens(recognizer: Parser): IntervalSet =
    recognizer.expectedTokens

  /**
   * How should a token be displayed in an error message?
   *
   * The default is to display just the text, but during development you might
   * want to have a lot of information spit out.
   *
   * Override in that case to use `t.toString()` (which, for [CommonToken],
   * dumps everything about the token).
   *
   * This is better than forcing you to override a method in
   * your token objects because you don't have to go modify your lexer
   * so that it creates a new Java type.
   */
  public open fun getTokenErrorDisplay(t: Token?): String {
    if (t == null) {
      return "<no token>"
    }

    var s = getSymbolText(t)

    if (s == null) {
      s = if (getSymbolType(t) == Token.EOF) {
        "<EOF>"
      } else {
        "<${getSymbolType(t)}>"
      }
    }

    return escapeWSAndQuote(s)
  }

  protected open fun getSymbolText(symbol: Token): String? =
    symbol.text

  protected open fun getSymbolType(symbol: Token): Int =
    symbol.type

  protected open fun escapeWSAndQuote(s: String): String {
    var ss = s
    ss = ss.replace("\n", "\\n")
    ss = ss.replace("\r", "\\r")
    ss = ss.replace("\t", "\\t")
    return "'$ss'"
  }

  /**
   * Compute the error recovery set for the current rule.
   *
   * During rule invocation, the parser pushes the set of tokens that can
   * follow that rule reference on the stack; this amounts to
   * computing FIRST of what follows the rule reference in the
   * enclosing rule. See `LinearApproximator.FIRST()`.
   *
   * This local follow set only includes tokens
   * from within the rule; i.e., the FIRST computation done by
   * ANTLR stops at the end of a rule.
   *
   * ### EXAMPLE
   *
   * When you find a "no viable alt exception", the input is not
   * consistent with any of the alternatives for rule `r`. The best
   * thing to do is to consume tokens until you see something that
   * can legally follow a call to `r` *or* any rule that called `r`.
   * You don't want the exact set of viable next tokens because the
   * input might just be missing a token--you might consume the
   * rest of the input looking for one of the missing tokens.
   *
   * Consider grammar:
   *
   * ```
   * a : '[' b ']'
   *   | '(' b ')'
   *   ;
   * b : c '^' INT ;
   * c : ID
   *   | INT
   *   ;
   * ```
   *
   * At each rule invocation, the set of tokens that could follow
   * that rule is pushed on a stack. Here are the various
   * context-sensitive follow sets:
   *
   * ```
   * FOLLOW(b1_in_a) = FIRST(']') = ']'
   * FOLLOW(b2_in_a) = FIRST(')') = ')'
   * FOLLOW(c_in_b) = FIRST('^') = '^'
   * ```
   *
   * Upon erroneous input "[]", the call chain is
   *
   * ```
   * a -> b -> c
   * ```
   *
   * and, hence, the follow context stack is:
   *
   * ```
   * depth     follow set       start of rule execution
   *   0         <EOF>                    a (from main())
   *   1          ']'                     b
   *   2          '^'                     c
   * ```
   *
   * Notice that `')'` is not included, because `b` would have to have
   * been called from a different context in rule `a` for `')'` to be
   * included.
   *
   * For error recovery, we cannot consider `FOLLOW(c)`
   * (context-sensitive or otherwise). We need the combined set of
   * all context-sensitive `FOLLOW` sets--the set of all tokens that
   * could follow any reference in the call chain. We need to
   * resync to one of those tokens. Note that `FOLLOW(c)='^'` and if
   * we resync'd to that token, we'd consume until `EOF`. We need to
   * sync to context-sensitive `FOLLOW`s for `a`, `b`, and `c`: `{']','^'}`.
   * In this case, for input "[]", `LA(1)` is `']'` and in the set, so we would
   * not consume anything. After printing an error, rule `c` would
   * return normally. Rule `b` would not find the required `'^'` though.
   * At this point, it gets a mismatched token error and throws an
   * exception (since `LA(1)` is not in the viable following token set).
   * The rule exception handler tries to recover, but finds
   * the same recovery set and doesn't consume anything.
   * Rule `b` exits normally returning to rule `a`.
   * Now it finds the `']'` (and with the successful match exits [errorRecoveryMode]).
   *
   * So, you can see that the parser walks up the call chain looking
   * for the token that was a member of the recovery set.
   *
   * Errors are not generated in [errorRecoveryMode].
   *
   * ANTLR's error recovery mechanism is based upon original ideas:
   *
   * Algorithms + Data Structures = Programs, by Niklaus Wirth
   *
   * and:
   *
   * [A note on error recovery in recursive descent parsers](http://portal.acm.org/citation.cfm?id=947902.947905)
   *
   * Later, Josef Grosch had some good ideas:
   *
   * [Efficient and Comfortable Error Recovery in Recursive Descent Parsers](ftp://www.cocolab.com/products/cocktail/doca4.ps/ell.ps.zip)
   *
   * Like Grosch I implement context-sensitive FOLLOW sets that are combined
   * at run-time upon error to avoid overhead during parsing.
   */
  protected open fun getErrorRecoverySet(recognizer: Parser): IntervalSet {
    val atn = recognizer.interpreter.atn
    var ctx: RuleContext? = recognizer.context
    val recoverSet = IntervalSet()

    while (ctx != null && ctx.invokingState >= 0) {
      // Compute what follows who invoked us
      val invokingState = atn.states[ctx.invokingState]
      val rt = invokingState!!.transition(0) as RuleTransition
      val follow = atn.nextTokens(rt.followState)
      recoverSet.addAll(follow)
      ctx = ctx.readParent()
    }

    recoverSet.remove(Token.EPSILON)
    return recoverSet
  }

  /**
   * Consume tokens until one matches the given token set.
   */
  protected open fun consumeUntil(recognizer: Parser, set: IntervalSet) {
    var ttype = recognizer.tokenStream.LA(1)

    while (ttype != Token.EOF && !set.contains(ttype)) {
      recognizer.consume()
      ttype = recognizer.tokenStream.LA(1)
    }
  }
}
