package com.strumenta.kotlinmultiplatform

expect class BitSet() {
  /**
   * Sets the bit at the specified index to `true`.
   *
   * @param bitIndex A bit index
   * @throws IndexOutOfBoundsException If the specified index is negative
   */
  fun set(bitIndex: Int)

  /**
   * Sets the bit specified by the index to `false`.
   *
   * @param bitIndex The index of the bit to be cleared
   * @throws IndexOutOfBoundsException If the specified index is negative
   */
  fun clear(bitIndex: Int)

  /**
   * Returns the value of the bit with the specified index. The value
   * is `true` if the bit with the index `bitIndex` is currently set
   * in this `BitSet`, otherwise the result is `false`.
   *
   * @param bitIndex The bit index
   * @return The value of the bit with the specified index
   * @throws IndexOutOfBoundsException If the specified index is negative
   */
  fun get(bitIndex: Int): Boolean

  /**
   * Returns the number of bits set to `true` in this `BitSet`.
   */
  fun cardinality(): Int

  /**
   * Returns the index of the first bit that is set to `true`
   * that occurs on or after the specified starting index.
   *
   * If no such bit exists then `-1` is returned.
   *
   * @param fromIndex The index to start checking from (inclusive)
   * @return The index of the next set bit, or `-1` if there is no such bit
   * @throws IndexOutOfBoundsException If the specified index is negative
   */
  fun nextSetBit(fromIndex: Int): Int

  /**
   * Performs a logical **OR** of this bit set with the bit set argument.
   *
   * This bit set is modified so that a bit in it has the value `true`
   * if and only if it either already had the value `true` or the
   * corresponding bit in the bit set argument has the value `true`.
   *
   * @param otherBitSet The other `BitSet`
   */
  fun or(otherBitSet: BitSet)
}
