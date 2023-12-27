package com.strumenta.antlrkotlin.runtime

internal actual fun platformGetEnv(name: String): String? {
  if (isNodeJs()) {
    return js("process.env[name]").unsafeCast<String?>()
  }

  System.out.println("Environment variables are not supported in the browser")
  return null
}
