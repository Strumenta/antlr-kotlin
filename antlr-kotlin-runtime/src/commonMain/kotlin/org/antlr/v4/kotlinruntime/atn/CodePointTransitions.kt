// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * Utility class to create [AtomTransition], [RangeTransition],
 * and [SetTransition] appropriately based on the range of the input.
 *
 * Previously, we distinguished between atom and range transitions for
 * Unicode code points <= `U+FFFF` and those above. We used a set
 * transition for a Unicode code point > `U+FFFF`. Now that we can serialize
 * 32-bit int/chars in the ATN serialization, this is no longer necessary.
 */
@Suppress("MemberVisibilityCanBePrivate")
public object CodePointTransitions {
  /**
   * Return new [AtomTransition].
   */
  public fun createWithCodePoint(target: ATNState, codePoint: Int): Transition =
    createWithCodePointRange(target, codePoint, codePoint)

  /**
   * Return new [AtomTransition] if range represents one atom, else [SetTransition].
   */
  public fun createWithCodePointRange(target: ATNState, codePointFrom: Int, codePointTo: Int): Transition =
    if (codePointFrom == codePointTo) {
      AtomTransition(target, codePointFrom)
    } else {
      RangeTransition(target, codePointFrom, codePointTo)
    }
}
