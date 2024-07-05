// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import js.collections.JsMap
import kotlin.collections.MutableMap.MutableEntry as ME

internal class IdentityEntriesView<K, V>(private val jsMap: JsMap<K, V>) : AbstractMutableSet<ME<K, V>>() {
  override val size: Int
    get() = jsMap.size

  override fun isEmpty(): Boolean =
    jsMap.size == 0

  override fun clear(): Unit =
    jsMap.clear()

  override fun add(element: ME<K, V>): Boolean =
    throw UnsupportedOperationException("Adding is not supported on entries")

  override fun remove(element: ME<K, V>): Boolean {
    val (key, value) = element
    return remove(key, value)
  }

  override fun removeAll(elements: Collection<ME<K, V>>): Boolean {
    var removed = false

    for (element in elements) {
      removed = remove(element) || removed
    }

    return removed
  }

  override fun contains(element: ME<K, V>): Boolean {
    val k = undefinedToNull(element.key)
    return jsMap.has(k) && jsMap[k] === element.value
  }

  override fun iterator(): MutableIterator<ME<K, V>> {
    val iterator = jsMap.iterator()
    return object : MutableIterator<ME<K, V>> {
      var lastEntry: IdentityEntriesView<K, V>.IdentityEntry? = null

      override fun hasNext(): Boolean =
        iterator.hasNext()

      override fun next(): ME<K, V> {
        val (key, value) = iterator.next()
        val entry = IdentityEntry(key, value)
        lastEntry = entry
        return entry
      }

      override fun remove() {
        val lastEntry = checkNotNull(this.lastEntry)
        remove(lastEntry.key, lastEntry.value)
      }
    }
  }

  private fun remove(key: K, value: V): Boolean {
    val k = undefinedToNull(key)

    if (jsMap.has(k)) {
      // IMPORTANT: notice that we use reference/strict equality
      if (jsMap[k] === value) {
        return jsMap.delete(k)
      }
    }

    return false
  }

  private inner class IdentityEntry(override val key: K, override var value: V) : ME<K, V> {
    override fun setValue(newValue: V): V {
      val oldValue = value
      check(oldValue === jsMap[key])

      jsMap[key] = newValue
      value = newValue
      return oldValue
    }
  }
}
