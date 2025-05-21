// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

@JsName("Map")
internal external class JsMap<K : Any?, V : Any?> {
  val size: Int
  fun clear()
  fun delete(key: K): Boolean
  fun get(key: K): V?
  fun has(key: K): Boolean
  fun set(key: K, value: V)
  fun values(): JsIterator<V>
}

@JsName("Iterator")
internal abstract external class JsIterator<T> {
  fun next(): JsIteratorValue<T>
}

internal external interface JsIteratorValue<T : Any?> {
  val value: T
  val done: Boolean
}

@Suppress("unused")
internal external interface JsTuple<K, V>

@Suppress("UnsafeCastFromDynamic")
internal operator fun <K, V> JsTuple<K, V>.component1(): K =
  this.asDynamic()[0]

@Suppress("UnsafeCastFromDynamic")
internal operator fun <K, V> JsTuple<K, V>.component2(): V =
  this.asDynamic()[1]

internal fun <K, V> JsMap<K, V>.iterator(): JsIterator<JsTuple<K, V>> =
  jsIterator(this)

internal fun <T> JsIterator<T>.toKotlinIterator(): Iterator<T> =
  KotlinIterator(this)

@Suppress("UNUSED_PARAMETER", "UnsafeCastFromDynamic")
private fun <K, V> jsIterator(jsMap: JsMap<K, V>): JsIterator<JsTuple<K, V>> =
  js("jsMap[Symbol.iterator]()")

private class KotlinIterator<T>(private val jsIterator: JsIterator<T>) : Iterator<T> {
  private var next: JsIteratorValue<T>? = null

  override fun hasNext(): Boolean {
    if (next == null) {
      next = jsIterator.next()
    }

    return next?.done?.not() ?: false
  }

  override fun next(): T {
    val value = next ?: jsIterator.next()
    next = null

    if (value.done) {
      throw NoSuchElementException()
    }

    return value.value
  }
}
