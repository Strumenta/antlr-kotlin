/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/**
 * The block that begins a closure loop.
 */
public class StarBlockStartState : BlockStartState() {
  override val stateType: Int =
    STAR_BLOCK_START
}
