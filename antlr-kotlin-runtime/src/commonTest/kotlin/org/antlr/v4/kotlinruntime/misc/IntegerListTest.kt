// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.misc

import kotlin.test.Test
import kotlin.test.assertEquals

class IntegerListTest {
  @Test
  fun addToIntegerList() {
    val il = IntegerList()
    il.add(10)

    assertEquals(1, il.size())
    assertEquals(10, il[0])
  }

  @Test
  fun removeAtIntegerList() {
    val il = IntegerList()
    il.add(10)
    il.add(12)
    il.add(14)
    il.add(16)
    il.removeAt(2)

    assertEquals(3, il.size())
    assertEquals(10, il[0])
    assertEquals(12, il[1])
    assertEquals(16, il[2])
  }
}
