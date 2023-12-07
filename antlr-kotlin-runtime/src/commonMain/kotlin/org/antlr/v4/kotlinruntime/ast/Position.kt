package org.antlr.v4.kotlinruntime.ast

/**
 * Both the start point and the end point are included.
 */
public data class Position(val start: Point, val end: Point) {
  public constructor(
    startLine: Int,
    startCol: Int,
    endLine: Int,
    endCol: Int,
  ) : this(Point(startLine, startCol), Point(endLine, endCol))

  init {
    require(start.isBefore(end) || start == end) {
      "End should follows start or be the same as start (start: $start, end: $end)"
    }
  }

  /**
   * Given the whole code, extract the portion of text corresponding to this position.
   */
  public fun text(wholeText: String): String =
    wholeText.substring(start.offset(wholeText), end.offset(wholeText))

  public fun length(code: String): Int =
    end.offset(code) - start.offset(code)

  public fun contains(point: Point): Boolean =
    ((point == start || start.isBefore(point)) && (point == end || point.isBefore(end)))
}
