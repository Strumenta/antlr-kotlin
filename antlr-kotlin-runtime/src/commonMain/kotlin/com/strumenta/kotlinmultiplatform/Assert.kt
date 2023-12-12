package com.strumenta.kotlinmultiplatform

public inline fun assert(condition: Boolean): Unit =
  require(condition)
