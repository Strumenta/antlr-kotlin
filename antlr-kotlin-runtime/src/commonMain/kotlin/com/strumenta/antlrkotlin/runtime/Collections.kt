package com.strumenta.antlrkotlin.runtime

public object Collections {
  public fun <T : Comparable<T>> min(collection: Collection<T>): T =
    collection.minOrNull() ?: throw NoSuchElementException()

  public fun <T : Comparable<T>> max(collection: Collection<T>): T =
    collection.maxOrNull() ?: throw NoSuchElementException()
}
