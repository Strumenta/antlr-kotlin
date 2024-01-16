// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import kotlin.jvm.JvmOverloads

public abstract class AbstractCharStreams {
  /**
   * Creates a [CharStream] given a string and the [sourceName] from which it came.
   */
  @JvmOverloads
  public fun fromString(str: String, sourceName: String = IntStream.UNKNOWN_SOURCE_NAME): CharStream =
    StringCharStream(str, sourceName)
}
