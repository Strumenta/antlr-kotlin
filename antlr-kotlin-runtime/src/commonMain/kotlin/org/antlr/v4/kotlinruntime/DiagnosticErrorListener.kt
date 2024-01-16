// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.BitSet
import org.antlr.v4.kotlinruntime.atn.ATNConfigSet
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * This implementation of [ANTLRErrorListener] can be used to identify
 * certain potential correctness and performance problems in grammars.
 *
 * "Reports" are made by calling [Parser.notifyErrorListeners]
 * with the appropriate message.
 *
 * - **Ambiguities**: these are cases where more than one path through the
 *   grammar can match the input
 * - **Weak context sensitivity**: these are cases where full-context
 *   prediction resolved an SLL conflict to a unique alternative which
 *   equaled the minimum alternative of the SLL conflict
 * - **Strong (forced) context sensitivity**: these are cases where the
 *   full-context prediction resolved an SLL conflict to a unique alternative,
 *   *and* the minimum alternative of the SLL conflict was found to not be
 *   a truly viable alternative.
 *   Two-stage parsing cannot be used for inputs where this situation occurs.
 *
 * @param exactOnly `true` to report only exact ambiguities, otherwise
 *   `false` to report all ambiguities
 *
 * @author Sam Harwell
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class DiagnosticErrorListener(protected val exactOnly: Boolean = true) : BaseErrorListener() {
  override fun reportAmbiguity(
    recognizer: Parser,
    dfa: DFA,
    startIndex: Int,
    stopIndex: Int,
    exact: Boolean,
    ambigAlts: BitSet,
    configs: ATNConfigSet,
  ) {
    if (exactOnly && !exact) {
      return
    }

    val decision = getDecisionDescription(recognizer, dfa)
    val conflictingAlts = getConflictingAlts(ambigAlts, configs)
    val text = recognizer.tokenStream.getText(Interval.of(startIndex, stopIndex))
    val message = "reportAmbiguity d=$decision: ambigAlts=$conflictingAlts, input='$text'"
    recognizer.notifyErrorListeners(message)
  }

  override fun reportAttemptingFullContext(
    recognizer: Parser,
    dfa: DFA,
    startIndex: Int,
    stopIndex: Int,
    conflictingAlts: BitSet,
    configs: ATNConfigSet,
  ) {
    val decision = getDecisionDescription(recognizer, dfa)
    val text = recognizer.tokenStream.getText(Interval.of(startIndex, stopIndex))
    val message = "reportAttemptingFullContext d=$decision, input='$text'"
    recognizer.notifyErrorListeners(message)
  }

  override fun reportContextSensitivity(
    recognizer: Parser,
    dfa: DFA,
    startIndex: Int,
    stopIndex: Int,
    prediction: Int,
    configs: ATNConfigSet
  ) {
    val decision = getDecisionDescription(recognizer, dfa)
    val text = recognizer.tokenStream.getText(Interval.of(startIndex, stopIndex))
    val message = "reportContextSensitivity d=$decision, input='$text'"
    recognizer.notifyErrorListeners(message)
  }

  protected open fun getDecisionDescription(recognizer: Parser, dfa: DFA): String {
    val decision = dfa.decision
    val ruleIndex = dfa.atnStartState.ruleIndex
    val ruleNames = recognizer.ruleNames

    if (ruleIndex < 0 || ruleIndex >= ruleNames.size) {
      return decision.toString()
    }

    val ruleName = ruleNames[ruleIndex]
    return if (ruleName.isEmpty()) {
      decision.toString()
    } else {
      "$decision ($ruleName)"
    }
  }

  /**
   * Computes the set of conflicting or ambiguous alternatives from a
   * configuration set, if that information was not already provided by the
   * parser.
   *
   * @param reportedAlts The set of conflicting or ambiguous alternatives,
   *   as reported by the parser
   * @param configs The conflicting or ambiguous configuration set
   * @return [reportedAlts] if it is not `null`, otherwise
   *   the set of alternatives represented in [configs]
   */
  protected fun getConflictingAlts(reportedAlts: BitSet?, configs: ATNConfigSet): BitSet {
    if (reportedAlts != null) {
      return reportedAlts
    }

    val result = BitSet()

    for (config in configs) {
      result.set(config.alt)
    }

    return result
  }
}
