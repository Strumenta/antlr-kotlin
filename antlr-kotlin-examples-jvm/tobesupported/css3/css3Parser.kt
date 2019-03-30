// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc;
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import kotlin.reflect.KClass

class css3Parser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(css3Parser.StylesheetContext::class,
                                                              css3Parser.CharsetContext::class,
                                                              css3Parser.ImportsContext::class,
                                                              css3Parser.NamespaceContext::class,
                                                              css3Parser.NamespacePrefixContext::class,
                                                              css3Parser.MediaContext::class,
                                                              css3Parser.MediaQueryListContext::class,
                                                              css3Parser.MediaQueryContext::class,
                                                              css3Parser.MediaTypeContext::class,
                                                              css3Parser.MediaExpressionContext::class,
                                                              css3Parser.MediaFeatureContext::class,
                                                              css3Parser.PageContext::class,
                                                              css3Parser.PseudoPageContext::class,
                                                              css3Parser.SelectorGroupContext::class,
                                                              css3Parser.SelectorContext::class,
                                                              css3Parser.CombinatorContext::class,
                                                              css3Parser.SimpleSelectorSequenceContext::class,
                                                              css3Parser.TypeSelectorContext::class,
                                                              css3Parser.TypeNamespacePrefixContext::class,
                                                              css3Parser.ElementNameContext::class,
                                                              css3Parser.UniversalContext::class,
                                                              css3Parser.ClassNameContext::class,
                                                              css3Parser.AttribContext::class,
                                                              css3Parser.PseudoContext::class,
                                                              css3Parser.FunctionalPseudoContext::class,
                                                              css3Parser.ExpressionContext::class,
                                                              css3Parser.NegationContext::class,
                                                              css3Parser.NegationArgContext::class,
                                                              css3Parser.OperatorContext::class,
                                                              css3Parser.PropertyContext::class,
                                                              css3Parser.RulesetContext::class,
                                                              css3Parser.DeclarationListContext::class,
                                                              css3Parser.DeclarationContext::class,
                                                              css3Parser.PrioContext::class,
                                                              css3Parser.ValueContext::class,
                                                              css3Parser.ExprContext::class,
                                                              css3Parser.TermContext::class,
                                                              css3Parser.FunctionContext::class,
                                                              css3Parser.DxImageTransformContext::class,
                                                              css3Parser.HexcolorContext::class,
                                                              css3Parser.NumberContext::class,
                                                              css3Parser.PercentageContext::class,
                                                              css3Parser.DimensionContext::class,
                                                              css3Parser.UnknownDimensionContext::class,
                                                              css3Parser.AnyContext::class,
                                                              css3Parser.AtRuleContext::class,
                                                              css3Parser.AtKeywordContext::class,
                                                              css3Parser.UnusedContext::class,
                                                              css3Parser.BlockContext::class,
                                                              css3Parser.NestedStatementContext::class,
                                                              css3Parser.GroupRuleBodyContext::class,
                                                              css3Parser.SupportsRuleContext::class,
                                                              css3Parser.SupportsConditionContext::class,
                                                              css3Parser.SupportsConditionInParensContext::class,
                                                              css3Parser.SupportsNegationContext::class,
                                                              css3Parser.SupportsConjunctionContext::class,
                                                              css3Parser.SupportsDisjunctionContext::class,
                                                              css3Parser.SupportsDeclarationConditionContext::class,
                                                              css3Parser.GeneralEnclosedContext::class,
                                                              css3Parser.VarContext::class,
                                                              css3Parser.CalcContext::class,
                                                              css3Parser.CalcSumContext::class,
                                                              css3Parser.CalcProductContext::class,
                                                              css3Parser.CalcValueContext::class,
                                                              css3Parser.FontFaceRuleContext::class,
                                                              css3Parser.FontFaceDeclarationContext::class,
                                                              css3Parser.KeyframesRuleContext::class,
                                                              css3Parser.KeyframesBlocksContext::class,
                                                              css3Parser.KeyframeSelectorContext::class,
                                                              css3Parser.ViewportContext::class,
                                                              css3Parser.CounterStyleContext::class,
                                                              css3Parser.FontFeatureValuesRuleContext::class,
                                                              css3Parser.FontFamilyNameListContext::class,
                                                              css3Parser.FontFamilyNameContext::class,
                                                              css3Parser.FeatureValueBlockContext::class,
                                                              css3Parser.FeatureTypeContext::class,
                                                              css3Parser.FeatureValueDefinitionContext::class,
                                                              css3Parser.IdentContext::class,
                                                              css3Parser.WsContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "css3.g4"

    override val tokenNames: Array<String?>?
        get() = css3Parser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = css3Parser.Companion.ruleNames
    override val atn: ATN
        get() = css3Parser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        T__0(1),
        T__1(2),
        T__2(3),
        T__3(4),
        T__4(5),
        T__5(6),
        T__6(7),
        T__7(8),
        T__8(9),
        T__9(10),
        T__10(11),
        T__11(12),
        T__12(13),
        T__13(14),
        T__14(15),
        Comment(16),
        Space(17),
        Cdo(18),
        Cdc(19),
        Includes(20),
        DashMatch(21),
        Hash(22),
        Import(23),
        Page(24),
        Media(25),
        Namespace(26),
        Charset(27),
        Important(28),
        Percentage(29),
        Uri(30),
        UnicodeRange(31),
        MediaOnly(32),
        Not(33),
        And(34),
        Dimension(35),
        UnknownDimension(36),
        Plus(37),
        Minus(38),
        Greater(39),
        Comma(40),
        Tilde(41),
        PseudoNot(42),
        Number(43),
        String(44),
        PrefixMatch(45),
        SuffixMatch(46),
        SubstringMatch(47),
        FontFace(48),
        Supports(49),
        Or(50),
        Keyframes(51),
        From(52),
        To(53),
        Calc(54),
        Viewport(55),
        CounterStyle(56),
        FontFeatureValues(57),
        DxImageTransform(58),
        Variable(59),
        Var(60),
        Ident(61),
        Function(62)
    }

    enum class Rules(val id: Int) {
        RULE_stylesheet(0),
        RULE_charset(1),
        RULE_imports(2),
        RULE_namespace(3),
        RULE_namespacePrefix(4),
        RULE_media(5),
        RULE_mediaQueryList(6),
        RULE_mediaQuery(7),
        RULE_mediaType(8),
        RULE_mediaExpression(9),
        RULE_mediaFeature(10),
        RULE_page(11),
        RULE_pseudoPage(12),
        RULE_selectorGroup(13),
        RULE_selector(14),
        RULE_combinator(15),
        RULE_simpleSelectorSequence(16),
        RULE_typeSelector(17),
        RULE_typeNamespacePrefix(18),
        RULE_elementName(19),
        RULE_universal(20),
        RULE_className(21),
        RULE_attrib(22),
        RULE_pseudo(23),
        RULE_functionalPseudo(24),
        RULE_expression(25),
        RULE_negation(26),
        RULE_negationArg(27),
        RULE_operator(28),
        RULE_property(29),
        RULE_ruleset(30),
        RULE_declarationList(31),
        RULE_declaration(32),
        RULE_prio(33),
        RULE_value(34),
        RULE_expr(35),
        RULE_term(36),
        RULE_function(37),
        RULE_dxImageTransform(38),
        RULE_hexcolor(39),
        RULE_number(40),
        RULE_percentage(41),
        RULE_dimension(42),
        RULE_unknownDimension(43),
        RULE_any(44),
        RULE_atRule(45),
        RULE_atKeyword(46),
        RULE_unused(47),
        RULE_block(48),
        RULE_nestedStatement(49),
        RULE_groupRuleBody(50),
        RULE_supportsRule(51),
        RULE_supportsCondition(52),
        RULE_supportsConditionInParens(53),
        RULE_supportsNegation(54),
        RULE_supportsConjunction(55),
        RULE_supportsDisjunction(56),
        RULE_supportsDeclarationCondition(57),
        RULE_generalEnclosed(58),
        RULE_var(59),
        RULE_calc(60),
        RULE_calcSum(61),
        RULE_calcProduct(62),
        RULE_calcValue(63),
        RULE_fontFaceRule(64),
        RULE_fontFaceDeclaration(65),
        RULE_keyframesRule(66),
        RULE_keyframesBlocks(67),
        RULE_keyframeSelector(68),
        RULE_viewport(69),
        RULE_counterStyle(70),
        RULE_fontFeatureValuesRule(71),
        RULE_fontFamilyNameList(72),
        RULE_fontFamilyName(73),
        RULE_featureValueBlock(74),
        RULE_featureType(75),
        RULE_featureValueDefinition(76),
        RULE_ident(77),
        RULE_ws(78)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("stylesheet", "charset", "imports", "namespace", 
                                "namespacePrefix", "media", "mediaQueryList", 
                                "mediaQuery", "mediaType", "mediaExpression", 
                                "mediaFeature", "page", "pseudoPage", "selectorGroup", 
                                "selector", "combinator", "simpleSelectorSequence", 
                                "typeSelector", "typeNamespacePrefix", "elementName", 
                                "universal", "className", "attrib", "pseudo", 
                                "functionalPseudo", "expression", "negation", 
                                "negationArg", "operator", "property", "ruleset", 
                                "declarationList", "declaration", "prio", 
                                "value", "expr", "term", "function", "dxImageTransform", 
                                "hexcolor", "number", "percentage", "dimension", 
                                "unknownDimension", "any", "atRule", "atKeyword", 
                                "unused", "block", "nestedStatement", "groupRuleBody", 
                                "supportsRule", "supportsCondition", "supportsConditionInParens", 
                                "supportsNegation", "supportsConjunction", 
                                "supportsDisjunction", "supportsDeclarationCondition", 
                                "generalEnclosed", "var", "calc", "calcSum", 
                                "calcProduct", "calcValue", "fontFaceRule", 
                                "fontFaceDeclaration", "keyframesRule", 
                                "keyframesBlocks", "keyframeSelector", "viewport", 
                                "counterStyle", "fontFeatureValuesRule", 
                                "fontFamilyNameList", "fontFamilyName", 
                                "featureValueBlock", "featureType", "featureValueDefinition", 
                                "ident", "ws")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "';'", 
                                                           "'('", "':'", 
                                                           "')'", "'{'", 
                                                           "'}'", "'*'", 
                                                           "'|'", "'.'", 
                                                           "'['", "'='", 
                                                           "']'", "'/'", 
                                                           "'_'", "'@'", 
                                                           null, null, "'<!--'", 
                                                           "'-->'", "'~='", 
                                                           "'|='", null, 
                                                           null, null, null, 
                                                           null, "'@charset '", 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           "'+'", "'-'", 
                                                           "'>'", "','", 
                                                           "'~'", null, 
                                                           null, null, "'^='", 
                                                           "'$='", "'*='", 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           "'calc('", null, 
                                                           null, null, null, 
                                                           null, "'var('")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            "Comment", "Space", 
                                                            "Cdo", "Cdc", 
                                                            "Includes", 
                                                            "DashMatch", 
                                                            "Hash", "Import", 
                                                            "Page", "Media", 
                                                            "Namespace", 
                                                            "Charset", "Important", 
                                                            "Percentage", 
                                                            "Uri", "UnicodeRange", 
                                                            "MediaOnly", 
                                                            "Not", "And", 
                                                            "Dimension", 
                                                            "UnknownDimension", 
                                                            "Plus", "Minus", 
                                                            "Greater", "Comma", 
                                                            "Tilde", "PseudoNot", 
                                                            "Number", "String", 
                                                            "PrefixMatch", 
                                                            "SuffixMatch", 
                                                            "SubstringMatch", 
                                                            "FontFace", 
                                                            "Supports", 
                                                            "Or", "Keyframes", 
                                                            "From", "To", 
                                                            "Calc", "Viewport", 
                                                            "CounterStyle", 
                                                            "FontFeatureValues", 
                                                            "DxImageTransform", 
                                                            "Variable", 
                                                            "Var", "Ident", 
                                                            "Function")

        val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0040\u045a\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0004\u0046\u0009\u0046\u0004\u0047\u0009\u0047\u0004\u0048\u0009\u0048\u0004\u0049\u0009\u0049\u0004\u004a\u0009\u004a\u0004\u004b\u0009\u004b\u0004\u004c\u0009\u004c\u0004\u004d\u0009\u004d\u0004\u004e\u0009\u004e\u0004\u004f\u0009\u004f\u0004\u0050\u0009\u0050\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u00a4\u000a\u0002\u000c\u0002\u000e\u0002\u00a7\u000b\u0002\u0007\u0002\u00a9\u000a\u0002\u000c\u0002\u000e\u0002\u00ac\u000b\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u00b0\u000a\u0002\u000c\u0002\u000e\u0002\u00b3\u000b\u0002\u0007\u0002\u00b5\u000a\u0002\u000c\u0002\u000e\u0002\u00b8\u000b\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u00bc\u000a\u0002\u000c\u0002\u000e\u0002\u00bf\u000b\u0002\u0007\u0002\u00c1\u000a\u0002\u000c\u0002\u000e\u0002\u00c4\u000b\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u00c8\u000a\u0002\u000c\u0002\u000e\u0002\u00cb\u000b\u0002\u0007\u0002\u00cd\u000a\u0002\u000c\u0002\u000e\u0002\u00d0\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u00de\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u00fa\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0101\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u010d\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0112\u000a\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0007\u0008\u0121\u000a\u0008\u000c\u0008\u000e\u0008\u0124\u000b\u0008\u0005\u0008\u0126\u000a\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0005\u0009\u012b\u000a\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u0134\u000a\u0009\u000c\u0009\u000e\u0009\u0137\u000b\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u013e\u000a\u0009\u000c\u0009\u000e\u0009\u0141\u000b\u0009\u0005\u0009\u0143\u000a\u0009\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u014e\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u0159\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u015e\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u0163\u000a\u000d\u0007\u000d\u0165\u000a\u000d\u000c\u000d\u000e\u000d\u0168\u000b\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0007\u000f\u0176\u000a\u000f\u000c\u000f\u000e\u000f\u0179\u000b\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0007\u0010\u0181\u000a\u0010\u000c\u0010\u000e\u0010\u0184\u000b\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u018e\u000a\u0011\u0003\u0012\u0003\u0012\u0005\u0012\u0192\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012\u0199\u000a\u0012\u000c\u0012\u000e\u0012\u019c\u000b\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0006\u0012\u01a3\u000a\u0012\u000d\u0012\u000e\u0012\u01a4\u0005\u0012\u01a7\u000a\u0012\u0003\u0013\u0005\u0013\u01aa\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0005\u0014\u01b0\u000a\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0016\u0005\u0016\u01b7\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u01c1\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u01c9\u000a\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u01cd\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0005\u0019\u01d3\u000a\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u01d7\u000a\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u01e5\u000a\u001b\u0003\u001b\u0006\u001b\u01e8\u000a\u001b\u000d\u001b\u000e\u001b\u01e9\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u01f8\u000a\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u0202\u000a\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0005\u001f\u020d\u000a\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0213\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0007\u0020\u0219\u000a\u0020\u000c\u0020\u000e\u0020\u021c\u000b\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0221\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0226\u000a\u0020\u0003\u0021\u0003\u0021\u0007\u0021\u022a\u000a\u0021\u000c\u0021\u000e\u0021\u022d\u000b\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0005\u0021\u0234\u000a\u0021\u0007\u0021\u0236\u000a\u0021\u000c\u0021\u000e\u0021\u0239\u000b\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0005\u0022\u0240\u000a\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0005\u0022\u0247\u000a\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0006\u0024\u0251\u000a\u0024\u000d\u0024\u000e\u0024\u0252\u0003\u0025\u0003\u0025\u0005\u0025\u0257\u000a\u0025\u0003\u0025\u0007\u0025\u025a\u000a\u0025\u000c\u0025\u000e\u0025\u025d\u000b\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0279\u000a\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0005\u002a\u028b\u000a\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0005\u002b\u0290\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002c\u0005\u002c\u0295\u000a\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0005\u002d\u029a\u000a\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0007\u002e\u02bf\u000a\u002e\u000c\u002e\u000e\u002e\u02c2\u000b\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0007\u002e\u02cb\u000a\u002e\u000c\u002e\u000e\u002e\u02ce\u000b\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0007\u002e\u02d7\u000a\u002e\u000c\u002e\u000e\u002e\u02da\u000b\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0005\u002e\u02df\u000a\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0007\u002f\u02e4\u000a\u002f\u000c\u002f\u000e\u002f\u02e7\u000b\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0005\u002f\u02ec\u000a\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u02fb\u000a\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0007\u0032\u0308\u000a\u0032\u000c\u0032\u000e\u0032\u030b\u000b\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u031a\u000a\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0007\u0034\u031f\u000a\u0034\u000c\u0034\u000e\u0034\u0322\u000b\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0005\u0036\u0331\u000a\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0005\u0037\u033b\u000a\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0006\u0039\u034d\u000a\u0039\u000d\u0039\u000e\u0039\u034e\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0006\u003a\u035b\u000a\u003a\u000d\u003a\u000e\u003a\u035c\u0003\u003b\u0003\u003b\u0003\u003b\u0003\u003b\u0003\u003b\u0003\u003c\u0003\u003c\u0003\u003c\u0007\u003c\u0367\u000a\u003c\u000c\u003c\u000e\u003c\u036a\u000b\u003c\u0003\u003c\u0003\u003c\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003e\u0003\u003e\u0003\u003e\u0003\u003e\u0003\u003e\u0003\u003e\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0007\u003f\u0384\u000a\u003f\u000c\u003f\u000e\u003f\u0387\u000b\u003f\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0007\u0040\u0393\u000a\u0040\u000c\u0040\u000e\u0040\u0396\u000b\u0040\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0005\u0041\u03aa\u000a\u0041\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0005\u0042\u03b1\u000a\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0005\u0042\u03b6\u000a\u0042\u0007\u0042\u03b8\u000a\u0042\u000c\u0042\u000e\u0042\u03bb\u000b\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0005\u0043\u03ca\u000a\u0043\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0045\u0003\u0045\u0003\u0045\u0003\u0045\u0005\u0045\u03dc\u000a\u0045\u0003\u0045\u0003\u0045\u0003\u0045\u0007\u0045\u03e1\u000a\u0045\u000c\u0045\u000e\u0045\u03e4\u000b\u0045\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0007\u0046\u03ed\u000a\u0046\u000c\u0046\u000e\u0046\u03f0\u000b\u0046\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0005\u0047\u03f7\u000a\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0048\u0003\u0048\u0003\u0048\u0003\u0048\u0003\u0048\u0003\u0048\u0003\u0048\u0005\u0048\u0403\u000a\u0048\u0003\u0048\u0003\u0048\u0003\u0048\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0007\u0049\u040f\u000a\u0049\u000c\u0049\u000e\u0049\u0412\u000b\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u004a\u0003\u004a\u0003\u004a\u0003\u004a\u0003\u004a\u0003\u004a\u0007\u004a\u041d\u000a\u004a\u000c\u004a\u000e\u004a\u0420\u000b\u004a\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004b\u0007\u004b\u0427\u000a\u004b\u000c\u004b\u000e\u004b\u042a\u000b\u004b\u0005\u004b\u042c\u000a\u004b\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0005\u004c\u0433\u000a\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0005\u004c\u0439\u000a\u004c\u0007\u004c\u043b\u000a\u004c\u000c\u004c\u000e\u004c\u043e\u000b\u004c\u0003\u004c\u0003\u004c\u0003\u004c\u0003\u004d\u0003\u004d\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0003\u004e\u0007\u004e\u044d\u000a\u004e\u000c\u004e\u000e\u004e\u0450\u000b\u004e\u0003\u004f\u0003\u004f\u0003\u0050\u0007\u0050\u0455\u000a\u0050\u000c\u0050\u000e\u0050\u0458\u000b\u0050\u0003\u0050\u0002\u0002\u0051\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u0002\u000b\u0003\u0002\u0012\u0015\u0004\u0002\u0020\u0020\u002e\u002e\u0003\u0002\u0022\u0023\u0005\u0002\u000d\u000d\u0016\u0017\u002f\u0031\u0003\u0002\u0027\u0028\u0004\u0002\u0004\u0004\u0040\u0040\u0004\u0002\u001f\u001f\u0036\u0037\u0006\u0002\u0022\u0024\u0034\u0034\u0036\u0037\u003f\u003f\u0003\u0002\u0012\u0013\u0002\u04ba\u0002\u00a0\u0003\u0002\u0002\u0002\u0004\u00dd\u0003\u0002\u0002\u0002\u0006\u00f9\u0003\u0002\u0002\u0002\u0008\u0111\u0003\u0002\u0002\u0002\u000a\u0113\u0003\u0002\u0002\u0002\u000c\u0115\u0003\u0002\u0002\u0002\u000e\u0125\u0003\u0002\u0002\u0002\u0010\u0142\u0003\u0002\u0002\u0002\u0012\u0144\u0003\u0002\u0002\u0002\u0014\u0146\u0003\u0002\u0002\u0002\u0016\u0152\u0003\u0002\u0002\u0002\u0018\u0155\u0003\u0002\u0002\u0002\u001a\u016c\u0003\u0002\u0002\u0002\u001c\u0170\u0003\u0002\u0002\u0002\u001e\u017a\u0003\u0002\u0002\u0002\u0020\u018d\u0003\u0002\u0002\u0002\u0022\u01a6\u0003\u0002\u0002\u0002\u0024\u01a9\u0003\u0002\u0002\u0002\u0026\u01af\u0003\u0002\u0002\u0002\u0028\u01b3\u0003\u0002\u0002\u0002\u002a\u01b6\u0003\u0002\u0002\u0002\u002c\u01ba\u0003\u0002\u0002\u0002\u002e\u01bd\u0003\u0002\u0002\u0002\u0030\u01d0\u0003\u0002\u0002\u0002\u0032\u01d8\u0003\u0002\u0002\u0002\u0034\u01e7\u0003\u0002\u0002\u0002\u0036\u01eb\u0003\u0002\u0002\u0002\u0038\u01f7\u0003\u0002\u0002\u0002\u003a\u0201\u0003\u0002\u0002\u0002\u003c\u020c\u0003\u0002\u0002\u0002\u003e\u0225\u0003\u0002\u0002\u0002\u0040\u022b\u0003\u0002\u0002\u0002\u0042\u0246\u0003\u0002\u0002\u0002\u0044\u0248\u0003\u0002\u0002\u0002\u0046\u0250\u0003\u0002\u0002\u0002\u0048\u0254\u0003\u0002\u0002\u0002\u004a\u0278\u0003\u0002\u0002\u0002\u004c\u027a\u0003\u0002\u0002\u0002\u004e\u0280\u0003\u0002\u0002\u0002\u0050\u0286\u0003\u0002\u0002\u0002\u0052\u028a\u0003\u0002\u0002\u0002\u0054\u028f\u0003\u0002\u0002\u0002\u0056\u0294\u0003\u0002\u0002\u0002\u0058\u0299\u0003\u0002\u0002\u0002\u005a\u02de\u0003\u0002\u0002\u0002\u005c\u02e0\u0003\u0002\u0002\u0002\u005e\u02ed\u0003\u0002\u0002\u0002\u0060\u02fa\u0003\u0002\u0002\u0002\u0062\u02fc\u0003\u0002\u0002\u0002\u0064\u0319\u0003\u0002\u0002\u0002\u0066\u031b\u0003\u0002\u0002\u0002\u0068\u0326\u0003\u0002\u0002\u0002\u006a\u0330\u0003\u0002\u0002\u0002\u006c\u033a\u0003\u0002\u0002\u0002\u006e\u033c\u0003\u0002\u0002\u0002\u0070\u0342\u0003\u0002\u0002\u0002\u0072\u0350\u0003\u0002\u0002\u0002\u0074\u035e\u0003\u0002\u0002\u0002\u0076\u0363\u0003\u0002\u0002\u0002\u0078\u036d\u0003\u0002\u0002\u0002\u007a\u0374\u0003\u0002\u0002\u0002\u007c\u037a\u0003\u0002\u0002\u0002\u007e\u0388\u0003\u0002\u0002\u0002\u0080\u03a9\u0003\u0002\u0002\u0002\u0082\u03ab\u0003\u0002\u0002\u0002\u0084\u03c9\u0003\u0002\u0002\u0002\u0086\u03cb\u0003\u0002\u0002\u0002\u0088\u03e2\u0003\u0002\u0002\u0002\u008a\u03e5\u0003\u0002\u0002\u0002\u008c\u03f1\u0003\u0002\u0002\u0002\u008e\u03fb\u0003\u0002\u0002\u0002\u0090\u0407\u0003\u0002\u0002\u0002\u0092\u0416\u0003\u0002\u0002\u0002\u0094\u042b\u0003\u0002\u0002\u0002\u0096\u042d\u0003\u0002\u0002\u0002\u0098\u0442\u0003\u0002\u0002\u0002\u009a\u0444\u0003\u0002\u0002\u0002\u009c\u0451\u0003\u0002\u0002\u0002\u009e\u0456\u0003\u0002\u0002\u0002\u00a0\u00aa\u0005\u009e\u0050\u0002\u00a1\u00a5\u0005\u0004\u0003\u0002\u00a2\u00a4\u0009\u0002\u0002\u0002\u00a3\u00a2\u0003\u0002\u0002\u0002\u00a4\u00a7\u0003\u0002\u0002\u0002\u00a5\u00a3\u0003\u0002\u0002\u0002\u00a5\u00a6\u0003\u0002\u0002\u0002\u00a6\u00a9\u0003\u0002\u0002\u0002\u00a7\u00a5\u0003\u0002\u0002\u0002\u00a8\u00a1\u0003\u0002\u0002\u0002\u00a9\u00ac\u0003\u0002\u0002\u0002\u00aa\u00a8\u0003\u0002\u0002\u0002\u00aa\u00ab\u0003\u0002\u0002\u0002\u00ab\u00b6\u0003\u0002\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002\u0002\u00ad\u00b1\u0005\u0006\u0004\u0002\u00ae\u00b0\u0009\u0002\u0002\u0002\u00af\u00ae\u0003\u0002\u0002\u0002\u00b0\u00b3\u0003\u0002\u0002\u0002\u00b1\u00af\u0003\u0002\u0002\u0002\u00b1\u00b2\u0003\u0002\u0002\u0002\u00b2\u00b5\u0003\u0002\u0002\u0002\u00b3\u00b1\u0003\u0002\u0002\u0002\u00b4\u00ad\u0003\u0002\u0002\u0002\u00b5\u00b8\u0003\u0002\u0002\u0002\u00b6\u00b4\u0003\u0002\u0002\u0002\u00b6\u00b7\u0003\u0002\u0002\u0002\u00b7\u00c2\u0003\u0002\u0002\u0002\u00b8\u00b6\u0003\u0002\u0002\u0002\u00b9\u00bd\u0005\u0008\u0005\u0002\u00ba\u00bc\u0009\u0002\u0002\u0002\u00bb\u00ba\u0003\u0002\u0002\u0002\u00bc\u00bf\u0003\u0002\u0002\u0002\u00bd\u00bb\u0003\u0002\u0002\u0002\u00bd\u00be\u0003\u0002\u0002\u0002\u00be\u00c1\u0003\u0002\u0002\u0002\u00bf\u00bd\u0003\u0002\u0002\u0002\u00c0\u00b9\u0003\u0002\u0002\u0002\u00c1\u00c4\u0003\u0002\u0002\u0002\u00c2\u00c0\u0003\u0002\u0002\u0002\u00c2\u00c3\u0003\u0002\u0002\u0002\u00c3\u00ce\u0003\u0002\u0002\u0002\u00c4\u00c2\u0003\u0002\u0002\u0002\u00c5\u00c9\u0005\u0064\u0033\u0002\u00c6\u00c8\u0009\u0002\u0002\u0002\u00c7\u00c6\u0003\u0002\u0002\u0002\u00c8\u00cb\u0003\u0002\u0002\u0002\u00c9\u00c7\u0003\u0002\u0002\u0002\u00c9\u00ca\u0003\u0002\u0002\u0002\u00ca\u00cd\u0003\u0002\u0002\u0002\u00cb\u00c9\u0003\u0002\u0002\u0002\u00cc\u00c5\u0003\u0002\u0002\u0002\u00cd\u00d0\u0003\u0002\u0002\u0002\u00ce\u00cc\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u0003\u0003\u0002\u0002\u0002\u00d0\u00ce\u0003\u0002\u0002\u0002\u00d1\u00d2\u0007\u001d\u0002\u0002\u00d2\u00d3\u0005\u009e\u0050\u0002\u00d3\u00d4\u0007\u002e\u0002\u0002\u00d4\u00d5\u0005\u009e\u0050\u0002\u00d5\u00d6\u0007\u0003\u0002\u0002\u00d6\u00d7\u0005\u009e\u0050\u0002\u00d7\u00de\u0003\u0002\u0002\u0002\u00d8\u00d9\u0007\u001d\u0002\u0002\u00d9\u00da\u0005\u009e\u0050\u0002\u00da\u00db\u0007\u002e\u0002\u0002\u00db\u00dc\u0005\u009e\u0050\u0002\u00dc\u00de\u0003\u0002\u0002\u0002\u00dd\u00d1\u0003\u0002\u0002\u0002\u00dd\u00d8\u0003\u0002\u0002\u0002\u00de\u0005\u0003\u0002\u0002\u0002\u00df\u00e0\u0007\u0019\u0002\u0002\u00e0\u00e1\u0005\u009e\u0050\u0002\u00e1\u00e2\u0009\u0003\u0002\u0002\u00e2\u00e3\u0005\u009e\u0050\u0002\u00e3\u00e4\u0005\u000e\u0008\u0002\u00e4\u00e5\u0007\u0003\u0002\u0002\u00e5\u00e6\u0005\u009e\u0050\u0002\u00e6\u00fa\u0003\u0002\u0002\u0002\u00e7\u00e8\u0007\u0019\u0002\u0002\u00e8\u00e9\u0005\u009e\u0050\u0002\u00e9\u00ea\u0009\u0003\u0002\u0002\u00ea\u00eb\u0005\u009e\u0050\u0002\u00eb\u00ec\u0007\u0003\u0002\u0002\u00ec\u00ed\u0005\u009e\u0050\u0002\u00ed\u00fa\u0003\u0002\u0002\u0002\u00ee\u00ef\u0007\u0019\u0002\u0002\u00ef\u00f0\u0005\u009e\u0050\u0002\u00f0\u00f1\u0009\u0003\u0002\u0002\u00f1\u00f2\u0005\u009e\u0050\u0002\u00f2\u00f3\u0005\u000e\u0008\u0002\u00f3\u00fa\u0003\u0002\u0002\u0002\u00f4\u00f5\u0007\u0019\u0002\u0002\u00f5\u00f6\u0005\u009e\u0050\u0002\u00f6\u00f7\u0009\u0003\u0002\u0002\u00f7\u00f8\u0005\u009e\u0050\u0002\u00f8\u00fa\u0003\u0002\u0002\u0002\u00f9\u00df\u0003\u0002\u0002\u0002\u00f9\u00e7\u0003\u0002\u0002\u0002\u00f9\u00ee\u0003\u0002\u0002\u0002\u00f9\u00f4\u0003\u0002\u0002\u0002\u00fa\u0007\u0003\u0002\u0002\u0002\u00fb\u00fc\u0007\u001c\u0002\u0002\u00fc\u0100\u0005\u009e\u0050\u0002\u00fd\u00fe\u0005\u000a\u0006\u0002\u00fe\u00ff\u0005\u009e\u0050\u0002\u00ff\u0101\u0003\u0002\u0002\u0002\u0100\u00fd\u0003\u0002\u0002\u0002\u0100\u0101\u0003\u0002\u0002\u0002\u0101\u0102\u0003\u0002\u0002\u0002\u0102\u0103\u0009\u0003\u0002\u0002\u0103\u0104\u0005\u009e\u0050\u0002\u0104\u0105\u0007\u0003\u0002\u0002\u0105\u0106\u0005\u009e\u0050\u0002\u0106\u0112\u0003\u0002\u0002\u0002\u0107\u0108\u0007\u001c\u0002\u0002\u0108\u010c\u0005\u009e\u0050\u0002\u0109\u010a\u0005\u000a\u0006\u0002\u010a\u010b\u0005\u009e\u0050\u0002\u010b\u010d\u0003\u0002\u0002\u0002\u010c\u0109\u0003\u0002\u0002\u0002\u010c\u010d\u0003\u0002\u0002\u0002\u010d\u010e\u0003\u0002\u0002\u0002\u010e\u010f\u0009\u0003\u0002\u0002\u010f\u0110\u0005\u009e\u0050\u0002\u0110\u0112\u0003\u0002\u0002\u0002\u0111\u00fb\u0003\u0002\u0002\u0002\u0111\u0107\u0003\u0002\u0002\u0002\u0112\u0009\u0003\u0002\u0002\u0002\u0113\u0114\u0005\u009c\u004f\u0002\u0114\u000b\u0003\u0002\u0002\u0002\u0115\u0116\u0007\u001b\u0002\u0002\u0116\u0117\u0005\u009e\u0050\u0002\u0117\u0118\u0005\u000e\u0008\u0002\u0118\u0119\u0005\u0066\u0034\u0002\u0119\u011a\u0005\u009e\u0050\u0002\u011a\u000d\u0003\u0002\u0002\u0002\u011b\u0122\u0005\u0010\u0009\u0002\u011c\u011d\u0007\u002a\u0002\u0002\u011d\u011e\u0005\u009e\u0050\u0002\u011e\u011f\u0005\u0010\u0009\u0002\u011f\u0121\u0003\u0002\u0002\u0002\u0120\u011c\u0003\u0002\u0002\u0002\u0121\u0124\u0003\u0002\u0002\u0002\u0122\u0120\u0003\u0002\u0002\u0002\u0122\u0123\u0003\u0002\u0002\u0002\u0123\u0126\u0003\u0002\u0002\u0002\u0124\u0122\u0003\u0002\u0002\u0002\u0125\u011b\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u0127\u0003\u0002\u0002\u0002\u0127\u0128\u0005\u009e\u0050\u0002\u0128\u000f\u0003\u0002\u0002\u0002\u0129\u012b\u0009\u0004\u0002\u0002\u012a\u0129\u0003\u0002\u0002\u0002\u012a\u012b\u0003\u0002\u0002\u0002\u012b\u012c\u0003\u0002\u0002\u0002\u012c\u012d\u0005\u009e\u0050\u0002\u012d\u012e\u0005\u0012\u000a\u0002\u012e\u0135\u0005\u009e\u0050\u0002\u012f\u0130\u0007\u0024\u0002\u0002\u0130\u0131\u0005\u009e\u0050\u0002\u0131\u0132\u0005\u0014\u000b\u0002\u0132\u0134\u0003\u0002\u0002\u0002\u0133\u012f\u0003\u0002\u0002\u0002\u0134\u0137\u0003\u0002\u0002\u0002\u0135\u0133\u0003\u0002\u0002\u0002\u0135\u0136\u0003\u0002\u0002\u0002\u0136\u0143\u0003\u0002\u0002\u0002\u0137\u0135\u0003\u0002\u0002\u0002\u0138\u013f\u0005\u0014\u000b\u0002\u0139\u013a\u0007\u0024\u0002\u0002\u013a\u013b\u0005\u009e\u0050\u0002\u013b\u013c\u0005\u0014\u000b\u0002\u013c\u013e\u0003\u0002\u0002\u0002\u013d\u0139\u0003\u0002\u0002\u0002\u013e\u0141\u0003\u0002\u0002\u0002\u013f\u013d\u0003\u0002\u0002\u0002\u013f\u0140\u0003\u0002\u0002\u0002\u0140\u0143\u0003\u0002\u0002\u0002\u0141\u013f\u0003\u0002\u0002\u0002\u0142\u012a\u0003\u0002\u0002\u0002\u0142\u0138\u0003\u0002\u0002\u0002\u0143\u0011\u0003\u0002\u0002\u0002\u0144\u0145\u0005\u009c\u004f\u0002\u0145\u0013\u0003\u0002\u0002\u0002\u0146\u0147\u0007\u0004\u0002\u0002\u0147\u0148\u0005\u009e\u0050\u0002\u0148\u014d\u0005\u0016\u000c\u0002\u0149\u014a\u0007\u0005\u0002\u0002\u014a\u014b\u0005\u009e\u0050\u0002\u014b\u014c\u0005\u0048\u0025\u0002\u014c\u014e\u0003\u0002\u0002\u0002\u014d\u0149\u0003\u0002\u0002\u0002\u014d\u014e\u0003\u0002\u0002\u0002\u014e\u014f\u0003\u0002\u0002\u0002\u014f\u0150\u0007\u0006\u0002\u0002\u0150\u0151\u0005\u009e\u0050\u0002\u0151\u0015\u0003\u0002\u0002\u0002\u0152\u0153\u0005\u009c\u004f\u0002\u0153\u0154\u0005\u009e\u0050\u0002\u0154\u0017\u0003\u0002\u0002\u0002\u0155\u0156\u0007\u001a\u0002\u0002\u0156\u0158\u0005\u009e\u0050\u0002\u0157\u0159\u0005\u001a\u000e\u0002\u0158\u0157\u0003\u0002\u0002\u0002\u0158\u0159\u0003\u0002\u0002\u0002\u0159\u015a\u0003\u0002\u0002\u0002\u015a\u015b\u0007\u0007\u0002\u0002\u015b\u015d\u0005\u009e\u0050\u0002\u015c\u015e\u0005\u0042\u0022\u0002\u015d\u015c\u0003\u0002\u0002\u0002\u015d\u015e\u0003\u0002\u0002\u0002\u015e\u0166\u0003\u0002\u0002\u0002\u015f\u0160\u0007\u0003\u0002\u0002\u0160\u0162\u0005\u009e\u0050\u0002\u0161\u0163\u0005\u0042\u0022\u0002\u0162\u0161\u0003\u0002\u0002\u0002\u0162\u0163\u0003\u0002\u0002\u0002\u0163\u0165\u0003\u0002\u0002\u0002\u0164\u015f\u0003\u0002\u0002\u0002\u0165\u0168\u0003\u0002\u0002\u0002\u0166\u0164\u0003\u0002\u0002\u0002\u0166\u0167\u0003\u0002\u0002\u0002\u0167\u0169\u0003\u0002\u0002\u0002\u0168\u0166\u0003\u0002\u0002\u0002\u0169\u016a\u0007\u0008\u0002\u0002\u016a\u016b\u0005\u009e\u0050\u0002\u016b\u0019\u0003\u0002\u0002\u0002\u016c\u016d\u0007\u0005\u0002\u0002\u016d\u016e\u0005\u009c\u004f\u0002\u016e\u016f\u0005\u009e\u0050\u0002\u016f\u001b\u0003\u0002\u0002\u0002\u0170\u0177\u0005\u001e\u0010\u0002\u0171\u0172\u0007\u002a\u0002\u0002\u0172\u0173\u0005\u009e\u0050\u0002\u0173\u0174\u0005\u001e\u0010\u0002\u0174\u0176\u0003\u0002\u0002\u0002\u0175\u0171\u0003\u0002\u0002\u0002\u0176\u0179\u0003\u0002\u0002\u0002\u0177\u0175\u0003\u0002\u0002\u0002\u0177\u0178\u0003\u0002\u0002\u0002\u0178\u001d\u0003\u0002\u0002\u0002\u0179\u0177\u0003\u0002\u0002\u0002\u017a\u017b\u0005\u0022\u0012\u0002\u017b\u0182\u0005\u009e\u0050\u0002\u017c\u017d\u0005\u0020\u0011\u0002\u017d\u017e\u0005\u0022\u0012\u0002\u017e\u017f\u0005\u009e\u0050\u0002\u017f\u0181\u0003\u0002\u0002\u0002\u0180\u017c\u0003\u0002\u0002\u0002\u0181\u0184\u0003\u0002\u0002\u0002\u0182\u0180\u0003\u0002\u0002\u0002\u0182\u0183\u0003\u0002\u0002\u0002\u0183\u001f\u0003\u0002\u0002\u0002\u0184\u0182\u0003\u0002\u0002\u0002\u0185\u0186\u0007\u0027\u0002\u0002\u0186\u018e\u0005\u009e\u0050\u0002\u0187\u0188\u0007\u0029\u0002\u0002\u0188\u018e\u0005\u009e\u0050\u0002\u0189\u018a\u0007\u002b\u0002\u0002\u018a\u018e\u0005\u009e\u0050\u0002\u018b\u018c\u0007\u0013\u0002\u0002\u018c\u018e\u0005\u009e\u0050\u0002\u018d\u0185\u0003\u0002\u0002\u0002\u018d\u0187\u0003\u0002\u0002\u0002\u018d\u0189\u0003\u0002\u0002\u0002\u018d\u018b\u0003\u0002\u0002\u0002\u018e\u0021\u0003\u0002\u0002\u0002\u018f\u0192\u0005\u0024\u0013\u0002\u0190\u0192\u0005\u002a\u0016\u0002\u0191\u018f\u0003\u0002\u0002\u0002\u0191\u0190\u0003\u0002\u0002\u0002\u0192\u019a\u0003\u0002\u0002\u0002\u0193\u0199\u0007\u0018\u0002\u0002\u0194\u0199\u0005\u002c\u0017\u0002\u0195\u0199\u0005\u002e\u0018\u0002\u0196\u0199\u0005\u0030\u0019\u0002\u0197\u0199\u0005\u0036\u001c\u0002\u0198\u0193\u0003\u0002\u0002\u0002\u0198\u0194\u0003\u0002\u0002\u0002\u0198\u0195\u0003\u0002\u0002\u0002\u0198\u0196\u0003\u0002\u0002\u0002\u0198\u0197\u0003\u0002\u0002\u0002\u0199\u019c\u0003\u0002\u0002\u0002\u019a\u0198\u0003\u0002\u0002\u0002\u019a\u019b\u0003\u0002\u0002\u0002\u019b\u01a7\u0003\u0002\u0002\u0002\u019c\u019a\u0003\u0002\u0002\u0002\u019d\u01a3\u0007\u0018\u0002\u0002\u019e\u01a3\u0005\u002c\u0017\u0002\u019f\u01a3\u0005\u002e\u0018\u0002\u01a0\u01a3\u0005\u0030\u0019\u0002\u01a1\u01a3\u0005\u0036\u001c\u0002\u01a2\u019d\u0003\u0002\u0002\u0002\u01a2\u019e\u0003\u0002\u0002\u0002\u01a2\u019f\u0003\u0002\u0002\u0002\u01a2\u01a0\u0003\u0002\u0002\u0002\u01a2\u01a1\u0003\u0002\u0002\u0002\u01a3\u01a4\u0003\u0002\u0002\u0002\u01a4\u01a2\u0003\u0002\u0002\u0002\u01a4\u01a5\u0003\u0002\u0002\u0002\u01a5\u01a7\u0003\u0002\u0002\u0002\u01a6\u0191\u0003\u0002\u0002\u0002\u01a6\u01a2\u0003\u0002\u0002\u0002\u01a7\u0023\u0003\u0002\u0002\u0002\u01a8\u01aa\u0005\u0026\u0014\u0002\u01a9\u01a8\u0003\u0002\u0002\u0002\u01a9\u01aa\u0003\u0002\u0002\u0002\u01aa\u01ab\u0003\u0002\u0002\u0002\u01ab\u01ac\u0005\u0028\u0015\u0002\u01ac\u0025\u0003\u0002\u0002\u0002\u01ad\u01b0\u0005\u009c\u004f\u0002\u01ae\u01b0\u0007\u0009\u0002\u0002\u01af\u01ad\u0003\u0002\u0002\u0002\u01af\u01ae\u0003\u0002\u0002\u0002\u01af\u01b0\u0003\u0002\u0002\u0002\u01b0\u01b1\u0003\u0002\u0002\u0002\u01b1\u01b2\u0007\u000a\u0002\u0002\u01b2\u0027\u0003\u0002\u0002\u0002\u01b3\u01b4\u0005\u009c\u004f\u0002\u01b4\u0029\u0003\u0002\u0002\u0002\u01b5\u01b7\u0005\u0026\u0014\u0002\u01b6\u01b5\u0003\u0002\u0002\u0002\u01b6\u01b7\u0003\u0002\u0002\u0002\u01b7\u01b8\u0003\u0002\u0002\u0002\u01b8\u01b9\u0007\u0009\u0002\u0002\u01b9\u002b\u0003\u0002\u0002\u0002\u01ba\u01bb\u0007\u000b\u0002\u0002\u01bb\u01bc\u0005\u009c\u004f\u0002\u01bc\u002d\u0003\u0002\u0002\u0002\u01bd\u01be\u0007\u000c\u0002\u0002\u01be\u01c0\u0005\u009e\u0050\u0002\u01bf\u01c1\u0005\u0026\u0014\u0002\u01c0\u01bf\u0003\u0002\u0002\u0002\u01c0\u01c1\u0003\u0002\u0002\u0002\u01c1\u01c2\u0003\u0002\u0002\u0002\u01c2\u01c3\u0005\u009c\u004f\u0002\u01c3\u01cc\u0005\u009e\u0050\u0002\u01c4\u01c5\u0009\u0005\u0002\u0002\u01c5\u01c8\u0005\u009e\u0050\u0002\u01c6\u01c9\u0005\u009c\u004f\u0002\u01c7\u01c9\u0007\u002e\u0002\u0002\u01c8\u01c6\u0003\u0002\u0002\u0002\u01c8\u01c7\u0003\u0002\u0002\u0002\u01c9\u01ca\u0003\u0002\u0002\u0002\u01ca\u01cb\u0005\u009e\u0050\u0002\u01cb\u01cd\u0003\u0002\u0002\u0002\u01cc\u01c4\u0003\u0002\u0002\u0002\u01cc\u01cd\u0003\u0002\u0002\u0002\u01cd\u01ce\u0003\u0002\u0002\u0002\u01ce\u01cf\u0007\u000e\u0002\u0002\u01cf\u002f\u0003\u0002\u0002\u0002\u01d0\u01d2\u0007\u0005\u0002\u0002\u01d1\u01d3\u0007\u0005\u0002\u0002\u01d2\u01d1\u0003\u0002\u0002\u0002\u01d2\u01d3\u0003\u0002\u0002\u0002\u01d3\u01d6\u0003\u0002\u0002\u0002\u01d4\u01d7\u0005\u009c\u004f\u0002\u01d5\u01d7\u0005\u0032\u001a\u0002\u01d6\u01d4\u0003\u0002\u0002\u0002\u01d6\u01d5\u0003\u0002\u0002\u0002\u01d7\u0031\u0003\u0002\u0002\u0002\u01d8\u01d9\u0007\u0040\u0002\u0002\u01d9\u01da\u0005\u009e\u0050\u0002\u01da\u01db\u0005\u0034\u001b\u0002\u01db\u01dc\u0007\u0006\u0002\u0002\u01dc\u0033\u0003\u0002\u0002\u0002\u01dd\u01e5\u0007\u0027\u0002\u0002\u01de\u01e5\u0007\u0028\u0002\u0002\u01df\u01e5\u0007\u0025\u0002\u0002\u01e0\u01e5\u0007\u0026\u0002\u0002\u01e1\u01e5\u0007\u002d\u0002\u0002\u01e2\u01e5\u0007\u002e\u0002\u0002\u01e3\u01e5\u0005\u009c\u004f\u0002\u01e4\u01dd\u0003\u0002\u0002\u0002\u01e4\u01de\u0003\u0002\u0002\u0002\u01e4\u01df\u0003\u0002\u0002\u0002\u01e4\u01e0\u0003\u0002\u0002\u0002\u01e4\u01e1\u0003\u0002\u0002\u0002\u01e4\u01e2\u0003\u0002\u0002\u0002\u01e4\u01e3\u0003\u0002\u0002\u0002\u01e5\u01e6\u0003\u0002\u0002\u0002\u01e6\u01e8\u0005\u009e\u0050\u0002\u01e7\u01e4\u0003\u0002\u0002\u0002\u01e8\u01e9\u0003\u0002\u0002\u0002\u01e9\u01e7\u0003\u0002\u0002\u0002\u01e9\u01ea\u0003\u0002\u0002\u0002\u01ea\u0035\u0003\u0002\u0002\u0002\u01eb\u01ec\u0007\u002c\u0002\u0002\u01ec\u01ed\u0005\u009e\u0050\u0002\u01ed\u01ee\u0005\u0038\u001d\u0002\u01ee\u01ef\u0005\u009e\u0050\u0002\u01ef\u01f0\u0007\u0006\u0002\u0002\u01f0\u0037\u0003\u0002\u0002\u0002\u01f1\u01f8\u0005\u0024\u0013\u0002\u01f2\u01f8\u0005\u002a\u0016\u0002\u01f3\u01f8\u0007\u0018\u0002\u0002\u01f4\u01f8\u0005\u002c\u0017\u0002\u01f5\u01f8\u0005\u002e\u0018\u0002\u01f6\u01f8\u0005\u0030\u0019\u0002\u01f7\u01f1\u0003\u0002\u0002\u0002\u01f7\u01f2\u0003\u0002\u0002\u0002\u01f7\u01f3\u0003\u0002\u0002\u0002\u01f7\u01f4\u0003\u0002\u0002\u0002\u01f7\u01f5\u0003\u0002\u0002\u0002\u01f7\u01f6\u0003\u0002\u0002\u0002\u01f8\u0039\u0003\u0002\u0002\u0002\u01f9\u01fa\u0007\u000f\u0002\u0002\u01fa\u0202\u0005\u009e\u0050\u0002\u01fb\u01fc\u0007\u002a\u0002\u0002\u01fc\u0202\u0005\u009e\u0050\u0002\u01fd\u01fe\u0007\u0013\u0002\u0002\u01fe\u0202\u0005\u009e\u0050\u0002\u01ff\u0200\u0007\u000d\u0002\u0002\u0200\u0202\u0005\u009e\u0050\u0002\u0201\u01f9\u0003\u0002\u0002\u0002\u0201\u01fb\u0003\u0002\u0002\u0002\u0201\u01fd\u0003\u0002\u0002\u0002\u0201\u01ff\u0003\u0002\u0002\u0002\u0202\u003b\u0003\u0002\u0002\u0002\u0203\u0204\u0005\u009c\u004f\u0002\u0204\u0205\u0005\u009e\u0050\u0002\u0205\u020d\u0003\u0002\u0002\u0002\u0206\u0207\u0007\u003d\u0002\u0002\u0207\u020d\u0005\u009e\u0050\u0002\u0208\u0209\u0007\u0009\u0002\u0002\u0209\u020d\u0005\u009c\u004f\u0002\u020a\u020b\u0007\u0010\u0002\u0002\u020b\u020d\u0005\u009c\u004f\u0002\u020c\u0203\u0003\u0002\u0002\u0002\u020c\u0206\u0003\u0002\u0002\u0002\u020c\u0208\u0003\u0002\u0002\u0002\u020c\u020a\u0003\u0002\u0002\u0002\u020d\u003d\u0003\u0002\u0002\u0002\u020e\u020f\u0005\u001c\u000f\u0002\u020f\u0210\u0007\u0007\u0002\u0002\u0210\u0212\u0005\u009e\u0050\u0002\u0211\u0213\u0005\u0040\u0021\u0002\u0212\u0211\u0003\u0002\u0002\u0002\u0212\u0213\u0003\u0002\u0002\u0002\u0213\u0214\u0003\u0002\u0002\u0002\u0214\u0215\u0007\u0008\u0002\u0002\u0215\u0216\u0005\u009e\u0050\u0002\u0216\u0226\u0003\u0002\u0002\u0002\u0217\u0219\u0005\u005a\u002e\u0002\u0218\u0217\u0003\u0002\u0002\u0002\u0219\u021c\u0003\u0002\u0002\u0002\u021a\u0218\u0003\u0002\u0002\u0002\u021a\u021b\u0003\u0002\u0002\u0002\u021b\u021d\u0003\u0002\u0002\u0002\u021c\u021a\u0003\u0002\u0002\u0002\u021d\u021e\u0007\u0007\u0002\u0002\u021e\u0220\u0005\u009e\u0050\u0002\u021f\u0221\u0005\u0040\u0021\u0002\u0220\u021f\u0003\u0002\u0002\u0002\u0220\u0221\u0003\u0002\u0002\u0002\u0221\u0222\u0003\u0002\u0002\u0002\u0222\u0223\u0007\u0008\u0002\u0002\u0223\u0224\u0005\u009e\u0050\u0002\u0224\u0226\u0003\u0002\u0002\u0002\u0225\u020e\u0003\u0002\u0002\u0002\u0225\u021a\u0003\u0002\u0002\u0002\u0226\u003f\u0003\u0002\u0002\u0002\u0227\u0228\u0007\u0003\u0002\u0002\u0228\u022a\u0005\u009e\u0050\u0002\u0229\u0227\u0003\u0002\u0002\u0002\u022a\u022d\u0003\u0002\u0002\u0002\u022b\u0229\u0003\u0002\u0002\u0002\u022b\u022c\u0003\u0002\u0002\u0002\u022c\u022e\u0003\u0002\u0002\u0002\u022d\u022b\u0003\u0002\u0002\u0002\u022e\u022f\u0005\u0042\u0022\u0002\u022f\u0237\u0005\u009e\u0050\u0002\u0230\u0231\u0007\u0003\u0002\u0002\u0231\u0233\u0005\u009e\u0050\u0002\u0232\u0234\u0005\u0042\u0022\u0002\u0233\u0232\u0003\u0002\u0002\u0002\u0233\u0234\u0003\u0002\u0002\u0002\u0234\u0236\u0003\u0002\u0002\u0002\u0235\u0230\u0003\u0002\u0002\u0002\u0236\u0239\u0003\u0002\u0002\u0002\u0237\u0235\u0003\u0002\u0002\u0002\u0237\u0238\u0003\u0002\u0002\u0002\u0238\u0041\u0003\u0002\u0002\u0002\u0239\u0237\u0003\u0002\u0002\u0002\u023a\u023b\u0005\u003c\u001f\u0002\u023b\u023c\u0007\u0005\u0002\u0002\u023c\u023d\u0005\u009e\u0050\u0002\u023d\u023f\u0005\u0048\u0025\u0002\u023e\u0240\u0005\u0044\u0023\u0002\u023f\u023e\u0003\u0002\u0002\u0002\u023f\u0240\u0003\u0002\u0002\u0002\u0240\u0247\u0003\u0002\u0002\u0002\u0241\u0242\u0005\u003c\u001f\u0002\u0242\u0243\u0007\u0005\u0002\u0002\u0243\u0244\u0005\u009e\u0050\u0002\u0244\u0245\u0005\u0046\u0024\u0002\u0245\u0247\u0003\u0002\u0002\u0002\u0246\u023a\u0003\u0002\u0002\u0002\u0246\u0241\u0003\u0002\u0002\u0002\u0247\u0043\u0003\u0002\u0002\u0002\u0248\u0249\u0007\u001e\u0002\u0002\u0249\u024a\u0005\u009e\u0050\u0002\u024a\u0045\u0003\u0002\u0002\u0002\u024b\u0251\u0005\u005a\u002e\u0002\u024c\u0251\u0005\u0062\u0032\u0002\u024d\u024e\u0005\u005e\u0030\u0002\u024e\u024f\u0005\u009e\u0050\u0002\u024f\u0251\u0003\u0002\u0002\u0002\u0250\u024b\u0003\u0002\u0002\u0002\u0250\u024c\u0003\u0002\u0002\u0002\u0250\u024d\u0003\u0002\u0002\u0002\u0251\u0252\u0003\u0002\u0002\u0002\u0252\u0250\u0003\u0002\u0002\u0002\u0252\u0253\u0003\u0002\u0002\u0002\u0253\u0047\u0003\u0002\u0002\u0002\u0254\u025b\u0005\u004a\u0026\u0002\u0255\u0257\u0005\u003a\u001e\u0002\u0256\u0255\u0003\u0002\u0002\u0002\u0256\u0257\u0003\u0002\u0002\u0002\u0257\u0258\u0003\u0002\u0002\u0002\u0258\u025a\u0005\u004a\u0026\u0002\u0259\u0256\u0003\u0002\u0002\u0002\u025a\u025d\u0003\u0002\u0002\u0002\u025b\u0259\u0003\u0002\u0002\u0002\u025b\u025c\u0003\u0002\u0002\u0002\u025c\u0049\u0003\u0002\u0002\u0002\u025d\u025b\u0003\u0002\u0002\u0002\u025e\u025f\u0005\u0052\u002a\u0002\u025f\u0260\u0005\u009e\u0050\u0002\u0260\u0279\u0003\u0002\u0002\u0002\u0261\u0262\u0005\u0054\u002b\u0002\u0262\u0263\u0005\u009e\u0050\u0002\u0263\u0279\u0003\u0002\u0002\u0002\u0264\u0265\u0005\u0056\u002c\u0002\u0265\u0266\u0005\u009e\u0050\u0002\u0266\u0279\u0003\u0002\u0002\u0002\u0267\u0268\u0007\u002e\u0002\u0002\u0268\u0279\u0005\u009e\u0050\u0002\u0269\u026a\u0007\u0021\u0002\u0002\u026a\u0279\u0005\u009e\u0050\u0002\u026b\u026c\u0005\u009c\u004f\u0002\u026c\u026d\u0005\u009e\u0050\u0002\u026d\u0279\u0003\u0002\u0002\u0002\u026e\u0279\u0005\u0078\u003d\u0002\u026f\u0270\u0007\u0020\u0002\u0002\u0270\u0279\u0005\u009e\u0050\u0002\u0271\u0279\u0005\u0050\u0029\u0002\u0272\u0279\u0005\u007a\u003e\u0002\u0273\u0279\u0005\u004c\u0027\u0002\u0274\u0275\u0005\u0058\u002d\u0002\u0275\u0276\u0005\u009e\u0050\u0002\u0276\u0279\u0003\u0002\u0002\u0002\u0277\u0279\u0005\u004e\u0028\u0002\u0278\u025e\u0003\u0002\u0002\u0002\u0278\u0261\u0003\u0002\u0002\u0002\u0278\u0264\u0003\u0002\u0002\u0002\u0278\u0267\u0003\u0002\u0002\u0002\u0278\u0269\u0003\u0002\u0002\u0002\u0278\u026b\u0003\u0002\u0002\u0002\u0278\u026e\u0003\u0002\u0002\u0002\u0278\u026f\u0003\u0002\u0002\u0002\u0278\u0271\u0003\u0002\u0002\u0002\u0278\u0272\u0003\u0002\u0002\u0002\u0278\u0273\u0003\u0002\u0002\u0002\u0278\u0274\u0003\u0002\u0002\u0002\u0278\u0277\u0003\u0002\u0002\u0002\u0279\u004b\u0003\u0002\u0002\u0002\u027a\u027b\u0007\u0040\u0002\u0002\u027b\u027c\u0005\u009e\u0050\u0002\u027c\u027d\u0005\u0048\u0025\u0002\u027d\u027e\u0007\u0006\u0002\u0002\u027e\u027f\u0005\u009e\u0050\u0002\u027f\u004d\u0003\u0002\u0002\u0002\u0280\u0281\u0007\u003c\u0002\u0002\u0281\u0282\u0005\u009e\u0050\u0002\u0282\u0283\u0005\u0048\u0025\u0002\u0283\u0284\u0007\u0006\u0002\u0002\u0284\u0285\u0005\u009e\u0050\u0002\u0285\u004f\u0003\u0002\u0002\u0002\u0286\u0287\u0007\u0018\u0002\u0002\u0287\u0288\u0005\u009e\u0050\u0002\u0288\u0051\u0003\u0002\u0002\u0002\u0289\u028b\u0009\u0006\u0002\u0002\u028a\u0289\u0003\u0002\u0002\u0002\u028a\u028b\u0003\u0002\u0002\u0002\u028b\u028c\u0003\u0002\u0002\u0002\u028c\u028d\u0007\u002d\u0002\u0002\u028d\u0053\u0003\u0002\u0002\u0002\u028e\u0290\u0009\u0006\u0002\u0002\u028f\u028e\u0003\u0002\u0002\u0002\u028f\u0290\u0003\u0002\u0002\u0002\u0290\u0291\u0003\u0002\u0002\u0002\u0291\u0292\u0007\u001f\u0002\u0002\u0292\u0055\u0003\u0002\u0002\u0002\u0293\u0295\u0009\u0006\u0002\u0002\u0294\u0293\u0003\u0002\u0002\u0002\u0294\u0295\u0003\u0002\u0002\u0002\u0295\u0296\u0003\u0002\u0002\u0002\u0296\u0297\u0007\u0025\u0002\u0002\u0297\u0057\u0003\u0002\u0002\u0002\u0298\u029a\u0009\u0006\u0002\u0002\u0299\u0298\u0003\u0002\u0002\u0002\u0299\u029a\u0003\u0002\u0002\u0002\u029a\u029b\u0003\u0002\u0002\u0002\u029b\u029c\u0007\u0026\u0002\u0002\u029c\u0059\u0003\u0002\u0002\u0002\u029d\u029e\u0005\u009c\u004f\u0002\u029e\u029f\u0005\u009e\u0050\u0002\u029f\u02df\u0003\u0002\u0002\u0002\u02a0\u02a1\u0005\u0052\u002a\u0002\u02a1\u02a2\u0005\u009e\u0050\u0002\u02a2\u02df\u0003\u0002\u0002\u0002\u02a3\u02a4\u0005\u0054\u002b\u0002\u02a4\u02a5\u0005\u009e\u0050\u0002\u02a5\u02df\u0003\u0002\u0002\u0002\u02a6\u02a7\u0005\u0056\u002c\u0002\u02a7\u02a8\u0005\u009e\u0050\u0002\u02a8\u02df\u0003\u0002\u0002\u0002\u02a9\u02aa\u0005\u0058\u002d\u0002\u02aa\u02ab\u0005\u009e\u0050\u0002\u02ab\u02df\u0003\u0002\u0002\u0002\u02ac\u02ad\u0007\u002e\u0002\u0002\u02ad\u02df\u0005\u009e\u0050\u0002\u02ae\u02af\u0007\u0020\u0002\u0002\u02af\u02df\u0005\u009e\u0050\u0002\u02b0\u02b1\u0007\u0018\u0002\u0002\u02b1\u02df\u0005\u009e\u0050\u0002\u02b2\u02b3\u0007\u0021\u0002\u0002\u02b3\u02df\u0005\u009e\u0050\u0002\u02b4\u02b5\u0007\u0016\u0002\u0002\u02b5\u02df\u0005\u009e\u0050\u0002\u02b6\u02b7\u0007\u0017\u0002\u0002\u02b7\u02df\u0005\u009e\u0050\u0002\u02b8\u02b9\u0007\u0005\u0002\u0002\u02b9\u02df\u0005\u009e\u0050\u0002\u02ba\u02bb\u0007\u0040\u0002\u0002\u02bb\u02c0\u0005\u009e\u0050\u0002\u02bc\u02bf\u0005\u005a\u002e\u0002\u02bd\u02bf\u0005\u0060\u0031\u0002\u02be\u02bc\u0003\u0002\u0002\u0002\u02be\u02bd\u0003\u0002\u0002\u0002\u02bf\u02c2\u0003\u0002\u0002\u0002\u02c0\u02be\u0003\u0002\u0002\u0002\u02c0\u02c1\u0003\u0002\u0002\u0002\u02c1\u02c3\u0003\u0002\u0002\u0002\u02c2\u02c0\u0003\u0002\u0002\u0002\u02c3\u02c4\u0007\u0006\u0002\u0002\u02c4\u02c5\u0005\u009e\u0050\u0002\u02c5\u02df\u0003\u0002\u0002\u0002\u02c6\u02c7\u0007\u0004\u0002\u0002\u02c7\u02cc\u0005\u009e\u0050\u0002\u02c8\u02cb\u0005\u005a\u002e\u0002\u02c9\u02cb\u0005\u0060\u0031\u0002\u02ca\u02c8\u0003\u0002\u0002\u0002\u02ca\u02c9\u0003\u0002\u0002\u0002\u02cb\u02ce\u0003\u0002\u0002\u0002\u02cc\u02ca\u0003\u0002\u0002\u0002\u02cc\u02cd\u0003\u0002\u0002\u0002\u02cd\u02cf\u0003\u0002\u0002\u0002\u02ce\u02cc\u0003\u0002\u0002\u0002\u02cf\u02d0\u0007\u0006\u0002\u0002\u02d0\u02d1\u0005\u009e\u0050\u0002\u02d1\u02df\u0003\u0002\u0002\u0002\u02d2\u02d3\u0007\u000c\u0002\u0002\u02d3\u02d8\u0005\u009e\u0050\u0002\u02d4\u02d7\u0005\u005a\u002e\u0002\u02d5\u02d7\u0005\u0060\u0031\u0002\u02d6\u02d4\u0003\u0002\u0002\u0002\u02d6\u02d5\u0003\u0002\u0002\u0002\u02d7\u02da\u0003\u0002\u0002\u0002\u02d8\u02d6\u0003\u0002\u0002\u0002\u02d8\u02d9\u0003\u0002\u0002\u0002\u02d9\u02db\u0003\u0002\u0002\u0002\u02da\u02d8\u0003\u0002\u0002\u0002\u02db\u02dc\u0007\u000e\u0002\u0002\u02dc\u02dd\u0005\u009e\u0050\u0002\u02dd\u02df\u0003\u0002\u0002\u0002\u02de\u029d\u0003\u0002\u0002\u0002\u02de\u02a0\u0003\u0002\u0002\u0002\u02de\u02a3\u0003\u0002\u0002\u0002\u02de\u02a6\u0003\u0002\u0002\u0002\u02de\u02a9\u0003\u0002\u0002\u0002\u02de\u02ac\u0003\u0002\u0002\u0002\u02de\u02ae\u0003\u0002\u0002\u0002\u02de\u02b0\u0003\u0002\u0002\u0002\u02de\u02b2\u0003\u0002\u0002\u0002\u02de\u02b4\u0003\u0002\u0002\u0002\u02de\u02b6\u0003\u0002\u0002\u0002\u02de\u02b8\u0003\u0002\u0002\u0002\u02de\u02ba\u0003\u0002\u0002\u0002\u02de\u02c6\u0003\u0002\u0002\u0002\u02de\u02d2\u0003\u0002\u0002\u0002\u02df\u005b\u0003\u0002\u0002\u0002\u02e0\u02e1\u0005\u005e\u0030\u0002\u02e1\u02e5\u0005\u009e\u0050\u0002\u02e2\u02e4\u0005\u005a\u002e\u0002\u02e3\u02e2\u0003\u0002\u0002\u0002\u02e4\u02e7\u0003\u0002\u0002\u0002\u02e5\u02e3\u0003\u0002\u0002\u0002\u02e5\u02e6\u0003\u0002\u0002\u0002\u02e6\u02eb\u0003\u0002\u0002\u0002\u02e7\u02e5\u0003\u0002\u0002\u0002\u02e8\u02ec\u0005\u0062\u0032\u0002\u02e9\u02ea\u0007\u0003\u0002\u0002\u02ea\u02ec\u0005\u009e\u0050\u0002\u02eb\u02e8\u0003\u0002\u0002\u0002\u02eb\u02e9\u0003\u0002\u0002\u0002\u02ec\u005d\u0003\u0002\u0002\u0002\u02ed\u02ee\u0007\u0011\u0002\u0002\u02ee\u02ef\u0005\u009c\u004f\u0002\u02ef\u005f\u0003\u0002\u0002\u0002\u02f0\u02fb\u0005\u0062\u0032\u0002\u02f1\u02f2\u0005\u005e\u0030\u0002\u02f2\u02f3\u0005\u009e\u0050\u0002\u02f3\u02fb\u0003\u0002\u0002\u0002\u02f4\u02f5\u0007\u0003\u0002\u0002\u02f5\u02fb\u0005\u009e\u0050\u0002\u02f6\u02f7\u0007\u0014\u0002\u0002\u02f7\u02fb\u0005\u009e\u0050\u0002\u02f8\u02f9\u0007\u0015\u0002\u0002\u02f9\u02fb\u0005\u009e\u0050\u0002\u02fa\u02f0\u0003\u0002\u0002\u0002\u02fa\u02f1\u0003\u0002\u0002\u0002\u02fa\u02f4\u0003\u0002\u0002\u0002\u02fa\u02f6\u0003\u0002\u0002\u0002\u02fa\u02f8\u0003\u0002\u0002\u0002\u02fb\u0061\u0003\u0002\u0002\u0002\u02fc\u02fd\u0007\u0007\u0002\u0002\u02fd\u0309\u0005\u009e\u0050\u0002\u02fe\u0308\u0005\u0040\u0021\u0002\u02ff\u0308\u0005\u0064\u0033\u0002\u0300\u0308\u0005\u005a\u002e\u0002\u0301\u0308\u0005\u0062\u0032\u0002\u0302\u0303\u0005\u005e\u0030\u0002\u0303\u0304\u0005\u009e\u0050\u0002\u0304\u0308\u0003\u0002\u0002\u0002\u0305\u0306\u0007\u0003\u0002\u0002\u0306\u0308\u0005\u009e\u0050\u0002\u0307\u02fe\u0003\u0002\u0002\u0002\u0307\u02ff\u0003\u0002\u0002\u0002\u0307\u0300\u0003\u0002\u0002\u0002\u0307\u0301\u0003\u0002\u0002\u0002\u0307\u0302\u0003\u0002\u0002\u0002\u0307\u0305\u0003\u0002\u0002\u0002\u0308\u030b\u0003\u0002\u0002\u0002\u0309\u0307\u0003\u0002\u0002\u0002\u0309\u030a\u0003\u0002\u0002\u0002\u030a\u030c\u0003\u0002\u0002\u0002\u030b\u0309\u0003\u0002\u0002\u0002\u030c\u030d\u0007\u0008\u0002\u0002\u030d\u030e\u0005\u009e\u0050\u0002\u030e\u0063\u0003\u0002\u0002\u0002\u030f\u031a\u0005\u003e\u0020\u0002\u0310\u031a\u0005\u000c\u0007\u0002\u0311\u031a\u0005\u0018\u000d\u0002\u0312\u031a\u0005\u0082\u0042\u0002\u0313\u031a\u0005\u0086\u0044\u0002\u0314\u031a\u0005\u0068\u0035\u0002\u0315\u031a\u0005\u008c\u0047\u0002\u0316\u031a\u0005\u008e\u0048\u0002\u0317\u031a\u0005\u0090\u0049\u0002\u0318\u031a\u0005\u005c\u002f\u0002\u0319\u030f\u0003\u0002\u0002\u0002\u0319\u0310\u0003\u0002\u0002\u0002\u0319\u0311\u0003\u0002\u0002\u0002\u0319\u0312\u0003\u0002\u0002\u0002\u0319\u0313\u0003\u0002\u0002\u0002\u0319\u0314\u0003\u0002\u0002\u0002\u0319\u0315\u0003\u0002\u0002\u0002\u0319\u0316\u0003\u0002\u0002\u0002\u0319\u0317\u0003\u0002\u0002\u0002\u0319\u0318\u0003\u0002\u0002\u0002\u031a\u0065\u0003\u0002\u0002\u0002\u031b\u031c\u0007\u0007\u0002\u0002\u031c\u0320\u0005\u009e\u0050\u0002\u031d\u031f\u0005\u0064\u0033\u0002\u031e\u031d\u0003\u0002\u0002\u0002\u031f\u0322\u0003\u0002\u0002\u0002\u0320\u031e\u0003\u0002\u0002\u0002\u0320\u0321\u0003\u0002\u0002\u0002\u0321\u0323\u0003\u0002\u0002\u0002\u0322\u0320\u0003\u0002\u0002\u0002\u0323\u0324\u0007\u0008\u0002\u0002\u0324\u0325\u0005\u009e\u0050\u0002\u0325\u0067\u0003\u0002\u0002\u0002\u0326\u0327\u0007\u0033\u0002\u0002\u0327\u0328\u0005\u009e\u0050\u0002\u0328\u0329\u0005\u006a\u0036\u0002\u0329\u032a\u0005\u009e\u0050\u0002\u032a\u032b\u0005\u0066\u0034\u0002\u032b\u0069\u0003\u0002\u0002\u0002\u032c\u0331\u0005\u006e\u0038\u0002\u032d\u0331\u0005\u0070\u0039\u0002\u032e\u0331\u0005\u0072\u003a\u0002\u032f\u0331\u0005\u006c\u0037\u0002\u0330\u032c\u0003\u0002\u0002\u0002\u0330\u032d\u0003\u0002\u0002\u0002\u0330\u032e\u0003\u0002\u0002\u0002\u0330\u032f\u0003\u0002\u0002\u0002\u0331\u006b\u0003\u0002\u0002\u0002\u0332\u0333\u0007\u0004\u0002\u0002\u0333\u0334\u0005\u009e\u0050\u0002\u0334\u0335\u0005\u006a\u0036\u0002\u0335\u0336\u0005\u009e\u0050\u0002\u0336\u0337\u0007\u0006\u0002\u0002\u0337\u033b\u0003\u0002\u0002\u0002\u0338\u033b\u0005\u0074\u003b\u0002\u0339\u033b\u0005\u0076\u003c\u0002\u033a\u0332\u0003\u0002\u0002\u0002\u033a\u0338\u0003\u0002\u0002\u0002\u033a\u0339\u0003\u0002\u0002\u0002\u033b\u006d\u0003\u0002\u0002\u0002\u033c\u033d\u0007\u0023\u0002\u0002\u033d\u033e\u0005\u009e\u0050\u0002\u033e\u033f\u0007\u0013\u0002\u0002\u033f\u0340\u0005\u009e\u0050\u0002\u0340\u0341\u0005\u006c\u0037\u0002\u0341\u006f\u0003\u0002\u0002\u0002\u0342\u034c\u0005\u006c\u0037\u0002\u0343\u0344\u0005\u009e\u0050\u0002\u0344\u0345\u0007\u0013\u0002\u0002\u0345\u0346\u0005\u009e\u0050\u0002\u0346\u0347\u0007\u0024\u0002\u0002\u0347\u0348\u0005\u009e\u0050\u0002\u0348\u0349\u0007\u0013\u0002\u0002\u0349\u034a\u0005\u009e\u0050\u0002\u034a\u034b\u0005\u006c\u0037\u0002\u034b\u034d\u0003\u0002\u0002\u0002\u034c\u0343\u0003\u0002\u0002\u0002\u034d\u034e\u0003\u0002\u0002\u0002\u034e\u034c\u0003\u0002\u0002\u0002\u034e\u034f\u0003\u0002\u0002\u0002\u034f\u0071\u0003\u0002\u0002\u0002\u0350\u035a\u0005\u006c\u0037\u0002\u0351\u0352\u0005\u009e\u0050\u0002\u0352\u0353\u0007\u0013\u0002\u0002\u0353\u0354\u0005\u009e\u0050\u0002\u0354\u0355\u0007\u0034\u0002\u0002\u0355\u0356\u0005\u009e\u0050\u0002\u0356\u0357\u0007\u0013\u0002\u0002\u0357\u0358\u0005\u009e\u0050\u0002\u0358\u0359\u0005\u006c\u0037\u0002\u0359\u035b\u0003\u0002\u0002\u0002\u035a\u0351\u0003\u0002\u0002\u0002\u035b\u035c\u0003\u0002\u0002\u0002\u035c\u035a\u0003\u0002\u0002\u0002\u035c\u035d\u0003\u0002\u0002\u0002\u035d\u0073\u0003\u0002\u0002\u0002\u035e\u035f\u0007\u0004\u0002\u0002\u035f\u0360\u0005\u009e\u0050\u0002\u0360\u0361\u0005\u0042\u0022\u0002\u0361\u0362\u0007\u0006\u0002\u0002\u0362\u0075\u0003\u0002\u0002\u0002\u0363\u0368\u0009\u0007\u0002\u0002\u0364\u0367\u0005\u005a\u002e\u0002\u0365\u0367\u0005\u0060\u0031\u0002\u0366\u0364\u0003\u0002\u0002\u0002\u0366\u0365\u0003\u0002\u0002\u0002\u0367\u036a\u0003\u0002\u0002\u0002\u0368\u0366\u0003\u0002\u0002\u0002\u0368\u0369\u0003\u0002\u0002\u0002\u0369\u036b\u0003\u0002\u0002\u0002\u036a\u0368\u0003\u0002\u0002\u0002\u036b\u036c\u0007\u0006\u0002\u0002\u036c\u0077\u0003\u0002\u0002\u0002\u036d\u036e\u0007\u003e\u0002\u0002\u036e\u036f\u0005\u009e\u0050\u0002\u036f\u0370\u0007\u003d\u0002\u0002\u0370\u0371\u0005\u009e\u0050\u0002\u0371\u0372\u0007\u0006\u0002\u0002\u0372\u0373\u0005\u009e\u0050\u0002\u0373\u0079\u0003\u0002\u0002\u0002\u0374\u0375\u0007\u0038\u0002\u0002\u0375\u0376\u0005\u009e\u0050\u0002\u0376\u0377\u0005\u007c\u003f\u0002\u0377\u0378\u0007\u0006\u0002\u0002\u0378\u0379\u0005\u009e\u0050\u0002\u0379\u007b\u0003\u0002\u0002\u0002\u037a\u0385\u0005\u007e\u0040\u0002\u037b\u037c\u0007\u0013\u0002\u0002\u037c\u037d\u0005\u009e\u0050\u0002\u037d\u037e\u0009\u0006\u0002\u0002\u037e\u037f\u0005\u009e\u0050\u0002\u037f\u0380\u0007\u0013\u0002\u0002\u0380\u0381\u0005\u009e\u0050\u0002\u0381\u0382\u0005\u007e\u0040\u0002\u0382\u0384\u0003\u0002\u0002\u0002\u0383\u037b\u0003\u0002\u0002\u0002\u0384\u0387\u0003\u0002\u0002\u0002\u0385\u0383\u0003\u0002\u0002\u0002\u0385\u0386\u0003\u0002\u0002\u0002\u0386\u007d\u0003\u0002\u0002\u0002\u0387\u0385\u0003\u0002\u0002\u0002\u0388\u0394\u0005\u0080\u0041\u0002\u0389\u038a\u0007\u0009\u0002\u0002\u038a\u038b\u0005\u009e\u0050\u0002\u038b\u038c\u0005\u0080\u0041\u0002\u038c\u0393\u0003\u0002\u0002\u0002\u038d\u038e\u0007\u000f\u0002\u0002\u038e\u038f\u0005\u009e\u0050\u0002\u038f\u0390\u0005\u0052\u002a\u0002\u0390\u0391\u0005\u009e\u0050\u0002\u0391\u0393\u0003\u0002\u0002\u0002\u0392\u0389\u0003\u0002\u0002\u0002\u0392\u038d\u0003\u0002\u0002\u0002\u0393\u0396\u0003\u0002\u0002\u0002\u0394\u0392\u0003\u0002\u0002\u0002\u0394\u0395\u0003\u0002\u0002\u0002\u0395\u007f\u0003\u0002\u0002\u0002\u0396\u0394\u0003\u0002\u0002\u0002\u0397\u0398\u0005\u0052\u002a\u0002\u0398\u0399\u0005\u009e\u0050\u0002\u0399\u03aa\u0003\u0002\u0002\u0002\u039a\u039b\u0005\u0056\u002c\u0002\u039b\u039c\u0005\u009e\u0050\u0002\u039c\u03aa\u0003\u0002\u0002\u0002\u039d\u039e\u0005\u0058\u002d\u0002\u039e\u039f\u0005\u009e\u0050\u0002\u039f\u03aa\u0003\u0002\u0002\u0002\u03a0\u03a1\u0005\u0054\u002b\u0002\u03a1\u03a2\u0005\u009e\u0050\u0002\u03a2\u03aa\u0003\u0002\u0002\u0002\u03a3\u03a4\u0007\u0004\u0002\u0002\u03a4\u03a5\u0005\u009e\u0050\u0002\u03a5\u03a6\u0005\u007c\u003f\u0002\u03a6\u03a7\u0007\u0006\u0002\u0002\u03a7\u03a8\u0005\u009e\u0050\u0002\u03a8\u03aa\u0003\u0002\u0002\u0002\u03a9\u0397\u0003\u0002\u0002\u0002\u03a9\u039a\u0003\u0002\u0002\u0002\u03a9\u039d\u0003\u0002\u0002\u0002\u03a9\u03a0\u0003\u0002\u0002\u0002\u03a9\u03a3\u0003\u0002\u0002\u0002\u03aa\u0081\u0003\u0002\u0002\u0002\u03ab\u03ac\u0007\u0032\u0002\u0002\u03ac\u03ad\u0005\u009e\u0050\u0002\u03ad\u03ae\u0007\u0007\u0002\u0002\u03ae\u03b0\u0005\u009e\u0050\u0002\u03af\u03b1\u0005\u0084\u0043\u0002\u03b0\u03af\u0003\u0002\u0002\u0002\u03b0\u03b1\u0003\u0002\u0002\u0002\u03b1\u03b9\u0003\u0002\u0002\u0002\u03b2\u03b3\u0007\u0003\u0002\u0002\u03b3\u03b5\u0005\u009e\u0050\u0002\u03b4\u03b6\u0005\u0084\u0043\u0002\u03b5\u03b4\u0003\u0002\u0002\u0002\u03b5\u03b6\u0003\u0002\u0002\u0002\u03b6\u03b8\u0003\u0002\u0002\u0002\u03b7\u03b2\u0003\u0002\u0002\u0002\u03b8\u03bb\u0003\u0002\u0002\u0002\u03b9\u03b7\u0003\u0002\u0002\u0002\u03b9\u03ba\u0003\u0002\u0002\u0002\u03ba\u03bc\u0003\u0002\u0002\u0002\u03bb\u03b9\u0003\u0002\u0002\u0002\u03bc\u03bd\u0007\u0008\u0002\u0002\u03bd\u03be\u0005\u009e\u0050\u0002\u03be\u0083\u0003\u0002\u0002\u0002\u03bf\u03c0\u0005\u003c\u001f\u0002\u03c0\u03c1\u0007\u0005\u0002\u0002\u03c1\u03c2\u0005\u009e\u0050\u0002\u03c2\u03c3\u0005\u0048\u0025\u0002\u03c3\u03ca\u0003\u0002\u0002\u0002\u03c4\u03c5\u0005\u003c\u001f\u0002\u03c5\u03c6\u0007\u0005\u0002\u0002\u03c6\u03c7\u0005\u009e\u0050\u0002\u03c7\u03c8\u0005\u0046\u0024\u0002\u03c8\u03ca\u0003\u0002\u0002\u0002\u03c9\u03bf\u0003\u0002\u0002\u0002\u03c9\u03c4\u0003\u0002\u0002\u0002\u03ca\u0085\u0003\u0002\u0002\u0002\u03cb\u03cc\u0007\u0035\u0002\u0002\u03cc\u03cd\u0005\u009e\u0050\u0002\u03cd\u03ce\u0007\u0013\u0002\u0002\u03ce\u03cf\u0005\u009e\u0050\u0002\u03cf\u03d0\u0005\u009c\u004f\u0002\u03d0\u03d1\u0005\u009e\u0050\u0002\u03d1\u03d2\u0007\u0007\u0002\u0002\u03d2\u03d3\u0005\u009e\u0050\u0002\u03d3\u03d4\u0005\u0088\u0045\u0002\u03d4\u03d5\u0007\u0008\u0002\u0002\u03d5\u03d6\u0005\u009e\u0050\u0002\u03d6\u0087\u0003\u0002\u0002\u0002\u03d7\u03d8\u0005\u008a\u0046\u0002\u03d8\u03d9\u0007\u0007\u0002\u0002\u03d9\u03db\u0005\u009e\u0050\u0002\u03da\u03dc\u0005\u0040\u0021\u0002\u03db\u03da\u0003\u0002\u0002\u0002\u03db\u03dc\u0003\u0002\u0002\u0002\u03dc\u03dd\u0003\u0002\u0002\u0002\u03dd\u03de\u0007\u0008\u0002\u0002\u03de\u03df\u0005\u009e\u0050\u0002\u03df\u03e1\u0003\u0002\u0002\u0002\u03e0\u03d7\u0003\u0002\u0002\u0002\u03e1\u03e4\u0003\u0002\u0002\u0002\u03e2\u03e0\u0003\u0002\u0002\u0002\u03e2\u03e3\u0003\u0002\u0002\u0002\u03e3\u0089\u0003\u0002\u0002\u0002\u03e4\u03e2\u0003\u0002\u0002\u0002\u03e5\u03e6\u0009\u0008\u0002\u0002\u03e6\u03ee\u0005\u009e\u0050\u0002\u03e7\u03e8\u0007\u002a\u0002\u0002\u03e8\u03e9\u0005\u009e\u0050\u0002\u03e9\u03ea\u0009\u0008\u0002\u0002\u03ea\u03eb\u0005\u009e\u0050\u0002\u03eb\u03ed\u0003\u0002\u0002\u0002\u03ec\u03e7\u0003\u0002\u0002\u0002\u03ed\u03f0\u0003\u0002\u0002\u0002\u03ee\u03ec\u0003\u0002\u0002\u0002\u03ee\u03ef\u0003\u0002\u0002\u0002\u03ef\u008b\u0003\u0002\u0002\u0002\u03f0\u03ee\u0003\u0002\u0002\u0002\u03f1\u03f2\u0007\u0039\u0002\u0002\u03f2\u03f3\u0005\u009e\u0050\u0002\u03f3\u03f4\u0007\u0007\u0002\u0002\u03f4\u03f6\u0005\u009e\u0050\u0002\u03f5\u03f7\u0005\u0040\u0021\u0002\u03f6\u03f5\u0003\u0002\u0002\u0002\u03f6\u03f7\u0003\u0002\u0002\u0002\u03f7\u03f8\u0003\u0002\u0002\u0002\u03f8\u03f9\u0007\u0008\u0002\u0002\u03f9\u03fa\u0005\u009e\u0050\u0002\u03fa\u008d\u0003\u0002\u0002\u0002\u03fb\u03fc\u0007\u003a\u0002\u0002\u03fc\u03fd\u0005\u009e\u0050\u0002\u03fd\u03fe\u0005\u009c\u004f\u0002\u03fe\u03ff\u0005\u009e\u0050\u0002\u03ff\u0400\u0007\u0007\u0002\u0002\u0400\u0402\u0005\u009e\u0050\u0002\u0401\u0403\u0005\u0040\u0021\u0002\u0402\u0401\u0003\u0002\u0002\u0002\u0402\u0403\u0003\u0002\u0002\u0002\u0403\u0404\u0003\u0002\u0002\u0002\u0404\u0405\u0007\u0008\u0002\u0002\u0405\u0406\u0005\u009e\u0050\u0002\u0406\u008f\u0003\u0002\u0002\u0002\u0407\u0408\u0007\u003b\u0002\u0002\u0408\u0409\u0005\u009e\u0050\u0002\u0409\u040a\u0005\u0092\u004a\u0002\u040a\u040b\u0005\u009e\u0050\u0002\u040b\u040c\u0007\u0007\u0002\u0002\u040c\u0410\u0005\u009e\u0050\u0002\u040d\u040f\u0005\u0096\u004c\u0002\u040e\u040d\u0003\u0002\u0002\u0002\u040f\u0412\u0003\u0002\u0002\u0002\u0410\u040e\u0003\u0002\u0002\u0002\u0410\u0411\u0003\u0002\u0002\u0002\u0411\u0413\u0003\u0002\u0002\u0002\u0412\u0410\u0003\u0002\u0002\u0002\u0413\u0414\u0007\u0008\u0002\u0002\u0414\u0415\u0005\u009e\u0050\u0002\u0415\u0091\u0003\u0002\u0002\u0002\u0416\u041e\u0005\u0094\u004b\u0002\u0417\u0418\u0005\u009e\u0050\u0002\u0418\u0419\u0007\u002a\u0002\u0002\u0419\u041a\u0005\u009e\u0050\u0002\u041a\u041b\u0005\u0094\u004b\u0002\u041b\u041d\u0003\u0002\u0002\u0002\u041c\u0417\u0003\u0002\u0002\u0002\u041d\u0420\u0003\u0002\u0002\u0002\u041e\u041c\u0003\u0002\u0002\u0002\u041e\u041f\u0003\u0002\u0002\u0002\u041f\u0093\u0003\u0002\u0002\u0002\u0420\u041e\u0003\u0002\u0002\u0002\u0421\u042c\u0007\u002e\u0002\u0002\u0422\u0428\u0005\u009c\u004f\u0002\u0423\u0424\u0005\u009e\u0050\u0002\u0424\u0425\u0005\u009c\u004f\u0002\u0425\u0427\u0003\u0002\u0002\u0002\u0426\u0423\u0003\u0002\u0002\u0002\u0427\u042a\u0003\u0002\u0002\u0002\u0428\u0426\u0003\u0002\u0002\u0002\u0428\u0429\u0003\u0002\u0002\u0002\u0429\u042c\u0003\u0002\u0002\u0002\u042a\u0428\u0003\u0002\u0002\u0002\u042b\u0421\u0003\u0002\u0002\u0002\u042b\u0422\u0003\u0002\u0002\u0002\u042c\u0095\u0003\u0002\u0002\u0002\u042d\u042e\u0005\u0098\u004d\u0002\u042e\u042f\u0005\u009e\u0050\u0002\u042f\u0430\u0007\u0007\u0002\u0002\u0430\u0432\u0005\u009e\u0050\u0002\u0431\u0433\u0005\u009a\u004e\u0002\u0432\u0431\u0003\u0002\u0002\u0002\u0432\u0433\u0003\u0002\u0002\u0002\u0433\u043c\u0003\u0002\u0002\u0002\u0434\u0435\u0005\u009e\u0050\u0002\u0435\u0436\u0007\u0003\u0002\u0002\u0436\u0438\u0005\u009e\u0050\u0002\u0437\u0439\u0005\u009a\u004e\u0002\u0438\u0437\u0003\u0002\u0002\u0002\u0438\u0439\u0003\u0002\u0002\u0002\u0439\u043b\u0003\u0002\u0002\u0002\u043a\u0434\u0003\u0002\u0002\u0002\u043b\u043e\u0003\u0002\u0002\u0002\u043c\u043a\u0003\u0002\u0002\u0002\u043c\u043d\u0003\u0002\u0002\u0002\u043d\u043f\u0003\u0002\u0002\u0002\u043e\u043c\u0003\u0002\u0002\u0002\u043f\u0440\u0007\u0008\u0002\u0002\u0440\u0441\u0005\u009e\u0050\u0002\u0441\u0097\u0003\u0002\u0002\u0002\u0442\u0443\u0005\u005e\u0030\u0002\u0443\u0099\u0003\u0002\u0002\u0002\u0444\u0445\u0005\u009c\u004f\u0002\u0445\u0446\u0005\u009e\u0050\u0002\u0446\u0447\u0007\u0005\u0002\u0002\u0447\u0448\u0005\u009e\u0050\u0002\u0448\u044e\u0005\u0052\u002a\u0002\u0449\u044a\u0005\u009e\u0050\u0002\u044a\u044b\u0005\u0052\u002a\u0002\u044b\u044d\u0003\u0002\u0002\u0002\u044c\u0449\u0003\u0002\u0002\u0002\u044d\u0450\u0003\u0002\u0002\u0002\u044e\u044c\u0003\u0002\u0002\u0002\u044e\u044f\u0003\u0002\u0002\u0002\u044f\u009b\u0003\u0002\u0002\u0002\u0450\u044e\u0003\u0002\u0002\u0002\u0451\u0452\u0009\u0009\u0002\u0002\u0452\u009d\u0003\u0002\u0002\u0002\u0453\u0455\u0009\u000a\u0002\u0002\u0454\u0453\u0003\u0002\u0002\u0002\u0455\u0458\u0003\u0002\u0002\u0002\u0456\u0454\u0003\u0002\u0002\u0002\u0456\u0457\u0003\u0002\u0002\u0002\u0457\u009f\u0003\u0002\u0002\u0002\u0458\u0456\u0003\u0002\u0002\u0002\u006c\u00a5\u00aa\u00b1\u00b6\u00bd\u00c2\u00c9\u00ce\u00dd\u00f9\u0100\u010c\u0111\u0122\u0125\u012a\u0135\u013f\u0142\u014d\u0158\u015d\u0162\u0166\u0177\u0182\u018d\u0191\u0198\u019a\u01a2\u01a4\u01a6\u01a9\u01af\u01b6\u01c0\u01c8\u01cc\u01d2\u01d6\u01e4\u01e9\u01f7\u0201\u020c\u0212\u021a\u0220\u0225\u022b\u0233\u0237\u023f\u0246\u0250\u0252\u0256\u025b\u0278\u028a\u028f\u0294\u0299\u02be\u02c0\u02ca\u02cc\u02d6\u02d8\u02de\u02e5\u02eb\u02fa\u0307\u0309\u0319\u0320\u0330\u033a\u034e\u035c\u0366\u0368\u0385\u0392\u0394\u03a9\u03b0\u03b5\u03b9\u03c9\u03db\u03e2\u03ee\u03f6\u0402\u0410\u041e\u0428\u042b\u0432\u0438\u043c\u044e\u0456"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val T__0 = Tokens.T__0.id
    private val T__1 = Tokens.T__1.id
    private val T__2 = Tokens.T__2.id
    private val T__3 = Tokens.T__3.id
    private val T__4 = Tokens.T__4.id
    private val T__5 = Tokens.T__5.id
    private val T__6 = Tokens.T__6.id
    private val T__7 = Tokens.T__7.id
    private val T__8 = Tokens.T__8.id
    private val T__9 = Tokens.T__9.id
    private val T__10 = Tokens.T__10.id
    private val T__11 = Tokens.T__11.id
    private val T__12 = Tokens.T__12.id
    private val T__13 = Tokens.T__13.id
    private val T__14 = Tokens.T__14.id
    private val Comment = Tokens.Comment.id
    private val Space = Tokens.Space.id
    private val Cdo = Tokens.Cdo.id
    private val Cdc = Tokens.Cdc.id
    private val Includes = Tokens.Includes.id
    private val DashMatch = Tokens.DashMatch.id
    private val Hash = Tokens.Hash.id
    private val Import = Tokens.Import.id
    private val Page = Tokens.Page.id
    private val Media = Tokens.Media.id
    private val Namespace = Tokens.Namespace.id
    private val Charset = Tokens.Charset.id
    private val Important = Tokens.Important.id
    private val Percentage = Tokens.Percentage.id
    private val Uri = Tokens.Uri.id
    private val UnicodeRange = Tokens.UnicodeRange.id
    private val MediaOnly = Tokens.MediaOnly.id
    private val Not = Tokens.Not.id
    private val And = Tokens.And.id
    private val Dimension = Tokens.Dimension.id
    private val UnknownDimension = Tokens.UnknownDimension.id
    private val Plus = Tokens.Plus.id
    private val Minus = Tokens.Minus.id
    private val Greater = Tokens.Greater.id
    private val Comma = Tokens.Comma.id
    private val Tilde = Tokens.Tilde.id
    private val PseudoNot = Tokens.PseudoNot.id
    private val Number = Tokens.Number.id
    private val String = Tokens.String.id
    private val PrefixMatch = Tokens.PrefixMatch.id
    private val SuffixMatch = Tokens.SuffixMatch.id
    private val SubstringMatch = Tokens.SubstringMatch.id
    private val FontFace = Tokens.FontFace.id
    private val Supports = Tokens.Supports.id
    private val Or = Tokens.Or.id
    private val Keyframes = Tokens.Keyframes.id
    private val From = Tokens.From.id
    private val To = Tokens.To.id
    private val Calc = Tokens.Calc.id
    private val Viewport = Tokens.Viewport.id
    private val CounterStyle = Tokens.CounterStyle.id
    private val FontFeatureValues = Tokens.FontFeatureValues.id
    private val DxImageTransform = Tokens.DxImageTransform.id
    private val Variable = Tokens.Variable.id
    private val Var = Tokens.Var.id
    private val Ident = Tokens.Ident.id
    private val Function = Tokens.Function.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class StylesheetContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_stylesheet.id
	        set(value) { throw RuntimeException() }
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun findCharset() : List<CharsetContext> = getRuleContexts(solver.getType("CharsetContext"))
		fun findCharset(i: Int) : CharsetContext? = getRuleContext(solver.getType("CharsetContext"),i)
		fun findImports() : List<ImportsContext> = getRuleContexts(solver.getType("ImportsContext"))
		fun findImports(i: Int) : ImportsContext? = getRuleContext(solver.getType("ImportsContext"),i)
		fun findNamespace() : List<NamespaceContext> = getRuleContexts(solver.getType("NamespaceContext"))
		fun findNamespace(i: Int) : NamespaceContext? = getRuleContext(solver.getType("NamespaceContext"),i)
		fun findNestedStatement() : List<NestedStatementContext> = getRuleContexts(solver.getType("NestedStatementContext"))
		fun findNestedStatement(i: Int) : NestedStatementContext? = getRuleContext(solver.getType("NestedStatementContext"),i)
		fun Comment() : List<TerminalNode> = getTokens(css3Parser.Tokens.Comment.id)
		fun Comment(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Comment.id, i) as TerminalNode
		fun Space() : List<TerminalNode> = getTokens(css3Parser.Tokens.Space.id)
		fun Space(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Space.id, i) as TerminalNode
		fun Cdo() : List<TerminalNode> = getTokens(css3Parser.Tokens.Cdo.id)
		fun Cdo(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Cdo.id, i) as TerminalNode
		fun Cdc() : List<TerminalNode> = getTokens(css3Parser.Tokens.Cdc.id)
		fun Cdc(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Cdc.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterStylesheet(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitStylesheet(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitStylesheet(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  stylesheet() : StylesheetContext {
		var _localctx : StylesheetContext = StylesheetContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_stylesheet.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 158
			ws()
			this.state = 168
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Charset) {
				if (true){
				if (true){
				this.state = 159
				charset()
				this.state = 163
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Comment) or (1L shl Space) or (1L shl Cdo) or (1L shl Cdc))) != 0L)) {
					if (true){
					if (true){
					this.state = 160
					_la = _input!!.LA(1)
					if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Comment) or (1L shl Space) or (1L shl Cdo) or (1L shl Cdc))) != 0L)) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					}
					}
					this.state = 165
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				}
				}
				this.state = 170
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 180
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Import) {
				if (true){
				if (true){
				this.state = 171
				imports()
				this.state = 175
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Comment) or (1L shl Space) or (1L shl Cdo) or (1L shl Cdc))) != 0L)) {
					if (true){
					if (true){
					this.state = 172
					_la = _input!!.LA(1)
					if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Comment) or (1L shl Space) or (1L shl Cdo) or (1L shl Cdc))) != 0L)) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					}
					}
					this.state = 177
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				}
				}
				this.state = 182
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 192
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Namespace) {
				if (true){
				if (true){
				this.state = 183
				namespace()
				this.state = 187
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Comment) or (1L shl Space) or (1L shl Cdo) or (1L shl Cdc))) != 0L)) {
					if (true){
					if (true){
					this.state = 184
					_la = _input!!.LA(1)
					if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Comment) or (1L shl Space) or (1L shl Cdo) or (1L shl Cdc))) != 0L)) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					}
					}
					this.state = 189
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				}
				}
				this.state = 194
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 204
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__4) or (1L shl T__6) or (1L shl T__7) or (1L shl T__8) or (1L shl T__9) or (1L shl T__14) or (1L shl Includes) or (1L shl DashMatch) or (1L shl Hash) or (1L shl Page) or (1L shl Media) or (1L shl Percentage) or (1L shl Uri) or (1L shl UnicodeRange) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl PseudoNot) or (1L shl Number) or (1L shl String) or (1L shl FontFace) or (1L shl Supports) or (1L shl Or) or (1L shl Keyframes) or (1L shl From) or (1L shl To) or (1L shl Viewport) or (1L shl CounterStyle) or (1L shl FontFeatureValues) or (1L shl Ident) or (1L shl Function))) != 0L)) {
				if (true){
				if (true){
				this.state = 195
				nestedStatement()
				this.state = 199
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Comment) or (1L shl Space) or (1L shl Cdo) or (1L shl Cdc))) != 0L)) {
					if (true){
					if (true){
					this.state = 196
					_la = _input!!.LA(1)
					if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Comment) or (1L shl Space) or (1L shl Cdo) or (1L shl Cdc))) != 0L)) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					}
					}
					this.state = 201
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				}
				}
				this.state = 206
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CharsetContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_charset.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: CharsetContext) {
			super.copyFrom(ctx)
		}
	}
	open class BadCharsetContext : CharsetContext {
		fun Charset() : TerminalNode? = getToken(css3Parser.Tokens.Charset.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		constructor(ctx: CharsetContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterBadCharset(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitBadCharset(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitBadCharset(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class GoodCharsetContext : CharsetContext {
		fun Charset() : TerminalNode? = getToken(css3Parser.Tokens.Charset.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		constructor(ctx: CharsetContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterGoodCharset(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitGoodCharset(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitGoodCharset(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  charset() : CharsetContext {
		var _localctx : CharsetContext = CharsetContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_charset.id)
		try {
			this.state = 219
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1 -> {_localctx = GoodCharsetContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 207
			match(Charset) as Token
			this.state = 208
			ws()
			this.state = 209
			match(String) as Token
			this.state = 210
			ws()
			this.state = 211
			match(T__0) as Token
			this.state = 212
			ws()
			}}
			2 -> {_localctx = BadCharsetContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 214
			match(Charset) as Token
			this.state = 215
			ws()
			this.state = 216
			match(String) as Token
			this.state = 217
			ws()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ImportsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_imports.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: ImportsContext) {
			super.copyFrom(ctx)
		}
	}
	open class BadImportContext : ImportsContext {
		fun Import() : TerminalNode? = getToken(css3Parser.Tokens.Import.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findMediaQueryList() : MediaQueryListContext? = getRuleContext(solver.getType("MediaQueryListContext"),0)
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		fun Uri() : TerminalNode? = getToken(css3Parser.Tokens.Uri.id, 0)
		constructor(ctx: ImportsContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterBadImport(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitBadImport(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitBadImport(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class GoodImportContext : ImportsContext {
		fun Import() : TerminalNode? = getToken(css3Parser.Tokens.Import.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findMediaQueryList() : MediaQueryListContext? = getRuleContext(solver.getType("MediaQueryListContext"),0)
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		fun Uri() : TerminalNode? = getToken(css3Parser.Tokens.Uri.id, 0)
		constructor(ctx: ImportsContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterGoodImport(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitGoodImport(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitGoodImport(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  imports() : ImportsContext {
		var _localctx : ImportsContext = ImportsContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_imports.id)
		var _la: Int
		try {
			this.state = 247
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,9,context) ) {
			1 -> {_localctx = GoodImportContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 221
			match(Import) as Token
			this.state = 222
			ws()
			this.state = 223
			_la = _input!!.LA(1)
			if ( !(_la==Uri || _la==String) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 224
			ws()
			this.state = 225
			mediaQueryList()
			this.state = 226
			match(T__0) as Token
			this.state = 227
			ws()
			}}
			2 -> {_localctx = GoodImportContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 229
			match(Import) as Token
			this.state = 230
			ws()
			this.state = 231
			_la = _input!!.LA(1)
			if ( !(_la==Uri || _la==String) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 232
			ws()
			this.state = 233
			match(T__0) as Token
			this.state = 234
			ws()
			}}
			3 -> {_localctx = BadImportContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 236
			match(Import) as Token
			this.state = 237
			ws()
			this.state = 238
			_la = _input!!.LA(1)
			if ( !(_la==Uri || _la==String) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 239
			ws()
			this.state = 240
			mediaQueryList()
			}}
			4 -> {_localctx = BadImportContext(_localctx)
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 242
			match(Import) as Token
			this.state = 243
			ws()
			this.state = 244
			_la = _input!!.LA(1)
			if ( !(_la==Uri || _la==String) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 245
			ws()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NamespaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespace.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: NamespaceContext) {
			super.copyFrom(ctx)
		}
	}
	open class GoodNamespaceContext : NamespaceContext {
		fun Namespace() : TerminalNode? = getToken(css3Parser.Tokens.Namespace.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		fun Uri() : TerminalNode? = getToken(css3Parser.Tokens.Uri.id, 0)
		fun findNamespacePrefix() : NamespacePrefixContext? = getRuleContext(solver.getType("NamespacePrefixContext"),0)
		constructor(ctx: NamespaceContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterGoodNamespace(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitGoodNamespace(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitGoodNamespace(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class BadNamespaceContext : NamespaceContext {
		fun Namespace() : TerminalNode? = getToken(css3Parser.Tokens.Namespace.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		fun Uri() : TerminalNode? = getToken(css3Parser.Tokens.Uri.id, 0)
		fun findNamespacePrefix() : NamespacePrefixContext? = getRuleContext(solver.getType("NamespacePrefixContext"),0)
		constructor(ctx: NamespaceContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterBadNamespace(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitBadNamespace(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitBadNamespace(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namespace() : NamespaceContext {
		var _localctx : NamespaceContext = NamespaceContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_namespace.id)
		var _la: Int
		try {
			this.state = 271
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,12,context) ) {
			1 -> {_localctx = GoodNamespaceContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 249
			match(Namespace) as Token
			this.state = 250
			ws()
			this.state = 254
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident))) != 0L)) {
				if (true){
				this.state = 251
				namespacePrefix()
				this.state = 252
				ws()
				}
			}

			this.state = 256
			_la = _input!!.LA(1)
			if ( !(_la==Uri || _la==String) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 257
			ws()
			this.state = 258
			match(T__0) as Token
			this.state = 259
			ws()
			}}
			2 -> {_localctx = BadNamespaceContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 261
			match(Namespace) as Token
			this.state = 262
			ws()
			this.state = 266
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident))) != 0L)) {
				if (true){
				this.state = 263
				namespacePrefix()
				this.state = 264
				ws()
				}
			}

			this.state = 268
			_la = _input!!.LA(1)
			if ( !(_la==Uri || _la==String) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 269
			ws()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NamespacePrefixContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespacePrefix.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterNamespacePrefix(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitNamespacePrefix(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitNamespacePrefix(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namespacePrefix() : NamespacePrefixContext {
		var _localctx : NamespacePrefixContext = NamespacePrefixContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_namespacePrefix.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 273
			ident()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class MediaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_media.id
	        set(value) { throw RuntimeException() }
		fun Media() : TerminalNode? = getToken(css3Parser.Tokens.Media.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findMediaQueryList() : MediaQueryListContext? = getRuleContext(solver.getType("MediaQueryListContext"),0)
		fun findGroupRuleBody() : GroupRuleBodyContext? = getRuleContext(solver.getType("GroupRuleBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterMedia(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitMedia(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitMedia(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  media() : MediaContext {
		var _localctx : MediaContext = MediaContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_media.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 275
			match(Media) as Token
			this.state = 276
			ws()
			this.state = 277
			mediaQueryList()
			this.state = 278
			groupRuleBody()
			this.state = 279
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class MediaQueryListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mediaQueryList.id
	        set(value) { throw RuntimeException() }
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findMediaQuery() : List<MediaQueryContext> = getRuleContexts(solver.getType("MediaQueryContext"))
		fun findMediaQuery(i: Int) : MediaQueryContext? = getRuleContext(solver.getType("MediaQueryContext"),i)
		fun Comma() : List<TerminalNode> = getTokens(css3Parser.Tokens.Comma.id)
		fun Comma(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Comma.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterMediaQueryList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitMediaQueryList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitMediaQueryList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mediaQueryList() : MediaQueryListContext {
		var _localctx : MediaQueryListContext = MediaQueryListContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_mediaQueryList.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 291
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,14,context) ) {
			1   -> if (true){
			this.state = 281
			mediaQuery()
			this.state = 288
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Comma) {
				if (true){
				if (true){
				this.state = 282
				match(Comma) as Token
				this.state = 283
				ws()
				this.state = 284
				mediaQuery()
				}
				}
				this.state = 290
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
			}
			this.state = 293
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class MediaQueryContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mediaQuery.id
	        set(value) { throw RuntimeException() }
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findMediaType() : MediaTypeContext? = getRuleContext(solver.getType("MediaTypeContext"),0)
		fun And() : List<TerminalNode> = getTokens(css3Parser.Tokens.And.id)
		fun And(i: Int) : TerminalNode = getToken(css3Parser.Tokens.And.id, i) as TerminalNode
		fun findMediaExpression() : List<MediaExpressionContext> = getRuleContexts(solver.getType("MediaExpressionContext"))
		fun findMediaExpression(i: Int) : MediaExpressionContext? = getRuleContext(solver.getType("MediaExpressionContext"),i)
		fun MediaOnly() : TerminalNode? = getToken(css3Parser.Tokens.MediaOnly.id, 0)
		fun Not() : TerminalNode? = getToken(css3Parser.Tokens.Not.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterMediaQuery(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitMediaQuery(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitMediaQuery(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mediaQuery() : MediaQueryContext {
		var _localctx : MediaQueryContext = MediaQueryContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_mediaQuery.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 320
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Comment , Space , MediaOnly , Not , And , Or , From , To , Ident  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 296
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,15,context) ) {
			1   -> if (true){
			this.state = 295
			_la = _input!!.LA(1)
			if ( !(_la==MediaOnly || _la==Not) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
			}
			this.state = 298
			ws()
			this.state = 299
			mediaType()
			this.state = 300
			ws()
			this.state = 307
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,16,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 301
					match(And) as Token
					this.state = 302
					ws()
					this.state = 303
					mediaExpression()
					}
					} 
				}
				this.state = 309
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,16,context)
			}
			}}
			T__1  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 310
			mediaExpression()
			this.state = 317
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,17,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 311
					match(And) as Token
					this.state = 312
					ws()
					this.state = 313
					mediaExpression()
					}
					} 
				}
				this.state = 319
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,17,context)
			}
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class MediaTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mediaType.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterMediaType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitMediaType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitMediaType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mediaType() : MediaTypeContext {
		var _localctx : MediaTypeContext = MediaTypeContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_mediaType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 322
			ident()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class MediaExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mediaExpression.id
	        set(value) { throw RuntimeException() }
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findMediaFeature() : MediaFeatureContext? = getRuleContext(solver.getType("MediaFeatureContext"),0)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterMediaExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitMediaExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitMediaExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mediaExpression() : MediaExpressionContext {
		var _localctx : MediaExpressionContext = MediaExpressionContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_mediaExpression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 324
			match(T__1) as Token
			this.state = 325
			ws()
			this.state = 326
			mediaFeature()
			this.state = 331
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__2) {
				if (true){
				this.state = 327
				match(T__2) as Token
				this.state = 328
				ws()
				this.state = 329
				expr()
				}
			}

			this.state = 333
			match(T__3) as Token
			this.state = 334
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class MediaFeatureContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_mediaFeature.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterMediaFeature(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitMediaFeature(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitMediaFeature(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  mediaFeature() : MediaFeatureContext {
		var _localctx : MediaFeatureContext = MediaFeatureContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_mediaFeature.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 336
			ident()
			this.state = 337
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PageContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_page.id
	        set(value) { throw RuntimeException() }
		fun Page() : TerminalNode? = getToken(css3Parser.Tokens.Page.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findPseudoPage() : PseudoPageContext? = getRuleContext(solver.getType("PseudoPageContext"),0)
		fun findDeclaration() : List<DeclarationContext> = getRuleContexts(solver.getType("DeclarationContext"))
		fun findDeclaration(i: Int) : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterPage(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitPage(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitPage(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  page() : PageContext {
		var _localctx : PageContext = PageContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_page.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 339
			match(Page) as Token
			this.state = 340
			ws()
			this.state = 342
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__2) {
				if (true){
				this.state = 341
				pseudoPage()
				}
			}

			this.state = 344
			match(T__4) as Token
			this.state = 345
			ws()
			this.state = 347
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__6) or (1L shl T__13) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Variable) or (1L shl Ident))) != 0L)) {
				if (true){
				this.state = 346
				declaration()
				}
			}

			this.state = 356
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__0) {
				if (true){
				if (true){
				this.state = 349
				match(T__0) as Token
				this.state = 350
				ws()
				this.state = 352
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__6) or (1L shl T__13) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Variable) or (1L shl Ident))) != 0L)) {
					if (true){
					this.state = 351
					declaration()
					}
				}

				}
				}
				this.state = 358
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 359
			match(T__5) as Token
			this.state = 360
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PseudoPageContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_pseudoPage.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterPseudoPage(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitPseudoPage(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitPseudoPage(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  pseudoPage() : PseudoPageContext {
		var _localctx : PseudoPageContext = PseudoPageContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_pseudoPage.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 362
			match(T__2) as Token
			this.state = 363
			ident()
			this.state = 364
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SelectorGroupContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_selectorGroup.id
	        set(value) { throw RuntimeException() }
		fun findSelector() : List<SelectorContext> = getRuleContexts(solver.getType("SelectorContext"))
		fun findSelector(i: Int) : SelectorContext? = getRuleContext(solver.getType("SelectorContext"),i)
		fun Comma() : List<TerminalNode> = getTokens(css3Parser.Tokens.Comma.id)
		fun Comma(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Comma.id, i) as TerminalNode
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSelectorGroup(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSelectorGroup(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSelectorGroup(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  selectorGroup() : SelectorGroupContext {
		var _localctx : SelectorGroupContext = SelectorGroupContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_selectorGroup.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 366
			selector()
			this.state = 373
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Comma) {
				if (true){
				if (true){
				this.state = 367
				match(Comma) as Token
				this.state = 368
				ws()
				this.state = 369
				selector()
				}
				}
				this.state = 375
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SelectorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_selector.id
	        set(value) { throw RuntimeException() }
		fun findSimpleSelectorSequence() : List<SimpleSelectorSequenceContext> = getRuleContexts(solver.getType("SimpleSelectorSequenceContext"))
		fun findSimpleSelectorSequence(i: Int) : SimpleSelectorSequenceContext? = getRuleContext(solver.getType("SimpleSelectorSequenceContext"),i)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findCombinator() : List<CombinatorContext> = getRuleContexts(solver.getType("CombinatorContext"))
		fun findCombinator(i: Int) : CombinatorContext? = getRuleContext(solver.getType("CombinatorContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSelector(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSelector(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSelector(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  selector() : SelectorContext {
		var _localctx : SelectorContext = SelectorContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_selector.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 376
			simpleSelectorSequence()
			this.state = 377
			ws()
			this.state = 384
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Space) or (1L shl Plus) or (1L shl Greater) or (1L shl Tilde))) != 0L)) {
				if (true){
				if (true){
				this.state = 378
				combinator()
				this.state = 379
				simpleSelectorSequence()
				this.state = 380
				ws()
				}
				}
				this.state = 386
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CombinatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_combinator.id
	        set(value) { throw RuntimeException() }
		fun Plus() : TerminalNode? = getToken(css3Parser.Tokens.Plus.id, 0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun Greater() : TerminalNode? = getToken(css3Parser.Tokens.Greater.id, 0)
		fun Tilde() : TerminalNode? = getToken(css3Parser.Tokens.Tilde.id, 0)
		fun Space() : TerminalNode? = getToken(css3Parser.Tokens.Space.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterCombinator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitCombinator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitCombinator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  combinator() : CombinatorContext {
		var _localctx : CombinatorContext = CombinatorContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_combinator.id)
		try {
			this.state = 395
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Plus  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 387
			match(Plus) as Token
			this.state = 388
			ws()
			}}
			Greater  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 389
			match(Greater) as Token
			this.state = 390
			ws()
			}}
			Tilde  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 391
			match(Tilde) as Token
			this.state = 392
			ws()
			}}
			Space  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 393
			match(Space) as Token
			this.state = 394
			ws()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SimpleSelectorSequenceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_simpleSelectorSequence.id
	        set(value) { throw RuntimeException() }
		fun findTypeSelector() : TypeSelectorContext? = getRuleContext(solver.getType("TypeSelectorContext"),0)
		fun findUniversal() : UniversalContext? = getRuleContext(solver.getType("UniversalContext"),0)
		fun Hash() : List<TerminalNode> = getTokens(css3Parser.Tokens.Hash.id)
		fun Hash(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Hash.id, i) as TerminalNode
		fun findClassName() : List<ClassNameContext> = getRuleContexts(solver.getType("ClassNameContext"))
		fun findClassName(i: Int) : ClassNameContext? = getRuleContext(solver.getType("ClassNameContext"),i)
		fun findAttrib() : List<AttribContext> = getRuleContexts(solver.getType("AttribContext"))
		fun findAttrib(i: Int) : AttribContext? = getRuleContext(solver.getType("AttribContext"),i)
		fun findPseudo() : List<PseudoContext> = getRuleContexts(solver.getType("PseudoContext"))
		fun findPseudo(i: Int) : PseudoContext? = getRuleContext(solver.getType("PseudoContext"),i)
		fun findNegation() : List<NegationContext> = getRuleContexts(solver.getType("NegationContext"))
		fun findNegation(i: Int) : NegationContext? = getRuleContext(solver.getType("NegationContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSimpleSelectorSequence(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSimpleSelectorSequence(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSimpleSelectorSequence(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  simpleSelectorSequence() : SimpleSelectorSequenceContext {
		var _localctx : SimpleSelectorSequenceContext = SimpleSelectorSequenceContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_simpleSelectorSequence.id)
		var _la: Int
		try {
			this.state = 420
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__6 , T__7 , MediaOnly , Not , And , Or , From , To , Ident  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 399
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,27,context) ) {
			1 -> {if (true){
			this.state = 397
			typeSelector()
			}}
			2 -> {if (true){
			this.state = 398
			universal()
			}}
			}
			this.state = 408
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__2) or (1L shl T__8) or (1L shl T__9) or (1L shl Hash) or (1L shl PseudoNot))) != 0L)) {
				if (true){
				this.state = 406
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				Hash  ->  /*LL1AltBlock*/{if (true){
				this.state = 401
				match(Hash) as Token
				}}
				T__8  ->  /*LL1AltBlock*/{if (true){
				this.state = 402
				className()
				}}
				T__9  ->  /*LL1AltBlock*/{if (true){
				this.state = 403
				attrib()
				}}
				T__2  ->  /*LL1AltBlock*/{if (true){
				this.state = 404
				pseudo()
				}}
				PseudoNot  ->  /*LL1AltBlock*/{if (true){
				this.state = 405
				negation()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 410
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			T__2 , T__8 , T__9 , Hash , PseudoNot  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 416 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				this.state = 416
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				Hash  ->  /*LL1AltBlock*/{if (true){
				this.state = 411
				match(Hash) as Token
				}}
				T__8  ->  /*LL1AltBlock*/{if (true){
				this.state = 412
				className()
				}}
				T__9  ->  /*LL1AltBlock*/{if (true){
				this.state = 413
				attrib()
				}}
				T__2  ->  /*LL1AltBlock*/{if (true){
				this.state = 414
				pseudo()
				}}
				PseudoNot  ->  /*LL1AltBlock*/{if (true){
				this.state = 415
				negation()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 418 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__2) or (1L shl T__8) or (1L shl T__9) or (1L shl Hash) or (1L shl PseudoNot))) != 0L) )
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeSelectorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeSelector.id
	        set(value) { throw RuntimeException() }
		fun findElementName() : ElementNameContext? = getRuleContext(solver.getType("ElementNameContext"),0)
		fun findTypeNamespacePrefix() : TypeNamespacePrefixContext? = getRuleContext(solver.getType("TypeNamespacePrefixContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterTypeSelector(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitTypeSelector(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitTypeSelector(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeSelector() : TypeSelectorContext {
		var _localctx : TypeSelectorContext = TypeSelectorContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_typeSelector.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 423
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,33,context) ) {
			1   -> if (true){
			this.state = 422
			typeNamespacePrefix()
			}
			}
			this.state = 425
			elementName()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeNamespacePrefixContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeNamespacePrefix.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterTypeNamespacePrefix(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitTypeNamespacePrefix(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitTypeNamespacePrefix(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  typeNamespacePrefix() : TypeNamespacePrefixContext {
		var _localctx : TypeNamespacePrefixContext = TypeNamespacePrefixContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_typeNamespacePrefix.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 429
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			MediaOnly , Not , And , Or , From , To , Ident  -> 
				if (true){
				this.state = 427
				ident()
				}
			T__6  -> 
				if (true){
				this.state = 428
				match(T__6) as Token
				}
			T__7  -> 
				Unit
			else -> Unit
			}
			this.state = 431
			match(T__7) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ElementNameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_elementName.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterElementName(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitElementName(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitElementName(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  elementName() : ElementNameContext {
		var _localctx : ElementNameContext = ElementNameContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_elementName.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 433
			ident()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class UniversalContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_universal.id
	        set(value) { throw RuntimeException() }
		fun findTypeNamespacePrefix() : TypeNamespacePrefixContext? = getRuleContext(solver.getType("TypeNamespacePrefixContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterUniversal(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitUniversal(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitUniversal(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  universal() : UniversalContext {
		var _localctx : UniversalContext = UniversalContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_universal.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 436
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,35,context) ) {
			1   -> if (true){
			this.state = 435
			typeNamespacePrefix()
			}
			}
			this.state = 438
			match(T__6) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ClassNameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_className.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterClassName(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitClassName(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitClassName(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  className() : ClassNameContext {
		var _localctx : ClassNameContext = ClassNameContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_className.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 440
			match(T__8) as Token
			this.state = 441
			ident()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AttribContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attrib.id
	        set(value) { throw RuntimeException() }
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findIdent() : List<IdentContext> = getRuleContexts(solver.getType("IdentContext"))
		fun findIdent(i: Int) : IdentContext? = getRuleContext(solver.getType("IdentContext"),i)
		fun findTypeNamespacePrefix() : TypeNamespacePrefixContext? = getRuleContext(solver.getType("TypeNamespacePrefixContext"),0)
		fun PrefixMatch() : TerminalNode? = getToken(css3Parser.Tokens.PrefixMatch.id, 0)
		fun SuffixMatch() : TerminalNode? = getToken(css3Parser.Tokens.SuffixMatch.id, 0)
		fun SubstringMatch() : TerminalNode? = getToken(css3Parser.Tokens.SubstringMatch.id, 0)
		fun Includes() : TerminalNode? = getToken(css3Parser.Tokens.Includes.id, 0)
		fun DashMatch() : TerminalNode? = getToken(css3Parser.Tokens.DashMatch.id, 0)
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterAttrib(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitAttrib(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitAttrib(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attrib() : AttribContext {
		var _localctx : AttribContext = AttribContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_attrib.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 443
			match(T__9) as Token
			this.state = 444
			ws()
			this.state = 446
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,36,context) ) {
			1   -> if (true){
			this.state = 445
			typeNamespacePrefix()
			}
			}
			this.state = 448
			ident()
			this.state = 449
			ws()
			this.state = 458
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__10) or (1L shl Includes) or (1L shl DashMatch) or (1L shl PrefixMatch) or (1L shl SuffixMatch) or (1L shl SubstringMatch))) != 0L)) {
				if (true){
				this.state = 450
				_la = _input!!.LA(1)
				if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__10) or (1L shl Includes) or (1L shl DashMatch) or (1L shl PrefixMatch) or (1L shl SuffixMatch) or (1L shl SubstringMatch))) != 0L)) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 451
				ws()
				this.state = 454
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				MediaOnly , Not , And , Or , From , To , Ident  ->  /*LL1AltBlock*/{if (true){
				this.state = 452
				ident()
				}}
				String  ->  /*LL1AltBlock*/{if (true){
				this.state = 453
				match(String) as Token
				}}
				else -> throw NoViableAltException(this)
				}
				this.state = 456
				ws()
				}
			}

			this.state = 460
			match(T__11) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PseudoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_pseudo.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		fun findFunctionalPseudo() : FunctionalPseudoContext? = getRuleContext(solver.getType("FunctionalPseudoContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterPseudo(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitPseudo(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitPseudo(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  pseudo() : PseudoContext {
		var _localctx : PseudoContext = PseudoContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_pseudo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 462
			match(T__2) as Token
			this.state = 464
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__2) {
				if (true){
				this.state = 463
				match(T__2) as Token
				}
			}

			this.state = 468
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			MediaOnly , Not , And , Or , From , To , Ident  ->  /*LL1AltBlock*/{if (true){
			this.state = 466
			ident()
			}}
			Function  ->  /*LL1AltBlock*/{if (true){
			this.state = 467
			functionalPseudo()
			}}
			else -> throw NoViableAltException(this)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FunctionalPseudoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_functionalPseudo.id
	        set(value) { throw RuntimeException() }
		fun Function() : TerminalNode? = getToken(css3Parser.Tokens.Function.id, 0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterFunctionalPseudo(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitFunctionalPseudo(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitFunctionalPseudo(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  functionalPseudo() : FunctionalPseudoContext {
		var _localctx : FunctionalPseudoContext = FunctionalPseudoContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_functionalPseudo.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 470
			match(Function) as Token
			this.state = 471
			ws()
			this.state = 472
			expression()
			this.state = 473
			match(T__3) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expression.id
	        set(value) { throw RuntimeException() }
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun Plus() : List<TerminalNode> = getTokens(css3Parser.Tokens.Plus.id)
		fun Plus(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Plus.id, i) as TerminalNode
		fun Minus() : List<TerminalNode> = getTokens(css3Parser.Tokens.Minus.id)
		fun Minus(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Minus.id, i) as TerminalNode
		fun Dimension() : List<TerminalNode> = getTokens(css3Parser.Tokens.Dimension.id)
		fun Dimension(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Dimension.id, i) as TerminalNode
		fun UnknownDimension() : List<TerminalNode> = getTokens(css3Parser.Tokens.UnknownDimension.id)
		fun UnknownDimension(i: Int) : TerminalNode = getToken(css3Parser.Tokens.UnknownDimension.id, i) as TerminalNode
		fun Number() : List<TerminalNode> = getTokens(css3Parser.Tokens.Number.id)
		fun Number(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Number.id, i) as TerminalNode
		fun String() : List<TerminalNode> = getTokens(css3Parser.Tokens.String.id)
		fun String(i: Int) : TerminalNode = getToken(css3Parser.Tokens.String.id, i) as TerminalNode
		fun findIdent() : List<IdentContext> = getRuleContexts(solver.getType("IdentContext"))
		fun findIdent(i: Int) : IdentContext? = getRuleContext(solver.getType("IdentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterExpression(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitExpression(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expression() : ExpressionContext {
		var _localctx : ExpressionContext = ExpressionContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_expression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 485 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 482
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				Plus  ->  /*LL1AltBlock*/{if (true){
				this.state = 475
				match(Plus) as Token
				}}
				Minus  ->  /*LL1AltBlock*/{if (true){
				this.state = 476
				match(Minus) as Token
				}}
				Dimension  ->  /*LL1AltBlock*/{if (true){
				this.state = 477
				match(Dimension) as Token
				}}
				UnknownDimension  ->  /*LL1AltBlock*/{if (true){
				this.state = 478
				match(UnknownDimension) as Token
				}}
				Number  ->  /*LL1AltBlock*/{if (true){
				this.state = 479
				match(Number) as Token
				}}
				String  ->  /*LL1AltBlock*/{if (true){
				this.state = 480
				match(String) as Token
				}}
				MediaOnly , Not , And , Or , From , To , Ident  ->  /*LL1AltBlock*/{if (true){
				this.state = 481
				ident()
				}}
				else -> throw NoViableAltException(this)
				}
				this.state = 484
				ws()
				}
				}
				this.state = 487 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl Number) or (1L shl String) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NegationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_negation.id
	        set(value) { throw RuntimeException() }
		fun PseudoNot() : TerminalNode? = getToken(css3Parser.Tokens.PseudoNot.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findNegationArg() : NegationArgContext? = getRuleContext(solver.getType("NegationArgContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterNegation(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitNegation(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitNegation(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  negation() : NegationContext {
		var _localctx : NegationContext = NegationContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_negation.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 489
			match(PseudoNot) as Token
			this.state = 490
			ws()
			this.state = 491
			negationArg()
			this.state = 492
			ws()
			this.state = 493
			match(T__3) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NegationArgContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_negationArg.id
	        set(value) { throw RuntimeException() }
		fun findTypeSelector() : TypeSelectorContext? = getRuleContext(solver.getType("TypeSelectorContext"),0)
		fun findUniversal() : UniversalContext? = getRuleContext(solver.getType("UniversalContext"),0)
		fun Hash() : TerminalNode? = getToken(css3Parser.Tokens.Hash.id, 0)
		fun findClassName() : ClassNameContext? = getRuleContext(solver.getType("ClassNameContext"),0)
		fun findAttrib() : AttribContext? = getRuleContext(solver.getType("AttribContext"),0)
		fun findPseudo() : PseudoContext? = getRuleContext(solver.getType("PseudoContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterNegationArg(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitNegationArg(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitNegationArg(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  negationArg() : NegationArgContext {
		var _localctx : NegationArgContext = NegationArgContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_negationArg.id)
		try {
			this.state = 501
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,43,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 495
			typeSelector()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 496
			universal()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 497
			match(Hash) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 498
			className()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 499
			attrib()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 500
			pseudo()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class OperatorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_operator.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: OperatorContext) {
			super.copyFrom(ctx)
		}
	}
	open class BadOperatorContext : OperatorContext {
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		constructor(ctx: OperatorContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterBadOperator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitBadOperator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitBadOperator(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class GoodOperatorContext : OperatorContext {
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun Comma() : TerminalNode? = getToken(css3Parser.Tokens.Comma.id, 0)
		fun Space() : TerminalNode? = getToken(css3Parser.Tokens.Space.id, 0)
		constructor(ctx: OperatorContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterGoodOperator(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitGoodOperator(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitGoodOperator(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  operator() : OperatorContext {
		var _localctx : OperatorContext = OperatorContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_operator.id)
		try {
			this.state = 511
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__12  ->  /*LL1AltBlock*/{_localctx = GoodOperatorContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 503
			match(T__12) as Token
			this.state = 504
			ws()
			}}
			Comma  ->  /*LL1AltBlock*/{_localctx = GoodOperatorContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 505
			match(Comma) as Token
			this.state = 506
			ws()
			}}
			Space  ->  /*LL1AltBlock*/{_localctx = GoodOperatorContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 507
			match(Space) as Token
			this.state = 508
			ws()
			}}
			T__10  ->  /*LL1AltBlock*/{_localctx = BadOperatorContext(_localctx)
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 509
			match(T__10) as Token
			this.state = 510
			ws()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PropertyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_property.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: PropertyContext) {
			super.copyFrom(ctx)
		}
	}
	open class BadPropertyContext : PropertyContext {
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		constructor(ctx: PropertyContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterBadProperty(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitBadProperty(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitBadProperty(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class GoodPropertyContext : PropertyContext {
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun Variable() : TerminalNode? = getToken(css3Parser.Tokens.Variable.id, 0)
		constructor(ctx: PropertyContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterGoodProperty(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitGoodProperty(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitGoodProperty(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  property() : PropertyContext {
		var _localctx : PropertyContext = PropertyContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_property.id)
		try {
			this.state = 522
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			MediaOnly , Not , And , Or , From , To , Ident  ->  /*LL1AltBlock*/{_localctx = GoodPropertyContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 513
			ident()
			this.state = 514
			ws()
			}}
			Variable  ->  /*LL1AltBlock*/{_localctx = GoodPropertyContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 516
			match(Variable) as Token
			this.state = 517
			ws()
			}}
			T__6  ->  /*LL1AltBlock*/{_localctx = BadPropertyContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 518
			match(T__6) as Token
			this.state = 519
			ident()
			}}
			T__13  ->  /*LL1AltBlock*/{_localctx = BadPropertyContext(_localctx)
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 520
			match(T__13) as Token
			this.state = 521
			ident()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class RulesetContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ruleset.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: RulesetContext) {
			super.copyFrom(ctx)
		}
	}
	open class UnknownRulesetContext : RulesetContext {
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findAny() : List<AnyContext> = getRuleContexts(solver.getType("AnyContext"))
		fun findAny(i: Int) : AnyContext? = getRuleContext(solver.getType("AnyContext"),i)
		fun findDeclarationList() : DeclarationListContext? = getRuleContext(solver.getType("DeclarationListContext"),0)
		constructor(ctx: RulesetContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterUnknownRuleset(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitUnknownRuleset(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitUnknownRuleset(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class KnownRulesetContext : RulesetContext {
		fun findSelectorGroup() : SelectorGroupContext? = getRuleContext(solver.getType("SelectorGroupContext"),0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findDeclarationList() : DeclarationListContext? = getRuleContext(solver.getType("DeclarationListContext"),0)
		constructor(ctx: RulesetContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterKnownRuleset(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitKnownRuleset(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitKnownRuleset(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ruleset() : RulesetContext {
		var _localctx : RulesetContext = RulesetContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_ruleset.id)
		var _la: Int
		try {
			this.state = 547
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,49,context) ) {
			1 -> {_localctx = KnownRulesetContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 524
			selectorGroup()
			this.state = 525
			match(T__4) as Token
			this.state = 526
			ws()
			this.state = 528
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__6) or (1L shl T__13) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Variable) or (1L shl Ident))) != 0L)) {
				if (true){
				this.state = 527
				declarationList()
				}
			}

			this.state = 530
			match(T__5) as Token
			this.state = 531
			ws()
			}}
			2 -> {_localctx = UnknownRulesetContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 536
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__9) or (1L shl Includes) or (1L shl DashMatch) or (1L shl Hash) or (1L shl Percentage) or (1L shl Uri) or (1L shl UnicodeRange) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl Number) or (1L shl String) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident) or (1L shl Function))) != 0L)) {
				if (true){
				if (true){
				this.state = 533
				any()
				}
				}
				this.state = 538
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 539
			match(T__4) as Token
			this.state = 540
			ws()
			this.state = 542
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__6) or (1L shl T__13) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Variable) or (1L shl Ident))) != 0L)) {
				if (true){
				this.state = 541
				declarationList()
				}
			}

			this.state = 544
			match(T__5) as Token
			this.state = 545
			ws()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DeclarationListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declarationList.id
	        set(value) { throw RuntimeException() }
		fun findDeclaration() : List<DeclarationContext> = getRuleContexts(solver.getType("DeclarationContext"))
		fun findDeclaration(i: Int) : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),i)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterDeclarationList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitDeclarationList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitDeclarationList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declarationList() : DeclarationListContext {
		var _localctx : DeclarationListContext = DeclarationListContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_declarationList.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 553
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__0) {
				if (true){
				if (true){
				this.state = 549
				match(T__0) as Token
				this.state = 550
				ws()
				}
				}
				this.state = 555
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 556
			declaration()
			this.state = 557
			ws()
			this.state = 565
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,52,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 558
					match(T__0) as Token
					this.state = 559
					ws()
					this.state = 561
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,51,context) ) {
					1   -> if (true){
					this.state = 560
					declaration()
					}
					}
					}
					} 
				}
				this.state = 567
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,52,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declaration.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: DeclarationContext) {
			super.copyFrom(ctx)
		}
	}
	open class UnknownDeclarationContext : DeclarationContext {
		fun findProperty() : PropertyContext? = getRuleContext(solver.getType("PropertyContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(ctx: DeclarationContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterUnknownDeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitUnknownDeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitUnknownDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class KnownDeclarationContext : DeclarationContext {
		fun findProperty() : PropertyContext? = getRuleContext(solver.getType("PropertyContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		fun findPrio() : PrioContext? = getRuleContext(solver.getType("PrioContext"),0)
		constructor(ctx: DeclarationContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterKnownDeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitKnownDeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitKnownDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declaration() : DeclarationContext {
		var _localctx : DeclarationContext = DeclarationContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_declaration.id)
		var _la: Int
		try {
			this.state = 580
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,54,context) ) {
			1 -> {_localctx = KnownDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 568
			property()
			this.state = 569
			match(T__2) as Token
			this.state = 570
			ws()
			this.state = 571
			expr()
			this.state = 573
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Important) {
				if (true){
				this.state = 572
				prio()
				}
			}

			}}
			2 -> {_localctx = UnknownDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 575
			property()
			this.state = 576
			match(T__2) as Token
			this.state = 577
			ws()
			this.state = 578
			value()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PrioContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_prio.id
	        set(value) { throw RuntimeException() }
		fun Important() : TerminalNode? = getToken(css3Parser.Tokens.Important.id, 0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterPrio(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitPrio(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitPrio(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  prio() : PrioContext {
		var _localctx : PrioContext = PrioContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_prio.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 582
			match(Important) as Token
			this.state = 583
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_value.id
	        set(value) { throw RuntimeException() }
		fun findAny() : List<AnyContext> = getRuleContexts(solver.getType("AnyContext"))
		fun findAny(i: Int) : AnyContext? = getRuleContext(solver.getType("AnyContext"),i)
		fun findBlock() : List<BlockContext> = getRuleContexts(solver.getType("BlockContext"))
		fun findBlock(i: Int) : BlockContext? = getRuleContext(solver.getType("BlockContext"),i)
		fun findAtKeyword() : List<AtKeywordContext> = getRuleContexts(solver.getType("AtKeywordContext"))
		fun findAtKeyword(i: Int) : AtKeywordContext? = getRuleContext(solver.getType("AtKeywordContext"),i)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterValue(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitValue(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitValue(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  value() : ValueContext {
		var _localctx : ValueContext = ValueContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_value.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 590 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				this.state = 590
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				T__1 , T__2 , T__9 , Includes , DashMatch , Hash , Percentage , Uri , UnicodeRange , MediaOnly , Not , And , Dimension , UnknownDimension , Plus , Minus , Number , String , Or , From , To , Ident , Function  ->  /*LL1AltBlock*/{if (true){
				this.state = 585
				any()
				}}
				T__4  ->  /*LL1AltBlock*/{if (true){
				this.state = 586
				block()
				}}
				T__14  ->  /*LL1AltBlock*/{if (true){
				this.state = 587
				atKeyword()
				this.state = 588
				ws()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 592 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,56,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ExprContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expr.id
	        set(value) { throw RuntimeException() }
		fun findTerm() : List<TermContext> = getRuleContexts(solver.getType("TermContext"))
		fun findTerm(i: Int) : TermContext? = getRuleContext(solver.getType("TermContext"),i)
		fun findOperator() : List<OperatorContext> = getRuleContexts(solver.getType("OperatorContext"))
		fun findOperator(i: Int) : OperatorContext? = getRuleContext(solver.getType("OperatorContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterExpr(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitExpr(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expr() : ExprContext {
		var _localctx : ExprContext = ExprContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_expr.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 594
			term()
			this.state = 601
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,58,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 596
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__10) or (1L shl T__12) or (1L shl Space) or (1L shl Comma))) != 0L)) {
						if (true){
						this.state = 595
						operator()
						}
					}

					this.state = 598
					term()
					}
					} 
				}
				this.state = 603
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,58,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TermContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_term.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: TermContext) {
			super.copyFrom(ctx)
		}
	}
	open class BadTermContext : TermContext {
		fun findDxImageTransform() : DxImageTransformContext? = getRuleContext(solver.getType("DxImageTransformContext"),0)
		constructor(ctx: TermContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterBadTerm(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitBadTerm(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitBadTerm(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class KnownTermContext : TermContext {
		fun findNumber() : NumberContext? = getRuleContext(solver.getType("NumberContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun findPercentage() : PercentageContext? = getRuleContext(solver.getType("PercentageContext"),0)
		fun findDimension() : DimensionContext? = getRuleContext(solver.getType("DimensionContext"),0)
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		fun UnicodeRange() : TerminalNode? = getToken(css3Parser.Tokens.UnicodeRange.id, 0)
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		fun findVar() : VarContext? = getRuleContext(solver.getType("VarContext"),0)
		fun Uri() : TerminalNode? = getToken(css3Parser.Tokens.Uri.id, 0)
		fun findHexcolor() : HexcolorContext? = getRuleContext(solver.getType("HexcolorContext"),0)
		fun findCalc() : CalcContext? = getRuleContext(solver.getType("CalcContext"),0)
		fun findFunction() : FunctionContext? = getRuleContext(solver.getType("FunctionContext"),0)
		constructor(ctx: TermContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterKnownTerm(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitKnownTerm(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitKnownTerm(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class UnknownTermContext : TermContext {
		fun findUnknownDimension() : UnknownDimensionContext? = getRuleContext(solver.getType("UnknownDimensionContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		constructor(ctx: TermContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterUnknownTerm(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitUnknownTerm(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitUnknownTerm(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  term() : TermContext {
		var _localctx : TermContext = TermContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_term.id)
		try {
			this.state = 630
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
			1 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 604
			number()
			this.state = 605
			ws()
			}}
			2 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 607
			percentage()
			this.state = 608
			ws()
			}}
			3 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 610
			dimension()
			this.state = 611
			ws()
			}}
			4 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 613
			match(String) as Token
			this.state = 614
			ws()
			}}
			5 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 615
			match(UnicodeRange) as Token
			this.state = 616
			ws()
			}}
			6 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 617
			ident()
			this.state = 618
			ws()
			}}
			7 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 620
			var()
			}}
			8 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 621
			match(Uri) as Token
			this.state = 622
			ws()
			}}
			9 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 623
			hexcolor()
			}}
			10 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 624
			calc()
			}}
			11 -> {_localctx = KnownTermContext(_localctx)
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 625
			function()
			}}
			12 -> {_localctx = UnknownTermContext(_localctx)
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 626
			unknownDimension()
			this.state = 627
			ws()
			}}
			13 -> {_localctx = BadTermContext(_localctx)
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 629
			dxImageTransform()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FunctionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_function.id
	        set(value) { throw RuntimeException() }
		fun Function() : TerminalNode? = getToken(css3Parser.Tokens.Function.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterFunction(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitFunction(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitFunction(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  function() : FunctionContext {
		var _localctx : FunctionContext = FunctionContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_function.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 632
			match(Function) as Token
			this.state = 633
			ws()
			this.state = 634
			expr()
			this.state = 635
			match(T__3) as Token
			this.state = 636
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DxImageTransformContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dxImageTransform.id
	        set(value) { throw RuntimeException() }
		fun DxImageTransform() : TerminalNode? = getToken(css3Parser.Tokens.DxImageTransform.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterDxImageTransform(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitDxImageTransform(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitDxImageTransform(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  dxImageTransform() : DxImageTransformContext {
		var _localctx : DxImageTransformContext = DxImageTransformContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_dxImageTransform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 638
			match(DxImageTransform) as Token
			this.state = 639
			ws()
			this.state = 640
			expr()
			this.state = 641
			match(T__3) as Token
			this.state = 642
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class HexcolorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_hexcolor.id
	        set(value) { throw RuntimeException() }
		fun Hash() : TerminalNode? = getToken(css3Parser.Tokens.Hash.id, 0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterHexcolor(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitHexcolor(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitHexcolor(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  hexcolor() : HexcolorContext {
		var _localctx : HexcolorContext = HexcolorContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_hexcolor.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 644
			match(Hash) as Token
			this.state = 645
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NumberContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_number.id
	        set(value) { throw RuntimeException() }
		fun Number() : TerminalNode? = getToken(css3Parser.Tokens.Number.id, 0)
		fun Plus() : TerminalNode? = getToken(css3Parser.Tokens.Plus.id, 0)
		fun Minus() : TerminalNode? = getToken(css3Parser.Tokens.Minus.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterNumber(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitNumber(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitNumber(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  number() : NumberContext {
		var _localctx : NumberContext = NumberContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_number.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 648
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Plus || _la==Minus) {
				if (true){
				this.state = 647
				_la = _input!!.LA(1)
				if ( !(_la==Plus || _la==Minus) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 650
			match(Number) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PercentageContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_percentage.id
	        set(value) { throw RuntimeException() }
		fun Percentage() : TerminalNode? = getToken(css3Parser.Tokens.Percentage.id, 0)
		fun Plus() : TerminalNode? = getToken(css3Parser.Tokens.Plus.id, 0)
		fun Minus() : TerminalNode? = getToken(css3Parser.Tokens.Minus.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterPercentage(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitPercentage(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitPercentage(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  percentage() : PercentageContext {
		var _localctx : PercentageContext = PercentageContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_percentage.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 653
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Plus || _la==Minus) {
				if (true){
				this.state = 652
				_la = _input!!.LA(1)
				if ( !(_la==Plus || _la==Minus) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 655
			match(Percentage) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DimensionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dimension.id
	        set(value) { throw RuntimeException() }
		fun Dimension() : TerminalNode? = getToken(css3Parser.Tokens.Dimension.id, 0)
		fun Plus() : TerminalNode? = getToken(css3Parser.Tokens.Plus.id, 0)
		fun Minus() : TerminalNode? = getToken(css3Parser.Tokens.Minus.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterDimension(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitDimension(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitDimension(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  dimension() : DimensionContext {
		var _localctx : DimensionContext = DimensionContext(context, state)
		enterRule(_localctx, 84, Rules.RULE_dimension.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 658
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Plus || _la==Minus) {
				if (true){
				this.state = 657
				_la = _input!!.LA(1)
				if ( !(_la==Plus || _la==Minus) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 660
			match(Dimension) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class UnknownDimensionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unknownDimension.id
	        set(value) { throw RuntimeException() }
		fun UnknownDimension() : TerminalNode? = getToken(css3Parser.Tokens.UnknownDimension.id, 0)
		fun Plus() : TerminalNode? = getToken(css3Parser.Tokens.Plus.id, 0)
		fun Minus() : TerminalNode? = getToken(css3Parser.Tokens.Minus.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterUnknownDimension(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitUnknownDimension(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitUnknownDimension(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  unknownDimension() : UnknownDimensionContext {
		var _localctx : UnknownDimensionContext = UnknownDimensionContext(context, state)
		enterRule(_localctx, 86, Rules.RULE_unknownDimension.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 663
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Plus || _la==Minus) {
				if (true){
				this.state = 662
				_la = _input!!.LA(1)
				if ( !(_la==Plus || _la==Minus) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
			}

			this.state = 665
			match(UnknownDimension) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AnyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_any.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findNumber() : NumberContext? = getRuleContext(solver.getType("NumberContext"),0)
		fun findPercentage() : PercentageContext? = getRuleContext(solver.getType("PercentageContext"),0)
		fun findDimension() : DimensionContext? = getRuleContext(solver.getType("DimensionContext"),0)
		fun findUnknownDimension() : UnknownDimensionContext? = getRuleContext(solver.getType("UnknownDimensionContext"),0)
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		fun Uri() : TerminalNode? = getToken(css3Parser.Tokens.Uri.id, 0)
		fun Hash() : TerminalNode? = getToken(css3Parser.Tokens.Hash.id, 0)
		fun UnicodeRange() : TerminalNode? = getToken(css3Parser.Tokens.UnicodeRange.id, 0)
		fun Includes() : TerminalNode? = getToken(css3Parser.Tokens.Includes.id, 0)
		fun DashMatch() : TerminalNode? = getToken(css3Parser.Tokens.DashMatch.id, 0)
		fun Function() : TerminalNode? = getToken(css3Parser.Tokens.Function.id, 0)
		fun findAny() : List<AnyContext> = getRuleContexts(solver.getType("AnyContext"))
		fun findAny(i: Int) : AnyContext? = getRuleContext(solver.getType("AnyContext"),i)
		fun findUnused() : List<UnusedContext> = getRuleContexts(solver.getType("UnusedContext"))
		fun findUnused(i: Int) : UnusedContext? = getRuleContext(solver.getType("UnusedContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterAny(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitAny(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitAny(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  any() : AnyContext {
		var _localctx : AnyContext = AnyContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_any.id)
		var _la: Int
		try {
			this.state = 732
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,70,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 667
			ident()
			this.state = 668
			ws()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 670
			number()
			this.state = 671
			ws()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 673
			percentage()
			this.state = 674
			ws()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 676
			dimension()
			this.state = 677
			ws()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 679
			unknownDimension()
			this.state = 680
			ws()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 682
			match(String) as Token
			this.state = 683
			ws()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 684
			match(Uri) as Token
			this.state = 685
			ws()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 686
			match(Hash) as Token
			this.state = 687
			ws()
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 688
			match(UnicodeRange) as Token
			this.state = 689
			ws()
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 690
			match(Includes) as Token
			this.state = 691
			ws()
			}}
			11 -> {
			enterOuterAlt(_localctx, 11)
			if (true){
			this.state = 692
			match(DashMatch) as Token
			this.state = 693
			ws()
			}}
			12 -> {
			enterOuterAlt(_localctx, 12)
			if (true){
			this.state = 694
			match(T__2) as Token
			this.state = 695
			ws()
			}}
			13 -> {
			enterOuterAlt(_localctx, 13)
			if (true){
			this.state = 696
			match(Function) as Token
			this.state = 697
			ws()
			this.state = 702
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__1) or (1L shl T__2) or (1L shl T__4) or (1L shl T__9) or (1L shl T__14) or (1L shl Cdo) or (1L shl Cdc) or (1L shl Includes) or (1L shl DashMatch) or (1L shl Hash) or (1L shl Percentage) or (1L shl Uri) or (1L shl UnicodeRange) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl Number) or (1L shl String) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident) or (1L shl Function))) != 0L)) {
				if (true){
				this.state = 700
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				T__1 , T__2 , T__9 , Includes , DashMatch , Hash , Percentage , Uri , UnicodeRange , MediaOnly , Not , And , Dimension , UnknownDimension , Plus , Minus , Number , String , Or , From , To , Ident , Function  ->  /*LL1AltBlock*/{if (true){
				this.state = 698
				any()
				}}
				T__0 , T__4 , T__14 , Cdo , Cdc  ->  /*LL1AltBlock*/{if (true){
				this.state = 699
				unused()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 704
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 705
			match(T__3) as Token
			this.state = 706
			ws()
			}}
			14 -> {
			enterOuterAlt(_localctx, 14)
			if (true){
			this.state = 708
			match(T__1) as Token
			this.state = 709
			ws()
			this.state = 714
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__1) or (1L shl T__2) or (1L shl T__4) or (1L shl T__9) or (1L shl T__14) or (1L shl Cdo) or (1L shl Cdc) or (1L shl Includes) or (1L shl DashMatch) or (1L shl Hash) or (1L shl Percentage) or (1L shl Uri) or (1L shl UnicodeRange) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl Number) or (1L shl String) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident) or (1L shl Function))) != 0L)) {
				if (true){
				this.state = 712
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				T__1 , T__2 , T__9 , Includes , DashMatch , Hash , Percentage , Uri , UnicodeRange , MediaOnly , Not , And , Dimension , UnknownDimension , Plus , Minus , Number , String , Or , From , To , Ident , Function  ->  /*LL1AltBlock*/{if (true){
				this.state = 710
				any()
				}}
				T__0 , T__4 , T__14 , Cdo , Cdc  ->  /*LL1AltBlock*/{if (true){
				this.state = 711
				unused()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 716
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 717
			match(T__3) as Token
			this.state = 718
			ws()
			}}
			15 -> {
			enterOuterAlt(_localctx, 15)
			if (true){
			this.state = 720
			match(T__9) as Token
			this.state = 721
			ws()
			this.state = 726
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__1) or (1L shl T__2) or (1L shl T__4) or (1L shl T__9) or (1L shl T__14) or (1L shl Cdo) or (1L shl Cdc) or (1L shl Includes) or (1L shl DashMatch) or (1L shl Hash) or (1L shl Percentage) or (1L shl Uri) or (1L shl UnicodeRange) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl Number) or (1L shl String) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident) or (1L shl Function))) != 0L)) {
				if (true){
				this.state = 724
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				T__1 , T__2 , T__9 , Includes , DashMatch , Hash , Percentage , Uri , UnicodeRange , MediaOnly , Not , And , Dimension , UnknownDimension , Plus , Minus , Number , String , Or , From , To , Ident , Function  ->  /*LL1AltBlock*/{if (true){
				this.state = 722
				any()
				}}
				T__0 , T__4 , T__14 , Cdo , Cdc  ->  /*LL1AltBlock*/{if (true){
				this.state = 723
				unused()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 728
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 729
			match(T__11) as Token
			this.state = 730
			ws()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AtRuleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_atRule.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: AtRuleContext) {
			super.copyFrom(ctx)
		}
	}
	open class UnknownAtRuleContext : AtRuleContext {
		fun findAtKeyword() : AtKeywordContext? = getRuleContext(solver.getType("AtKeywordContext"),0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findBlock() : BlockContext? = getRuleContext(solver.getType("BlockContext"),0)
		fun findAny() : List<AnyContext> = getRuleContexts(solver.getType("AnyContext"))
		fun findAny(i: Int) : AnyContext? = getRuleContext(solver.getType("AnyContext"),i)
		constructor(ctx: AtRuleContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterUnknownAtRule(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitUnknownAtRule(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitUnknownAtRule(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  atRule() : AtRuleContext {
		var _localctx : AtRuleContext = AtRuleContext(context, state)
		enterRule(_localctx, 90, Rules.RULE_atRule.id)
		var _la: Int
		try {
			 _localctx = UnknownAtRuleContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 734
			atKeyword()
			this.state = 735
			ws()
			this.state = 739
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__9) or (1L shl Includes) or (1L shl DashMatch) or (1L shl Hash) or (1L shl Percentage) or (1L shl Uri) or (1L shl UnicodeRange) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl Number) or (1L shl String) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident) or (1L shl Function))) != 0L)) {
				if (true){
				if (true){
				this.state = 736
				any()
				}
				}
				this.state = 741
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 745
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__4  ->  /*LL1AltBlock*/{if (true){
			this.state = 742
			block()
			}}
			T__0  ->  /*LL1AltBlock*/{if (true){
			this.state = 743
			match(T__0) as Token
			this.state = 744
			ws()
			}}
			else -> throw NoViableAltException(this)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AtKeywordContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_atKeyword.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterAtKeyword(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitAtKeyword(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitAtKeyword(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  atKeyword() : AtKeywordContext {
		var _localctx : AtKeywordContext = AtKeywordContext(context, state)
		enterRule(_localctx, 92, Rules.RULE_atKeyword.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 747
			match(T__14) as Token
			this.state = 748
			ident()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class UnusedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unused.id
	        set(value) { throw RuntimeException() }
		fun findBlock() : BlockContext? = getRuleContext(solver.getType("BlockContext"),0)
		fun findAtKeyword() : AtKeywordContext? = getRuleContext(solver.getType("AtKeywordContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun Cdo() : TerminalNode? = getToken(css3Parser.Tokens.Cdo.id, 0)
		fun Cdc() : TerminalNode? = getToken(css3Parser.Tokens.Cdc.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterUnused(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitUnused(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitUnused(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  unused() : UnusedContext {
		var _localctx : UnusedContext = UnusedContext(context, state)
		enterRule(_localctx, 94, Rules.RULE_unused.id)
		try {
			this.state = 760
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__4  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 750
			block()
			}}
			T__14  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 751
			atKeyword()
			this.state = 752
			ws()
			}}
			T__0  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 754
			match(T__0) as Token
			this.state = 755
			ws()
			}}
			Cdo  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 756
			match(Cdo) as Token
			this.state = 757
			ws()
			}}
			Cdc  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 758
			match(Cdc) as Token
			this.state = 759
			ws()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BlockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_block.id
	        set(value) { throw RuntimeException() }
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findDeclarationList() : List<DeclarationListContext> = getRuleContexts(solver.getType("DeclarationListContext"))
		fun findDeclarationList(i: Int) : DeclarationListContext? = getRuleContext(solver.getType("DeclarationListContext"),i)
		fun findNestedStatement() : List<NestedStatementContext> = getRuleContexts(solver.getType("NestedStatementContext"))
		fun findNestedStatement(i: Int) : NestedStatementContext? = getRuleContext(solver.getType("NestedStatementContext"),i)
		fun findAny() : List<AnyContext> = getRuleContexts(solver.getType("AnyContext"))
		fun findAny(i: Int) : AnyContext? = getRuleContext(solver.getType("AnyContext"),i)
		fun findBlock() : List<BlockContext> = getRuleContexts(solver.getType("BlockContext"))
		fun findBlock(i: Int) : BlockContext? = getRuleContext(solver.getType("BlockContext"),i)
		fun findAtKeyword() : List<AtKeywordContext> = getRuleContexts(solver.getType("AtKeywordContext"))
		fun findAtKeyword(i: Int) : AtKeywordContext? = getRuleContext(solver.getType("AtKeywordContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterBlock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitBlock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitBlock(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  block() : BlockContext {
		var _localctx : BlockContext = BlockContext(context, state)
		enterRule(_localctx, 96, Rules.RULE_block.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 762
			match(T__4) as Token
			this.state = 763
			ws()
			this.state = 775
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__1) or (1L shl T__2) or (1L shl T__4) or (1L shl T__6) or (1L shl T__7) or (1L shl T__8) or (1L shl T__9) or (1L shl T__13) or (1L shl T__14) or (1L shl Includes) or (1L shl DashMatch) or (1L shl Hash) or (1L shl Page) or (1L shl Media) or (1L shl Percentage) or (1L shl Uri) or (1L shl UnicodeRange) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl PseudoNot) or (1L shl Number) or (1L shl String) or (1L shl FontFace) or (1L shl Supports) or (1L shl Or) or (1L shl Keyframes) or (1L shl From) or (1L shl To) or (1L shl Viewport) or (1L shl CounterStyle) or (1L shl FontFeatureValues) or (1L shl Variable) or (1L shl Ident) or (1L shl Function))) != 0L)) {
				if (true){
				this.state = 773
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,74,context) ) {
				1 -> {if (true){
				this.state = 764
				declarationList()
				}}
				2 -> {if (true){
				this.state = 765
				nestedStatement()
				}}
				3 -> {if (true){
				this.state = 766
				any()
				}}
				4 -> {if (true){
				this.state = 767
				block()
				}}
				5 -> {if (true){
				this.state = 768
				atKeyword()
				this.state = 769
				ws()
				}}
				6 -> {if (true){
				this.state = 771
				match(T__0) as Token
				this.state = 772
				ws()
				}}
				}
				}
				this.state = 777
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 778
			match(T__5) as Token
			this.state = 779
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NestedStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_nestedStatement.id
	        set(value) { throw RuntimeException() }
		fun findRuleset() : RulesetContext? = getRuleContext(solver.getType("RulesetContext"),0)
		fun findMedia() : MediaContext? = getRuleContext(solver.getType("MediaContext"),0)
		fun findPage() : PageContext? = getRuleContext(solver.getType("PageContext"),0)
		fun findFontFaceRule() : FontFaceRuleContext? = getRuleContext(solver.getType("FontFaceRuleContext"),0)
		fun findKeyframesRule() : KeyframesRuleContext? = getRuleContext(solver.getType("KeyframesRuleContext"),0)
		fun findSupportsRule() : SupportsRuleContext? = getRuleContext(solver.getType("SupportsRuleContext"),0)
		fun findViewport() : ViewportContext? = getRuleContext(solver.getType("ViewportContext"),0)
		fun findCounterStyle() : CounterStyleContext? = getRuleContext(solver.getType("CounterStyleContext"),0)
		fun findFontFeatureValuesRule() : FontFeatureValuesRuleContext? = getRuleContext(solver.getType("FontFeatureValuesRuleContext"),0)
		fun findAtRule() : AtRuleContext? = getRuleContext(solver.getType("AtRuleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterNestedStatement(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitNestedStatement(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitNestedStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  nestedStatement() : NestedStatementContext {
		var _localctx : NestedStatementContext = NestedStatementContext(context, state)
		enterRule(_localctx, 98, Rules.RULE_nestedStatement.id)
		try {
			this.state = 791
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__1 , T__2 , T__4 , T__6 , T__7 , T__8 , T__9 , Includes , DashMatch , Hash , Percentage , Uri , UnicodeRange , MediaOnly , Not , And , Dimension , UnknownDimension , Plus , Minus , PseudoNot , Number , String , Or , From , To , Ident , Function  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 781
			ruleset()
			}}
			Media  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 782
			media()
			}}
			Page  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 783
			page()
			}}
			FontFace  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 784
			fontFaceRule()
			}}
			Keyframes  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 785
			keyframesRule()
			}}
			Supports  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 786
			supportsRule()
			}}
			Viewport  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 787
			viewport()
			}}
			CounterStyle  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 788
			counterStyle()
			}}
			FontFeatureValues  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 789
			fontFeatureValuesRule()
			}}
			T__14  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 790
			atRule()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class GroupRuleBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_groupRuleBody.id
	        set(value) { throw RuntimeException() }
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findNestedStatement() : List<NestedStatementContext> = getRuleContexts(solver.getType("NestedStatementContext"))
		fun findNestedStatement(i: Int) : NestedStatementContext? = getRuleContext(solver.getType("NestedStatementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterGroupRuleBody(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitGroupRuleBody(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitGroupRuleBody(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  groupRuleBody() : GroupRuleBodyContext {
		var _localctx : GroupRuleBodyContext = GroupRuleBodyContext(context, state)
		enterRule(_localctx, 100, Rules.RULE_groupRuleBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 793
			match(T__4) as Token
			this.state = 794
			ws()
			this.state = 798
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__2) or (1L shl T__4) or (1L shl T__6) or (1L shl T__7) or (1L shl T__8) or (1L shl T__9) or (1L shl T__14) or (1L shl Includes) or (1L shl DashMatch) or (1L shl Hash) or (1L shl Page) or (1L shl Media) or (1L shl Percentage) or (1L shl Uri) or (1L shl UnicodeRange) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl PseudoNot) or (1L shl Number) or (1L shl String) or (1L shl FontFace) or (1L shl Supports) or (1L shl Or) or (1L shl Keyframes) or (1L shl From) or (1L shl To) or (1L shl Viewport) or (1L shl CounterStyle) or (1L shl FontFeatureValues) or (1L shl Ident) or (1L shl Function))) != 0L)) {
				if (true){
				if (true){
				this.state = 795
				nestedStatement()
				}
				}
				this.state = 800
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 801
			match(T__5) as Token
			this.state = 802
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SupportsRuleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_supportsRule.id
	        set(value) { throw RuntimeException() }
		fun Supports() : TerminalNode? = getToken(css3Parser.Tokens.Supports.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findSupportsCondition() : SupportsConditionContext? = getRuleContext(solver.getType("SupportsConditionContext"),0)
		fun findGroupRuleBody() : GroupRuleBodyContext? = getRuleContext(solver.getType("GroupRuleBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSupportsRule(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSupportsRule(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSupportsRule(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  supportsRule() : SupportsRuleContext {
		var _localctx : SupportsRuleContext = SupportsRuleContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_supportsRule.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 804
			match(Supports) as Token
			this.state = 805
			ws()
			this.state = 806
			supportsCondition()
			this.state = 807
			ws()
			this.state = 808
			groupRuleBody()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SupportsConditionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_supportsCondition.id
	        set(value) { throw RuntimeException() }
		fun findSupportsNegation() : SupportsNegationContext? = getRuleContext(solver.getType("SupportsNegationContext"),0)
		fun findSupportsConjunction() : SupportsConjunctionContext? = getRuleContext(solver.getType("SupportsConjunctionContext"),0)
		fun findSupportsDisjunction() : SupportsDisjunctionContext? = getRuleContext(solver.getType("SupportsDisjunctionContext"),0)
		fun findSupportsConditionInParens() : SupportsConditionInParensContext? = getRuleContext(solver.getType("SupportsConditionInParensContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSupportsCondition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSupportsCondition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSupportsCondition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  supportsCondition() : SupportsConditionContext {
		var _localctx : SupportsConditionContext = SupportsConditionContext(context, state)
		enterRule(_localctx, 104, Rules.RULE_supportsCondition.id)
		try {
			this.state = 814
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,78,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 810
			supportsNegation()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 811
			supportsConjunction()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 812
			supportsDisjunction()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 813
			supportsConditionInParens()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SupportsConditionInParensContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_supportsConditionInParens.id
	        set(value) { throw RuntimeException() }
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findSupportsCondition() : SupportsConditionContext? = getRuleContext(solver.getType("SupportsConditionContext"),0)
		fun findSupportsDeclarationCondition() : SupportsDeclarationConditionContext? = getRuleContext(solver.getType("SupportsDeclarationConditionContext"),0)
		fun findGeneralEnclosed() : GeneralEnclosedContext? = getRuleContext(solver.getType("GeneralEnclosedContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSupportsConditionInParens(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSupportsConditionInParens(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSupportsConditionInParens(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  supportsConditionInParens() : SupportsConditionInParensContext {
		var _localctx : SupportsConditionInParensContext = SupportsConditionInParensContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_supportsConditionInParens.id)
		try {
			this.state = 824
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,79,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 816
			match(T__1) as Token
			this.state = 817
			ws()
			this.state = 818
			supportsCondition()
			this.state = 819
			ws()
			this.state = 820
			match(T__3) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 822
			supportsDeclarationCondition()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 823
			generalEnclosed()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SupportsNegationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_supportsNegation.id
	        set(value) { throw RuntimeException() }
		fun Not() : TerminalNode? = getToken(css3Parser.Tokens.Not.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun Space() : TerminalNode? = getToken(css3Parser.Tokens.Space.id, 0)
		fun findSupportsConditionInParens() : SupportsConditionInParensContext? = getRuleContext(solver.getType("SupportsConditionInParensContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSupportsNegation(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSupportsNegation(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSupportsNegation(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  supportsNegation() : SupportsNegationContext {
		var _localctx : SupportsNegationContext = SupportsNegationContext(context, state)
		enterRule(_localctx, 108, Rules.RULE_supportsNegation.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 826
			match(Not) as Token
			this.state = 827
			ws()
			this.state = 828
			match(Space) as Token
			this.state = 829
			ws()
			this.state = 830
			supportsConditionInParens()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SupportsConjunctionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_supportsConjunction.id
	        set(value) { throw RuntimeException() }
		fun findSupportsConditionInParens() : List<SupportsConditionInParensContext> = getRuleContexts(solver.getType("SupportsConditionInParensContext"))
		fun findSupportsConditionInParens(i: Int) : SupportsConditionInParensContext? = getRuleContext(solver.getType("SupportsConditionInParensContext"),i)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun Space() : List<TerminalNode> = getTokens(css3Parser.Tokens.Space.id)
		fun Space(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Space.id, i) as TerminalNode
		fun And() : List<TerminalNode> = getTokens(css3Parser.Tokens.And.id)
		fun And(i: Int) : TerminalNode = getToken(css3Parser.Tokens.And.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSupportsConjunction(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSupportsConjunction(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSupportsConjunction(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  supportsConjunction() : SupportsConjunctionContext {
		var _localctx : SupportsConjunctionContext = SupportsConjunctionContext(context, state)
		enterRule(_localctx, 110, Rules.RULE_supportsConjunction.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 832
			supportsConditionInParens()
			this.state = 842 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 833
				ws()
				this.state = 834
				match(Space) as Token
				this.state = 835
				ws()
				this.state = 836
				match(And) as Token
				this.state = 837
				ws()
				this.state = 838
				match(Space) as Token
				this.state = 839
				ws()
				this.state = 840
				supportsConditionInParens()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 844 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,80,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SupportsDisjunctionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_supportsDisjunction.id
	        set(value) { throw RuntimeException() }
		fun findSupportsConditionInParens() : List<SupportsConditionInParensContext> = getRuleContexts(solver.getType("SupportsConditionInParensContext"))
		fun findSupportsConditionInParens(i: Int) : SupportsConditionInParensContext? = getRuleContext(solver.getType("SupportsConditionInParensContext"),i)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun Space() : List<TerminalNode> = getTokens(css3Parser.Tokens.Space.id)
		fun Space(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Space.id, i) as TerminalNode
		fun Or() : List<TerminalNode> = getTokens(css3Parser.Tokens.Or.id)
		fun Or(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Or.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSupportsDisjunction(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSupportsDisjunction(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSupportsDisjunction(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  supportsDisjunction() : SupportsDisjunctionContext {
		var _localctx : SupportsDisjunctionContext = SupportsDisjunctionContext(context, state)
		enterRule(_localctx, 112, Rules.RULE_supportsDisjunction.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 846
			supportsConditionInParens()
			this.state = 856 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 847
				ws()
				this.state = 848
				match(Space) as Token
				this.state = 849
				ws()
				this.state = 850
				match(Or) as Token
				this.state = 851
				ws()
				this.state = 852
				match(Space) as Token
				this.state = 853
				ws()
				this.state = 854
				supportsConditionInParens()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 858 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,81,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SupportsDeclarationConditionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_supportsDeclarationCondition.id
	        set(value) { throw RuntimeException() }
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun findDeclaration() : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterSupportsDeclarationCondition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitSupportsDeclarationCondition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitSupportsDeclarationCondition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  supportsDeclarationCondition() : SupportsDeclarationConditionContext {
		var _localctx : SupportsDeclarationConditionContext = SupportsDeclarationConditionContext(context, state)
		enterRule(_localctx, 114, Rules.RULE_supportsDeclarationCondition.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 860
			match(T__1) as Token
			this.state = 861
			ws()
			this.state = 862
			declaration()
			this.state = 863
			match(T__3) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class GeneralEnclosedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_generalEnclosed.id
	        set(value) { throw RuntimeException() }
		fun Function() : TerminalNode? = getToken(css3Parser.Tokens.Function.id, 0)
		fun findAny() : List<AnyContext> = getRuleContexts(solver.getType("AnyContext"))
		fun findAny(i: Int) : AnyContext? = getRuleContext(solver.getType("AnyContext"),i)
		fun findUnused() : List<UnusedContext> = getRuleContexts(solver.getType("UnusedContext"))
		fun findUnused(i: Int) : UnusedContext? = getRuleContext(solver.getType("UnusedContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterGeneralEnclosed(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitGeneralEnclosed(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitGeneralEnclosed(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  generalEnclosed() : GeneralEnclosedContext {
		var _localctx : GeneralEnclosedContext = GeneralEnclosedContext(context, state)
		enterRule(_localctx, 116, Rules.RULE_generalEnclosed.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 865
			_la = _input!!.LA(1)
			if ( !(_la==T__1 || _la==Function) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 870
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__1) or (1L shl T__2) or (1L shl T__4) or (1L shl T__9) or (1L shl T__14) or (1L shl Cdo) or (1L shl Cdc) or (1L shl Includes) or (1L shl DashMatch) or (1L shl Hash) or (1L shl Percentage) or (1L shl Uri) or (1L shl UnicodeRange) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Dimension) or (1L shl UnknownDimension) or (1L shl Plus) or (1L shl Minus) or (1L shl Number) or (1L shl String) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident) or (1L shl Function))) != 0L)) {
				if (true){
				this.state = 868
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				T__1 , T__2 , T__9 , Includes , DashMatch , Hash , Percentage , Uri , UnicodeRange , MediaOnly , Not , And , Dimension , UnknownDimension , Plus , Minus , Number , String , Or , From , To , Ident , Function  ->  /*LL1AltBlock*/{if (true){
				this.state = 866
				any()
				}}
				T__0 , T__4 , T__14 , Cdo , Cdc  ->  /*LL1AltBlock*/{if (true){
				this.state = 867
				unused()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 872
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 873
			match(T__3) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class VarContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_var.id
	        set(value) { throw RuntimeException() }
		fun Var() : TerminalNode? = getToken(css3Parser.Tokens.Var.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun Variable() : TerminalNode? = getToken(css3Parser.Tokens.Variable.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterVar(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitVar(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitVar(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  var() : VarContext {
		var _localctx : VarContext = VarContext(context, state)
		enterRule(_localctx, 118, Rules.RULE_var.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 875
			match(Var) as Token
			this.state = 876
			ws()
			this.state = 877
			match(Variable) as Token
			this.state = 878
			ws()
			this.state = 879
			match(T__3) as Token
			this.state = 880
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CalcContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_calc.id
	        set(value) { throw RuntimeException() }
		fun Calc() : TerminalNode? = getToken(css3Parser.Tokens.Calc.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findCalcSum() : CalcSumContext? = getRuleContext(solver.getType("CalcSumContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterCalc(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitCalc(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitCalc(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  calc() : CalcContext {
		var _localctx : CalcContext = CalcContext(context, state)
		enterRule(_localctx, 120, Rules.RULE_calc.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 882
			match(Calc) as Token
			this.state = 883
			ws()
			this.state = 884
			calcSum()
			this.state = 885
			match(T__3) as Token
			this.state = 886
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CalcSumContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_calcSum.id
	        set(value) { throw RuntimeException() }
		fun findCalcProduct() : List<CalcProductContext> = getRuleContexts(solver.getType("CalcProductContext"))
		fun findCalcProduct(i: Int) : CalcProductContext? = getRuleContext(solver.getType("CalcProductContext"),i)
		fun Space() : List<TerminalNode> = getTokens(css3Parser.Tokens.Space.id)
		fun Space(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Space.id, i) as TerminalNode
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun Plus() : List<TerminalNode> = getTokens(css3Parser.Tokens.Plus.id)
		fun Plus(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Plus.id, i) as TerminalNode
		fun Minus() : List<TerminalNode> = getTokens(css3Parser.Tokens.Minus.id)
		fun Minus(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Minus.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterCalcSum(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitCalcSum(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitCalcSum(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  calcSum() : CalcSumContext {
		var _localctx : CalcSumContext = CalcSumContext(context, state)
		enterRule(_localctx, 122, Rules.RULE_calcSum.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 888
			calcProduct()
			this.state = 899
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Space) {
				if (true){
				if (true){
				this.state = 889
				match(Space) as Token
				this.state = 890
				ws()
				this.state = 891
				_la = _input!!.LA(1)
				if ( !(_la==Plus || _la==Minus) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 892
				ws()
				this.state = 893
				match(Space) as Token
				this.state = 894
				ws()
				this.state = 895
				calcProduct()
				}
				}
				this.state = 901
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CalcProductContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_calcProduct.id
	        set(value) { throw RuntimeException() }
		fun findCalcValue() : List<CalcValueContext> = getRuleContexts(solver.getType("CalcValueContext"))
		fun findCalcValue(i: Int) : CalcValueContext? = getRuleContext(solver.getType("CalcValueContext"),i)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findNumber() : List<NumberContext> = getRuleContexts(solver.getType("NumberContext"))
		fun findNumber(i: Int) : NumberContext? = getRuleContext(solver.getType("NumberContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterCalcProduct(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitCalcProduct(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitCalcProduct(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  calcProduct() : CalcProductContext {
		var _localctx : CalcProductContext = CalcProductContext(context, state)
		enterRule(_localctx, 124, Rules.RULE_calcProduct.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 902
			calcValue()
			this.state = 914
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__6 || _la==T__12) {
				if (true){
				this.state = 912
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				T__6  ->  /*LL1AltBlock*/{if (true){
				this.state = 903
				match(T__6) as Token
				this.state = 904
				ws()
				this.state = 905
				calcValue()
				}}
				T__12  ->  /*LL1AltBlock*/{if (true){
				this.state = 907
				match(T__12) as Token
				this.state = 908
				ws()
				this.state = 909
				number()
				this.state = 910
				ws()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 916
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CalcValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_calcValue.id
	        set(value) { throw RuntimeException() }
		fun findNumber() : NumberContext? = getRuleContext(solver.getType("NumberContext"),0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findDimension() : DimensionContext? = getRuleContext(solver.getType("DimensionContext"),0)
		fun findUnknownDimension() : UnknownDimensionContext? = getRuleContext(solver.getType("UnknownDimensionContext"),0)
		fun findPercentage() : PercentageContext? = getRuleContext(solver.getType("PercentageContext"),0)
		fun findCalcSum() : CalcSumContext? = getRuleContext(solver.getType("CalcSumContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterCalcValue(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitCalcValue(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitCalcValue(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  calcValue() : CalcValueContext {
		var _localctx : CalcValueContext = CalcValueContext(context, state)
		enterRule(_localctx, 126, Rules.RULE_calcValue.id)
		try {
			this.state = 935
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,87,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 917
			number()
			this.state = 918
			ws()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 920
			dimension()
			this.state = 921
			ws()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 923
			unknownDimension()
			this.state = 924
			ws()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 926
			percentage()
			this.state = 927
			ws()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 929
			match(T__1) as Token
			this.state = 930
			ws()
			this.state = 931
			calcSum()
			this.state = 932
			match(T__3) as Token
			this.state = 933
			ws()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FontFaceRuleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fontFaceRule.id
	        set(value) { throw RuntimeException() }
		fun FontFace() : TerminalNode? = getToken(css3Parser.Tokens.FontFace.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findFontFaceDeclaration() : List<FontFaceDeclarationContext> = getRuleContexts(solver.getType("FontFaceDeclarationContext"))
		fun findFontFaceDeclaration(i: Int) : FontFaceDeclarationContext? = getRuleContext(solver.getType("FontFaceDeclarationContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterFontFaceRule(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitFontFaceRule(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitFontFaceRule(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fontFaceRule() : FontFaceRuleContext {
		var _localctx : FontFaceRuleContext = FontFaceRuleContext(context, state)
		enterRule(_localctx, 128, Rules.RULE_fontFaceRule.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 937
			match(FontFace) as Token
			this.state = 938
			ws()
			this.state = 939
			match(T__4) as Token
			this.state = 940
			ws()
			this.state = 942
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__6) or (1L shl T__13) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Variable) or (1L shl Ident))) != 0L)) {
				if (true){
				this.state = 941
				fontFaceDeclaration()
				}
			}

			this.state = 951
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__0) {
				if (true){
				if (true){
				this.state = 944
				match(T__0) as Token
				this.state = 945
				ws()
				this.state = 947
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__6) or (1L shl T__13) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Variable) or (1L shl Ident))) != 0L)) {
					if (true){
					this.state = 946
					fontFaceDeclaration()
					}
				}

				}
				}
				this.state = 953
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 954
			match(T__5) as Token
			this.state = 955
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FontFaceDeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fontFaceDeclaration.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: FontFaceDeclarationContext) {
			super.copyFrom(ctx)
		}
	}
	open class KnownFontFaceDeclarationContext : FontFaceDeclarationContext {
		fun findProperty() : PropertyContext? = getRuleContext(solver.getType("PropertyContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun findExpr() : ExprContext? = getRuleContext(solver.getType("ExprContext"),0)
		constructor(ctx: FontFaceDeclarationContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterKnownFontFaceDeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitKnownFontFaceDeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitKnownFontFaceDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class UnknownFontFaceDeclarationContext : FontFaceDeclarationContext {
		fun findProperty() : PropertyContext? = getRuleContext(solver.getType("PropertyContext"),0)
		fun findWs() : WsContext? = getRuleContext(solver.getType("WsContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(ctx: FontFaceDeclarationContext) { copyFrom(ctx) }
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterUnknownFontFaceDeclaration(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitUnknownFontFaceDeclaration(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitUnknownFontFaceDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fontFaceDeclaration() : FontFaceDeclarationContext {
		var _localctx : FontFaceDeclarationContext = FontFaceDeclarationContext(context, state)
		enterRule(_localctx, 130, Rules.RULE_fontFaceDeclaration.id)
		try {
			this.state = 967
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,91,context) ) {
			1 -> {_localctx = KnownFontFaceDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 957
			property()
			this.state = 958
			match(T__2) as Token
			this.state = 959
			ws()
			this.state = 960
			expr()
			}}
			2 -> {_localctx = UnknownFontFaceDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 962
			property()
			this.state = 963
			match(T__2) as Token
			this.state = 964
			ws()
			this.state = 965
			value()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class KeyframesRuleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_keyframesRule.id
	        set(value) { throw RuntimeException() }
		fun Keyframes() : TerminalNode? = getToken(css3Parser.Tokens.Keyframes.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun Space() : TerminalNode? = getToken(css3Parser.Tokens.Space.id, 0)
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		fun findKeyframesBlocks() : KeyframesBlocksContext? = getRuleContext(solver.getType("KeyframesBlocksContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterKeyframesRule(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitKeyframesRule(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitKeyframesRule(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  keyframesRule() : KeyframesRuleContext {
		var _localctx : KeyframesRuleContext = KeyframesRuleContext(context, state)
		enterRule(_localctx, 132, Rules.RULE_keyframesRule.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 969
			match(Keyframes) as Token
			this.state = 970
			ws()
			this.state = 971
			match(Space) as Token
			this.state = 972
			ws()
			this.state = 973
			ident()
			this.state = 974
			ws()
			this.state = 975
			match(T__4) as Token
			this.state = 976
			ws()
			this.state = 977
			keyframesBlocks()
			this.state = 978
			match(T__5) as Token
			this.state = 979
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class KeyframesBlocksContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_keyframesBlocks.id
	        set(value) { throw RuntimeException() }
		fun findKeyframeSelector() : List<KeyframeSelectorContext> = getRuleContexts(solver.getType("KeyframeSelectorContext"))
		fun findKeyframeSelector(i: Int) : KeyframeSelectorContext? = getRuleContext(solver.getType("KeyframeSelectorContext"),i)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findDeclarationList() : List<DeclarationListContext> = getRuleContexts(solver.getType("DeclarationListContext"))
		fun findDeclarationList(i: Int) : DeclarationListContext? = getRuleContext(solver.getType("DeclarationListContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterKeyframesBlocks(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitKeyframesBlocks(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitKeyframesBlocks(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  keyframesBlocks() : KeyframesBlocksContext {
		var _localctx : KeyframesBlocksContext = KeyframesBlocksContext(context, state)
		enterRule(_localctx, 134, Rules.RULE_keyframesBlocks.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 992
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Percentage) or (1L shl From) or (1L shl To))) != 0L)) {
				if (true){
				if (true){
				this.state = 981
				keyframeSelector()
				this.state = 982
				match(T__4) as Token
				this.state = 983
				ws()
				this.state = 985
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__6) or (1L shl T__13) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Variable) or (1L shl Ident))) != 0L)) {
					if (true){
					this.state = 984
					declarationList()
					}
				}

				this.state = 987
				match(T__5) as Token
				this.state = 988
				ws()
				}
				}
				this.state = 994
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class KeyframeSelectorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_keyframeSelector.id
	        set(value) { throw RuntimeException() }
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun From() : List<TerminalNode> = getTokens(css3Parser.Tokens.From.id)
		fun From(i: Int) : TerminalNode = getToken(css3Parser.Tokens.From.id, i) as TerminalNode
		fun To() : List<TerminalNode> = getTokens(css3Parser.Tokens.To.id)
		fun To(i: Int) : TerminalNode = getToken(css3Parser.Tokens.To.id, i) as TerminalNode
		fun Percentage() : List<TerminalNode> = getTokens(css3Parser.Tokens.Percentage.id)
		fun Percentage(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Percentage.id, i) as TerminalNode
		fun Comma() : List<TerminalNode> = getTokens(css3Parser.Tokens.Comma.id)
		fun Comma(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Comma.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterKeyframeSelector(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitKeyframeSelector(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitKeyframeSelector(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  keyframeSelector() : KeyframeSelectorContext {
		var _localctx : KeyframeSelectorContext = KeyframeSelectorContext(context, state)
		enterRule(_localctx, 136, Rules.RULE_keyframeSelector.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 995
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Percentage) or (1L shl From) or (1L shl To))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 996
			ws()
			this.state = 1004
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Comma) {
				if (true){
				if (true){
				this.state = 997
				match(Comma) as Token
				this.state = 998
				ws()
				this.state = 999
				_la = _input!!.LA(1)
				if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Percentage) or (1L shl From) or (1L shl To))) != 0L)) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 1000
				ws()
				}
				}
				this.state = 1006
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ViewportContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_viewport.id
	        set(value) { throw RuntimeException() }
		fun Viewport() : TerminalNode? = getToken(css3Parser.Tokens.Viewport.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findDeclarationList() : DeclarationListContext? = getRuleContext(solver.getType("DeclarationListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterViewport(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitViewport(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitViewport(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  viewport() : ViewportContext {
		var _localctx : ViewportContext = ViewportContext(context, state)
		enterRule(_localctx, 138, Rules.RULE_viewport.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1007
			match(Viewport) as Token
			this.state = 1008
			ws()
			this.state = 1009
			match(T__4) as Token
			this.state = 1010
			ws()
			this.state = 1012
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__6) or (1L shl T__13) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Variable) or (1L shl Ident))) != 0L)) {
				if (true){
				this.state = 1011
				declarationList()
				}
			}

			this.state = 1014
			match(T__5) as Token
			this.state = 1015
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CounterStyleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_counterStyle.id
	        set(value) { throw RuntimeException() }
		fun CounterStyle() : TerminalNode? = getToken(css3Parser.Tokens.CounterStyle.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		fun findDeclarationList() : DeclarationListContext? = getRuleContext(solver.getType("DeclarationListContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterCounterStyle(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitCounterStyle(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitCounterStyle(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  counterStyle() : CounterStyleContext {
		var _localctx : CounterStyleContext = CounterStyleContext(context, state)
		enterRule(_localctx, 140, Rules.RULE_counterStyle.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1017
			match(CounterStyle) as Token
			this.state = 1018
			ws()
			this.state = 1019
			ident()
			this.state = 1020
			ws()
			this.state = 1021
			match(T__4) as Token
			this.state = 1022
			ws()
			this.state = 1024
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl T__6) or (1L shl T__13) or (1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Variable) or (1L shl Ident))) != 0L)) {
				if (true){
				this.state = 1023
				declarationList()
				}
			}

			this.state = 1026
			match(T__5) as Token
			this.state = 1027
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FontFeatureValuesRuleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fontFeatureValuesRule.id
	        set(value) { throw RuntimeException() }
		fun FontFeatureValues() : TerminalNode? = getToken(css3Parser.Tokens.FontFeatureValues.id, 0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findFontFamilyNameList() : FontFamilyNameListContext? = getRuleContext(solver.getType("FontFamilyNameListContext"),0)
		fun findFeatureValueBlock() : List<FeatureValueBlockContext> = getRuleContexts(solver.getType("FeatureValueBlockContext"))
		fun findFeatureValueBlock(i: Int) : FeatureValueBlockContext? = getRuleContext(solver.getType("FeatureValueBlockContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterFontFeatureValuesRule(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitFontFeatureValuesRule(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitFontFeatureValuesRule(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fontFeatureValuesRule() : FontFeatureValuesRuleContext {
		var _localctx : FontFeatureValuesRuleContext = FontFeatureValuesRuleContext(context, state)
		enterRule(_localctx, 142, Rules.RULE_fontFeatureValuesRule.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1029
			match(FontFeatureValues) as Token
			this.state = 1030
			ws()
			this.state = 1031
			fontFamilyNameList()
			this.state = 1032
			ws()
			this.state = 1033
			match(T__4) as Token
			this.state = 1034
			ws()
			this.state = 1038
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__14) {
				if (true){
				if (true){
				this.state = 1035
				featureValueBlock()
				}
				}
				this.state = 1040
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1041
			match(T__5) as Token
			this.state = 1042
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FontFamilyNameListContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fontFamilyNameList.id
	        set(value) { throw RuntimeException() }
		fun findFontFamilyName() : List<FontFamilyNameContext> = getRuleContexts(solver.getType("FontFamilyNameContext"))
		fun findFontFamilyName(i: Int) : FontFamilyNameContext? = getRuleContext(solver.getType("FontFamilyNameContext"),i)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun Comma() : List<TerminalNode> = getTokens(css3Parser.Tokens.Comma.id)
		fun Comma(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Comma.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterFontFamilyNameList(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitFontFamilyNameList(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitFontFamilyNameList(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fontFamilyNameList() : FontFamilyNameListContext {
		var _localctx : FontFamilyNameListContext = FontFamilyNameListContext(context, state)
		enterRule(_localctx, 144, Rules.RULE_fontFamilyNameList.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1044
			fontFamilyName()
			this.state = 1052
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,98,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 1045
					ws()
					this.state = 1046
					match(Comma) as Token
					this.state = 1047
					ws()
					this.state = 1048
					fontFamilyName()
					}
					} 
				}
				this.state = 1054
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,98,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FontFamilyNameContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fontFamilyName.id
	        set(value) { throw RuntimeException() }
		fun String() : TerminalNode? = getToken(css3Parser.Tokens.String.id, 0)
		fun findIdent() : List<IdentContext> = getRuleContexts(solver.getType("IdentContext"))
		fun findIdent(i: Int) : IdentContext? = getRuleContext(solver.getType("IdentContext"),i)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterFontFamilyName(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitFontFamilyName(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitFontFamilyName(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  fontFamilyName() : FontFamilyNameContext {
		var _localctx : FontFamilyNameContext = FontFamilyNameContext(context, state)
		enterRule(_localctx, 146, Rules.RULE_fontFamilyName.id)
		try {
			var _alt: Int
			this.state = 1065
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1055
			match(String) as Token
			}}
			MediaOnly , Not , And , Or , From , To , Ident  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1056
			ident()
			this.state = 1062
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,99,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 1057
					ws()
					this.state = 1058
					ident()
					}
					} 
				}
				this.state = 1064
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,99,context)
			}
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FeatureValueBlockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_featureValueBlock.id
	        set(value) { throw RuntimeException() }
		fun findFeatureType() : FeatureTypeContext? = getRuleContext(solver.getType("FeatureTypeContext"),0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findFeatureValueDefinition() : List<FeatureValueDefinitionContext> = getRuleContexts(solver.getType("FeatureValueDefinitionContext"))
		fun findFeatureValueDefinition(i: Int) : FeatureValueDefinitionContext? = getRuleContext(solver.getType("FeatureValueDefinitionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterFeatureValueBlock(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitFeatureValueBlock(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitFeatureValueBlock(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  featureValueBlock() : FeatureValueBlockContext {
		var _localctx : FeatureValueBlockContext = FeatureValueBlockContext(context, state)
		enterRule(_localctx, 148, Rules.RULE_featureValueBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1067
			featureType()
			this.state = 1068
			ws()
			this.state = 1069
			match(T__4) as Token
			this.state = 1070
			ws()
			this.state = 1072
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident))) != 0L)) {
				if (true){
				this.state = 1071
				featureValueDefinition()
				}
			}

			this.state = 1082
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__0) or (1L shl Comment) or (1L shl Space))) != 0L)) {
				if (true){
				if (true){
				this.state = 1074
				ws()
				this.state = 1075
				match(T__0) as Token
				this.state = 1076
				ws()
				this.state = 1078
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident))) != 0L)) {
					if (true){
					this.state = 1077
					featureValueDefinition()
					}
				}

				}
				}
				this.state = 1084
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1085
			match(T__5) as Token
			this.state = 1086
			ws()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FeatureTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_featureType.id
	        set(value) { throw RuntimeException() }
		fun findAtKeyword() : AtKeywordContext? = getRuleContext(solver.getType("AtKeywordContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterFeatureType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitFeatureType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitFeatureType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  featureType() : FeatureTypeContext {
		var _localctx : FeatureTypeContext = FeatureTypeContext(context, state)
		enterRule(_localctx, 150, Rules.RULE_featureType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1088
			atKeyword()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FeatureValueDefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_featureValueDefinition.id
	        set(value) { throw RuntimeException() }
		fun findIdent() : IdentContext? = getRuleContext(solver.getType("IdentContext"),0)
		fun findWs() : List<WsContext> = getRuleContexts(solver.getType("WsContext"))
		fun findWs(i: Int) : WsContext? = getRuleContext(solver.getType("WsContext"),i)
		fun findNumber() : List<NumberContext> = getRuleContexts(solver.getType("NumberContext"))
		fun findNumber(i: Int) : NumberContext? = getRuleContext(solver.getType("NumberContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterFeatureValueDefinition(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitFeatureValueDefinition(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitFeatureValueDefinition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  featureValueDefinition() : FeatureValueDefinitionContext {
		var _localctx : FeatureValueDefinitionContext = FeatureValueDefinitionContext(context, state)
		enterRule(_localctx, 152, Rules.RULE_featureValueDefinition.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1090
			ident()
			this.state = 1091
			ws()
			this.state = 1092
			match(T__2) as Token
			this.state = 1093
			ws()
			this.state = 1094
			number()
			this.state = 1100
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,104,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 1095
					ws()
					this.state = 1096
					number()
					}
					} 
				}
				this.state = 1102
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,104,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IdentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ident.id
	        set(value) { throw RuntimeException() }
		fun Ident() : TerminalNode? = getToken(css3Parser.Tokens.Ident.id, 0)
		fun MediaOnly() : TerminalNode? = getToken(css3Parser.Tokens.MediaOnly.id, 0)
		fun Not() : TerminalNode? = getToken(css3Parser.Tokens.Not.id, 0)
		fun And() : TerminalNode? = getToken(css3Parser.Tokens.And.id, 0)
		fun Or() : TerminalNode? = getToken(css3Parser.Tokens.Or.id, 0)
		fun From() : TerminalNode? = getToken(css3Parser.Tokens.From.id, 0)
		fun To() : TerminalNode? = getToken(css3Parser.Tokens.To.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterIdent(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitIdent(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitIdent(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ident() : IdentContext {
		var _localctx : IdentContext = IdentContext(context, state)
		enterRule(_localctx, 154, Rules.RULE_ident.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1103
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MediaOnly) or (1L shl Not) or (1L shl And) or (1L shl Or) or (1L shl From) or (1L shl To) or (1L shl Ident))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class WsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ws.id
	        set(value) { throw RuntimeException() }
		fun Comment() : List<TerminalNode> = getTokens(css3Parser.Tokens.Comment.id)
		fun Comment(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Comment.id, i) as TerminalNode
		fun Space() : List<TerminalNode> = getTokens(css3Parser.Tokens.Space.id)
		fun Space(i: Int) : TerminalNode = getToken(css3Parser.Tokens.Space.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).enterWs(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is css3Listener ) (listener as css3Listener).exitWs(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is css3Visitor ) return (visitor as css3Visitor<out T>).visitWs(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ws() : WsContext {
		var _localctx : WsContext = WsContext(context, state)
		enterRule(_localctx, 156, Rules.RULE_ws.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1108
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,105,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 1105
					_la = _input!!.LA(1)
					if ( !(_la==Comment || _la==Space) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					}
					} 
				}
				this.state = 1110
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,105,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

}