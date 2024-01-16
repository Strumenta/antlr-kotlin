// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.ANTLRErrorListener
import org.antlr.v4.kotlinruntime.Parser
import org.antlr.v4.kotlinruntime.TokenStream

/**
 * This class represents profiling event information for a syntax error
 * identified during prediction.
 *
 * Syntax errors occur when the prediction algorithm is unable to identify
 * an alternative which would lead to a successful parse.
 *
 * @param decision The decision number
 * @param configs The final configuration set reached during prediction
 *   prior to reaching the [ATNSimulator.ERROR] state
 * @param input The input token stream
 * @param startIndex The start index for the current prediction
 * @param stopIndex The index at which the syntax error was identified
 * @param fullCtx `true` if the syntax error was identified during LL
 *   prediction, otherwise `false` if the syntax error was identified
 *   during SLL prediction
 *
 * @see Parser.notifyErrorListeners
 * @see ANTLRErrorListener.syntaxError
 *
 * @since 4.3
 */
public class ErrorInfo(
  decision: Int,
  configs: ATNConfigSet?,
  input: TokenStream,
  startIndex: Int,
  stopIndex: Int,
  fullCtx: Boolean,
) : DecisionEventInfo(decision, configs, input, startIndex, stopIndex, fullCtx)
