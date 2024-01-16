// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

import com.strumenta.antlrkotlin.runtime.System
import org.antlr.v4.kotlinruntime.RuntimeMetaData.checkVersion
import org.antlr.v4.kotlinruntime.RuntimeMetaData.runtimeVersion
import kotlin.math.min

/**
 * This class provides access to the current version of the ANTLR 4 runtime
 * library as compile-time and runtime constants, along with methods for
 * checking for matching version numbers and notifying listeners in the case
 * where a version mismatch is detected.
 *
 * The runtime version information is provided by [runtimeVersion].
 * Detailed information about these values is provided in the documentation
 * for each member.
 *
 * The runtime version check is implemented by [checkVersion].
 * Detailed information about incorporating this call into user code,
 * as well as its use in generated code, is provided in the documentation for the method.
 *
 * Version strings `x.y` and `x.y.z` are considered "compatible" and no error
 * would be generated. Likewise, version strings `x.y-SNAPSHOT` and `x.y.z` are
 * considered "compatible" because the major and minor components `x.y`
 * are the same in each.
 *
 * To trap any error messages issued by this code, use `System.setErr()`
 * in your `main()` startup code.
 *
 * @since 4.3
 */
@Suppress("MemberVisibilityCanBePrivate")
public object RuntimeMetaData {
  /**
   * A compile-time constant containing the current version of the ANTLR 4
   * runtime library.
   *
   * This compile-time constant value allows generated parsers and other
   * libraries to include a literal reference to the version of the ANTLR 4
   * runtime library the code was compiled against. At each release, we
   * change this value.
   *
   * Version numbers are assumed to have the form:
   *
   * ```
   * *major*.*minor*.*patch*.*revision*-*suffix*,
   * ```
   *
   * With the individual components defined as follows:
   *
   * - *major* is a required non-negative integer, and is equal to `4` for ANTLR 4
   * - *minor* is a required non-negative integer
   * - *patch* is an optional non-negative integer. When
   *   *patch* is omitted, the `.` (dot) appearing before it is
   *   also omitted
   * - *revision* is an optional non-negative integer, and may only
   *   be included when *patch* is also included. When *revision*
   *   is omitted, the `.` (dot) appearing before it is also omitted
   * - *suffix* is an optional string. When *suffix* is
   *   omitted, the `-` (hyphen-minus) appearing before it is also
   *   omitted.
   */
  @Suppress("ConstPropertyName")
  public const val runtimeVersion: String = "4.13.1"

  /**
   * This method provides the ability to detect mismatches between the version
   * of ANTLR 4 used to generate a parser, the version of the ANTLR runtime a
   * parser was compiled against, and the version of the ANTLR runtime which
   * is currently executing.
   *
   * The version check is designed to detect the following two specific
   * scenarios:
   *
   * - The ANTLR Tool version used for code generation does not match the
   *   currently executing runtime version
   * - The ANTLR Runtime version referenced at the time a parser was
   *   compiled does not match the currently executing runtime version
   *
   * Starting with ANTLR 4.3, the code generator emits a call to this method
   * using two constants in each generated lexer and parser: a hard-coded
   * constant indicating the version of the tool used to generate the parser
   * and a reference to the compile-time constant [runtimeVersion].
   *
   * At runtime, this method is called during the initialization of the generated
   * parser to detect mismatched versions, and notify the registered listeners
   * prior to creating instances of the parser.
   *
   * This method does not perform any detection or filtering of semantic
   * changes between tool and runtime versions. It simply checks for a
   * version match and emits an error to stderr if a difference
   * is detected.
   *
   * Note that some breaking changes between releases could result in other
   * types of runtime exceptions, prior to calling this method.
   * In these cases, the underlying version mismatch will not be reported here.
   * This method is primarily intended to notify users of potential semantic
   * changes between releases that do not result in binary compatibility
   * problems which would be detected by the class loader.
   * As with semantic changes, changes that break binary compatibility
   * between releases are mentioned in the release notes accompanying
   * the affected release.
   *
   * **Additional note for target developers**: The version check
   * implemented by this class is designed to address specific compatibility
   * concerns that may arise during the execution of Java applications. Other
   * targets should consider the implementation of this method in the context
   * of that target's known execution environment, which may or may not
   * resemble the design provided for the Java target.
   *
   * @param generatingToolVersion The version of the tool used to generate a parser.
   *   This value may be `null` when called from user code that was not generated
   *   by, and does not reference, the ANTLR 4 Tool itself
   * @param compileTimeVersion The version of the runtime the parser was
   *   compiled against. This should always be passed using a direct reference
   *   to [runtimeVersion]
   */
  public fun checkVersion(generatingToolVersion: String?, compileTimeVersion: String) {
    var runtimeConflictsWithGeneratingTool = false

    if (generatingToolVersion != null) {
      runtimeConflictsWithGeneratingTool =
        runtimeVersion != generatingToolVersion
          && getMajorMinorVersion(runtimeVersion) != getMajorMinorVersion(generatingToolVersion)
    }

    val runtimeConflictsWithCompileTimeTool =
      runtimeVersion != compileTimeVersion
        && getMajorMinorVersion(runtimeVersion) != getMajorMinorVersion(compileTimeVersion)

    if (runtimeConflictsWithGeneratingTool) {
      System.err.println("ANTLR Tool version $generatingToolVersion used for code generation does not match the current runtime version $runtimeVersion")
    }

    if (runtimeConflictsWithCompileTimeTool) {
      System.err.println("ANTLR Runtime version $compileTimeVersion used for parser compilation does not match the current runtime version $runtimeVersion")
    }
  }

  /**
   * Gets the major and minor version numbers from a version string.
   *
   * For details about the syntax of the input `version`, e.g., from `x.y.z` return `x.y`.
   *
   * @param version The complete version string
   * @return A string of the form *major*.*minor* containing
   *   only the major and minor components of the version string
   */
  public fun getMajorMinorVersion(version: String): String {
    val firstDot = version.indexOf('.')
    val secondDot = if (firstDot >= 0) {
      version.indexOf('.', firstDot + 1)
    } else {
      -1
    }

    val firstDash = version.indexOf('-')
    var referenceLength = version.length

    if (secondDot >= 0) {
      referenceLength = min(referenceLength, secondDot)
    }

    if (firstDash >= 0) {
      referenceLength = min(referenceLength, firstDash)
    }

    return version.substring(0, referenceLength)
  }
}
