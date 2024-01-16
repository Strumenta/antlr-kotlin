// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.misc

/**
 * @author Sam Harwell
 */
public object MurmurHash {
  private const val DEFAULT_SEED = 0

  /**
   * Initialize the hash using the specified [seed].
   *
   * @param seed The seed
   * @return The intermediate hash value
   */
  public fun initialize(seed: Int = DEFAULT_SEED): Int =
    seed

  /**
   * Update the intermediate hash value for the next input [value].
   *
   * @param hash The intermediate hash value
   * @param value The value to add to the current hash
   * @return The updated intermediate hash value
   */
  public fun update(hash: Int, value: Int): Int {
    var tempHash = hash
    val c1 = 0xCC9E2D51.toInt()
    val c2 = 0x1B873593
    val r1 = 15
    val r2 = 13
    val m = 5
    val n = 0xE6546B64.toInt()

    var k = value
    k *= c1
    k = (k shl r1) or (k ushr (32 - r1))
    k *= c2

    tempHash = tempHash xor k
    tempHash = (tempHash shl r2) or (tempHash ushr (32 - r2))
    tempHash = tempHash * m + n
    return tempHash
  }

  /**
   * Update the intermediate hash value for the next input [value].
   *
   * @param hash The intermediate hash value
   * @param value The value to add to the current hash
   * @return The updated intermediate hash value
   */
  public fun update(hash: Int, value: Any?): Int =
    update(hash, value?.hashCode() ?: 0)

  /**
   * Apply the final computation steps to the intermediate value [hash]
   * to form the final result of the MurmurHash 3 hash function.
   *
   * @param hash The intermediate hash value
   * @param numberOfWords The number of integer values added to the hash
   * @return The final hash result
   */
  public fun finish(hash: Int, numberOfWords: Int): Int {
    var tempHash = hash
    tempHash = tempHash xor numberOfWords * 4
    tempHash = tempHash xor (tempHash ushr 16)
    tempHash *= 0x85EBCA6B.toInt()
    tempHash = tempHash xor (tempHash ushr 13)
    tempHash *= 0xC2B2AE35.toInt()
    tempHash = tempHash xor (tempHash ushr 16)
    return tempHash
  }

  /**
   * Utility function to compute the hash code of an array using the MurmurHash algorithm.
   *
   * @param T The array element type
   * @param data The array data
   * @param seed The seed for the MurmurHash algorithm
   * @return The hash code of the data
   */
  public fun <T> hashCode(data: Array<T>, seed: Int): Int {
    var hash = initialize(seed)

    for (value in data) {
      hash = update(hash, value)
    }

    hash = finish(hash, data.size)
    return hash
  }
}
