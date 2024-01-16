// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.ANTLRErrorListener
import org.antlr.v4.kotlinruntime.TokenStream

/**
 * This class represents profiling event information for a context sensitivity.
 * Context sensitivities are decisions where a particular input resulted in an
 * SLL conflict, but LL prediction produced a single unique alternative.
 *
 * In some cases, the unique alternative identified by LL prediction is not
 * equal to the minimum represented alternative in the conflicting SLL
 * configuration set. Grammars and inputs which result in this scenario are
 * unable to use [PredictionMode.SLL], which in turn means they cannot use
 * the two-stage parsing strategy to improve parsing performance for that
 * input.
 *
 * @param decision The decision number
 * @param configs The final configuration set containing the unique
 *   alternative identified by full-context prediction
 * @param input The input token stream
 * @param startIndex The start index for the current prediction
 * @param stopIndex The index at which the context sensitivity was
 *   identified during full-context prediction
 *
 * @see ParserATNSimulator.reportContextSensitivity
 * @see ANTLRErrorListener.reportContextSensitivity
 *
 * @since 4.3
 */
public class ContextSensitivityInfo(
  decision: Int,
  configs: ATNConfigSet?,
  input: TokenStream,
  startIndex: Int,
  stopIndex: Int,
) : DecisionEventInfo(decision, configs, input, startIndex, stopIndex, true)
