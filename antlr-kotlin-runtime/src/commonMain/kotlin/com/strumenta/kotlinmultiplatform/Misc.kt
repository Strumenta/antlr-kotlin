package com.strumenta.kotlinmultiplatform

import kotlin.reflect.KClass

fun <T> Array<T>.indices(): List<Int> = this.indices.toList()

fun assert(condition: Boolean) = require(condition)

fun CharArray.convertToString(): String = this.joinToString("")
fun String.asCharArray(): CharArray = this.map { it }.toCharArray()

object Arrays {
    fun equals(a: Array<*>?, b: Array<*>?): Boolean {
        return (a == null && b == null) ||
                ((a != null && b != null) && a.contentEquals(b))
    }

    fun equals(a: IntArray?, b: IntArray?): Boolean {
        return (a == null && b == null) ||
                ((a != null && b != null) && a.contentEquals(b))
    }
}

expect class BitSet {
    constructor()

    fun set(bitIndex: Int)
    fun clear(bitIndex: Int)
    fun get(bitIndex: Int): Boolean
    fun cardinality(): Int
    fun nextSetBit(i: Int): Int
    fun or(alts: BitSet)
}

//expect class ArrayList<T> : List<T>

expect object Collections {
    fun <T : Comparable<T>> min(precedencePredicates: List<T>): T
    fun <T : Comparable<T>> max(precedencePredicates: List<T>): T
}

object Math {
    fun min(a: Int, b: Int): Int {
        return kotlin.math.min(a, b)
    }

    fun max(a: Int, b: Int): Int {
        return kotlin.math.max(a, b)
    }

    fun floor(d: Double): Double {
        return kotlin.math.floor(d)
    }

}

expect fun isCharUppercase(firstChar: Char): Boolean

expect fun isCharLowerCase(firstChar: Char): Boolean

//expect open class CopyOnWriteArrayList<T> : MutableList<T> {
//
//}

expect class WeakHashMap<K, V> : MutableMap<K, V> {
    constructor()
}

expect class IdentityHashMap<K, V> : MutableMap<K, V> {
    constructor()
}

expect class UUID {
    constructor(most: Long, least: Long)

    companion object {
        fun fromString(encoded: String): UUID
    }
}

expect fun errMessage(message: String)
fun outMessage(message: String) {
    println(message)
}

expect fun Char.Companion.isSupplementaryCodePoint(codePoint: Int): Boolean

expect fun Char.Companion.toChars(codePoint: Int, resultArray: CharArray, resultIdx: Int): Int

expect fun Char.Companion.charCount(i: Int): Byte

expect fun Char.Companion.maxValue(): Char

expect fun <T> arraycopy(src: Array<T>, srcPos: Int, dest: Array<T>, destPos: Int, length: Int)
expect fun arraycopy(src: IntArray, srcPos: Int, dest: IntArray, destPos: Int, length: Int)

expect class Type

expect fun Type.isInstance(any: Any?): Boolean

interface TypeDeclarator {
    val classesByName: List<KClass<*>>
}

expect fun TypeDeclarator.getType(name: String): Type

//expect fun toInt32(c: Char) : Int

expect inline fun <R> synchronized(lock: Any, block: () -> R): R
