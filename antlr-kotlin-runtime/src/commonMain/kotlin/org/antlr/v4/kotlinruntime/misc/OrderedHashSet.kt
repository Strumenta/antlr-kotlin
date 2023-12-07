/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.misc

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
   *
   * Note(Edoardo): renamed from "elements" to "myElements" to avoid a JS name clash
   */
  protected var myElements: ArrayList<T> = ArrayList()

  public fun get(i: Int): T =
    myElements[i]

  /**
   * Replace an existing value with a new value; updates the element
   * list and the hash table, but not the key as that has not changed.
   */
  public fun set(i: Int, value: T): T {
    val oldElement = myElements[i]
    myElements[i] = value         // Update list
    delegate.remove(oldElement)   // Now update the set: remove/add
    delegate.add(value)
    return oldElement
  }

  public fun remove(i: Int): Boolean {
    val o = myElements.removeAt(i)
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
      myElements.add(element)
    }

    return result
  }

  public override fun remove(element: T): Boolean =
    throw UnsupportedOperationException()

  public override fun clear() {
    myElements.clear()
    delegate.clear()
  }

  public override fun hashCode(): Int =
    myElements.hashCode()

  public override fun equals(other: Any?): Boolean =
    other is OrderedHashSet<*> && myElements == other.myElements

  public override fun iterator(): MutableIterator<T> =
    myElements.iterator()

  /**
   * Return the List holding list of table elements.
   * Note that you are NOT getting a copy so don't write to the list.
   */
  public fun elements(): List<T> =
    myElements

  public override fun toString(): String =
    myElements.toString()
}
