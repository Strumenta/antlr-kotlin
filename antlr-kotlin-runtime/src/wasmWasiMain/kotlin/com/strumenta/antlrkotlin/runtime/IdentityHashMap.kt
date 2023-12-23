package com.strumenta.antlrkotlin.runtime

// TODO(Edoardo): implement real identity comparison
public actual class IdentityHashMap<K, V>(private val wrapped: LinkedHashMap<K, V> = LinkedHashMap()) : MutableMap<K, V> by wrapped {
  public actual constructor() : this(LinkedHashMap())
}
