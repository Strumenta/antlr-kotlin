package com.strumenta.kotlinmultiplatform

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun platformGetEnv(name: String): String? {
  // TODO(Edoardo): support for Node.js
  // Browser is not supported
  return null
}
