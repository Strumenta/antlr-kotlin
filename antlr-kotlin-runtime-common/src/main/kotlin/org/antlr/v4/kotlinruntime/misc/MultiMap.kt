/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

class MultiMap<K, V> : MutableMap<K, MutableList<V>> by mutableMapOf() {

    val pairs: List<Pair<K, V>>
        get() {
            val pairs = ArrayList<Pair<K, V>>()
            for (key in keys) {
                for (value in get(key)!!) {
                    pairs.add(Pair(key, value))
                }
            }
            return pairs
        }

    fun map(key: K, value: V) {
        var elementsForKey: MutableList<V>? = get(key)
        if (elementsForKey == null) {
            elementsForKey = ArrayList()
            put(key, elementsForKey)
        }
        elementsForKey.add(value)
    }
}
