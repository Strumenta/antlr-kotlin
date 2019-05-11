/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

//import Interval
//
//import java.io.IOException
//import java.io.InputStream
//import java.io.InputStreamReader
//import java.io.Reader
//import java.nio.charset.Charset
//import java.nio.charset.StandardCharsets
//import java.util.Arrays
//
///** Do not buffer up the entire char stream. It does keep a small buffer
// * for efficiency and also buffers while a mark exists (set by the
// * lookahead prediction in parser). "Unbuffered" here refers to fact
// * that it doesn't buffer all data, not that's it's on demand loading of char.
// *
// * Before 4.7, this class used the default environment encoding to convert
// * bytes to UTF-16, and held the UTF-16 bytes in the buffer as chars.
// *
// * As of 4.7, the class uses UTF-8 by default, and the buffer holds Unicode
// * code points in the buffer as ints.
// */
//class UnbufferedCharStream
///** Useful for subclasses that pull char from other than this.input.  */
//constructor(bufferSize: Int = 256) : CharStream {
//    /**
//     * A moving window buffer of the data being scanned. While there's a marker,
//     * we keep adding to buffer. Otherwise, [consume()][.consume] resets so
//     * we start filling at index 0 again.
//     */
//    protected var data: IntArray
//
//    /**
//     * The number of characters currently in [data][.data].
//     *
//     *
//     * This is not the buffer capacity, that's `data.length`.
//     */
//    protected var n: Int = 0
//
//    /**
//     * 0..n-1 index into [data][.data] of next character.
//     *
//     *
//     * The `LA(1)` character is `data[p]`. If `p == n`, we are
//     * out of buffered characters.
//     */
//    protected var p = 0
//
//    /**
//     * Count up with [mark()][.mark] and down with
//     * [release()][.release]. When we `release()` the last mark,
//     * `numMarkers` reaches 0 and we reset the buffer. Copy
//     * `data[p]..data[n-1]` to `data[0]..data[(n-1)-p]`.
//     */
//    protected var numMarkers = 0
//
//    /**
//     * This is the `LA(-1)` character for the current position.
//     */
//    protected var lastChar = -1
//
//    /**
//     * When `numMarkers > 0`, this is the `LA(-1)` character for the
//     * first character in [data][.data]. Otherwise, this is unspecified.
//     */
//    protected var lastCharBufferStart: Int = 0
//
//    /**
//     * Absolute character index. It's the index of the character about to be
//     * read via `LA(1)`. Goes from 0 to the number of characters in the
//     * entire stream, although the stream size is unknown before the end is
//     * reached.
//     */
//    protected var currentCharIndex = 0
//
//    protected var input: Reader
//
//    /** The name or source of this char stream.  */
//    var name: String? = null
//
//    override val sourceName: String
//        get() = if (name == null || name!!.isEmpty()) {
//            IntStream.UNKNOWN_SOURCE_NAME
//        } else name
//
//    protected val bufferStartIndex: Int
//        get() = currentCharIndex - p
//
//    init {
//        n = 0
//        data = IntArray(bufferSize)
//    }
//
//    @JvmOverloads constructor(input: InputStream, bufferSize: Int = 256, charset: Charset = StandardCharsets.UTF_8) : this(bufferSize) {
//        this.input = InputStreamReader(input, charset)
//        fill(1) // prime
//    }
//
//    @JvmOverloads constructor(input: Reader, bufferSize: Int = 256) : this(bufferSize) {
//        this.input = input
//        fill(1) // prime
//    }
//
//    override fun consume() {
//        if (LA(1) == IntStream.EOF) {
//            throw IllegalStateException("cannot consume EOF")
//        }
//
//        // buf always has at least data[p==0] in this method due to ctor
//        lastChar = data[p]   // track last char for LA(-1)
//
//        if (p == n - 1 && numMarkers == 0) {
//            n = 0
//            p = -1 // p++ will leave this at 0
//            lastCharBufferStart = lastChar
//        }
//
//        p++
//        currentCharIndex++
//        sync(1)
//    }
//
//    /**
//     * Make sure we have 'need' elements from current position [p][.p].
//     * Last valid `p` index is `data.length-1`. `p+need-1` is
//     * the char index 'need' elements ahead. If we need 1 element,
//     * `(p+1-1)==p` must be less than `data.length`.
//     */
//    protected fun sync(want: Int) {
//        val need = p + want - 1 - n + 1 // how many more elements we need?
//        if (need > 0) {
//            fill(need)
//        }
//    }
//
//    /**
//     * Add `n` characters to the buffer. Returns the number of characters
//     * actually added to the buffer. If the return value is less than `n`,
//     * then EOF was reached before `n` characters could be added.
//     */
//    protected fun fill(n: Int): Int {
//        for (i in 0 until n) {
//            if (this.n > 0 && data[this.n - 1] == IntStream.EOF) {
//                return i
//            }
//
//            try {
//                val c = nextChar()
//                if (c > Character.MAX_VALUE.toInt() || c == IntStream.EOF) {
//                    add(c)
//                } else {
//                    val ch = c.toChar()
//                    if (Character.isLowSurrogate(ch)) {
//                        throw RuntimeException("Invalid UTF-16 (low surrogate with no preceding high surrogate)")
//                    } else if (Character.isHighSurrogate(ch)) {
//                        val lowSurrogate = nextChar()
//                        if (lowSurrogate > Character.MAX_VALUE.toInt()) {
//                            throw RuntimeException("Invalid UTF-16 (high surrogate followed by code point > U+FFFF")
//                        } else if (lowSurrogate == IntStream.EOF) {
//                            throw RuntimeException("Invalid UTF-16 (dangling high surrogate at end of file)")
//                        } else {
//                            val lowSurrogateChar = lowSurrogate.toChar()
//                            if (Character.isLowSurrogate(lowSurrogateChar)) {
//                                add(Character.toCodePoint(ch, lowSurrogateChar))
//                            } else {
//                                throw RuntimeException("Invalid UTF-16 (dangling high surrogate")
//                            }
//                        }
//                    } else {
//                        add(c)
//                    }
//                }
//            } catch (ioe: IOException) {
//                throw RuntimeException(ioe)
//            }
//
//        }
//
//        return n
//    }
//
//    /**
//     * Override to provide different source of characters than
//     * [input][.input].
//     */
//    @Throws(IOException::class)
//    protected fun nextChar(): Int {
//        return input.read()
//    }
//
//    protected fun add(c: Int) {
//        if (n >= data.size) {
//            data = Arrays.copyOf(data, data.size * 2)
//        }
//        data[n++] = c
//    }
//
//    override fun LA(i: Int): Int {
//        if (i == -1) return lastChar // special case
//        sync(i)
//        val index = p + i - 1
//        if (index < 0) throw IndexOutOfBoundsException()
//        return if (index >= n) IntStream.EOF else data[index]
//    }
//
//    /**
//     * Return a marker that we can release later.
//     *
//     *
//     * The specific marker value used for this class allows for some level of
//     * protection against misuse where `seek()` is called on a mark or
//     * `release()` is called in the wrong order.
//     */
//    override fun mark(): Int {
//        if (numMarkers == 0) {
//            lastCharBufferStart = lastChar
//        }
//
//        val mark = -numMarkers - 1
//        numMarkers++
//        return mark
//    }
//
//    /** Decrement number of markers, resetting buffer if we hit 0.
//     * @param marker
//     */
//    override fun release(marker: Int) {
//        val expectedMark = -numMarkers
//        if (marker != expectedMark) {
//            throw IllegalStateException("release() called with an invalid marker.")
//        }
//
//        numMarkers--
//        if (numMarkers == 0 && p > 0) { // release buffer when we can, but don't do unnecessary work
//            // Copy data[p]..data[n-1] to data[0]..data[(n-1)-p], reset ptrs
//            // p is last valid char; move nothing if p==n as we have no valid char
//            System.arraycopy(data, p, data, 0, n - p) // shift n-p char from p to 0
//            n = n - p
//            p = 0
//            lastCharBufferStart = lastChar
//        }
//    }
//
//    override fun index(): Int {
//        return currentCharIndex
//    }
//
//    /** Seek to absolute character index, which might not be in the current
//     * sliding window.  Move `p` to `index-bufferStartIndex`.
//     */
//    override fun seek(index: Int) {
//        var index = index
//        if (index == currentCharIndex) {
//            return
//        }
//
//        if (index > currentCharIndex) {
//            sync(index - currentCharIndex)
//            index = Math.min(index, bufferStartIndex + n - 1)
//        }
//
//        // index == to bufferStartIndex should set p to 0
//        val i = index - bufferStartIndex
//        if (i < 0) {
//            throw IllegalArgumentException("cannot seek to negative index " + index)
//        } else if (i >= n) {
//            throw UnsupportedOperationException("seek to index outside buffer: " +
//                    index + " not in " + bufferStartIndex + ".." + (bufferStartIndex + n))
//        }
//
//        p = i
//        currentCharIndex = index
//        if (p == 0) {
//            lastChar = lastCharBufferStart
//        } else {
//            lastChar = data[p - 1]
//        }
//    }
//
//    override fun size(): Int {
//        throw UnsupportedOperationException("Unbuffered stream cannot know its size")
//    }
//
//    override fun getText(interval: Interval): String {
//        if (interval.a < 0 || interval.b < interval.a - 1) {
//            throw IllegalArgumentException("invalid interval")
//        }
//
//        val bufferStartIndex = bufferStartIndex
//        if (n > 0 && data[n - 1] == Character.MAX_VALUE.toInt()) {
//            if (interval.a + interval.length() > bufferStartIndex + n) {
//                throw IllegalArgumentException("the interval extends past the end of the stream")
//            }
//        }
//
//        if (interval.a < bufferStartIndex || interval.b >= bufferStartIndex + n) {
//            throw UnsupportedOperationException("interval " + interval + " outside buffer: " +
//                    bufferStartIndex + ".." + (bufferStartIndex + n - 1))
//        }
//        // convert from absolute to local index
//        val i = interval.a - bufferStartIndex
//        return String(data, i, interval.length())
//    }
//}
///** Useful for subclasses that pull char from other than this.input.  */
