package com.strumenta.kotlinmultiplatform

import kotlin.reflect.KClass

actual fun KClass<*>.hashCodeCustom(fqn: String): Int {
  return fqn.hashCode()
}
