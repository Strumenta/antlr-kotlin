package com.strumenta.kotlinmultiplatform

object Collections {
  fun <T : Comparable<T>> min(precedencePredicates: List<T>): T =
    precedencePredicates.minOrNull() ?: throw NoSuchElementException()

  fun <T : Comparable<T>> max(precedencePredicates: List<T>): T =
    precedencePredicates.maxOrNull() ?: throw NoSuchElementException()
}
