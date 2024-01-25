// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

public expect class CopyOnWriteArrayList<E>() : MutableList<E> {
  // Convenience constructor to avoid initializing with mutable state
  public constructor(elements: Collection<E>)

  override val size: Int
  override fun contains(element: E): Boolean
  override fun containsAll(elements: Collection<E>): Boolean
  override fun get(index: Int): E
  override fun indexOf(element: E): Int
  override fun isEmpty(): Boolean
  override fun iterator(): MutableIterator<E>
  override fun lastIndexOf(element: E): Int
  override fun add(element: E): Boolean
  override fun add(index: Int, element: E)
  override fun addAll(index: Int, elements: Collection<E>): Boolean
  override fun addAll(elements: Collection<E>): Boolean
  override fun clear()
  override fun listIterator(): MutableListIterator<E>
  override fun listIterator(index: Int): MutableListIterator<E>
  override fun remove(element: E): Boolean
  override fun removeAll(elements: Collection<E>): Boolean
  override fun removeAt(index: Int): E
  override fun retainAll(elements: Collection<E>): Boolean
  override fun set(index: Int, element: E): E
  override fun subList(fromIndex: Int, toIndex: Int): MutableList<E>
}
