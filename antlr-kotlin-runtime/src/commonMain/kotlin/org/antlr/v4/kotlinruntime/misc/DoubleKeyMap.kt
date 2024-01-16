// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.misc

/**
 * Sometimes we need to map a key to a value but key is two pieces of data.
 * This nested hash table saves creating a single key each time we access map; avoids mem creation.
 */
public class DoubleKeyMap<Key1, Key2, Value> {
  internal var data: MutableMap<Key1, MutableMap<Key2, Value>> = LinkedHashMap()

  public fun put(k1: Key1, k2: Key2, v: Value): Value? {
    var data2 = data[k1]
    var prev: Value? = null

    if (data2 == null) {
      data2 = LinkedHashMap()
      data[k1] = data2
    } else {
      prev = data2[k2]
    }

    data2[k2] = v
    return prev
  }

  public operator fun get(k1: Key1, k2: Key2): Value? {
    val data2 = data[k1] ?: return null
    return data2[k2]
  }

  public operator fun get(k1: Key1): Map<Key2, Value> =
    data[k1]!!

  /**
   * Get all values associated with primary key.
   */
  public fun values(k1: Key1): Collection<Value>? {
    val data2 = data[k1] ?: return null
    return data2.values
  }

  /**
   * Get all primary keys.
   */
  public fun keySet(): Set<Key1> =
    data.keys

  /**
   * Get all secondary keys associated with a primary key.
   */
  public fun keySet(k1: Key1): Set<Key2>? {
    val data2 = data[k1] ?: return null
    return data2.keys
  }
}
