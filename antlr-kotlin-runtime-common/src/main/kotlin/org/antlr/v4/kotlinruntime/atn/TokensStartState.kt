/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn

/** The Tokens rule start state linking to each lexer rule start state  */
class TokensStartState : DecisionState() {

    override val stateType: Int
        get() = ATNState.TOKEN_START
}
