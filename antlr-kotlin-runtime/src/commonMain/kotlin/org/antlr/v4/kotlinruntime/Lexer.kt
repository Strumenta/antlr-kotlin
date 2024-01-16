// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.System
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.misc.IntegerStack
import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * A lexer is a recognizer that draws input symbols from a character stream.
 *
 * Lexer grammars results in a subclass of this object.
 *
 * A Lexer object uses simplified `match()` and error recovery mechanisms
 * in the interest of speed.
 */
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
public abstract class Lexer(input: CharStream) : Recognizer<Int, LexerATNSimulator>(), TokenSource {
  public companion object {
    public const val DEFAULT_MODE: Int = 0
    public const val MORE: Int = -2
    public const val SKIP: Int = -3

    public const val DEFAULT_TOKEN_CHANNEL: Int = Token.DEFAULT_CHANNEL
    public const val HIDDEN: Int = Token.HIDDEN_CHANNEL
    public const val MIN_CHAR_VALUE: Int = 0x0000
    public const val MAX_CHAR_VALUE: Int = 0x10FFFF
  }

  protected var _input: CharStream = input

  @Suppress("LeakingThis")
  protected var _tokenFactorySourcePair: Pair<TokenSource, CharStream?> =
    Pair<TokenSource, CharStream?>(this, input)

  public override var inputStream: CharStream
    get() = _input
    set(value) {
      _input = DummyCharStream
      _tokenFactorySourcePair = Pair<TokenSource, CharStream?>(this, null)
      reset()
      _input = value
      _tokenFactorySourcePair = Pair<TokenSource, CharStream>(this, _input)
    }

  /**
   * How to create token objects.
   */
  override var tokenFactory: TokenFactory<out Token> = CommonTokenFactory.DEFAULT

  /**
   * The goal of all lexer rules/methods is to create a token object.
   * This is an instance variable as multiple rules may collaborate to
   * create a single token.
   *
   * [nextToken] will return this object after matching lexer rule(s).
   *
   * If you subclass to allow multiple token emissions, then set this
   * to the last token to be matched or something non-`null` so that
   * the auto token emit mechanism will not emit another token.
   */
  public open var token: Token? = null

  /**
   * What character index in the stream did the current token start at?
   *
   * Needed, for example, to get the text for current token.
   *
   * Set at the start of [nextToken].
   */
  public var _tokenStartCharIndex: Int = -1

  /**
   * The line on which the first character of the token resides.
   */
  public var _tokenStartLine: Int = 0

  /**
   * The character position of first character within the line.
   */
  public var _tokenStartCharPositionInLine: Int = 0

  /**
   * Once we see `EOF` on char stream, next token will be `EOF`.
   *
   * If you have `DONE : EOF ;` then you see `DONE EOF`.
   */
  public var _hitEOF: Boolean = false

  /**
   * The channel number for the current token.
   */
  public var channel: Int = 0

  /**
   * The token type for the current token.
   */
  public var type: Int = 0

  public val _modeStack: IntegerStack = IntegerStack()
  public var _mode: Int = DEFAULT_MODE

  /**
   * You can set the text for the current token to override what is in
   * the input char buffer.
   *
   * Use [text] `= ...`, or you can set this instance variable directly.
   */
  public var _text: String? = null

  override val sourceName: String
    get() = _input.sourceName

  override var line: Int
    get() = interpreter.line
    set(line) {
      interpreter.line = line
    }

  override var charPositionInLine: Int
    get() = interpreter.charPositionInLine
    set(charPositionInLine) {
      interpreter.charPositionInLine = charPositionInLine
    }

  /**
   * What is the index of the current character of lookahead?
   */
  public val charIndex: Int
    get() = _input.index()

  /**
   * The text matched so far for the current token or any text override.
   */
  public var text: String
    get() = _text ?: interpreter.getText(_input)
    set(text) {
      this._text = text
    }

  public open val channelNames: Array<String> =
    emptyArray()

  public open val modeNames: Array<String> =
    emptyArray()

  /**
   * Used to print out token names like ID during debugging and error reporting.
   *
   * The generated parsers implement a method that overrides this
   * to point to their `Array<String>` [tokenNames].
   */
  @Deprecated("Use vocabulary instead", ReplaceWith("vocabulary"))
  override val tokenNames: Array<String> =
    emptyArray()

  /**
   * Return a list of all [Token] objects in input char stream.
   *
   * Forces load of all tokens. Does not include `EOF` token.
   */
  public val allTokens: List<Token>
    get() {
      val tokens = ArrayList<Token>()
      var t = nextToken()

      while (t.type != Token.EOF) {
        tokens.add(t)
        t = nextToken()
      }

      return tokens
    }

  public open fun reset() {
    // Wack Lexer state variables.
    // Rewind the input
    _input.seek(0)

    token = null
    type = Token.INVALID_TYPE
    channel = Token.DEFAULT_CHANNEL
    _tokenStartCharIndex = -1
    _tokenStartCharPositionInLine = -1
    _tokenStartLine = -1
    _text = null

    _hitEOF = false
    _mode = DEFAULT_MODE
    _modeStack.clear()

    // TODO(Edoardo): 'interpreter' is abstract and might be initialized
    //  only after this method has been called for the first time
    //  (e.g., at instance construction time), so here we explicitly
    //  'reset()' it only if it's not null.
    //  We might want to find a better way to initialize 'interpreter'
    @Suppress("UNNECESSARY_SAFE_CALL")
    interpreter?.reset()
  }

