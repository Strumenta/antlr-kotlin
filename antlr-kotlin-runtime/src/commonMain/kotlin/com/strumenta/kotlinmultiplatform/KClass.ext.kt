package com.strumenta.kotlinmultiplatform

import kotlin.reflect.KClass

expect fun KClass<*>.hashCodeCustom(fqn: String): Int
