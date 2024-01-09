package com.strumenta.antlrkotlin.runtime

// Note(Edoardo): WASI is single threaded at the moment, so a normal list is good enough
public actual typealias CopyOnWriteArrayList<E> = ArrayList<E>
