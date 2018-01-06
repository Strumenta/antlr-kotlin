package org.antlr.v4.kotlinruntime.ast

/**
 * The line should be in 1..n, the column in 0..n
 */
data class Point(val line: Int, val column: Int) {
    init {
        require(line >= 1) { "Line should be equal or greater than 1, was $line" }
        require(column >= 0) { "Column should be equal or greater than 0, was $column" }
    }

    override fun toString() = "Line $line, Column $column"

    /**
     * Translate the Point to an offset in the original code stream.
     */
    fun offset(code: String) : Int {
        val lines = code.split("\n")
        require(lines.size >= line) {
            "The point does not exist in the given text. It indicates line $line but there are only ${lines.size} lines" }
        require(lines[line - 1].length >= column) {
            "The column does not exist in the given text. Line $line has ${lines[line - 1].length} columns, the point indicates column $column" }
        val newLines = this.line - 1
        return lines.subList(0, this.line - 1).foldRight(0, { it, acc -> it.length + acc }) + newLines + column
    }

    fun isBefore(other: Point) : Boolean = line < other.line || (line == other.line && column < other.column)
    fun advance(text: String): Point {
        val matches = Regex("\r\n|\r|\n").findAll(text)
        val line = this.line + matches.count()
        val col = if (matches.none()) column + text.length else text.length - matches.last().range.endInclusive - 1
        return Point(line, col)
    }

}

val START_POINT = Point(1, 0)

/**
 * Both the start point and the end point are included
 */
data class Position(val start: Point, val end: Point) {

    init {
        require(start.isBefore(end) || start == end) {
            "End should follows start or be the same as start (start: $start, end: $end)" }
    }

    /**
     * Given the whole code extract the portion of text corresponding to this position
     */
    fun text(wholeText: String): String {
        return wholeText.substring(start.offset(wholeText), end.offset(wholeText))
    }

    fun length(code: String) = end.offset(code) - start.offset(code)

    fun contains(point: Point) : Boolean {
        return ((point == start || start.isBefore(point)) && (point == end || point.isBefore(end)))
    }
}

/**
 * Utility function to create a Position
 */
fun pos(startLine:Int, startCol:Int, endLine:Int, endCol:Int) = Position(Point(startLine,startCol), Point(endLine,endCol))