// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

public object Collections {
  public fun <T : Comparable<T>> min(collection: Collection<T>): T =
    collection.minOrNull() ?: throw NoSuchElementException()

  public fun <T : Comparable<T>> max(collection: Collection<T>): T =
    collection.maxOrNull() ?: throw NoSuchElementException()
}
