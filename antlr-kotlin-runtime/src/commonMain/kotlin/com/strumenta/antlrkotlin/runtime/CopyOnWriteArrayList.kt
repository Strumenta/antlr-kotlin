package com.strumenta.antlrkotlin.runtime

public expect class CopyOnWriteArrayList<E>() : MutableList<E> {
  // Convenience constructor to avoid initializing with mutable state
  public constructor(elements: Collection<E>)
}
