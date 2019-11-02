package org.antlr.v4.kotlinruntime

import kotlin.jvm.JvmOverloads

abstract class AbstractCharStreams {
    /**
     * Creates a [CharStream] given a [String] and the `sourceName`
     * from which it came.
     */
    @JvmOverloads
    fun fromString(s: String, sourceName: String = IntStream.UNKNOWN_SOURCE_NAME): CharStream {
        return StringCharStream(s, sourceName)
    }
}
