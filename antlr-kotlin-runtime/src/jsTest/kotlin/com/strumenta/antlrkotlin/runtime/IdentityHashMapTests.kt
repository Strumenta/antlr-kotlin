// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import kotlin.collections.MutableMap.MutableEntry
import kotlin.test.*

class IdentityHashMapTests {
  @Test
  fun insertions() {
    val imap = IdentityHashMap<Any, String>()
    var prev = imap.put("one", "two")

    assertNull(prev)
    assertEquals(1, imap.size)
    assertEquals("two", imap["one"])

    prev = imap.put("one", "three")
    assertEquals(1, imap.size)
    assertEquals("two", prev)
    assertEquals("three", imap["one"])

    imap.clear()
    assertTrue(imap.isEmpty())

    val a = A("one")
    prev = imap.put(a, "two")
    assertNull(prev)

    val b = B("one")
    prev = imap.remove(b)
    assertNull(prev)

    prev = imap.remove(a)
    assertEquals("two", prev)
  }

  @Test
  fun containsValue() {
    val imap = IdentityHashMap<String, A>()
    val a = A("one")
    imap["one"] = A("one")
    imap["two"] = a
    imap["three"] = A("one")

    assertFalse(imap.containsValue(A("one")))
    assertTrue(imap.containsValue(a))
  }

  @Test
  fun keysIterator() {
    val imap = IdentityHashMap<Any, String>()
    val one = A("one")
    imap[one] = "value-one"
    imap["two"] = "value-two"

    val keys = imap.keys
    val iterator = keys.iterator()
    assertTrue(iterator.hasNext())
    assertSame(one, iterator.next())
    assertEquals("two", iterator.next())
    assertFalse(iterator.hasNext())

    iterator.remove()
    assertEquals(1, imap.size)
    assertEquals("value-one", imap[one])

    assertFailsWith(UnsupportedOperationException::class) {
      keys.add("three")
    }

    assertFailsWith(UnsupportedOperationException::class) {
      keys.addAll(listOf("four", "five"))
    }
  }

  @Test
  fun missingKey() {
    val imap = IdentityHashMap<Any?, String>()
    assertSame(null, imap["missing"])
  }

  @Test
  fun nullKeys() {
    val imap = IdentityHashMap<Any?, A>()
    imap[null] = A("one")
    assertEquals(1, imap.size)

    val two = A("two")
    imap[null] = two
    assertEquals(1, imap.size)
    assertSame(two, imap[null])

    val entries = imap.entries
    assertTrue(entries.contains(TestEntry(null, two)))
    assertFalse(entries.contains(TestEntry(null, A("two"))))

    val eiter = entries.iterator()
    assertTrue(eiter.hasNext())

    val next = eiter.next()
    assertSame(null, next.key)
    assertSame(two, next.value)

    val newValue = A("new")
    next.setValue(newValue)
    assertSame(newValue, imap[null])

    eiter.remove()
    assertTrue(imap.isEmpty())
  }

  @Test
  fun nullValues() {
    val imap = IdentityHashMap<Int, String?>()
    imap[0] = "zero"
    imap[1] = null
    imap[2] = null

    assertEquals(3, imap.size)
    assertEquals("zero", imap[0])
    assertSame(null, imap[1])
    assertSame(null, imap[2])
  }

  @Test
  fun removeAll() {
    val imap = IdentityHashMap<Int, String>()
    imap[0] = "zero"
    imap[1] = "one"
    imap[2] = "two"
    imap[10] = "ten"
    imap[20] = "twenty"

    assertEquals(5, imap.size)

    val keys = imap.keys
    assertFalse(keys.removeAll(listOf(-1, 11)))
    assertEquals(5, imap.size)

    assertTrue(keys.removeAll(listOf(1, 15, 19)))
    assertEquals(4, imap.size)
  }

  interface S {
    val s: String
  }

  class A(override val s: String) : S {
    override fun equals(other: Any?): Boolean =
      other is S && s == other.s

    override fun hashCode(): Int =
      s.hashCode()
  }

  class B(override val s: String) : S {
    override fun equals(other: Any?): Boolean =
      other is S && s == other.s

    override fun hashCode(): Int =
      s.hashCode()
  }

  class TestEntry<K, V>(override val key: K, override val value: V) : MutableEntry<K, V> {
    override fun setValue(newValue: V): V =
      throw UnsupportedOperationException()
  }
}
