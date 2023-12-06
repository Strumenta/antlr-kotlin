package com.strumenta.kotlinmultiplatform.ext

import kotlin.reflect.KClass

expect fun KClass<*>.hashCodeCustom(fqn: String): Int
