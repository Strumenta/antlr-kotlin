package org.antlr.v4.kotlinruntime.ast

/**
 * The line should be in `1..n`, the column in `0..n`.
 */
public data class Point(val line: Int, val column: Int) {
  private companion object {
    private val lineBreakRegex = Regex("\r\n|\r|\n")
  }

  init {
    require(line >= 1) {
      "Line should be equal or greater than 1, was $line"
    }

    require(column >= 0) {
      "Column should be equal or greater than 0, was $column"
    }
  }

  override fun toString(): String =
    "Line $line, Column $column"

  /**
   * Translate the point to an offset in the original code stream.
   */
  public fun offset(code: String): Int {
    val lines = code.split("\n")

    require(lines.size >= line) {
      "The point does not exist in the given text. It indicates line $line but there are only ${lines.size} lines"
    }

    require(lines[line - 1].length >= column) {
      "The column does not exist in the given text. Line $line has ${lines[line - 1].length} columns, the point indicates column $column"
    }

    val newLines = line - 1
    val foldedLines = lines.subList(0, line - 1).foldRight(0) { it, acc ->
      it.length + acc
    }

    return foldedLines + newLines + column
  }

  public fun isBefore(other: Point): Boolean =
    line < other.line || (line == other.line && column < other.column)

  public fun advance(text: String): Point {
    val matches = lineBreakRegex.findAll(text)
    val line = line + matches.count()
    val col = if (matches.none()) {
      column + text.length
    } else {
      text.length - matches.last().range.last - 1
    }

    return Point(line, col)
  }
}
