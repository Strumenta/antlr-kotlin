package com.strumenta.antlrkotlin.gradle.internal

import java.io.File
import java.io.Serializable
import java.util.*

internal data class AntlrSpec(
  val arguments: List<String>,
  val grammarFiles: Set<File>,
  val inputDirectories: Set<File>,
  val outputDirectory: File,
  val maxHeapSize: String?,
) : Serializable {
  private companion object {
    @Suppress("ConstPropertyName")
    private const val serialVersionUID = 1L
  }

  fun asArgumentsWithFiles(): List<String> {
    val commandLine = LinkedList(arguments)
    commandLine.add("-Dlanguage=Kotlin")
    commandLine.add("-o")
    commandLine.add(outputDirectory.absolutePath)

    for (file in grammarFiles) {
      commandLine.add(file.absolutePath)
    }

    return commandLine
  }
}
