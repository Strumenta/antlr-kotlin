// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import kotlin.test.*

/**
 * Basic behavioral testing for [BitSet] to ensure consistency across platforms.
 */
class BitSetTest {
  @Test
  fun set() {
    val bitSet = BitSet()
    bitSet.set(0)
    bitSet.set(3)
    bitSet.set(4)
    bitSet.set(8)

    assertTrue(bitSet.get(0))
    assertFalse(bitSet.get(1))
    assertFalse(bitSet.get(2))
    assertTrue(bitSet.get(3))
    assertTrue(bitSet.get(4))
    assertFalse(bitSet.get(5))
    assertFalse(bitSet.get(6))
    assertFalse(bitSet.get(7))
    assertTrue(bitSet.get(8))

    // Try an out-of-bounds index
    assertFalse(bitSet.get(9))
  }

  @Test
  fun clear() {
    val bitSet = BitSet()
    assertFalse(bitSet.get(0))

    bitSet.set(0)
    bitSet.set(5)
    assertTrue(bitSet.get(0))
    assertTrue(bitSet.get(5))

    bitSet.clear(0)
    assertFalse(bitSet.get(0))
    assertTrue(bitSet.get(5))
  }

  @Test
  fun cardinality() {
    val bitSet = BitSet()
    bitSet.set(1)
    bitSet.set(10)
    bitSet.set(15)
    bitSet.set(16)

    bitSet.clear(10)
    assertEquals(3, bitSet.cardinality())
  }

  @Test
  fun nextSetBit() {
    val bitSet = BitSet()

    bitSet.set(5)
    assertEquals(5, bitSet.nextSetBit(0))
    assertEquals(5, bitSet.nextSetBit(5))

    bitSet.set(50)
    assertEquals(50, bitSet.nextSetBit(6))
  }

  @Test
  fun or() {
    val bitSet = BitSet()
    bitSet.set(0)
    bitSet.set(1)
    bitSet.set(5)
    bitSet.set(8)

    val otherBitSet = BitSet()
    otherBitSet.set(6)
    otherBitSet.set(10)

    bitSet.or(otherBitSet)
    assertTrue(bitSet.get(0))
    assertTrue(bitSet.get(1))
    assertFalse(bitSet.get(2))
    assertFalse(bitSet.get(3))
    assertFalse(bitSet.get(4))
    assertTrue(bitSet.get(5))
    assertTrue(bitSet.get(6))
    assertFalse(bitSet.get(7))
    assertTrue(bitSet.get(8))
    assertFalse(bitSet.get(9))
    assertTrue(bitSet.get(10))

    // Try a couple out-of-bounds indexes
    assertFalse(bitSet.get(11))
    assertFalse(bitSet.get(20))
  }

  @Test
  fun throwsOnNegativeIndex() {
    val bitSet = BitSet()

    assertFailsWith<IndexOutOfBoundsException> {
      bitSet.set(-1)
    }

    assertFailsWith<IndexOutOfBoundsException> {
      bitSet.get(-4)
    }

    assertFailsWith<IndexOutOfBoundsException> {
      bitSet.clear(-2)
    }

    assertFailsWith<IndexOutOfBoundsException> {
      bitSet.nextSetBit(-1)
    }
  }

  @Test
  fun equalsToOther() {
    val bitSet1 = BitSet()
    bitSet1.set(0)
    bitSet1.set(10)
    bitSet1.set(15)

    val bitSet2 = BitSet()
    bitSet2.set(0)
    bitSet2.set(10)
    bitSet2.set(15)

    assertEquals(bitSet1, bitSet1)
    assertEquals(bitSet1, bitSet2)
    assertEquals(bitSet1.hashCode(), bitSet2.hashCode())
  }

  @Test
  fun notEqualsToOther() {
    val bitSet1 = BitSet()
    bitSet1.set(2)
    bitSet1.set(5)

    val bitSet2 = BitSet()
    bitSet2.set(2)
    bitSet2.set(5)

    assertEquals(bitSet1, bitSet2)
    assertEquals(bitSet1.hashCode(), bitSet2.hashCode())

    bitSet2.clear(2)

    assertNotEquals(bitSet1, bitSet2)
    assertNotEquals(bitSet1.hashCode(), bitSet2.hashCode())
  }

  @Test
  fun hashCodeDoesNotChange() {
    val bitSet = BitSet()
    bitSet.set(2)
    bitSet.set(5)
    bitSet.set(35)
    bitSet.set(0)

    assertEquals(bitSet.hashCode(), bitSet.hashCode())
  }
}
