/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime
//
//import java.nio.ByteBuffer
//import java.nio.CharBuffer
//import java.nio.IntBuffer
//
///**
// * Wrapper for [ByteBuffer] / [CharBuffer] / [IntBuffer].
// *
// * Because Java lacks generics on primitive types, these three types
// * do not share an interface, so we have to write one manually.
// */
//class CodePointBuffer private constructor(internal val type: Type, private val byteBuffer: ByteBuffer, private val charBuffer: CharBuffer, private val intBuffer: IntBuffer) {
//    enum class Type {
//        BYTE,
//        CHAR,
//        INT
//    }
//
//    fun position(): Int {
//        when (type) {
//            CodePointBuffer.Type.BYTE -> return byteBuffer.position()
//            CodePointBuffer.Type.CHAR -> return charBuffer.position()
//            CodePointBuffer.Type.INT -> return intBuffer.position()
//        }
//        throw UnsupportedOperationException("Not reached")
//    }
//
//    fun position(newPosition: Int) {
//        when (type) {
//            CodePointBuffer.Type.BYTE -> byteBuffer.position(newPosition)
//            CodePointBuffer.Type.CHAR -> charBuffer.position(newPosition)
//            CodePointBuffer.Type.INT -> intBuffer.position(newPosition)
//        }
//    }
//
//    fun remaining(): Int {
//        when (type) {
//            CodePointBuffer.Type.BYTE -> return byteBuffer.remaining()
//            CodePointBuffer.Type.CHAR -> return charBuffer.remaining()
//            CodePointBuffer.Type.INT -> return intBuffer.remaining()
//        }
//        throw UnsupportedOperationException("Not reached")
//    }
//
//    operator fun get(offset: Int): Int {
//        when (type) {
//            CodePointBuffer.Type.BYTE -> return byteBuffer.get(offset).toInt()
//            CodePointBuffer.Type.CHAR -> return charBuffer.get(offset).toInt()
//            CodePointBuffer.Type.INT -> return intBuffer.get(offset)
//        }
//        throw UnsupportedOperationException("Not reached")
//    }
//
//    internal fun arrayOffset(): Int {
//        when (type) {
//            CodePointBuffer.Type.BYTE -> return byteBuffer.arrayOffset()
//            CodePointBuffer.Type.CHAR -> return charBuffer.arrayOffset()
//            CodePointBuffer.Type.INT -> return intBuffer.arrayOffset()
//        }
//        throw UnsupportedOperationException("Not reached")
//    }
//
//    internal fun byteArray(): ByteArray {
//        assert(type == Type.BYTE)
//        return byteBuffer.array()
//    }
//
//    internal fun charArray(): CharArray {
//        assert(type == Type.CHAR)
//        return charBuffer.array()
//    }
//
//    internal fun intArray(): IntArray {
//        assert(type == Type.INT)
//        return intBuffer.array()
//    }
//
//    class Builder private constructor(initialBufferSize: Int) {
//        internal var type: Type? = null
//            private set
//        internal var byteBuffer: ByteBuffer? = null
//            private set
//        internal var charBuffer: CharBuffer? = null
//            private set
//        internal var intBuffer: IntBuffer? = null
//            private set
//        private var prevHighSurrogate: Int = 0
//
//        init {
//            type = Type.BYTE
//            byteBuffer = ByteBuffer.allocate(initialBufferSize)
//            charBuffer = null
//            intBuffer = null
//            prevHighSurrogate = -1
//        }
//
//        fun build(): CodePointBuffer {
//            when (type) {
//                CodePointBuffer.Type.BYTE -> byteBuffer!!.flip()
//                CodePointBuffer.Type.CHAR -> charBuffer!!.flip()
//                CodePointBuffer.Type.INT -> intBuffer!!.flip()
//            }
//            return CodePointBuffer(type, byteBuffer, charBuffer, intBuffer)
//        }
//
//        private fun roundUpToNextPowerOfTwo(i: Int): Int {
//            val nextPowerOfTwo = 32 - Integer.numberOfLeadingZeros(i - 1)
//            return Math.pow(2.0, nextPowerOfTwo.toDouble()).toInt()
//        }
//
//        fun ensureRemaining(remainingNeeded: Int) {
//            when (type) {
//                CodePointBuffer.Type.BYTE -> if (byteBuffer!!.remaining() < remainingNeeded) {
//                    val newCapacity = roundUpToNextPowerOfTwo(byteBuffer!!.capacity() + remainingNeeded)
//                    val newBuffer = ByteBuffer.allocate(newCapacity)
//                    byteBuffer!!.flip()
//                    newBuffer.put(byteBuffer!!)
//                    byteBuffer = newBuffer
//                }
//                CodePointBuffer.Type.CHAR -> if (charBuffer!!.remaining() < remainingNeeded) {
//                    val newCapacity = roundUpToNextPowerOfTwo(charBuffer!!.capacity() + remainingNeeded)
//                    val newBuffer = CharBuffer.allocate(newCapacity)
//                    charBuffer!!.flip()
//                    newBuffer.put(charBuffer!!)
//                    charBuffer = newBuffer
//                }
//                CodePointBuffer.Type.INT -> if (intBuffer!!.remaining() < remainingNeeded) {
//                    val newCapacity = roundUpToNextPowerOfTwo(intBuffer!!.capacity() + remainingNeeded)
//                    val newBuffer = IntBuffer.allocate(newCapacity)
//                    intBuffer!!.flip()
//                    newBuffer.put(intBuffer!!)
//                    intBuffer = newBuffer
//                }
//            }
//        }
//
//        fun append(utf16In: CharBuffer) {
//            ensureRemaining(utf16In.remaining())
//            if (utf16In.hasArray()) {
//                appendArray(utf16In)
//            } else {
//                // TODO
//                throw UnsupportedOperationException("TODO")
//            }
//        }
//
//        private fun appendArray(utf16In: CharBuffer) {
//            assert(utf16In.hasArray())
//
//            when (type) {
//                CodePointBuffer.Type.BYTE -> appendArrayByte(utf16In)
//                CodePointBuffer.Type.CHAR -> appendArrayChar(utf16In)
//                CodePointBuffer.Type.INT -> appendArrayInt(utf16In)
//            }
//        }
//
//        private fun appendArrayByte(utf16In: CharBuffer) {
//            assert(prevHighSurrogate == -1)
//
//            val `in` = utf16In.array()
//            var inOffset = utf16In.arrayOffset() + utf16In.position()
//            val inLimit = utf16In.arrayOffset() + utf16In.limit()
//
//            val outByte = byteBuffer!!.array()
//            var outOffset = byteBuffer!!.arrayOffset() + byteBuffer!!.position()
//
//            while (inOffset < inLimit) {
//                val c = `in`[inOffset]
//                if (c.toInt() <= 0xFF) {
//                    outByte[outOffset] = (c.toInt() and 0xFF).toByte()
//                } else {
//                    utf16In.position(inOffset - utf16In.arrayOffset())
//                    byteBuffer!!.position(outOffset - byteBuffer!!.arrayOffset())
//                    if (!Character.isHighSurrogate(c)) {
//                        byteToCharBuffer(utf16In.remaining())
//                        appendArrayChar(utf16In)
//                        return
//                    } else {
//                        byteToIntBuffer(utf16In.remaining())
//                        appendArrayInt(utf16In)
//                        return
//                    }
//                }
//                inOffset++
//                outOffset++
//            }
//
//            utf16In.position(inOffset - utf16In.arrayOffset())
//            byteBuffer!!.position(outOffset - byteBuffer!!.arrayOffset())
//        }
//
//        private fun appendArrayChar(utf16In: CharBuffer) {
//            assert(prevHighSurrogate == -1)
//
//            val `in` = utf16In.array()
//            var inOffset = utf16In.arrayOffset() + utf16In.position()
//            val inLimit = utf16In.arrayOffset() + utf16In.limit()
//
//            val outChar = charBuffer!!.array()
//            var outOffset = charBuffer!!.arrayOffset() + charBuffer!!.position()
//
//            while (inOffset < inLimit) {
//                val c = `in`[inOffset]
//                if (!Character.isHighSurrogate(c)) {
//                    outChar[outOffset] = c
//                } else {
//                    utf16In.position(inOffset - utf16In.arrayOffset())
//                    charBuffer!!.position(outOffset - charBuffer!!.arrayOffset())
//                    charToIntBuffer(utf16In.remaining())
//                    appendArrayInt(utf16In)
//                    return
//                }
//                inOffset++
//                outOffset++
//            }
//
//            utf16In.position(inOffset - utf16In.arrayOffset())
//            charBuffer!!.position(outOffset - charBuffer!!.arrayOffset())
//        }
//
//        private fun appendArrayInt(utf16In: CharBuffer) {
//            val `in` = utf16In.array()
//            var inOffset = utf16In.arrayOffset() + utf16In.position()
//            val inLimit = utf16In.arrayOffset() + utf16In.limit()
//
//            val outInt = intBuffer!!.array()
//            var outOffset = intBuffer!!.arrayOffset() + intBuffer!!.position()
//
//            while (inOffset < inLimit) {
//                val c = `in`[inOffset]
//                inOffset++
//                if (prevHighSurrogate != -1) {
//                    if (Character.isLowSurrogate(c)) {
//                        outInt[outOffset] = Character.toCodePoint(prevHighSurrogate.toChar(), c)
//                        outOffset++
//                        prevHighSurrogate = -1
//                    } else {
//                        // Dangling high surrogate
//                        outInt[outOffset] = prevHighSurrogate
//                        outOffset++
//                        if (Character.isHighSurrogate(c)) {
//                            prevHighSurrogate = c.toInt() and 0xFFFF
//                        } else {
//                            outInt[outOffset] = c.toInt() and 0xFFFF
//                            outOffset++
//                            prevHighSurrogate = -1
//                        }
//                    }
//                } else if (Character.isHighSurrogate(c)) {
//                    prevHighSurrogate = c.toInt() and 0xFFFF
//                } else {
//                    outInt[outOffset] = c.toInt() and 0xFFFF
//                    outOffset++
//                }
//            }
//
//            if (prevHighSurrogate != -1) {
//                // Dangling high surrogate
//                outInt[outOffset] = prevHighSurrogate and 0xFFFF
//                outOffset++
//            }
//
//            utf16In.position(inOffset - utf16In.arrayOffset())
//            intBuffer!!.position(outOffset - intBuffer!!.arrayOffset())
//        }
//
//        private fun byteToCharBuffer(toAppend: Int) {
//            byteBuffer!!.flip()
//            // CharBuffers hold twice as much per unit as ByteBuffers, so start with half the capacity.
//            val newBuffer = CharBuffer.allocate(Math.max(byteBuffer!!.remaining() + toAppend, byteBuffer!!.capacity() / 2))
//            while (byteBuffer!!.hasRemaining()) {
//                newBuffer.put((byteBuffer!!.get() and 0xFF).toChar())
//            }
//            type = Type.CHAR
//            byteBuffer = null
//            charBuffer = newBuffer
//        }
//
//        private fun byteToIntBuffer(toAppend: Int) {
//            byteBuffer!!.flip()
//            // IntBuffers hold four times as much per unit as ByteBuffers, so start with one quarter the capacity.
//            val newBuffer = IntBuffer.allocate(Math.max(byteBuffer!!.remaining() + toAppend, byteBuffer!!.capacity() / 4))
//            while (byteBuffer!!.hasRemaining()) {
//                newBuffer.put(byteBuffer!!.get() and 0xFF)
//            }
//            type = Type.INT
//            byteBuffer = null
//            intBuffer = newBuffer
//        }
//
//        private fun charToIntBuffer(toAppend: Int) {
//            charBuffer!!.flip()
//            // IntBuffers hold two times as much per unit as ByteBuffers, so start with one half the capacity.
//            val newBuffer = IntBuffer.allocate(Math.max(charBuffer!!.remaining() + toAppend, charBuffer!!.capacity() / 2))
//            while (charBuffer!!.hasRemaining()) {
//                newBuffer.put(charBuffer!!.get().toInt() and 0xFFFF)
//            }
//            type = Type.INT
//            charBuffer = null
//            intBuffer = newBuffer
//        }
//    }
//
//    companion object {
//
//        fun withBytes(byteBuffer: ByteBuffer): CodePointBuffer {
//            return CodePointBuffer(Type.BYTE, byteBuffer, null, null)
//        }
//
//        fun withChars(charBuffer: CharBuffer): CodePointBuffer {
//            return CodePointBuffer(Type.CHAR, null, charBuffer, null)
//        }
//
//        fun withInts(intBuffer: IntBuffer): CodePointBuffer {
//            return CodePointBuffer(Type.INT, null, null, intBuffer)
//        }
//
//        fun builder(initialBufferSize: Int): Builder {
//            return Builder(initialBufferSize)
//        }
//    }
//}
