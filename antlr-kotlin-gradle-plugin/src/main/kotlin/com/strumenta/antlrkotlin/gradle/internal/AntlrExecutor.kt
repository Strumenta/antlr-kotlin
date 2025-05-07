// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.gradle.internal

import org.gradle.process.internal.worker.RequestHandler
import org.slf4j.LoggerFactory

internal class AntlrExecutor : RequestHandler<AntlrSpec, AntlrResult> {
  private companion object {
    private const val serialVersionUID = 1L
    private val logger = LoggerFactory.getLogger(AntlrExecutor::class.java)
  }

  override fun run(spec: AntlrSpec): AntlrResult {
    val antlrTool = Antlr4Tool()

    if (antlrTool.available()) {
      logger.info("Processing with ANTLR 4")
      return antlrTool.process(spec)
    }

    throw IllegalStateException("No ANTLR 4 implementation available")
  }
}
