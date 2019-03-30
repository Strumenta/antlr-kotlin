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

class CapnProtoParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(CapnProtoParser.DocumentContext::class,
                                                              CapnProtoParser.File_identifierContext::class,
                                                              CapnProtoParser.Using_importContext::class,
                                                              CapnProtoParser.NamespaceContext::class,
                                                              CapnProtoParser.Document_contentContext::class,
                                                              CapnProtoParser.Struct_defContext::class,
                                                              CapnProtoParser.Struct_contentContext::class,
                                                              CapnProtoParser.Interface_defContext::class,
                                                              CapnProtoParser.Interface_contentContext::class,
                                                              CapnProtoParser.Field_defContext::class,
                                                              CapnProtoParser.TypeContext::class,
                                                              CapnProtoParser.Inner_typeContext::class,
                                                              CapnProtoParser.Enum_defContext::class,
                                                              CapnProtoParser.Annotation_referenceContext::class,
                                                              CapnProtoParser.Enum_contentContext::class,
                                                              CapnProtoParser.Named_union_defContext::class,
                                                              CapnProtoParser.Unnamed_union_defContext::class,
                                                              CapnProtoParser.Union_contentContext::class,
                                                              CapnProtoParser.Group_defContext::class,
                                                              CapnProtoParser.Group_contentContext::class,
                                                              CapnProtoParser.Function_defContext::class,
                                                              CapnProtoParser.Generic_type_parametersContext::class,
                                                              CapnProtoParser.Function_parametersContext::class,
                                                              CapnProtoParser.Annotation_defContext::class,
                                                              CapnProtoParser.Annotation_parametersContext::class,
                                                              CapnProtoParser.Const_defContext::class,
                                                              CapnProtoParser.Const_valueContext::class,
                                                              CapnProtoParser.Literal_unionContext::class,
                                                              CapnProtoParser.Literal_listContext::class,
                                                              CapnProtoParser.Literal_bytesContext::class,
                                                              CapnProtoParser.Union_mappingContext::class,
                                                              CapnProtoParser.Inner_usingContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "CapnProto.g4"

    override val tokenNames: Array<String?>?
        get() = CapnProtoParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = CapnProtoParser.Companion.ruleNames
    override val atn: ATN
        get() = CapnProtoParser.Companion.ATN

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
        T__15(16),
        T__16(17),
        T__17(18),
        T__18(19),
        T__19(20),
        T__20(21),
        T__21(22),
        T__22(23),
        T__23(24),
        T__24(25),
        T__25(26),
        T__26(27),
        T__27(28),
        LOCATOR(29),
        TEXT(30),
        INTEGER(31),
        FLOAT(32),
        HEXADECIMAL(33),
        FILE_ID(34),
        BOOLEAN(35),
        VOID(36),
        NAME(37),
        COMMENT(38),
        WHITESPACE(39)
    }

    enum class Rules(val id: Int) {
        RULE_document(0),
        RULE_file_identifier(1),
        RULE_using_import(2),
        RULE_namespace(3),
        RULE_document_content(4),
        RULE_struct_def(5),
        RULE_struct_content(6),
        RULE_interface_def(7),
        RULE_interface_content(8),
        RULE_field_def(9),
        RULE_type(10),
        RULE_inner_type(11),
        RULE_enum_def(12),
        RULE_annotation_reference(13),
        RULE_enum_content(14),
        RULE_named_union_def(15),
        RULE_unnamed_union_def(16),
        RULE_union_content(17),
        RULE_group_def(18),
        RULE_group_content(19),
        RULE_function_def(20),
        RULE_generic_type_parameters(21),
        RULE_function_parameters(22),
        RULE_annotation_def(23),
        RULE_annotation_parameters(24),
        RULE_const_def(25),
        RULE_const_value(26),
        RULE_literal_union(27),
        RULE_literal_list(28),
        RULE_literal_bytes(29),
        RULE_union_mapping(30),
        RULE_inner_using(31)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("document", "file_identifier", "using_import", 
                                "namespace", "document_content", "struct_def", 
                                "struct_content", "interface_def", "interface_content", 
                                "field_def", "type", "inner_type", "enum_def", 
                                "annotation_reference", "enum_content", 
                                "named_union_def", "unnamed_union_def", 
                                "union_content", "group_def", "group_content", 
                                "function_def", "generic_type_parameters", 
                                "function_parameters", "annotation_def", 
                                "annotation_parameters", "const_def", "const_value", 
                                "literal_union", "literal_list", "literal_bytes", 
                                "union_mapping", "inner_using")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "';'", 
                                                           "'using'", "'='", 
                                                           "'import'", "'.'", 
                                                           "'$'", "'.namespace'", 
                                                           "'('", "')'", 
                                                           "'struct'", "'{'", 
                                                           "'}'", "'interface'", 
                                                           "'extends'", 
                                                           "':'", "','", 
                                                           "'enum'", "'.ann'", 
                                                           "':union'", "'union'", 
                                                           "':group'", "'->'", 
                                                           "'['", "']'", 
                                                           "'annotation'", 
                                                           "'const'", "'-'", 
                                                           "'0x'", null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           "'void'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, null, 
                                                            null, "LOCATOR", 
                                                            "TEXT", "INTEGER", 
                                                            "FLOAT", "HEXADECIMAL", 
                                                            "FILE_ID", "BOOLEAN", 
                                                            "VOID", "NAME", 
                                                            "COMMENT", "WHITESPACE")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0029\u01b1\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0003\u0002\u0003\u0002\u0007\u0002\u0045\u000a\u0002\u000c\u0002\u000e\u0002\u0048\u000b\u0002\u0003\u0002\u0005\u0002\u004b\u000a\u0002\u0003\u0002\u0007\u0002\u004e\u000a\u0002\u000c\u0002\u000e\u0002\u0051\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u005b\u000a\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0061\u000a\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u0073\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0078\u000a\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u007c\u000a\u0007\u000c\u0007\u000e\u0007\u007f\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u008d\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u0096\u000a\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u009a\u000a\u0009\u000c\u0009\u000e\u0009\u009d\u000b\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u00a8\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00b0\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0005\u000c\u00b6\u000a\u000c\u0003\u000c\u0003\u000c\u0005\u000c\u00ba\u000a\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00bf\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00c4\u000a\u000d\u0007\u000d\u00c6\u000a\u000d\u000c\u000d\u000e\u000d\u00c9\u000b\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00d0\u000a\u000e\u0003\u000e\u0003\u000e\u0007\u000e\u00d4\u000a\u000e\u000c\u000e\u000e\u000e\u00d7\u000b\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00de\u000a\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u00e7\u000a\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0005\u0011\u00ed\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u00f2\u000a\u0011\u000c\u0011\u000e\u0011\u00f5\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012\u00fc\u000a\u0012\u000c\u0012\u000e\u0012\u00ff\u000b\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0107\u000a\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014\u010d\u000a\u0014\u000c\u0014\u000e\u0014\u0110\u000b\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0117\u000a\u0015\u0003\u0016\u0003\u0016\u0005\u0016\u011b\u000a\u0016\u0003\u0016\u0005\u0016\u011e\u000a\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u0122\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u0127\u000a\u0016\u0005\u0016\u0129\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0007\u0017\u0131\u000a\u0017\u000c\u0017\u000e\u0017\u0134\u000b\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u013e\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0146\u000a\u0018\u0007\u0018\u0148\u000a\u0018\u000c\u0018\u000e\u0018\u014b\u000b\u0018\u0005\u0018\u014d\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u0154\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0005\u001c\u0167\u000a\u001c\u0003\u001c\u0005\u001c\u016a\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u016f\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u017a\u000a\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0007\u001d\u0184\u000a\u001d\u000c\u001d\u000e\u001d\u0187\u000b\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u018f\u000a\u001e\u000c\u001e\u000e\u001e\u0192\u000b\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u01a0\u000a\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0007\u0021\u01a6\u000a\u0021\u000c\u0021\u000e\u0021\u01a9\u000b\u0021\u0003\u0021\u0003\u0021\u0005\u0021\u01ad\u000a\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0002\u0002\u0022\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0002\u0002\u0002\u01dc\u0002\u0042\u0003\u0002\u0002\u0002\u0004\u0054\u0003\u0002\u0002\u0002\u0006\u0057\u0003\u0002\u0002\u0002\u0008\u0064\u0003\u0002\u0002\u0002\u000a\u0072\u0003\u0002\u0002\u0002\u000c\u0074\u0003\u0002\u0002\u0002\u000e\u008c\u0003\u0002\u0002\u0002\u0010\u008e\u0003\u0002\u0002\u0002\u0012\u00a7\u0003\u0002\u0002\u0002\u0014\u00a9\u0003\u0002\u0002\u0002\u0016\u00b3\u0003\u0002\u0002\u0002\u0018\u00bb\u0003\u0002\u0002\u0002\u001a\u00cc\u0003\u0002\u0002\u0002\u001c\u00da\u0003\u0002\u0002\u0002\u001e\u00e3\u0003\u0002\u0002\u0002\u0020\u00ea\u0003\u0002\u0002\u0002\u0022\u00f8\u0003\u0002\u0002\u0002\u0024\u0106\u0003\u0002\u0002\u0002\u0026\u0108\u0003\u0002\u0002\u0002\u0028\u0116\u0003\u0002\u0002\u0002\u002a\u0118\u0003\u0002\u0002\u0002\u002c\u012c\u0003\u0002\u0002\u0002\u002e\u0137\u0003\u0002\u0002\u0002\u0030\u0150\u0003\u0002\u0002\u0002\u0032\u0159\u0003\u0002\u0002\u0002\u0034\u015d\u0003\u0002\u0002\u0002\u0036\u0179\u0003\u0002\u0002\u0002\u0038\u017b\u0003\u0002\u0002\u0002\u003a\u018a\u0003\u0002\u0002\u0002\u003c\u0195\u0003\u0002\u0002\u0002\u003e\u019f\u0003\u0002\u0002\u0002\u0040\u01a1\u0003\u0002\u0002\u0002\u0042\u0046\u0005\u0004\u0003\u0002\u0043\u0045\u0005\u0006\u0004\u0002\u0044\u0043\u0003\u0002\u0002\u0002\u0045\u0048\u0003\u0002\u0002\u0002\u0046\u0044\u0003\u0002\u0002\u0002\u0046\u0047\u0003\u0002\u0002\u0002\u0047\u004a\u0003\u0002\u0002\u0002\u0048\u0046\u0003\u0002\u0002\u0002\u0049\u004b\u0005\u0008\u0005\u0002\u004a\u0049\u0003\u0002\u0002\u0002\u004a\u004b\u0003\u0002\u0002\u0002\u004b\u004f\u0003\u0002\u0002\u0002\u004c\u004e\u0005\u000a\u0006\u0002\u004d\u004c\u0003\u0002\u0002\u0002\u004e\u0051\u0003\u0002\u0002\u0002\u004f\u004d\u0003\u0002\u0002\u0002\u004f\u0050\u0003\u0002\u0002\u0002\u0050\u0052\u0003\u0002\u0002\u0002\u0051\u004f\u0003\u0002\u0002\u0002\u0052\u0053\u0007\u0002\u0002\u0003\u0053\u0003\u0003\u0002\u0002\u0002\u0054\u0055\u0007\u0024\u0002\u0002\u0055\u0056\u0007\u0003\u0002\u0002\u0056\u0005\u0003\u0002\u0002\u0002\u0057\u005a\u0007\u0004\u0002\u0002\u0058\u0059\u0007\u0027\u0002\u0002\u0059\u005b\u0007\u0005\u0002\u0002\u005a\u0058\u0003\u0002\u0002\u0002\u005a\u005b\u0003\u0002\u0002\u0002\u005b\u005c\u0003\u0002\u0002\u0002\u005c\u005d\u0007\u0006\u0002\u0002\u005d\u0060\u0007\u0020\u0002\u0002\u005e\u005f\u0007\u0007\u0002\u0002\u005f\u0061\u0007\u0027\u0002\u0002\u0060\u005e\u0003\u0002\u0002\u0002\u0060\u0061\u0003\u0002\u0002\u0002\u0061\u0062\u0003\u0002\u0002\u0002\u0062\u0063\u0007\u0003\u0002\u0002\u0063\u0007\u0003\u0002\u0002\u0002\u0064\u0065\u0007\u0008\u0002\u0002\u0065\u0066\u0007\u0027\u0002\u0002\u0066\u0067\u0007\u0009\u0002\u0002\u0067\u0068\u0007\u000a\u0002\u0002\u0068\u0069\u0007\u0020\u0002\u0002\u0069\u006a\u0007\u000b\u0002\u0002\u006a\u006b\u0007\u0003\u0002\u0002\u006b\u0009\u0003\u0002\u0002\u0002\u006c\u0073\u0005\u000c\u0007\u0002\u006d\u0073\u0005\u0010\u0009\u0002\u006e\u0073\u0005\u002a\u0016\u0002\u006f\u0073\u0005\u0030\u0019\u0002\u0070\u0073\u0005\u0034\u001b\u0002\u0071\u0073\u0005\u001a\u000e\u0002\u0072\u006c\u0003\u0002\u0002\u0002\u0072\u006d\u0003\u0002\u0002\u0002\u0072\u006e\u0003\u0002\u0002\u0002\u0072\u006f\u0003\u0002\u0002\u0002\u0072\u0070\u0003\u0002\u0002\u0002\u0072\u0071\u0003\u0002\u0002\u0002\u0073\u000b\u0003\u0002\u0002\u0002\u0074\u0075\u0007\u000c\u0002\u0002\u0075\u0077\u0005\u0016\u000c\u0002\u0076\u0078\u0005\u001c\u000f\u0002\u0077\u0076\u0003\u0002\u0002\u0002\u0077\u0078\u0003\u0002\u0002\u0002\u0078\u0079\u0003\u0002\u0002\u0002\u0079\u007d\u0007\u000d\u0002\u0002\u007a\u007c\u0005\u000e\u0008\u0002\u007b\u007a\u0003\u0002\u0002\u0002\u007c\u007f\u0003\u0002\u0002\u0002\u007d\u007b\u0003\u0002\u0002\u0002\u007d\u007e\u0003\u0002\u0002\u0002\u007e\u0080\u0003\u0002\u0002\u0002\u007f\u007d\u0003\u0002\u0002\u0002\u0080\u0081\u0007\u000e\u0002\u0002\u0081\u000d\u0003\u0002\u0002\u0002\u0082\u008d\u0005\u0014\u000b\u0002\u0083\u008d\u0005\u001a\u000e\u0002\u0084\u008d\u0005\u0020\u0011\u0002\u0085\u008d\u0005\u0022\u0012\u0002\u0086\u008d\u0005\u0010\u0009\u0002\u0087\u008d\u0005\u0030\u0019\u0002\u0088\u008d\u0005\u000c\u0007\u0002\u0089\u008d\u0005\u0026\u0014\u0002\u008a\u008d\u0005\u0034\u001b\u0002\u008b\u008d\u0005\u0040\u0021\u0002\u008c\u0082\u0003\u0002\u0002\u0002\u008c\u0083\u0003\u0002\u0002\u0002\u008c\u0084\u0003\u0002\u0002\u0002\u008c\u0085\u0003\u0002\u0002\u0002\u008c\u0086\u0003\u0002\u0002\u0002\u008c\u0087\u0003\u0002\u0002\u0002\u008c\u0088\u0003\u0002\u0002\u0002\u008c\u0089\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008c\u008b\u0003\u0002\u0002\u0002\u008d\u000f\u0003\u0002\u0002\u0002\u008e\u008f\u0007\u000f\u0002\u0002\u008f\u0095\u0005\u0016\u000c\u0002\u0090\u0091\u0007\u0010\u0002\u0002\u0091\u0092\u0007\u000a\u0002\u0002\u0092\u0093\u0005\u0016\u000c\u0002\u0093\u0094\u0007\u000b\u0002\u0002\u0094\u0096\u0003\u0002\u0002\u0002\u0095\u0090\u0003\u0002\u0002\u0002\u0095\u0096\u0003\u0002\u0002\u0002\u0096\u0097\u0003\u0002\u0002\u0002\u0097\u009b\u0007\u000d\u0002\u0002\u0098\u009a\u0005\u0012\u000a\u0002\u0099\u0098\u0003\u0002\u0002\u0002\u009a\u009d\u0003\u0002\u0002\u0002\u009b\u0099\u0003\u0002\u0002\u0002\u009b\u009c\u0003\u0002\u0002\u0002\u009c\u009e\u0003\u0002\u0002\u0002\u009d\u009b\u0003\u0002\u0002\u0002\u009e\u009f\u0007\u000e\u0002\u0002\u009f\u0011\u0003\u0002\u0002\u0002\u00a0\u00a8\u0005\u0014\u000b\u0002\u00a1\u00a8\u0005\u001a\u000e\u0002\u00a2\u00a8\u0005\u0020\u0011\u0002\u00a3\u00a8\u0005\u0022\u0012\u0002\u00a4\u00a8\u0005\u0010\u0009\u0002\u00a5\u00a8\u0005\u000c\u0007\u0002\u00a6\u00a8\u0005\u002a\u0016\u0002\u00a7\u00a0\u0003\u0002\u0002\u0002\u00a7\u00a1\u0003\u0002\u0002\u0002\u00a7\u00a2\u0003\u0002\u0002\u0002\u00a7\u00a3\u0003\u0002\u0002\u0002\u00a7\u00a4\u0003\u0002\u0002\u0002\u00a7\u00a5\u0003\u0002\u0002\u0002\u00a7\u00a6\u0003\u0002\u0002\u0002\u00a8\u0013\u0003\u0002\u0002\u0002\u00a9\u00aa\u0007\u0027\u0002\u0002\u00aa\u00ab\u0007\u001f\u0002\u0002\u00ab\u00ac\u0007\u0011\u0002\u0002\u00ac\u00af\u0005\u0016\u000c\u0002\u00ad\u00ae\u0007\u0005\u0002\u0002\u00ae\u00b0\u0005\u0036\u001c\u0002\u00af\u00ad\u0003\u0002\u0002\u0002\u00af\u00b0\u0003\u0002\u0002\u0002\u00b0\u00b1\u0003\u0002\u0002\u0002\u00b1\u00b2\u0007\u0003\u0002\u0002\u00b2\u0015\u0003\u0002\u0002\u0002\u00b3\u00b5\u0007\u0027\u0002\u0002\u00b4\u00b6\u0005\u0018\u000d\u0002\u00b5\u00b4\u0003\u0002\u0002\u0002\u00b5\u00b6\u0003\u0002\u0002\u0002\u00b6\u00b9\u0003\u0002\u0002\u0002\u00b7\u00b8\u0007\u0007\u0002\u0002\u00b8\u00ba\u0005\u0016\u000c\u0002\u00b9\u00b7\u0003\u0002\u0002\u0002\u00b9\u00ba\u0003\u0002\u0002\u0002\u00ba\u0017\u0003\u0002\u0002\u0002\u00bb\u00bc\u0007\u000a\u0002\u0002\u00bc\u00be\u0005\u0016\u000c\u0002\u00bd\u00bf\u0005\u0018\u000d\u0002\u00be\u00bd\u0003\u0002\u0002\u0002\u00be\u00bf\u0003\u0002\u0002\u0002\u00bf\u00c7\u0003\u0002\u0002\u0002\u00c0\u00c1\u0007\u0012\u0002\u0002\u00c1\u00c3\u0005\u0016\u000c\u0002\u00c2\u00c4\u0005\u0018\u000d\u0002\u00c3\u00c2\u0003\u0002\u0002\u0002\u00c3\u00c4\u0003\u0002\u0002\u0002\u00c4\u00c6\u0003\u0002\u0002\u0002\u00c5\u00c0\u0003\u0002\u0002\u0002\u00c6\u00c9\u0003\u0002\u0002\u0002\u00c7\u00c5\u0003\u0002\u0002\u0002\u00c7\u00c8\u0003\u0002\u0002\u0002\u00c8\u00ca\u0003\u0002\u0002\u0002\u00c9\u00c7\u0003\u0002\u0002\u0002\u00ca\u00cb\u0007\u000b\u0002\u0002\u00cb\u0019\u0003\u0002\u0002\u0002\u00cc\u00cd\u0007\u0013\u0002\u0002\u00cd\u00cf\u0007\u0027\u0002\u0002\u00ce\u00d0\u0005\u001c\u000f\u0002\u00cf\u00ce\u0003\u0002\u0002\u0002\u00cf\u00d0\u0003\u0002\u0002\u0002\u00d0\u00d1\u0003\u0002\u0002\u0002\u00d1\u00d5\u0007\u000d\u0002\u0002\u00d2\u00d4\u0005\u001e\u0010\u0002\u00d3\u00d2\u0003\u0002\u0002\u0002\u00d4\u00d7\u0003\u0002\u0002\u0002\u00d5\u00d3\u0003\u0002\u0002\u0002\u00d5\u00d6\u0003\u0002\u0002\u0002\u00d6\u00d8\u0003\u0002\u0002\u0002\u00d7\u00d5\u0003\u0002\u0002\u0002\u00d8\u00d9\u0007\u000e\u0002\u0002\u00d9\u001b\u0003\u0002\u0002\u0002\u00da\u00db\u0007\u0008\u0002\u0002\u00db\u00dd\u0005\u0016\u000c\u0002\u00dc\u00de\u0007\u0014\u0002\u0002\u00dd\u00dc\u0003\u0002\u0002\u0002\u00dd\u00de\u0003\u0002\u0002\u0002\u00de\u00df\u0003\u0002\u0002\u0002\u00df\u00e0\u0007\u000a\u0002\u0002\u00e0\u00e1\u0007\u0020\u0002\u0002\u00e1\u00e2\u0007\u000b\u0002\u0002\u00e2\u001d\u0003\u0002\u0002\u0002\u00e3\u00e4\u0007\u0027\u0002\u0002\u00e4\u00e6\u0007\u001f\u0002\u0002\u00e5\u00e7\u0005\u001c\u000f\u0002\u00e6\u00e5\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e8\u0003\u0002\u0002\u0002\u00e8\u00e9\u0007\u0003\u0002\u0002\u00e9\u001f\u0003\u0002\u0002\u0002\u00ea\u00ec\u0007\u0027\u0002\u0002\u00eb\u00ed\u0007\u001f\u0002\u0002\u00ec\u00eb\u0003\u0002\u0002\u0002\u00ec\u00ed\u0003\u0002\u0002\u0002\u00ed\u00ee\u0003\u0002\u0002\u0002\u00ee\u00ef\u0007\u0015\u0002\u0002\u00ef\u00f3\u0007\u000d\u0002\u0002\u00f0\u00f2\u0005\u0024\u0013\u0002\u00f1\u00f0\u0003\u0002\u0002\u0002\u00f2\u00f5\u0003\u0002\u0002\u0002\u00f3\u00f1\u0003\u0002\u0002\u0002\u00f3\u00f4\u0003\u0002\u0002\u0002\u00f4\u00f6\u0003\u0002\u0002\u0002\u00f5\u00f3\u0003\u0002\u0002\u0002\u00f6\u00f7\u0007\u000e\u0002\u0002\u00f7\u0021\u0003\u0002\u0002\u0002\u00f8\u00f9\u0007\u0016\u0002\u0002\u00f9\u00fd\u0007\u000d\u0002\u0002\u00fa\u00fc\u0005\u0024\u0013\u0002\u00fb\u00fa\u0003\u0002\u0002\u0002\u00fc\u00ff\u0003\u0002\u0002\u0002\u00fd\u00fb\u0003\u0002\u0002\u0002\u00fd\u00fe\u0003\u0002\u0002\u0002\u00fe\u0100\u0003\u0002\u0002\u0002\u00ff\u00fd\u0003\u0002\u0002\u0002\u0100\u0101\u0007\u000e\u0002\u0002\u0101\u0023\u0003\u0002\u0002\u0002\u0102\u0107\u0005\u0014\u000b\u0002\u0103\u0107\u0005\u0026\u0014\u0002\u0104\u0107\u0005\u0022\u0012\u0002\u0105\u0107\u0005\u0020\u0011\u0002\u0106\u0102\u0003\u0002\u0002\u0002\u0106\u0103\u0003\u0002\u0002\u0002\u0106\u0104\u0003\u0002\u0002\u0002\u0106\u0105\u0003\u0002\u0002\u0002\u0107\u0025\u0003\u0002\u0002\u0002\u0108\u0109\u0007\u0027\u0002\u0002\u0109\u010a\u0007\u0017\u0002\u0002\u010a\u010e\u0007\u000d\u0002\u0002\u010b\u010d\u0005\u0028\u0015\u0002\u010c\u010b\u0003\u0002\u0002\u0002\u010d\u0110\u0003\u0002\u0002\u0002\u010e\u010c\u0003\u0002\u0002\u0002\u010e\u010f\u0003\u0002\u0002\u0002\u010f\u0111\u0003\u0002\u0002\u0002\u0110\u010e\u0003\u0002\u0002\u0002\u0111\u0112\u0007\u000e\u0002\u0002\u0112\u0027\u0003\u0002\u0002\u0002\u0113\u0117\u0005\u0014\u000b\u0002\u0114\u0117\u0005\u0022\u0012\u0002\u0115\u0117\u0005\u0020\u0011\u0002\u0116\u0113\u0003\u0002\u0002\u0002\u0116\u0114\u0003\u0002\u0002\u0002\u0116\u0115\u0003\u0002\u0002\u0002\u0117\u0029\u0003\u0002\u0002\u0002\u0118\u011a\u0007\u0027\u0002\u0002\u0119\u011b\u0007\u001f\u0002\u0002\u011a\u0119\u0003\u0002\u0002\u0002\u011a\u011b\u0003\u0002\u0002\u0002\u011b\u011d\u0003\u0002\u0002\u0002\u011c\u011e\u0005\u002c\u0017\u0002\u011d\u011c\u0003\u0002\u0002\u0002\u011d\u011e\u0003\u0002\u0002\u0002\u011e\u0121\u0003\u0002\u0002\u0002\u011f\u0122\u0005\u002e\u0018\u0002\u0120\u0122\u0005\u0016\u000c\u0002\u0121\u011f\u0003\u0002\u0002\u0002\u0121\u0120\u0003\u0002\u0002\u0002\u0122\u0128\u0003\u0002\u0002\u0002\u0123\u0126\u0007\u0018\u0002\u0002\u0124\u0127\u0005\u002e\u0018\u0002\u0125\u0127\u0005\u0016\u000c\u0002\u0126\u0124\u0003\u0002\u0002\u0002\u0126\u0125\u0003\u0002\u0002\u0002\u0127\u0129\u0003\u0002\u0002\u0002\u0128\u0123\u0003\u0002\u0002\u0002\u0128\u0129\u0003\u0002\u0002\u0002\u0129\u012a\u0003\u0002\u0002\u0002\u012a\u012b\u0007\u0003\u0002\u0002\u012b\u002b\u0003\u0002\u0002\u0002\u012c\u012d\u0007\u0019\u0002\u0002\u012d\u0132\u0007\u0027\u0002\u0002\u012e\u012f\u0007\u0012\u0002\u0002\u012f\u0131\u0007\u0027\u0002\u0002\u0130\u012e\u0003\u0002\u0002\u0002\u0131\u0134\u0003\u0002\u0002\u0002\u0132\u0130\u0003\u0002\u0002\u0002\u0132\u0133\u0003\u0002\u0002\u0002\u0133\u0135\u0003\u0002\u0002\u0002\u0134\u0132\u0003\u0002\u0002\u0002\u0135\u0136\u0007\u001a\u0002\u0002\u0136\u002d\u0003\u0002\u0002\u0002\u0137\u014c\u0007\u000a\u0002\u0002\u0138\u0139\u0007\u0027\u0002\u0002\u0139\u013a\u0007\u0011\u0002\u0002\u013a\u013d\u0005\u0016\u000c\u0002\u013b\u013c\u0007\u0005\u0002\u0002\u013c\u013e\u0005\u0036\u001c\u0002\u013d\u013b\u0003\u0002\u0002\u0002\u013d\u013e\u0003\u0002\u0002\u0002\u013e\u0149\u0003\u0002\u0002\u0002\u013f\u0140\u0007\u0012\u0002\u0002\u0140\u0141\u0007\u0027\u0002\u0002\u0141\u0142\u0007\u0011\u0002\u0002\u0142\u0145\u0005\u0016\u000c\u0002\u0143\u0144\u0007\u0005\u0002\u0002\u0144\u0146\u0005\u0036\u001c\u0002\u0145\u0143\u0003\u0002\u0002\u0002\u0145\u0146\u0003\u0002\u0002\u0002\u0146\u0148\u0003\u0002\u0002\u0002\u0147\u013f\u0003\u0002\u0002\u0002\u0148\u014b\u0003\u0002\u0002\u0002\u0149\u0147\u0003\u0002\u0002\u0002\u0149\u014a\u0003\u0002\u0002\u0002\u014a\u014d\u0003\u0002\u0002\u0002\u014b\u0149\u0003\u0002\u0002\u0002\u014c\u0138\u0003\u0002\u0002\u0002\u014c\u014d\u0003\u0002\u0002\u0002\u014d\u014e\u0003\u0002\u0002\u0002\u014e\u014f\u0007\u000b\u0002\u0002\u014f\u002f\u0003\u0002\u0002\u0002\u0150\u0151\u0007\u001b\u0002\u0002\u0151\u0153\u0005\u0016\u000c\u0002\u0152\u0154\u0005\u0032\u001a\u0002\u0153\u0152\u0003\u0002\u0002\u0002\u0153\u0154\u0003\u0002\u0002\u0002\u0154\u0155\u0003\u0002\u0002\u0002\u0155\u0156\u0007\u0011\u0002\u0002\u0156\u0157\u0005\u0016\u000c\u0002\u0157\u0158\u0007\u0003\u0002\u0002\u0158\u0031\u0003\u0002\u0002\u0002\u0159\u015a\u0007\u000a\u0002\u0002\u015a\u015b\u0007\u000c\u0002\u0002\u015b\u015c\u0007\u000b\u0002\u0002\u015c\u0033\u0003\u0002\u0002\u0002\u015d\u015e\u0007\u001c\u0002\u0002\u015e\u015f\u0007\u0027\u0002\u0002\u015f\u0160\u0007\u0011\u0002\u0002\u0160\u0161\u0005\u0016\u000c\u0002\u0161\u0162\u0007\u0005\u0002\u0002\u0162\u0163\u0005\u0036\u001c\u0002\u0163\u0164\u0007\u0003\u0002\u0002\u0164\u0035\u0003\u0002\u0002\u0002\u0165\u0167\u0007\u001d\u0002\u0002\u0166\u0165\u0003\u0002\u0002\u0002\u0166\u0167\u0003\u0002\u0002\u0002\u0167\u0169\u0003\u0002\u0002\u0002\u0168\u016a\u0007\u0007\u0002\u0002\u0169\u0168\u0003\u0002\u0002\u0002\u0169\u016a\u0003\u0002\u0002\u0002\u016a\u016b\u0003\u0002\u0002\u0002\u016b\u016e\u0007\u0027\u0002\u0002\u016c\u016d\u0007\u0007\u0002\u0002\u016d\u016f\u0007\u0027\u0002\u0002\u016e\u016c\u0003\u0002\u0002\u0002\u016e\u016f\u0003\u0002\u0002\u0002\u016f\u017a\u0003\u0002\u0002\u0002\u0170\u017a\u0007\u0021\u0002\u0002\u0171\u017a\u0007\u0022\u0002\u0002\u0172\u017a\u0007\u0020\u0002\u0002\u0173\u017a\u0007\u0025\u0002\u0002\u0174\u017a\u0007\u0023\u0002\u0002\u0175\u017a\u0007\u0026\u0002\u0002\u0176\u017a\u0005\u003a\u001e\u0002\u0177\u017a\u0005\u0038\u001d\u0002\u0178\u017a\u0005\u003c\u001f\u0002\u0179\u0166\u0003\u0002\u0002\u0002\u0179\u0170\u0003\u0002\u0002\u0002\u0179\u0171\u0003\u0002\u0002\u0002\u0179\u0172\u0003\u0002\u0002\u0002\u0179\u0173\u0003\u0002\u0002\u0002\u0179\u0174\u0003\u0002\u0002\u0002\u0179\u0175\u0003\u0002\u0002\u0002\u0179\u0176\u0003\u0002\u0002\u0002\u0179\u0177\u0003\u0002\u0002\u0002\u0179\u0178\u0003\u0002\u0002\u0002\u017a\u0037\u0003\u0002\u0002\u0002\u017b\u017c\u0007\u000a\u0002\u0002\u017c\u017d\u0007\u0027\u0002\u0002\u017d\u017e\u0007\u0005\u0002\u0002\u017e\u0185\u0005\u003e\u0020\u0002\u017f\u0180\u0007\u0012\u0002\u0002\u0180\u0181\u0007\u0027\u0002\u0002\u0181\u0182\u0007\u0005\u0002\u0002\u0182\u0184\u0005\u003e\u0020\u0002\u0183\u017f\u0003\u0002\u0002\u0002\u0184\u0187\u0003\u0002\u0002\u0002\u0185\u0183\u0003\u0002\u0002\u0002\u0185\u0186\u0003\u0002\u0002\u0002\u0186\u0188\u0003\u0002\u0002\u0002\u0187\u0185\u0003\u0002\u0002\u0002\u0188\u0189\u0007\u000b\u0002\u0002\u0189\u0039\u0003\u0002\u0002\u0002\u018a\u018b\u0007\u0019\u0002\u0002\u018b\u0190\u0005\u0036\u001c\u0002\u018c\u018d\u0007\u0012\u0002\u0002\u018d\u018f\u0005\u0036\u001c\u0002\u018e\u018c\u0003\u0002\u0002\u0002\u018f\u0192\u0003\u0002\u0002\u0002\u0190\u018e\u0003\u0002\u0002\u0002\u0190\u0191\u0003\u0002\u0002\u0002\u0191\u0193\u0003\u0002\u0002\u0002\u0192\u0190\u0003\u0002\u0002\u0002\u0193\u0194\u0007\u001a\u0002\u0002\u0194\u003b\u0003\u0002\u0002\u0002\u0195\u0196\u0007\u001e\u0002\u0002\u0196\u0197\u0007\u0020\u0002\u0002\u0197\u003d\u0003\u0002\u0002\u0002\u0198\u0199\u0007\u000a\u0002\u0002\u0199\u019a\u0007\u0027\u0002\u0002\u019a\u019b\u0007\u0005\u0002\u0002\u019b\u019c\u0005\u0036\u001c\u0002\u019c\u019d\u0007\u000b\u0002\u0002\u019d\u01a0\u0003\u0002\u0002\u0002\u019e\u01a0\u0005\u0036\u001c\u0002\u019f\u0198\u0003\u0002\u0002\u0002\u019f\u019e\u0003\u0002\u0002\u0002\u01a0\u003f\u0003\u0002\u0002\u0002\u01a1\u01a2\u0007\u0004\u0002\u0002\u01a2\u01a7\u0007\u0027\u0002\u0002\u01a3\u01a4\u0007\u0007\u0002\u0002\u01a4\u01a6\u0007\u0027\u0002\u0002\u01a5\u01a3\u0003\u0002\u0002\u0002\u01a6\u01a9\u0003\u0002\u0002\u0002\u01a7\u01a5\u0003\u0002\u0002\u0002\u01a7\u01a8\u0003\u0002\u0002\u0002\u01a8\u01ac\u0003\u0002\u0002\u0002\u01a9\u01a7\u0003\u0002\u0002\u0002\u01aa\u01ab\u0007\u0005\u0002\u0002\u01ab\u01ad\u0005\u0016\u000c\u0002\u01ac\u01aa\u0003\u0002\u0002\u0002\u01ac\u01ad\u0003\u0002\u0002\u0002\u01ad\u01ae\u0003\u0002\u0002\u0002\u01ae\u01af\u0007\u0003\u0002\u0002\u01af\u0041\u0003\u0002\u0002\u0002\u0032\u0046\u004a\u004f\u005a\u0060\u0072\u0077\u007d\u008c\u0095\u009b\u00a7\u00af\u00b5\u00b9\u00be\u00c3\u00c7\u00cf\u00d5\u00dd\u00e6\u00ec\u00f3\u00fd\u0106\u010e\u0116\u011a\u011d\u0121\u0126\u0128\u0132\u013d\u0145\u0149\u014c\u0153\u0166\u0169\u016e\u0179\u0185\u0190\u019f\u01a7\u01ac"

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
    private val T__15 = Tokens.T__15.id
    private val T__16 = Tokens.T__16.id
    private val T__17 = Tokens.T__17.id
    private val T__18 = Tokens.T__18.id
    private val T__19 = Tokens.T__19.id
    private val T__20 = Tokens.T__20.id
    private val T__21 = Tokens.T__21.id
    private val T__22 = Tokens.T__22.id
    private val T__23 = Tokens.T__23.id
    private val T__24 = Tokens.T__24.id
    private val T__25 = Tokens.T__25.id
    private val T__26 = Tokens.T__26.id
    private val T__27 = Tokens.T__27.id
    private val LOCATOR = Tokens.LOCATOR.id
    private val TEXT = Tokens.TEXT.id
    private val INTEGER = Tokens.INTEGER.id
    private val FLOAT = Tokens.FLOAT.id
    private val HEXADECIMAL = Tokens.HEXADECIMAL.id
    private val FILE_ID = Tokens.FILE_ID.id
    private val BOOLEAN = Tokens.BOOLEAN.id
    private val VOID = Tokens.VOID.id
    private val NAME = Tokens.NAME.id
    private val COMMENT = Tokens.COMMENT.id
    private val WHITESPACE = Tokens.WHITESPACE.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class DocumentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_document.id
	        set(value) { throw RuntimeException() }
		fun findFile_identifier() : File_identifierContext? = getRuleContext(solver.getType("File_identifierContext"),0)
		fun EOF() : TerminalNode? = getToken(CapnProtoParser.Tokens.EOF.id, 0)
		fun findUsing_import() : List<Using_importContext> = getRuleContexts(solver.getType("Using_importContext"))
		fun findUsing_import(i: Int) : Using_importContext? = getRuleContext(solver.getType("Using_importContext"),i)
		fun findNamespace() : NamespaceContext? = getRuleContext(solver.getType("NamespaceContext"),0)
		fun findDocument_content() : List<Document_contentContext> = getRuleContexts(solver.getType("Document_contentContext"))
		fun findDocument_content(i: Int) : Document_contentContext? = getRuleContext(solver.getType("Document_contentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterDocument(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitDocument(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitDocument(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  document() : DocumentContext {
		var _localctx : DocumentContext = DocumentContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_document.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 64
			file_identifier()
			this.state = 68
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__1) {
				if (true){
				if (true){
				this.state = 65
				using_import()
				}
				}
				this.state = 70
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 72
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__5) {
				if (true){
				this.state = 71
				namespace()
				}
			}

			this.state = 77
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__9) or (1L shl T__12) or (1L shl T__16) or (1L shl T__24) or (1L shl T__25) or (1L shl NAME))) != 0L)) {
				if (true){
				if (true){
				this.state = 74
				document_content()
				}
				}
				this.state = 79
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 80
			match(EOF) as Token
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

	open class File_identifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_file_identifier.id
	        set(value) { throw RuntimeException() }
		fun FILE_ID() : TerminalNode? = getToken(CapnProtoParser.Tokens.FILE_ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterFile_identifier(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitFile_identifier(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitFile_identifier(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  file_identifier() : File_identifierContext {
		var _localctx : File_identifierContext = File_identifierContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_file_identifier.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 82
			match(FILE_ID) as Token
			this.state = 83
			match(T__0) as Token
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

	open class Using_importContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_using_import.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(CapnProtoParser.Tokens.TEXT.id, 0)
		fun NAME() : List<TerminalNode> = getTokens(CapnProtoParser.Tokens.NAME.id)
		fun NAME(i: Int) : TerminalNode = getToken(CapnProtoParser.Tokens.NAME.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterUsing_import(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitUsing_import(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitUsing_import(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  using_import() : Using_importContext {
		var _localctx : Using_importContext = Using_importContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_using_import.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 85
			match(T__1) as Token
			this.state = 88
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAME) {
				if (true){
				this.state = 86
				match(NAME) as Token
				this.state = 87
				match(T__2) as Token
				}
			}

			this.state = 90
			match(T__3) as Token
			this.state = 91
			match(TEXT) as Token
			this.state = 94
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__4) {
				if (true){
				this.state = 92
				match(T__4) as Token
				this.state = 93
				match(NAME) as Token
				}
			}

			this.state = 96
			match(T__0) as Token
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
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun TEXT() : TerminalNode? = getToken(CapnProtoParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterNamespace(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitNamespace(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitNamespace(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namespace() : NamespaceContext {
		var _localctx : NamespaceContext = NamespaceContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_namespace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 98
			match(T__5) as Token
			this.state = 99
			match(NAME) as Token
			this.state = 100
			match(T__6) as Token
			this.state = 101
			match(T__7) as Token
			this.state = 102
			match(TEXT) as Token
			this.state = 103
			match(T__8) as Token
			this.state = 104
			match(T__0) as Token
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

	open class Document_contentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_document_content.id
	        set(value) { throw RuntimeException() }
		fun findStruct_def() : Struct_defContext? = getRuleContext(solver.getType("Struct_defContext"),0)
		fun findInterface_def() : Interface_defContext? = getRuleContext(solver.getType("Interface_defContext"),0)
		fun findFunction_def() : Function_defContext? = getRuleContext(solver.getType("Function_defContext"),0)
		fun findAnnotation_def() : Annotation_defContext? = getRuleContext(solver.getType("Annotation_defContext"),0)
		fun findConst_def() : Const_defContext? = getRuleContext(solver.getType("Const_defContext"),0)
		fun findEnum_def() : Enum_defContext? = getRuleContext(solver.getType("Enum_defContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterDocument_content(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitDocument_content(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitDocument_content(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  document_content() : Document_contentContext {
		var _localctx : Document_contentContext = Document_contentContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_document_content.id)
		try {
			this.state = 112
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__9  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 106
			struct_def()
			}}
			T__12  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 107
			interface_def()
			}}
			NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 108
			function_def()
			}}
			T__24  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 109
			annotation_def()
			}}
			T__25  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 110
			const_def()
			}}
			T__16  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 111
			enum_def()
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

	open class Struct_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_struct_def.id
	        set(value) { throw RuntimeException() }
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun findAnnotation_reference() : Annotation_referenceContext? = getRuleContext(solver.getType("Annotation_referenceContext"),0)
		fun findStruct_content() : List<Struct_contentContext> = getRuleContexts(solver.getType("Struct_contentContext"))
		fun findStruct_content(i: Int) : Struct_contentContext? = getRuleContext(solver.getType("Struct_contentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterStruct_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitStruct_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitStruct_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  struct_def() : Struct_defContext {
		var _localctx : Struct_defContext = Struct_defContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_struct_def.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 114
			match(T__9) as Token
			this.state = 115
			type()
			this.state = 117
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__5) {
				if (true){
				this.state = 116
				annotation_reference()
				}
			}

			this.state = 119
			match(T__10) as Token
			this.state = 123
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__1) or (1L shl T__9) or (1L shl T__12) or (1L shl T__16) or (1L shl T__19) or (1L shl T__24) or (1L shl T__25) or (1L shl NAME))) != 0L)) {
				if (true){
				if (true){
				this.state = 120
				struct_content()
				}
				}
				this.state = 125
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 126
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

	open class Struct_contentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_struct_content.id
	        set(value) { throw RuntimeException() }
		fun findField_def() : Field_defContext? = getRuleContext(solver.getType("Field_defContext"),0)
		fun findEnum_def() : Enum_defContext? = getRuleContext(solver.getType("Enum_defContext"),0)
		fun findNamed_union_def() : Named_union_defContext? = getRuleContext(solver.getType("Named_union_defContext"),0)
		fun findUnnamed_union_def() : Unnamed_union_defContext? = getRuleContext(solver.getType("Unnamed_union_defContext"),0)
		fun findInterface_def() : Interface_defContext? = getRuleContext(solver.getType("Interface_defContext"),0)
		fun findAnnotation_def() : Annotation_defContext? = getRuleContext(solver.getType("Annotation_defContext"),0)
		fun findStruct_def() : Struct_defContext? = getRuleContext(solver.getType("Struct_defContext"),0)
		fun findGroup_def() : Group_defContext? = getRuleContext(solver.getType("Group_defContext"),0)
		fun findConst_def() : Const_defContext? = getRuleContext(solver.getType("Const_defContext"),0)
		fun findInner_using() : Inner_usingContext? = getRuleContext(solver.getType("Inner_usingContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterStruct_content(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitStruct_content(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitStruct_content(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  struct_content() : Struct_contentContext {
		var _localctx : Struct_contentContext = Struct_contentContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_struct_content.id)
		try {
			this.state = 138
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 128
			field_def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 129
			enum_def()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 130
			named_union_def()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 131
			unnamed_union_def()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 132
			interface_def()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 133
			annotation_def()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 134
			struct_def()
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 135
			group_def()
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 136
			const_def()
			}}
			10 -> {
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 137
			inner_using()
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

	open class Interface_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_interface_def.id
	        set(value) { throw RuntimeException() }
		fun findType() : List<TypeContext> = getRuleContexts(solver.getType("TypeContext"))
		fun findType(i: Int) : TypeContext? = getRuleContext(solver.getType("TypeContext"),i)
		fun findInterface_content() : List<Interface_contentContext> = getRuleContexts(solver.getType("Interface_contentContext"))
		fun findInterface_content(i: Int) : Interface_contentContext? = getRuleContext(solver.getType("Interface_contentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterInterface_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitInterface_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitInterface_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  interface_def() : Interface_defContext {
		var _localctx : Interface_defContext = Interface_defContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_interface_def.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 140
			match(T__12) as Token
			this.state = 141
			type()
			this.state = 147
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__13) {
				if (true){
				this.state = 142
				match(T__13) as Token
				this.state = 143
				match(T__7) as Token
				this.state = 144
				type()
				this.state = 145
				match(T__8) as Token
				}
			}

			this.state = 149
			match(T__10) as Token
			this.state = 153
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__9) or (1L shl T__12) or (1L shl T__16) or (1L shl T__19) or (1L shl NAME))) != 0L)) {
				if (true){
				if (true){
				this.state = 150
				interface_content()
				}
				}
				this.state = 155
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 156
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

	open class Interface_contentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_interface_content.id
	        set(value) { throw RuntimeException() }
		fun findField_def() : Field_defContext? = getRuleContext(solver.getType("Field_defContext"),0)
		fun findEnum_def() : Enum_defContext? = getRuleContext(solver.getType("Enum_defContext"),0)
		fun findNamed_union_def() : Named_union_defContext? = getRuleContext(solver.getType("Named_union_defContext"),0)
		fun findUnnamed_union_def() : Unnamed_union_defContext? = getRuleContext(solver.getType("Unnamed_union_defContext"),0)
		fun findInterface_def() : Interface_defContext? = getRuleContext(solver.getType("Interface_defContext"),0)
		fun findStruct_def() : Struct_defContext? = getRuleContext(solver.getType("Struct_defContext"),0)
		fun findFunction_def() : Function_defContext? = getRuleContext(solver.getType("Function_defContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterInterface_content(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitInterface_content(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitInterface_content(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  interface_content() : Interface_contentContext {
		var _localctx : Interface_contentContext = Interface_contentContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_interface_content.id)
		try {
			this.state = 165
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,11,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 158
			field_def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 159
			enum_def()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 160
			named_union_def()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 161
			unnamed_union_def()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 162
			interface_def()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 163
			struct_def()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 164
			function_def()
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

	open class Field_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_field_def.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun LOCATOR() : TerminalNode? = getToken(CapnProtoParser.Tokens.LOCATOR.id, 0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun findConst_value() : Const_valueContext? = getRuleContext(solver.getType("Const_valueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterField_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitField_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitField_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  field_def() : Field_defContext {
		var _localctx : Field_defContext = Field_defContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_field_def.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 167
			match(NAME) as Token
			this.state = 168
			match(LOCATOR) as Token
			this.state = 169
			match(T__14) as Token
			this.state = 170
			type()
			this.state = 173
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__2) {
				if (true){
				this.state = 171
				match(T__2) as Token
				this.state = 172
				const_value()
				}
			}

			this.state = 175
			match(T__0) as Token
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

	open class TypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun findInner_type() : Inner_typeContext? = getRuleContext(solver.getType("Inner_typeContext"),0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  type() : TypeContext {
		var _localctx : TypeContext = TypeContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_type.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 177
			match(NAME) as Token
			this.state = 179
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,13,context) ) {
			1   -> if (true){
			this.state = 178
			inner_type()
			}
			}
			this.state = 183
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__4) {
				if (true){
				this.state = 181
				match(T__4) as Token
				this.state = 182
				type()
				}
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

	open class Inner_typeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inner_type.id
	        set(value) { throw RuntimeException() }
		fun findType() : List<TypeContext> = getRuleContexts(solver.getType("TypeContext"))
		fun findType(i: Int) : TypeContext? = getRuleContext(solver.getType("TypeContext"),i)
		fun findInner_type() : List<Inner_typeContext> = getRuleContexts(solver.getType("Inner_typeContext"))
		fun findInner_type(i: Int) : Inner_typeContext? = getRuleContext(solver.getType("Inner_typeContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterInner_type(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitInner_type(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitInner_type(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  inner_type() : Inner_typeContext {
		var _localctx : Inner_typeContext = Inner_typeContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_inner_type.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 185
			match(T__7) as Token
			this.state = 186
			type()
			this.state = 188
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__7) {
				if (true){
				this.state = 187
				inner_type()
				}
			}

			this.state = 197
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__15) {
				if (true){
				if (true){
				this.state = 190
				match(T__15) as Token
				this.state = 191
				type()
				this.state = 193
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==T__7) {
					if (true){
					this.state = 192
					inner_type()
					}
				}

				}
				}
				this.state = 199
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 200
			match(T__8) as Token
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

	open class Enum_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enum_def.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun findAnnotation_reference() : Annotation_referenceContext? = getRuleContext(solver.getType("Annotation_referenceContext"),0)
		fun findEnum_content() : List<Enum_contentContext> = getRuleContexts(solver.getType("Enum_contentContext"))
		fun findEnum_content(i: Int) : Enum_contentContext? = getRuleContext(solver.getType("Enum_contentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterEnum_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitEnum_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitEnum_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enum_def() : Enum_defContext {
		var _localctx : Enum_defContext = Enum_defContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_enum_def.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 202
			match(T__16) as Token
			this.state = 203
			match(NAME) as Token
			this.state = 205
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__5) {
				if (true){
				this.state = 204
				annotation_reference()
				}
			}

			this.state = 207
			match(T__10) as Token
			this.state = 211
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==NAME) {
				if (true){
				if (true){
				this.state = 208
				enum_content()
				}
				}
				this.state = 213
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 214
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

	open class Annotation_referenceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annotation_reference.id
	        set(value) { throw RuntimeException() }
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun TEXT() : TerminalNode? = getToken(CapnProtoParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterAnnotation_reference(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitAnnotation_reference(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitAnnotation_reference(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  annotation_reference() : Annotation_referenceContext {
		var _localctx : Annotation_referenceContext = Annotation_referenceContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_annotation_reference.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 216
			match(T__5) as Token
			this.state = 217
			type()
			this.state = 219
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__17) {
				if (true){
				this.state = 218
				match(T__17) as Token
				}
			}

			this.state = 221
			match(T__7) as Token
			this.state = 222
			match(TEXT) as Token
			this.state = 223
			match(T__8) as Token
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

	open class Enum_contentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enum_content.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun LOCATOR() : TerminalNode? = getToken(CapnProtoParser.Tokens.LOCATOR.id, 0)
		fun findAnnotation_reference() : Annotation_referenceContext? = getRuleContext(solver.getType("Annotation_referenceContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterEnum_content(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitEnum_content(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitEnum_content(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enum_content() : Enum_contentContext {
		var _localctx : Enum_contentContext = Enum_contentContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_enum_content.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 225
			match(NAME) as Token
			this.state = 226
			match(LOCATOR) as Token
			this.state = 228
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__5) {
				if (true){
				this.state = 227
				annotation_reference()
				}
			}

			this.state = 230
			match(T__0) as Token
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

	open class Named_union_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_named_union_def.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun LOCATOR() : TerminalNode? = getToken(CapnProtoParser.Tokens.LOCATOR.id, 0)
		fun findUnion_content() : List<Union_contentContext> = getRuleContexts(solver.getType("Union_contentContext"))
		fun findUnion_content(i: Int) : Union_contentContext? = getRuleContext(solver.getType("Union_contentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterNamed_union_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitNamed_union_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitNamed_union_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  named_union_def() : Named_union_defContext {
		var _localctx : Named_union_defContext = Named_union_defContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_named_union_def.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 232
			match(NAME) as Token
			this.state = 234
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LOCATOR) {
				if (true){
				this.state = 233
				match(LOCATOR) as Token
				}
			}

			this.state = 236
			match(T__18) as Token
			this.state = 237
			match(T__10) as Token
			this.state = 241
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__19 || _la==NAME) {
				if (true){
				if (true){
				this.state = 238
				union_content()
				}
				}
				this.state = 243
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 244
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

	open class Unnamed_union_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unnamed_union_def.id
	        set(value) { throw RuntimeException() }
		fun findUnion_content() : List<Union_contentContext> = getRuleContexts(solver.getType("Union_contentContext"))
		fun findUnion_content(i: Int) : Union_contentContext? = getRuleContext(solver.getType("Union_contentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterUnnamed_union_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitUnnamed_union_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitUnnamed_union_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  unnamed_union_def() : Unnamed_union_defContext {
		var _localctx : Unnamed_union_defContext = Unnamed_union_defContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_unnamed_union_def.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 246
			match(T__19) as Token
			this.state = 247
			match(T__10) as Token
			this.state = 251
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__19 || _la==NAME) {
				if (true){
				if (true){
				this.state = 248
				union_content()
				}
				}
				this.state = 253
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 254
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

	open class Union_contentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_union_content.id
	        set(value) { throw RuntimeException() }
		fun findField_def() : Field_defContext? = getRuleContext(solver.getType("Field_defContext"),0)
		fun findGroup_def() : Group_defContext? = getRuleContext(solver.getType("Group_defContext"),0)
		fun findUnnamed_union_def() : Unnamed_union_defContext? = getRuleContext(solver.getType("Unnamed_union_defContext"),0)
		fun findNamed_union_def() : Named_union_defContext? = getRuleContext(solver.getType("Named_union_defContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterUnion_content(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitUnion_content(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitUnion_content(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  union_content() : Union_contentContext {
		var _localctx : Union_contentContext = Union_contentContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_union_content.id)
		try {
			this.state = 260
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,25,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 256
			field_def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 257
			group_def()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 258
			unnamed_union_def()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 259
			named_union_def()
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

	open class Group_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_group_def.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun findGroup_content() : List<Group_contentContext> = getRuleContexts(solver.getType("Group_contentContext"))
		fun findGroup_content(i: Int) : Group_contentContext? = getRuleContext(solver.getType("Group_contentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterGroup_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitGroup_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitGroup_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  group_def() : Group_defContext {
		var _localctx : Group_defContext = Group_defContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_group_def.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 262
			match(NAME) as Token
			this.state = 263
			match(T__20) as Token
			this.state = 264
			match(T__10) as Token
			this.state = 268
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__19 || _la==NAME) {
				if (true){
				if (true){
				this.state = 265
				group_content()
				}
				}
				this.state = 270
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 271
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

	open class Group_contentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_group_content.id
	        set(value) { throw RuntimeException() }
		fun findField_def() : Field_defContext? = getRuleContext(solver.getType("Field_defContext"),0)
		fun findUnnamed_union_def() : Unnamed_union_defContext? = getRuleContext(solver.getType("Unnamed_union_defContext"),0)
		fun findNamed_union_def() : Named_union_defContext? = getRuleContext(solver.getType("Named_union_defContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterGroup_content(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitGroup_content(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitGroup_content(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  group_content() : Group_contentContext {
		var _localctx : Group_contentContext = Group_contentContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_group_content.id)
		try {
			this.state = 276
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,27,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 273
			field_def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 274
			unnamed_union_def()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 275
			named_union_def()
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

	open class Function_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_function_def.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun findFunction_parameters() : List<Function_parametersContext> = getRuleContexts(solver.getType("Function_parametersContext"))
		fun findFunction_parameters(i: Int) : Function_parametersContext? = getRuleContext(solver.getType("Function_parametersContext"),i)
		fun findType() : List<TypeContext> = getRuleContexts(solver.getType("TypeContext"))
		fun findType(i: Int) : TypeContext? = getRuleContext(solver.getType("TypeContext"),i)
		fun LOCATOR() : TerminalNode? = getToken(CapnProtoParser.Tokens.LOCATOR.id, 0)
		fun findGeneric_type_parameters() : Generic_type_parametersContext? = getRuleContext(solver.getType("Generic_type_parametersContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterFunction_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitFunction_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitFunction_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  function_def() : Function_defContext {
		var _localctx : Function_defContext = Function_defContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_function_def.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 278
			match(NAME) as Token
			this.state = 280
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LOCATOR) {
				if (true){
				this.state = 279
				match(LOCATOR) as Token
				}
			}

			this.state = 283
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__22) {
				if (true){
				this.state = 282
				generic_type_parameters()
				}
			}

			this.state = 287
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__7  ->  /*LL1AltBlock*/{if (true){
			this.state = 285
			function_parameters()
			}}
			NAME  ->  /*LL1AltBlock*/{if (true){
			this.state = 286
			type()
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 294
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__21) {
				if (true){
				this.state = 289
				match(T__21) as Token
				this.state = 292
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				T__7  ->  /*LL1AltBlock*/{if (true){
				this.state = 290
				function_parameters()
				}}
				NAME  ->  /*LL1AltBlock*/{if (true){
				this.state = 291
				type()
				}}
				else -> throw NoViableAltException(this)
				}
				}
			}

			this.state = 296
			match(T__0) as Token
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

	open class Generic_type_parametersContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_generic_type_parameters.id
	        set(value) { throw RuntimeException() }
		fun NAME() : List<TerminalNode> = getTokens(CapnProtoParser.Tokens.NAME.id)
		fun NAME(i: Int) : TerminalNode = getToken(CapnProtoParser.Tokens.NAME.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterGeneric_type_parameters(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitGeneric_type_parameters(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitGeneric_type_parameters(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  generic_type_parameters() : Generic_type_parametersContext {
		var _localctx : Generic_type_parametersContext = Generic_type_parametersContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_generic_type_parameters.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 298
			match(T__22) as Token
			this.state = 299
			match(NAME) as Token
			this.state = 304
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__15) {
				if (true){
				if (true){
				this.state = 300
				match(T__15) as Token
				this.state = 301
				match(NAME) as Token
				}
				}
				this.state = 306
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 307
			match(T__23) as Token
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

	open class Function_parametersContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_function_parameters.id
	        set(value) { throw RuntimeException() }
		fun NAME() : List<TerminalNode> = getTokens(CapnProtoParser.Tokens.NAME.id)
		fun NAME(i: Int) : TerminalNode = getToken(CapnProtoParser.Tokens.NAME.id, i) as TerminalNode
		fun findType() : List<TypeContext> = getRuleContexts(solver.getType("TypeContext"))
		fun findType(i: Int) : TypeContext? = getRuleContext(solver.getType("TypeContext"),i)
		fun findConst_value() : List<Const_valueContext> = getRuleContexts(solver.getType("Const_valueContext"))
		fun findConst_value(i: Int) : Const_valueContext? = getRuleContext(solver.getType("Const_valueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterFunction_parameters(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitFunction_parameters(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitFunction_parameters(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  function_parameters() : Function_parametersContext {
		var _localctx : Function_parametersContext = Function_parametersContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_function_parameters.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 309
			match(T__7) as Token
			this.state = 330
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAME) {
				if (true){
				this.state = 310
				match(NAME) as Token
				this.state = 311
				match(T__14) as Token
				this.state = 312
				type()
				this.state = 315
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==T__2) {
					if (true){
					this.state = 313
					match(T__2) as Token
					this.state = 314
					const_value()
					}
				}

				this.state = 327
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==T__15) {
					if (true){
					if (true){
					this.state = 317
					match(T__15) as Token
					this.state = 318
					match(NAME) as Token
					this.state = 319
					match(T__14) as Token
					this.state = 320
					type()
					this.state = 323
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					if (_la==T__2) {
						if (true){
						this.state = 321
						match(T__2) as Token
						this.state = 322
						const_value()
						}
					}

					}
					}
					this.state = 329
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				}
			}

			this.state = 332
			match(T__8) as Token
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

	open class Annotation_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annotation_def.id
	        set(value) { throw RuntimeException() }
		fun findType() : List<TypeContext> = getRuleContexts(solver.getType("TypeContext"))
		fun findType(i: Int) : TypeContext? = getRuleContext(solver.getType("TypeContext"),i)
		fun findAnnotation_parameters() : Annotation_parametersContext? = getRuleContext(solver.getType("Annotation_parametersContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterAnnotation_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitAnnotation_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitAnnotation_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  annotation_def() : Annotation_defContext {
		var _localctx : Annotation_defContext = Annotation_defContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_annotation_def.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 334
			match(T__24) as Token
			this.state = 335
			type()
			this.state = 337
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__7) {
				if (true){
				this.state = 336
				annotation_parameters()
				}
			}

			this.state = 339
			match(T__14) as Token
			this.state = 340
			type()
			this.state = 341
			match(T__0) as Token
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

	open class Annotation_parametersContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annotation_parameters.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterAnnotation_parameters(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitAnnotation_parameters(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitAnnotation_parameters(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  annotation_parameters() : Annotation_parametersContext {
		var _localctx : Annotation_parametersContext = Annotation_parametersContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_annotation_parameters.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 343
			match(T__7) as Token
			this.state = 344
			match(T__9) as Token
			this.state = 345
			match(T__8) as Token
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

	open class Const_defContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_const_def.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun findConst_value() : Const_valueContext? = getRuleContext(solver.getType("Const_valueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterConst_def(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitConst_def(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitConst_def(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  const_def() : Const_defContext {
		var _localctx : Const_defContext = Const_defContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_const_def.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 347
			match(T__25) as Token
			this.state = 348
			match(NAME) as Token
			this.state = 349
			match(T__14) as Token
			this.state = 350
			type()
			this.state = 351
			match(T__2) as Token
			this.state = 352
			const_value()
			this.state = 353
			match(T__0) as Token
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

	open class Const_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_const_value.id
	        set(value) { throw RuntimeException() }
		fun NAME() : List<TerminalNode> = getTokens(CapnProtoParser.Tokens.NAME.id)
		fun NAME(i: Int) : TerminalNode = getToken(CapnProtoParser.Tokens.NAME.id, i) as TerminalNode
		fun INTEGER() : TerminalNode? = getToken(CapnProtoParser.Tokens.INTEGER.id, 0)
		fun FLOAT() : TerminalNode? = getToken(CapnProtoParser.Tokens.FLOAT.id, 0)
		fun TEXT() : TerminalNode? = getToken(CapnProtoParser.Tokens.TEXT.id, 0)
		fun BOOLEAN() : TerminalNode? = getToken(CapnProtoParser.Tokens.BOOLEAN.id, 0)
		fun HEXADECIMAL() : TerminalNode? = getToken(CapnProtoParser.Tokens.HEXADECIMAL.id, 0)
		fun VOID() : TerminalNode? = getToken(CapnProtoParser.Tokens.VOID.id, 0)
		fun findLiteral_list() : Literal_listContext? = getRuleContext(solver.getType("Literal_listContext"),0)
		fun findLiteral_union() : Literal_unionContext? = getRuleContext(solver.getType("Literal_unionContext"),0)
		fun findLiteral_bytes() : Literal_bytesContext? = getRuleContext(solver.getType("Literal_bytesContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterConst_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitConst_value(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitConst_value(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  const_value() : Const_valueContext {
		var _localctx : Const_valueContext = Const_valueContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_const_value.id)
		var _la: Int
		try {
			this.state = 375
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__4 , T__26 , NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 356
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__26) {
				if (true){
				this.state = 355
				match(T__26) as Token
				}
			}

			this.state = 359
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__4) {
				if (true){
				this.state = 358
				match(T__4) as Token
				}
			}

			this.state = 361
			match(NAME) as Token
			this.state = 364
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__4) {
				if (true){
				this.state = 362
				match(T__4) as Token
				this.state = 363
				match(NAME) as Token
				}
			}

			}}
			INTEGER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 366
			match(INTEGER) as Token
			}}
			FLOAT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 367
			match(FLOAT) as Token
			}}
			TEXT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 368
			match(TEXT) as Token
			}}
			BOOLEAN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 369
			match(BOOLEAN) as Token
			}}
			HEXADECIMAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 370
			match(HEXADECIMAL) as Token
			}}
			VOID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 371
			match(VOID) as Token
			}}
			T__22  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 372
			literal_list()
			}}
			T__7  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 373
			literal_union()
			}}
			T__27  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 374
			literal_bytes()
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

	open class Literal_unionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literal_union.id
	        set(value) { throw RuntimeException() }
		fun NAME() : List<TerminalNode> = getTokens(CapnProtoParser.Tokens.NAME.id)
		fun NAME(i: Int) : TerminalNode = getToken(CapnProtoParser.Tokens.NAME.id, i) as TerminalNode
		fun findUnion_mapping() : List<Union_mappingContext> = getRuleContexts(solver.getType("Union_mappingContext"))
		fun findUnion_mapping(i: Int) : Union_mappingContext? = getRuleContext(solver.getType("Union_mappingContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterLiteral_union(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitLiteral_union(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitLiteral_union(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  literal_union() : Literal_unionContext {
		var _localctx : Literal_unionContext = Literal_unionContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_literal_union.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 377
			match(T__7) as Token
			this.state = 378
			match(NAME) as Token
			this.state = 379
			match(T__2) as Token
			this.state = 380
			union_mapping()
			this.state = 387
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__15) {
				if (true){
				if (true){
				this.state = 381
				match(T__15) as Token
				this.state = 382
				match(NAME) as Token
				this.state = 383
				match(T__2) as Token
				this.state = 384
				union_mapping()
				}
				}
				this.state = 389
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 390
			match(T__8) as Token
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

	open class Literal_listContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literal_list.id
	        set(value) { throw RuntimeException() }
		fun findConst_value() : List<Const_valueContext> = getRuleContexts(solver.getType("Const_valueContext"))
		fun findConst_value(i: Int) : Const_valueContext? = getRuleContext(solver.getType("Const_valueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterLiteral_list(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitLiteral_list(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitLiteral_list(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  literal_list() : Literal_listContext {
		var _localctx : Literal_listContext = Literal_listContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_literal_list.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 392
			match(T__22) as Token
			this.state = 393
			const_value()
			this.state = 398
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__15) {
				if (true){
				if (true){
				this.state = 394
				match(T__15) as Token
				this.state = 395
				const_value()
				}
				}
				this.state = 400
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 401
			match(T__23) as Token
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

	open class Literal_bytesContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literal_bytes.id
	        set(value) { throw RuntimeException() }
		fun TEXT() : TerminalNode? = getToken(CapnProtoParser.Tokens.TEXT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterLiteral_bytes(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitLiteral_bytes(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitLiteral_bytes(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  literal_bytes() : Literal_bytesContext {
		var _localctx : Literal_bytesContext = Literal_bytesContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_literal_bytes.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 403
			match(T__27) as Token
			this.state = 404
			match(TEXT) as Token
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

	open class Union_mappingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_union_mapping.id
	        set(value) { throw RuntimeException() }
		fun NAME() : TerminalNode? = getToken(CapnProtoParser.Tokens.NAME.id, 0)
		fun findConst_value() : Const_valueContext? = getRuleContext(solver.getType("Const_valueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterUnion_mapping(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitUnion_mapping(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitUnion_mapping(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  union_mapping() : Union_mappingContext {
		var _localctx : Union_mappingContext = Union_mappingContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_union_mapping.id)
		try {
			this.state = 413
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,45,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 406
			match(T__7) as Token
			this.state = 407
			match(NAME) as Token
			this.state = 408
			match(T__2) as Token
			this.state = 409
			const_value()
			this.state = 410
			match(T__8) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 412
			const_value()
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

	open class Inner_usingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inner_using.id
	        set(value) { throw RuntimeException() }
		fun NAME() : List<TerminalNode> = getTokens(CapnProtoParser.Tokens.NAME.id)
		fun NAME(i: Int) : TerminalNode = getToken(CapnProtoParser.Tokens.NAME.id, i) as TerminalNode
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).enterInner_using(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is CapnProtoListener ) (listener as CapnProtoListener).exitInner_using(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is CapnProtoVisitor ) return (visitor as CapnProtoVisitor<out T>).visitInner_using(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  inner_using() : Inner_usingContext {
		var _localctx : Inner_usingContext = Inner_usingContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_inner_using.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 415
			match(T__1) as Token
			this.state = 416
			match(NAME) as Token
			this.state = 421
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__4) {
				if (true){
				if (true){
				this.state = 417
				match(T__4) as Token
				this.state = 418
				match(NAME) as Token
				}
				}
				this.state = 423
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 426
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__2) {
				if (true){
				this.state = 424
				match(T__2) as Token
				this.state = 425
				type()
				}
			}

			this.state = 428
			match(T__0) as Token
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