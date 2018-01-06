/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

/**
 * This class extends [BufferedTokenStream] with functionality to filter
 * token streams to tokens on a particular channel (tokens where
 * [Token.getChannel] returns a particular value).
 *
 *
 *
 * This token stream provides access to all tokens by index or when calling
 * methods like [.getText]. The channel filtering is only used for code
 * accessing tokens via the lookahead methods [.LA], [.LT], and
 * [.LB].
 *
 *
 *
 * By default, tokens are placed on the default channel
 * ([Token.DEFAULT_CHANNEL]), but may be reassigned by using the
 * `->channel(HIDDEN)` lexer command, or by using an embedded action to
 * call [Lexer.setChannel].
 *
 *
 *
 *
 * Note: lexer rules which use the `->skip` lexer command or call
 * [Lexer.skip] do not produce tokens at all, so input text matched by
 * such a rule will not be available as part of the token stream, regardless of
 * channel.we
 */
class CommonTokenStream
/**
 * Constructs a new [CommonTokenStream] using the specified token
 * source and the default token channel ([Token.DEFAULT_CHANNEL]).
 *
 * @param tokenSource The token source.
 */
(tokenSource: TokenSource) : BufferedTokenStream(tokenSource) {
    /**
     * Specifies the channel to use for filtering tokens.
     *
     *
     *
     * The default value is [Token.DEFAULT_CHANNEL], which matches the
     * default channel assigned to tokens created by the lexer.
     */
    protected var channel = Token.DEFAULT_CHANNEL

    /** Count EOF just once.  */
    val numberOfOnChannelTokens: Int
        get() {
            var n = 0
            fill()
            for (i in tokens.indices) {
                val t = tokens.get(i)
                if (t.channel == channel) n++
                if (t.type == Token.EOF) break
            }
            return n
        }

    /**
     * Constructs a new [CommonTokenStream] using the specified token
     * source and filtering tokens to the specified channel. Only tokens whose
     * [Token.getChannel] matches `channel` or have the
     * [Token.getType] equal to [Token.EOF] will be returned by the
     * token stream lookahead methods.
     *
     * @param tokenSource The token source.
     * @param channel The channel to use for filtering tokens.
     */
    constructor(tokenSource: TokenSource, channel: Int) : this(tokenSource) {
        this.channel = channel
    }

    protected override fun adjustSeekIndex(i: Int): Int {
        return nextTokenOnChannel(i, channel)
    }

    protected override fun LB(k: Int): Token? {
        if (k == 0 || p - k < 0) return null

        var i = p
        var n = 1
        // find k good tokens looking backwards
        while (n <= k && i > 0) {
            // skip off-channel tokens
            i = previousTokenOnChannel(i - 1, channel)
            n++
        }
        return if (i < 0) null else tokens.get(i)
    }

    override fun LT(k: Int): Token? {
        //System.out.println("enter LT("+k+")");
        lazyInit()
        if (k == 0) return null
        if (k < 0) return LB(-k)
        var i = p
        var n = 1 // we know tokens[p] is a good one
        // find k good tokens
        while (n < k) {
            // skip off-channel tokens, but make sure to not look past EOF
            if (sync(i + 1)) {
                i = nextTokenOnChannel(i + 1, channel)
            }
            n++
        }
        //		if ( i>range ) range = i;
        return tokens.get(i)
    }
}
