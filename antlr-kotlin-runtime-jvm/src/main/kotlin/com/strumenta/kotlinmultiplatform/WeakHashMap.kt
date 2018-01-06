package com.strumenta.kotlinmultiplatform


actual class WeakHashMap<K, V> constructor(val _wrapped : java.util.WeakHashMap<K, V> = java.util.WeakHashMap<K, V>()) : MutableMap<K, V> by _wrapped {

    actual constructor() : this(java.util.WeakHashMap<K, V>())
}