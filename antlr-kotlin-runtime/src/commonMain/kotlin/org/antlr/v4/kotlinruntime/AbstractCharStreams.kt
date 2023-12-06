package org.antlr.v4.kotlinruntime

import kotlin.jvm.JvmOverloads

abstract class AbstractCharStreams {
  /**
   * Creates a [CharStream] given a string and the [sourceName] from which it came.
   */
  @JvmOverloads
  fun fromString(str: String, sourceName: String = IntStream.UNKNOWN_SOURCE_NAME): CharStream =
    StringCharStream(str, sourceName)
}
