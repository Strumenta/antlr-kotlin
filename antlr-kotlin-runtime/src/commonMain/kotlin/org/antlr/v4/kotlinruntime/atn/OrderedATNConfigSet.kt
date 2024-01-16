// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

import org.antlr.v4.kotlinruntime.misc.ObjectEqualityComparator

/**
 * @author Sam Harwell
 */
public class OrderedATNConfigSet : ATNConfigSet() {
  public class LexerConfigHashSet : AbstractConfigHashSet(ObjectEqualityComparator.INSTANCE)

  init {
    configLookup = LexerConfigHashSet()
  }
}
