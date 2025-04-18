// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.gradle.internal

import org.gradle.api.file.FileCollection
import org.gradle.process.internal.JavaExecHandleBuilder
import org.gradle.process.internal.worker.MultiRequestClient
import org.gradle.process.internal.worker.MultiRequestWorkerProcessBuilder
import org.gradle.process.internal.worker.WorkerProcessFactory
import java.io.File

internal class AntlrWorkerManager {
  fun runWorker(
    workingDir: File,
    workerFactory: WorkerProcessFactory,
    antlrClasspath: FileCollection?,
    spec: AntlrSpec,
  ): AntlrResult {
    val client = createWorkerProcess(workingDir, workerFactory, antlrClasspath, spec)

    var result: AntlrResult
    try {
      client.start()
      result = client.run(spec)
    } finally {
      client.stop()
    }

    return result
  }

  private fun createWorkerProcess(
    workingDir: File,
    workerFactory: WorkerProcessFactory,
    antlrClasspath: FileCollection?,
    spec: AntlrSpec,
  ): MultiRequestClient<AntlrSpec, AntlrResult> {
    val builder: MultiRequestWorkerProcessBuilder<AntlrSpec, AntlrResult> =
      workerFactory.multiRequestWorker(AntlrExecutor::class.java)
    builder.baseName = "Gradle ANTLR Kotlin Worker"

    if (antlrClasspath != null) {
      builder.applicationClasspath(antlrClasspath)
    }

    builder.sharedPackages("antlr", "org.antlr")

    val javaCommand = builder.javaCommand
    javaCommand.workingDir = workingDir
    javaCommand.maxHeapSize = spec.maxHeapSize
    javaCommand.systemProperty("ANTLR_DO_NOT_EXIT", "true")
    javaCommand.redirectErrorStreamCompat()

    return builder.build()
  }

  /**
   * Merge the process' error stream into its output stream.
   *
   * Solves a compatibility issue with Gradle 8.12+.
   * See [antlr-kotlin/issues/201](https://github.com/Strumenta/antlr-kotlin/issues/201).
   */
  private fun JavaExecHandleBuilder.redirectErrorStreamCompat() {
    val method = this::class.java.getMethod("redirectErrorStream")
    method.invoke(this)
  }
}
