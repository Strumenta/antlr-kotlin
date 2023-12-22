package com.strumenta.antlrkotlin.runtime

public actual class BitSet {
  private val wrapped = InternalBitSet()

  public actual fun set(bitIndex: Int): Unit =
    wrapped.set(bitIndex)

  public actual fun clear(bitIndex: Int): Unit =
    wrapped.clear(bitIndex)

  public actual fun get(bitIndex: Int): Boolean =
    wrapped[bitIndex]

  public actual fun cardinality(): Int =
    wrapped.cardinality()

  public actual fun nextSetBit(fromIndex: Int): Int =
    wrapped.nextSetBit(fromIndex)

  public actual fun or(otherBitSet: BitSet): Unit =
    wrapped.or(otherBitSet.wrapped)

  override fun equals(other: Any?): Boolean =
    this === other || other is BitSet && wrapped == other.wrapped

  override fun hashCode(): Int =
    wrapped.hashCode()

  override fun toString(): String =
    wrapped.toString()
}
