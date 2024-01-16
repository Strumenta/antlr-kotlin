// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.runtime

@Suppress("UNUSED_PARAMETER", "RedundantNullableReturnType")
private fun processEnvJs(name: String): String? =
  js("process.env[name]")

internal actual fun platformGetEnv(name: String): String? {
  if (isNodeJs()) {
    return processEnvJs(name)
  }

  System.out.println("Environment variables are not supported in the browser")
  return null
}
