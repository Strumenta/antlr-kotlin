// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CapnProtoParser}.
 */
interface CapnProtoListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#document}.
	 * @param ctx the parse tree
	 */
	fun enterDocument(ctx: CapnProtoParser.DocumentContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#document}.
	 * @param ctx the parse tree
	 */
	fun exitDocument(ctx: CapnProtoParser.DocumentContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#file_identifier}.
	 * @param ctx the parse tree
	 */
	fun enterFile_identifier(ctx: CapnProtoParser.File_identifierContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#file_identifier}.
	 * @param ctx the parse tree
	 */
	fun exitFile_identifier(ctx: CapnProtoParser.File_identifierContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#using_import}.
	 * @param ctx the parse tree
	 */
	fun enterUsing_import(ctx: CapnProtoParser.Using_importContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#using_import}.
	 * @param ctx the parse tree
	 */
	fun exitUsing_import(ctx: CapnProtoParser.Using_importContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#namespace}.
	 * @param ctx the parse tree
	 */
	fun enterNamespace(ctx: CapnProtoParser.NamespaceContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#namespace}.
	 * @param ctx the parse tree
	 */
	fun exitNamespace(ctx: CapnProtoParser.NamespaceContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#document_content}.
	 * @param ctx the parse tree
	 */
	fun enterDocument_content(ctx: CapnProtoParser.Document_contentContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#document_content}.
	 * @param ctx the parse tree
	 */
	fun exitDocument_content(ctx: CapnProtoParser.Document_contentContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#struct_def}.
	 * @param ctx the parse tree
	 */
	fun enterStruct_def(ctx: CapnProtoParser.Struct_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#struct_def}.
	 * @param ctx the parse tree
	 */
	fun exitStruct_def(ctx: CapnProtoParser.Struct_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#struct_content}.
	 * @param ctx the parse tree
	 */
	fun enterStruct_content(ctx: CapnProtoParser.Struct_contentContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#struct_content}.
	 * @param ctx the parse tree
	 */
	fun exitStruct_content(ctx: CapnProtoParser.Struct_contentContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#interface_def}.
	 * @param ctx the parse tree
	 */
	fun enterInterface_def(ctx: CapnProtoParser.Interface_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#interface_def}.
	 * @param ctx the parse tree
	 */
	fun exitInterface_def(ctx: CapnProtoParser.Interface_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#interface_content}.
	 * @param ctx the parse tree
	 */
	fun enterInterface_content(ctx: CapnProtoParser.Interface_contentContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#interface_content}.
	 * @param ctx the parse tree
	 */
	fun exitInterface_content(ctx: CapnProtoParser.Interface_contentContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#field_def}.
	 * @param ctx the parse tree
	 */
	fun enterField_def(ctx: CapnProtoParser.Field_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#field_def}.
	 * @param ctx the parse tree
	 */
	fun exitField_def(ctx: CapnProtoParser.Field_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#type}.
	 * @param ctx the parse tree
	 */
	fun enterType(ctx: CapnProtoParser.TypeContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#type}.
	 * @param ctx the parse tree
	 */
	fun exitType(ctx: CapnProtoParser.TypeContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#inner_type}.
	 * @param ctx the parse tree
	 */
	fun enterInner_type(ctx: CapnProtoParser.Inner_typeContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#inner_type}.
	 * @param ctx the parse tree
	 */
	fun exitInner_type(ctx: CapnProtoParser.Inner_typeContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#enum_def}.
	 * @param ctx the parse tree
	 */
	fun enterEnum_def(ctx: CapnProtoParser.Enum_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#enum_def}.
	 * @param ctx the parse tree
	 */
	fun exitEnum_def(ctx: CapnProtoParser.Enum_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#annotation_reference}.
	 * @param ctx the parse tree
	 */
	fun enterAnnotation_reference(ctx: CapnProtoParser.Annotation_referenceContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#annotation_reference}.
	 * @param ctx the parse tree
	 */
	fun exitAnnotation_reference(ctx: CapnProtoParser.Annotation_referenceContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#enum_content}.
	 * @param ctx the parse tree
	 */
	fun enterEnum_content(ctx: CapnProtoParser.Enum_contentContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#enum_content}.
	 * @param ctx the parse tree
	 */
	fun exitEnum_content(ctx: CapnProtoParser.Enum_contentContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#named_union_def}.
	 * @param ctx the parse tree
	 */
	fun enterNamed_union_def(ctx: CapnProtoParser.Named_union_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#named_union_def}.
	 * @param ctx the parse tree
	 */
	fun exitNamed_union_def(ctx: CapnProtoParser.Named_union_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#unnamed_union_def}.
	 * @param ctx the parse tree
	 */
	fun enterUnnamed_union_def(ctx: CapnProtoParser.Unnamed_union_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#unnamed_union_def}.
	 * @param ctx the parse tree
	 */
	fun exitUnnamed_union_def(ctx: CapnProtoParser.Unnamed_union_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#union_content}.
	 * @param ctx the parse tree
	 */
	fun enterUnion_content(ctx: CapnProtoParser.Union_contentContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#union_content}.
	 * @param ctx the parse tree
	 */
	fun exitUnion_content(ctx: CapnProtoParser.Union_contentContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#group_def}.
	 * @param ctx the parse tree
	 */
	fun enterGroup_def(ctx: CapnProtoParser.Group_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#group_def}.
	 * @param ctx the parse tree
	 */
	fun exitGroup_def(ctx: CapnProtoParser.Group_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#group_content}.
	 * @param ctx the parse tree
	 */
	fun enterGroup_content(ctx: CapnProtoParser.Group_contentContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#group_content}.
	 * @param ctx the parse tree
	 */
	fun exitGroup_content(ctx: CapnProtoParser.Group_contentContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#function_def}.
	 * @param ctx the parse tree
	 */
	fun enterFunction_def(ctx: CapnProtoParser.Function_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#function_def}.
	 * @param ctx the parse tree
	 */
	fun exitFunction_def(ctx: CapnProtoParser.Function_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#generic_type_parameters}.
	 * @param ctx the parse tree
	 */
	fun enterGeneric_type_parameters(ctx: CapnProtoParser.Generic_type_parametersContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#generic_type_parameters}.
	 * @param ctx the parse tree
	 */
	fun exitGeneric_type_parameters(ctx: CapnProtoParser.Generic_type_parametersContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	fun enterFunction_parameters(ctx: CapnProtoParser.Function_parametersContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	fun exitFunction_parameters(ctx: CapnProtoParser.Function_parametersContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#annotation_def}.
	 * @param ctx the parse tree
	 */
	fun enterAnnotation_def(ctx: CapnProtoParser.Annotation_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#annotation_def}.
	 * @param ctx the parse tree
	 */
	fun exitAnnotation_def(ctx: CapnProtoParser.Annotation_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#annotation_parameters}.
	 * @param ctx the parse tree
	 */
	fun enterAnnotation_parameters(ctx: CapnProtoParser.Annotation_parametersContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#annotation_parameters}.
	 * @param ctx the parse tree
	 */
	fun exitAnnotation_parameters(ctx: CapnProtoParser.Annotation_parametersContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#const_def}.
	 * @param ctx the parse tree
	 */
	fun enterConst_def(ctx: CapnProtoParser.Const_defContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#const_def}.
	 * @param ctx the parse tree
	 */
	fun exitConst_def(ctx: CapnProtoParser.Const_defContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#const_value}.
	 * @param ctx the parse tree
	 */
	fun enterConst_value(ctx: CapnProtoParser.Const_valueContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#const_value}.
	 * @param ctx the parse tree
	 */
	fun exitConst_value(ctx: CapnProtoParser.Const_valueContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#literal_union}.
	 * @param ctx the parse tree
	 */
	fun enterLiteral_union(ctx: CapnProtoParser.Literal_unionContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#literal_union}.
	 * @param ctx the parse tree
	 */
	fun exitLiteral_union(ctx: CapnProtoParser.Literal_unionContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#literal_list}.
	 * @param ctx the parse tree
	 */
	fun enterLiteral_list(ctx: CapnProtoParser.Literal_listContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#literal_list}.
	 * @param ctx the parse tree
	 */
	fun exitLiteral_list(ctx: CapnProtoParser.Literal_listContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#literal_bytes}.
	 * @param ctx the parse tree
	 */
	fun enterLiteral_bytes(ctx: CapnProtoParser.Literal_bytesContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#literal_bytes}.
	 * @param ctx the parse tree
	 */
	fun exitLiteral_bytes(ctx: CapnProtoParser.Literal_bytesContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#union_mapping}.
	 * @param ctx the parse tree
	 */
	fun enterUnion_mapping(ctx: CapnProtoParser.Union_mappingContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#union_mapping}.
	 * @param ctx the parse tree
	 */
	fun exitUnion_mapping(ctx: CapnProtoParser.Union_mappingContext)
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#inner_using}.
	 * @param ctx the parse tree
	 */
	fun enterInner_using(ctx: CapnProtoParser.Inner_usingContext)
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#inner_using}.
	 * @param ctx the parse tree
	 */
	fun exitInner_using(ctx: CapnProtoParser.Inner_usingContext)
}