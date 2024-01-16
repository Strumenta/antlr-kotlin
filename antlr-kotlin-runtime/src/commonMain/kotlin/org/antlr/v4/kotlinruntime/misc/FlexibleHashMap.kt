// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.misc

import kotlin.math.floor


/**
 * A limited map (many unsupported operations) that lets me use varying hashCode/equals.
 */
@Suppress("MemberVisibilityCanBePrivate", "CanBeParameter")
public open class FlexibleHashMap<K, V>(
  protected val comparator: AbstractEqualityComparator<K> = ObjectEqualityComparator.INSTANCE,
  public val initialCapacity: Int = INITIAL_CAPACITY,
  public val initialBucketCapacity: Int = INITIAL_BUCKET_CAPACITY,
) : MutableMap<K, V> {
  public companion object {
    // Must be power of 2
    public const val INITIAL_CAPACITY: Int = 16
    public const val INITIAL_BUCKET_CAPACITY: Int = 8
    public const val LOAD_FACTOR: Double = 0.75

    private fun <K, V> createEntryListArray(length: Int): Array<MutableList<Entry<K, V>?>?> =
      arrayOfNulls<MutableList<Entry<K, V>?>?>(length)
  }

  public data class Entry<K, V>(
    public val key: K,
    public var value: V,
  ) {
    override fun toString(): String =
      "${key}:${value}"
  }

  protected var buckets: Array<MutableList<Entry<K, V>?>?>

  /**
   * How many elements in set.
   */
  protected var n: Int = 0

  /**
   * Jump by 4 primes each expand or whatever.
   */
  protected var currentPrime: Int = 1

  /**
   * When to expand.
   */
  protected var threshold: Int = 0

  init {
    buckets = createEntryListArray(initialBucketCapacity)
    threshold = floor(initialCapacity * LOAD_FACTOR).toInt()
  }

  override val size: Int
    get() = n

  override val keys: MutableSet<K>
    get() = throw UnsupportedOperationException()

  override val values: MutableCollection<V>
    get() {
      val a = ArrayList<V>(size)

      for (bucket in buckets) {
        if (bucket != null) {
          for (entry in bucket) {
            a.add(entry!!.value)
          }
        }
      }

      return a
    }

  override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
    get() = throw UnsupportedOperationException()

  override fun get(key: K): V? {
    if (key == null) {
      return null
    }

    val b = getBucket(key)
    val bucket = buckets[b] ?: return null // No bucket

    for (e in bucket) {
      if (comparator.equals(e?.key, key)) {
        return e?.value
      }
    }

    return null
  }

  override fun put(key: K, value: V): V? {
    if (key == null) {
      return null
    }

    if (n > threshold) {
      expand()
    }

    val b = getBucket(key)
    val existingBucket = buckets[b]
    val bucket = if (existingBucket != null) {
      existingBucket
    } else {
      // TODO(Edoardo): should be a LinkedList
      val list = ArrayList<Entry<K, V>?>()
      buckets[b] = list
      list
    }

    for (e in bucket) {
      if (comparator.equals(e?.key, key)) {
        val prev = e?.value
        e?.value = value
        n++
        return prev
      }
    }

    // Not there
    bucket.add(Entry(key, value))
    n++
    return null
  }

  override fun remove(key: K): V =
    throw UnsupportedOperationException()

  override fun putAll(from: Map<out K, V>): Unit =
    throw UnsupportedOperationException()

  override fun containsKey(key: K): Boolean =
    get(key) != null

  override fun containsValue(value: V): Boolean =
    throw UnsupportedOperationException()

  override fun hashCode(): Int {
    var hash = MurmurHash.initialize()

    for (bucket in buckets) {
      if (bucket == null) {
        continue
      }

      for (e in bucket) {
        if (e == null) {
          break
        }

        hash = MurmurHash.update(hash, comparator.hashCode(e.key))
      }
    }

    hash = MurmurHash.finish(hash, size)
    return hash
  }

  override fun equals(other: Any?): Boolean =
    throw UnsupportedOperationException()

  protected fun getBucket(key: K): Int {
    val hash = comparator.hashCode(key)
    return hash and buckets.size - 1
  }

  protected fun expand() {
    val old = buckets
    currentPrime += 4

    val newCapacity = buckets.size * 2
    val newTable = createEntryListArray<K, V>(newCapacity)
    buckets = newTable
    threshold = (newCapacity * LOAD_FACTOR).toInt()

    // Rehash all existing entries
    val oldSize = size

    for (bucket in old) {
      if (bucket == null) {
        continue
      }

      for (e in bucket) {
        if (e == null) {
          break
        }

        put(e.key, e.value)
      }
    }

    n = oldSize
  }

  override fun isEmpty(): Boolean =
    n == 0

  override fun clear() {
    n = 0
    buckets = createEntryListArray(initialCapacity)
    threshold = floor(initialCapacity * LOAD_FACTOR).toInt()
  }

  override fun toString(): String {
    if (size == 0) {
      return "{}"
    }

    var first = true
    val buf = StringBuilder()
    buf.append("{")

    for (bucket in buckets) {
      if (bucket == null) {
        continue
      }

      for (e in bucket) {
        if (e == null) {
          break
        }

        if (first) {
          first = false
        } else {
          buf.append(", ")
        }

        buf.append(e.toString())
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

      for (e in bucket) {
        if (first) {
          first = false
        } else {
          buf.append(" ")
        }

        if (e == null) {
          buf.append("_")
        } else {
          buf.append(e.toString())
        }
      }

      buf.append("]\n")
    }

    return buf.toString()
  }
}
