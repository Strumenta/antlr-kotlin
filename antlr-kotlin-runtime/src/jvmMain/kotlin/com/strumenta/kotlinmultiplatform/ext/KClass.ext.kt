package com.strumenta.kotlinmultiplatform.ext

import kotlin.reflect.KClass

public actual fun KClass<*>.hashCodeCustom(fqn: String): Int =
  hashCode()
