/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.BitSet
import org.antlr.v4.kotlinruntime.atn.ATNConfigSet
import org.antlr.v4.kotlinruntime.dfa.DFA

/**
 * Provides an empty default implementation of [ANTLRErrorListener].
 *
 * The default implementation of each method does nothing,
 * but can be overridden as necessary.
 *
 * @author Sam Harwell
 */
public open class BaseErrorListener : ANTLRErrorListener {
  override fun syntaxError(
    recognizer: Recognizer<*, *>,
    offendingSymbol: Any?,
    line: Int,
    charPositionInLine: Int,
    msg: String,
    e: RecognitionException?,
  ) {
    // Noop
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
    // Noop
  }

  override fun reportAttemptingFullContext(
    recognizer: Parser,
    dfa: DFA,
    startIndex: Int,
    stopIndex: Int,
    conflictingAlts: BitSet,
    configs: ATNConfigSet,
  ) {
    // Noop
  }

  override fun reportContextSensitivity(
    recognizer: Parser,
    dfa: DFA,
    startIndex: Int,
    stopIndex: Int,
    prediction: Int,
    configs: ATNConfigSet,
  ) {
    // Noop
  }
}
