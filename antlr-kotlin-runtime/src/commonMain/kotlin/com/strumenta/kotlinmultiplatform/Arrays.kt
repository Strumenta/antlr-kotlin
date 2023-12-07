package com.strumenta.kotlinmultiplatform

public object Arrays {
  public fun equals(a: Array<*>?, b: Array<*>?): Boolean =
    (a == null && b == null) || ((a != null && b != null) && a.contentEquals(b))

  public fun equals(a: IntArray?, b: IntArray?): Boolean =
    (a == null && b == null) || ((a != null && b != null) && a.contentEquals(b))
}
