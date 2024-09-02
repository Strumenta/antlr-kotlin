// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

internal expect class WeakHashMap<K, V>() : MutableMap<K, V> {
  override val size: Int
  override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
  override val keys: MutableSet<K>
  override val values: MutableCollection<V>
  override fun containsKey(key: K): Boolean
  override fun containsValue(value: V): Boolean
  override fun get(key: K): V?
  override fun isEmpty(): Boolean
  override fun clear()
  override fun put(key: K, value: V): V?
  override fun putAll(from: Map<out K, V>)
  override fun remove(key: K): V?
}
