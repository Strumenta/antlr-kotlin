/*
 * Copyright 2014 the original author or authors.
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
