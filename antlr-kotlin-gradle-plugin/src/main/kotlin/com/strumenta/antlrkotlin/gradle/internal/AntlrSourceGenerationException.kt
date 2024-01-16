// Copyright 2017-2024 Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024 Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.gradle.internal

import org.gradle.api.GradleException
import org.gradle.internal.exceptions.Contextual

@Contextual
internal class AntlrSourceGenerationException(message: String, cause: Throwable?) : GradleException(message, cause) {
  private companion object {
    @Suppress("ConstPropertyName")
    private const val serialVersionUID = 1L
  }
}
