// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

/**
 * This class represents the primary interface for creating [CharStream]s
 * from a variety of sources as of 4.7. The motivation was to support
 * Unicode code points > `U+FFFF`.
 *
 * [ANTLRInputStream] and `ANTLRFileStream` are now deprecated in favor
 * of the streams created by this interface.
 *
 * - DEPRECATED: `ANTLRFileStream("myinputfile")`
 * - NEW:        `CharStreams.fromFileName("myinputfile")`
 *
 * WARNING: if you use both the deprecated and the new streams, you will see
 * a nontrivial performance degradation. This speed hit is because the
 * [Lexer]'s internal code goes from a monomorphic to megamorphic
 * dynamic dispatch to get characters from the input stream. Java's
 * on-the-fly compiler (JIT) is unable to perform the same optimizations
 * so stick with either the old or the new streams, if performance is
 * a primary concern. See the extreme debugging and spelunking
 * needed to identify this issue in our timing rig:
 *
 * [antlr4#1781](https://github.com/antlr/antlr4/pull/1781)
 *
 * The ANTLR character streams still buffer all the input when you create
 * the stream, as they have done for ~20 years. If you need unbuffered
 * access, please note that it becomes challenging to create
 * parse trees. The parse tree has to point to tokens which will either
 * point into a stale location in an unbuffered stream or you have to copy
 * the characters out of the buffer into the token. That defeats the purpose
 * of unbuffered input. Per the ANTLR book, unbuffered streams are primarily
 * useful for processing infinite streams *during the parse*.
 *
 * The new streams also use 8-bit buffers when possible so this new
 * interface supports character streams that use half as much memory
 * as the old `ANTLRFileStream`, which assumed 16-bit characters.
 *
 * A big shout-out to Ben Hamilton (GitHub `bhamiltoncx`) for his superhuman
 * efforts across all targets to get true Unicode 3.1 support for `U+10FFFF`.
 *
 * @since 4.7
 */
public expect object CharStreams : AbstractCharStreams
