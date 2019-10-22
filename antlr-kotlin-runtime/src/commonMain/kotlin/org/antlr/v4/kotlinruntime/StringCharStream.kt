package org.antlr.v4.kotlinruntime

import com.strumenta.kotlinmultiplatform.Math
import com.strumenta.kotlinmultiplatform.assert
import org.antlr.v4.kotlinruntime.misc.Interval

internal fun String.codePointIndices(): IntArray {
    return (0 until length).mapNotNull { index ->
        if (hasSurrogatePairAt(index - 1)) {
            null
        } else {
            index
        }
    }.toIntArray()
}

private fun toCodePoint(high: Char, low: Char): Int {
    return high.toInt().shl(10) + low.toInt() + -56613888
}

class StringCharStream(
        private val source: String,
        override val sourceName: String
) : CharStream {
    private val codePointIndices = source.codePointIndices()
    private val size = codePointIndices.size
    private var position: Int = 0

    private fun codePoint(index: Int): Int {
        return if (index in 0 until size) {
            val char = source[codePointIndices[index]]
            if (char.isHighSurrogate()) {
                if (index + 1 in 0 until size) {
                    val low = source[codePointIndices[index] + 1]
                    toCodePoint(char, low)
                } else {
                    IntStream.EOF
                }
            } else {
                char.toInt()
            }
        } else {
            IntStream.EOF
        }
    }

    override fun consume() {
        if (size - position == 0) {
            assert(LA(1) == IntStream.EOF)
            throw IllegalStateException("cannot consume EOF")
        }
        position += 1
    }

    override fun index(): Int {
        return position
    }

    override fun size(): Int {
        return size
    }

    /** mark/release do nothing; we have entire buffer  */
    override fun mark(): Int {
        return -1
    }

    override fun release(marker: Int) {
    }

    override fun seek(index: Int) {
        position = index
    }

    override fun toString(): String {
        return getText(Interval.of(0, size - 1))
    }

    override fun getText(interval: Interval): String {
        val startIndex = Math.min(interval.a, size)
        val endIndex = Math.min(interval.b, size)
        return source.substring(codePointIndices[startIndex], codePointIndices[endIndex] + 1)
    }

    override fun LA(i: Int): Int {
        return when {
            i < 0 -> codePoint(position + i)
            i > 0 -> codePoint(position + i - 1)
            else ->
                // Undefined
                return 0
        }
    }
}
