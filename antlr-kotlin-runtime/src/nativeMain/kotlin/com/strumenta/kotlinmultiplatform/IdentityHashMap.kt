package com.strumenta.kotlinmultiplatform

// TODO what is an identityhashmap?
actual class IdentityHashMap<K, V> : MutableMap<K, V> by emptyMap<K, V>().toMutableMap()
