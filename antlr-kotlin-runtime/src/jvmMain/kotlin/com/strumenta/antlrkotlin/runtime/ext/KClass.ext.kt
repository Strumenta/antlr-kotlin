package com.strumenta.antlrkotlin.runtime.ext

import kotlin.reflect.KClass

public actual fun KClass<*>.hashCodeCustom(fqn: String): Int =
  hashCode()
