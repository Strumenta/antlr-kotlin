package com.strumenta.kotlinmultiplatform

internal actual fun platformGetEnv(name: String): String? {
  // TODO(Edoardo): support for Node.js
  // Browser is not supported
  return null
}
