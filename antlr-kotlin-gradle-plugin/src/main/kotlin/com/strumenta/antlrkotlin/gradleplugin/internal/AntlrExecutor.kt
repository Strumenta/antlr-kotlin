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

import org.gradle.process.internal.worker.RequestHandler
import org.slf4j.LoggerFactory

internal class AntlrExecutor : RequestHandler<AntlrSpec, AntlrResult> {
  private companion object {
    @Suppress("ConstPropertyName")
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
