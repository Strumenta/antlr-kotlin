package com.strumenta.kotlinmultiplatform

actual class BitSet {

    private val setBits = HashSet<Int>()

    actual constructor()

    actual fun set(bitIndex: Int) {
        if (bitIndex < 0) throw IllegalArgumentException()
        setBits.add(bitIndex)
    }
    actual fun clear(bitIndex: Int) {
        if (bitIndex < 0) throw IllegalArgumentException()
        setBits.remove(bitIndex)
    }
    actual fun get(bitIndex: Int): Boolean {
        if (bitIndex < 0) throw IllegalArgumentException()
        return setBits.contains(bitIndex)
    }

    actual fun cardinality(): Int {
        return setBits.size
    }

    actual fun nextSetBit(i: Int): Int {
        val nextSetBits = setBits.filter { it >= i }
        return nextSetBits.min() ?: -1
    }

    actual fun or(alts: BitSet) {
        this.setBits.addAll(alts.setBits)
    }

}