package com.strumenta.kotlinmultiplatform

actual class Type(val javaClass: JsClass<*>)

actual fun Type.isInstance(any: Any?): Boolean {
    return javaClass.kotlin.isInstance(any)
}

actual fun TypeDeclarator.getType(name: String) : Type {
    //TODO("Type getType is not implemented. TypeDeclarator: $this, name: $name")

    return Type(this.classesByName.find { it.simpleName == name }!!.js)
//    var currName = name
//    while (currName.startsWith("../")) {
//        currName = currName.substring("../".length)
//        container = container.kotlin.
//    }
    //return Type(container.kotlin.nestedClasses.find { it.simpleName == currName }!!)
}