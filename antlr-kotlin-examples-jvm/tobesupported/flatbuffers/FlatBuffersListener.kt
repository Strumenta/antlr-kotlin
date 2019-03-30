// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlatBuffersParser}.
 */
interface FlatBuffersListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#schema}.
	 * @param ctx the parse tree
	 */
	fun enterSchema(ctx: FlatBuffersParser.SchemaContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#schema}.
	 * @param ctx the parse tree
	 */
	fun exitSchema(ctx: FlatBuffersParser.SchemaContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#include}.
	 * @param ctx the parse tree
	 */
	fun enterInclude(ctx: FlatBuffersParser.IncludeContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#include}.
	 * @param ctx the parse tree
	 */
	fun exitInclude(ctx: FlatBuffersParser.IncludeContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#namespace_decl}.
	 * @param ctx the parse tree
	 */
	fun enterNamespace_decl(ctx: FlatBuffersParser.Namespace_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#namespace_decl}.
	 * @param ctx the parse tree
	 */
	fun exitNamespace_decl(ctx: FlatBuffersParser.Namespace_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#attribute_decl}.
	 * @param ctx the parse tree
	 */
	fun enterAttribute_decl(ctx: FlatBuffersParser.Attribute_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#attribute_decl}.
	 * @param ctx the parse tree
	 */
	fun exitAttribute_decl(ctx: FlatBuffersParser.Attribute_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#type_decl}.
	 * @param ctx the parse tree
	 */
	fun enterType_decl(ctx: FlatBuffersParser.Type_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#type_decl}.
	 * @param ctx the parse tree
	 */
	fun exitType_decl(ctx: FlatBuffersParser.Type_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#enum_decl}.
	 * @param ctx the parse tree
	 */
	fun enterEnum_decl(ctx: FlatBuffersParser.Enum_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#enum_decl}.
	 * @param ctx the parse tree
	 */
	fun exitEnum_decl(ctx: FlatBuffersParser.Enum_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#root_decl}.
	 * @param ctx the parse tree
	 */
	fun enterRoot_decl(ctx: FlatBuffersParser.Root_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#root_decl}.
	 * @param ctx the parse tree
	 */
	fun exitRoot_decl(ctx: FlatBuffersParser.Root_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#field_decl}.
	 * @param ctx the parse tree
	 */
	fun enterField_decl(ctx: FlatBuffersParser.Field_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#field_decl}.
	 * @param ctx the parse tree
	 */
	fun exitField_decl(ctx: FlatBuffersParser.Field_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#rpc_decl}.
	 * @param ctx the parse tree
	 */
	fun enterRpc_decl(ctx: FlatBuffersParser.Rpc_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#rpc_decl}.
	 * @param ctx the parse tree
	 */
	fun exitRpc_decl(ctx: FlatBuffersParser.Rpc_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#rpc_method}.
	 * @param ctx the parse tree
	 */
	fun enterRpc_method(ctx: FlatBuffersParser.Rpc_methodContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#rpc_method}.
	 * @param ctx the parse tree
	 */
	fun exitRpc_method(ctx: FlatBuffersParser.Rpc_methodContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#type}.
	 * @param ctx the parse tree
	 */
	fun enterType(ctx: FlatBuffersParser.TypeContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#type}.
	 * @param ctx the parse tree
	 */
	fun exitType(ctx: FlatBuffersParser.TypeContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#enumval_decl}.
	 * @param ctx the parse tree
	 */
	fun enterEnumval_decl(ctx: FlatBuffersParser.Enumval_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#enumval_decl}.
	 * @param ctx the parse tree
	 */
	fun exitEnumval_decl(ctx: FlatBuffersParser.Enumval_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#commasep_enumval_decl}.
	 * @param ctx the parse tree
	 */
	fun enterCommasep_enumval_decl(ctx: FlatBuffersParser.Commasep_enumval_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#commasep_enumval_decl}.
	 * @param ctx the parse tree
	 */
	fun exitCommasep_enumval_decl(ctx: FlatBuffersParser.Commasep_enumval_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#ident_with_opt_single_value}.
	 * @param ctx the parse tree
	 */
	fun enterIdent_with_opt_single_value(ctx: FlatBuffersParser.Ident_with_opt_single_valueContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#ident_with_opt_single_value}.
	 * @param ctx the parse tree
	 */
	fun exitIdent_with_opt_single_value(ctx: FlatBuffersParser.Ident_with_opt_single_valueContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#commasep_ident_with_opt_single_value}.
	 * @param ctx the parse tree
	 */
	fun enterCommasep_ident_with_opt_single_value(ctx: FlatBuffersParser.Commasep_ident_with_opt_single_valueContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#commasep_ident_with_opt_single_value}.
	 * @param ctx the parse tree
	 */
	fun exitCommasep_ident_with_opt_single_value(ctx: FlatBuffersParser.Commasep_ident_with_opt_single_valueContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#metadata}.
	 * @param ctx the parse tree
	 */
	fun enterMetadata(ctx: FlatBuffersParser.MetadataContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#metadata}.
	 * @param ctx the parse tree
	 */
	fun exitMetadata(ctx: FlatBuffersParser.MetadataContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#scalar}.
	 * @param ctx the parse tree
	 */
	fun enterScalar(ctx: FlatBuffersParser.ScalarContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#scalar}.
	 * @param ctx the parse tree
	 */
	fun exitScalar(ctx: FlatBuffersParser.ScalarContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#object}.
	 * @param ctx the parse tree
	 */
	fun enterObject(ctx: FlatBuffersParser.ObjectContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#object}.
	 * @param ctx the parse tree
	 */
	fun exitObject(ctx: FlatBuffersParser.ObjectContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#ident_with_value}.
	 * @param ctx the parse tree
	 */
	fun enterIdent_with_value(ctx: FlatBuffersParser.Ident_with_valueContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#ident_with_value}.
	 * @param ctx the parse tree
	 */
	fun exitIdent_with_value(ctx: FlatBuffersParser.Ident_with_valueContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#commasep_ident_with_value}.
	 * @param ctx the parse tree
	 */
	fun enterCommasep_ident_with_value(ctx: FlatBuffersParser.Commasep_ident_with_valueContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#commasep_ident_with_value}.
	 * @param ctx the parse tree
	 */
	fun exitCommasep_ident_with_value(ctx: FlatBuffersParser.Commasep_ident_with_valueContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#single_value}.
	 * @param ctx the parse tree
	 */
	fun enterSingle_value(ctx: FlatBuffersParser.Single_valueContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#single_value}.
	 * @param ctx the parse tree
	 */
	fun exitSingle_value(ctx: FlatBuffersParser.Single_valueContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#value}.
	 * @param ctx the parse tree
	 */
	fun enterValue(ctx: FlatBuffersParser.ValueContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#value}.
	 * @param ctx the parse tree
	 */
	fun exitValue(ctx: FlatBuffersParser.ValueContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#commasep_value}.
	 * @param ctx the parse tree
	 */
	fun enterCommasep_value(ctx: FlatBuffersParser.Commasep_valueContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#commasep_value}.
	 * @param ctx the parse tree
	 */
	fun exitCommasep_value(ctx: FlatBuffersParser.Commasep_valueContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#file_extension_decl}.
	 * @param ctx the parse tree
	 */
	fun enterFile_extension_decl(ctx: FlatBuffersParser.File_extension_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#file_extension_decl}.
	 * @param ctx the parse tree
	 */
	fun exitFile_extension_decl(ctx: FlatBuffersParser.File_extension_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#file_identifier_decl}.
	 * @param ctx the parse tree
	 */
	fun enterFile_identifier_decl(ctx: FlatBuffersParser.File_identifier_declContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#file_identifier_decl}.
	 * @param ctx the parse tree
	 */
	fun exitFile_identifier_decl(ctx: FlatBuffersParser.File_identifier_declContext)
	/**
	 * Enter a parse tree produced by {@link FlatBuffersParser#ns_ident}.
	 * @param ctx the parse tree
	 */
	fun enterNs_ident(ctx: FlatBuffersParser.Ns_identContext)
	/**
	 * Exit a parse tree produced by {@link FlatBuffersParser#ns_ident}.
	 * @param ctx the parse tree
	 */
	fun exitNs_ident(ctx: FlatBuffersParser.Ns_identContext)
}