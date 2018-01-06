/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime.misc

import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.charCount
import com.strumenta.kotlinmultiplatform.isSupplementaryCodePoint
import com.strumenta.kotlinmultiplatform.toChars

/**
 *
 * @author Sam Harwell
 */
open class IntegerList {


    private var _data: IntArray? = null

    private var _size: Int = 0

    val isEmpty: Boolean
        get() = _size == 0

    constructor() {
        _data = EMPTY_DATA
    }

    constructor(capacity: Int) {
        if (capacity < 0) {
            throw IllegalArgumentException()
        }

        if (capacity == 0) {
            _data = EMPTY_DATA
        } else {
            _data = IntArray(capacity)
        }
    }

    constructor(list: IntegerList) {
        TODO()
        //_data = list._data!!.clone()
        //_size = list._size
    }

    constructor(list: Collection<Int>) : this(list.size) {
        for (value in list) {
            add(value)
        }
    }

    fun add(value: Int) {
        TODO()
//        if (_data!!.size == _size) {
//            ensureCapacity(_size + 1)
//        }
//
//        _data[_size] = value
//        _size++
    }

    fun addAll(array: IntArray) {
        TODO()
//        ensureCapacity(_size + array.size)
//        System.arraycopy(array, 0, _data!!, _size, array.size)
//        _size += array.size
    }

    fun addAll(list: IntegerList) {
        TODO()
//        ensureCapacity(_size + list._size)
//        System.arraycopy(list._data!!, 0, _data!!, _size, list._size)
//        _size += list._size
    }

    fun addAll(list: Collection<Int>) {
        TODO()
//        ensureCapacity(_size + list.size)
//        var current = 0
//        for (x in list) {
//            _data[_size + current] = x
//            current++
//        }
//        _size += list.size
    }

    operator fun get(index: Int): Int {
        if (index < 0 || index >= _size) {
            throw IndexOutOfBoundsException()
        }

        return _data!![index]
    }

    operator fun contains(value: Int): Boolean {
        for (i in 0 until _size) {
            if (_data!![i] == value) {
                return true
            }
        }

        return false
    }

    operator fun set(index: Int, value: Int): Int {
        if (index < 0 || index >= _size) {
            throw IndexOutOfBoundsException()
        }

        val previous = _data!![index]
        _data!![index] = value
        return previous
    }

    fun removeAt(index: Int): Int {
        TODO()
//        val value = get(index)
//        System.arraycopy(_data!!, index + 1, _data!!, index, _size - index - 1)
//        _data[_size - 1] = 0
//        _size--
//        return value
    }

    fun removeRange(fromIndex: Int, toIndex: Int) {
        TODO()
//        if (fromIndex < 0 || toIndex < 0 || fromIndex > _size || toIndex > _size) {
//            throw IndexOutOfBoundsException()
//        }
//        if (fromIndex > toIndex) {
//            throw IllegalArgumentException()
//        }
//
//        System.arraycopy(_data!!, toIndex, _data!!, fromIndex, _size - toIndex)
//        Arrays.fill(_data!!, _size - (toIndex - fromIndex), _size, 0)
//        _size -= toIndex - fromIndex
    }

    fun size(): Int {
        return _size
    }

    fun trimToSize() {
        TODO()
//        if (_data!!.size == _size) {
//            return
//        }
//
//        _data = Arrays.copyOf(_data!!, _size)
    }

    fun clear() {
        TODO()
//        Arrays.fill(_data!!, 0, _size, 0)
//        _size = 0
    }

    fun toArray(): IntArray {
        TODO()
//        return if (_size == 0) {
//            EMPTY_DATA
//        } else Arrays.copyOf(_data!!, _size)

    }

    fun sort() {
        TODO()
        //Arrays.sort(_data!!, 0, _size)
    }

