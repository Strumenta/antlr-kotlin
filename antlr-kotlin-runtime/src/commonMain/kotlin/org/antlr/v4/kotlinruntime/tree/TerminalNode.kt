// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.tree

import org.antlr.v4.kotlinruntime.Token

public interface TerminalNode : ParseTree {
  public val symbol: Token
}
