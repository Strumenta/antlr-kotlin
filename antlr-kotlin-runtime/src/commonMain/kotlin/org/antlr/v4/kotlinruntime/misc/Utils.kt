/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

import com.strumenta.kotlinmultiplatform.BitSet
import com.strumenta.kotlinmultiplatform.toCharArray

object Utils {
    // Seriously: why isn't this built in to java? ugh!
    fun <T> join(iter: Iterator<T>, separator: String): String {
        val buf = StringBuilder()
        while (iter.hasNext()) {
            buf.append(iter.next())
            if (iter.hasNext()) {
                buf.append(separator)
            }
        }
        return buf.toString()
    }

    fun <T> join(array: Array<T>, separator: String): String {
        val builder = StringBuilder()
        for (i in array.indices) {
            builder.append(array[i])
            if (i < array.size - 1) {
                builder.append(separator)
            }
        }

        return builder.toString()
    }

    fun numNonnull(data: Array<Any>?): Int {
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
        for (c in s.toCharArray()) {
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

//    fun writeFile(fileName: String, content: String, encoding: String? = null) {
//        val f = File(fileName)
//        val fos = FileOutputStream(f)
//        val osw: OutputStreamWriter
//        if (encoding != null) {
//            osw = OutputStreamWriter(fos, encoding)
//        } else {
//            osw = OutputStreamWriter(fos)
//        }
//
//        try {
//            osw.write(content)
//        } finally {
//            osw.close()
//        }
//    }
//
//    fun readFile(fileName: String, encoding: String? = null): CharArray {
//        val f = File(fileName)
//        val size = f.length().toInt()
//        val isr: InputStreamReader
//        val fis = FileInputStream(fileName)
//        if (encoding != null) {
//            isr = InputStreamReader(fis, encoding)
//        } else {
//            isr = InputStreamReader(fis)
//        }
//        var data: CharArray? = null
//        try {
//            data = CharArray(size)
//            val n = isr.read(data)
//            if (n < data.size) {
//                data = Arrays.copyOf(data, n)
//            }
//        } finally {
//            isr.close()
//        }
//        return data
//    }

    /** Convert array of strings to stringindex map. Useful for
     * converting rulenames to nameruleindex map.
     */
    fun toMap(keys: Array<String>): Map<String, Int> {
        val m = HashMap<String, Int>()
        for (i in keys.indices) {
            m.put(keys[i], i)
        }
        return m
    }

    fun toCharArray(data: IntegerList?): CharArray? {
        return if (data == null) null else data!!.toCharArray()
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
        for (i in 0 until s.length) {
            val c = s[i]
            when (c) {
                '\n' -> {
                    col = 0
                    buf.append(c)
                }
                '\t' -> {
                    val n = tabSize - col % tabSize
                    col += n
                    buf.append(spaces(n))
                }
                else -> {
                    col++
                    buf.append(c)
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
        for (i in 0 until s.length) {
            if (s[i] == x) {
                n++
            }
        }
        return n
    }
}
