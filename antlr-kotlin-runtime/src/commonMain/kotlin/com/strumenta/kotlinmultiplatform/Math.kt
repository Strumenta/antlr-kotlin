package com.strumenta.kotlinmultiplatform

object Math {
  fun min(a: Int, b: Int): Int =
    kotlin.math.min(a, b)

  fun max(a: Int, b: Int): Int =
    kotlin.math.max(a, b)

  fun floor(d: Double): Double =
    kotlin.math.floor(d)
}
