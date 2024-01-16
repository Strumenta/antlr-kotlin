// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import kotlin.math.min

/**
 * A vector of bits growing if necessary and allowing one
 * to set/clear/read bits from it by a bit index.
 *
 * Note(Edoardo): this is a cleaned up version of the Kotlin Native BitSet,
 *  copied because of [KT-57088](https://youtrack.jetbrains.com/issue/KT-57088)
 *
 * @constructor Creates an empty bit set with the specified [size]
 * @param size The size of one element in the array used to store bits
 */
public class SimpleBitSet(size: Int) {
  private companion object {
    // Default size of one element in the array used to store bits.
    private const val ELEMENT_SIZE: Int = 64
    private const val MAX_BIT_OFFSET: Int = ELEMENT_SIZE - 1
    private const val ALL_TRUE: Long = -1L // 0xFFFF_FFFF_FFFF_FFFF
    private const val ALL_FALSE: Long = 0L // 0x0000_0000_0000_0000
  }

  private var bits: LongArray = LongArray(bitToElementSize(size))

  private val lastIndex: Int
    get() = size - 1

  // Transforms a bit index into an element index in the `bits` array.
  private val Int.elementIndex: Int
    get() = this / ELEMENT_SIZE

  // Transforms a bit index in the set into a bit in the element of the `bits` array.
  private val Int.bitOffset: Int
    get() = this % ELEMENT_SIZE

  // Transforms a bit index in the set into pair of a `bits` element index and a bit index in the element.
  private val Int.asBitCoordinates: Pair<Int, Int>
    get() = Pair(elementIndex, bitOffset)

  // Transforms a bit offset to the mask with only bit set corresponding to the offset.
  private val Int.asMask: Long
    get() = 0x1L shl this

  // Transforms a bit offset to the mask with only bits before the index (inclusive) set.
  private val Int.asMaskBefore: Long
    get() = getMaskBetween(0, this)

  // Transforms a bit offset to the mask with only bits after the index (inclusive) set.
  private val Int.asMaskAfter: Long
    get() = getMaskBetween(this, MAX_BIT_OFFSET)

  /**
   * Returns an index of the last bit that has `true` value.
   *
   * Returns `-1` if the bit set is empty.
   */
  public val lastTrueIndex: Int
    get() = previousSetBit(size)

  /**
   * Is `true` if this bit set contains no bits set to `true`.
   */
  public val isEmpty: Boolean
    get() = bits.all { it == ALL_FALSE }

  /**
   * Actual number of bits available in this bit set.
   *
   * All bits with indices >= [size] assumed to be `0`.
   */
  public var size: Int = size
    private set

  /**
   * Creates a bit set of the default [ELEMENT_SIZE] length.
   */
  public constructor() : this(ELEMENT_SIZE)

  /**
   * Creates a bit set of given [length] filling elements using [initializer].
   */
  public constructor(length: Int, initializer: (Int) -> Boolean) : this(length) {
    for (i in 0..<length) {
      set(i, initializer(i))
    }
  }

  // Builds a masks with 1 between fromOffset and toOffset (both inclusive).
  private fun getMaskBetween(fromOffset: Int, toOffset: Int): Long {
    var res = 0L
    val maskToAdd = fromOffset.asMask

    for (i in fromOffset..toOffset) {
      res = (res shl 1) or maskToAdd
    }

    return res
  }

  // Transforms a size in bits to a size in elements of the `bits` array.
  private fun bitToElementSize(bitSize: Int): Int =
    (bitSize + ELEMENT_SIZE - 1) / ELEMENT_SIZE

  // Transforms a pair of an element index and a bit offset to a bit index.
  private fun bitIndex(elementIndex: Int, bitOffset: Int) =
    elementIndex * ELEMENT_SIZE + bitOffset

  // Internal function. Sets bits specified by the element index and the given mask to value.
  private fun setBitsWithMask(elementIndex: Int, mask: Long, value: Boolean) {
    val element = bits[elementIndex]

    if (value) {
      bits[elementIndex] = element or mask
    } else {
      bits[elementIndex] = element and mask.inv()
    }
  }

  // Internal function. Flips bits specified by the element index and the given mask.
  private fun flipBitsWithMask(elementIndex: Int, mask: Long) {
    val element = bits[elementIndex]
    bits[elementIndex] = element xor mask
  }

