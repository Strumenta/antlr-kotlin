package com.strumenta.kotlinmultiplatform


actual class WeakHashMap<K, V> constructor(_wrapped: MutableMap<K, V>) : MutableMap<K, V> by _wrapped {

    // TODO: Implement a weak hash map
    actual constructor() : this(mutableMapOf())
}
