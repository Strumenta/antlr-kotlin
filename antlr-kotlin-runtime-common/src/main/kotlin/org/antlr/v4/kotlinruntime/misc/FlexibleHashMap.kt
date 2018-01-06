/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

import org.antlr.v4.kotlinruntime.misc.FlexibleHashMap.Entry

/** A limited map (many unsupported operations) that lets me use
 * varying hashCode/equals.
 */
open class FlexibleHashMap<K, V> constructor(comparator: AbstractEqualityComparator<in K>? = null, initialCapacity: Int = INITAL_CAPACITY, initialBucketCapacity: Int = INITAL_BUCKET_CAPACITY) : MutableMap<K, V> {

    override val keys: MutableSet<K>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override val size: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override val values: MutableCollection<V>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    protected val comparator: AbstractEqualityComparator<in K>

    protected var buckets: Array<List<Entry<K, V>>>

    /** How many elements in set  */
    protected var n = 0

    protected var threshold = (INITAL_CAPACITY * LOAD_FACTOR).toInt() // when to expand

    protected var currentPrime = 1 // jump by 4 primes each expand or whatever
    protected var initialBucketCapacity = INITAL_BUCKET_CAPACITY

    class Entry<K, V>(val key: K, var value: V) {

        override fun toString(): String {
            return key.toString() + ":" + value.toString()
        }
    }

    init {
        var comparator = comparator
        if (comparator == null) {
            comparator = ObjectEqualityComparator.INSTANCE
        }

        this.comparator = comparator
        this.buckets = createEntryListArray(initialBucketCapacity)
        this.initialBucketCapacity = initialBucketCapacity
    }

    protected fun getBucket(key: K): Int {
        val hash = comparator.hashCode(key)
        return hash and buckets.size - 1
    }

    override fun get(key: K): V? {
        TODO()
//        val typedKey = key as K?
//        if (key == null) return null
//        val b = getBucket(typedKey)
//        val bucket = buckets[b] ?: return null
//// no bucket
//        for (e in bucket) {
//            if (comparator.equals(e.key, typedKey)) {
//                return e.value
//            }
//        }
//        return null
    }

    override fun put(key: K, value: V): V? {
        TODO()
//        if (key == null) return null
//        if (n > threshold) expand()
//        val b = getBucket(key)
//        var bucket: LinkedList<Entry<K, V>>? = buckets[b]
//        if (bucket == null) {
//            buckets[b] = LinkedList()
//            bucket = buckets[b]
//        }
//        for (e in bucket) {
//            if (comparator.equals(e.key, key)) {
//                val prev = e.value
//                e.value = value
//                n++
//                return prev
//            }
//        }
//        // not there
//        bucket.add(Entry(key, value))
//        n++
//        return null
    }

    override fun remove(key: K): V {
        throw UnsupportedOperationException()
    }

    override fun putAll(m: Map<out K, out V>) {
        throw UnsupportedOperationException()
    }
//
//    fun keySet(): Set<K> {
//        throw UnsupportedOperationException()
//    }

//    fun values(): Collection<V> {
//        val a = ArrayList<V>(size)
//        for (bucket in buckets) {
//            if (bucket == null) continue
//            for (e in bucket) {
//                a.add(e.value)
//            }
//        }
//        return a
//    }

//    fun entrySet(): Set<Entry<K, V>> {
//        throw UnsupportedOperationException()
//    }

    override fun containsKey(key: K): Boolean {
        return get(key) != null
    }

    override fun containsValue(value: V): Boolean {
        throw UnsupportedOperationException()
    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        for (bucket in buckets) {
            if (bucket == null) continue
            for (e in bucket) {
                if (e == null) break
                hash = MurmurHash.update(hash, comparator.hashCode(e.key))
            }
        }

        hash = MurmurHash.finish(hash, size)
        return hash
    }

    override fun equals(o: Any?): Boolean {
        throw UnsupportedOperationException()
    }

    protected fun expand() {
        TODO()
//        val old = buckets
//        currentPrime += 4
//        val newCapacity = buckets.size * 2
//        val newTable = createEntryListArray<K, V>(newCapacity)
//        buckets = newTable
//        threshold = (newCapacity * LOAD_FACTOR).toInt()
//        //		System.out.println("new size="+newCapacity+", thres="+threshold);
//        // rehash all existing entries
//        val oldSize = size
//        for (bucket in old) {
//            if (bucket == null) continue
//            for (e in bucket) {
//                if (e == null) break
//                put(e.key, e.value)
//            }
//        }
//        n = oldSize
    }

//    fun size(): Int {
//        return n
//    }

    override fun isEmpty(): Boolean {
        return n == 0
    }

    override fun clear() {
        TODO()
        //buckets = createEntryListArray(INITAL_CAPACITY)
        n = 0
    }

    override fun toString(): String {
        if (size == 0) return "{}"

        val buf = StringBuilder()
        buf.append('{')
        var first = true
        for (bucket in buckets) {
            if (bucket == null) continue
            for (e in bucket) {
                if (e == null) break
                if (first)
                    first = false
                else
                    buf.append(", ")
                buf.append(e.toString())
            }
        }
        buf.append('}')
        return buf.toString()
    }

    fun toTableString(): String {
        val buf = StringBuilder()
        for (bucket in buckets) {
            if (bucket == null) {
                buf.append("null\n")
                continue
            }
            buf.append('[')
            var first = true
            for (e in bucket) {
                if (first)
                    first = false
                else
                    buf.append(" ")
                if (e == null)
                    buf.append("_")
                else
                    buf.append(e.toString())
            }
            buf.append("]\n")
        }
        return buf.toString()
    }

    companion object {
        val INITAL_CAPACITY = 16 // must be power of 2
        val INITAL_BUCKET_CAPACITY = 8
        val LOAD_FACTOR = 0.75

        private fun <K, V> createEntryListArray(length: Int): Array<List<Entry<K, V>>> {
            return arrayOfNulls<List<*>>(length) as Array<List<Entry<K, V>>>
        }

    }

}
