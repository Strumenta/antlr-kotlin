/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

import com.strumenta.kotlinmultiplatform.NullPointerException
import com.strumenta.kotlinmultiplatform.assert
import org.antlr.v4.kotlinruntime.misc.Interval

/**
 * This implementation of [TokenStream] loads tokens from a
 * [TokenSource] on-demand, and places the tokens in a buffer to provide
 * access to any previous token by index.
 *
 *
 *
 * This token stream ignores the value of [Token.getChannel]. If your
 * parser requires the token stream filter tokens to only those on a particular
 * channel, such as [Token.DEFAULT_CHANNEL] or
 * [Token.HIDDEN_CHANNEL], use a filtering token stream such a
 * [CommonTokenStream].
 */
open class BufferedTokenStream(
        /**
         * The [TokenSource] from which tokens for this stream are fetched.
         */
        override var tokenSource: TokenSource) : TokenStream {

    /**
     * A collection of all tokens fetched from the token source. The list is
     * considered a complete view of the input once [.fetchedEOF] is set
     * to `true`.
     */
    protected var tokens: MutableList<Token> = ArrayList<Token>(100)

    /**
     * The index into [.tokens] of the current token (next token to
     * [.consume]). [.tokens]`[`[.p]`]` should be
     * [LT(1)][.LT].
     *
     *
     * This field is set to -1 when the stream is first constructed or when
     * [.setTokenSource] is called, indicating that the first token has
     * not yet been fetched from the token source. For additional information,
     * see the documentation of [IntStream] for a description of
     * Initializing Methods.
     */
    protected var p = -1

    /**
     * Indicates whether the [Token.EOF] token has been fetched from
     * [.tokenSource] and added to [.tokens]. This field improves
     * performance for the following cases:
     *
     *
     *  * [.consume]: The lookahead check in [.consume] to prevent
     * consuming the EOF symbol is optimized by checking the values of
     * [.fetchedEOF] and [.p] instead of calling [.LA].
     *  * [.fetch]: The check to prevent adding multiple EOF symbols into
     * [.tokens] is trivial with this field.
     *
     */
    protected var fetchedEOF: Boolean = false

    override val sourceName: String
        get() = tokenSource.sourceName!!

    /** Get the text of all tokens in this buffer.  */

    override val text: String
        get() = getText(Interval.of(0, size() - 1))

    init {
        if (tokenSource == null) {
            throw NullPointerException("tokenSource cannot be null")
        }
    }

//    override fun getTokenSource(): TokenSource {
//        return tokenSource
//    }

    override fun index(): Int {
        return p
    }

    override fun mark(): Int {
        return 0
    }

    override fun release(marker: Int) {
        // no resources to release
    }

    /**
     * This method resets the token stream back to the first token in the
     * buffer. It is equivalent to calling [.seek]`(0)`.
     *
     * @see .setTokenSource
     */
    @Deprecated("Use {@code seek(0)} instead.")
    fun reset() {
        seek(0)
    }

    override fun seek(index: Int) {
        lazyInit()
        p = adjustSeekIndex(index)
    }

    override fun size(): Int {
        return tokens.size
    }

    override fun consume() {
        val skipEofCheck: Boolean
        if (p >= 0) {
            if (fetchedEOF) {
                // the last token in tokens is EOF. skip check if p indexes any
                // fetched token except the last.
                skipEofCheck = p < tokens.size - 1
            } else {
                // no EOF token in tokens. skip check if p indexes a fetched token.
                skipEofCheck = p < tokens.size
            }
        } else {
            // not yet initialized
            skipEofCheck = false
        }

        if (!skipEofCheck && LA(1) == IntStream.EOF) {
            throw IllegalStateException("cannot consume EOF")
        }

        if (sync(p + 1)) {
            p = adjustSeekIndex(p + 1)
        }
    }

    /** Make sure index `i` in tokens has a token.
     *
     * @return `true` if a token is located at index `i`, otherwise
     * `false`.
     * @see .get
     */
    protected fun sync(i: Int): Boolean {
        assert(i >= 0)
        val n = i - tokens.size + 1 // how many more elements we need?
        //System.out.println("sync("+i+") needs "+n);
        if (n > 0) {
            val fetched = fetch(n)
            return fetched >= n
        }

        return true
    }

    /** Add `n` elements to buffer.
     *
     * @return The actual number of elements added to the buffer.
     */
    protected fun fetch(n: Int): Int {
        if (fetchedEOF) {
            return 0
        }

        for (i in 0 until n) {
            val t = tokenSource.nextToken()
            if (t is WritableToken) {
                (t as WritableToken).tokenIndex = tokens.size
            }
            tokens.add(t)
            if (t.type == Token.EOF) {
                fetchedEOF = true
                return i + 1
            }
        }

        return n
    }

    override operator fun get(i: Int): Token {
        if (i < 0 || i >= tokens.size) {
            throw IndexOutOfBoundsException("token index " + i + " out of range 0.." + (tokens.size - 1))
        }
        return tokens[i]
    }

    /** Get all tokens from start..stop inclusively  */
    operator fun get(start: Int, stop: Int): List<Token>? {
        var stop = stop
        if (start < 0 || stop < 0) return null
        lazyInit()
        val subset = ArrayList<Token>()
        if (stop >= tokens.size) stop = tokens.size - 1
        for (i in start..stop) {
            val t = tokens[i]
            if (t.type == Token.EOF) break
            subset.add(t)
        }
        return subset
    }

    override fun LA(i: Int): Int {
        return LT(i)!!.type
    }

    protected open fun LB(k: Int): Token? {
        return if (p - k < 0) null else tokens[p - k]
    }


    override fun LT(k: Int): Token? {
        lazyInit()
        if (k == 0) return null
        if (k < 0) return LB(-k)

        val i = p + k - 1
        sync(i)
        return if (i >= tokens.size) { // return EOF token
            // EOF must be last token
            tokens[tokens.size - 1]
        } else tokens[i]
        //		if ( i>range ) range = i;
    }

    /**
     * Allowed derived classes to modify the behavior of operations which change
     * the current stream position by adjusting the target token index of a seek
     * operation. The default implementation simply returns `i`. If an
     * exception is thrown in this method, the current stream index should not be
     * changed.
     *
     *
     * For example, [CommonTokenStream] overrides this method to ensure that
     * the seek target is always an on-channel token.
     *
     * @param i The target token index.
     * @return The adjusted target token index.
     */
    protected open fun adjustSeekIndex(i: Int): Int {
        return i
    }

    protected fun lazyInit() {
        if (p == -1) {
            setup()
        }
    }

    protected fun setup() {
        sync(0)
        p = adjustSeekIndex(0)
    }

//    /** Reset this token stream by setting its token source.  */
//    fun setTokenSource(tokenSource: TokenSource) {
//        this.tokenSource = tokenSource
//        tokens.clear()
//        p = -1
//        fetchedEOF = false
//    }

//    fun getTokens(): List<Token> {
//        return tokens
//    }

    /** Given a start and stop index, return a List of all tokens in
     * the token type BitSet.  Return null if no tokens were found.  This
     * method looks at both on and off channel tokens.
     */
    fun getTokens(start: Int, stop: Int, types: Set<Int>? = null): List<Token>? {
        lazyInit()
        if (start < 0 || stop >= tokens.size ||
                stop < 0 || start >= tokens.size) {
            throw IndexOutOfBoundsException("start " + start + " or stop " + stop +
                    " not in 0.." + (tokens.size - 1))
        }
        if (start > stop) return null

        // list = tokens[start:stop]:{T t, t.getType() in types}
        var filteredTokens: MutableList<Token>? = ArrayList<Token>()
        for (i in start..stop) {
            val t = tokens[i]
            if (types == null || types.contains(t.type)) {
                filteredTokens!!.add(t)
            }
        }
        if (filteredTokens!!.isEmpty()) {
            filteredTokens = null
        }
        return filteredTokens
    }

    fun getTokens(start: Int, stop: Int, ttype: Int): List<Token>? {
        val s = HashSet<Int>(ttype)
        s.add(ttype)
        return getTokens(start, stop, s)
    }

    /**
     * Given a starting index, return the index of the next token on channel.
     * Return `i` if `tokens[i]` is on channel. Return the index of
     * the EOF token if there are no tokens on channel between `i` and
     * EOF.
     */
    protected fun nextTokenOnChannel(i: Int, channel: Int): Int {
        var i = i
        sync(i)
        if (i >= size()) {
            return size() - 1
        }

        var token = tokens[i]
        while (token.channel != channel) {
            if (token.type == Token.EOF) {
                return i
            }

            i++
            sync(i)
            token = tokens[i]
        }

        return i
    }

    /**
     * Given a starting index, return the index of the previous token on
     * channel. Return `i` if `tokens[i]` is on channel. Return -1
     * if there are no tokens on channel between `i` and 0.
     *
     *
     *
     * If `i` specifies an index at or after the EOF token, the EOF token
     * index is returned. This is due to the fact that the EOF token is treated
     * as though it were on every channel.
     */
    protected fun previousTokenOnChannel(i: Int, channel: Int): Int {
        var i = i
        sync(i)
        if (i >= size()) {
            // the EOF token is on every channel
            return size() - 1
        }

        while (i >= 0) {
            val token = tokens[i]
            if (token.type == Token.EOF || token.channel == channel) {
                return i
            }

            i--
        }

        return i
    }

    /** Collect all tokens on specified channel to the right of
     * the current token up until we see a token on DEFAULT_TOKEN_CHANNEL or
     * EOF. If channel is -1, find any non default channel token.
     */
    fun getHiddenTokensToRight(tokenIndex: Int, channel: Int = -1): List<Token>? {
        lazyInit()
        if (tokenIndex < 0 || tokenIndex >= tokens.size) {
            throw IndexOutOfBoundsException(tokenIndex.toString() + " not in 0.." + (tokens.size - 1))
        }

        val nextOnChannel = nextTokenOnChannel(tokenIndex + 1, Lexer.DEFAULT_TOKEN_CHANNEL)
        val to: Int
        val from = tokenIndex + 1
        // if none onchannel to right, nextOnChannel=-1 so set to = last token
        if (nextOnChannel == -1)
            to = size() - 1
        else
            to = nextOnChannel

        return filterForChannel(from, to, channel)
    }

    /** Collect all tokens on specified channel to the left of
     * the current token up until we see a token on DEFAULT_TOKEN_CHANNEL.
     * If channel is -1, find any non default channel token.
     */
    fun getHiddenTokensToLeft(tokenIndex: Int, channel: Int = -1): List<Token>? {
        lazyInit()
        if (tokenIndex < 0 || tokenIndex >= tokens.size) {
            throw IndexOutOfBoundsException(tokenIndex.toString() + " not in 0.." + (tokens.size - 1))
        }

        if (tokenIndex == 0) {
            // obviously no tokens can appear before the first token
            return null
        }

        val prevOnChannel = previousTokenOnChannel(tokenIndex - 1, Lexer.DEFAULT_TOKEN_CHANNEL)
        if (prevOnChannel == tokenIndex - 1) return null
        // if none onchannel to left, prevOnChannel=-1 then from=0
        val from = prevOnChannel + 1
        val to = tokenIndex - 1

        return filterForChannel(from, to, channel)
    }

    protected fun filterForChannel(from: Int, to: Int, channel: Int): List<Token>? {
        val hidden = ArrayList<Token>()
        for (i in from..to) {
            val t = tokens[i]
            if (channel == -1) {
                if (t.channel != Lexer.DEFAULT_TOKEN_CHANNEL) hidden.add(t)
            } else {
                if (t.channel == channel) hidden.add(t)
            }
        }
        return if (hidden.size == 0) null else hidden
    }

    override fun getText(interval: Interval): String {
        val start = interval.a
        var stop = interval.b
        if (start < 0 || stop < 0) return ""
        fill()
        if (stop >= tokens.size) stop = tokens.size - 1

        val buf = StringBuilder()
        for (i in start..stop) {
            val t = tokens[i]
            if (t.type == Token.EOF) break
            buf.append(t.text)
        }
        return buf.toString()
    }


    override fun getText(ctx: RuleContext): String {
        return getText(ctx.sourceInterval)
    }

    override fun getText(start: Token?, stop: Token?): String? {
        return if (start != null && stop != null) {
            getText(Interval.of(start!!.tokenIndex, stop!!.tokenIndex))
        } else ""

    }

    /** Get all tokens from lexer until EOF  */
    fun fill() {
        lazyInit()
        val blockSize = 1000
        while (true) {
            val fetched = fetch(blockSize)
            if (fetched < blockSize) {
                return
            }
        }
    }
}
/** Collect all hidden tokens (any off-default channel) to the right of
 * the current token up until we see a token on DEFAULT_TOKEN_CHANNEL
 * or EOF.
 */
/** Collect all hidden tokens (any off-default channel) to the left of
 * the current token up until we see a token on DEFAULT_TOKEN_CHANNEL.
 */
