// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime.benchmarks.mysql

import com.strumenta.antlrkotlin.benchmarks.generated.MySQLLexer
import com.strumenta.antlrkotlin.benchmarks.generated.MySQLParser
import kotlinx.benchmark.*
import org.antlr.v4.kotlinruntime.BailErrorStrategy
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.atn.PredictionMode
import org.antlr.v4.kotlinruntime.benchmarks.mysql.util.StatementFinishState
import org.antlr.v4.kotlinruntime.benchmarks.mysql.util.StatementSpan
import org.antlr.v4.kotlinruntime.benchmarks.mysql.util.TextSpan
import org.antlr.v4.kotlinruntime.benchmarks.mysql.util.VersionCheckResult
import org.antlr.v4.kotlinruntime.benchmarks.readBenchmarkFile

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(BenchmarkTimeUnit.MILLISECONDS)
@Warmup(iterations = 4, timeUnit = BenchmarkTimeUnit.MILLISECONDS)
@Measurement(iterations = 8, timeUnit = BenchmarkTimeUnit.MILLISECONDS)
public class MySQLBenchmarks {
  @Suppress("SpellCheckingInspection")
  private val charSets = setOf(
    "_big5",
    "_dec8",
    "_cp850",
    "_hp8",
    "_koi8r",
    "_latin1",
    "_latin2",
    "_swe7",
    "_ascii",
    "_ujis",
    "_sjis",
    "_hebrew",
    "_tis620",
    "_euckr",
    "_koi8u",
    "_gb18030",
    "_gb2312",
    "_greek",
    "_cp1250",
    "_gbk",
    "_latin5",
    "_armscii8",
    "_utf8",
    "_ucs2",
    "_cp866",
    "_keybcs2",
    "_macce",
    "_macroman",
    "_cp852",
    "_latin7",
    "_cp1251",
    "_cp1256",
    "_cp1257",
    "_binary",
    "_geostd8",
    "_cp932",
    "_eucjpms",
    "_utf8mb4",
    "_utf16",
    "_utf32",
  )

  private val delimiterKeyword = Regex("delimiter ", RegexOption.IGNORE_CASE)

  // We need the suppression as JS requires the last \]
  @Suppress("RegExpRedundantEscape")
  private val versionPattern = Regex("""^\[(<|<=|>|>=|=)(\d{5})\]""")
  private val relationMap = buildMap {
    put("<", 0)
    put("<=", 1)
    put("=", 2)
    put(">=", 3)
    put(">", 4)
  }

  private lateinit var statements: String
  private lateinit var statementsRanges: List<StatementSpan>

  private lateinit var queries: String
  private lateinit var queriesRanges: List<StatementSpan>

  private lateinit var inserts: String
  private lateinit var insertsRanges: List<StatementSpan>

  @Setup
  public fun setup() {
    statements = readBenchmarkFile("/mysql/statements.txt")
    statementsRanges = determineStatementRanges(statements, "$$")

    queries = readBenchmarkFile("/mysql/bitrix_queries_cut.sql")
    queriesRanges = determineStatementRanges(queries, ";")

    inserts = readBenchmarkFile("/mysql/sakila-data.sql")
    insertsRanges = determineStatementRanges(inserts, ";")
  }

  @Benchmark
  public fun statements() {
    parseRanges(statements, statementsRanges)
  }

  @Benchmark
  public fun queries() {
    parseRanges(queries, queriesRanges)
  }

  @Benchmark
  public fun inserts() {
    parseRanges(inserts, insertsRanges)
  }

  private fun parseRanges(content: String, ranges: List<StatementSpan>) {
    for (range in ranges) {
      // The delimiter is considered part of the statement (e.g. for editing purposes)
      // but must be ignored for parsing
      val (start, length) = range.span
      val end = start + length - (range.delimiter?.length ?: 0)
      val statement = content.substring(start, end).trim()

      // The parser only supports syntax from 8.0 onwards.
      // So we expect errors for older statements
      val checkResult = checkMinStatementVersion(statement, 80031)

      if (checkResult.matched) {
        parse(checkResult.statement, checkResult.version)
      }
    }
  }

