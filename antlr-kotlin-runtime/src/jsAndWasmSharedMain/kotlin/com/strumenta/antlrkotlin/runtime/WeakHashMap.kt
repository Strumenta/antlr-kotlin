// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.

package com.strumenta.antlrkotlin.runtime

// Note(Edoardo): this is implemented as an HashMap in the JS target,
//  so let's keep it as it is
public actual typealias WeakHashMap<K, V> = HashMap<K, V>
