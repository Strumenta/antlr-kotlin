/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import com.strumenta.kotlinmultiplatform.outMessage
import com.strumenta.kotlinmultiplatform.toCharArray
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.misc.IntegerStack
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.misc.Pair

/** A lexer is recognizer that draws input symbols from a character stream.
 * lexer grammars result in a subclass of this object. A Lexer object
 * uses simplified match() and error recovery mechanisms in the interest
 * of speed.
 */
abstract class Lexer : Recognizer<Int, LexerATNSimulator>, TokenSource {


//    /** Set the char stream and reset the lexer  */
//    fun setInputStream(input: IntStream) {
//        this.inputStream = null
//        this._tokenFactorySourcePair = Pair<TokenSource, CharStream>(this, inputStream)
//        reset()
//        this.inputStream = input as CharStream
//        this._tokenFactorySourcePair = Pair<TokenSource, CharStream>(this, readInputStream())
//    }

    override fun assignInputStream(newValue: IntStream?) {
        assignInputStream(newValue as CharStream?)
    }

    fun assignInputStream(input: CharStream?) {
        this.inputStream = null
        this._tokenFactorySourcePair = Pair<TokenSource, CharStream>(this, inputStream)
        reset()
        this.inputStream = input as CharStream
        this._tokenFactorySourcePair = Pair<TokenSource, CharStream>(this, readInputStream())
    }
    override fun readInputStream() : CharStream? {
        return this.inputStream as CharStream?
    }


    protected var _tokenFactorySourcePair: Pair<TokenSource, CharStream>? = null

    /** How to create token objects  */
    override var tokenFactory: TokenFactory<out Token> = CommonTokenFactory.DEFAULT

    /** The goal of all lexer rules/methods is to create a token object.
     * This is an instance variable as multiple rules may collaborate to
     * create a single token.  nextToken will return this object after
     * matching lexer rule(s).  If you subclass to allow multiple token
     * emissions, then set this to the last token to be matched or
     * something nonnull so that the auto token emit mechanism will not
     * emit another token.
     */
    /** Override if emitting multiple tokens.  */
    var token: Token? = null

    /** What character index in the stream did the current token start at?
     * Needed, for example, to get the text for current token.  Set at
     * the start of nextToken.
     */
    var _tokenStartCharIndex = -1

    /** The line on which the first character of the token resides  */
    var _tokenStartLine: Int = 0

    /** The character position of first character within the line  */
    var _tokenStartCharPositionInLine: Int = 0

    /** Once we see EOF on char stream, next token will be EOF.
     * If you have DONE : EOF ; then you see DONE EOF.
     */
    var _hitEOF: Boolean = false

    /** The channel number for the current token  */
    var channel: Int = 0

    /** The token type for the current token  */
    var type: Int = 0

    val _modeStack = IntegerStack()
    var _mode = Lexer.DEFAULT_MODE

    /** You can set the text for the current token to override what is in
     * the input char buffer.  Use setText() or can set this instance var.
     */
    var _text: String? = null

    override val sourceName: String
        get() = inputStream!!.sourceName!!

    override var line: Int
        get() = interpreter!!.line
        set(line) {
            interpreter!!.line = line
        }

    override var charPositionInLine: Int
        get() = interpreter!!.charPositionInLine
        set(charPositionInLine) {
            interpreter!!.charPositionInLine = charPositionInLine
        }

    /** What is the index of the current character of lookahead?  */
    val charIndex: Int
        get() = inputStream!!.index()

    /** Return the text matched so far for the current token or any
     * text override.
     */
    /** Set the complete text of this token; it wipes any previous
     * changes to the text.
     */
    var text: String
        get() = if (_text != null) {
            _text!!
        } else interpreter!!.getText(readInputStream()!!)
        set(text) {
            this._text = text
        }

    open val channelNames: Array<String>?
        get() = null

    open val modeNames: Array<String>?
        get() = null

    /** Used to print out token names like ID during debugging and
     * error reporting.  The generated parsers implement a method
     * that overrides this to point to their String[] tokenNames.
     */
    override val tokenNames: Array<String?>?
        @Deprecated("")
        get() = null

    /** Return a list of all Token objects in input char stream.
     * Forces load of all tokens. Does not include EOF token.
     */
    val allTokens: List<Token>
        get() {
            val tokens = ArrayList<Token>()
            var t = nextToken()
            while (t!!.type != Token.EOF) {
                tokens.add(t)
                t = nextToken()
            }
            return tokens
        }

    constructor() {}

    constructor(input: CharStream) {
        this.inputStream = input
        this._tokenFactorySourcePair = Pair<TokenSource, CharStream>(this, input)
    }

    fun reset() {
        // wack Lexer state variables
        if (inputStream != null) {
            inputStream!!.seek(0) // rewind the input
        }
        token = null
        type = Token.INVALID_TYPE
        channel = Token.DEFAULT_CHANNEL
        _tokenStartCharIndex = -1
        _tokenStartCharPositionInLine = -1
        _tokenStartLine = -1
        _text = null

        _hitEOF = false
        _mode = Lexer.DEFAULT_MODE
        _modeStack.clear()

        interpreter!!.reset()
    }

