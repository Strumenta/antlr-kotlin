// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.misc

import com.strumenta.antlrkotlin.runtime.System
import com.strumenta.antlrkotlin.runtime.ext.binarySearch
import com.strumenta.antlrkotlin.runtime.ext.charCount
import com.strumenta.antlrkotlin.runtime.ext.isSupplementaryCodePoint
import com.strumenta.antlrkotlin.runtime.ext.toChars

/**
 * @author Sam Harwell
 */
public open class IntegerList {
  private companion object {
    private val EMPTY_DATA = IntArray(0)
    private const val INITIAL_SIZE = 4
    private const val MAX_ARRAY_SIZE = Int.MAX_VALUE - 8
  }

  private var _data: IntArray
  private var _size: Int = 0

  public val isEmpty: Boolean
    get() = _size == 0

  public constructor() {
    _data = EMPTY_DATA
  }

  public constructor(capacity: Int) {
    if (capacity < 0) {
      throw IllegalArgumentException()
    }

    _data = if (capacity == 0) {
      EMPTY_DATA
    } else {
      IntArray(capacity)
    }
  }

  public constructor(list: IntegerList) {
    _data = list._data.copyOf()
    _size = list._size
  }

  public constructor(list: Collection<Int>) : this(list.size) {
    for (value in list) {
      add(value)
    }
  }

  public fun add(value: Int) {
    if (_data.size == _size) {
      ensureCapacity(_size + 1)
    }

    _data[_size] = value
    _size++
  }

  public fun addAll(array: IntArray) {
    ensureCapacity(_size + array.size)
    System.arraycopy(array, 0, _data, _size, array.size)
    _size += array.size
  }

  public fun addAll(list: IntegerList) {
    ensureCapacity(_size + list._size)
    System.arraycopy(list._data, 0, _data, _size, list._size)
    _size += list._size
  }

  public fun addAll(list: Collection<Int>) {
    ensureCapacity(_size + list.size)

    for ((current, x) in list.withIndex()) {
      _data[_size + current] = x
    }

    _size += list.size
  }

  public operator fun get(index: Int): Int {
    if (index < 0 || index >= _size) {
      throw IndexOutOfBoundsException()
    }

    return _data[index]
  }

  public operator fun contains(value: Int): Boolean {
    for (i in 0..<_size) {
      if (_data[i] == value) {
        return true
      }
    }

    return false
  }

  public operator fun set(index: Int, value: Int): Int {
    if (index < 0 || index >= _size) {
      throw IndexOutOfBoundsException()
    }

    val previous = _data[index]
    _data[index] = value
    return previous
  }

  public fun removeAt(index: Int): Int {
    val value = get(index)

    for (i in 0..<_size - index - 1) {
      _data[index + i] = _data[index + i + 1]
    }

    _data[_size - 1] = 0
    _size--
    return value
  }

  public fun removeRange(fromIndex: Int, toIndex: Int) {
    if (fromIndex < 0 || toIndex < 0 || fromIndex > _size || toIndex > _size) {
      throw IndexOutOfBoundsException()
    }

    if (fromIndex > toIndex) {
      throw IllegalArgumentException()
    }

    System.arraycopy(_data, toIndex, _data, fromIndex, _size - toIndex)
    _size -= toIndex - fromIndex
  }

  public fun size(): Int =
    _size

  public fun trimToSize() {
    if (_data.size == _size) {
      return
    }

    _data = _data.copyOf(_size)
  }

  public fun clear() {
    _data.fill(0)
    _size = 0
  }

  public fun toArray(): IntArray =
    if (_size == 0) {
      EMPTY_DATA
    } else {
      _data.copyOf()
    }

  public fun sort() {
    _data.sort()
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) {
      return true
    }

    if (other !is IntegerList || _size != other._size) {
      return false
    }

    for (i in 0..<_size) {
      if (_data[i] != other._data[i]) {
        return false
      }
    }

    return true
  }

  /**
   * Returns the hash code value for this list.
   *
   * This implementation uses exactly the code that is used to define the
   * list hash function in the documentation for the [List.hashCode] method.
   *
   * @return The hash code value for this list
   */
  override fun hashCode(): Int {
    var hashCode = 1

    for (i in 0..<_size) {
      hashCode = 31 * hashCode + _data[i]
    }

    return hashCode
  }

  /**
   * Returns a string representation of this list.
   */
  override fun toString(): String =
    toArray().joinToString()

  public fun binarySearch(key: Int): Int =
    _data.binarySearch(key)

  public fun binarySearch(fromIndex: Int, toIndex: Int, key: Int): Int {
    if (fromIndex < 0 || toIndex < 0 || fromIndex > _size || toIndex > _size) {
      throw IndexOutOfBoundsException()
    }

    if (fromIndex > toIndex) {
      throw IllegalArgumentException()
    }

    return _data.binarySearch(key, fromIndex, toIndex)
  }

  private fun ensureCapacity(capacity: Int) {
    if (capacity < 0 || capacity > MAX_ARRAY_SIZE) {
      throw RuntimeException()
    }

    var newLength = if (_data.isEmpty()) {
      INITIAL_SIZE
    } else {
      _data.size
    }

    while (newLength < capacity) {
      newLength *= 2

      if (newLength < 0 || newLength > MAX_ARRAY_SIZE) {
        newLength = MAX_ARRAY_SIZE
      }
    }

    _data = _data.copyOf(newLength)
  }

  /**
   * Convert the list to a UTF-16 encoded char array.
   *
   * If all values are less than the 0xFFFF 16-bit code point limit
   * then this is just a char array of 16-bit char as usual.
   *
   * For values in the supplementary range, encode them as two UTF-16 code units.
   */
  public fun toCharArray(): CharArray {
    // Optimize for the common case (all data values are < 0xFFFF) to avoid an extra scan
    var resultArray = CharArray(_size)
    var resultIdx = 0
    var calculatedPreciseResultSize = false

    for (i in 0..<_size) {
      val codePoint = _data[i]

      // Calculate the precise result size if we encounter
      // a code point > 0xFFFF
      if (!calculatedPreciseResultSize && Char.isSupplementaryCodePoint(codePoint)) {
        resultArray = resultArray.copyOf(charArraySize())
        calculatedPreciseResultSize = true
      }

      // This will throw IllegalArgumentException if
      // the code point is not a valid Unicode code point
      val charsWritten = Char.toChars(codePoint, resultArray, resultIdx)
      resultIdx += charsWritten
    }

    return resultArray
  }

  private fun charArraySize(): Int {
    var result = 0

    for (i in 0..<_size) {
      result += Char.charCount(_data[i])
    }

    return result
  }
}
