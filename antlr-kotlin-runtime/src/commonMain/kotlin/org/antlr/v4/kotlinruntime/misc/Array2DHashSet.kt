// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.misc

import com.strumenta.antlrkotlin.runtime.assert
import kotlin.math.floor

/**
 * Set implementation with closed hashing (open addressing).
 */
@Suppress("MemberVisibilityCanBePrivate")
public open class Array2DHashSet<T>(
  protected val comparator: AbstractEqualityComparator<T> = ObjectEqualityComparator.INSTANCE,
  protected val initialCapacity: Int = INITIAL_CAPACITY,
  protected val initialBucketCapacity: Int = INITIAL_BUCKET_CAPACITY,
) : MutableSet<T> {
  public companion object {
    public const val INITIAL_CAPACITY: Int = 16 // Must be power of 2
    public const val INITIAL_BUCKET_CAPACITY: Int = 8
    public const val LOAD_FACTOR: Double = 0.75
  }

  protected var buckets: Array<Array<T?>?>

  /**
   * How many elements in set.
   */
  protected var n: Int = 0
  protected var currentPrime: Int = 1 // Jump by 4 primes each expand or whatever

  /**
   * When to expand.
   */
  protected var threshold: Int = 0

  init {
    @Suppress("LeakingThis")
    buckets = createBuckets(initialCapacity)
    threshold = floor(initialCapacity * LOAD_FACTOR).toInt()
  }

  /**
   * Add [o] to set if not there, or return existing value if already there.
   *
   * This method performs the same operation as [add] aside from the return value.
   */
  public fun getOrAdd(o: T): T {
    if (n > threshold) {
      expand()
    }

    return getOrAddImpl(o)
  }

  protected fun getOrAddImpl(o: T): T {
    val b = getBucket(o)
    var bucket = buckets[b]

    // New bucket
    if (bucket == null) {
      bucket = createBucket(initialBucketCapacity)
      bucket[0] = o
      buckets[b] = bucket
      n++
      return o
    }

    // Look for it in bucket
    for (i in bucket.indices) {
      val existing = bucket[i]

      if (existing == null) {
        // Empty slot; not there, add
        bucket[i] = o
        n++
        return o
      }

      if (comparator.equals(existing, o)) {
        // Found existing, quit
        return existing
      }
    }

    // Full bucket, expand and add to end
    val oldLength = bucket.size
    bucket = bucket.copyOf(bucket.size * 2)
    buckets[b] = bucket
    bucket[oldLength] = o // Add to end
    n++
    return o
  }

  public operator fun get(o: T?): T? {
    if (o == null) {
      return o
    }

    val b = getBucket(o)
    val bucket = buckets[b] ?: return null // No bucket

    for (e in bucket) {
      if (e == null) {
        // Empty slot; not there
        return null
      }

      if (comparator.equals(e, o)) {
        return e
      }
    }

    return null
  }

  protected fun getBucket(o: T): Int {
    val hash = comparator.hashCode(o)
    return hash and (buckets.size - 1)
  }

  override fun hashCode(): Int {
    var hash = MurmurHash.initialize()

    for (bucket in buckets) {
      if (bucket == null) {
        continue
      }

      for (o in bucket) {
        if (o == null) {
          break
        }

        hash = MurmurHash.update(hash, comparator.hashCode(o))
      }
    }

    hash = MurmurHash.finish(hash, size)
    return hash
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) {
      return true
    }

    if (other !is Array2DHashSet<*>) {
      return false
    }

    return other.size == size && containsAll(other)
  }

  protected fun expand() {
    val old = buckets
    currentPrime += 4

    val newCapacity = buckets.size * 2
    val newTable = createBuckets(newCapacity)
    val newBucketLengths = IntArray(newTable.size)

    buckets = newTable
    threshold = (newCapacity * LOAD_FACTOR).toInt()

    // Rehash all existing entries
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
        var newBucket: Array<T?>

        if (bucketLength == 0) {
          // New bucket
          newBucket = createBucket(initialBucketCapacity)
          newTable[b] = newBucket
        } else {
          newBucket = newTable[b]!!

          if (bucketLength == newBucket.size) {
            // Expand
            newBucket = newBucket.copyOf(newBucket.size * 2)
            newTable[b] = newBucket
          }
        }

        newBucket[bucketLength] = o
        newBucketLengths[b]++
      }
    }

    assert(n == oldSize)
  }

  override fun add(element: T): Boolean {
    val existing = getOrAdd(element)
    return existing === element
  }

  override val size: Int
    get() = n

  override fun isEmpty(): Boolean =
    n == 0

  override fun contains(element: T): Boolean =
    containsFast(element)

  public fun containsFast(obj: T?): Boolean =
    if (obj == null) {
      false
    } else {
      get(obj) != null
    }

  override fun iterator(): MutableIterator<T> =
    SetIterator(toArray())

  public fun toArray(): Array<T> {
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

    // Note(Edoardo): we know all elements are non-null
    @Suppress("UNCHECKED_CAST")
    return a as Array<T>
  }

  public fun <U> toArray(a: Array<U>): Array<U> {
    @Suppress("NAME_SHADOWING")
    var a = a

    if (a.size < size) {
      @Suppress("UNCHECKED_CAST")
      a = a.copyOf(size) as Array<U>
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

        @Suppress("UNCHECKED_CAST") // Array store will check this
        val targetElement = o as U
        a[i++] = targetElement
      }
    }

    return a
  }

  override fun remove(element: T): Boolean =
    removeFast(asElementType(element))

  public fun removeFast(obj: T?): Boolean {
    if (obj == null) {
      return false
    }

    val b = getBucket(obj)
    val bucket = buckets[b] ?: return false // No bucket

    for (i in bucket.indices) {
      val e = bucket[i] ?: return false // Empty slot; not there

      if (comparator.equals(e, obj)) {
        // Found it.
        // Shift all elements to the right down one
        bucket.copyInto(bucket, i, i + 1, bucket.size)
        bucket[bucket.size - 1] = null
        n--
        return true
      }
    }

    return false
  }

  override fun containsAll(elements: Collection<T>): Boolean {
    if (elements is Array2DHashSet<*>) {
      for (bucket in buckets) {
        if (bucket == null) {
          continue
        }

        for (o in bucket) {
          if (o == null) {
            break
          }

          if (!containsFast(asElementType(o))) {
            return false
          }
        }
      }
    } else {
      for (o in elements) {
        if (o != null && !containsFast(asElementType(o))) {
          return false
        }
      }
    }

    return true
  }

  override fun addAll(elements: Collection<T>): Boolean {
    var changed = false

    for (o in elements) {
      val existing = getOrAdd(o)

      if (existing !== o) {
        changed = true
      }
    }

    return changed
  }

  override fun retainAll(elements: Collection<T>): Boolean {
    var newSize = 0

    for (bucket in buckets) {
      if (bucket == null) {
        continue
      }

      var i = 0
      var j = 0

      while (i < bucket.size) {
        if (bucket[i] == null) {
          break
        }

        if (!elements.contains(bucket[i])) {
          // Removed
          i++
          continue
        }

        // Keep
        if (i != j) {
          bucket[j] = bucket[i]
        }

        i++
        j++
        newSize++
      }

      newSize += j

      while (j < i) {
        bucket[j] = null
        j++
      }
    }

    val changed = newSize != n
    n = newSize
    return changed
  }

  override fun removeAll(elements: Collection<T>): Boolean {
    var changed = false

    for (o in elements) {
      changed = changed or removeFast(asElementType(o))
    }

    return changed
  }

  override fun clear() {
    n = 0
    buckets = createBuckets(initialCapacity)
    threshold = floor(initialCapacity * LOAD_FACTOR).toInt()
  }

  override fun toString(): String {
    if (size == 0) {
      return "{}"
    }

    val buf = StringBuilder()
    buf.append("{")

    var first = true

    for (bucket in buckets) {
      if (bucket == null) continue

      for (o in bucket) {
        if (o == null) {
          break
        }

        if (first) {
          first = false
        } else {
          buf.append(", ")
        }

        buf.append(o.toString())
      }
    }

    buf.append("}")
    return buf.toString()
  }

  @Suppress("DuplicatedCode")
  public fun toTableString(): String {
    val buf = StringBuilder()

    for (bucket in buckets) {
      if (bucket == null) {
        buf.append("null\n")
        continue
      }

      buf.append("[")
      var first = true

      for (o in bucket) {
        if (first) {
          first = false
        } else {
          buf.append(" ")
        }

        if (o == null) {
          buf.append("_")
        } else {
          buf.append(o.toString())
        }
      }

      buf.append("]\n")
    }

    return buf.toString()
  }

  /**
   * Return [o] as an instance of the element type [T].
   *
   * If [o] is non-`null` but known to not be an instance of [T], this
   * method returns `null`. The base implementation does not perform any
   * type checks.
   *
   * Override this method to provide strong type checks for the
   * [contains] and [remove] methods to ensure the arguments to
   * the [EqualityComparator] for the set always have the expected
   * types.
   *
   * @param o the object to try and cast to the element type of the set
   * @return [o] if it could be an instance of [T], otherwise `null`.
   */
  @Suppress("UNCHECKED_CAST")
  protected open fun asElementType(o: Any?): T? =
    o as T?

  /**
   * Return an array of `T[]` with length [capacity].
   *
   * @param capacity The length of the array to return
   * @return The newly constructed array
   */
  @Suppress("UNCHECKED_CAST")
  protected open fun createBuckets(capacity: Int): Array<Array<T?>?> =
    arrayOfNulls<Array<Any?>?>(capacity) as Array<Array<T?>?>

  /**
   * Return an array of [T] with length [capacity].
   *
   * @param capacity The length of the array to return
   * @return The newly constructed array
   */
  @Suppress("UNCHECKED_CAST")
  protected open fun createBucket(capacity: Int): Array<T?> =
    arrayOfNulls<Any?>(capacity) as Array<T?>

  protected inner class SetIterator(internal val data: Array<T>) : MutableIterator<T> {
    internal var nextIndex = 0
    internal var removed = true

    override fun hasNext(): Boolean =
      nextIndex < data.size

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
}
