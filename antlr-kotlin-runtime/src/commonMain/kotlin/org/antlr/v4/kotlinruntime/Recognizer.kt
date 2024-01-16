// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.CopyOnWriteArrayList
import com.strumenta.antlrkotlin.runtime.WeakHashMap
import com.strumenta.antlrkotlin.runtime.synchronized
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNSimulator
import org.antlr.v4.kotlinruntime.atn.DecisionInfo
import org.antlr.v4.kotlinruntime.atn.ParseInfo
import org.antlr.v4.kotlinruntime.misc.Utils

@Suppress("MemberVisibilityCanBePrivate")
public abstract class Recognizer<Symbol, ATNInterpreter : ATNSimulator> {
  public companion object {
    public const val EOF: Int = -1

    private val tokenTypeMapCache = WeakHashMap<Vocabulary, Map<String, Int>>()
    private val ruleIndexMapCache = WeakHashMap<Array<String>, Map<String, Int>>()
  }

  private val _listeners = CopyOnWriteArrayList<ANTLRErrorListener>(listOf(ConsoleErrorListener.INSTANCE))

  /**
   * Indicate that the recognizer has changed internal state that is
   * consistent with the ATN state passed in. This way we always know
   * where we are in the ATN as the parser goes along. The rule
   * context objects form a stack that lets us see the stack of
   * invoking rules. Combine this and we have complete ATN
   * configuration information.
   */
  public var state: Int = -1

  /**
   * The ATN interpreter used by the recognizer for prediction.
   */
  public abstract var interpreter: ATNInterpreter

  /**
   * Used to print out token names like ID during debugging and error reporting.
   *
   * The generated parsers implement a method that overrides this to point
   * to their `Array<String>` [tokenNames].
   */
  @Deprecated("Use vocabulary instead", ReplaceWith("vocabulary"))
  public abstract val tokenNames: Array<String>

  public abstract val ruleNames: Array<String>

  /**
   * The vocabulary used by the recognizer.
   */
  @Suppress("DEPRECATION")
  public open val vocabulary: Vocabulary
    get() = VocabularyImpl.fromTokenNames(tokenNames)

  /**
   * Get a map from token names to token types.
   *
   * Used for `XPath` and tree pattern compilation.
   */
  public val tokenTypeMap: Map<String, Int>
    get() {
      val tempVocabulary = vocabulary

      synchronized(tokenTypeMapCache) {
        var result = tokenTypeMapCache[tempVocabulary]

        if (result == null) {
          val tmp = HashMap<String, Int>()

          for (i in 0..atn.maxTokenType) {
            val literalName = tempVocabulary.getLiteralName(i)

            if (literalName != null) {
              tmp[literalName] = i
            }

            val symbolicName = tempVocabulary.getSymbolicName(i)

            if (symbolicName != null) {
              tmp[symbolicName] = i
            }
          }

          tmp["EOF"] = Token.EOF
          result = tmp
          tokenTypeMapCache[tempVocabulary] = result
        }

        return result
      }
    }

  /**
   * Get a map from rule names to rule indexes.
   *
   * Used for `XPath` and tree pattern compilation.
   */
  public val ruleIndexMap: Map<String, Int>
    get() {
      val ruleNames = ruleNames

      synchronized(ruleIndexMapCache) {
        var result = ruleIndexMapCache[ruleNames]

        if (result == null) {
          result = Utils.toMap(ruleNames)
          ruleIndexMapCache[ruleNames] = result
        }

        return result
      }
    }

  /**
   * If this recognizer was generated, it will have a serialized ATN
   * representation of the grammar.
   *
   * For interpreters, we don't know their serialized ATN despite having
   * created the interpreter from it.
   */
  public open val serializedATN: String
    get() = throw UnsupportedOperationException("there is no serialized ATN")

  /**
   * For debugging and other purposes, might want the grammar name.
   *
   * Have ANTLR generate an implementation for this method.
   */
  public abstract val grammarFileName: String

  /**
   * The [ATN] used by the recognizer for prediction.
   */
  public abstract val atn: ATN

  /**
   * If profiling during the parse/lex, this will return [DecisionInfo] records
   * for each decision in recognizer in a [ParseInfo] object.
   *
   * @since 4.3
   */
  public open val parseInfo: ParseInfo?
    get() = null

  public val errorListeners: List<ANTLRErrorListener>
    get() = _listeners

  public val errorListenerDispatch: ANTLRErrorListener
    get() = ProxyErrorListener(errorListeners)

  public abstract var tokenFactory: TokenFactory<*>

  public fun getTokenType(tokenName: String): Int {
    val ttype = tokenTypeMap[tokenName]
    return ttype ?: Token.INVALID_TYPE
  }

  /**
   * What is the error header, normally line/character position information?
   */
  public fun getErrorHeader(e: RecognitionException): String {
    val offendingToken = e.offendingToken!!
    val line = offendingToken.line
    val charPositionInLine = offendingToken.charPositionInLine
    return "line $line:$charPositionInLine"
  }

  /**
   * How should a token be displayed in an error message?
   *
   * The default is to display just the text, but during development you might
   * want to have a lot of information spit out. Override in that case
   * to use `t.toString()` (which, for [CommonToken], dumps everything about
   * the token).
   *
   * This is better than forcing you to override a method in your token
   * objects because you don't have to go modify your lexer so that it
   * creates a new Java type.
   *
   * **Deprecated**: this method is not called by the ANTLR 4 Runtime.
   * Specific implementations of [ANTLRErrorStrategy] may provide a similar
   * feature when necessary. For example, see [DefaultErrorStrategy.getTokenErrorDisplay].
   */
  @Deprecated("This method is not called by the ANTLR 4 Runtime")
  public fun getTokenErrorDisplay(t: Token?): String {
    if (t == null) {
      return "<no token>"
    }

    var s = t.text

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

  public fun addErrorListener(listener: ANTLRErrorListener) {
    _listeners.add(listener)
  }

  public fun removeErrorListener(listener: ANTLRErrorListener) {
    _listeners.remove(listener)
  }

  public fun removeErrorListeners() {
    _listeners.clear()
  }

  // Subclass needs to override these if there are sempreds or actions
  // that the ATN interp needs to execute
  public open fun sempred(
    @Suppress("LocalVariableName") _localctx: RuleContext?,
    ruleIndex: Int,
    predIndex: Int,
  ): Boolean =
    true

  public open fun precpred(localctx: RuleContext, precedence: Int): Boolean =
    true

  public open fun action(
    @Suppress("LocalVariableName") _localctx: RuleContext?,
    ruleIndex: Int,
    actionIndex: Int,
  ) {
    // Noop
  }
}
