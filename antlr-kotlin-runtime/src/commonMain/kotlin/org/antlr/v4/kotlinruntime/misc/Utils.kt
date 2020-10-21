/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

import com.strumenta.kotlinmultiplatform.BitSet
import com.strumenta.kotlinmultiplatform.asCharArray

object Utils {

    fun numNonnull(data: Array<Any?>?): Int {
        var n = 0
        if (data == null) return n
        for (o in data) {
            if (o != null) n++
        }
        return n
    }

    fun <T> removeAllElements(data: MutableCollection<T>?, value: T) {
        if (data == null) return
        while (data.contains(value)) data.remove(value)
    }

    fun escapeWhitespace(s: String, escapeSpaces: Boolean): String {
        val buf = StringBuilder()
        for (c in s.asCharArray()) {
            if (c == ' ' && escapeSpaces)
                buf.append('\u00B7')
            else if (c == '\t')
                buf.append("\\t")
            else if (c == '\n')
                buf.append("\\n")
            else if (c == '\r')
                buf.append("\\r")
            else
                buf.append(c)
        }
        return buf.toString()
    }

    suspend fun readFile(fileName: String): CharArray {
        return Platform.readFile(fileName).asCharArray()
    }

    /** Convert array of strings to stringindex map. Useful for
     * converting rulenames to nameruleindex map.
     */
    fun toMap(keys: Array<String>): Map<String, Int> {
        val m = HashMap<String, Int>()
        for (i in keys.indices) {
            m[keys[i]] = i
        }
        return m
    }

    fun toCharArray(data: IntegerList?): CharArray? {
        return data?.toCharArray()
    }

    fun toSet(bits: BitSet): IntervalSet {
        val s = IntervalSet()
        var i = bits.nextSetBit(0)
        while (i >= 0) {
            s.add(i)
            i = bits.nextSetBit(i + 1)
        }
        return s
    }

    /** @since 4.6
     */
    fun expandTabs(s: String?, tabSize: Int): String? {
        if (s == null) return null
        val buf = StringBuilder()
        var col = 0
        for (element in s) {
            when (element) {
                '\n' -> {
                    col = 0
                    buf.append(element)
                }
                '\t' -> {
                    val n = tabSize - col % tabSize
                    col += n
                    buf.append(spaces(n))
                }
                else -> {
                    col++
                    buf.append(element)
                }
            }
        }
        return buf.toString()
    }

    /** @since 4.6
     */
    fun spaces(n: Int): String {
        return sequence(n, " ")
    }

    /** @since 4.6
     */
    fun newlines(n: Int): String {
        return sequence(n, "\n")
    }

    /** @since 4.6
     */
    fun sequence(n: Int, s: String): String {
        val buf = StringBuilder()
        for (sp in 1..n) buf.append(s)
        return buf.toString()
    }

    /** @since 4.6
     */
    fun count(s: String, x: Char): Int {
        var n = 0
        for (element in s) {
            if (element == x) {
                n++
            }
        }
        return n
    }
}
