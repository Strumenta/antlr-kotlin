package com.strumenta.kotlinmultiplatform

import kotlin.reflect.KClass

actual class Type(val javaClass: KClass<*>)

actual fun Type.isInstance(any: Any?): Boolean {
    return javaClass.isInstance(any)
}

actual fun TypeDeclarator.getType(name: String): Type {
    return Type(this.classesByName.find { it.simpleName == name }!!)
}
