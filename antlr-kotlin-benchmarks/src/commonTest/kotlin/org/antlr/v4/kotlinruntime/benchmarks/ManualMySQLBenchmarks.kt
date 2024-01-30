// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks

import org.antlr.v4.kotlinruntime.benchmarks.mysql.MySQLBenchmarks
import kotlin.test.Test
import kotlin.time.Duration
import kotlin.time.measureTime

// An handy way to manually run benchmarks, as we can just use the gutter runners.
//
// TODO(Edoardo): remove once kotlinx-benchmark properly supports the JS target.
//  See https://github.com/Kotlin/kotlinx-benchmark/issues/185
class ManualMySQLBenchmarks {
  @Test
  fun benchmarks() {
    val benchmarks = MySQLBenchmarks()
    benchmarks.setup()

    // Warm up
    repeat(8) {
      val duration = measureTime {
        benchmarks.statements()
      }

      val ms = toMilliseconds(duration)
      println("Warm up ${it + 1}: $ms ms")
    }

    val statementsAvg = benchmarkStatements(benchmarks)
    val queriesAvg = benchmarkQueries(benchmarks)
    val insertsAvg = benchmarkInserts(benchmarks)

    print("\nStatements:\t\t$statementsAvg ms")
    print("\nQueries:\t\t$queriesAvg ms")
    print("\nInserts:\t\t$insertsAvg ms")
  }

  private fun benchmarkStatements(benchmarks: MySQLBenchmarks): Double =
    averageTimeMs("statements", 8) {
      measureTime {
        benchmarks.statements()
      }
    }

  private fun benchmarkQueries(benchmarks: MySQLBenchmarks): Double =
    averageTimeMs("queries", 8) {
      measureTime {
        benchmarks.queries()
      }
    }

  private fun benchmarkInserts(benchmarks: MySQLBenchmarks): Double =
    averageTimeMs("inserts", 8) {
      measureTime {
        benchmarks.inserts()
      }
    }

  private fun averageTimeMs(title: String, times: Int, action: () -> Duration): Double {
    val durations = ArrayList<Duration>(times)
    println("\nBenchmark: $title")

    for (i in 0..<times) {
      val duration = action()
      val ms = toMilliseconds(duration)
      println("Iteration ${i + 1}: $ms ms")
      durations.add(duration)
    }

    return averageMs(durations)
  }

  private fun averageMs(durations: List<Duration>): Double {
    if (durations.isEmpty()) {
      return 0.0
    }

    val sum = durations.fold(Duration.ZERO) { acc, duration -> acc + duration }
    val duration = sum / durations.size
    return toMilliseconds(duration)
  }

  private fun toMilliseconds(duration: Duration): Double =
    duration.inWholeNanoseconds.toDouble() / 1000000.0
}
