// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.gradle.internal

import java.io.Serializable

internal data class AntlrResult(
  val errorCount: Int,
  val exception: Exception? = null,
) : Serializable {
  private companion object {
    @Suppress("ConstPropertyName")
    private const val serialVersionUID = 1L
  }
}