  /**
   * Checks if [bitIndex] is valid, and extends the `bits` array if the index exceeds its size.
   *
   * @throws [IndexOutOfBoundsException] If [bitIndex] `< 0`
   */
  private fun ensureCapacity(bitIndex: Int) {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    if (bitIndex >= size) {
      size = bitIndex + 1

      if (bitIndex.elementIndex >= bits.size) {
        // Create a new array containing the index-th bit
        bits = bits.copyOf(bitToElementSize(bitIndex + 1))
      }
    }
  }

  /**
   * Sets the bit at the specified [bitIndex] to `true`.
   */
  public fun set(bitIndex: Int): Unit =
    set(bitIndex, true)

  /**
   * Sets the bit at the specified [bitIndex] to the specified [value].
   */
  public fun set(bitIndex: Int, value: Boolean) {
    ensureCapacity(bitIndex)
    val (elementIndex, offset) = bitIndex.asBitCoordinates
    setBitsWithMask(elementIndex, offset.asMask, value)
  }

  /**
   * Sets the bits at indices between [from] (inclusive) and [to] (exclusive)
   * to the specified [value].
   */
  public fun set(from: Int, to: Int, value: Boolean = true): Unit =
    set(from..<to, value)

  /**
   * Sets the bits in the specified index [range] to the specified [value].
   */
  public fun set(range: IntRange, value: Boolean = true) {
    if (range.first < 0 || range.last < 0) {
      throw IndexOutOfBoundsException("range bounds < 0: $range")
    }

    if (range.first > range.last) {
      // Empty range
      return
    }

    ensureCapacity(range.last)

    val (fromIndex, fromOffset) = range.first.asBitCoordinates
    val (toIndex, toOffset) = range.last.asBitCoordinates

    if (toIndex == fromIndex) {
      val mask = getMaskBetween(fromOffset, toOffset)
      setBitsWithMask(fromIndex, mask, value)
    } else {
      // Set bits in the first element
      setBitsWithMask(fromIndex, fromOffset.asMaskAfter, value)

      // Set all bits of all elements (excluding border ones) to 0 or 1 depending
      for (index in fromIndex + 1..<toIndex) {
        bits[index] = if (value) ALL_TRUE else ALL_FALSE
      }

      // Set bits in the last element
      setBitsWithMask(toIndex, toOffset.asMaskBefore, value)
    }
  }

  /**
   * Clears the bit at the specified [bitIndex].
   */
  public fun clear(bitIndex: Int): Unit =
    set(bitIndex, false)

  /**
   * Clears the bits with indices between [from] (inclusive) and [to] (exclusive).
   */
  public fun clear(from: Int, to: Int): Unit =
    set(from, to, false)

  /**
   * Clears the bits in the specified [range].
   */
  public fun clear(range: IntRange): Unit =
    set(range, false)

  /**
   * Sets all bits in the bit set to `false`.
   */
  public fun clear() {
    for (i in bits.indices) {
      bits[i] = ALL_FALSE
    }
  }

  /**
   * Reverses the bit specified by [bitIndex].
   */
  public fun flip(bitIndex: Int) {
    ensureCapacity(bitIndex)
    val (elementIndex, offset) = bitIndex.asBitCoordinates
    flipBitsWithMask(elementIndex, offset.asMask)
  }

  /**
   * Reverses the bits with indices between [from] (inclusive) and [to] (exclusive).
   */
  public fun flip(from: Int, to: Int): Unit =
    flip(from..<to)

  /**
   * Reverses the bits in the specified index [range] (both inclusive).
   */
  @Suppress("MemberVisibilityCanBePrivate")
  public fun flip(range: IntRange) {
    if (range.first < 0 || range.last < 0) {
      throw IndexOutOfBoundsException("range bounds < 0: $range")
    }

    if (range.first > range.last) {
      // Empty range
      return
    }

    ensureCapacity(range.last)

    val (fromIndex, fromOffset) = range.first.asBitCoordinates
    val (toIndex, toOffset) = range.last.asBitCoordinates

    if (toIndex == fromIndex) {
      val mask = getMaskBetween(fromOffset, toOffset)
      flipBitsWithMask(fromIndex, mask)
    } else {
      // Flip bits in the first element
      flipBitsWithMask(toIndex, toOffset.asMaskAfter)

      // Flip bits between the first and the last elements
      for (index in fromIndex + 1..<toIndex) {
        bits[index] = bits[index].inv()
      }

      // Flip bits in the last element
      flipBitsWithMask(toIndex, toOffset.asMaskBefore)
    }
  }

