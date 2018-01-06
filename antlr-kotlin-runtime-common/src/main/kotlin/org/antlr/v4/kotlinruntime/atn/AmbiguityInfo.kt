/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.BitSet
import org.antlr.v4.kotlinruntime.TokenStream
import org.antlr.v4.kotlinruntime.ANTLRErrorListener


/**
 * This class represents profiling event information for an ambiguity.
 * Ambiguities are decisions where a particular input resulted in an SLL
 * conflict, followed by LL prediction also reaching a conflict state
 * (indicating a true ambiguity in the grammar).
 *
 *
 *
 * This event may be reported during SLL prediction in cases where the
 * conflicting SLL configuration set provides sufficient information to
 * determine that the SLL conflict is truly an ambiguity. For example, if none
 * of the ATN configurations in the conflicting SLL configuration set have
 * traversed a global follow transition (i.e.
 * [ATNConfig.reachesIntoOuterContext] is 0 for all configurations), then
 * the result of SLL prediction for that input is known to be equivalent to the
 * result of LL prediction for that input.
 *
 *
 *
 * In some cases, the minimum represented alternative in the conflicting LL
 * configuration set is not equal to the minimum represented alternative in the
 * conflicting SLL configuration set. Grammars and inputs which result in this
 * scenario are unable to use [PredictionMode.SLL], which in turn means
 * they cannot use the two-stage parsing strategy to improve parsing performance
 * for that input.
 *
 * @see ParserATNSimulator.reportAmbiguity
 *
 * @see ANTLRErrorListener.reportAmbiguity
 *
 *
 * @since 4.3
 */
class AmbiguityInfo
/**
 * Constructs a new instance of the [AmbiguityInfo] class with the
 * specified detailed ambiguity information.
 *
 * @param decision The decision number
 * @param configs The final configuration set identifying the ambiguous
 * alternatives for the current input
 * @param ambigAlts The set of alternatives in the decision that lead to a valid parse.
 * The predicted alt is the min(ambigAlts)
 * @param input The input token stream
 * @param startIndex The start index for the current prediction
 * @param stopIndex The index at which the ambiguity was identified during
 * prediction
 * @param fullCtx `true` if the ambiguity was identified during LL
 * prediction; otherwise, `false` if the ambiguity was identified
 * during SLL prediction
 */
(decision: Int,
 configs: ATNConfigSet,
 /** The set of alternative numbers for this decision event that lead to a valid parse.  */
 var ambigAlts: BitSet,
 input: TokenStream, startIndex: Int, stopIndex: Int,
 fullCtx: Boolean) : DecisionEventInfo(decision, configs, input, startIndex, stopIndex, fullCtx)
