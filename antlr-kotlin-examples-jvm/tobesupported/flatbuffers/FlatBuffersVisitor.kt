// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlatBuffersParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface FlatBuffersVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSchema(ctx : FlatBuffersParser.SchemaContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInclude(ctx : FlatBuffersParser.IncludeContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#namespace_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamespace_decl(ctx : FlatBuffersParser.Namespace_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#attribute_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAttribute_decl(ctx : FlatBuffersParser.Attribute_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitType_decl(ctx : FlatBuffersParser.Type_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#enum_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnum_decl(ctx : FlatBuffersParser.Enum_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#root_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRoot_decl(ctx : FlatBuffersParser.Root_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitField_decl(ctx : FlatBuffersParser.Field_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#rpc_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRpc_decl(ctx : FlatBuffersParser.Rpc_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#rpc_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitRpc_method(ctx : FlatBuffersParser.Rpc_methodContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitType(ctx : FlatBuffersParser.TypeContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#enumval_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnumval_decl(ctx : FlatBuffersParser.Enumval_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#commasep_enumval_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommasep_enumval_decl(ctx : FlatBuffersParser.Commasep_enumval_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#ident_with_opt_single_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdent_with_opt_single_value(ctx : FlatBuffersParser.Ident_with_opt_single_valueContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#commasep_ident_with_opt_single_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommasep_ident_with_opt_single_value(ctx : FlatBuffersParser.Commasep_ident_with_opt_single_valueContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitMetadata(ctx : FlatBuffersParser.MetadataContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScalar(ctx : FlatBuffersParser.ScalarContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitObject(ctx : FlatBuffersParser.ObjectContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#ident_with_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIdent_with_value(ctx : FlatBuffersParser.Ident_with_valueContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#commasep_ident_with_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommasep_ident_with_value(ctx : FlatBuffersParser.Commasep_ident_with_valueContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#single_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSingle_value(ctx : FlatBuffersParser.Single_valueContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitValue(ctx : FlatBuffersParser.ValueContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#commasep_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCommasep_value(ctx : FlatBuffersParser.Commasep_valueContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#file_extension_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFile_extension_decl(ctx : FlatBuffersParser.File_extension_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#file_identifier_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFile_identifier_decl(ctx : FlatBuffersParser.File_identifier_declContext) : T
	/**
	 * Visit a parse tree produced by {@link FlatBuffersParser#ns_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNs_ident(ctx : FlatBuffersParser.Ns_identContext) : T
}