  /**
   * Returns an index of a next set (if [lookFor] == true) or clear
   * (if [lookFor] == false) bit after [startIndex] (inclusive).
   *
   * Returns `-1` (for [lookFor] == true) or [size] (for lookFor == false)
   * if there is no such bits between [startIndex] and [size] `- 1`.
   *
   * @throws IndexOutOfBoundsException If [startIndex] `< 0`
   */
  private fun nextBit(startIndex: Int, lookFor: Boolean): Int {
    if (startIndex < 0) {
      throw IndexOutOfBoundsException("startIndex < 0: $startIndex")
    }

    if (startIndex >= size) {
      return if (lookFor) {
        -1
      } else {
        startIndex
      }
    }

    val (startElementIndex, startOffset) = startIndex.asBitCoordinates

    // Look for the next set bit in the first element
    var element = bits[startElementIndex]

    for (offset in startOffset..MAX_BIT_OFFSET) {
      val bit = element and (0x1L shl offset) != 0L

      if (bit == lookFor) {
        // Look for not 0 if we need a set bit and look for 0 otherwise
        return bitIndex(startElementIndex, offset)
      }
    }

    // Look for in the remaining elements
    for (index in startElementIndex + 1..bits.lastIndex) {
      element = bits[index]

      for (offset in 0..MAX_BIT_OFFSET) {
        val bit = element and (0x1L shl offset) != 0L

        if (bit == lookFor) {
          // Look for not 0 if we need a set bit and look for 0 otherwise
          return bitIndex(index, offset)
        }
      }
    }

    return if (lookFor) -1 else size
  }

  /**
   * Returns an index of a next bit which value is `true` after [startIndex] (inclusive).
   *
   * Returns `-1` if there is no such bits after [startIndex].
   *
   * @throws IndexOutOfBoundsException If [startIndex] `< 0`
   */
  @Suppress("MemberVisibilityCanBePrivate")
  public fun nextSetBit(startIndex: Int): Int =
    nextBit(startIndex, true)

  /**
   * Returns an index of a next bit which value is `false` after [startIndex] (inclusive).
   *
   * Returns [size] if there is no such bits between [startIndex] and [size] `- 1`
   * assuming that the set has an infinite sequence of `false` bits after `(size - 1)-th`.
   *
   * @throws IndexOutOfBoundsException If [startIndex] `< 0`
   */
  public fun nextClearBit(startIndex: Int): Int =
    nextBit(startIndex, false)

  /**
   * Returns the biggest index of a bit which value is [lookFor] before [startIndex] (inclusive).
   *
   * Returns `-1` if there is no such bits before [startIndex], or if [startIndex] >= [size].
   */
  @Suppress("MemberVisibilityCanBePrivate")
  public fun previousBit(startIndex: Int, lookFor: Boolean): Int {
    var correctStartIndex = startIndex

    if (startIndex >= size) {
      // We assume that all bits after `size - 1` are 0.
      // So we can return the start index if we are looking for 0
      if (!lookFor) {
        return startIndex
      }

      // If we are looking for 1 we can skip all these 0 after `size - 1`
      correctStartIndex = size - 1
    }

    if (correctStartIndex < -1) {
      throw IndexOutOfBoundsException("startIndex < -1: $startIndex")
    }

    if (correctStartIndex == -1) {
      return -1
    }

    val (startElementIndex, startOffset) = correctStartIndex.asBitCoordinates

    // Look for the next set bit in the first element
    var element = bits[startElementIndex]

    for (offset in startOffset downTo 0) {
      val bit = element and (0x1L shl offset) != 0L

      if (bit == lookFor) {
        // Look for not 0 if we need a set bit and look for 0 otherwise
        return bitIndex(startElementIndex, offset)
      }
    }

    // Look for in the remaining elements
    for (index in startElementIndex - 1 downTo 0) {
      element = bits[index]

      for (offset in MAX_BIT_OFFSET downTo 0) {
        val bit = element and (0x1L shl offset) != 0L

        if (bit == lookFor) {
          // Look for not 0 if we need a set bit and look for 0 otherwise
          return bitIndex(index, offset)
        }
      }
    }

    return -1
  }

  /**
   * Returns the biggest index of a bit which value is `true` before [startIndex] (inclusive).
   *
   * Returns `-1` if there is no such bits before [startIndex] or if [startIndex] `== -1`.
   *
   * If [startIndex] >= [size], will search from `(size - 1)-th` bit.
   *
   * @throws IndexOutOfBoundsException If [startIndex] < `-1`
   */
  @Suppress("MemberVisibilityCanBePrivate")
  public fun previousSetBit(startIndex: Int): Int =
    previousBit(startIndex, true)

