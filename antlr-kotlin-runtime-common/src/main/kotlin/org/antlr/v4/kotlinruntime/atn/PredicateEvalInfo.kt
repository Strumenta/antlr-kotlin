/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.RuleContext
import org.antlr.v4.kotlinruntime.TokenStream

/**
 * This class represents profiling event information for semantic predicate
 * evaluations which occur during prediction.
 *
 * @see ParserATNSimulator.evalSemanticContext
 *
 *
 * @since 4.3
 */
class PredicateEvalInfo
/**
 * Constructs a new instance of the [PredicateEvalInfo] class with the
 * specified detailed predicate evaluation information.
 *
 * @param decision The decision number
 * @param input The input token stream
 * @param startIndex The start index for the current prediction
 * @param stopIndex The index at which the predicate evaluation was
 * triggered. Note that the input stream may be reset to other positions for
 * the actual evaluation of individual predicates.
 * @param semctx The semantic context which was evaluated
 * @param evalResult The results of evaluating the semantic context
 * @param predictedAlt The alternative number for the decision which is
 * guarded by the semantic context `semctx`. See [.predictedAlt]
 * for more information.
 * @param fullCtx `true` if the semantic context was
 * evaluated during LL prediction; otherwise, `false` if the semantic
 * context was evaluated during SLL prediction
 *
 * @see ParserATNSimulator.evalSemanticContext
 * @see SemanticContext.eval
 */
(decision: Int,
 input: TokenStream, startIndex: Int, stopIndex: Int,
 /**
  * The semantic context which was evaluated.
  */
 val semctx: SemanticContext,
 /**
  * The result of evaluating the semantic context [.semctx].
  */
 val evalResult: Boolean,
 /**
  * The alternative number for the decision which is guarded by the semantic
  * context [.semctx]. Note that other ATN
  * configurations may predict the same alternative which are guarded by
  * other semantic contexts and/or [SemanticContext.NONE].
  */
 val predictedAlt: Int,
 fullCtx: Boolean) : DecisionEventInfo(decision, ATNConfigSet(), input, startIndex, stopIndex, fullCtx)
