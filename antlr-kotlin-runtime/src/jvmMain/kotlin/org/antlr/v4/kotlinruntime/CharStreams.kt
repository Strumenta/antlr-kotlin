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
