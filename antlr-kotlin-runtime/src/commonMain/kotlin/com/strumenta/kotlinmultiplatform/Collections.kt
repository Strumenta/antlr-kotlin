package com.strumenta.kotlinmultiplatform

public object Collections {
  public fun <T : Comparable<T>> min(precedencePredicates: List<T>): T =
    precedencePredicates.minOrNull() ?: throw NoSuchElementException()

  public fun <T : Comparable<T>> max(precedencePredicates: List<T>): T =
    precedencePredicates.maxOrNull() ?: throw NoSuchElementException()
}
