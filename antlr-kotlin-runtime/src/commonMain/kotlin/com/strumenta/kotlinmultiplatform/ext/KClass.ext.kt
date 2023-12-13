package com.strumenta.kotlinmultiplatform.ext

import kotlin.reflect.KClass

public expect fun KClass<*>.hashCodeCustom(fqn: String): Int
