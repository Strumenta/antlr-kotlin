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

import kotlin.reflect.KClass

actual class Type(val javaClass: KClass<*>)

actual fun Type.isInstance(any: Any?): Boolean {
    return javaClass.isInstance(any)
}

actual fun TypeDeclarator.getType(name: String): Type {
    return Type(this.classesByName.find { it.simpleName == name }!!)
}
