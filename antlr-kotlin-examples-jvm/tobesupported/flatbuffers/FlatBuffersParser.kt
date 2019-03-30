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

class FlatBuffersParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(FlatBuffersParser.SchemaContext::class,
                                                              FlatBuffersParser.IncludeContext::class,
                                                              FlatBuffersParser.Namespace_declContext::class,
                                                              FlatBuffersParser.Attribute_declContext::class,
                                                              FlatBuffersParser.Type_declContext::class,
                                                              FlatBuffersParser.Enum_declContext::class,
                                                              FlatBuffersParser.Root_declContext::class,
                                                              FlatBuffersParser.Field_declContext::class,
                                                              FlatBuffersParser.Rpc_declContext::class,
                                                              FlatBuffersParser.Rpc_methodContext::class,
                                                              FlatBuffersParser.TypeContext::class,
                                                              FlatBuffersParser.Enumval_declContext::class,
                                                              FlatBuffersParser.Commasep_enumval_declContext::class,
                                                              FlatBuffersParser.Ident_with_opt_single_valueContext::class,
                                                              FlatBuffersParser.Commasep_ident_with_opt_single_valueContext::class,
                                                              FlatBuffersParser.MetadataContext::class,
                                                              FlatBuffersParser.ScalarContext::class,
                                                              FlatBuffersParser.ObjectContext::class,
                                                              FlatBuffersParser.Ident_with_valueContext::class,
                                                              FlatBuffersParser.Commasep_ident_with_valueContext::class,
                                                              FlatBuffersParser.Single_valueContext::class,
                                                              FlatBuffersParser.ValueContext::class,
                                                              FlatBuffersParser.Commasep_valueContext::class,
                                                              FlatBuffersParser.File_extension_declContext::class,
                                                              FlatBuffersParser.File_identifier_declContext::class,
                                                              FlatBuffersParser.Ns_identContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "FlatBuffers.g4"

    override val tokenNames: Array<String?>?
        get() = FlatBuffersParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = FlatBuffersParser.Companion.ruleNames
    override val atn: ATN
        get() = FlatBuffersParser.Companion.ATN

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
        STRING_CONSTANT(23),
        BASE_TYPE_NAME(24),
        IDENT(25),
        INTEGER_CONSTANT(26),
        FLOAT_CONSTANT(27),
        COMMENT(28),
        WHITESPACE(29)
    }

    enum class Rules(val id: Int) {
        RULE_schema(0),
        RULE_include(1),
        RULE_namespace_decl(2),
        RULE_attribute_decl(3),
        RULE_type_decl(4),
        RULE_enum_decl(5),
        RULE_root_decl(6),
        RULE_field_decl(7),
        RULE_rpc_decl(8),
        RULE_rpc_method(9),
        RULE_type(10),
        RULE_enumval_decl(11),
        RULE_commasep_enumval_decl(12),
        RULE_ident_with_opt_single_value(13),
        RULE_commasep_ident_with_opt_single_value(14),
        RULE_metadata(15),
        RULE_scalar(16),
        RULE_object(17),
        RULE_ident_with_value(18),
        RULE_commasep_ident_with_value(19),
        RULE_single_value(20),
        RULE_value(21),
        RULE_commasep_value(22),
        RULE_file_extension_decl(23),
        RULE_file_identifier_decl(24),
        RULE_ns_ident(25)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("schema", "include", "namespace_decl", "attribute_decl", 
                                "type_decl", "enum_decl", "root_decl", "field_decl", 
                                "rpc_decl", "rpc_method", "type", "enumval_decl", 
                                "commasep_enumval_decl", "ident_with_opt_single_value", 
                                "commasep_ident_with_opt_single_value", 
                                "metadata", "scalar", "object", "ident_with_value", 
                                "commasep_ident_with_value", "single_value", 
                                "value", "commasep_value", "file_extension_decl", 
                                "file_identifier_decl", "ns_ident")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, "'include'", 
                                                           "';'", "'namespace'", 
                                                           "'.'", "'attribute'", 
                                                           "'table'", "'struct'", 
                                                           "'{'", "'}'", 
                                                           "'enum'", "':'", 
                                                           "'union'", "'root_type'", 
                                                           "'='", "'rpc_service'", 
                                                           "'('", "')'", 
                                                           "'['", "']'", 
                                                           "','", "'file_extension'", 
                                                           "'file_identifier'")
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
                                                            null, "STRING_CONSTANT", 
                                                            "BASE_TYPE_NAME", 
                                                            "IDENT", "INTEGER_CONSTANT", 
                                                            "FLOAT_CONSTANT", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u001f\u00ff\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0003\u0002\u0007\u0002\u0038\u000a\u0002\u000c\u0002\u000e\u0002\u003b\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u0046\u000a\u0002\u000c\u0002\u000e\u0002\u0049\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u0053\u000a\u0004\u000c\u0004\u000e\u0004\u0056\u000b\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0007\u0006\u0063\u000a\u0006\u000c\u0006\u000e\u0006\u0066\u000b\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u006e\u000a\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0072\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u0082\u000a\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0006\u000a\u008b\u000a\u000a\u000d\u000a\u000e\u000a\u008c\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0005\u000c\u00a0\u000a\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00a5\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0007\u000e\u00aa\u000a\u000e\u000c\u000e\u000e\u000e\u00ad\u000b\u000e\u0003\u000e\u0005\u000e\u00b0\u000a\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00b5\u000a\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0007\u0010\u00ba\u000a\u0010\u000c\u0010\u000e\u0010\u00bd\u000b\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u00c3\u000a\u0011\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015\u00d2\u000a\u0015\u000c\u0015\u000e\u0015\u00d5\u000b\u0015\u0003\u0015\u0005\u0015\u00d8\u000a\u0015\u0003\u0016\u0003\u0016\u0005\u0016\u00dc\u000a\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u00e4\u000a\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0007\u0018\u00e9\u000a\u0018\u000c\u0018\u000e\u0018\u00ec\u000b\u0018\u0003\u0018\u0005\u0018\u00ef\u000a\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0007\u001b\u00fa\u000a\u001b\u000c\u001b\u000e\u001b\u00fd\u000b\u001b\u0003\u001b\u0002\u0002\u001c\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0002\u0004\u0003\u0002\u0008\u0009\u0003\u0002\u001b\u001d\u0002\u0104\u0002\u0039\u0003\u0002\u0002\u0002\u0004\u004a\u0003\u0002\u0002\u0002\u0006\u004e\u0003\u0002\u0002\u0002\u0008\u0059\u0003\u0002\u0002\u0002\u000a\u005d\u0003\u0002\u0002\u0002\u000c\u0071\u0003\u0002\u0002\u0002\u000e\u0078\u0003\u0002\u0002\u0002\u0010\u007c\u0003\u0002\u0002\u0002\u0012\u0086\u0003\u0002\u0002\u0002\u0014\u0090\u0003\u0002\u0002\u0002\u0016\u009f\u0003\u0002\u0002\u0002\u0018\u00a1\u0003\u0002\u0002\u0002\u001a\u00a6\u0003\u0002\u0002\u0002\u001c\u00b1\u0003\u0002\u0002\u0002\u001e\u00b6\u0003\u0002\u0002\u0002\u0020\u00c2\u0003\u0002\u0002\u0002\u0022\u00c4\u0003\u0002\u0002\u0002\u0024\u00c6\u0003\u0002\u0002\u0002\u0026\u00ca\u0003\u0002\u0002\u0002\u0028\u00ce\u0003\u0002\u0002\u0002\u002a\u00db\u0003\u0002\u0002\u0002\u002c\u00e3\u0003\u0002\u0002\u0002\u002e\u00e5\u0003\u0002\u0002\u0002\u0030\u00f0\u0003\u0002\u0002\u0002\u0032\u00f3\u0003\u0002\u0002\u0002\u0034\u00f6\u0003\u0002\u0002\u0002\u0036\u0038\u0005\u0004\u0003\u0002\u0037\u0036\u0003\u0002\u0002\u0002\u0038\u003b\u0003\u0002\u0002\u0002\u0039\u0037\u0003\u0002\u0002\u0002\u0039\u003a\u0003\u0002\u0002\u0002\u003a\u0047\u0003\u0002\u0002\u0002\u003b\u0039\u0003\u0002\u0002\u0002\u003c\u0046\u0005\u0006\u0004\u0002\u003d\u0046\u0005\u000a\u0006\u0002\u003e\u0046\u0005\u000c\u0007\u0002\u003f\u0046\u0005\u000e\u0008\u0002\u0040\u0046\u0005\u0030\u0019\u0002\u0041\u0046\u0005\u0032\u001a\u0002\u0042\u0046\u0005\u0008\u0005\u0002\u0043\u0046\u0005\u0012\u000a\u0002\u0044\u0046\u0005\u0024\u0013\u0002\u0045\u003c\u0003\u0002\u0002\u0002\u0045\u003d\u0003\u0002\u0002\u0002\u0045\u003e\u0003\u0002\u0002\u0002\u0045\u003f\u0003\u0002\u0002\u0002\u0045\u0040\u0003\u0002\u0002\u0002\u0045\u0041\u0003\u0002\u0002\u0002\u0045\u0042\u0003\u0002\u0002\u0002\u0045\u0043\u0003\u0002\u0002\u0002\u0045\u0044\u0003\u0002\u0002\u0002\u0046\u0049\u0003\u0002\u0002\u0002\u0047\u0045\u0003\u0002\u0002\u0002\u0047\u0048\u0003\u0002\u0002\u0002\u0048\u0003\u0003\u0002\u0002\u0002\u0049\u0047\u0003\u0002\u0002\u0002\u004a\u004b\u0007\u0003\u0002\u0002\u004b\u004c\u0007\u0019\u0002\u0002\u004c\u004d\u0007\u0004\u0002\u0002\u004d\u0005\u0003\u0002\u0002\u0002\u004e\u004f\u0007\u0005\u0002\u0002\u004f\u0054\u0007\u001b\u0002\u0002\u0050\u0051\u0007\u0006\u0002\u0002\u0051\u0053\u0007\u001b\u0002\u0002\u0052\u0050\u0003\u0002\u0002\u0002\u0053\u0056\u0003\u0002\u0002\u0002\u0054\u0052\u0003\u0002\u0002\u0002\u0054\u0055\u0003\u0002\u0002\u0002\u0055\u0057\u0003\u0002\u0002\u0002\u0056\u0054\u0003\u0002\u0002\u0002\u0057\u0058\u0007\u0004\u0002\u0002\u0058\u0007\u0003\u0002\u0002\u0002\u0059\u005a\u0007\u0007\u0002\u0002\u005a\u005b\u0007\u0019\u0002\u0002\u005b\u005c\u0007\u0004\u0002\u0002\u005c\u0009\u0003\u0002\u0002\u0002\u005d\u005e\u0009\u0002\u0002\u0002\u005e\u005f\u0007\u001b\u0002\u0002\u005f\u0060\u0005\u0020\u0011\u0002\u0060\u0064\u0007\u000a\u0002\u0002\u0061\u0063\u0005\u0010\u0009\u0002\u0062\u0061\u0003\u0002\u0002\u0002\u0063\u0066\u0003\u0002\u0002\u0002\u0064\u0062\u0003\u0002\u0002\u0002\u0064\u0065\u0003\u0002\u0002\u0002\u0065\u0067\u0003\u0002\u0002\u0002\u0066\u0064\u0003\u0002\u0002\u0002\u0067\u0068\u0007\u000b\u0002\u0002\u0068\u000b\u0003\u0002\u0002\u0002\u0069\u006a\u0007\u000c\u0002\u0002\u006a\u006d\u0007\u001b\u0002\u0002\u006b\u006c\u0007\u000d\u0002\u0002\u006c\u006e\u0005\u0016\u000c\u0002\u006d\u006b\u0003\u0002\u0002\u0002\u006d\u006e\u0003\u0002\u0002\u0002\u006e\u0072\u0003\u0002\u0002\u0002\u006f\u0070\u0007\u000e\u0002\u0002\u0070\u0072\u0007\u001b\u0002\u0002\u0071\u0069\u0003\u0002\u0002\u0002\u0071\u006f\u0003\u0002\u0002\u0002\u0072\u0073\u0003\u0002\u0002\u0002\u0073\u0074\u0005\u0020\u0011\u0002\u0074\u0075\u0007\u000a\u0002\u0002\u0075\u0076\u0005\u001a\u000e\u0002\u0076\u0077\u0007\u000b\u0002\u0002\u0077\u000d\u0003\u0002\u0002\u0002\u0078\u0079\u0007\u000f\u0002\u0002\u0079\u007a\u0007\u001b\u0002\u0002\u007a\u007b\u0007\u0004\u0002\u0002\u007b\u000f\u0003\u0002\u0002\u0002\u007c\u007d\u0007\u001b\u0002\u0002\u007d\u007e\u0007\u000d\u0002\u0002\u007e\u0081\u0005\u0016\u000c\u0002\u007f\u0080\u0007\u0010\u0002\u0002\u0080\u0082\u0005\u0022\u0012\u0002\u0081\u007f\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082\u0083\u0003\u0002\u0002\u0002\u0083\u0084\u0005\u0020\u0011\u0002\u0084\u0085\u0007\u0004\u0002\u0002\u0085\u0011\u0003\u0002\u0002\u0002\u0086\u0087\u0007\u0011\u0002\u0002\u0087\u0088\u0007\u001b\u0002\u0002\u0088\u008a\u0007\u000a\u0002\u0002\u0089\u008b\u0005\u0014\u000b\u0002\u008a\u0089\u0003\u0002\u0002\u0002\u008b\u008c\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d\u008e\u0003\u0002\u0002\u0002\u008e\u008f\u0007\u000b\u0002\u0002\u008f\u0013\u0003\u0002\u0002\u0002\u0090\u0091\u0007\u001b\u0002\u0002\u0091\u0092\u0007\u0012\u0002\u0002\u0092\u0093\u0007\u001b\u0002\u0002\u0093\u0094\u0007\u0013\u0002\u0002\u0094\u0095\u0007\u000d\u0002\u0002\u0095\u0096\u0007\u001b\u0002\u0002\u0096\u0097\u0005\u0020\u0011\u0002\u0097\u0098\u0007\u0004\u0002\u0002\u0098\u0015\u0003\u0002\u0002\u0002\u0099\u009a\u0007\u0014\u0002\u0002\u009a\u009b\u0005\u0016\u000c\u0002\u009b\u009c\u0007\u0015\u0002\u0002\u009c\u00a0\u0003\u0002\u0002\u0002\u009d\u00a0\u0007\u001a\u0002\u0002\u009e\u00a0\u0005\u0034\u001b\u0002\u009f\u0099\u0003\u0002\u0002\u0002\u009f\u009d\u0003\u0002\u0002\u0002\u009f\u009e\u0003\u0002\u0002\u0002\u00a0\u0017\u0003\u0002\u0002\u0002\u00a1\u00a4\u0005\u0034\u001b\u0002\u00a2\u00a3\u0007\u0010\u0002\u0002\u00a3\u00a5\u0007\u001c\u0002\u0002\u00a4\u00a2\u0003\u0002\u0002\u0002\u00a4\u00a5\u0003\u0002\u0002\u0002\u00a5\u0019\u0003\u0002\u0002\u0002\u00a6\u00ab\u0005\u0018\u000d\u0002\u00a7\u00a8\u0007\u0016\u0002\u0002\u00a8\u00aa\u0005\u0018\u000d\u0002\u00a9\u00a7\u0003\u0002\u0002\u0002\u00aa\u00ad\u0003\u0002\u0002\u0002\u00ab\u00a9\u0003\u0002\u0002\u0002\u00ab\u00ac\u0003\u0002\u0002\u0002\u00ac\u00af\u0003\u0002\u0002\u0002\u00ad\u00ab\u0003\u0002\u0002\u0002\u00ae\u00b0\u0007\u0016\u0002\u0002\u00af\u00ae\u0003\u0002\u0002\u0002\u00af\u00b0\u0003\u0002\u0002\u0002\u00b0\u001b\u0003\u0002\u0002\u0002\u00b1\u00b4\u0007\u001b\u0002\u0002\u00b2\u00b3\u0007\u000d\u0002\u0002\u00b3\u00b5\u0005\u002a\u0016\u0002\u00b4\u00b2\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5\u001d\u0003\u0002\u0002\u0002\u00b6\u00bb\u0005\u001c\u000f\u0002\u00b7\u00b8\u0007\u0016\u0002\u0002\u00b8\u00ba\u0005\u001c\u000f\u0002\u00b9\u00b7\u0003\u0002\u0002\u0002\u00ba\u00bd\u0003\u0002\u0002\u0002\u00bb\u00b9\u0003\u0002\u0002\u0002\u00bb\u00bc\u0003\u0002\u0002\u0002\u00bc\u001f\u0003\u0002\u0002\u0002\u00bd\u00bb\u0003\u0002\u0002\u0002\u00be\u00bf\u0007\u0012\u0002\u0002\u00bf\u00c0\u0005\u001e\u0010\u0002\u00c0\u00c1\u0007\u0013\u0002\u0002\u00c1\u00c3\u0003\u0002\u0002\u0002\u00c2\u00be\u0003\u0002\u0002\u0002\u00c2\u00c3\u0003\u0002\u0002\u0002\u00c3\u0021\u0003\u0002\u0002\u0002\u00c4\u00c5\u0009\u0003\u0002\u0002\u00c5\u0023\u0003\u0002\u0002\u0002\u00c6\u00c7\u0007\u000a\u0002\u0002\u00c7\u00c8\u0005\u0028\u0015\u0002\u00c8\u00c9\u0007\u000b\u0002\u0002\u00c9\u0025\u0003\u0002\u0002\u0002\u00ca\u00cb\u0007\u001b\u0002\u0002\u00cb\u00cc\u0007\u000d\u0002\u0002\u00cc\u00cd\u0005\u002c\u0017\u0002\u00cd\u0027\u0003\u0002\u0002\u0002\u00ce\u00d3\u0005\u0026\u0014\u0002\u00cf\u00d0\u0007\u0016\u0002\u0002\u00d0\u00d2\u0005\u0026\u0014\u0002\u00d1\u00cf\u0003\u0002\u0002\u0002\u00d2\u00d5\u0003\u0002\u0002\u0002\u00d3\u00d1\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u00d7\u0003\u0002\u0002\u0002\u00d5\u00d3\u0003\u0002\u0002\u0002\u00d6\u00d8\u0007\u0016\u0002\u0002\u00d7\u00d6\u0003\u0002\u0002\u0002\u00d7\u00d8\u0003\u0002\u0002\u0002\u00d8\u0029\u0003\u0002\u0002\u0002\u00d9\u00dc\u0005\u0022\u0012\u0002\u00da\u00dc\u0007\u0019\u0002\u0002\u00db\u00d9\u0003\u0002\u0002\u0002\u00db\u00da\u0003\u0002\u0002\u0002\u00dc\u002b\u0003\u0002\u0002\u0002\u00dd\u00e4\u0005\u002a\u0016\u0002\u00de\u00e4\u0005\u0024\u0013\u0002\u00df\u00e0\u0007\u0014\u0002\u0002\u00e0\u00e1\u0005\u002e\u0018\u0002\u00e1\u00e2\u0007\u0015\u0002\u0002\u00e2\u00e4\u0003\u0002\u0002\u0002\u00e3\u00dd\u0003\u0002\u0002\u0002\u00e3\u00de\u0003\u0002\u0002\u0002\u00e3\u00df\u0003\u0002\u0002\u0002\u00e4\u002d\u0003\u0002\u0002\u0002\u00e5\u00ea\u0005\u002c\u0017\u0002\u00e6\u00e7\u0007\u0016\u0002\u0002\u00e7\u00e9\u0005\u002c\u0017\u0002\u00e8\u00e6\u0003\u0002\u0002\u0002\u00e9\u00ec\u0003\u0002\u0002\u0002\u00ea\u00e8\u0003\u0002\u0002\u0002\u00ea\u00eb\u0003\u0002\u0002\u0002\u00eb\u00ee\u0003\u0002\u0002\u0002\u00ec\u00ea\u0003\u0002\u0002\u0002\u00ed\u00ef\u0007\u0016\u0002\u0002\u00ee\u00ed\u0003\u0002\u0002\u0002\u00ee\u00ef\u0003\u0002\u0002\u0002\u00ef\u002f\u0003\u0002\u0002\u0002\u00f0\u00f1\u0007\u0017\u0002\u0002\u00f1\u00f2\u0007\u0019\u0002\u0002\u00f2\u0031\u0003\u0002\u0002\u0002\u00f3\u00f4\u0007\u0018\u0002\u0002\u00f4\u00f5\u0007\u0019\u0002\u0002\u00f5\u0033\u0003\u0002\u0002\u0002\u00f6\u00fb\u0007\u001b\u0002\u0002\u00f7\u00f8\u0007\u0006\u0002\u0002\u00f8\u00fa\u0007\u001b\u0002\u0002\u00f9\u00f7\u0003\u0002\u0002\u0002\u00fa\u00fd\u0003\u0002\u0002\u0002\u00fb\u00f9\u0003\u0002\u0002\u0002\u00fb\u00fc\u0003\u0002\u0002\u0002\u00fc\u0035\u0003\u0002\u0002\u0002\u00fd\u00fb\u0003\u0002\u0002\u0002\u0019\u0039\u0045\u0047\u0054\u0064\u006d\u0071\u0081\u008c\u009f\u00a4\u00ab\u00af\u00b4\u00bb\u00c2\u00d3\u00d7\u00db\u00e3\u00ea\u00ee\u00fb"

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
    private val STRING_CONSTANT = Tokens.STRING_CONSTANT.id
    private val BASE_TYPE_NAME = Tokens.BASE_TYPE_NAME.id
    private val IDENT = Tokens.IDENT.id
    private val INTEGER_CONSTANT = Tokens.INTEGER_CONSTANT.id
    private val FLOAT_CONSTANT = Tokens.FLOAT_CONSTANT.id
    private val COMMENT = Tokens.COMMENT.id
    private val WHITESPACE = Tokens.WHITESPACE.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class SchemaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_schema.id
	        set(value) { throw RuntimeException() }
		fun findInclude() : List<IncludeContext> = getRuleContexts(solver.getType("IncludeContext"))
		fun findInclude(i: Int) : IncludeContext? = getRuleContext(solver.getType("IncludeContext"),i)
		fun findNamespace_decl() : List<Namespace_declContext> = getRuleContexts(solver.getType("Namespace_declContext"))
		fun findNamespace_decl(i: Int) : Namespace_declContext? = getRuleContext(solver.getType("Namespace_declContext"),i)
		fun findType_decl() : List<Type_declContext> = getRuleContexts(solver.getType("Type_declContext"))
		fun findType_decl(i: Int) : Type_declContext? = getRuleContext(solver.getType("Type_declContext"),i)
		fun findEnum_decl() : List<Enum_declContext> = getRuleContexts(solver.getType("Enum_declContext"))
		fun findEnum_decl(i: Int) : Enum_declContext? = getRuleContext(solver.getType("Enum_declContext"),i)
		fun findRoot_decl() : List<Root_declContext> = getRuleContexts(solver.getType("Root_declContext"))
		fun findRoot_decl(i: Int) : Root_declContext? = getRuleContext(solver.getType("Root_declContext"),i)
		fun findFile_extension_decl() : List<File_extension_declContext> = getRuleContexts(solver.getType("File_extension_declContext"))
		fun findFile_extension_decl(i: Int) : File_extension_declContext? = getRuleContext(solver.getType("File_extension_declContext"),i)
		fun findFile_identifier_decl() : List<File_identifier_declContext> = getRuleContexts(solver.getType("File_identifier_declContext"))
		fun findFile_identifier_decl(i: Int) : File_identifier_declContext? = getRuleContext(solver.getType("File_identifier_declContext"),i)
		fun findAttribute_decl() : List<Attribute_declContext> = getRuleContexts(solver.getType("Attribute_declContext"))
		fun findAttribute_decl(i: Int) : Attribute_declContext? = getRuleContext(solver.getType("Attribute_declContext"),i)
		fun findRpc_decl() : List<Rpc_declContext> = getRuleContexts(solver.getType("Rpc_declContext"))
		fun findRpc_decl(i: Int) : Rpc_declContext? = getRuleContext(solver.getType("Rpc_declContext"),i)
		fun findObject() : List<ObjectContext> = getRuleContexts(solver.getType("ObjectContext"))
		fun findObject(i: Int) : ObjectContext? = getRuleContext(solver.getType("ObjectContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterSchema(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitSchema(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitSchema(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  schema() : SchemaContext {
		var _localctx : SchemaContext = SchemaContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_schema.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 55
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__0) {
				if (true){
				if (true){
				this.state = 52
				include()
				}
				}
				this.state = 57
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 69
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl T__2) or (1L shl T__4) or (1L shl T__5) or (1L shl T__6) or (1L shl T__7) or (1L shl T__9) or (1L shl T__11) or (1L shl T__12) or (1L shl T__14) or (1L shl T__20) or (1L shl T__21))) != 0L)) {
				if (true){
				this.state = 67
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				T__2  ->  /*LL1AltBlock*/{if (true){
				this.state = 58
				namespace_decl()
				}}
				T__5 , T__6  ->  /*LL1AltBlock*/{if (true){
				this.state = 59
				type_decl()
				}}
				T__9 , T__11  ->  /*LL1AltBlock*/{if (true){
				this.state = 60
				enum_decl()
				}}
				T__12  ->  /*LL1AltBlock*/{if (true){
				this.state = 61
				root_decl()
				}}
				T__20  ->  /*LL1AltBlock*/{if (true){
				this.state = 62
				file_extension_decl()
				}}
				T__21  ->  /*LL1AltBlock*/{if (true){
				this.state = 63
				file_identifier_decl()
				}}
				T__4  ->  /*LL1AltBlock*/{if (true){
				this.state = 64
				attribute_decl()
				}}
				T__14  ->  /*LL1AltBlock*/{if (true){
				this.state = 65
				rpc_decl()
				}}
				T__7  ->  /*LL1AltBlock*/{if (true){
				this.state = 66
				object()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 71
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

	open class IncludeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_include.id
	        set(value) { throw RuntimeException() }
		fun STRING_CONSTANT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.STRING_CONSTANT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterInclude(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitInclude(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitInclude(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  include() : IncludeContext {
		var _localctx : IncludeContext = IncludeContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_include.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 72
			match(T__0) as Token
			this.state = 73
			match(STRING_CONSTANT) as Token
			this.state = 74
			match(T__1) as Token
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

	open class Namespace_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespace_decl.id
	        set(value) { throw RuntimeException() }
		fun IDENT() : List<TerminalNode> = getTokens(FlatBuffersParser.Tokens.IDENT.id)
		fun IDENT(i: Int) : TerminalNode = getToken(FlatBuffersParser.Tokens.IDENT.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterNamespace_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitNamespace_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitNamespace_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  namespace_decl() : Namespace_declContext {
		var _localctx : Namespace_declContext = Namespace_declContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_namespace_decl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 76
			match(T__2) as Token
			this.state = 77
			match(IDENT) as Token
			this.state = 82
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__3) {
				if (true){
				if (true){
				this.state = 78
				match(T__3) as Token
				this.state = 79
				match(IDENT) as Token
				}
				}
				this.state = 84
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 85
			match(T__1) as Token
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

	open class Attribute_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_attribute_decl.id
	        set(value) { throw RuntimeException() }
		fun STRING_CONSTANT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.STRING_CONSTANT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterAttribute_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitAttribute_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitAttribute_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  attribute_decl() : Attribute_declContext {
		var _localctx : Attribute_declContext = Attribute_declContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_attribute_decl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 87
			match(T__4) as Token
			this.state = 88
			match(STRING_CONSTANT) as Token
			this.state = 89
			match(T__1) as Token
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

	open class Type_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type_decl.id
	        set(value) { throw RuntimeException() }
		fun IDENT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.IDENT.id, 0)
		fun findMetadata() : MetadataContext? = getRuleContext(solver.getType("MetadataContext"),0)
		fun findField_decl() : List<Field_declContext> = getRuleContexts(solver.getType("Field_declContext"))
		fun findField_decl(i: Int) : Field_declContext? = getRuleContext(solver.getType("Field_declContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterType_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitType_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitType_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  type_decl() : Type_declContext {
		var _localctx : Type_declContext = Type_declContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_type_decl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 91
			_la = _input!!.LA(1)
			if ( !(_la==T__5 || _la==T__6) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 92
			match(IDENT) as Token
			this.state = 93
			metadata()
			this.state = 94
			match(T__7) as Token
			this.state = 98
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IDENT) {
				if (true){
				if (true){
				this.state = 95
				field_decl()
				}
				}
				this.state = 100
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 101
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

	open class Enum_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enum_decl.id
	        set(value) { throw RuntimeException() }
		fun findMetadata() : MetadataContext? = getRuleContext(solver.getType("MetadataContext"),0)
		fun findCommasep_enumval_decl() : Commasep_enumval_declContext? = getRuleContext(solver.getType("Commasep_enumval_declContext"),0)
		fun IDENT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.IDENT.id, 0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterEnum_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitEnum_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitEnum_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enum_decl() : Enum_declContext {
		var _localctx : Enum_declContext = Enum_declContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_enum_decl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 111
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__9  ->  /*LL1AltBlock*/{if (true){
			this.state = 103
			match(T__9) as Token
			this.state = 104
			match(IDENT) as Token
			this.state = 107
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__10) {
				if (true){
				this.state = 105
				match(T__10) as Token
				this.state = 106
				type()
				}
			}

			}}
			T__11  ->  /*LL1AltBlock*/{if (true){
			this.state = 109
			match(T__11) as Token
			this.state = 110
			match(IDENT) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 113
			metadata()
			this.state = 114
			match(T__7) as Token
			this.state = 115
			commasep_enumval_decl()
			this.state = 116
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

	open class Root_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_root_decl.id
	        set(value) { throw RuntimeException() }
		fun IDENT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.IDENT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterRoot_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitRoot_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitRoot_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  root_decl() : Root_declContext {
		var _localctx : Root_declContext = Root_declContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_root_decl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 118
			match(T__12) as Token
			this.state = 119
			match(IDENT) as Token
			this.state = 120
			match(T__1) as Token
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

	open class Field_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_field_decl.id
	        set(value) { throw RuntimeException() }
		fun IDENT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.IDENT.id, 0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun findMetadata() : MetadataContext? = getRuleContext(solver.getType("MetadataContext"),0)
		fun findScalar() : ScalarContext? = getRuleContext(solver.getType("ScalarContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterField_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitField_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitField_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  field_decl() : Field_declContext {
		var _localctx : Field_declContext = Field_declContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_field_decl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 122
			match(IDENT) as Token
			this.state = 123
			match(T__10) as Token
			this.state = 124
			type()
			this.state = 127
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__13) {
				if (true){
				this.state = 125
				match(T__13) as Token
				this.state = 126
				scalar()
				}
			}

			this.state = 129
			metadata()
			this.state = 130
			match(T__1) as Token
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

	open class Rpc_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rpc_decl.id
	        set(value) { throw RuntimeException() }
		fun IDENT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.IDENT.id, 0)
		fun findRpc_method() : List<Rpc_methodContext> = getRuleContexts(solver.getType("Rpc_methodContext"))
		fun findRpc_method(i: Int) : Rpc_methodContext? = getRuleContext(solver.getType("Rpc_methodContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterRpc_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitRpc_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitRpc_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rpc_decl() : Rpc_declContext {
		var _localctx : Rpc_declContext = Rpc_declContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_rpc_decl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 132
			match(T__14) as Token
			this.state = 133
			match(IDENT) as Token
			this.state = 134
			match(T__7) as Token
			this.state = 136 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 135
				rpc_method()
				}
				}
				this.state = 138 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==IDENT )
			this.state = 140
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

	open class Rpc_methodContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_rpc_method.id
	        set(value) { throw RuntimeException() }
		fun IDENT() : List<TerminalNode> = getTokens(FlatBuffersParser.Tokens.IDENT.id)
		fun IDENT(i: Int) : TerminalNode = getToken(FlatBuffersParser.Tokens.IDENT.id, i) as TerminalNode
		fun findMetadata() : MetadataContext? = getRuleContext(solver.getType("MetadataContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterRpc_method(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitRpc_method(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitRpc_method(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  rpc_method() : Rpc_methodContext {
		var _localctx : Rpc_methodContext = Rpc_methodContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_rpc_method.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 142
			match(IDENT) as Token
			this.state = 143
			match(T__15) as Token
			this.state = 144
			match(IDENT) as Token
			this.state = 145
			match(T__16) as Token
			this.state = 146
			match(T__10) as Token
			this.state = 147
			match(IDENT) as Token
			this.state = 148
			metadata()
			this.state = 149
			match(T__1) as Token
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
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun BASE_TYPE_NAME() : TerminalNode? = getToken(FlatBuffersParser.Tokens.BASE_TYPE_NAME.id, 0)
		fun findNs_ident() : Ns_identContext? = getRuleContext(solver.getType("Ns_identContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterType(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitType(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitType(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  type() : TypeContext {
		var _localctx : TypeContext = TypeContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_type.id)
		try {
			this.state = 157
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			T__17  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 151
			match(T__17) as Token
			this.state = 152
			type()
			this.state = 153
			match(T__18) as Token
			}}
			BASE_TYPE_NAME  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 155
			match(BASE_TYPE_NAME) as Token
			}}
			IDENT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 156
			ns_ident()
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

	open class Enumval_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_enumval_decl.id
	        set(value) { throw RuntimeException() }
		fun findNs_ident() : Ns_identContext? = getRuleContext(solver.getType("Ns_identContext"),0)
		fun INTEGER_CONSTANT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.INTEGER_CONSTANT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterEnumval_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitEnumval_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitEnumval_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  enumval_decl() : Enumval_declContext {
		var _localctx : Enumval_declContext = Enumval_declContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_enumval_decl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 159
			ns_ident()
			this.state = 162
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__13) {
				if (true){
				this.state = 160
				match(T__13) as Token
				this.state = 161
				match(INTEGER_CONSTANT) as Token
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

	open class Commasep_enumval_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commasep_enumval_decl.id
	        set(value) { throw RuntimeException() }
		fun findEnumval_decl() : List<Enumval_declContext> = getRuleContexts(solver.getType("Enumval_declContext"))
		fun findEnumval_decl(i: Int) : Enumval_declContext? = getRuleContext(solver.getType("Enumval_declContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterCommasep_enumval_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitCommasep_enumval_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitCommasep_enumval_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  commasep_enumval_decl() : Commasep_enumval_declContext {
		var _localctx : Commasep_enumval_declContext = Commasep_enumval_declContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_commasep_enumval_decl.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 164
			enumval_decl()
			this.state = 169
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,11,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 165
					match(T__19) as Token
					this.state = 166
					enumval_decl()
					}
					} 
				}
				this.state = 171
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,11,context)
			}
			this.state = 173
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__19) {
				if (true){
				this.state = 172
				match(T__19) as Token
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

	open class Ident_with_opt_single_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ident_with_opt_single_value.id
	        set(value) { throw RuntimeException() }
		fun IDENT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.IDENT.id, 0)
		fun findSingle_value() : Single_valueContext? = getRuleContext(solver.getType("Single_valueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterIdent_with_opt_single_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitIdent_with_opt_single_value(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitIdent_with_opt_single_value(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ident_with_opt_single_value() : Ident_with_opt_single_valueContext {
		var _localctx : Ident_with_opt_single_valueContext = Ident_with_opt_single_valueContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_ident_with_opt_single_value.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 175
			match(IDENT) as Token
			this.state = 178
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__10) {
				if (true){
				this.state = 176
				match(T__10) as Token
				this.state = 177
				single_value()
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

	open class Commasep_ident_with_opt_single_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commasep_ident_with_opt_single_value.id
	        set(value) { throw RuntimeException() }
		fun findIdent_with_opt_single_value() : List<Ident_with_opt_single_valueContext> = getRuleContexts(solver.getType("Ident_with_opt_single_valueContext"))
		fun findIdent_with_opt_single_value(i: Int) : Ident_with_opt_single_valueContext? = getRuleContext(solver.getType("Ident_with_opt_single_valueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterCommasep_ident_with_opt_single_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitCommasep_ident_with_opt_single_value(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitCommasep_ident_with_opt_single_value(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  commasep_ident_with_opt_single_value() : Commasep_ident_with_opt_single_valueContext {
		var _localctx : Commasep_ident_with_opt_single_valueContext = Commasep_ident_with_opt_single_valueContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_commasep_ident_with_opt_single_value.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 180
			ident_with_opt_single_value()
			this.state = 185
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__19) {
				if (true){
				if (true){
				this.state = 181
				match(T__19) as Token
				this.state = 182
				ident_with_opt_single_value()
				}
				}
				this.state = 187
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

	open class MetadataContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_metadata.id
	        set(value) { throw RuntimeException() }
		fun findCommasep_ident_with_opt_single_value() : Commasep_ident_with_opt_single_valueContext? = getRuleContext(solver.getType("Commasep_ident_with_opt_single_valueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterMetadata(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitMetadata(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitMetadata(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  metadata() : MetadataContext {
		var _localctx : MetadataContext = MetadataContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_metadata.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 192
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__15) {
				if (true){
				this.state = 188
				match(T__15) as Token
				this.state = 189
				commasep_ident_with_opt_single_value()
				this.state = 190
				match(T__16) as Token
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

	open class ScalarContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_scalar.id
	        set(value) { throw RuntimeException() }
		fun INTEGER_CONSTANT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.INTEGER_CONSTANT.id, 0)
		fun FLOAT_CONSTANT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.FLOAT_CONSTANT.id, 0)
		fun IDENT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.IDENT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterScalar(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitScalar(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitScalar(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  scalar() : ScalarContext {
		var _localctx : ScalarContext = ScalarContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_scalar.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 194
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl IDENT) or (1L shl INTEGER_CONSTANT) or (1L shl FLOAT_CONSTANT))) != 0L)) ) {
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

	open class ObjectContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_object.id
	        set(value) { throw RuntimeException() }
		fun findCommasep_ident_with_value() : Commasep_ident_with_valueContext? = getRuleContext(solver.getType("Commasep_ident_with_valueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterObject(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitObject(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitObject(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  object() : ObjectContext {
		var _localctx : ObjectContext = ObjectContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_object.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 196
			match(T__7) as Token
			this.state = 197
			commasep_ident_with_value()
			this.state = 198
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

	open class Ident_with_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ident_with_value.id
	        set(value) { throw RuntimeException() }
		fun IDENT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.IDENT.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterIdent_with_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitIdent_with_value(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitIdent_with_value(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ident_with_value() : Ident_with_valueContext {
		var _localctx : Ident_with_valueContext = Ident_with_valueContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_ident_with_value.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 200
			match(IDENT) as Token
			this.state = 201
			match(T__10) as Token
			this.state = 202
			value()
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

	open class Commasep_ident_with_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commasep_ident_with_value.id
	        set(value) { throw RuntimeException() }
		fun findIdent_with_value() : List<Ident_with_valueContext> = getRuleContexts(solver.getType("Ident_with_valueContext"))
		fun findIdent_with_value(i: Int) : Ident_with_valueContext? = getRuleContext(solver.getType("Ident_with_valueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterCommasep_ident_with_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitCommasep_ident_with_value(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitCommasep_ident_with_value(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  commasep_ident_with_value() : Commasep_ident_with_valueContext {
		var _localctx : Commasep_ident_with_valueContext = Commasep_ident_with_valueContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_commasep_ident_with_value.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 204
			ident_with_value()
			this.state = 209
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,16,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 205
					match(T__19) as Token
					this.state = 206
					ident_with_value()
					}
					} 
				}
				this.state = 211
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,16,context)
			}
			this.state = 213
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__19) {
				if (true){
				this.state = 212
				match(T__19) as Token
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

	open class Single_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_single_value.id
	        set(value) { throw RuntimeException() }
		fun findScalar() : ScalarContext? = getRuleContext(solver.getType("ScalarContext"),0)
		fun STRING_CONSTANT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.STRING_CONSTANT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterSingle_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitSingle_value(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitSingle_value(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  single_value() : Single_valueContext {
		var _localctx : Single_valueContext = Single_valueContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_single_value.id)
		try {
			this.state = 217
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			IDENT , INTEGER_CONSTANT , FLOAT_CONSTANT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 215
			scalar()
			}}
			STRING_CONSTANT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 216
			match(STRING_CONSTANT) as Token
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

	open class ValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_value.id
	        set(value) { throw RuntimeException() }
		fun findSingle_value() : Single_valueContext? = getRuleContext(solver.getType("Single_valueContext"),0)
		fun findObject() : ObjectContext? = getRuleContext(solver.getType("ObjectContext"),0)
		fun findCommasep_value() : Commasep_valueContext? = getRuleContext(solver.getType("Commasep_valueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterValue(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitValue(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitValue(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  value() : ValueContext {
		var _localctx : ValueContext = ValueContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_value.id)
		try {
			this.state = 225
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			STRING_CONSTANT , IDENT , INTEGER_CONSTANT , FLOAT_CONSTANT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 219
			single_value()
			}}
			T__7  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 220
			object()
			}}
			T__17  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 221
			match(T__17) as Token
			this.state = 222
			commasep_value()
			this.state = 223
			match(T__18) as Token
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

	open class Commasep_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commasep_value.id
	        set(value) { throw RuntimeException() }
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterCommasep_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitCommasep_value(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitCommasep_value(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  commasep_value() : Commasep_valueContext {
		var _localctx : Commasep_valueContext = Commasep_valueContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_commasep_value.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 227
			value()
			this.state = 232
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,20,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 228
					match(T__19) as Token
					this.state = 229
					value()
					}
					} 
				}
				this.state = 234
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,20,context)
			}
			this.state = 236
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==T__19) {
				if (true){
				this.state = 235
				match(T__19) as Token
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

	open class File_extension_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_file_extension_decl.id
	        set(value) { throw RuntimeException() }
		fun STRING_CONSTANT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.STRING_CONSTANT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterFile_extension_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitFile_extension_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitFile_extension_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  file_extension_decl() : File_extension_declContext {
		var _localctx : File_extension_declContext = File_extension_declContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_file_extension_decl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 238
			match(T__20) as Token
			this.state = 239
			match(STRING_CONSTANT) as Token
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

	open class File_identifier_declContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_file_identifier_decl.id
	        set(value) { throw RuntimeException() }
		fun STRING_CONSTANT() : TerminalNode? = getToken(FlatBuffersParser.Tokens.STRING_CONSTANT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterFile_identifier_decl(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitFile_identifier_decl(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitFile_identifier_decl(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  file_identifier_decl() : File_identifier_declContext {
		var _localctx : File_identifier_declContext = File_identifier_declContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_file_identifier_decl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 241
			match(T__21) as Token
			this.state = 242
			match(STRING_CONSTANT) as Token
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

	open class Ns_identContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ns_ident.id
	        set(value) { throw RuntimeException() }
		fun IDENT() : List<TerminalNode> = getTokens(FlatBuffersParser.Tokens.IDENT.id)
		fun IDENT(i: Int) : TerminalNode = getToken(FlatBuffersParser.Tokens.IDENT.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).enterNs_ident(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is FlatBuffersListener ) (listener as FlatBuffersListener).exitNs_ident(this)
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is FlatBuffersVisitor ) return (visitor as FlatBuffersVisitor<out T>).visitNs_ident(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ns_ident() : Ns_identContext {
		var _localctx : Ns_identContext = Ns_identContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_ns_ident.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 244
			match(IDENT) as Token
			this.state = 249
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==T__3) {
				if (true){
				if (true){
				this.state = 245
				match(T__3) as Token
				this.state = 246
				match(IDENT) as Token
				}
				}
				this.state = 251
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

}