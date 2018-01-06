/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/** Mark the end of a * or + loop.  */
class LoopEndState : ATNState() {
    var loopBackState: ATNState? = null

    override val stateType: Int
        get() = ATNState.LOOP_END
}
