// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.nio.ByteBuffer
import java.nio.channels.Channels
import java.nio.channels.ReadableByteChannel
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/**
 * This class represents the primary interface for creating [CharStream]s
 * from a variety of sources as of 4.7. The motivation was to support
 * Unicode code points > `U+FFFF`.
 *
 * [ANTLRInputStream] and [ANTLRFileStream] are now deprecated in favor
 * of the streams created by this interface.
 *
 * - DEPRECATED: `ANTLRFileStream("myinputfile")`
 * - NEW:        `CharStreams.fromFileName("myinputfile")`
 *
 * WARNING: if you use both the deprecated and the new streams, you will see
 * a nontrivial performance degradation. This speed hit is because the
 * [Lexer]'s internal code goes from a monomorphic to megamorphic
 * dynamic dispatch to get characters from the input stream. Java's
 * on-the-fly compiler (JIT) is unable to perform the same optimizations
 * so stick with either the old or the new streams, if performance is
 * a primary concern. See the extreme debugging and spelunking
 * needed to identify this issue in our timing rig:
 *
 * [antlr4#1781](https://github.com/antlr/antlr4/pull/1781)
 *
 * The ANTLR character streams still buffer all the input when you create
 * the stream, as they have done for ~20 years. If you need unbuffered
 * access, please note that it becomes challenging to create
 * parse trees. The parse tree has to point to tokens which will either
 * point into a stale location in an unbuffered stream or you have to copy
 * the characters out of the buffer into the token. That defeats the purpose
 * of unbuffered input. Per the ANTLR book, unbuffered streams are primarily
 * useful for processing infinite streams *during the parse*.
 *
 * The new streams also use 8-bit buffers when possible so this new
 * interface supports character streams that use half as much memory
 * as the old [ANTLRFileStream], which assumed 16-bit characters.
 *
 * A big shout-out to Ben Hamilton (github bhamiltoncx) for his superhuman
 * efforts across all targets to get true Unicode 3.1 support for `U+10FFFF`.
 *
 * @since 4.7
 */
public actual object CharStreams : AbstractCharStreams() {
  private const val DEFAULT_BUFFER_SIZE = 8 * 1024

  /**
   * Creates a [CharStream] given a string containing a
   * path to a file on disk and the charset of the bytes
   * contained in the file.
   *
   * Reads the entire contents of the file into the result before returning.
   */
  @JvmOverloads
  @Suppress("unused")
  public fun fromFileName(fileName: String, charset: Charset = Charsets.UTF_8): CharStream =
    fromPath(Paths.get(fileName), charset)

  /**
   * Creates a [CharStream] given a path to a file on disk and the
   * charset of the bytes contained in the file.
   *
   * Reads the entire contents of the file into the result before returning.
   */
  @JvmOverloads
  @Suppress("MemberVisibilityCanBePrivate")
  public fun fromPath(path: Path, charset: Charset = Charsets.UTF_8): CharStream {
    val pathStr = path.toString()
    val channel = Files.newByteChannel(path)
    return fromChannel(channel, charset, pathStr)
  }

  @JvmOverloads
  @Suppress("unused")
  public fun fromStream(
    inputStream: InputStream,
    charset: Charset = StandardCharsets.UTF_8,
    sourceName: String = IntStream.UNKNOWN_SOURCE_NAME,
  ): CharStream {
    val channel = Channels.newChannel(inputStream)
    return fromChannel(channel, charset, sourceName)
  }

  /**
   * Creates a [CharStream] given an opened [ReadableByteChannel] and the
   * charset of the bytes contained in the channel.
   *
   * Reads the entire contents of the [channel] into
   * the result before returning, then closes the [channel].
   */
  @JvmOverloads
  @Suppress("MemberVisibilityCanBePrivate")
  public fun fromChannel(
    channel: ReadableByteChannel,
    charset: Charset = Charsets.UTF_8,
    sourceName: String = IntStream.UNKNOWN_SOURCE_NAME,
  ): CharStream {
    channel.use {
      val buffer = ByteBuffer.allocate(DEFAULT_BUFFER_SIZE)
      val bos = InternalByteArrayOutputStream(DEFAULT_BUFFER_SIZE * 2)

      while (true) {
        val bytesRead = it.read(buffer)

        if (bytesRead < 0) {
          // End of stream
          break
        }

        bos.write(buffer.array(), 0, bytesRead)
        buffer.clear()
      }

      // Using the internal buffer avoids an additional array copy
      val source = String(bos.buffer, 0, bos.count, charset)
      return StringCharStream(source, sourceName)
    }
  }

  private class InternalByteArrayOutputStream(size: Int) : ByteArrayOutputStream(size) {
    val buffer: ByteArray
      get() = buf

    val count: Int
      get() = super.count
  }
}
