/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.misc.Pair

open class CommonToken : WritableToken {

    /**
     * This is the backing field for [.getType] and [.setType].
     */
    override var type: Int = 0


    /**
     * This is the backing field for [.getLine] and [.setLine].
     */
    override var line: Int = 0

    /**
     * This is the backing field for [.getCharPositionInLine] and
     * [.setCharPositionInLine].
     */
    override var charPositionInLine = -1

    /**
     * This is the backing field for [.getChannel] and
     * [.setChannel].
     */
    override var channel = Token.DEFAULT_CHANNEL

    /**
     * This is the backing field for [.getTokenSource] and
     * [.getInputStream].
     *
     *
     *
     * These properties share a field to reduce the memory footprint of
     * [CommonToken]. Tokens created by a [CommonTokenFactory] from
     * the same source and input stream share a reference to the same
     * [Pair] containing these values.
     */

    protected var source: Pair<TokenSource, CharStream>

    /**
     * This is the backing field for [.getText] when the token text is
     * explicitly set in the constructor or via [.setText].
     *
     * @see .getText
     */
    //protected open override var text: String? = null

    /**
     * This is the backing field for [.getTokenIndex] and
     * [.setTokenIndex].
     */
    override var tokenIndex = -1

    /**
     * This is the backing field for [.getStartIndex] and
     * [.setStartIndex].
     */
    override var startIndex: Int = 0

    /**
     * This is the backing field for [.getStopIndex] and
     * [.setStopIndex].
     */
    override var stopIndex: Int = 0

    override val tokenSource: TokenSource
        get() = source.a!!

    override val inputStream: CharStream?
        get() = source.b

    /**
     * Constructs a new [CommonToken] with the specified token type.
     *
     * @param type The token type.
     */
    constructor(type: Int) {
        this.type = type
        this.source = EMPTY_SOURCE
    }

    constructor(source: Pair<TokenSource, CharStream>, type: Int, channel: Int, start: Int, stop: Int) {
        this.source = source
        this.type = type
        this.channel = channel
        this.startIndex = start
        this.stopIndex = stop
        if (source.a != null) {
            this.line = source.a.line
            this.charPositionInLine = source.a.charPositionInLine
        }
    }

    /**
     * Constructs a new [CommonToken] with the specified token type and
     * text.
     *
     * @param type The token type.
     * @param text The text of the token.
     */
    constructor(type: Int, text: String) {
        this.type = type
        this.channel = Token.DEFAULT_CHANNEL
        this.text = text
        this.source = EMPTY_SOURCE
    }

    /**
     * Constructs a new [CommonToken] as a copy of another [Token].
     *
     *
     *
     * If `oldToken` is also a [CommonToken] instance, the newly
     * constructed token will share a reference to the [.text] field and
     * the [Pair] stored in [.source]. Otherwise, [.text] will
     * be assigned the result of calling [.getText], and [.source]
     * will be constructed from the result of [Token.getTokenSource] and
     * [Token.getInputStream].
     *
     * @param oldToken The token to copy.
     */
    constructor(oldToken: Token) {
        type = oldToken.type
        line = oldToken.line
        tokenIndex = oldToken.tokenIndex
        charPositionInLine = oldToken.charPositionInLine
        channel = oldToken.channel
        startIndex = oldToken.startIndex
        stopIndex = oldToken.stopIndex

        if (oldToken is CommonToken) {
            text = (oldToken as CommonToken).text
            source = (oldToken as CommonToken).source
        } else {
            text = oldToken.text
            source = Pair<TokenSource, CharStream>(oldToken.tokenSource!!, oldToken.inputStream!!)
        }
    }

//    override fun setLine(line: Int) {
//        this.line = line
//    }

    override var text: String? = null
        get() {
            if (field != null) {
                return field
            }

            val input = inputStream ?: return null
            val n = input.size()
            return if (startIndex < n && stopIndex < n) {
                input.getText(Interval.of(startIndex, stopIndex))
            } else {
                "<EOF>"
            }
        }


    /**
     * Explicitly set the text for this token. If {code text} is not
     * `null`, then [.getText] will return this value rather than
     * extracting the text from the input.
     *
     * @param text The explicit text of the token, or `null` if the text
     * should be obtained from the input along with the start and stop indexes
     * of the token.
     */
//    override fun setText(text: String) {
//        this.text = text
//    }
//
//    override fun setCharPositionInLine(charPositionInLine: Int) {
//        this.charPositionInLine = charPositionInLine
//    }
//
//    override fun setChannel(channel: Int) {
//        this.channel = channel
//    }
//
//    override fun setType(type: Int) {
//        this.type = type
//    }
//
//    override fun setTokenIndex(index: Int) {
//        this.tokenIndex = index
//    }

    override fun toString(): String {
        return toString(null)
    }

    fun toString(r: Recognizer<*, *>?): String {

        var channelStr = ""
        if (channel > 0) {
            channelStr = ",channel=" + channel
        }
        var txt = text
        if (txt != null) {
            txt = txt.replace("\n", "\\n")
            txt = txt.replace("\r", "\\r")
            txt = txt.replace("\t", "\\t")
        } else {
            txt = "<no text>"
        }
        var typeString = type.toString()
        if (r != null) {
            typeString = r!!.vocabulary.getDisplayName(type)
        }
        return "[@$tokenIndex,$startIndex:$stopIndex='$txt',<$typeString>$channelStr,$line:$charPositionInLine]"
    }

    companion object {
        /**
         * An empty [Pair] which is used as the default value of
         * [.source] for tokens that do not have a source.
         */
        protected val EMPTY_SOURCE = Pair<TokenSource, CharStream>(null, null)
    }
}
