package com.strumenta.kotlinmultiplatform

// TODO(Edoardo): an alternative approach is to simply use the
//  now "obsolete" Kotlin Native bitset. It is not really obsolete,
//  but it favors a mutable API which goes against Kotlin's philosophy.
//  In our case it would be a good choice anyway, so we could simply
//  take that bit of code from the Kotlin repository and be done with it.
expect class BitSet() {
  fun set(bitIndex: Int)
  fun clear(bitIndex: Int)
  fun get(bitIndex: Int): Boolean
  fun cardinality(): Int
  fun nextSetBit(i: Int): Int
  fun or(alts: BitSet)
}
