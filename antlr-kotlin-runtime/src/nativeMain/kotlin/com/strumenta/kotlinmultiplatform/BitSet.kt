package com.strumenta.kotlinmultiplatform

actual class BitSet actual constructor() {
    private val _wrapped = kotlin.native.BitSet()

    actual fun set(bitIndex: Int) {
        _wrapped.set(bitIndex)
    }

    actual fun clear(bitIndex: Int) {
        _wrapped.clear(bitIndex)
    }

    actual fun get(bitIndex: Int): Boolean {
        return _wrapped.get(bitIndex)
    }

    actual fun cardinality(): Int {
        return (0.._wrapped.size).count { bitIndex ->
            _wrapped.get(bitIndex)
        }
    }

    actual fun nextSetBit(i: Int): Int {
        return _wrapped.nextSetBit(i)
    }

    actual fun or(alts: BitSet) {
        return _wrapped.or(alts._wrapped)
    }

}