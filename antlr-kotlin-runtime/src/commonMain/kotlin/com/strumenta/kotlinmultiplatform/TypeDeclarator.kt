package com.strumenta.kotlinmultiplatform

import kotlin.reflect.KClass

interface TypeDeclarator {
  val classesByName: List<KClass<*>>

  fun getType(name: String): KClass<*> =
    classesByName.first { it.simpleName == name }
}
