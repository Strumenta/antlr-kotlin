// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.gradle.internal

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
    builder.setBaseName("Gradle ANTLR Kotlin Worker")

    if (antlrClasspath != null) {
      builder.applicationClasspath(antlrClasspath)
    }

    builder.sharedPackages("antlr", "org.antlr")

    val javaCommand = builder.javaCommand
    javaCommand.workingDir = workingDir
    javaCommand.maxHeapSize = spec.maxHeapSize
    javaCommand.systemProperty("ANTLR_DO_NOT_EXIT", "true")
    try {
      javaCommand.redirectErrorStream()
    } catch (t: Throwable) {
      System.err.println("Error stream cannot be redirected: ${t.message}")
    }

    return builder.build()
  }
}
