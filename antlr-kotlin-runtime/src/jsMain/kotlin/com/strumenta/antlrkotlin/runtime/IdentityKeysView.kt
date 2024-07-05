// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

internal class IdentityKeysView<K>(private val map: IdentityHashMap<K, *>) : AbstractMutableSet<K>() {
  override val size: Int
    get() = map.size

  override fun isEmpty(): Boolean =
    map.isEmpty()

  override fun clear(): Unit =
    map.clear()

  override fun contains(element: K): Boolean =
    map.containsKey(element)

  override fun add(element: K): Boolean =
    throw UnsupportedOperationException("Adding is not supported on keys")

  override fun remove(element: K): Boolean =
    map.removeBoolean(element)

  override fun removeAll(elements: Collection<K>): Boolean {
    var removed = false

    for (element in elements) {
      removed = remove(element) || removed
    }

    return removed
  }

  override fun iterator(): MutableIterator<K> {
    val entriesIterator = map.entries.iterator()
    return object : MutableIterator<K> {
      override fun hasNext(): Boolean =
        entriesIterator.hasNext()

      override fun next(): K =
        entriesIterator.next().key

      override fun remove(): Unit =
        entriesIterator.remove()
    }
  }
}
