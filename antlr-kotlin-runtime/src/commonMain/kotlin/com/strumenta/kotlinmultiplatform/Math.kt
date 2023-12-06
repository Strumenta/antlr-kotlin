package com.strumenta.kotlinmultiplatform

object Math {
  inline fun min(a: Int, b: Int): Int =
    kotlin.math.min(a, b)

  inline fun max(a: Int, b: Int): Int =
    kotlin.math.max(a, b)

  inline fun floor(d: Double): Double =
    kotlin.math.floor(d)
}
