// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.BitSet
import org.antlr.v4.kotlinruntime.atn.ATNConfigSet
import org.antlr.v4.kotlinruntime.dfa.DFA

/**
 * This implementation of [ANTLRErrorListener] dispatches all calls to a
 * collection of delegate listeners.
 *
 * This reduces the effort required to support multiple listeners.
 *
 * @author Sam Harwell
 */
public class ProxyErrorListener(private val delegates: Collection<ANTLRErrorListener>) : ANTLRErrorListener {
  override fun syntaxError(
    recognizer: Recognizer<*, *>,
    offendingSymbol: Any?,
    line: Int,
    charPositionInLine: Int,
    msg: String,
    e: RecognitionException?,
  ) {
    for (listener in delegates) {
      listener.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e)
    }
  }

  override fun reportAmbiguity(
    recognizer: Parser,
    dfa: DFA,
    startIndex: Int,
    stopIndex: Int,
    exact: Boolean,
    ambigAlts: BitSet,
    configs: ATNConfigSet,
  ) {
    for (listener in delegates) {
      listener.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs)
    }
  }

  override fun reportAttemptingFullContext(
    recognizer: Parser,
    dfa: DFA,
    startIndex: Int,
    stopIndex: Int,
    conflictingAlts: BitSet,
    configs: ATNConfigSet,
  ) {
    for (listener in delegates) {
      listener.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs)
    }
  }

  override fun reportContextSensitivity(
    recognizer: Parser,
    dfa: DFA,
    startIndex: Int,
    stopIndex: Int,
    prediction: Int,
    configs: ATNConfigSet,
  ) {
    for (listener in delegates) {
      listener.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs)
    }
  }
}
