// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package com.strumenta.antlrkotlin.gradle

import com.strumenta.antlrkotlin.gradle.internal.AntlrResult
import com.strumenta.antlrkotlin.gradle.internal.AntlrSourceGenerationException
import com.strumenta.antlrkotlin.gradle.internal.AntlrSpecFactory
import com.strumenta.antlrkotlin.gradle.internal.AntlrWorkerManager
import org.gradle.api.NonNullApi
import org.gradle.api.file.*
import org.gradle.api.tasks.*
import org.gradle.api.tasks.Optional
import org.gradle.internal.file.Deleter
import org.gradle.process.internal.worker.WorkerProcessFactory
import org.gradle.work.ChangeType
import org.gradle.work.InputChanges
import java.io.File
import java.util.*
import javax.inject.Inject

/**
 * Generates parsers from ANTLR grammars.
 */
@NonNullApi
@CacheableTask
public abstract class AntlrKotlinTask : SourceTask() {
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
   * The package name of the generated files.
   */
  @get:Input
  public var packageName: String? = null

  /**
   * The generated parsers file encoding (ex: 'UTF-8').
   */
  @get:Input
  public var encoding: String = "UTF-8"

  /**
   * The maximum heap size for the forked antlr process (ex: '512m', '1g').
   */
  @get:Internal
  public var maxHeapSize: String = "512m"

  /**
   * The sources for incremental change detection.
   */
  @get:SkipWhenEmpty
  @get:IgnoreEmptyDirectories
  @get:PathSensitive(PathSensitivity.RELATIVE)
  @get:InputFiles
  protected val stableSources: FileCollection = project.files({ this.source })

  // Note(Edoardo): we had to move injected properties from
  //  constructor injection to method injection to correctly
  //  support Gradle's configuration cache

  @get:Inject
  protected abstract val deleter: Deleter

  @get:Inject
  protected abstract val projectLayout: ProjectLayout

  @get:Inject
  protected abstract val workerProcessBuilderFactory: WorkerProcessFactory

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
        deleter.ensureEmptyDirectory(outputDirectory!!)
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
  @Internal("Tracked via stableSources")
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
