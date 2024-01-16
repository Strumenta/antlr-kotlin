// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.TokenStream

/**
 * This class represents profiling event information for semantic predicate
 * evaluations which occur during prediction.
 *
 * @param decision The decision number
 * @param input The input token stream
 * @param startIndex The start index for the current prediction
 * @param stopIndex The index at which the predicate evaluation was triggered.
 *   Note that the input stream may be reset to other positions for
 *   the actual evaluation of individual predicates
 * @param semctx The semantic context which was evaluated
 * @param evalResult The results of evaluating the semantic context [semctx]
 * @param predictedAlt The alternative number for the decision which is guarded
 *   by the semantic context [semctx].
 *   Note that other ATN configurations may predict the same alternative
 *   which are guarded by other semantic contexts and/or [SemanticContext.Empty]
 * @param fullCtx `true` if the semantic context was
 *   evaluated during LL prediction, otherwise `false` if the semantic
 *   context was evaluated during SLL prediction
 *
 * @see ParserATNSimulator.evalSemanticContext
 * @see SemanticContext.eval
 *
 * @since 4.3
 */
@Suppress("MemberVisibilityCanBePrivate")
public class PredicateEvalInfo(
  decision: Int,
  input: TokenStream,
  startIndex: Int,
  stopIndex: Int,
  public val semctx: SemanticContext,
  public val evalResult: Boolean,
  public val predictedAlt: Int,
  fullCtx: Boolean,
) : DecisionEventInfo(decision, ATNConfigSet(), input, startIndex, stopIndex, fullCtx)
