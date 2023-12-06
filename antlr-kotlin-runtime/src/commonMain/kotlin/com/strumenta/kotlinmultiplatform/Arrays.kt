package com.strumenta.kotlinmultiplatform

object Arrays {
  fun equals(a: Array<*>?, b: Array<*>?): Boolean =
    (a == null && b == null) || ((a != null && b != null) && a.contentEquals(b))

  fun equals(a: IntArray?, b: IntArray?): Boolean =
    (a == null && b == null) || ((a != null && b != null) && a.contentEquals(b))
}
