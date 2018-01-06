/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import com.strumenta.kotlinmultiplatform.errMessage

/**
 *
 * @author Sam Harwell
 */
class ConsoleErrorListener : BaseErrorListener() {

    /**
     * {@inheritDoc}
     *
     *
     *
     * This implementation prints messages to [System.err] containing the
     * values of `line`, `charPositionInLine`, and `msg` using
     * the following format.
     *
     * <pre>
     * line *line*:*charPositionInLine* *msg*
    </pre> *
     */
    override fun syntaxError(recognizer: Recognizer<*, *>,
                             offendingSymbol: Any?,
                             line: Int,
                             charPositionInLine: Int,
                             msg: String,
                             e: RecognitionException) {
        errMessage("line $line:$charPositionInLine $msg")
    }

    companion object {
        /**
         * Provides a default instance of [ConsoleErrorListener].
         */
        val INSTANCE = ConsoleErrorListener()
    }

}
