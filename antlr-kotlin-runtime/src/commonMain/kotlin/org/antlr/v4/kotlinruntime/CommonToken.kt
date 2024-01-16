// Copyright 2017-present Strumenta and contributors, licensed under Apache 2.0.
// Copyright 2024-present Strumenta and contributors, licensed under BSD 3-Clause.
package org.antlr.v4.kotlinruntime

import org.antlr.v4.kotlinruntime.misc.Interval

public open class CommonToken : WritableToken {
  protected companion object {
    /**
     * An empty pair which is used as the default value of
     * [source] for tokens that do not have a source.
     */
    protected val EMPTY_SOURCE: Pair<TokenSource?, CharStream?> = Pair<TokenSource?, CharStream?>(null, null)
  }

  /**
   * This is the backing field for [tokenSource] and [inputStream].
   *
   * These properties share a field to reduce the memory footprint of [CommonToken].
   * Tokens created by a [CommonTokenFactory] from the same source and input stream
   * share a reference to the same [Pair] containing these values.
   */
  protected var source: Pair<TokenSource?, CharStream?>

  /**
   * This is the backing field for [text].
   */
  private var _text: String? = null

  override var type: Int = 0
  override var line: Int = 0
  override var charPositionInLine: Int = -1
  override var channel: Int = Token.DEFAULT_CHANNEL
  override var tokenIndex: Int = -1
  override var startIndex: Int = 0
  override var stopIndex: Int = 0

  override val tokenSource: TokenSource?
    get() = source.first

  override val inputStream: CharStream?
    get() = source.second

  override var text: String?
    get() {
      if (_text != null) {
        return _text
      }

      val input = inputStream ?: return null
      val n = input.size()
      return if (startIndex < n && stopIndex < n) {
        input.getText(Interval.of(startIndex, stopIndex))
      } else {
        "<EOF>"
      }
    }
    set(value) {
      _text = value
    }

  @Suppress("LeakingThis")
  public constructor(type: Int) {
    this.type = type
    source = EMPTY_SOURCE
  }

  @Suppress("LeakingThis")
  public constructor(
    source: Pair<TokenSource?, CharStream?>,
    type: Int,
    channel: Int,
    startIndex: Int,
    stopIndex: Int,
  ) {
    this.source = source
    this.type = type
    this.channel = channel
    this.startIndex = startIndex
    this.stopIndex = stopIndex

    val a = source.first

    if (a != null) {
      line = a.line
      charPositionInLine = a.charPositionInLine
    }
  }

  @Suppress("LeakingThis")
  public constructor(type: Int, text: String) {
    this.type = type
    this.text = text
    channel = Token.DEFAULT_CHANNEL
    source = EMPTY_SOURCE
  }

  /**
   * Constructs a new [CommonToken] as a copy of another [Token].
   *
   * If [oldToken] is also a [CommonToken] instance, the newly
   * constructed token will share a reference to the [text] field and
   * the [Pair] stored in [source].
   *
   * @param oldToken The token to copy
   */
  @Suppress("LeakingThis")
  public constructor(oldToken: Token) {
    type = oldToken.type
    line = oldToken.line
    tokenIndex = oldToken.tokenIndex
    charPositionInLine = oldToken.charPositionInLine
    channel = oldToken.channel
    startIndex = oldToken.startIndex
    stopIndex = oldToken.stopIndex

    if (oldToken is CommonToken) {
      text = oldToken._text
      source = oldToken.source
    } else {
      text = oldToken.text
      source = Pair(oldToken.tokenSource, oldToken.inputStream)
    }
  }

  override fun toString(): String =
    toString(null)

  public fun toString(r: Recognizer<*, *>?): String {
    val channelStr = if (channel > 0) {
      ",channel=$channel"
    } else {
      ""
    }

    var txt = text

    if (txt != null) {
      txt = txt.replace("\n", "\\n")
      txt = txt.replace("\r", "\\r")
      txt = txt.replace("\t", "\\t")
    } else {
      txt = "<no text>"
    }

    val typeString = r?.vocabulary?.getDisplayName(type) ?: type.toString()
    return "[@$tokenIndex,$startIndex:$stopIndex='$txt',<$typeString>$channelStr,$line:$charPositionInLine]"
  }
}
