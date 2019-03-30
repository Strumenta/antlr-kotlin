// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CapnProtoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface CapnProtoVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDocument(ctx : CapnProtoParser.DocumentContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#file_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFile_identifier(ctx : CapnProtoParser.File_identifierContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#using_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUsing_import(ctx : CapnProtoParser.Using_importContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamespace(ctx : CapnProtoParser.NamespaceContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#document_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDocument_content(ctx : CapnProtoParser.Document_contentContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#struct_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStruct_def(ctx : CapnProtoParser.Struct_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#struct_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStruct_content(ctx : CapnProtoParser.Struct_contentContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#interface_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterface_def(ctx : CapnProtoParser.Interface_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#interface_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInterface_content(ctx : CapnProtoParser.Interface_contentContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#field_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitField_def(ctx : CapnProtoParser.Field_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitType(ctx : CapnProtoParser.TypeContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#inner_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInner_type(ctx : CapnProtoParser.Inner_typeContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#enum_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnum_def(ctx : CapnProtoParser.Enum_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#annotation_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAnnotation_reference(ctx : CapnProtoParser.Annotation_referenceContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#enum_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitEnum_content(ctx : CapnProtoParser.Enum_contentContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#named_union_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNamed_union_def(ctx : CapnProtoParser.Named_union_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#unnamed_union_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnnamed_union_def(ctx : CapnProtoParser.Unnamed_union_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#union_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnion_content(ctx : CapnProtoParser.Union_contentContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#group_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGroup_def(ctx : CapnProtoParser.Group_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#group_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGroup_content(ctx : CapnProtoParser.Group_contentContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunction_def(ctx : CapnProtoParser.Function_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#generic_type_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitGeneric_type_parameters(ctx : CapnProtoParser.Generic_type_parametersContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitFunction_parameters(ctx : CapnProtoParser.Function_parametersContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#annotation_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAnnotation_def(ctx : CapnProtoParser.Annotation_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#annotation_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAnnotation_parameters(ctx : CapnProtoParser.Annotation_parametersContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#const_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConst_def(ctx : CapnProtoParser.Const_defContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#const_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitConst_value(ctx : CapnProtoParser.Const_valueContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#literal_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteral_union(ctx : CapnProtoParser.Literal_unionContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#literal_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteral_list(ctx : CapnProtoParser.Literal_listContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#literal_bytes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitLiteral_bytes(ctx : CapnProtoParser.Literal_bytesContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#union_mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitUnion_mapping(ctx : CapnProtoParser.Union_mappingContext) : T
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#inner_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitInner_using(ctx : CapnProtoParser.Inner_usingContext) : T
}