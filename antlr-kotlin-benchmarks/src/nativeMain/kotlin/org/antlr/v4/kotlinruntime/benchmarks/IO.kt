// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks

import kotlinx.io.buffered
import kotlinx.io.files.Path
import kotlinx.io.files.SystemFileSystem
import kotlinx.io.readString
import kotlin.experimental.ExperimentalNativeApi
import kotlin.native.CpuArchitecture.ARM64
import kotlin.native.CpuArchitecture.X64
import kotlin.native.OsFamily.*

@OptIn(ExperimentalNativeApi::class)
private val arch: String =
  when (Platform.cpuArchitecture) {
    X64 -> "X64"
    ARM64 -> "Arm64"
    else -> throw IllegalStateException("Unsupported CPU architecture")
  }

@OptIn(ExperimentalNativeApi::class)
private val dir: String =
  when (Platform.osFamily) {
    WINDOWS -> "mingw$arch"
    LINUX -> "linux$arch"
    MACOSX -> "macos$arch"
    else -> throw IllegalStateException("Unsupported OS family")
  }

// TODO(Edoardo): this should probably be replaced by a Gradle task,
//  but in the meantime it should work consistently
private val basePath = "build/processedResources/$dir/main"

public actual fun readBenchmarkFile(name: String): String {
  val path = Path("$basePath$name")
  val source = SystemFileSystem.source(path).buffered()
  return source.readString()
}
