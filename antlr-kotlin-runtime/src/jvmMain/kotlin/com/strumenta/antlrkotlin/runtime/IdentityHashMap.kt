// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

import java.util.IdentityHashMap as JavaIdentityHashMap

@Suppress("ACTUAL_WITHOUT_EXPECT")
internal actual typealias IdentityHashMap<K, V> = JavaIdentityHashMap<K, V>
