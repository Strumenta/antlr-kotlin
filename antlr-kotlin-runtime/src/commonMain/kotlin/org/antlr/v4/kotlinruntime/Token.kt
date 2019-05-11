/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.ast.Point

/** A token has properties: text, type, line, character position in the line
 * (so we can ignore tabs), token channel, index, and source from which
 * we obtained this token.
 */
interface Token {

    fun startPoint() = Point(line, charPositionInLine)

    fun endPoint() = if (text == null) null else Point(line, charPositionInLine).advance(text!!)

    /**
     * Get the text of the token.
     */
    val text: String?

    /** Get the token type of the token  */
    val type: Int

    /** The line number on which the 1st character of this token was matched,
     * line=1..n
     */
    val line: Int

    /** The index of the first character of this token relative to the
     * beginning of the line at which it occurs, 0..n-1
     */
    val charPositionInLine: Int

    /** Return the channel this token. Each token can arrive at the parser
     * on a different channel, but the parser only "tunes" to a single channel.
     * The parser ignores everything not on DEFAULT_CHANNEL.
     */
    val channel: Int

    /** An index from 0..n-1 of the token object in the input stream.
     * This must be valid in order to print token streams and
     * use TokenRewriteStream.
     *
     * Return -1 to indicate that this token was conjured up since
     * it doesn't have a valid index.
     */
    val tokenIndex: Int

    /** The starting character index of the token
     * This method is optional; return -1 if not implemented.
     */
    val startIndex: Int

    /** The last character index of the token.
     * This method is optional; return -1 if not implemented.
     */
    val stopIndex: Int

    /** Gets the [TokenSource] which created this token.
     */
    val tokenSource: TokenSource?

    /**
     * Gets the [CharStream] from which this token was derived.
     */
    val inputStream: CharStream?

    companion object {
        val INVALID_TYPE = 0

        /** During lookahead operations, this "token" signifies we hit rule end ATN state
         * and did not follow it despite needing to.
         */
        val EPSILON = -2

        val MIN_USER_TOKEN_TYPE = 1

        val EOF = IntStream.EOF

        /** All tokens go to the parser (unless skip() is called in that rule)
         * on a particular "channel".  The parser tunes to a particular channel
         * so that whitespace etc... can go to the parser on a "hidden" channel.
         */
        val DEFAULT_CHANNEL = 0

        /** Anything on different channel than DEFAULT_CHANNEL is not parsed
         * by parser.
         */
        val HIDDEN_CHANNEL = 1

        /**
         * This is the minimum constant value which can be assigned to a
         * user-defined token channel.
         *
         *
         *
         * The non-negative numbers less than [.MIN_USER_CHANNEL_VALUE] are
         * assigned to the predefined channels [.DEFAULT_CHANNEL] and
         * [.HIDDEN_CHANNEL].
         *
         * @see Token.getChannel
         */
        val MIN_USER_CHANNEL_VALUE = 2
    }
}
