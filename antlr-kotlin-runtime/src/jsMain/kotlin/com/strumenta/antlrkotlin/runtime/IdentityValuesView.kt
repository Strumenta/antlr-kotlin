// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

internal class IdentityValuesView<V>(private val map: IdentityHashMap<*, V>) : AbstractMutableCollection<V>() {
  override val size: Int
    get() = map.size

  override fun isEmpty(): Boolean =
    map.isEmpty()

  override fun clear(): Unit =
    map.clear()

  override fun add(element: V): Boolean =
    throw UnsupportedOperationException("Adding is not supported on values")

  override fun remove(element: V): Boolean {
    val iterator = iterator()

    while (iterator.hasNext()) {
      // IMPORTANT: notice that we use reference/strict equality
      if (iterator.next() === element) {
        iterator.remove()
        return true
      }
    }

    return false
  }

  override fun removeAll(elements: Collection<V>): Boolean {
    var removed = false

    for (element in elements) {
      removed = remove(element) || removed
    }

    return removed
  }

  override operator fun contains(element: V): Boolean =
    map.containsValue(element)

  override operator fun iterator(): MutableIterator<V> {
    val entriesIterator = map.entries.iterator()
    return object : MutableIterator<V> {
      override fun hasNext(): Boolean =
        entriesIterator.hasNext()

      override fun next(): V =
        entriesIterator.next().value

      override fun remove(): Unit =
        entriesIterator.remove()
    }
  }
}
