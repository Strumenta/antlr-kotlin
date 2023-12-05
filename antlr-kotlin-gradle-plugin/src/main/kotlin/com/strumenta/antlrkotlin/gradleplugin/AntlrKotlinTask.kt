/*
 * Copyright 2010 the original author or authors.
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
package com.strumenta.antlrkotlin.gradleplugin

import com.strumenta.antlrkotlin.gradleplugin.internal.AntlrResult
import com.strumenta.antlrkotlin.gradleplugin.internal.AntlrSourceGenerationException
import com.strumenta.antlrkotlin.gradleplugin.internal.AntlrSpecFactory
import com.strumenta.antlrkotlin.gradleplugin.internal.AntlrWorkerManager
import org.gradle.api.file.*
import org.gradle.api.tasks.*
import org.gradle.api.tasks.Optional
import org.gradle.internal.file.Deleter
import org.gradle.process.internal.worker.WorkerProcessFactory
import org.gradle.work.ChangeType
import org.gradle.work.InputChanges
import java.io.File
import java.util.*
import java.util.concurrent.Callable
import javax.inject.Inject

/**
 * Generates parsers from Antlr grammars.
 */
@CacheableTask
public abstract class AntlrKotlinTask @Inject constructor(
  private val deleter: Deleter,
  private val projectLayout: ProjectLayout,
  private val workerProcessBuilderFactory: WorkerProcessFactory,
) : SourceTask() {
  private var sourceSetDirectories: FileCollection? = null

  /**
   * Specifies that all rules call `traceIn`/`traceOut`.
   */
  @get:Input
  public var isTrace: Boolean = false

  /**
   * Specifies that all lexer rules call `traceIn`/`traceOut`.
   */
  @get:Input
  public var isTraceLexer: Boolean = false

  /**
   * Specifies that all parser rules call `traceIn`/`traceOut`.
   */
  @get:Input
  public var isTraceParser: Boolean = false

  /**
   * Specifies that all tree walker rules call `traceIn`/`traceOut`.
   */
  @get:Input
  public var isTraceTreeWalker: Boolean = false

  /**
   * List of command-line arguments passed to the antlr process.
   */
  @get:Input
  public var arguments: List<String> = LinkedList()

  /**
   * Specifies the classpath containing the Ant ANTLR task implementation.
   */
  @get:Classpath
  @get:Optional
  public var antlrClasspath: FileCollection? = null

  /**
   * Specifies the directory to generate the parser source files into.
   */
  @get:OutputDirectory
  public var outputDirectory: File? = null

  /**
   * The maximum heap size for the forked antlr process (ex: '1g').
   */
  @get:Input
  @get:Optional
  public var maxHeapSize: String? = null

  /**
   * The package name of the generated files.
   */
  @get:Input
  public var packageName: String? = null

  /**
   * The generated parsers file encoding (ex: 'UTF-8').
   */
  @get:Input
  public var encoding: String? = "UTF-8"

  /**
   * The sources for incremental change detection.
   */
  @get:InputFiles
  @get:PathSensitive(PathSensitivity.RELATIVE)
  @get:IgnoreEmptyDirectories
  @get:SkipWhenEmpty
  protected val stableSources: FileCollection = project.files(Callable<Any> { this.source })

  /**
   * Generate the parsers.
   */
  @TaskAction
  public fun execute(inputChanges: InputChanges) {
    val grammarFiles = mutableSetOf<File>()
    val stableSources = stableSources

    if (inputChanges.isIncremental) {
      var rebuildRequired = false

      for (fileChange in inputChanges.getFileChanges(stableSources)) {
        if (fileChange.fileType == FileType.FILE) {
          if (fileChange.changeType == ChangeType.REMOVED) {
            rebuildRequired = true
            break
          }

          grammarFiles.add(fileChange.file)
        }
      }

      if (rebuildRequired) {
        val directory = checkNotNull(outputDirectory)
        deleter.ensureEmptyDirectory(directory)
        grammarFiles.addAll(stableSources.files)
      }
    } else {
      grammarFiles.addAll(stableSources.files)
    }

    val projectDir = projectLayout.projectDirectory.asFile
    val manager = AntlrWorkerManager()
    val spec = AntlrSpecFactory().create(this, grammarFiles, sourceSetDirectories)
    val result = manager.runWorker(projectDir, workerProcessBuilderFactory, antlrClasspath, spec)
    evaluate(result)
  }

  /**
   * Sets the source for this task. Delegates to [SourceTask.setSource].
   *
   * If the source is of type [SourceDirectorySet], then the relative path of each
   * source grammar files is used to determine the relative output path of the generated source.
   *
   * If the source is not of type [SourceDirectorySet], then the generated source files end up
   * flattened in the specified output directory.
   */
  override fun setSource(source: FileTree) {
    setSource(source as Any)
  }

  /**
   * Sets the source for this task. Delegates to [SourceTask.setSource].
   *
   * If the source is of type [SourceDirectorySet], then the relative path of each
   * source grammar files is used to determine the relative output path of the generated source.
   *
   * If the source is not of type [SourceDirectorySet], then the generated source files end up
   * flattened in the specified output directory.
   */
  override fun setSource(source: Any) {
    super.setSource(source)

    if (source is SourceDirectorySet) {
      sourceSetDirectories = source.sourceDirectories
    }
  }

  /**
   * Returns the source for this task, after the include and exclude patterns have been applied.
   *
   * Ignores source files which do not exist.
   */
  @PathSensitive(PathSensitivity.RELATIVE)
  override fun getSource(): FileTree =
    super.getSource()

  private fun evaluate(result: AntlrResult) {
    val errorCount = result.errorCount

    when {
      errorCount < 0 -> throw AntlrSourceGenerationException(
        "There were errors during grammar generation",
        result.exception,
      )
      errorCount == 1 -> throw AntlrSourceGenerationException(
        "There was 1 error during grammar generation",
        result.exception,
      )
      errorCount > 1 -> throw AntlrSourceGenerationException(
        "There were $errorCount errors during grammar generation",
        result.exception,
      )
    }
  }
}
