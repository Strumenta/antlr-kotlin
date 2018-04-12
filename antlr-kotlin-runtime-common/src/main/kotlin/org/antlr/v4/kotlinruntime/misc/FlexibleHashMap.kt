/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

/** A limited map (many unsupported operations) that lets me use
 * varying hashCode/equals.
 */
open class FlexibleHashMap<K, V> constructor(
    comparator: AbstractEqualityComparator<K>? = null,
    initialCapacity: Int = INITAL_CAPACITY,
    initialBucketCapacity: Int = INITAL_BUCKET_CAPACITY
) : MutableMap<K, V> {
    
    //TODO efficiency
    override val keys: MutableSet<K>
        get() = buckets.filterNotNull().flatMap { it.filterNotNull().map { it.key } }.toMutableSet()

    //TODO efficiency
    override val values: MutableCollection<V>
        get() = buckets.filterNotNull().flatMap { it.filterNotNull().map { it.value } }.toMutableList()

    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    protected val comparator: AbstractEqualityComparator<K>

    // TODO are bucket entries actually nullable?
    protected var buckets: Array<MutableList<Entry<K, V>?>?>

    /** How many elements in set  */
    protected var n = 0

    override val size: Int = n

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
        if (key == null) return null
        val b = getBucket(key)
        val bucket = buckets[b] ?: return null
// no bucket
        for (e in bucket) {
            if (comparator.equals(e?.key, key)) {
                return e?.value
            }
        }
        return null
    }

    override fun put(key: K, value: V): V? {
        if (key == null) return null
        if (n > threshold) expand()
        val b = getBucket(key)

        val existingBucket = buckets[b]
        val bucket: MutableList<Entry<K, V>?> = if (existingBucket != null) existingBucket else {
            buckets[b] = mutableListOf()
            buckets[b]!!
        }

        for (e in bucket) {
            if (comparator.equals(e?.key, key)) {
                val prev = e?.value
                e?.value = value
                n++
                return prev
            }
        }
        // not there
        bucket.add(Entry(key, value))
        n++
        return null
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

        val old = buckets
        // TODO better mode of growing that always size * 2
        val newCapacity = buckets.size * 2
        val newTable = createEntryListArray<K, V>(newCapacity)
        buckets = newTable
        threshold = (newCapacity * LOAD_FACTOR).toInt()
        //		System.out.println("new size="+newCapacity+", thres="+threshold);
        // rehash all existing entries
        val oldSize = size
        for (bucket in old) {
            if (bucket == null) continue
            for (e in bucket) {
                if (e == null) break
                put(e.key, e.value)
            }
        }
        n = oldSize
    }

//    fun size(): Int {
//        return n
//    }

    override fun isEmpty(): Boolean {
        return n == 0
    }

    override fun clear() {
        buckets = createEntryListArray(INITAL_CAPACITY)
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

        private fun <K, V> createEntryListArray(length: Int): Array<MutableList<Entry<K, V>?>?> {
            return arrayOfNulls<List<*>>(length) as Array<MutableList<Entry<K, V>?>?>
        }

    }

}
