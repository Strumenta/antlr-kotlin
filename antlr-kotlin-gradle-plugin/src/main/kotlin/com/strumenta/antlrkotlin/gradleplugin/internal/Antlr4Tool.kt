package com.strumenta.antlrkotlin.gradleplugin.internal

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
    field[obj] = value
  }
}
