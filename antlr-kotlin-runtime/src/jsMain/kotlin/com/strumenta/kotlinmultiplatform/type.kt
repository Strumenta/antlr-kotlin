/*
 * Copyright (C) 2021 Strumenta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.strumenta.kotlinmultiplatform

actual class Type(val javaClass: JsClass<*>)

actual fun Type.isInstance(any: Any?): Boolean {
    return javaClass.kotlin.isInstance(any)
}

actual fun TypeDeclarator.getType(name: String): Type {
    //TODO("Type getType is not implemented. TypeDeclarator: $this, name: $name")

    return Type(this.classesByName.find { it.simpleName == name }!!.js)
//    var currName = name
//    while (currName.startsWith("../")) {
//        currName = currName.substring("../".length)
//        container = container.kotlin.
//    }
    //return Type(container.kotlin.nestedClasses.find { it.simpleName == currName }!!)
}