  /**
   * Returns the biggest index of a bit which value is `false` before [startIndex] (inclusive).
   *
   * Returns `-1` if there is no such bits before [startIndex] or if [startIndex] `== -1`.
   *
   * If [startIndex] >= [size], will return [startIndex] assuming that
   * the set has an infinite sequence of `false` bits after `(size - 1)-th`.
   *
   * @throws IndexOutOfBoundsException If [startIndex] `< -1`
   */
  public fun previousClearBit(startIndex: Int): Int =
    previousBit(startIndex, false)

  /**
   * Returns the value of the bit at the specified [bitIndex].
   */
  public operator fun get(bitIndex: Int): Boolean {
    if (bitIndex < 0) {
      throw IndexOutOfBoundsException("bitIndex < 0: $bitIndex")
    }

    if (bitIndex >= size) {
      return false
    }

    val (elementIndex, offset) = bitIndex.asBitCoordinates
    return bits[elementIndex] and offset.asMask != 0L
  }

  private inline fun doOperation(another: SimpleBitSet, operation: Long.(Long) -> Long) {
    ensureCapacity(another.lastIndex)
    var index = 0

    while (index < another.bits.size) {
      bits[index] = operation(bits[index], another.bits[index])
      index++
    }

    while (index < bits.size) {
      bits[index] = operation(bits[index], ALL_FALSE)
      index++
    }
  }

  /**
   * Performs a logical `and` operation over corresponding bits
   * of this and [another] bit sets.
   *
   * The result is saved in this bit set.
   */
  public fun and(another: SimpleBitSet): Unit =
    doOperation(another, Long::and)

  /**
   * Performs a logical `or` operation over corresponding bits
   * of this and [another] bit sets.
   *
   * The result is saved in this bit set.
   */
  public fun or(another: SimpleBitSet): Unit =
    doOperation(another, Long::or)

  /**
   * Performs a logical `xor` operation over corresponding bits
   * of this and [another] bit sets.
   *
   * The result is saved in this bit set.
   */
  public fun xor(another: SimpleBitSet): Unit =
    doOperation(another, Long::xor)

  /**
   * Performs a logical `and` + `not` operations over corresponding
   * bits of this and [another] bit sets.
   *
   * The result is saved in this bit set.
   */
  public fun andNot(another: SimpleBitSet) {
    ensureCapacity(another.lastIndex)
    var index = 0

    while (index < another.bits.size) {
      bits[index] = bits[index] and another.bits[index].inv()
      index++
    }

    while (index < bits.size) {
      bits[index] = bits[index] and ALL_TRUE
      index++
    }
  }

  /**
   * Returns `true` if [another] bit set has any bits set to `true`
   * that are also set to `true` in this bit set.
   */
  public fun intersects(another: SimpleBitSet): Boolean {
    val to = min(bits.size, another.bits.size)
    return (0..<to).any { bits[it] and another.bits[it] != 0L }
  }

  /**
   * Returns the number of bits set to `true` in this bit set.
   */
  public fun cardinality(): Int {
    var count = 0

    for (i in 0..<size) {
      if (get(i)) {
        count++
      }
    }

    return count
  }

  override fun toString(): String {
    val sb = StringBuilder()
    var first = true
    sb.append("{")

    var index = nextSetBit(0)

    while (index != -1) {
      if (!first) {
        sb.append(", ")
      } else {
        first = false
      }

      sb.append(index)
      index = nextSetBit(index + 1)
    }

    sb.append("}")
    return sb.toString()
  }

  override fun hashCode(): Int {
    var x = 1234L

    for (i in 0..bits.lastIndex) {
      x = x xor bits[i] * (i + 1)
    }

    return (x shr 32 xor x).toInt()
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) {
      return true
    }

    if (other !is SimpleBitSet) {
      return false
    }

    var index = 0

    while (index < min(bits.size, other.bits.size)) {
      if (bits[index] != other.bits[index]) {
        return false
      }

      index++
    }

    val longestBits = if (bits.size > other.bits.size) {
      bits
    } else {
      other.bits
    }

    while (index < longestBits.size) {
      if (longestBits[index] != ALL_FALSE) {
        return false
      }

      index++
    }

    return true
  }
}
