package com.strumenta.kotlinmultiplatform.ext

import kotlin.reflect.KClass

actual fun KClass<*>.hashCodeCustom(fqn: String): Int =
  hashCode()
