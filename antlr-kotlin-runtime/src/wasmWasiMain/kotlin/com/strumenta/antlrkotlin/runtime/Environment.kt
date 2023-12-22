package com.strumenta.antlrkotlin.runtime

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformGetEnv(name: String): String? {
  System.out.println("Not yet supported for WASI")
  return null
}