    /**
     * Compares the specified object with this list for equality.  Returns
     * `true` if and only if the specified object is also an [IntegerList],
     * both lists have the same size, and all corresponding pairs of elements in
     * the two lists are equal.  In other words, two lists are defined to be
     * equal if they contain the same elements in the same order.
     *
     *
     * This implementation first checks if the specified object is this
     * list. If so, it returns `true`; if not, it checks if the
     * specified object is an [IntegerList]. If not, it returns `false`;
     * if so, it checks the size of both lists. If the lists are not the same size,
     * it returns `false`; otherwise it iterates over both lists, comparing
     * corresponding pairs of elements.  If any comparison returns `false`,
     * this method returns `false`.
     *
     * @param o the object to be compared for equality with this list
     * @return `true` if the specified object is equal to this list
     */
    override fun equals(o: Any?): Boolean {
        if (o === this) {
            return true
        }

        if (o !is IntegerList) {
            return false
        }

        val other = o as IntegerList?
        if (_size != other!!._size) {
            return false
        }

        for (i in 0 until _size) {
            if (_data!![i] != other._data!![i]) {
                return false
            }
        }

        return true
    }

    /**
     * Returns the hash code value for this list.
     *
     *
     * This implementation uses exactly the code that is used to define the
     * list hash function in the documentation for the [List.hashCode]
     * method.
     *
     * @return the hash code value for this list
     */
    override fun hashCode(): Int {
        var hashCode = 1
        for (i in 0 until _size) {
            hashCode = 31 * hashCode + _data!![i]
        }

        return hashCode
    }

    /**
     * Returns a string representation of this list.
     */
    override fun toString(): String {
        TODO()
        //return Arrays.toString(toArray())
    }

    fun binarySearch(key: Int): Int {
        TODO()
        //return Arrays.binarySearch(_data!!, 0, _size, key)
    }

    fun binarySearch(fromIndex: Int, toIndex: Int, key: Int): Int {
        if (fromIndex < 0 || toIndex < 0 || fromIndex > _size || toIndex > _size) {
            throw IndexOutOfBoundsException()
        }
        if (fromIndex > toIndex) {
            throw IllegalArgumentException()
        }

        TODO()
        //return Arrays.binarySearch(_data!!, fromIndex, toIndex, key)
    }

    private fun ensureCapacity(capacity: Int) {
        if (capacity < 0 || capacity > MAX_ARRAY_SIZE) {
            throw RuntimeException()
        }

        var newLength: Int
        if (_data!!.size == 0) {
            newLength = INITIAL_SIZE
        } else {
            newLength = _data!!.size
        }

        while (newLength < capacity) {
            newLength = newLength * 2
            if (newLength < 0 || newLength > MAX_ARRAY_SIZE) {
                newLength = MAX_ARRAY_SIZE
            }
        }

        _data = Arrays.copyOf(_data!!.toTypedArray(), newLength).toIntArray()
    }

    /** Convert the list to a UTF-16 encoded char array. If all values are less
     * than the 0xFFFF 16-bit code point limit then this is just a char array
     * of 16-bit char as usual. For values in the supplementary range, encode
     * them as two UTF-16 code units.
     */
    fun toCharArray(): CharArray {
        // Optimize for the common case (all data values are
        // < 0xFFFF) to avoid an extra scan
        var resultArray = CharArray(_size)
        var resultIdx = 0
        var calculatedPreciseResultSize = false
        for (i in 0 until _size) {
            val codePoint = _data!![i]
            // Calculate the precise result size if we encounter
            // a code point > 0xFFFF
            if (!calculatedPreciseResultSize && Char.isSupplementaryCodePoint(codePoint)) {
                resultArray = Arrays.copyOf(resultArray.toTypedArray(), charArraySize()).toCharArray()
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
        for (i in 0 until _size) {
            result += Char.charCount(_data!![i])
        }
        return result
    }

    companion object {

        private val EMPTY_DATA = IntArray(0)

        private val INITIAL_SIZE = 4
        private val MAX_ARRAY_SIZE = Int.MAX_VALUE - 8
    }
}