  private fun parse(statement: String, serverVersion: Int) {
    val errorListener = MySQLErrorListener()
    val lexer = MySQLLexer(CharStreams.fromString(statement))
    lexer.removeErrorListeners()
    lexer.addErrorListener(errorListener)
    lexer.sqlModeFromString("ANSI_QUOTES")
    lexer.serverVersion = serverVersion
    lexer.charSets = charSets

    val parser = MySQLParser(CommonTokenStream(lexer))
    parser.removeParseListeners()
    parser.removeErrorListeners()
    parser.addErrorListener(errorListener)
    parser.buildParseTree = false
    parser.serverVersion = serverVersion
    parser.sqlModes = lexer.sqlModes
    parser.errorHandler = BailErrorStrategy()
    parser.interpreter.predictionMode = PredictionMode.SLL

    // Perform the actual parsing
    parser.query()
  }

  /**
   * Takes a block of SQL text and splits it into individual statements, by determining start position,
   * length and current delimiter for each. It is assumed the line break is a simple `\n`.
   *
   * Note: the length includes anything up to (and including) the delimiter position.
   *
   * @param sql The SQL to split
   * @param delimiter The initial delimiter to use
   * @return A list of statement ranges
   */
  private fun determineStatementRanges(sql: String, delimiter: String): List<StatementSpan> {
    val result = ArrayList<StatementSpan>(256)
    var start = 0
    var head = 0
    var tail = 0
    val end = sql.length

    // Set when anything else but comments were found for the current statement
    var haveContent = false

    /**
     * Checks the current tail position if that touches a delimiter. If that's the case then the current statement
     * is finished and a new one starts.
     *
     * @return `true` if a delimiter was found, `false` otherwise
     */
    fun checkDelimiter(): Boolean {
      if (sql[tail] == delimiter[0]) {
        // Found possible start of the delimiter. Check if it really is
        if (delimiter.length == 1) {
          // Most common case
          ++tail

          result += StatementSpan(
            delimiter = delimiter,
            span = TextSpan(start, tail - start),
            contentStart = if (haveContent) head else start,
            state = StatementFinishState.Complete,
          )

          head = tail
          start = head
          haveContent = false
          return true
        }

        // Multi character delimiter?
        val candidate = sql.substring(tail, tail + delimiter.length)

        if (candidate == delimiter) {
          // Multi char delimiter is complete. Tail still points to the start of the delimiter
          tail += delimiter.length
          result += StatementSpan(
            delimiter = delimiter,
            span = TextSpan(start, tail - start),
            contentStart = if (haveContent) head else start,
            state = StatementFinishState.Complete,
          )

          head = tail
          start = head
          haveContent = false
          return true
        }
      }

      return false
    }

    while (tail < end) {
      if (!checkDelimiter()) {
        when (sql[tail]) {
          // Possible multi line comment or hidden (conditional) command
          '/' -> {
            if (sql[tail + 1] == '*') {
              if (sql[tail + 2] == '!') {
                // Hidden command
                if (!haveContent) {
                  haveContent = true
                  head = tail
                }

                ++tail
              }

              tail += 2

              while (true) {
                while (tail < end && sql[tail] != '*') {
                  ++tail
                }

                if (tail == end) {
                  // Unfinished multiline comment
                  result += StatementSpan(
                    delimiter = delimiter,
                    span = TextSpan(start, tail - start),
                    contentStart = if (haveContent) head else start,
                    state = StatementFinishState.OpenComment,
                  )

                  start = tail
                  head = tail
                  break
                } else {
                  if (sql[++tail] == '/') {
                    // Skip the slash too
                    ++tail
                    break
                  }
                }
              }

              if (!haveContent) {
                // Skip over the comment
                head = tail
              }
            } else {
              ++tail
              haveContent = true
            }
          }
          // Possible single line comment
          '-' -> run {
            val temp = tail + 2

            if (sql[tail + 1] == '-' && (sql[temp] == ' ' || sql[temp] == '\t' || sql[temp] == '\n')) {
              // Skip everything until the end of the line
              tail += 2

              while (tail < end && sql[tail] != '\n') {
                ++tail
              }

              // Unfinished single line comment
              if (tail == end) {
                result += StatementSpan(
                  delimiter = delimiter,
                  span = TextSpan(start, tail - start),
                  contentStart = if (haveContent) head else start,
                  state = StatementFinishState.OpenComment,
                )

                start = tail
                head = tail
                return@run
              }

              if (!haveContent) {
                head = tail
              }
            } else {
              ++tail
              haveContent = true
            }
          }
          // MySQL single line comment
          '#' -> run {
            while (tail < end && sql[tail] != '\n') {
              ++tail
            }

            // Unfinished single line comment
            if (tail == end) {
              result += StatementSpan(
                delimiter = delimiter,
                span = TextSpan(start, tail - start),
                contentStart = if (haveContent) head else start,
                state = StatementFinishState.OpenComment,
              )

              start = tail
              head = tail
              return@run
            }

            if (!haveContent) {
              head = tail
            }
          }
          // Quoted string/id. Skip this in a local loop
          '"', '\'', '`' -> {
            haveContent = true
            val quote = sql[tail++]

            while (tail < end && sql[tail] != quote) {
              // Skip any escaped character too
              if (sql[tail] == '\\') {
                ++tail
              }

              ++tail
            }

            if (sql[tail] == quote) {
              // Skip trailing quote char if one was there
              ++tail
            } else {
              // Unfinished single string
              result += StatementSpan(
                delimiter = delimiter,
                span = TextSpan(start, tail - start),
                contentStart = if (haveContent) head else start,
                state = StatementFinishState.OpenString,
              )

              start = tail
              head = tail
            }
          }
          // Possible start of the DELIMITER word.
          // Also consider the mandatory space char
          'd', 'D' -> run {
            if (tail + 10 >= end) {
              if (!haveContent) {
                haveContent = true
                head = tail
              }

              ++tail

              // Not enough input for that
              return@run
            }

            val candidate = sql.substring(tail, tail + 10)

            if (delimiterKeyword.matches(candidate)) {
              // Delimiter keyword found - get the new delimiter (all consecutive letters).
              // But first push anything we found so far and haven't pushed yet
              if (haveContent && tail > start) {
                result += StatementSpan(
                  delimiter = delimiter,
                  span = TextSpan(start, tail - start),
                  contentStart = head,
                  state = StatementFinishState.NoDelimiter,
                )

                start = tail
              }

              head = tail
              tail += 10
              var run = tail

              // Skip leading spaces + tabs
              while (run < end && (sql[run] == ' ' || sql[run] == '\t')) {
                ++run
              }

              tail = run

              // Forward to the first whitespace after the current position (on this line)
              while (run < end && sql[run] != '\n' && sql[run] != ' ' && sql[run] != '\t') {
                ++run
              }

              @Suppress("NAME_SHADOWING")
              val delimiter = sql.substring(tail, run)
              val length = delimiter.length

              if (length > 0) {
                result += StatementSpan(
                  delimiter = delimiter,
                  span = TextSpan(start, run - start),
                  contentStart = head,
                  state = StatementFinishState.DelimiterChange,
                )

                tail = run
                head = tail
                start = head
                haveContent = false
              } else {
                haveContent = true
                head = tail
              }
            } else {
              ++tail

              if (!haveContent) {
                haveContent = true
                head = tail
              }
            }
          }
          else -> {
            if (!haveContent && sql[tail] > ' ') {
              haveContent = true
              head = tail
            }

            ++tail
          }
        }
      }
    }

    // Add remaining text to the range list
    if (head < end) {
      result += StatementSpan(
        span = TextSpan(start, end - start),
        contentStart = if (haveContent) head else start - 1, // -1 to indicate no content
        state = StatementFinishState.NoDelimiter,
      )
    }

    return result
  }

  /**
   * Similar like checkStatementVersion, but only extracts the statement version
   * and checks that against the given minimum version.
   * Relational operators are only used to adjust the extracted version.
   *
   * @param statement The statement with an optional version part at the beginning
   * @param minimumVersion The server version to match the version part against
   * @return The check result
   */
  @Suppress("SameParameterValue")
  private fun checkMinStatementVersion(statement: String, minimumVersion: Int): VersionCheckResult {
    var stmt = statement
    val matches = versionPattern.find(stmt)
    var version = minimumVersion

    if (matches != null) {
      stmt = stmt.replace(versionPattern, "")

      val values = matches.groupValues
      val relation = values[1]
      version = values[2].toInt()

      when (relationMap[relation]) {
        // Less than the given version
        0 -> --version
        // Greater than the given version
        4 -> ++version
      }
    }

    val matched = version >= minimumVersion
    return VersionCheckResult(matched, stmt, version)
  }
}
