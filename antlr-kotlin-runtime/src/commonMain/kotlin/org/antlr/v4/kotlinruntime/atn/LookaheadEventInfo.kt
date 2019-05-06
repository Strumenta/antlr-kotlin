/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.TokenStream

/**
 * This class represents profiling event information for tracking the lookahead
 * depth required in order to make a prediction.
 *
 * @since 4.3
 */
class LookaheadEventInfo
/**
 * Constructs a new instance of the [LookaheadEventInfo] class with
 * the specified detailed lookahead information.
 *
 * @param decision The decision number
 * @param configs The final configuration set containing the necessary
 * information to determine the result of a prediction, or `null` if
 * the final configuration set is not available
 * @param input The input token stream
 * @param startIndex The start index for the current prediction
 * @param stopIndex The index at which the prediction was finally made
 * @param fullCtx `true` if the current lookahead is part of an LL
 * prediction; otherwise, `false` if the current lookahead is part of
 * an SLL prediction
 */
(decision: Int,
 configs: ATNConfigSet,
 /** The alternative chosen by adaptivePredict(), not necessarily
  * the outermost alt shown for a rule; left-recursive rules have
  * user-level alts that differ from the rewritten rule with a (...) block
  * and a (..)* loop.
  */
 var predictedAlt: Int,
 input: TokenStream, startIndex: Int, stopIndex: Int,
 fullCtx: Boolean) : DecisionEventInfo(decision, configs, input, startIndex, stopIndex, fullCtx)
