/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime

import java.io.IOException
import java.io.InputStream
import java.nio.ByteBuffer
import java.nio.channels.Channels
import java.nio.channels.ReadableByteChannel
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/** This class represents the primary interface for creating [CharStream]s
 * from a variety of sources as of 4.7.  The motivation was to support
 * Unicode code points > U+FFFF.  [ANTLRInputStream] and
 * [ANTLRFileStream] are now deprecated in favor of the streams created
 * by this interface.
 *
 * DEPRECATED: `new ANTLRFileStream("myinputfile")`
 * NEW:        `CharStreams.fromFileName("myinputfile")`
 *
 * WARNING: If you use both the deprecated and the new streams, you will see
 * a nontrivial performance degradation. This speed hit is because the
 * [Lexer]'s internal code goes from a monomorphic to megamorphic
 * dynamic dispatch to get characters from the input stream. Java's
 * on-the-fly compiler (JIT) is unable to perform the same optimizations
 * so stick with either the old or the new streams, if performance is
 * a primary concern. See the extreme debugging and spelunking
 * needed to identify this issue in our timing rig:
 *
 * https://github.com/antlr/antlr4/pull/1781
 *
 * The ANTLR character streams still buffer all the input when you create
 * the stream, as they have done for ~20 years. If you need unbuffered
 * access, please note that it becomes challenging to create
 * parse trees. The parse tree has to point to tokens which will either
 * point into a stale location in an unbuffered stream or you have to copy
 * the characters out of the buffer into the token. That defeats the purpose
 * of unbuffered input. Per the ANTLR book, unbuffered streams are primarily
 * useful for processing infinite streams *during the parse.*
 *
 * The new streams also use 8-bit buffers when possible so this new
 * interface supports character streams that use half as much memory
 * as the old [ANTLRFileStream], which assumed 16-bit characters.
 *
 * A big shout out to Ben Hamilton (github bhamiltoncx) for his superhuman
 * efforts across all targets to get true Unicode 3.1 support for U+10FFFF.
 *
 * @since 4.7
 */
actual object CharStreams : AbstractCharStreams() {
    private const val DEFAULT_BUFFER_SIZE = 4096

    /**
     * Creates a [CharStream] given a path to a file on disk and the
     * charset of the bytes contained in the file.
     *
     * Reads the entire contents of the file into the result before returning.
     */
    @Suppress("MemberVisibilityCanBePrivate")
    fun fromPath(path: Path, charset: Charset = StandardCharsets.UTF_8): CharStream {
        Files.newByteChannel(path).use { channel ->
            return fromChannel(channel, charset, path.toString())
        }
    }

    /**
     * Creates a [CharStream] given a string containing a
     * path to a file on disk and the charset of the bytes
     * contained in the file.
     *
     * Reads the entire contents of the file into the result before returning.
     */
    @Throws(IOException::class)
    fun fromFileName(fileName: String, charset: Charset = StandardCharsets.UTF_8): CharStream {
        return fromPath(Paths.get(fileName), charset)
    }

    @Throws(IOException::class)
    @JvmOverloads
    fun fromStream(
            `is`: InputStream,
            charset: Charset = StandardCharsets.UTF_8,
            sourceName: String = IntStream.UNKNOWN_SOURCE_NAME
    ): CharStream {
        Channels.newChannel(`is`).use { channel ->
            return fromChannel(channel, charset, sourceName)
        }
    }

    /**
     * Creates a [CharStream] given an opened [ReadableByteChannel] and the
     * charset of the bytes contained in the channel.
     *
     * Reads the entire contents of the `channel` into
     * the result before returning, then closes the `channel`.
     */
    @Throws(IOException::class)
    fun fromChannel(
            channel: ReadableByteChannel,
            charset: Charset = StandardCharsets.UTF_8,
            sourceName: String = IntStream.UNKNOWN_SOURCE_NAME): CharStream {
        channel.use { readableByteChannel ->
            val utf8BytesIn = ByteBuffer.allocate(DEFAULT_BUFFER_SIZE)

            var endOfInput = false
            var bytes = ByteArray(0)
            while (!endOfInput) {
                utf8BytesIn.rewind()
                val bytesRead = readableByteChannel.read(utf8BytesIn)
                endOfInput = bytesRead == -1
                bytes += utf8BytesIn.array()
                utf8BytesIn.flip()
                utf8BytesIn.compact()
            }
            return StringCharStream(String(bytes, charset), sourceName)
        }
    }
}// Utility class; do not construct.
/**
 * Creates a [CharStream] given a path to a UTF-8
 * encoded file on disk.
 *
 * Reads the entire contents of the file into the result before returning.
 */
/**
 * Creates a [CharStream] given an opened [InputStream]
 * containing UTF-8 bytes.
 *
 * Reads the entire contents of the `InputStream` into
 * the result before returning, then closes the `InputStream`.
 */
/**
 * Creates a [CharStream] given an opened [InputStream] and the
 * charset of the bytes contained in the stream.
 *
 * Reads the entire contents of the `InputStream` into
 * the result before returning, then closes the `InputStream`.
 */
/**
 * Creates a [CharStream] given an opened [ReadableByteChannel]
 * containing UTF-8 bytes.
 *
 * Reads the entire contents of the `channel` into
 * the result before returning, then closes the `channel`.
 */
/**
 * Creates a [CharStream] given a [Reader]. Closes
 * the reader before returning.
 */
/**
 * Creates a [CharStream] given a [String].
 */