    /** Return a token from this source; i.e., match a token on the char
     * stream.
     */
    override fun nextToken(): Token {
        if (inputStream == null) {
            throw IllegalStateException("nextToken requires a non-null input stream.")
        }

        // Mark start location in char stream so unbuffered streams are
        // guaranteed at least have text of current token
        val tokenStartMarker = inputStream!!.mark()
        try {
            outer@ while (true) {
                if (_hitEOF) {
                    emitEOF()
                    return token!!
                }

                token = null
                channel = Token.DEFAULT_CHANNEL
                _tokenStartCharIndex = inputStream!!.index()
                _tokenStartCharPositionInLine = interpreter!!.charPositionInLine
                _tokenStartLine = interpreter!!.line
                _text = null
                do {
                    type = Token.INVALID_TYPE
//                    				println("nextToken line "+_tokenStartLine+" at "+inputStream!!.LA(1)+
//                    								   " in mode "+_mode+
//                    								   " at index "+ inputStream!!.index())
                    var ttype: Int
                    try {
                        ttype = interpreter!!.match(readInputStream()!!, _mode)
                    } catch (e: LexerNoViableAltException) {
                        notifyListeners(e)        // report error
                        recover(e)
                        ttype = SKIP
                    }

                    if (inputStream!!.LA(1) == IntStream.EOF) {
                        _hitEOF = true
                    }
                    if (type == Token.INVALID_TYPE) type = ttype
                    if (type == SKIP) {
                        continue@outer
                    }
                } while (type == MORE)
                if (token == null) emit()
                return token!!
            }
        } finally {
            // make sure we release marker after match or
            // unbuffered char stream will keep buffering
            inputStream!!.release(tokenStartMarker)
        }
    }

    /** Instruct the lexer to skip creating a token for current lexer rule
     * and look for another token.  nextToken() knows to keep looking when
     * a lexer rule finishes with token set to SKIP_TOKEN.  Recall that
     * if token==null at end of any token rule, it creates one for you
     * and emits it.
     */
    fun skip() {
        type = SKIP
    }

    fun more() {
        type = MORE
    }

    fun mode(m: Int) {
        _mode = m
    }

    fun pushMode(m: Int) {
        if (LexerATNSimulator.debug) println("pushMode " + m)
        _modeStack.push(_mode)
        mode(m)
    }

    fun popMode(): Int {
        if (_modeStack.isEmpty) throw RuntimeException()
        if (LexerATNSimulator.debug) outMessage("popMode back to " + _modeStack.peek())
        mode(_modeStack.pop())
        return _mode
    }




    /** By default does not support multiple emits per nextToken invocation
     * for efficiency reasons.  Subclass and override this method, nextToken,
     * and getToken (to push tokens into a list and pull from that list
     * rather than a single variable as this implementation does).
     */
    fun emit(token: Token) {
        //System.err.println("emit "+token);
        this.token = token
    }

    /** The standard method called to automatically emit a token at the
     * outermost lexical rule.  The token object should point into the
     * char buffer start..stop.  If there is a text override in 'text',
     * use that to set the token's text.  Override this method to emit
     * custom Token objects or provide a new factory.
     */
    fun emit(): Token {
        val t = tokenFactory.create(_tokenFactorySourcePair!!, type, _text, channel, _tokenStartCharIndex, charIndex - 1,
                _tokenStartLine, _tokenStartCharPositionInLine)
        emit(t)
        return t
    }

    fun emitEOF(): Token {
        val cpos = charPositionInLine
        val line = line
        val eof = tokenFactory.create(_tokenFactorySourcePair!!, Token.EOF, null, Token.DEFAULT_CHANNEL, inputStream!!.index(), inputStream!!.index() - 1,
                line, cpos)
        emit(eof)
        return eof
    }

    fun recover(e: LexerNoViableAltException) {
        if (inputStream!!.LA(1) != IntStream.EOF) {
            // skip a char and try again
            interpreter!!.consume(readInputStream()!!)
        }
    }

    fun notifyListeners(e: LexerNoViableAltException) {
        val text = readInputStream()!!.getText(Interval.of(_tokenStartCharIndex, inputStream!!.index()))
        val msg = "token recognition error at: '" + getErrorDisplay(text) + "'"

        val listener = errorListenerDispatch
        listener.syntaxError(this, null, _tokenStartLine, _tokenStartCharPositionInLine, msg, e)
    }

    fun getErrorDisplay(s: String): String {
        val buf = StringBuilder()
        for (c in s.toCharArray()) {
            buf.append(getErrorDisplay(c.toInt()))
        }
        return buf.toString()
    }

    fun getErrorDisplay(c: Int): String {
        var s = c.toChar().toString()
        when (c) {
            Token.EOF -> s = "<EOF>"
            '\n'.toInt() -> s = "\\n"
            '\t'.toInt() -> s = "\\t"
            '\r'.toInt() -> s = "\\r"
        }
        return s
    }

    fun getCharErrorDisplay(c: Int): String {
        val s = getErrorDisplay(c)
        return "'$s'"
    }

    /** Lexers can normally match any char in it's vocabulary after matching
     * a token, so do the easy thing and just kill a character and hope
     * it all works out.  You can instead use the rule invocation stack
     * to do sophisticated error recovery if you are in a fragment rule.
     */
    fun recover(re: RecognitionException) {
        //System.out.println("consuming char "+(char)input.LA(1)+" during recovery");
        //re.printStackTrace();
        // TODO: Do we lose character or line position information?
        inputStream!!.consume()
    }

    companion object {
        val DEFAULT_MODE = 0
        val MORE = -2
        val SKIP = -3

        val DEFAULT_TOKEN_CHANNEL = Token.DEFAULT_CHANNEL
        val HIDDEN = Token.HIDDEN_CHANNEL
        val MIN_CHAR_VALUE = 0x0000
        val MAX_CHAR_VALUE = 0x10FFFF
    }

}
