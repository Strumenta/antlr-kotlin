// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import kotlin.test.Test
import kotlin.test.assertEquals

class CharStreamsTest {
  @Test
  fun testFromString8() {
    val stream = CharStreams.fromString("ab")
    assertEquals(2, stream.size())
    assertEquals(0, stream.index())

    assertEquals(-1, stream.LA(-3))
    assertEquals(-1, stream.LA(-2))
    assertEquals(-1, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(97, stream.LA(1))
    assertEquals(98, stream.LA(2))
    assertEquals(-1, stream.LA(3))

    stream.consume()

    assertEquals(1, stream.index())

    assertEquals(-1, stream.LA(-3))
    assertEquals(-1, stream.LA(-2))
    assertEquals(97, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(98, stream.LA(1))
    assertEquals(-1, stream.LA(2))
    assertEquals(-1, stream.LA(3))

    stream.consume()

    assertEquals(2, stream.index())

    assertEquals(-1, stream.LA(-3))
    assertEquals(97, stream.LA(-2))
    assertEquals(98, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(-1, stream.LA(1))
    assertEquals(-1, stream.LA(2))
    assertEquals(-1, stream.LA(3))
  }

  @Test
  fun testFromString16() {
    val stream = CharStreams.fromString("aΔ")
    assertEquals(2, stream.size())
    assertEquals(0, stream.index())

    assertEquals(-1, stream.LA(-3))
    assertEquals(-1, stream.LA(-2))
    assertEquals(-1, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(97, stream.LA(1))
    assertEquals(916, stream.LA(2))
    assertEquals(-1, stream.LA(3))

    stream.consume()

    assertEquals(1, stream.index())

    assertEquals(-1, stream.LA(-3))
    assertEquals(-1, stream.LA(-2))
    assertEquals(97, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(916, stream.LA(1))
    assertEquals(-1, stream.LA(2))
    assertEquals(-1, stream.LA(3))

    stream.consume()

    assertEquals(2, stream.index())

    assertEquals(-1, stream.LA(-3))
    assertEquals(97, stream.LA(-2))
    assertEquals(916, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(-1, stream.LA(1))
    assertEquals(-1, stream.LA(2))
    assertEquals(-1, stream.LA(3))
  }

  @Test
  fun testFromString32() {
    /**
     * 😱 is encoded as:
     * UTF-8:	0xF0 0x9F 0x98 0xB1
     * UTF-16:	0xD83D 0xDE31
     * UTF-32:	0x0001F631
     */
    val stream = CharStreams.fromString("a😱b")
    assertEquals(3, stream.size())
    assertEquals(0, stream.index())

    assertEquals(-1, stream.LA(-4))
    assertEquals(-1, stream.LA(-3))
    assertEquals(-1, stream.LA(-2))
    assertEquals(-1, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(97, stream.LA(1))
    assertEquals(0x1F631, stream.LA(2))
    assertEquals(98, stream.LA(3))
    assertEquals(-1, stream.LA(4))

    stream.consume()

    assertEquals(1, stream.index())

    assertEquals(-1, stream.LA(-4))
    assertEquals(-1, stream.LA(-3))
    assertEquals(-1, stream.LA(-2))
    assertEquals(97, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(0x1F631, stream.LA(1))
    assertEquals(98, stream.LA(2))
    assertEquals(-1, stream.LA(3))
    assertEquals(-1, stream.LA(4))

    stream.consume()

    assertEquals(2, stream.index())

    assertEquals(-1, stream.LA(-4))
    assertEquals(-1, stream.LA(-3))
    assertEquals(97, stream.LA(-2))
    assertEquals(0x1F631, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(98, stream.LA(1))
    assertEquals(-1, stream.LA(2))
    assertEquals(-1, stream.LA(3))
    assertEquals(-1, stream.LA(4))

    stream.consume()

    assertEquals(3, stream.index())

    assertEquals(-1, stream.LA(-4))
    assertEquals(97, stream.LA(-3))
    assertEquals(0x1F631, stream.LA(-2))
    assertEquals(98, stream.LA(-1))
    assertEquals(0, stream.LA(0))
    assertEquals(-1, stream.LA(1))
    assertEquals(-1, stream.LA(2))
    assertEquals(-1, stream.LA(3))
    assertEquals(-1, stream.LA(4))
  }
}
