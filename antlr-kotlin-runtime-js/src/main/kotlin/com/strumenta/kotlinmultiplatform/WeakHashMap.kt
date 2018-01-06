package com.strumenta.kotlinmultiplatform

actual class WeakHashMap<K, V> constructor(val _wrapped : LinkedHashMap<K, V> = LinkedHashMap<K, V>()) : MutableMap<K, V> by _wrapped {

    actual constructor() : this(LinkedHashMap<K, V>())
}