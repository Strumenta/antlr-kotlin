/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/** Start of `(A|B|...)+` loop. Technically a decision state, but
 * we don't use for code generation; somebody might need it, so I'm defining
 * it for completeness. In reality, the [PlusLoopbackState] node is the
 * real decision-making note for `A+`.
 */
class PlusBlockStartState : BlockStartState() {
    var loopBackState: PlusLoopbackState? = null

    override val stateType: Int
        get() = ATNState.PLUS_BLOCK_START
}
