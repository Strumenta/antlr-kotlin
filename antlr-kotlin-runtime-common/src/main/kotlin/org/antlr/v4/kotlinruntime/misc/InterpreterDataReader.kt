/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer


// A class to read plain text interpreter data produced by ANTLR.
object InterpreterDataReader {

    class InterpreterData {
        internal var atn: ATN? = null
        internal var vocabulary: Vocabulary? = null
        internal var ruleNames: MutableList<String>? = null
        internal var channels: MutableList<String>? = null // Only valid for lexer grammars.
        internal var modes: MutableList<String>? = null // ditto
    }

//    /**
//     * The structure of the data file is very simple. Everything is line based with empty lines
//     * separating the different parts. For lexers the layout is:
//     * token literal names:
//     * ...
//     *
//     * token symbolic names:
//     * ...
//     *
//     * rule names:
//     * ...
//     *
//     * channel names:
//     * ...
//     *
//     * mode names:
//     * ...
//     *
//     * atn:
//     * <a single line with comma separated int values> enclosed in a pair of squared brackets.
//     *
//     * Data for a parser does not contain channel and mode names.
//    </a> */
//    fun parseFile(fileName: String): InterpreterData {
//        val result = InterpreterData()
//        result.ruleNames = ArrayList()
//
//        try {
//            BufferedReader(FileReader(fileName)).use { br ->
//                var line: String
//                val literalNames = ArrayList<String>()
//                val symbolicNames = ArrayList<String>()
//
//                line = br.readLine()
//                if (line != "token literal names:")
//                    throw RuntimeException("Unexpected data entry")
//                while ((line = br.readLine()) != null) {
//                    if (line.isEmpty())
//                        break
//                    literalNames.add(if (line == "null") "" else line)
//                }
//
//                line = br.readLine()
//                if (line != "token symbolic names:")
//                    throw RuntimeException("Unexpected data entry")
//                while ((line = br.readLine()) != null) {
//                    if (line.isEmpty())
//                        break
//                    symbolicNames.add(if (line == "null") "" else line)
//                }
//
//                result.vocabulary = VocabularyImpl(literalNames.toTypedArray<T>(), symbolicNames.toTypedArray<T>())
//
//                line = br.readLine()
//                if (line != "rule names:")
//                    throw RuntimeException("Unexpected data entry")
//                while ((line = br.readLine()) != null) {
//                    if (line.isEmpty())
//                        break
//                    result.ruleNames!!.add(line)
//                }
//
//                if (line == "channel names:") { // Additional lexer data.
//                    result.channels = ArrayList()
//                    while ((line = br.readLine()) != null) {
//                        if (line.isEmpty())
//                            break
//                        result.channels!!.add(line)
//                    }
//
//                    line = br.readLine()
//                    if (line != "mode names:")
//                        throw RuntimeException("Unexpected data entry")
//                    result.modes = ArrayList()
//                    while ((line = br.readLine()) != null) {
//                        if (line.isEmpty())
//                            break
//                        result.modes!!.add(line)
//                    }
//                }
//
//                line = br.readLine()
//                if (line != "atn:")
//                    throw RuntimeException("Unexpected data entry")
//                line = br.readLine()
//                val elements = line.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
//                val serializedATN = CharArray(elements.size)
//
//                for (i in elements.indices) {
//                    val value: Int
//                    val element = elements[i]
//                    if (element.startsWith("["))
//                        value = Integer.parseInt(element.substring(1).trim { it <= ' ' })
//                    else if (element.endsWith("]"))
//                        value = Integer.parseInt(element.substring(0, element.length - 1).trim { it <= ' ' })
//                    else
//                        value = Integer.parseInt(element.trim { it <= ' ' })
//                    serializedATN[i] = value.toChar()
//                }
//
//                val deserializer = ATNDeserializer()
//                result.atn = deserializer.deserialize(serializedATN)
//            }
//        } catch (e: java.io.IOException) {
//            // We just swallow the error and return empty objects instead.
//        }
//
//        return result
//    }

}
