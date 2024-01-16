// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree.pattern

/**
 * A chunk is either a token tag, a rule tag, or a span
 * of literal text within a tree pattern.
 *
 * The method [ParseTreePatternMatcher.split] returns a list of
 * chunks in preparation for creating a token stream by
 * [ParseTreePatternMatcher.tokenize].
 *
 * From there, we get a parse tree from with [ParseTreePatternMatcher.compile].
 * These chunks are converted to [RuleTagToken], [TokenTagToken], or the
 * regular tokens of the text surrounding the tags.
 */
internal abstract class Chunk
