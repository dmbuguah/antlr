// Generated from Nugget.g4 by ANTLR 4.7.1

    // import "../NTypes"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NuggetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		COMPOP=39, LISTOP=40, INT=41, ID=42, STRING=43, WS=44, NL=45, LINE_COMMENT=46;
	public static final int
		RULE_prog = 0, RULE_define_assign = 1, RULE_define = 2, RULE_define_tuple = 3, 
		RULE_assign = 4, RULE_operation_on_singleton = 5, RULE_output_as = 6, 
		RULE_output_type = 7, RULE_singleton_op = 8, RULE_singleton_var = 9, RULE_nugget_type = 10, 
		RULE_nugget_action = 11, RULE_action_word = 12, RULE_asType = 13, RULE_byField = 14, 
		RULE_byteOffsetSize = 15, RULE_filter = 16, RULE_filter_term = 17;
	public static final String[] ruleNames = {
		"prog", "define_assign", "define", "define_tuple", "assign", "operation_on_singleton", 
		"output_as", "output_type", "singleton_op", "singleton_var", "nugget_type", 
		"nugget_action", "action_word", "asType", "byField", "byteOffsetSize", 
		"filter", "filter_term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'tuple['", "','", "']'", "'='", "'|'", "'as'", "'json'", "'type'", 
		"'print'", "'size'", "'typex'", "'printx'", "'raw'", "'string'", "'sha1'", 
		"'md5'", "'ntfs'", "'file'", "'packet'", "'pcap'", "'exifinfo'", "'datetime'", 
		"'memory'", "'http'", "'listof-md5'", "'listof-sha1'", "'listof-sha256'", 
		"'extract'", "'sort'", "'sha256'", "'getGetRequests'", "'diskinfo'", "'union'", 
		"'pslist'", "'%%%'", "'by'", "'['", "'filter'", null, "'[]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "COMPOP", "LISTOP", "INT", "ID", "STRING", "WS", "NL", 
		"LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Nugget.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NuggetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NuggetParser.EOF, 0); }
		public List<Define_assignContext> define_assign() {
			return getRuleContexts(Define_assignContext.class);
		}
		public Define_assignContext define_assign(int i) {
			return getRuleContext(Define_assignContext.class,i);
		}
		public List<Operation_on_singletonContext> operation_on_singleton() {
			return getRuleContexts(Operation_on_singletonContext.class);
		}
		public Operation_on_singletonContext operation_on_singleton(int i) {
			return getRuleContext(Operation_on_singletonContext.class,i);
		}
		public List<Singleton_varContext> singleton_var() {
			return getRuleContexts(Singleton_varContext.class);
		}
		public Singleton_varContext singleton_var(int i) {
			return getRuleContext(Singleton_varContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID))) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36);
					define_assign();
					}
					break;
				case 2:
					{
					setState(37);
					operation_on_singleton();
					}
					break;
				case 3:
					{
					setState(38);
					singleton_var();
					}
					break;
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_assignContext extends ParserRuleContext {
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public Define_tupleContext define_tuple() {
			return getRuleContext(Define_tupleContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Define_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterDefine_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitDefine_assign(this);
		}
	}

	public final Define_assignContext define_assign() throws RecognitionException {
		Define_assignContext _localctx = new Define_assignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_define_assign);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				define();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				define_tuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NuggetParser.ID, 0); }
		public Nugget_typeContext nugget_type() {
			return getRuleContext(Nugget_typeContext.class,0);
		}
		public TerminalNode LISTOP() { return getToken(NuggetParser.LISTOP, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitDefine(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(52);
			nugget_type();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LISTOP) {
				{
				setState(53);
				match(LISTOP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_tupleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NuggetParser.ID, 0); }
		public List<Nugget_typeContext> nugget_type() {
			return getRuleContexts(Nugget_typeContext.class);
		}
		public Nugget_typeContext nugget_type(int i) {
			return getRuleContext(Nugget_typeContext.class,i);
		}
		public TerminalNode LISTOP() { return getToken(NuggetParser.LISTOP, 0); }
		public Define_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterDefine_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitDefine_tuple(this);
		}
	}

	public final Define_tupleContext define_tuple() throws RecognitionException {
		Define_tupleContext _localctx = new Define_tupleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
			setState(57);
			match(T__0);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(58);
					match(T__1);
					}
				}

				setState(61);
				nugget_type();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0) );
			setState(66);
			match(T__2);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LISTOP) {
				{
				setState(67);
				match(LISTOP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(NuggetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NuggetParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(NuggetParser.STRING, 0); }
		public List<Nugget_actionContext> nugget_action() {
			return getRuleContexts(Nugget_actionContext.class);
		}
		public Nugget_actionContext nugget_action(int i) {
			return getRuleContext(Nugget_actionContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(ID);
				setState(71);
				match(T__3);
				setState(72);
				match(STRING);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(73);
					match(T__4);
					setState(74);
					nugget_action();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(ID);
				setState(81);
				match(T__3);
				setState(82);
				match(ID);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(83);
					match(T__4);
					setState(84);
					nugget_action();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operation_on_singletonContext extends ParserRuleContext {
		public Singleton_opContext singleton_op() {
			return getRuleContext(Singleton_opContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(NuggetParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NuggetParser.ID, i);
		}
		public Output_asContext output_as() {
			return getRuleContext(Output_asContext.class,0);
		}
		public Operation_on_singletonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_on_singleton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterOperation_on_singleton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitOperation_on_singleton(this);
		}
	}

	public final Operation_on_singletonContext operation_on_singleton() throws RecognitionException {
		Operation_on_singletonContext _localctx = new Operation_on_singletonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operation_on_singleton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			singleton_op();
			setState(93);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(94);
				match(T__1);
				setState(95);
				match(ID);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(101);
				output_as();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_asContext extends ParserRuleContext {
		public Output_typeContext output_type() {
			return getRuleContext(Output_typeContext.class,0);
		}
		public Output_asContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterOutput_as(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitOutput_as(this);
		}
	}

	public final Output_asContext output_as() throws RecognitionException {
		Output_asContext _localctx = new Output_asContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_output_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__5);
			setState(105);
			output_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_typeContext extends ParserRuleContext {
		public Output_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterOutput_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitOutput_type(this);
		}
	}

	public final Output_typeContext output_type() throws RecognitionException {
		Output_typeContext _localctx = new Output_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_output_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Singleton_opContext extends ParserRuleContext {
		public Singleton_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleton_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterSingleton_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitSingleton_op(this);
		}
	}

	public final Singleton_opContext singleton_op() throws RecognitionException {
		Singleton_opContext _localctx = new Singleton_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleton_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Singleton_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NuggetParser.ID, 0); }
		public Singleton_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleton_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterSingleton_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitSingleton_var(this);
		}
	}

	public final Singleton_varContext singleton_var() throws RecognitionException {
		Singleton_varContext _localctx = new Singleton_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_singleton_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nugget_typeContext extends ParserRuleContext {
		public Nugget_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nugget_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterNugget_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitNugget_type(this);
		}
	}

	public final Nugget_typeContext nugget_type() throws RecognitionException {
		Nugget_typeContext _localctx = new Nugget_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nugget_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nugget_actionContext extends ParserRuleContext {
		public Action_wordContext action_word() {
			return getRuleContext(Action_wordContext.class,0);
		}
		public Nugget_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nugget_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterNugget_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitNugget_action(this);
		}
	}

	public final Nugget_actionContext nugget_action() throws RecognitionException {
		Nugget_actionContext _localctx = new Nugget_actionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nugget_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			action_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Action_wordContext extends ParserRuleContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public AsTypeContext asType() {
			return getRuleContext(AsTypeContext.class,0);
		}
		public ByFieldContext byField() {
			return getRuleContext(ByFieldContext.class,0);
		}
		public TerminalNode ID() { return getToken(NuggetParser.ID, 0); }
		public Action_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterAction_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitAction_word(this);
		}
	}

	public final Action_wordContext action_word() throws RecognitionException {
		Action_wordContext _localctx = new Action_wordContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_action_word);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				filter();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(T__27);
				setState(119);
				asType();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(T__28);
				setState(121);
				byField();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(T__15);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				match(T__32);
				setState(128);
				match(ID);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 10);
				{
				setState(129);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 11);
				{
				setState(130);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsTypeContext extends ParserRuleContext {
		public Nugget_typeContext nugget_type() {
			return getRuleContext(Nugget_typeContext.class,0);
		}
		public ByteOffsetSizeContext byteOffsetSize() {
			return getRuleContext(ByteOffsetSizeContext.class,0);
		}
		public AsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterAsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitAsType(this);
		}
	}

	public final AsTypeContext asType() throws RecognitionException {
		AsTypeContext _localctx = new AsTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__5);
			setState(134);
			nugget_type();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(135);
				byteOffsetSize();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByFieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NuggetParser.ID, 0); }
		public ByFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterByField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitByField(this);
		}
	}

	public final ByFieldContext byField() throws RecognitionException {
		ByFieldContext _localctx = new ByFieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_byField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__35);
			setState(139);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByteOffsetSizeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(NuggetParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(NuggetParser.INT, i);
		}
		public ByteOffsetSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteOffsetSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterByteOffsetSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitByteOffsetSize(this);
		}
	}

	public final ByteOffsetSizeContext byteOffsetSize() throws RecognitionException {
		ByteOffsetSizeContext _localctx = new ByteOffsetSizeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_byteOffsetSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__36);
			setState(142);
			match(INT);
			setState(143);
			match(T__1);
			setState(144);
			match(INT);
			setState(145);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public List<Filter_termContext> filter_term() {
			return getRuleContexts(Filter_termContext.class);
		}
		public Filter_termContext filter_term(int i) {
			return getRuleContext(Filter_termContext.class,i);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__37);
			setState(148);
			filter_term();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(149);
				match(T__1);
				setState(150);
				filter_term();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_termContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NuggetParser.ID, 0); }
		public TerminalNode COMPOP() { return getToken(NuggetParser.COMPOP, 0); }
		public TerminalNode STRING() { return getToken(NuggetParser.STRING, 0); }
		public Filter_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).enterFilter_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuggetListener ) ((NuggetListener)listener).exitFilter_term(this);
		}
	}

	public final Filter_termContext filter_term() throws RecognitionException {
		Filter_termContext _localctx = new Filter_termContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_filter_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(COMPOP);
			setState(158);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00a3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\5\5>\n\5\3\5\6\5A\n\5\r\5\16"+
		"\5B\3\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\5\6]\n\6\3\7\3\7\3\7\3\7\7\7c\n"+
		"\7\f\7\16\7f\13\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0086\n\16\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u009a"+
		"\n\22\f\22\16\22\u009d\13\22\3\23\3\23\3\23\3\23\3\23\2\2\24\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\n\17\3\2\20\35\2\u00aa\2+\3"+
		"\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\b:\3\2\2\2\n\\\3\2\2\2\f^\3\2\2\2\16"+
		"j\3\2\2\2\20m\3\2\2\2\22o\3\2\2\2\24q\3\2\2\2\26s\3\2\2\2\30u\3\2\2\2"+
		"\32\u0085\3\2\2\2\34\u0087\3\2\2\2\36\u008c\3\2\2\2 \u008f\3\2\2\2\"\u0095"+
		"\3\2\2\2$\u009e\3\2\2\2&*\5\4\3\2\'*\5\f\7\2(*\5\24\13\2)&\3\2\2\2)\'"+
		"\3\2\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2."+
		"/\7\2\2\3/\3\3\2\2\2\60\64\5\6\4\2\61\64\5\b\5\2\62\64\5\n\6\2\63\60\3"+
		"\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\7,\2\2\668\5\26"+
		"\f\2\679\7*\2\28\67\3\2\2\289\3\2\2\29\7\3\2\2\2:;\7,\2\2;@\7\3\2\2<>"+
		"\7\4\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\5\26\f\2@=\3\2\2\2AB\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7\5\2\2EG\7*\2\2FE\3\2\2\2FG\3\2\2\2"+
		"G\t\3\2\2\2HI\7,\2\2IJ\7\6\2\2JO\7-\2\2KL\7\7\2\2LN\5\30\r\2MK\3\2\2\2"+
		"NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P]\3\2\2\2QO\3\2\2\2RS\7,\2\2ST\7\6\2\2"+
		"TY\7,\2\2UV\7\7\2\2VX\5\30\r\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z]\3\2\2\2[Y\3\2\2\2\\H\3\2\2\2\\R\3\2\2\2]\13\3\2\2\2^_\5\22\n\2_d\7"+
		",\2\2`a\7\4\2\2ac\7,\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2gi\5\16\b\2hg\3\2\2\2hi\3\2\2\2i\r\3\2\2\2jk\7\b\2\2kl\5"+
		"\20\t\2l\17\3\2\2\2mn\7\t\2\2n\21\3\2\2\2op\t\2\2\2p\23\3\2\2\2qr\7,\2"+
		"\2r\25\3\2\2\2st\t\3\2\2t\27\3\2\2\2uv\5\32\16\2v\31\3\2\2\2w\u0086\5"+
		"\"\22\2xy\7\36\2\2y\u0086\5\34\17\2z{\7\37\2\2{\u0086\5\36\20\2|\u0086"+
		"\7\21\2\2}\u0086\7\22\2\2~\u0086\7 \2\2\177\u0086\7!\2\2\u0080\u0086\7"+
		"\"\2\2\u0081\u0082\7#\2\2\u0082\u0086\7,\2\2\u0083\u0086\7$\2\2\u0084"+
		"\u0086\7%\2\2\u0085w\3\2\2\2\u0085x\3\2\2\2\u0085z\3\2\2\2\u0085|\3\2"+
		"\2\2\u0085}\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2"+
		"\2\u0085\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\33"+
		"\3\2\2\2\u0087\u0088\7\b\2\2\u0088\u008a\5\26\f\2\u0089\u008b\5 \21\2"+
		"\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\35\3\2\2\2\u008c\u008d"+
		"\7&\2\2\u008d\u008e\7,\2\2\u008e\37\3\2\2\2\u008f\u0090\7\'\2\2\u0090"+
		"\u0091\7+\2\2\u0091\u0092\7\4\2\2\u0092\u0093\7+\2\2\u0093\u0094\7\5\2"+
		"\2\u0094!\3\2\2\2\u0095\u0096\7(\2\2\u0096\u009b\5$\23\2\u0097\u0098\7"+
		"\4\2\2\u0098\u009a\5$\23\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c#\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009e\u009f\7,\2\2\u009f\u00a0\7)\2\2\u00a0\u00a1\7-\2\2\u00a1%\3\2\2"+
		"\2\21)+\638=BFOY\\dh\u0085\u008a\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}