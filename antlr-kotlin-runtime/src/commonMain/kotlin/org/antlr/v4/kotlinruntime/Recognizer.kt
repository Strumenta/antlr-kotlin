/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

import com.strumenta.kotlinmultiplatform.synchronized
import com.strumenta.kotlinmultiplatform.WeakHashMap
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNSimulator
import org.antlr.v4.kotlinruntime.atn.ParseInfo

typealias CopyOnWriteArrayList<E> = List<E>

abstract class Recognizer<Symbol, ATNInterpreter : ATNSimulator> {

    // TODO should be thread safe but is not!
    private val _listeners = mutableListOf<ANTLRErrorListener>()

    /**
     * Get the ATN interpreter used by the recognizer for prediction.
     *
     * @return The ATN interpreter used by the recognizer for prediction.
     */
    /**
     * Set the ATN interpreter used by the recognizer for prediction.
     *
     * @param interpreter The ATN interpreter used by the recognizer for
     * prediction.
     */
    var interpreter: ATNInterpreter? = null

    /** Indicate that the recognizer has changed internal state that is
     * consistent with the ATN state passed in.  This way we always know
     * where we are in the ATN as the parser goes along. The rule
     * context objects form a stack that lets us see the stack of
     * invoking rules. Combine this and we have complete ATN
     * configuration information.
     */
    //		System.err.println("setState "+atnState);
    //		if ( traceATNStates ) _ctx.trace(atnState);
    var state = -1

    /** Used to print out token names like ID during debugging and
     * error reporting.  The generated parsers implement a method
     * that overrides this to point to their String[] tokenNames.
     *
     */
    @get:Deprecated("Use {@link #getVocabulary()} instead.")
    abstract val tokenNames: Array<String?>?

    abstract val ruleNames: Array<String>?

    /**
     * Get the vocabulary used by the recognizer.
     *
     * @return A [Vocabulary] instance providing information about the
     * vocabulary used by the grammar.
     */
    open val vocabulary: Vocabulary
        get() = VocabularyImpl.fromTokenNames(tokenNames)

    /**
     * Get a map from token names to token types.
     *
     *
     * Used for XPath and tree pattern compilation.
     */
    val tokenTypeMap: Map<String, Int>
        get() {
            val vocabulary = vocabulary
            synchronized(tokenTypeMapCache) {
                var result: Map<String, Int>? = tokenTypeMapCache[vocabulary]
                if (result == null) {
                    val tmp = HashMap<String, Int>()
                    for (i in 0..atn.maxTokenType) {
                        val literalName = vocabulary.getLiteralName(i)
                        if (literalName != null) {
                            tmp[literalName] = i
                        }

                        val symbolicName = vocabulary.getSymbolicName(i)
                        if (symbolicName != null) {
                            tmp[symbolicName] = i
                        }
                    }

                    tmp["EOF"] = Token.EOF
                    result = tmp.toMap()
                    tokenTypeMapCache[vocabulary] = result
                }

                return result
            }
        }

    /**
     * Get a map from rule names to rule indexes.
     *
     *
     * Used for XPath and tree pattern compilation.
     */
    val ruleIndexMap: Map<String, Int>
        get() {
            val ruleNames = ruleNames
                    ?: throw UnsupportedOperationException("The current recognizer does not provide a list of rule names.")

            synchronized(ruleIndexMapCache) {
                var result: Map<String, Int>? = ruleIndexMapCache[ruleNames]
                if (result == null) {
                    result = ruleNames.mapIndexed { i, it -> it to i }.toMap()
                    ruleIndexMapCache[ruleNames] = result
                }

                return result!!
            }
        }

    /**
     * If this recognizer was generated, it will have a serialized ATN
     * representation of the grammar.
     *
     *
     * For interpreters, we don't know their serialized ATN despite having
     * created the interpreter from it.
     */
    val serializedATN: String
        get() = throw UnsupportedOperationException("there is no serialized ATN")

    /** For debugging and other purposes, might want the grammar name.
     * Have ANTLR generate an implementation for this method.
     */
    abstract val grammarFileName: String

    /**
     * Get the [ATN] used by the recognizer for prediction.
     *
     * @return The [ATN] used by the recognizer for prediction.
     */
    abstract val atn: ATN

    /** If profiling during the parse/lex, this will return DecisionInfo records
     * for each decision in recognizer in a ParseInfo object.
     *
     * @since 4.3
     */
    open val parseInfo: ParseInfo?
        get() = null


    val errorListeners: List<out ANTLRErrorListener>
        get() = _listeners

    val errorListenerDispatch: ANTLRErrorListener
        get() = ProxyErrorListener(errorListeners)

    //abstract var inputStream: CharStream?

    protected var inputStream: IntStream? = null

    abstract fun assignInputStream(newValue: IntStream?)
    abstract fun readInputStream(): IntStream?


    abstract var tokenFactory: TokenFactory<*>

    fun getTokenType(tokenName: String): Int {
        val ttype = tokenTypeMap.get(tokenName)
        return ttype ?: Token.INVALID_TYPE
    }

    /** What is the error header, normally line/character position information?  */
    fun getErrorHeader(e: RecognitionException): String {
        val line = e.offendingToken!!.line
        val charPositionInLine = e.offendingToken!!.charPositionInLine
        return "line $line:$charPositionInLine"
    }

    /** How should a token be displayed in an error message? The default
     * is to display just the text, but during development you might
     * want to have a lot of information spit out.  Override in that case
     * to use t.toString() (which, for CommonToken, dumps everything about
     * the token). This is better than forcing you to override a method in
     * your token objects because you don't have to go modify your lexer
     * so that it creates a new Java type.
     *
     */
    @Deprecated("This method is not called by the ANTLR 4 Runtime. Specific\n" +
            "\t  implementations of {@link ANTLRErrorStrategy} may provide a similar\n" +
            "\t  feature when necessary. For example, see\n" +
            "\t  {@link DefaultErrorStrategy#getTokenErrorDisplay}.")
    fun getTokenErrorDisplay(t: Token?): String {
        if (t == null) return "<no token>"
        var s: String? = t.text
        if (s == null) {
            s = if (t.type == Token.EOF) {
                "<EOF>"
            } else {
                "<" + t.type + ">"
            }
        }
        s = s.replace("\n", "\\n")
        s = s.replace("\r", "\\r")
        s = s.replace("\t", "\\t")
        return "'$s'"
    }

    /**
     * @exception NullPointerException if `listener` is `null`.
     */
    fun addErrorListener(listener: ANTLRErrorListener?) {
        if (listener == null) {
            throw NullPointerException("listener cannot be null.")
        }

        _listeners.add(listener)
    }

    fun removeErrorListener(listener: ANTLRErrorListener) {
        _listeners.remove(listener)
    }

    fun removeErrorListeners() {
        _listeners.clear()
    }

    // subclass needs to override these if there are sempreds or actions
    // that the ATN interp needs to execute
    open fun sempred(_localctx: RuleContext?, ruleIndex: Int, actionIndex: Int): Boolean {
        return true
    }

    open fun precpred(localctx: RuleContext, precedence: Int): Boolean {
        return true
    }

    fun action(_localctx: RuleContext?, ruleIndex: Int, actionIndex: Int) {}

    companion object {
        val EOF = -1

        private val tokenTypeMapCache = WeakHashMap<Vocabulary, Map<String, Int>>()
        private val ruleIndexMapCache = WeakHashMap<Array<String>, Map<String, Int>>()
    }
}
