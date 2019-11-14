// Generated from Nugget.g4 by ANTLR 4.7.1

    // import "../NTypes"

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NuggetParser}.
 */
public interface NuggetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NuggetParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(NuggetParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(NuggetParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#define_assign}.
	 * @param ctx the parse tree
	 */
	void enterDefine_assign(NuggetParser.Define_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#define_assign}.
	 * @param ctx the parse tree
	 */
	void exitDefine_assign(NuggetParser.Define_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(NuggetParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(NuggetParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#define_tuple}.
	 * @param ctx the parse tree
	 */
	void enterDefine_tuple(NuggetParser.Define_tupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#define_tuple}.
	 * @param ctx the parse tree
	 */
	void exitDefine_tuple(NuggetParser.Define_tupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(NuggetParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(NuggetParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#operation_on_singleton}.
	 * @param ctx the parse tree
	 */
	void enterOperation_on_singleton(NuggetParser.Operation_on_singletonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#operation_on_singleton}.
	 * @param ctx the parse tree
	 */
	void exitOperation_on_singleton(NuggetParser.Operation_on_singletonContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#output_as}.
	 * @param ctx the parse tree
	 */
	void enterOutput_as(NuggetParser.Output_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#output_as}.
	 * @param ctx the parse tree
	 */
	void exitOutput_as(NuggetParser.Output_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#output_type}.
	 * @param ctx the parse tree
	 */
	void enterOutput_type(NuggetParser.Output_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#output_type}.
	 * @param ctx the parse tree
	 */
	void exitOutput_type(NuggetParser.Output_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#singleton_op}.
	 * @param ctx the parse tree
	 */
	void enterSingleton_op(NuggetParser.Singleton_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#singleton_op}.
	 * @param ctx the parse tree
	 */
	void exitSingleton_op(NuggetParser.Singleton_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#singleton_var}.
	 * @param ctx the parse tree
	 */
	void enterSingleton_var(NuggetParser.Singleton_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#singleton_var}.
	 * @param ctx the parse tree
	 */
	void exitSingleton_var(NuggetParser.Singleton_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#nugget_type}.
	 * @param ctx the parse tree
	 */
	void enterNugget_type(NuggetParser.Nugget_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#nugget_type}.
	 * @param ctx the parse tree
	 */
	void exitNugget_type(NuggetParser.Nugget_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#nugget_action}.
	 * @param ctx the parse tree
	 */
	void enterNugget_action(NuggetParser.Nugget_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#nugget_action}.
	 * @param ctx the parse tree
	 */
	void exitNugget_action(NuggetParser.Nugget_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#action_word}.
	 * @param ctx the parse tree
	 */
	void enterAction_word(NuggetParser.Action_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#action_word}.
	 * @param ctx the parse tree
	 */
	void exitAction_word(NuggetParser.Action_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#asType}.
	 * @param ctx the parse tree
	 */
	void enterAsType(NuggetParser.AsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#asType}.
	 * @param ctx the parse tree
	 */
	void exitAsType(NuggetParser.AsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#byField}.
	 * @param ctx the parse tree
	 */
	void enterByField(NuggetParser.ByFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#byField}.
	 * @param ctx the parse tree
	 */
	void exitByField(NuggetParser.ByFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#byteOffsetSize}.
	 * @param ctx the parse tree
	 */
	void enterByteOffsetSize(NuggetParser.ByteOffsetSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#byteOffsetSize}.
	 * @param ctx the parse tree
	 */
	void exitByteOffsetSize(NuggetParser.ByteOffsetSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(NuggetParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(NuggetParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuggetParser#filter_term}.
	 * @param ctx the parse tree
	 */
	void enterFilter_term(NuggetParser.Filter_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuggetParser#filter_term}.
	 * @param ctx the parse tree
	 */
	void exitFilter_term(NuggetParser.Filter_termContext ctx);
}