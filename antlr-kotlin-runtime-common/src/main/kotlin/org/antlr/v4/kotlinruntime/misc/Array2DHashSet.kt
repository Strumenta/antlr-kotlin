/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.Math
import com.strumenta.kotlinmultiplatform.assert

/** [Set] implementation with closed hashing (open addressing).  */
open class Array2DHashSet<T> constructor(comparator: AbstractEqualityComparator<in T>? = null, initialCapacity: Int = INITAL_CAPACITY, initialBucketCapacity: Int = INITAL_BUCKET_CAPACITY) : MutableSet<T> {

    override fun remove(element: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    protected val comparator: AbstractEqualityComparator<in T>

    protected var buckets: Array<Array<T>>

    /** How many elements in set  */
    protected var n = 0

    protected var threshold = Math.floor(INITAL_CAPACITY * LOAD_FACTOR).toInt() // when to expand

    protected var currentPrime = 1 // jump by 4 primes each expand or whatever
    protected var initialBucketCapacity = INITAL_BUCKET_CAPACITY

    init {
        var comparator = comparator
        if (comparator == null) {
            comparator = ObjectEqualityComparator.INSTANCE
        }

        this.comparator = comparator
        this.buckets = createBuckets(initialCapacity) as Array<Array<T>>
        this.initialBucketCapacity = initialBucketCapacity
    }

    /**
     * Add `o` to set if not there; return existing value if already
     * there. This method performs the same operation as [.add] aside from
     * the return value.
     */
    fun getOrAdd(o: T): T {
        if (n > threshold) expand()
        return getOrAddImpl(o)
    }

    protected fun getOrAddImpl(o: T): T {
        val b = getBucket(o)
        var bucket: Array<T>? = buckets[b]

        // NEW BUCKET
        if (bucket == null) {
            bucket = createBucket(initialBucketCapacity) as Array<T>
            bucket[0] = o
            buckets[b] = bucket
            n++
            return o
        }

        // LOOK FOR IT IN BUCKET
        for (i in bucket.indices) {
            val existing = bucket[i]
            if (existing == null) { // empty slot; not there, add.
                bucket[i] = o
                n++
                return o
            }
            if (comparator.equals(existing, o)) return existing // found existing, quit
        }

        // FULL BUCKET, expand and add to end
        val oldLength = bucket.size
        bucket = Arrays.copyOf(bucket, bucket.size * 2)
        buckets[b] = bucket
        bucket[oldLength] = o // add to end
        n++
        return o
    }

    operator fun get(o: T?): T? {
        if (o == null) return o
        val b = getBucket(o)
        val bucket = buckets[b] ?: return null
// no bucket
        for (e in bucket) {
            if (e == null) return null // empty slot; not there
            if (comparator.equals(e, o)) return e
        }
        return null
    }

    protected fun getBucket(o: T): Int {
        val hash = comparator.hashCode(o)
        return hash and buckets.size - 1
    }

    override fun hashCode(): Int {
        var hash = MurmurHash.initialize()
        for (bucket in buckets) {
            if (bucket == null) continue
            for (o in bucket) {
                if (o == null) break
                hash = MurmurHash.update(hash, comparator.hashCode(o))
            }
        }

        hash = MurmurHash.finish(hash, size)
        return hash
    }

    override fun equals(o: Any?): Boolean {
        if (o === this) return true
        if (o !is Array2DHashSet<*>) return false
        val other = o as Array2DHashSet<*>?
        return if (other!!.size != size) false else containsAll(other)
    }

    protected fun expand() {
        val old = buckets
        currentPrime += 4
        val newCapacity = buckets.size * 2
        val newTable = createBuckets(newCapacity)
        val newBucketLengths = IntArray(newTable.size)
        buckets = newTable as Array<Array<T>>
        threshold = (newCapacity * LOAD_FACTOR).toInt()
        //		System.out.println("new size="+newCapacity+", thres="+threshold);
        // rehash all existing entries
        val oldSize = size
        for (bucket in old) {
            if (bucket == null) {
                continue
            }

            for (o in bucket) {
                if (o == null) {
                    break
                }

                val b = getBucket(o)
                val bucketLength = newBucketLengths[b]
                var newBucket: Array<T>
                if (bucketLength == 0) {
                    // new bucket
                    newBucket = createBucket(initialBucketCapacity) as Array<T>
                    newTable[b] = newBucket
                } else {
                    newBucket = newTable[b]
                    if (bucketLength == newBucket.size) {
                        // expand
                        newBucket = Arrays.copyOf(newBucket, newBucket.size * 2)
                        newTable[b] = newBucket
                    }
                }

                newBucket[bucketLength] = o
                newBucketLengths[b]++
            }
        }

        assert(n == oldSize)
    }

    override val size: Int
        get() = n

    override fun add(t: T): Boolean {
        val existing = getOrAdd(t)
        return existing === t
    }

    override fun isEmpty(): Boolean {
        return n == 0
    }
//
//    operator fun contains(o: Any): Boolean {
//        return containsFast(asElementType(o))
//    }

    override fun contains(element: T): Boolean {
        return containsFast(element)
    }

    fun containsFast(obj: T?): Boolean {
        return if (obj == null) {
            false
        } else get(obj) != null

    }

    override fun iterator(): MutableIterator<T> {
        TODO()
        //return SetIterator(toTypedArray())
    }

    fun toArray(): Array<T> {
        val a = createBucket(size)
        var i = 0
        for (bucket in buckets) {
            if (bucket == null) {
                continue
            }

            for (o in bucket) {
                if (o == null) {
                    break
                }

                a[i++] = o
            }
        }

        return a as Array<T>
    }

    fun <U> toArray(a: Array<U>): Array<U> {
        var a = a
        if (a.size < size) {
            a = Arrays.copyOf(a, size)
        }

        var i = 0
        for (bucket in buckets) {
            if (bucket == null) {
                continue
            }

            for (o in bucket) {
                if (o == null) {
                    break
                }

                val targetElement = o as U// array store will check this
                a[i++] = targetElement
            }
        }
        return a
    }

//    fun remove(o: Any): Boolean {
//        return removeFast(asElementType(o))
//    }

    fun removeFast(obj: T?): Boolean {
        if (obj == null) {
            return false
        }

        val b = getBucket(obj)
        val bucket = buckets[b] ?: // no bucket
                return false

        for (i in bucket.indices) {
            val e = bucket[i] ?: // empty slot; not there
                    return false

            if (comparator.equals(e, obj)) {          // found it
                TODO()
                // shift all elements to the right down one
//                System.arraycopy(bucket, i + 1, bucket, i, bucket.size - i - 1)
//                bucket[bucket.size - 1] = null
//                n--
//                return true
            }
        }

        return false
    }

//    fun containsAll(collection: Collection<*>): Boolean {
//        TODO()
////        if (collection is Array2DHashSet<*>) {
////            val s = collection as Array2DHashSet<*>
////            for (bucket in s.buckets) {
////                if (bucket == null) continue
////                for (o in bucket) {
////                    if (o == null) break
////                    if (!this.containsFast(asElementType(o))) return false
////                }
////            }
////        } else {
////            for (o in collection) {
////                if (!this.containsFast(asElementType(o))) return false
////            }
////        }
////        return true
//    }

    override fun addAll(c: Collection<out T>): Boolean {
        var changed = false
        for (o in c) {
            val existing = getOrAdd(o)
            if (existing !== o) changed = true
        }
        return changed
    }
//
//    fun retainAll(c: Collection<*>): Boolean {
//        TODO()
////        var newsize = 0
////        for (bucket in buckets) {
////            if (bucket == null) {
////                continue
////            }
////
////            var i: Int
////            var j: Int
////            i = 0
////            j = 0
////            while (i < bucket.size) {
////                if (bucket[i] == null) {
////                    break
////                }
////
////                if (!c.contains(bucket[i])) {
////                    // removed
////                    i++
////                    continue
////                }
////
////                // keep
////                if (i != j) {
////                    bucket[j] = bucket[i]
////                }
////
////                j++
////                newsize++
////                i++
////            }
////
////            newsize += j
////
////            while (j < i) {
////                bucket[j] = null
////                j++
////            }
////        }
////
////        val changed = newsize != n
////        n = newsize
////        return changed
//    }


    override fun removeAll(elements: Collection<T>): Boolean {
        TODO()
//        var changed = false
//        for (o in elements) {
//            changed = changed or removeFast(asElementType(o))
//        }
//        return changed
    }


    override fun clear() {
        buckets = createBuckets(INITAL_CAPACITY) as Array<Array<T>>
        n = 0
        threshold = Math.floor(INITAL_CAPACITY * LOAD_FACTOR).toInt()
    }

    override fun toString(): String {
        if (size == 0) return "{}"

        val buf = StringBuilder()
        buf.append('{')
        var first = true
        for (bucket in buckets) {
            if (bucket == null) continue
            for (o in bucket) {
                if (o == null) break
                if (first)
                    first = false
                else
                    buf.append(", ")
                buf.append(o.toString())
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
            for (o in bucket) {
                if (first)
                    first = false
                else
                    buf.append(" ")
                if (o == null)
                    buf.append("_")
                else
                    buf.append(o.toString())
            }
            buf.append("]\n")
        }
        return buf.toString()
    }

    /**
     * Return `o` as an instance of the element type `T`. If
     * `o` is non-null but known to not be an instance of `T`, this
     * method returns `null`. The base implementation does not perform any
     * type checks; override this method to provide strong type checks for the
     * [.contains] and [.remove] methods to ensure the arguments to
     * the [EqualityComparator] for the set always have the expected
     * types.
     *
     * @param o the object to try and cast to the element type of the set
     * @return `o` if it could be an instance of `T`, otherwise
     * `null`.
     */
    protected open fun asElementType(o: Any): T? {
        return o as T?
    }

    /**
     * Return an array of `T[]` with length `capacity`.
     *
     * @param capacity the length of the array to return
     * @return the newly constructed array
     */
    protected open fun createBuckets(capacity: Int): Array<Array<T>?> {
        return arrayOfNulls<Array<Any>>(capacity) as Array<Array<T>?>
    }

    /**
     * Return an array of `T` with length `capacity`.
     *
     * @param capacity the length of the array to return
     * @return the newly constructed array
     */
    protected open fun createBucket(capacity: Int): Array<T?> {
        return arrayOfNulls<Any>(capacity) as Array<T?>
    }

    protected inner class SetIterator(internal val data: Array<T>) : MutableIterator<T> {
        internal var nextIndex = 0
        internal var removed = true

        override fun hasNext(): Boolean {
            return nextIndex < data.size
        }

        override fun next(): T {
            if (!hasNext()) {
                throw NoSuchElementException()
            }

            removed = false
            return data[nextIndex++]
        }

        override fun remove() {
            if (removed) {
                throw IllegalStateException()
            }

            this@Array2DHashSet.remove(data[nextIndex - 1])
            removed = true
        }
    }

    companion object {
        val INITAL_CAPACITY = 16 // must be power of 2
        val INITAL_BUCKET_CAPACITY = 8
        val LOAD_FACTOR = 0.75
    }
}
