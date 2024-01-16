// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

// Note(Edoardo): JS is single threaded, so a normal list is good enough
public actual typealias CopyOnWriteArrayList<E> = ArrayList<E>
