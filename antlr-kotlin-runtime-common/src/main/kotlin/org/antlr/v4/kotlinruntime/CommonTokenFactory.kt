/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.misc.Pair

/**
 * This default implementation of [TokenFactory] creates
 * [CommonToken] objects.
 */
class CommonTokenFactory
/**
 * Constructs a [CommonTokenFactory] with the specified value for
 * [.copyText].
 *
 *
 *
 * When `copyText` is `false`, the [.DEFAULT] instance
 * should be used instead of constructing a new instance.
 *
 * @param copyText The value for [.copyText].
 */
constructor(
        /**
         * Indicates whether [CommonToken.setText] should be called after
         * constructing tokens to explicitly set the text. This is useful for cases
         * where the input stream might not be able to provide arbitrary substrings
         * of text from the input after the lexer creates a token (e.g. the
         * implementation of [CharStream.getText] in
         * [UnbufferedCharStream] throws an
         * [UnsupportedOperationException]). Explicitly setting the token text
         * allows [Token.getText] to be called at any time regardless of the
         * input stream implementation.
         *
         *
         *
         * The default value is `false` to avoid the performance and memory
         * overhead of copying text for every token unless explicitly requested.
         */
        protected val copyText: Boolean = false) : TokenFactory<CommonToken> {

    override fun create(source: Pair<TokenSource, CharStream>, type: Int, text: String?,
                        channel: Int, start: Int, stop: Int,
                        line: Int, charPositionInLine: Int): CommonToken {
        val t = CommonToken(source, type, channel, start, stop)
        t.line = line
        t.charPositionInLine = charPositionInLine
        if (text != null) {
            t.text = text
        } else if (copyText && source.b != null) {
            t.text = source.b.getText(Interval.of(start, stop))
        }

        return t
    }

    override fun create(type: Int, text: String): CommonToken {
        return CommonToken(type, text)
    }

    companion object {
        /**
         * The default [CommonTokenFactory] instance.
         *
         *
         *
         * This token factory does not explicitly copy token text when constructing
         * tokens.
         */
        val DEFAULT: TokenFactory<CommonToken> = CommonTokenFactory()
    }
}
/**
 * Constructs a [CommonTokenFactory] with [.copyText] set to
 * `false`.
 *
 *
 *
 * The [.DEFAULT] instance should be used instead of calling this
 * directly.
 */
