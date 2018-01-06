/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.tree.pattern

/**
 * A chunk is either a token tag, a rule tag, or a span of literal text within a
 * tree pattern.
 *
 *
 * The method [ParseTreePatternMatcher.split] returns a list of
 * chunks in preparation for creating a token stream by
 * [ParseTreePatternMatcher.tokenize]. From there, we get a parse
 * tree from with [ParseTreePatternMatcher.compile]. These
 * chunks are converted to [RuleTagToken], [TokenTagToken], or the
 * regular tokens of the text surrounding the tags.
 */
internal abstract class Chunk
