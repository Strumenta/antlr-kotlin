package com.strumenta.kotlinmultiplatform

public object Math {
  public fun min(a: Int, b: Int): Int =
    kotlin.math.min(a, b)

  public fun min(a: Long, b: Long): Long =
    kotlin.math.min(a, b)

  public fun max(a: Int, b: Int): Int =
    kotlin.math.max(a, b)

  public fun floor(d: Double): Double =
    kotlin.math.floor(d)
}
