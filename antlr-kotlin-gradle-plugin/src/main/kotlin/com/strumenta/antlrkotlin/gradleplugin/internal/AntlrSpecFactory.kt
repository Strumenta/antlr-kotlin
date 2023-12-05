/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.strumenta.antlrkotlin.gradleplugin.internal

import com.strumenta.antlrkotlin.gradleplugin.AntlrKotlinTask
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
    var outputDirectory = antlrTask.outputDirectory
    val packageName = antlrTask.packageName

    if (packageName != null) {
      arguments.add("-package")
      arguments.add(packageName)
      outputDirectory = File(outputDirectory, packageName.replace(".", "/"))
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

    if (antlrTask.encoding == null) {
      arguments.add("UTF-8")
    } else {
      arguments.add(antlrTask.encoding)
    }

    val sourceSetDirectoriesFiles = if (sourceSetDirectories == null) {
      emptySet()
    } else {
      sourceSetDirectories.files
    }

    return AntlrSpec(
      arguments,
      grammarFiles,
      sourceSetDirectoriesFiles,
      outputDirectory!!,
      antlrTask.maxHeapSize,
    )
  }
}
