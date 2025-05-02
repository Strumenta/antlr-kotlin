// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import js.collections.JsMap
import kotlin.collections.MutableMap.MutableEntry as ME

internal actual class IdentityHashMap<K, V> : MutableMap<K, V> {
  private val jsMap = JsMap<K, V>()

  actual override val size: Int
    get() = jsMap.size

  actual override val keys: MutableSet<K>
    get() = IdentityKeysView(this)

  actual override val values: MutableCollection<V>
    get() = IdentityValuesView(this)

  actual override val entries: MutableSet<ME<K, V>>
    get() = IdentityEntriesView(jsMap)

  actual override fun isEmpty(): Boolean =
    jsMap.size == 0

  actual override fun clear(): Unit =
    jsMap.clear()

  actual override fun get(key: K): V? {
    val k = undefinedToNull(key)
    return undefinedToNull(jsMap.get(k))
  }

  actual override fun put(key: K, value: V): V? {
    val k = undefinedToNull(key)
    val previousValue = jsMap.get(k)
    jsMap.set(k, value)
    return undefinedToNull(previousValue)
  }

  actual override fun remove(key: K): V? {
    val k = undefinedToNull(key)
    val removedValue = jsMap.get(k)
    jsMap.delete(k)
    return undefinedToNull(removedValue)
  }

  actual override fun putAll(from: Map<out K, V>) {
    for ((key, value) in from) {
      val k = undefinedToNull(key)
      jsMap.set(k, value)
    }
  }

  actual override fun containsKey(key: K): Boolean {
    val k = undefinedToNull(key)
    return jsMap.has(k)
  }

  actual override fun containsValue(value: V): Boolean {
    for (v in jsMap.values()) {
      // IMPORTANT: notice that we use reference/strict equality
      if (v === value) {
        return true
      }
    }

    return false
  }

  /**
   * Same as `remove(key)`, but returns a boolean value.
   */
  internal fun removeBoolean(key: K): Boolean {
    val k = undefinedToNull(key)
    return jsMap.delete(k)
  }
}
