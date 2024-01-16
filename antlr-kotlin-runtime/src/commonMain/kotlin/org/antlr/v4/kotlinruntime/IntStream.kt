// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime

/**
 * A simple stream of symbols whose values are represented as integers.
 * This interface provides *marked ranges* with support for a minimum level
 * of buffering necessary to implement arbitrary lookahead during prediction.
 * For more information on marked ranges, see [mark].
 *
 * **Initializing methods:** some methods in this interface have
 * unspecified behavior if no call to an initializing method has occurred after
 * the stream was constructed. The following is a list of initializing methods:
 *
 *  - [LA]
 *  - [consume]
 *  - [size]
 */
public interface IntStream {
  public companion object {
    /**
     * The value returned by [LA] when the end of the stream is reached.
     */
    public const val EOF: Int = -1

    /**
     * The value returned by [sourceName] when the actual name of the
     * underlying source is not known.
     */
    public const val UNKNOWN_SOURCE_NAME: String = "<unknown>"
  }

  /**
   * Gets the name of the underlying symbol source.
   *
   * This method returns a non-`null`, non-empty string.
   * If such a name is not known, this method returns [UNKNOWN_SOURCE_NAME].
   */
  public val sourceName: String

  /**
   * Consumes the current symbol in the stream.
   *
   * This method has the following effects:
   *
   *  - **Forward movement:** the value of [index] before calling
   *  this method is less than the value of [index] after calling this method
   *  - **Ordered lookahead:** the value of `LA(1)` before calling
   *    this method becomes the value of `LA(-1)` after calling this method
   *
   * Note that calling this method does not guarantee that [index] is
   * incremented by exactly `1`, as that would preclude the ability to implement
   * filtering streams (e.g., [CommonTokenStream] which distinguishes
   * between "on-channel" and "off-channel" tokens).
   *
   * @throws IllegalStateException If an attempt is made to consume the
   *   end of the stream (i.e., if `LA(1) == `[EOF] before calling `consume`)
   */
  public fun consume()

  /**
   * Gets the value of the symbol at offset [i] from the current position.
   *
   * When [i] `== 1`, this method returns the value of the current
   * symbol in the stream (which is the next symbol to be consumed).
   * When [i] `== -1`, this method returns the value of the previously read
   * symbol in the stream. It is not valid to call this method with
   * [i] `== 0`, but the specific behavior is unspecified because this
   * method is frequently called from performance-critical code.
   *
   * This method is guaranteed to succeed if any of the following are true:
   *
   *  - [i] `> 0`
   *  - [i] `== -1` and [index] returns a value greater than the value
   *    of [index] after the stream was constructed and `LA(1)` was called
   *    in that order. Specifying the current [index] relative to the index
   *    after the stream was created allows for filtering implementations
   *    that do not return every symbol from the underlying source.
   *    Specifying the call to `LA(1)` allows for lazily initialized streams
   *  - `LA(i)` refers to a symbol consumed within a marked region
   *    that has not yet been released
   *
   * If [i] represents a position at or beyond the end of the stream,
   * this method returns [EOF].
   *
   * The return value is unspecified if [i] `< 0` and fewer than `-`[i]
   * calls to [consume] have occurred from the beginning of the stream
   * before calling this method.
   *
   * @throws UnsupportedOperationException If the stream does not support
   *   retrieving the value of the specified symbol
   */
  @Suppress("FunctionName")
  public fun LA(i: Int): Int

  /**
   * A mark provides a guarantee that [seek] operations will be
   * valid over a "marked range" extending from the index where [mark]
   * was called to the current [index].
   *
   * This allows the use of streaming input sources by specifying the minimum
   * buffering requirements to support arbitrary lookahead during prediction.
   *
   * The returned mark is an opaque handle (type `Int`) which is passed
   * to [release] when the guarantees provided by the marked range are no longer necessary.
   *
   * When calls to [mark]/[release] are nested, the marks must be released
   * in reverse order of which they were obtained. Since marked regions are
   * used during performance-critical sections of prediction, the specific
   * behavior of invalid usage is unspecified (i.e., a mark is not released, or
   * a mark is released twice, or marks are not released in reverse order from
   * which they were created).
   *
   * The behavior of this method is unspecified if no call to an
   * *initializing method* has occurred after this stream was constructed.
   *
   * This method does not change the current position in the input stream.
   *
   * The following example shows the use of [mark], [release], [index], and
   * [seek] as part of an operation to safely work within a marked region,
   * then restore the stream position to its original value and release the mark.
   *
   * ```
   * val stream: IntStream = ...
   * var index = -1
   * val mark = stream.mark()
   *
   * try {
   *   index = stream.index()
   *   // Perform work here...
   * } finally {
   *   if (index != -1) {
   *     stream.seek(index)
   *   }
   *
   *   stream.release(mark)
   * }
   * ```
   *
   * @return An opaque marker which should be passed to [release]
   *   when the marked range is no longer required
   */
  public fun mark(): Int

  /**
   * This method releases a marked range created by a call to [mark].
   *
   * Calls to [release] must appear in the reverse order of the corresponding
   * calls to [mark]. If a mark is released twice, or if marks are not released
   * in reverse order of the corresponding calls to [mark], the behavior is unspecified.
   *
   * For more information and an example, see [mark].
   *
   * @param marker A marker returned by a call to [mark]
   * @see mark
   */
  public fun release(marker: Int)

  /**
   * Return the index into the stream of the input symbol referred to by `LA(1)`.
   *
   * The behavior of this method is unspecified if no call to an
   * *initializing method* has occurred after this stream was constructed.
   */
  public fun index(): Int

  /**
   * Set the input cursor to the position indicated by [index].
   *
   * If the specified [index] lies past the end of the stream, the operation
   * behaves as though [index] was the index of the `EOF` symbol.
   * After this method returns without throwing an exception, then at least
   * one of the following will be true.
   *
   *  - [index] will return the index of the first symbol appearing
   *    at or after the specified `index`. Specifically, implementations
   *    which filter their sources should automatically adjust `index`
   *    forward the minimum amount required for the operation to target
   *    a non-ignored symbol
   *  - `LA(1)` returns [EOF]
   *
   * This operation is guaranteed to not throw an exception if [index]
   * lies within a marked region. For more information on marked regions,
   * see [mark]. The behavior of this method is unspecified if no call to
   * an *initializing method* has occurred after this stream was constructed
   *
   * @param index The absolute index to seek to
   *
   * @throws IllegalArgumentException If [index] is less than `0`
   * @throws UnsupportedOperationException If the stream does not support
   *   seeking to the specified [index]
   */
  public fun seek(index: Int)

  /**
   * Returns the total number of symbols in the stream, including a single `EOF` symbol.
   *
   * @throws UnsupportedOperationException If the size of the stream is unknown
   */
  public fun size(): Int
}
