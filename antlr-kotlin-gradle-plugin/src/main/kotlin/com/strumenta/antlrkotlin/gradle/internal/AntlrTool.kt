package com.strumenta.antlrkotlin.gradle.internal

import org.apache.tools.ant.util.FileUtils
import org.gradle.api.GradleException
import org.gradle.internal.os.OperatingSystem
import org.gradle.internal.reflect.JavaReflectionUtil
import org.slf4j.LoggerFactory
import java.io.File
import java.lang.reflect.InvocationTargetException

internal abstract class AntlrTool {
  companion object {
    private val logger = LoggerFactory.getLogger(AntlrTool::class.java)

    /**
     * Utility method to create an instance of the Tool class.
     */
    fun loadTool(className: String, args: Array<String>?): Any {
      logger.debug("Loading tool $className")

      try {
        val toolClass = Class.forName(className) // ok to use caller classloader
        logger.debug("Tool loaded $className")

        if (args == null) {
          return JavaReflectionUtil.newInstance(toolClass)
        } else {
          val constructor = toolClass.getConstructor(Array<String>::class.java)
          return constructor.newInstance(*arrayOf<Any>(args))
        }
      } catch (e: ClassNotFoundException) {
        logger.error("Tool not loaded: ${e.message}")
        throw e
      } catch (e: InvocationTargetException) {
        logger.error("Tool not loaded: ${e.message}")
        throw GradleException("Failed to load ANTLR", e.cause)
      } catch (e: Exception) {
        logger.error("Tool not loaded: ${e.message}")
        throw GradleException("Failed to load ANTLR", e)
      }
    }
  }

  abstract fun invoke(arguments: List<String>, inputDirectory: File?): Int
  abstract fun available(): Boolean

  fun process(spec: AntlrSpec): AntlrResult =
    try {
      doProcess(spec)
    } catch (e: ClassNotFoundException) {
      // This should not happen if you call check availability with #available first
      throw GradleException("Cannot process ANTLR sources", e)
    }

  /**
   * Process used for ANTLR 3/4.
   */
  private fun doProcess(spec: AntlrSpec): AntlrResult {
    var numErrors = 0

    if (spec.inputDirectories.isEmpty()) {
      // We have no root source folder information for the grammar files,
      // so we do not force relativeOutput as we cannot calculate it.
      // This results in flat generated sources in the output directory
      numErrors += invoke(spec.asArgumentsWithFiles(), null)
    } else {
      val onWindows = OperatingSystem.current().isWindows

      for (inputDirectory in spec.inputDirectories) {
        val arguments = spec.arguments.toMutableList()
        arguments.add("-Dlanguage=Kotlin")
        arguments.add("-o")
        arguments.add(spec.outputDirectory.absolutePath)

        for (grammarFile in spec.grammarFiles) {
          var relativeGrammarFilePath = FileUtils.getRelativePath(inputDirectory, grammarFile)

          if (onWindows) {
            relativeGrammarFilePath = relativeGrammarFilePath.replace('/', File.separatorChar)
          }

          arguments.add(relativeGrammarFilePath)
        }

        numErrors += invoke(arguments, inputDirectory)
      }
    }

    return AntlrResult(numErrors, null)
  }
}
