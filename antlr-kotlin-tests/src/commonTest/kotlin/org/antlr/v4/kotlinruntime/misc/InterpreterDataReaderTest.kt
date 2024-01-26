// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.misc

import com.strumenta.antlrkotlin.runtime.StringLineReader
import com.strumenta.antlrkotlin.util.loadText
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ATNSerializer
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertNull

class InterpreterDataReaderTest {
  @Test
  fun testInterpFile() {
    // Based on the grammar found in org.antlr.v4.test.runtime.java.TestInterpreterDataReader
    val interpContent = "test.interp".loadText()
    val reader = StringLineReader(interpContent)
    val data = InterpreterDataReader.parse(reader)
    val vocabulary = data.vocabulary as VocabularyImpl

    assertEquals(6, vocabulary.maxTokenType)
    assertContentEquals(listOf("s", "expr"), data.ruleNames)
    assertContentEquals(arrayOf("", "", "'*'", "'/'", "'+'", "'-'", ""), vocabulary.literalNames)
    assertContentEquals(arrayOf("", "INT", "MUL", "DIV", "ADD", "SUB", "WS"), vocabulary.symbolicNames)
    assertNull(data.channels)
    assertNull(data.modes)

    val serialized = ATNSerializer.getSerialized(data.atn)
    assertEquals(ATNDeserializer.SERIALIZED_VERSION, serialized[0])
  }
}
