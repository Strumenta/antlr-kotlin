/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

/** Sometimes we need to map a key to a value but key is two pieces of data.
 * This nested hash table saves creating a single key each time we access
 * map; avoids mem creation.
 */
class DoubleKeyMap<Key1, Key2, Value> {
    internal var data: MutableMap<Key1, MutableMap<Key2, Value>> = LinkedHashMap()

    fun put(k1: Key1, k2: Key2, v: Value): Value? {
        var data2: MutableMap<Key2, Value>? = data[k1]
        var prev: Value? = null
        if (data2 == null) {
            data2 = LinkedHashMap()
            data.put(k1, data2)
        } else {
            prev = data2[k2]
        }
        data2.put(k2, v)
        return prev
    }

    operator fun get(k1: Key1, k2: Key2): Value? {
        val data2 = data[k1] ?: return null
        return data2[k2]
    }

    operator fun get(k1: Key1): Map<Key2, Value> {
        return data[k1]!!
    }

    /** Get all values associated with primary key  */
    fun values(k1: Key1): Collection<Value>? {
        val data2 = data[k1] ?: return null
        return data2.values
    }

    /** get all primary keys  */
    fun keySet(): Set<Key1> {
        return data.keys
    }

    /** get all secondary keys associated with a primary key  */
    fun keySet(k1: Key1): Set<Key2>? {
        val data2 = data[k1] ?: return null
        return data2.keys
    }
}
