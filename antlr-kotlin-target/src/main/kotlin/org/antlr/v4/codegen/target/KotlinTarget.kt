package org.antlr.v4.codegen.target

import org.antlr.v4.codegen.CodeGenerator
import org.antlr.v4.codegen.Target
import org.antlr.v4.codegen.UnicodeEscapes
import org.antlr.v4.tool.Grammar

public class KotlinTarget(codeGenerator: CodeGenerator) : JavaTarget(codeGenerator) {
  private companion object {
    /**
     * Reserved Kotlin keywords.
     */
    private val kotlinKeywords = arrayOf(
      "abstract",
      "catch",
      "class",
      "const",
      "else",
      "enum",
      "false",
      "for",
      "if",
      "implements",
      "import",
      "interface",
      "internal",
      "is",
      "null",
      "object",
      "package",
      "private",
      "public",
      "return",
      "this",
      "throw",
      "true",
      "try",
      "val",
      "var",
      "while",
    )

    /**
     * @see Target.defaultCharValueEscape
     * @see Target.getTargetCharValueEscape
     */
    private val kotlinCharValueEscape: Map<Char, String>

    init {
      kotlinCharValueEscape = HashMap(defaultCharValueEscape)
      addEscapedChar(kotlinCharValueEscape, '$')

      kotlinCharValueEscape[11.toChar()] = "\\u000b" // Vertical tab
      kotlinCharValueEscape[12.toChar()] = "\\u000c" // Form feed
      kotlinCharValueEscape[14.toChar()] = "\\u000e" // Shift out
      kotlinCharValueEscape[15.toChar()] = "\\u000f" // Shift in
    }
  }

  /**
   * @see JavaTarget.reservedWords
   * @see Target.getReservedWords
   */
  private val kotlinReservedWords = buildSet {
    addAll(kotlinKeywords)
    add("rule")
    add("parserRule")
  }

  override fun getVersion(): String =
    "4.13.1"

  override fun getReservedWords(): Set<String> =
    kotlinReservedWords

  override fun getTargetCharValueEscape(): Map<Char, String> =
    kotlinCharValueEscape

  override fun encodeInt16AsCharEscape(v: Int): String {
    require(v in Character.MIN_VALUE.code..Character.MAX_VALUE.code) {
      "Cannot encode the specified value: $v"
    }

    return "\\u" + Integer.toHexString(v or 0x10000).substring(1, 5)
  }

  override fun appendUnicodeEscapedCodePoint(codePoint: Int, sb: StringBuilder): Unit =
    UnicodeEscapes.appendEscapedCodePoint(sb, codePoint, "Java")

  override fun getTokenTypeAsTargetLabel(g: Grammar, ttype: Int): String {
    // All tokens are namespaced inside a Tokens object.
    // Here we simply force the qualification
    val label = super.getTokenTypeAsTargetLabel(g, ttype)
    return "Tokens.$label"
  }

  override fun getTargetStringLiteralFromANTLRStringLiteral(
    generator: CodeGenerator,
    literal: String,
    addQuotes: Boolean,
    escapeSpecial: Boolean,
  ): String {
    val str = super.getTargetStringLiteralFromANTLRStringLiteral(generator, literal, addQuotes, escapeSpecial)
    return str.replace("$", "\\$")
  }
}
