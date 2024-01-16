// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package com.strumenta.antlrkotlin.runtime

// TODO(Edoardo): implement real weak keys.
//  See kotlinlang.org/api/latest/jvm/stdlib/kotlin.native.ref
//  for classes and functions useful for a possible implementation
public actual typealias WeakHashMap<K, V> = HashMap<K, V>
