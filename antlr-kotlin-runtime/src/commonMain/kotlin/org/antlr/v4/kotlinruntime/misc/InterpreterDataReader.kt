// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.misc

import com.strumenta.antlrkotlin.runtime.LineReader
import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer

/**
 * A class to read plain text interpreter data produced by ANTLR.
 */
public object InterpreterDataReader {
  public data class InterpreterData(
    public val atn: ATN,
    public val vocabulary: Vocabulary,
    public val ruleNames: List<String>,
    public val channels: List<String>?, // Only valid for lexer grammars
    public val modes: List<String>?, // ditto
  )

  /**
   * The structure of the data file is very simple.
   * Everything is line based with empty lines separating the different parts.
   *
   * For lexers the layout is:
   *
   * ```
   * token literal names:
   * ...
   *
   * token symbolic names:
   * ...
   *
   * rule names:
   * ...
   *
   * channel names:
   * ...
   *
   * mode names:
   * ...
   *
   * atn:
   * <a single line with comma separated int values enclosed in a pair of square brackets>
   * ```
   *
   * Data for a parser does not contain channel and mode names.
   */
  public fun parse(reader: LineReader): InterpreterData {
    var line = reader.readLineOrNull()

    if (line != "token literal names:") {
      throw RuntimeException("Unexpected data entry")
    }

    val literalNames = ArrayList<String>()
    val symbolicNames = ArrayList<String>()
    val ruleNames = ArrayList<String>()

    while (true) {
      line = reader.readLineOrNull()

      if (line.isNullOrEmpty()) {
        break
      }

      literalNames.add(if (line == "null") "" else line)
    }

    line = reader.readLineOrNull()

    if (line != "token symbolic names:") {
      throw RuntimeException("Unexpected data entry")
    }

    while (true) {
      line = reader.readLineOrNull()

      if (line.isNullOrEmpty()) {
        break
      }

      symbolicNames.add(if (line == "null") "" else line)
    }

    val vocabulary = VocabularyImpl(literalNames.toTypedArray(), symbolicNames.toTypedArray())
    line = reader.readLineOrNull()

    if (line != "rule names:") {
      throw RuntimeException("Unexpected data entry")
    }

    while (true) {
      line = reader.readLineOrNull()

      if (line.isNullOrEmpty()) {
        break
      }

      ruleNames.add(line)
    }

    val channels = ArrayList<String>()
    val modes = ArrayList<String>()
    line = reader.readLineOrNull()

    // Additional lexer data
    if (line == "channel names:") {
      while (true) {
        line = reader.readLineOrNull()

        if (line.isNullOrEmpty()) {
          break
        }

        channels.add(line)
      }

      line = reader.readLineOrNull()

      if (line != "mode names:") {
        throw RuntimeException("Unexpected data entry")
      }

      while (true) {
        line = reader.readLineOrNull()

        if (line.isNullOrEmpty()) {
          break
        }

        modes.add(line)
      }
    }

    line = reader.readLineOrNull()

    if (line != "atn:") {
      throw RuntimeException("Unexpected data entry")
    }

    line = reader.readLine()

    val elements = line.substring(1, line.length - 1).split(",")
    val serializedATN = IntArray(elements.size) {
      elements[it].trim().toInt()
    }

    val deserializer = ATNDeserializer()
    val atn = deserializer.deserialize(serializedATN)
    return InterpreterData(
      atn = atn,
      vocabulary = vocabulary,
      ruleNames = ruleNames,
      channels = channels.ifEmpty { null },
      modes = modes.ifEmpty { null },
    )
  }
}
