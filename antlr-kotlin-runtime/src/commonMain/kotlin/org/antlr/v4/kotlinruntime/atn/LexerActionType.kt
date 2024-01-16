// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.

package org.antlr.v4.kotlinruntime.atn

/**
 * Represents the serialization type of a [LexerAction].
 *
 * @author Sam Harwell
 * @since 4.2
 */
public enum class LexerActionType {
  /**
   * The type of a [LexerChannelAction] action.
   */
  CHANNEL,

  /**
   * The type of a [LexerCustomAction] action.
   */
  CUSTOM,

  /**
   * The type of a [LexerModeAction] action.
   */
  MODE,

  /**
   * The type of a [LexerMoreAction] action.
   */
  MORE,

  /**
   * The type of a [LexerPopModeAction] action.
   */
  POP_MODE,

  /**
   * The type of a [LexerPushModeAction] action.
   */
  PUSH_MODE,

  /**
   * The type of a [LexerSkipAction] action.
   */
  SKIP,

  /**
   * The type of a [LexerTypeAction] action.
   */
  TYPE,
}
