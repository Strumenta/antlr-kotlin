// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.misc

import kotlin.js.JsName

/**
 * A HashMap that remembers the order that the elements were added.
 * You can alter the ith element with set(i,value) too :)  Unique list.
 * I need the replace/set-element-i functionality, so I'm subclassing
 * LinkedHashSet.
 */
public open class OrderedHashSet<T> private constructor(
  private val delegate: LinkedHashSet<T>,
) : MutableSet<T> by delegate {
  public constructor() : this(LinkedHashSet())

  /**
   * Track the elements as they are added to the set.
   */
  @JsName("myElements")
  protected var elements: ArrayList<T> = ArrayList()

  public fun get(i: Int): T =
    elements[i]

  /**
   * Replace an existing value with a new value; updates the element
   * list and the hash table, but not the key as that has not changed.
   */
  public fun set(i: Int, value: T): T {
    val oldElement = elements[i]
    elements[i] = value         // Update list
    delegate.remove(oldElement)   // Now update the set: remove/add
    delegate.add(value)
    return oldElement
  }

  public fun remove(i: Int): Boolean {
    val o = elements.removeAt(i)
    return delegate.remove(o)
  }

  /**
   * Add a value to list. Keep in hashtable for consistency also.
   * Key is object itself. Good for say asking if a certain string is in a list of strings.
   */
  public override fun add(element: T): Boolean {
    val result = delegate.add(element)

    if (result) {
      // Only track if new element not in set
      elements.add(element)
    }

    return result
  }

  public override fun remove(element: T): Boolean =
    throw UnsupportedOperationException()

  public override fun clear() {
    elements.clear()
    delegate.clear()
  }

  public override fun hashCode(): Int =
    elements.hashCode()

  public override fun equals(other: Any?): Boolean =
    other is OrderedHashSet<*> && elements == other.elements

  public override fun iterator(): MutableIterator<T> =
    elements.iterator()

  /**
   * Return the List holding list of table elements.
   * Note that you are NOT getting a copy so don't write to the list.
   */
  public fun elements(): List<T> =
    elements

  public override fun toString(): String =
    elements.toString()
}
