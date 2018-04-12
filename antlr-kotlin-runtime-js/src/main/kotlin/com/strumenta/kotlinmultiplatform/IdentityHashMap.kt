package com.strumenta.kotlinmultiplatform

//TODO what is an IdentityHashMap
actual class IdentityHashMap<K, V> : MutableMap<K, V> by mutableMapOf()