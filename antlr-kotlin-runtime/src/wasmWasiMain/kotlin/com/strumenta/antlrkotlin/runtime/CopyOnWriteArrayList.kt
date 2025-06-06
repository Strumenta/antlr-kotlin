// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

// Note(Edoardo): WASI is single threaded at the moment, so a normal list is good enough
internal actual typealias CopyOnWriteArrayList<E> = ArrayList<E>
