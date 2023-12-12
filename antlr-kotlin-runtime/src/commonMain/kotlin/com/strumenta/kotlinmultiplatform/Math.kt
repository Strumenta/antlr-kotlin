package com.strumenta.kotlinmultiplatform

public object Math {
  public inline fun min(a: Int, b: Int): Int =
    kotlin.math.min(a, b)

  public inline fun max(a: Int, b: Int): Int =
    kotlin.math.max(a, b)

  public inline fun floor(d: Double): Double =
    kotlin.math.floor(d)
}