  /**
   * Return a token from this source, i.e., match a token on the char stream.
   */
  override fun nextToken(): Token {
    // Mark start location in char stream so unbuffered streams are
    // guaranteed at least have text of current token
    val tokenStartMarker = _input.mark()

    try {
      outer@ while (true) {
        if (_hitEOF) {
          emitEOF()
          return token!!
        }

        token = null
        channel = Token.DEFAULT_CHANNEL
        _tokenStartCharIndex = _input.index()
        _tokenStartCharPositionInLine = interpreter.charPositionInLine
        _tokenStartLine = interpreter.line
        _text = null

        do {
          type = Token.INVALID_TYPE
          var ttype: Int

          try {
            ttype = interpreter.match(_input, _mode)
          } catch (e: LexerNoViableAltException) {
            // Report error
            notifyListeners(e)
            recover(e)
            ttype = SKIP
          }

          if (_input.LA(1) == IntStream.EOF) {
            _hitEOF = true
          }

          if (type == Token.INVALID_TYPE) {
            type = ttype
          }

          if (type == SKIP) {
            continue@outer
          }
        } while (type == MORE)

        if (token == null) {
          emit()
        }

        return token!!
      }
    } finally {
      // Make sure we release marker after match or
      // unbuffered char stream will keep buffering
      _input.release(tokenStartMarker)
    }
  }

  /**
   * Instruct the lexer to skip creating a token for the current
   * lexer rule and look for another token.
   *
   * [nextToken] knows to keep looking when a lexer rule finishes
   * with token set to [SKIP].
   *
   * Recall that if `token == null` at end of any token rule,
   * it creates one for you and emits it.
   */
  public open fun skip() {
    type = SKIP
  }

  public open fun more() {
    type = MORE
  }

  public open fun mode(m: Int) {
    _mode = m
  }

  public open fun pushMode(m: Int) {
    if (LexerATNSimulator.debug) {
      System.out.println("pushMode $m")
    }

    _modeStack.push(_mode)
    mode(m)
  }

  public open fun popMode(): Int {
    if (_modeStack.isEmpty) {
      throw EmptyStackException()
    }

    if (LexerATNSimulator.debug) {
      System.out.println("popMode back to ${_modeStack.peek()}")
    }

    mode(_modeStack.pop())
    return _mode
  }


  /**
   * By default, does not support multiple emits per [nextToken] invocation
   * for efficiency reasons.
   *
   * Subclass and override this method, [nextToken] and [token]
   * (to push tokens into a list and pull from that list rather
   * than a single variable as this implementation does).
   */
  public open fun emit(token: Token) {
    this.token = token
  }

  /**
   * The standard method called to automatically emit a token at the
   * outermost lexical rule.
   *
   * The token object should point into the char buffer `start..stop`.
   * If there is a text override in [text], use that to set the token's text.
   *
   * Override this method to emit custom [Token] objects or provide a new factory.
   */
  public open fun emit(): Token {
    val t = tokenFactory.create(
      _tokenFactorySourcePair,
      type,
      _text,
      channel,
      _tokenStartCharIndex,
      charIndex - 1,
      _tokenStartLine,
      _tokenStartCharPositionInLine,
    )

    emit(t)
    return t
  }

  public open fun emitEOF(): Token {
    val cPos = charPositionInLine
    val eof = tokenFactory.create(
      _tokenFactorySourcePair,
      Token.EOF,
      null,
      Token.DEFAULT_CHANNEL,
      _input.index(),
      _input.index() - 1,
      line,
      cPos,
    )

    emit(eof)
    return eof
  }

  public open fun recover(e: LexerNoViableAltException) {
    if (_input.LA(1) != IntStream.EOF) {
      // Skip a char and try again
      interpreter.consume(_input)
    }
  }

  public open fun notifyListeners(e: LexerNoViableAltException) {
    val text = _input.getText(Interval.of(_tokenStartCharIndex, _input.index()))
    val msg = "token recognition error at: '${getErrorDisplay(text)}'"
    errorListenerDispatch.syntaxError(this, null, _tokenStartLine, _tokenStartCharPositionInLine, msg, e)
  }

  public open fun getErrorDisplay(s: String): String {
    val buf = StringBuilder()

    for (c in s) {
      buf.append(getErrorDisplay(c.code))
    }

    return buf.toString()
  }

  public open fun getErrorDisplay(c: Int): String =
    when (c) {
      Token.EOF -> "<EOF>"
      '\n'.code -> "\\n"
      '\t'.code -> "\\t"
      '\r'.code -> "\\r"
      else -> c.toChar().toString()
    }

  public open fun getCharErrorDisplay(c: Int): String {
    val s = getErrorDisplay(c)
    return "'$s'"
  }

  /**
   * Lexers can normally match any char in their vocabulary after matching
   * a token, so do the easy thing and just kill a character and hope
   * it all works out.
   *
   * You can instead use the rule invocation stack to do sophisticated
   * error recovery if you are in a fragment rule.
   */
  public open fun recover(re: RecognitionException) {
    // TODO: do we lose character or line position information?
    _input.consume()
  }
}
