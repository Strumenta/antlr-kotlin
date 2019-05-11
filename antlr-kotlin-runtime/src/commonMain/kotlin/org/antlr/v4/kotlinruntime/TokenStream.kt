/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * An [IntStream] whose symbols are [Token] instances.
 */
interface TokenStream : IntStream {

    /**
     * Gets the underlying [TokenSource] which provides tokens for this
     * stream.
     */
    val tokenSource: TokenSource?

    /**
     * Return the text of all tokens in the stream. This method behaves like the
     * following code, including potential exceptions from the calls to
     * [IntStream.size] and [.getText], but may be
     * optimized by the specific implementation.
     *
     * <pre>
     * TokenStream stream = ...;
     * String text = stream.getText(new Interval(0, stream.size()));
    </pre> *
     *
     * @return The text of all tokens in the stream.
     */
    val text: String

    /**
     * Get the [Token] instance associated with the value returned by
     * [LA(k)][.LA]. This method has the same pre- and post-conditions as
     * [IntStream.LA]. In addition, when the preconditions of this method
     * are met, the return value is non-null and the value of
     * `LT(k).getType()==LA(k)`.
     *
     * @see IntStream.LA
     */
    fun LT(k: Int): Token?

    /**
     * Gets the [Token] at the specified `index` in the stream. When
     * the preconditions of this method are met, the return value is non-null.
     *
     *
     * The preconditions for this method are the same as the preconditions of
     * [IntStream.seek]. If the behavior of `seek(index)` is
     * unspecified for the current state and given `index`, then the
     * behavior of this method is also unspecified.
     *
     *
     * The symbol referred to by `index` differs from `seek()` only
     * in the case of filtering streams where `index` lies before the end
     * of the stream. Unlike `seek()`, this method does not adjust
     * `index` to point to a non-ignored symbol.
     *
     * @throws IllegalArgumentException if {code index} is less than 0
     * @throws UnsupportedOperationException if the stream does not support
     * retrieving the token at the specified index
     */
    operator fun get(index: Int): Token

    /**
     * Return the text of all tokens within the specified `interval`. This
     * method behaves like the following code (including potential exceptions
     * for violating preconditions of [.get], but may be optimized by the
     * specific implementation.
     *
     * <pre>
     * TokenStream stream = ...;
     * String text = "";
     * for (int i = interval.a; i &lt;= interval.b; i++) {
     * text += stream.get(i).getText();
     * }
    </pre> *
     *
     * @param interval The interval of tokens within this stream to get text
     * for.
     * @return The text of all tokens within the specified interval in this
     * stream.
     *
     * @throws NullPointerException if `interval` is `null`
     */
    fun getText(interval: Interval): String

    /**
     * Return the text of all tokens in the source interval of the specified
     * context. This method behaves like the following code, including potential
     * exceptions from the call to [.getText], but may be
     * optimized by the specific implementation.
     *
     *
     * If `ctx.getSourceInterval()` does not return a valid interval of
     * tokens provided by this stream, the behavior is unspecified.
     *
     * <pre>
     * TokenStream stream = ...;
     * String text = stream.getText(ctx.getSourceInterval());
    </pre> *
     *
     * @param ctx The context providing the source interval of tokens to get
     * text for.
     * @return The text of all tokens within the source interval of `ctx`.
     */
    fun getText(ctx: RuleContext): String

    /**
     * Return the text of all tokens in this stream between `start` and
     * `stop` (inclusive).
     *
     *
     * If the specified `start` or `stop` token was not provided by
     * this stream, or if the `stop` occurred before the `start`
     * token, the behavior is unspecified.
     *
     *
     * For streams which ensure that the [Token.getTokenIndex] method is
     * accurate for all of its provided tokens, this method behaves like the
     * following code. Other streams may implement this method in other ways
     * provided the behavior is consistent with this at a high level.
     *
     * <pre>
     * TokenStream stream = ...;
     * String text = "";
     * for (int i = start.getTokenIndex(); i &lt;= stop.getTokenIndex(); i++) {
     * text += stream.get(i).getText();
     * }
    </pre> *
     *
     * @param start The first token in the interval to get text for.
     * @param stop The last token in the interval to get text for (inclusive).
     * @return The text of all tokens lying between the specified `start`
     * and `stop` tokens.
     *
     * @throws UnsupportedOperationException if this stream does not support
     * this method for the specified tokens
     */
    fun getText(start: Token?, stop: Token?): String?
}
