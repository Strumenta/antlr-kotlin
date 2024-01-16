// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

internal actual fun platformGetEnv(name: String): String? {
  if (isNodeJs()) {
    return js("process.env[name]").unsafeCast<String?>()
  }

  System.out.println("Environment variables are not supported in the browser")
  return null
}
