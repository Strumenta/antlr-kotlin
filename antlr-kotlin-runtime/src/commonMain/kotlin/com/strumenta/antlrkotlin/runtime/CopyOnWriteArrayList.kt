// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

public expect class CopyOnWriteArrayList<E>() : MutableList<E> {
  // Convenience constructor to avoid initializing with mutable state
  public constructor(elements: Collection<E>)
}
