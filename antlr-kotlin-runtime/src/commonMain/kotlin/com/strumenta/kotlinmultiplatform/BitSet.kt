package com.strumenta.kotlinmultiplatform

expect class BitSet() {
    fun set(bitIndex: Int)
    fun clear(bitIndex: Int)
    fun get(bitIndex: Int): Boolean
    fun cardinality(): Int
    fun nextSetBit(i: Int): Int
    fun or(alts: BitSet)
}
