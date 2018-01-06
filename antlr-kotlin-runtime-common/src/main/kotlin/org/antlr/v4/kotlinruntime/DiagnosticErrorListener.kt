/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

import com.strumenta.kotlinmultiplatform.BitSet
import org.antlr.v4.kotlinruntime.atn.ATNConfig
import org.antlr.v4.kotlinruntime.atn.ATNConfigSet
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * This implementation of [ANTLRErrorListener] can be used to identify
 * certain potential correctness and performance problems in grammars. "Reports"
 * are made by calling [Parser.notifyErrorListeners] with the appropriate
 * message.
 *
 *
 *  * **Ambiguities**: These are cases where more than one path through the
 * grammar can match the input.
 *  * **Weak context sensitivity**: These are cases where full-context
 * prediction resolved an SLL conflict to a unique alternative which equaled the
 * minimum alternative of the SLL conflict.
 *  * **Strong (forced) context sensitivity**: These are cases where the
 * full-context prediction resolved an SLL conflict to a unique alternative,
 * *and* the minimum alternative of the SLL conflict was found to not be
 * a truly viable alternative. Two-stage parsing cannot be used for inputs where
 * this situation occurs.
 *
 *
 * @author Sam Harwell
 */
class DiagnosticErrorListener
/**
 * Initializes a new instance of [DiagnosticErrorListener], specifying
 * whether all ambiguities or only exact ambiguities are reported.
 *
 * @param exactOnly `true` to report only exact ambiguities, otherwise
 * `false` to report all ambiguities.
 */
constructor(
        /**
         * When `true`, only exactly known ambiguities are reported.
         */
        protected val exactOnly: Boolean = true) : BaseErrorListener() {

    override fun reportAmbiguity(recognizer: Parser,
                                 dfa: DFA,
                                 startIndex: Int,
                                 stopIndex: Int,
                                 exact: Boolean,
                                 ambigAlts: BitSet,
                                 configs: ATNConfigSet) {
        if (exactOnly && !exact) {
            return
        }

        val format = "reportAmbiguity d=%s: ambigAlts=%s, input='%s'"
        val decision = getDecisionDescription(recognizer, dfa)
        val conflictingAlts = getConflictingAlts(ambigAlts, configs)
        val text = recognizer.tokenStream!!.getText(Interval.of(startIndex, stopIndex))
        val message = "reportAmbiguity d=$decision: ambigAlts=$conflictingAlts, input='$text'"
        recognizer.notifyErrorListeners(message)
    }

    override fun reportAttemptingFullContext(recognizer: Parser,
                                             dfa: DFA,
                                             startIndex: Int,
                                             stopIndex: Int,
                                             conflictingAlts: BitSet,
                                             configs: ATNConfigSet) {
        val decision = getDecisionDescription(recognizer, dfa)
        val text = recognizer.tokenStream!!.getText(Interval.of(startIndex, stopIndex))
        val message = "reportAttemptingFullContext d=$decision, input='$text'"
        recognizer.notifyErrorListeners(message)
    }

    override fun reportContextSensitivity(recognizer: Parser,
                                          dfa: DFA,
                                          startIndex: Int,
                                          stopIndex: Int,
                                          prediction: Int,
                                          configs: ATNConfigSet) {
        val format = "reportContextSensitivity d=%s, input='%s'"
        val decision = getDecisionDescription(recognizer, dfa)
        val text = recognizer.tokenStream!!.getText(Interval.of(startIndex, stopIndex))
        val message = "reportContextSensitivity d=$decision, input='$text'"
        recognizer.notifyErrorListeners(message)
    }

    protected fun getDecisionDescription(recognizer: Parser, dfa: DFA): String {
        val decision = dfa.decision
        val ruleIndex = dfa.atnStartState.ruleIndex

        val ruleNames = recognizer.ruleNames
        if (ruleIndex < 0 || ruleIndex >= ruleNames!!.size) {
            return decision.toString()
        }

        val ruleName = ruleNames!![ruleIndex]
        return if (ruleName == null || ruleName!!.isEmpty()) {
            decision.toString()
        } else "$decision ($ruleName)"

    }

    /**
     * Computes the set of conflicting or ambiguous alternatives from a
     * configuration set, if that information was not already provided by the
     * parser.
     *
     * @param reportedAlts The set of conflicting or ambiguous alternatives, as
     * reported by the parser.
     * @param configs The conflicting or ambiguous configuration set.
     * @return Returns `reportedAlts` if it is not `null`, otherwise
     * returns the set of alternatives represented in `configs`.
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
/**
 * Initializes a new instance of [DiagnosticErrorListener] which only
 * reports exact ambiguities.
 */
