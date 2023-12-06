package com.strumenta.kotlinmultiplatform

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
}
