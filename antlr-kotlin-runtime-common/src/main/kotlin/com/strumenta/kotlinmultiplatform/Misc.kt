package com.strumenta.kotlinmultiplatform

import kotlin.reflect.KClass

expect fun <T> Array<T>.indices(): List<Int>

expect fun IntArray.indices(): List<Int>

expect fun String.toCharArray(): CharArray

expect class RuntimeException(message: String) : Throwable

expect fun assert(condition: Boolean)

fun CharArray.convertToString(): String {
    var s = ""
    this.forEach { s += it }
    return s
}

expect object Arrays {
    //    fun <T> equals(a: Array<T>, b: Array<T>): Boolean
//    fun equals(a: IntArray, b: IntArray): Boolean
    fun <T> asList(vararg elements: T): List<T>

    fun <T> copyOf(original: Array<T>, size: Int): Array<T>

    fun equals(a: Array<*>, b: Array<*>): Boolean

    fun toString(a: Array<*>): String
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
    fun unmodifiableList(asList: Collection<*>): List<*>
    fun <T, U> unmodifiableMap(t: T): U
    fun <T : Comparable<T>> min(precedencePredicates: List<T>): T
    fun <T : Comparable<T>> max(precedencePredicates: List<T>): T

}

expect object Math {

    fun min(a: Int, b: Int): Int

    fun max(a: Int, b: Int): Int

    fun floor(d: Double): Double
}

expect fun isCharUppercase(firstChar: Char): Boolean

expect fun isCharLowerCase(firstChar: Char): Boolean


//expect open class CopyOnWriteArrayList<T> : MutableList<T> {
//
//}

expect class NullPointerException : Throwable {
    constructor()
    constructor(message: String)
}

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

expect fun <T> Array<T>.clone(): Array<T>

expect fun <T> arraycopy(tokens: Array<T>, p: Int, tokens1: Array<T>, i: Int, i1: Int)

expect class Type

expect fun Type.isInstance(any: Any?): Boolean

interface TypeDeclarator {
    val classesByName: List<KClass<*>>
}

expect fun TypeDeclarator.getType(name: String): Type

//expect fun toInt32(c: Char) : Int