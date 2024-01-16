// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.misc

public class MultiMap<K, V> : MutableMap<K, MutableList<V>> by LinkedHashMap() {
  public val pairs: List<Pair<K, V>>
    get() {
      val pairs = ArrayList<Pair<K, V>>()

      for (key in keys) {
        for (value in getValue(key)) {
          pairs.add(Pair(key, value))
        }
      }

      return pairs
    }

  public fun map(key: K, value: V) {
    var elementsForKey = get(key)

    if (elementsForKey == null) {
      elementsForKey = ArrayList()
      put(key, elementsForKey)
    }

    elementsForKey.add(value)
  }
}
