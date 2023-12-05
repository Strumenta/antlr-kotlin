package org.antlr.v4.codegen.target

import org.antlr.v4.codegen.CodeGenerator
import org.antlr.v4.codegen.UnicodeEscapes
import org.stringtemplate.v4.STGroup
import org.stringtemplate.v4.StringRenderer

public class KotlinTarget(codeGenerator: CodeGenerator) : JavaTarget(codeGenerator) {
  public companion object {
    public const val VERSION: String = "4.13.1"

    /**
     * The Kotlin target can cache the code generation templates.
     */
    private val targetTemplates = ThreadLocal<STGroup>()

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
      "is",
      "interface",
      "null",
      "package",
      "private",
      "internal",
      "public",
      "return",
      "this",
      "throw",
      "true",
      "try",
      "while",
      "object",
    )

    private val kotlinCharValueEscape: Map<Char, String>

    init {
      val map = HashMap(defaultCharValueEscape)
      addEscapedChar(map, '$')

      map[11.toChar()] = "\\u000b" // Vertical tab
      map[12.toChar()] = "\\u000c" // Form feed
      map[14.toChar()] = "\\u000e" // Shift out
      map[15.toChar()] = "\\u000f" // Shift in

      kotlinCharValueEscape = map
    }
  }

  /**
   * Avoid grammar symbols in this set to prevent conflicts in generated code.
   */
  private val badWords: Set<String> by lazy {
    val set = HashSet<String>(64)
    set.addAll(kotlinKeywords)
    set.add("rule")
    set.add("parserRule")
    set
  }

  override fun getVersion(): String =
    VERSION

  override fun getReservedWords(): Set<String> =
    badWords

  override fun getTargetCharValueEscape(): Map<Char, String> =
    kotlinCharValueEscape

  override fun encodeInt16AsCharEscape(v: Int): String {
    require(v >= Character.MIN_VALUE.code && v <= Character.MAX_VALUE.code) {
      "Cannot encode the specified value: $v"
    }

    return "\\u" + Integer.toHexString(v or 0x10000).substring(1, 5)
  }

  override fun loadTemplates(): STGroup {
    var result = targetTemplates.get()

    if (result == null) {
      result = super.loadTemplates()
      result.registerRenderer(String::class.java, KotlinStringRenderer(), true)
      targetTemplates.set(result)
    }

    return result
  }

  override fun appendUnicodeEscapedCodePoint(codePoint: Int, sb: StringBuilder): Unit =
    UnicodeEscapes.appendEscapedCodePoint(sb, codePoint, "Java")

  private class KotlinStringRenderer : StringRenderer()
}
