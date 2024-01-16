// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.gradle.internal

import org.gradle.internal.reflect.JavaMethod
import java.io.File

internal class Antlr4Tool : AntlrTool() {
  override fun invoke(arguments: List<String>, inputDirectory: File?): Int {
    val backedObject = loadTool("org.antlr.v4.Tool", arguments.toTypedArray())

    if (inputDirectory != null) {
      setField(backedObject, "inputDirectory", inputDirectory)
    }

    JavaMethod.of(backedObject, Void::class.javaObjectType, "processGrammarsOnCommandLine").invoke(backedObject)
    return JavaMethod.of(backedObject, Int::class.javaObjectType, "getNumErrors").invoke(backedObject)
  }

  override fun available(): Boolean {
    try {
      loadTool("org.antlr.v4.Tool", null)
      return true
    } catch (_: ClassNotFoundException) {
      // Ignored
    }

    return false
  }

  @Suppress("SameParameterValue")
  private fun setField(obj: Any, fieldName: String, value: File) {
    val field = obj.javaClass.getField(fieldName)
    field.isAccessible = true
    field[obj] = value
  }
}
