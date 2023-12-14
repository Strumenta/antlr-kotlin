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
