/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

/**
 *
 * @author Sam Harwell
 */
object MurmurHash {

    private val DEFAULT_SEED = 0

    /**
     * Initialize the hash using the specified `seed`.
     *
     * @param seed the seed
     * @return the intermediate hash value
     */
    fun initialize(seed: Int = DEFAULT_SEED): Int {
        return seed
    }

    /**
     * Update the intermediate hash value for the next input `value`.
     *
     * @param hash the intermediate hash value
     * @param value the value to add to the current hash
     * @return the updated intermediate hash value
     */
    fun update(hash: Int, value: Int): Int {
        var hash = hash
        val c1 = -0x3361d2af
        val c2 = 0x1B873593
        val r1 = 15
        val r2 = 13
        val m = 5
        val n = -0x19ab949c

        var k = value
        k = k * c1
        k = k shl r1 or k.ushr(32 - r1)
        k = k * c2

        hash = hash xor k
        hash = hash shl r2 or hash.ushr(32 - r2)
        hash = hash * m + n

        return hash
    }

    /**
     * Update the intermediate hash value for the next input `value`.
     *
     * @param hash the intermediate hash value
     * @param value the value to add to the current hash
     * @return the updated intermediate hash value
     */
    fun update(hash: Int, value: Any?): Int {
        return update(hash, value?.hashCode() ?: 0)
    }

    /**
     * Apply the final computation steps to the intermediate value `hash`
     * to form the final result of the MurmurHash 3 hash function.
     *
     * @param hash the intermediate hash value
     * @param numberOfWords the number of integer values added to the hash
     * @return the final hash result
     */
    fun finish(hash: Int, numberOfWords: Int): Int {
        var hash = hash
        hash = hash xor numberOfWords * 4
        hash = hash xor hash.ushr(16)
        hash = hash * -0x7a143595
        hash = hash xor hash.ushr(13)
        hash = hash * -0x3d4d51cb
        hash = hash xor hash.ushr(16)
        return hash
    }

    /**
     * Utility function to compute the hash code of an array using the
     * MurmurHash algorithm.
     *
     * @param <T> the array element type
     * @param data the array data
     * @param seed the seed for the MurmurHash algorithm
     * @return the hash code of the data
    </T> */
    fun <T> hashCode(data: Array<T>, seed: Int): Int {
        var hash = initialize(seed)
        for (value in data) {
            hash = update(hash, value)
        }

        hash = finish(hash, data.size)
        return hash
    }
}
/**
 * Initialize the hash using the default seed value.
 *
 * @return the intermediate hash value
 */
