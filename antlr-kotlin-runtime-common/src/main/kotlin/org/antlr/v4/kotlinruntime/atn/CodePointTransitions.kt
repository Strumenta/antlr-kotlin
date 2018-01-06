/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

import com.strumenta.kotlinmultiplatform.isSupplementaryCodePoint
import org.antlr.v4.kotlinruntime.misc.IntervalSet

/**
 * Utility class to create [AtomTransition], [RangeTransition],
 * and [SetTransition] appropriately based on the range of the input.
 *
 * To keep the serialized ATN size small, we only inline atom and
 * range transitions for Unicode code points <= U+FFFF.
 *
 * Whenever we encounter a Unicode code point > U+FFFF, we represent that
 * as a set transition (even if it is logically an atom or a range).
 */
object CodePointTransitions {
    /**
     * If `codePoint` is <= U+FFFF, returns a new [AtomTransition].
     * Otherwise, returns a new [SetTransition].
     */
    fun createWithCodePoint(target: ATNState, codePoint: Int): Transition {
        return if (Char.isSupplementaryCodePoint(codePoint)) {
            SetTransition(target, IntervalSet.of(codePoint))
        } else {
            AtomTransition(target, codePoint)
        }
    }

    /**
     * If `codePointFrom` and `codePointTo` are both
     * <= U+FFFF, returns a new [RangeTransition].
     * Otherwise, returns a new [SetTransition].
     */
    fun createWithCodePointRange(
            target: ATNState,
            codePointFrom: Int,
            codePointTo: Int): Transition {
        return if (Char.isSupplementaryCodePoint(codePointFrom) || Char.isSupplementaryCodePoint(codePointTo)) {
            SetTransition(target, IntervalSet.of(codePointFrom, codePointTo))
        } else {
            RangeTransition(target, codePointFrom, codePointTo)
        }
    }
}
