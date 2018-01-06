/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.*

/**
 * This class represents profiling event information for a syntax error
 * identified during prediction. Syntax errors occur when the prediction
 * algorithm is unable to identify an alternative which would lead to a
 * successful parse.
 *
 * @see Parser.notifyErrorListeners
 * @see ANTLRErrorListener.syntaxError
 *
 *
 * @since 4.3
 */
class ErrorInfo
/**
 * Constructs a new instance of the [ErrorInfo] class with the
 * specified detailed syntax error information.
 *
 * @param decision The decision number
 * @param configs The final configuration set reached during prediction
 * prior to reaching the [ATNSimulator.ERROR] state
 * @param input The input token stream
 * @param startIndex The start index for the current prediction
 * @param stopIndex The index at which the syntax error was identified
 * @param fullCtx `true` if the syntax error was identified during LL
 * prediction; otherwise, `false` if the syntax error was identified
 * during SLL prediction
 */
(decision: Int,
 configs: ATNConfigSet,
 input: TokenStream, startIndex: Int, stopIndex: Int,
 fullCtx: Boolean) : DecisionEventInfo(decision, configs, input, startIndex, stopIndex, fullCtx)
