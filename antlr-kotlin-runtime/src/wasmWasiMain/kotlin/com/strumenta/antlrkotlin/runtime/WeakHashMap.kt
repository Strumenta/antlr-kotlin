package com.strumenta.antlrkotlin.runtime

public actual class WeakHashMap<K, V>(private val wrapped: LinkedHashMap<K, V> = LinkedHashMap()) : MutableMap<K, V> by wrapped {
  public actual constructor() : this(LinkedHashMap())
}
