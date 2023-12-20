package com.strumenta.antlrkotlin.runtime.ext

import kotlin.reflect.KClass

public expect fun KClass<*>.hashCodeCustom(fqn: String): Int
