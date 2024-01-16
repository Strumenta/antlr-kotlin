// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.gradle.internal

import com.strumenta.antlrkotlin.gradle.AntlrKotlinTask
import org.gradle.api.file.FileCollection
import java.io.File
import java.util.*

internal class AntlrSpecFactory {
  fun create(
    antlrTask: AntlrKotlinTask,
    grammarFiles: Set<File>,
    sourceSetDirectories: FileCollection?,
  ): AntlrSpec {
    val arguments = LinkedList(antlrTask.arguments)
    val packageName = antlrTask.packageName

    if (packageName != null) {
      arguments.add("-package")
      arguments.add(packageName)
    }

    if (antlrTask.isTrace) {
      arguments.add("-trace")
    }

    if (antlrTask.isTraceLexer) {
      arguments.add("-traceLexer")
    }

    if (antlrTask.isTraceParser) {
      arguments.add("-traceParser")
    }

    if (antlrTask.isTraceTreeWalker) {
      arguments.add("-traceTreeWalker")
    }

    // See https://github.com/Strumenta/antlr-kotlin/issues/85
    arguments.add("-encoding")
    arguments.add(antlrTask.encoding)

    val sourceSetDirectoriesFiles =
      if (sourceSetDirectories == null) {
        emptySet()
      } else {
        sourceSetDirectories.files
      }

    return AntlrSpec(
      arguments,
      grammarFiles,
      sourceSetDirectoriesFiles,
      antlrTask.outputDirectory!!,
      antlrTask.maxHeapSize,
    )
  }
}
