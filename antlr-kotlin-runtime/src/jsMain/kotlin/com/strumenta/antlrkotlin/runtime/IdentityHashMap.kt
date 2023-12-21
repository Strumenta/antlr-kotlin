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

package com.strumenta.antlrkotlin.runtime

// Note(Edoardo): this is implemented as an HashMap in the JS target,
//  so let's keep it as it is
public actual class IdentityHashMap<K, V>(private val wrapped: LinkedHashMap<K, V> = LinkedHashMap()) : MutableMap<K, V> by wrapped {
  public actual constructor() : this(LinkedHashMap())
}
