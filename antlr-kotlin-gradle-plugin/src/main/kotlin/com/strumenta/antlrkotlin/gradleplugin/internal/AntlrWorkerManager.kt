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

import org.gradle.api.file.FileCollection
import org.gradle.process.internal.worker.RequestHandler
import org.gradle.process.internal.worker.WorkerProcessFactory
import java.io.File

internal class AntlrWorkerManager {
  fun runWorker(
    workingDir: File,
    workerFactory: WorkerProcessFactory,
    antlrClasspath: FileCollection?,
    spec: AntlrSpec,
  ): AntlrResult {
    val antlrWorker = createWorkerProcess(workingDir, workerFactory, antlrClasspath, spec)
    return antlrWorker.run(spec)
  }

  private fun createWorkerProcess(
    workingDir: File,
    workerFactory: WorkerProcessFactory,
    antlrClasspath: FileCollection?,
    spec: AntlrSpec,
  ): RequestHandler<AntlrSpec, AntlrResult> {
    val builder = workerFactory.singleRequestWorker(AntlrExecutor::class.java)
    builder.setBaseName("Gradle ANTLR-Kotlin Worker")

    if (antlrClasspath != null) {
      builder.applicationClasspath(antlrClasspath)
    }

    builder.sharedPackages("antlr", "org.antlr")

    val javaCommand = builder.javaCommand
    javaCommand.workingDir = workingDir
    javaCommand.maxHeapSize = spec.maxHeapSize
    javaCommand.systemProperty("ANTLR_DO_NOT_EXIT", "true")
    javaCommand.redirectErrorStream()

    return builder.build()
  }
}
