// Generated from /Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/RubyC.g4 by ANTLR 4.7
package xpr;
package xpr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RubyCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LITERAL=3, COMMA=4, SEMICOLON=5, CRLF=6, COLON=7, REQUIRE=8, 
		END=9, DEF=10, RETURN=11, PIR=12, NEW=13, DEL=14, VPRE=15, VNUM=16, VALIDATE=17, 
		BELONG=18, CLAS=19, PARENT=20, PUT=21, SELF=22, SAVE=23, TRANS=24, DO=25, 
		REND=26, WEB=27, VGE=28, VGT=29, VLE=30, VLT=31, FALSE=32, TRUE=33, IF=34, 
		ELSE=35, ELSIF=36, UNLESS=37, WHILE=38, RETRY=39, BREAK=40, FOR=41, PLUS=42, 
		MINUS=43, MUL=44, DIV=45, MOD=46, EXP=47, EQUAL=48, NOT_EQUAL=49, GREATER=50, 
		LESS=51, LESS_EQUAL=52, GREATER_EQUAL=53, ASSIGN=54, PLUS_ASSIGN=55, MINUS_ASSIGN=56, 
		MUL_ASSIGN=57, DIV_ASSIGN=58, MOD_ASSIGN=59, EXP_ASSIGN=60, BIT_AND=61, 
		BIT_OR=62, BIT_XOR=63, BIT_NOT=64, BIT_SHL=65, BIT_SHR=66, AND=67, OR=68, 
		NOT=69, DOT=70, LEFT_RBRACKET=71, RIGHT_RBRACKET=72, LEFT_SBRACKET=73, 
		RIGHT_SBRACKET=74, NIL=75, SL_COMMENT=76, ML_COMMENT=77, WS=78, STRING=79, 
		INT=80, FLOAT=81, ID=82, ID_GLOBAL=83, ID_FUNCTION=84;
	public static final int
		RULE_prog = 0, RULE_class_definition = 1, RULE_class_declaration = 2, 
		RULE_class_name = 3, RULE_class_body = 4, RULE_expression = 5, RULE_render_statement = 6, 
		RULE_put_statement = 7, RULE_global_get = 8, RULE_global_set = 9, RULE_global_result = 10, 
		RULE_function_inline_call = 11, RULE_require_block = 12, RULE_pir_inline = 13, 
		RULE_pir_expression_list = 14, RULE_function_definition = 15, RULE_function_definition_body = 16, 
		RULE_trans_statement = 17, RULE_function_definition_header = 18, RULE_function_name = 19, 
		RULE_function_definition_params = 20, RULE_function_definition_params_list = 21, 
		RULE_function_definition_param_id = 22, RULE_new_statement = 23, RULE_remove_statement = 24, 
		RULE_arguments = 25, RULE_validate_presence = 26, RULE_validate_num = 27, 
		RULE_cond_num = 28, RULE_belong_statement = 29, RULE_return_statement = 30, 
		RULE_save_statement = 31, RULE_function_call = 32, RULE_function_call_param_list = 33, 
		RULE_function_call_params = 34, RULE_function_param = 35, RULE_function_unnamed_param = 36, 
		RULE_function_named_param = 37, RULE_function_call_assignment = 38, RULE_all_result = 39, 
		RULE_elsif_statement = 40, RULE_if_elsif_statement = 41, RULE_if_statement = 42, 
		RULE_unless_statement = 43, RULE_while_statement = 44, RULE_for_statement = 45, 
		RULE_init_expression = 46, RULE_all_assignment = 47, RULE_for_init_list = 48, 
		RULE_cond_expression = 49, RULE_loop_expression = 50, RULE_for_loop_list = 51, 
		RULE_statement_body = 52, RULE_statement_expression_list = 53, RULE_assignment = 54, 
		RULE_primary_expr = 55, RULE_dynamic_assignment = 56, RULE_int_assignment = 57, 
		RULE_int_plus = 58, RULE_int_minus = 59, RULE_float_assignment = 60, RULE_string_assignment = 61, 
		RULE_initial_array_assignment = 62, RULE_array_assignment = 63, RULE_array_definition = 64, 
		RULE_array_definition_elements = 65, RULE_array_selector = 66, RULE_dynamic_result = 67, 
		RULE_dynamic = 68, RULE_int_result = 69, RULE_float_result = 70, RULE_string_result = 71, 
		RULE_comparison_list = 72, RULE_comparison = 73, RULE_comp_var = 74, RULE_lvalue = 75, 
		RULE_rvalue = 76, RULE_break_expression = 77, RULE_literal_t = 78, RULE_float_t = 79, 
		RULE_int_t = 80, RULE_bool_t = 81, RULE_nil_t = 82, RULE_id = 83, RULE_id_global = 84, 
		RULE_id_function = 85, RULE_terminator = 86, RULE_else_token = 87, RULE_crlf = 88;
	public static final String[] ruleNames = {
		"prog", "class_definition", "class_declaration", "class_name", "class_body", 
		"expression", "render_statement", "put_statement", "global_get", "global_set", 
		"global_result", "function_inline_call", "require_block", "pir_inline", 
		"pir_expression_list", "function_definition", "function_definition_body", 
		"trans_statement", "function_definition_header", "function_name", "function_definition_params", 
		"function_definition_params_list", "function_definition_param_id", "new_statement", 
		"remove_statement", "arguments", "validate_presence", "validate_num", 
		"cond_num", "belong_statement", "return_statement", "save_statement", 
		"function_call", "function_call_param_list", "function_call_params", "function_param", 
		"function_unnamed_param", "function_named_param", "function_call_assignment", 
		"all_result", "elsif_statement", "if_elsif_statement", "if_statement", 
		"unless_statement", "while_statement", "for_statement", "init_expression", 
		"all_assignment", "for_init_list", "cond_expression", "loop_expression", 
		"for_loop_list", "statement_body", "statement_expression_list", "assignment", 
		"primary_expr", "dynamic_assignment", "int_assignment", "int_plus", "int_minus", 
		"float_assignment", "string_assignment", "initial_array_assignment", "array_assignment", 
		"array_definition", "array_definition_elements", "array_selector", "dynamic_result", 
		"dynamic", "int_result", "float_result", "string_result", "comparison_list", 
		"comparison", "comp_var", "lvalue", "rvalue", "break_expression", "literal_t", 
		"float_t", "int_t", "bool_t", "nil_t", "id", "id_global", "id_function", 
		"terminator", "else_token", "crlf"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", null, "','", "';'", null, "':'", "'require'", "'end'", 
		"'def'", "'return'", "'pir'", "'new'", null, "'validates_presence_of'", 
		"'validates_numericality_of'", "'validates'", "'belongs_to'", "'class'", 
		"'ApplicationController'", "'puts'", "'self'", "'save!'", "'transaction'", 
		"'do'", "'render'", "'json:'", "'greater_than_or_equal_to:'", "'greater_than:'", 
		"'less_than_or_equal_to:'", "'less_than:'", "'false'", "'true'", "'if'", 
		"'else'", "'elsif'", "'unless'", "'while'", "'retry'", "'break'", "'for'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'=='", "'!='", "'>'", "'<'", 
		"'<='", "'>='", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'**='", 
		"'&'", "'|'", "'^'", "'~'", "'<<'", "'>>'", null, null, null, "'.'", "'('", 
		"')'", "'['", "']'", "'nil'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "COLON", "REQUIRE", 
		"END", "DEF", "RETURN", "PIR", "NEW", "DEL", "VPRE", "VNUM", "VALIDATE", 
		"BELONG", "CLAS", "PARENT", "PUT", "SELF", "SAVE", "TRANS", "DO", "REND", 
		"WEB", "VGE", "VGT", "VLE", "VLT", "FALSE", "TRUE", "IF", "ELSE", "ELSIF", 
		"UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "PLUS", "MINUS", "MUL", "DIV", 
		"MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
		"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", 
		"AND", "OR", "NOT", "DOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "STRING", "INT", 
		"FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
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
	public String getGrammarFileName() { return "RubyC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RubyCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<Class_definitionContext> class_definition() {
			return getRuleContexts(Class_definitionContext.class);
		}
		public Class_definitionContext class_definition(int i) {
			return getRuleContext(Class_definitionContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLAS) {
				{
				{
				setState(178);
				class_definition();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON || _la==CRLF) {
					{
					{
					setState(179);
					terminator(0);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(189);
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

	public static class Class_definitionContext extends ParserRuleContext {
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyCParser.END, 0); }
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitClass_definition(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			class_declaration();
			setState(191);
			class_body();
			setState(192);
			match(END);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLAS() { return getToken(RubyCParser.CLAS, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode LESS() { return getToken(RubyCParser.LESS, 0); }
		public TerminalNode PARENT() { return getToken(RubyCParser.PARENT, 0); }
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitClass_declaration(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(CLAS);
			setState(195);
			class_name();
			setState(196);
			match(LESS);
			setState(197);
			match(PARENT);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				crlf();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CRLF );
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

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RubyCParser.ID, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << REQUIRE) | (1L << DEF) | (1L << RETURN) | (1L << PIR) | (1L << VPRE) | (1L << VNUM) | (1L << BELONG) | (1L << PUT) | (1L << SELF) | (1L << REND) | (1L << FALSE) | (1L << TRUE) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BIT_NOT - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_RBRACKET - 64)) | (1L << (NIL - 64)) | (1L << (INT - 64)) | (1L << (FLOAT - 64)) | (1L << (ID - 64)) | (1L << (ID_GLOBAL - 64)) | (1L << (ID_FUNCTION - 64)))) != 0)) {
				{
				{
				setState(205);
				expression();
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					terminator(0);
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEMICOLON || _la==CRLF );
				}
				}
				setState(215);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Pir_inlineContext pir_inline() {
			return getRuleContext(Pir_inlineContext.class,0);
		}
		public Validate_presenceContext validate_presence() {
			return getRuleContext(Validate_presenceContext.class,0);
		}
		public Validate_numContext validate_num() {
			return getRuleContext(Validate_numContext.class,0);
		}
		public Belong_statementContext belong_statement() {
			return getRuleContext(Belong_statementContext.class,0);
		}
		public Put_statementContext put_statement() {
			return getRuleContext(Put_statementContext.class,0);
		}
		public Render_statementContext render_statement() {
			return getRuleContext(Render_statementContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				function_inline_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				require_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				unless_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				rvalue(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				for_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(225);
				pir_inline();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(226);
				validate_presence();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(227);
				validate_num();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(228);
				belong_statement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(229);
				put_statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(230);
				return_statement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(231);
				render_statement();
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

	public static class Render_statementContext extends ParserRuleContext {
		public TerminalNode REND() { return getToken(RubyCParser.REND, 0); }
		public TerminalNode WEB() { return getToken(RubyCParser.WEB, 0); }
		public TerminalNode ID_FUNCTION() { return getToken(RubyCParser.ID_FUNCTION, 0); }
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Render_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_render_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterRender_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitRender_statement(this);
		}
	}

	public final Render_statementContext render_statement() throws RecognitionException {
		Render_statementContext _localctx = new Render_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_render_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(REND);
			setState(235);
			match(WEB);
			setState(236);
			match(T__0);
			setState(237);
			match(ID_FUNCTION);
			setState(238);
			bool_t();
			setState(239);
			match(T__1);
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

	public static class Put_statementContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(RubyCParser.PUT, 0); }
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Put_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterPut_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitPut_statement(this);
		}
	}

	public final Put_statementContext put_statement() throws RecognitionException {
		Put_statementContext _localctx = new Put_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_put_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PUT);
			setState(242);
			string_result(0);
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

	public static class Global_getContext extends ParserRuleContext {
		public LvalueContext var_name;
		public Token op;
		public Id_globalContext global_name;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyCParser.ASSIGN, 0); }
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterGlobal_get(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitGlobal_get(this);
		}
	}

	public final Global_getContext global_get() throws RecognitionException {
		Global_getContext _localctx = new Global_getContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_global_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			((Global_getContext)_localctx).var_name = lvalue();
			setState(245);
			((Global_getContext)_localctx).op = match(ASSIGN);
			setState(246);
			((Global_getContext)_localctx).global_name = id_global();
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

	public static class Global_setContext extends ParserRuleContext {
		public Id_globalContext global_name;
		public Token op;
		public All_resultContext result;
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyCParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Global_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterGlobal_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitGlobal_set(this);
		}
	}

	public final Global_setContext global_set() throws RecognitionException {
		Global_setContext _localctx = new Global_setContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_global_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((Global_setContext)_localctx).global_name = id_global();
			setState(249);
			((Global_setContext)_localctx).op = match(ASSIGN);
			setState(250);
			((Global_setContext)_localctx).result = all_result();
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

	public static class Global_resultContext extends ParserRuleContext {
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterGlobal_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitGlobal_result(this);
		}
	}

	public final Global_resultContext global_result() throws RecognitionException {
		Global_resultContext _localctx = new Global_resultContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_global_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			id_global();
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

	public static class Function_inline_callContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_inline_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_inline_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_inline_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_inline_call(this);
		}
	}

	public final Function_inline_callContext function_inline_call() throws RecognitionException {
		Function_inline_callContext _localctx = new Function_inline_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_inline_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			function_call();
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

	public static class Require_blockContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(RubyCParser.REQUIRE, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Require_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterRequire_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitRequire_block(this);
		}
	}

	public final Require_blockContext require_block() throws RecognitionException {
		Require_blockContext _localctx = new Require_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_require_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(REQUIRE);
			setState(257);
			literal_t();
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

	public static class Pir_inlineContext extends ParserRuleContext {
		public TerminalNode PIR() { return getToken(RubyCParser.PIR, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Pir_expression_listContext pir_expression_list() {
			return getRuleContext(Pir_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyCParser.END, 0); }
		public Pir_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterPir_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitPir_inline(this);
		}
	}

	public final Pir_inlineContext pir_inline() throws RecognitionException {
		Pir_inlineContext _localctx = new Pir_inlineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pir_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PIR);
			setState(260);
			crlf();
			setState(261);
			pir_expression_list();
			setState(262);
			match(END);
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

	public static class Pir_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Pir_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterPir_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitPir_expression_list(this);
		}
	}

	public final Pir_expression_listContext pir_expression_list() throws RecognitionException {
		Pir_expression_listContext _localctx = new Pir_expression_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pir_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			expression();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyCParser.END, 0); }
		public List<Function_definition_bodyContext> function_definition_body() {
			return getRuleContexts(Function_definition_bodyContext.class);
		}
		public Function_definition_bodyContext function_definition_body(int i) {
			return getRuleContext(Function_definition_bodyContext.class,i);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			function_definition_header();
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					function_definition_body();
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CRLF) {
				{
				{
				setState(273);
				crlf();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(END);
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

	public static class Function_definition_bodyContext extends ParserRuleContext {
		public Put_statementContext put_statement() {
			return getRuleContext(Put_statementContext.class,0);
		}
		public New_statementContext new_statement() {
			return getRuleContext(New_statementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Remove_statementContext remove_statement() {
			return getRuleContext(Remove_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Trans_statementContext trans_statement() {
			return getRuleContext(Trans_statementContext.class,0);
		}
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Save_statementContext save_statement() {
			return getRuleContext(Save_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Render_statementContext render_statement() {
			return getRuleContext(Render_statementContext.class,0);
		}
		public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_definition_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_definition_body(this);
		}
	}

	public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
		Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_definition_body);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				put_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				new_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				crlf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				remove_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				return_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				trans_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				function_inline_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(289);
				save_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(290);
				if_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(291);
				render_statement();
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

	public static class Trans_statementContext extends ParserRuleContext {
		public TerminalNode TRANS() { return getToken(RubyCParser.TRANS, 0); }
		public TerminalNode DO() { return getToken(RubyCParser.DO, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyCParser.END, 0); }
		public List<Function_definition_bodyContext> function_definition_body() {
			return getRuleContexts(Function_definition_bodyContext.class);
		}
		public Function_definition_bodyContext function_definition_body(int i) {
			return getRuleContext(Function_definition_bodyContext.class,i);
		}
		public Trans_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trans_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterTrans_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitTrans_statement(this);
		}
	}

	public final Trans_statementContext trans_statement() throws RecognitionException {
		Trans_statementContext _localctx = new Trans_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_trans_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(TRANS);
			setState(295);
			match(DO);
			setState(296);
			crlf();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CRLF) | (1L << RETURN) | (1L << NEW) | (1L << DEL) | (1L << PUT) | (1L << SELF) | (1L << SAVE) | (1L << TRANS) | (1L << REND) | (1L << IF))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ID - 82)) | (1L << (ID_GLOBAL - 82)) | (1L << (ID_FUNCTION - 82)))) != 0)) {
				{
				{
				setState(297);
				function_definition_body();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(END);
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

	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RubyCParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_definition_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_definition_header(this);
		}
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_definition_header);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(DEF);
				setState(306);
				function_name();
				setState(307);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(DEF);
				setState(310);
				function_name();
				setState(311);
				function_definition_params();
				setState(312);
				crlf();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_name);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				id_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				id();
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

	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyCParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyCParser.RIGHT_RBRACKET, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyCParser.COMMA, i);
		}
		public List<Function_definition_param_idContext> function_definition_param_id() {
			return getRuleContexts(Function_definition_param_idContext.class);
		}
		public Function_definition_param_idContext function_definition_param_id(int i) {
			return getRuleContext(Function_definition_param_idContext.class,i);
		}
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_definition_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_definition_params(this);
		}
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_definition_params);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(LEFT_RBRACKET);
				setState(321);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(LEFT_RBRACKET);
				setState(323);
				id();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(324);
					match(COMMA);
					setState(325);
					function_definition_param_id();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(331);
				match(RIGHT_RBRACKET);
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

	public static class Function_definition_params_listContext extends ParserRuleContext {
		public Function_definition_param_idContext function_definition_param_id() {
			return getRuleContext(Function_definition_param_idContext.class,0);
		}
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyCParser.COMMA, 0); }
		public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_definition_params_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_definition_params_list(this);
		}
	}

	public final Function_definition_params_listContext function_definition_params_list() throws RecognitionException {
		return function_definition_params_list(0);
	}

	private Function_definition_params_listContext function_definition_params_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_definition_params_listContext _localctx = new Function_definition_params_listContext(_ctx, _parentState);
		Function_definition_params_listContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_function_definition_params_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(336);
			function_definition_param_id();
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_definition_params_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
					setState(338);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(339);
					match(COMMA);
					setState(340);
					function_definition_param_id();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_definition_param_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_definition_param_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_param_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_definition_param_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_definition_param_id(this);
		}
	}

	public final Function_definition_param_idContext function_definition_param_id() throws RecognitionException {
		Function_definition_param_idContext _localctx = new Function_definition_param_idContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_definition_param_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			id();
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

	public static class New_statementContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(RubyCParser.NEW, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyCParser.LEFT_RBRACKET, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyCParser.RIGHT_RBRACKET, 0); }
		public New_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterNew_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitNew_statement(this);
		}
	}

	public final New_statementContext new_statement() throws RecognitionException {
		New_statementContext _localctx = new New_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_new_statement);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(NEW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(NEW);
				setState(350);
				match(LEFT_RBRACKET);
				setState(351);
				arguments();
				setState(352);
				match(RIGHT_RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				match(NEW);
				setState(355);
				match(LEFT_RBRACKET);
				setState(356);
				match(RIGHT_RBRACKET);
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

	public static class Remove_statementContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(RubyCParser.DEL, 0); }
		public Remove_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterRemove_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitRemove_statement(this);
		}
	}

	public final Remove_statementContext remove_statement() throws RecognitionException {
		Remove_statementContext _localctx = new Remove_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_remove_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(DEL);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyCParser.COMMA, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(361);
				match(COMMA);
				setState(362);
				id();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			lvalue();
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

	public static class Validate_presenceContext extends ParserRuleContext {
		public TerminalNode VPRE() { return getToken(RubyCParser.VPRE, 0); }
		public List<TerminalNode> ID_GLOBAL() { return getTokens(RubyCParser.ID_GLOBAL); }
		public TerminalNode ID_GLOBAL(int i) {
			return getToken(RubyCParser.ID_GLOBAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyCParser.COMMA, i);
		}
		public Validate_presenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validate_presence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterValidate_presence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitValidate_presence(this);
		}
	}

	public final Validate_presenceContext validate_presence() throws RecognitionException {
		Validate_presenceContext _localctx = new Validate_presenceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_validate_presence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(VPRE);
			setState(371);
			match(ID_GLOBAL);
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					match(COMMA);
					setState(373);
					match(ID_GLOBAL);
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Validate_numContext extends ParserRuleContext {
		public TerminalNode VNUM() { return getToken(RubyCParser.VNUM, 0); }
		public TerminalNode ID_GLOBAL() { return getToken(RubyCParser.ID_GLOBAL, 0); }
		public TerminalNode COMMA() { return getToken(RubyCParser.COMMA, 0); }
		public Cond_numContext cond_num() {
			return getRuleContext(Cond_numContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Validate_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validate_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterValidate_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitValidate_num(this);
		}
	}

	public final Validate_numContext validate_num() throws RecognitionException {
		Validate_numContext _localctx = new Validate_numContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_validate_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(VNUM);
			setState(380);
			match(ID_GLOBAL);
			setState(381);
			match(COMMA);
			setState(382);
			cond_num();
			setState(383);
			rvalue(0);
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

	public static class Cond_numContext extends ParserRuleContext {
		public TerminalNode VGE() { return getToken(RubyCParser.VGE, 0); }
		public TerminalNode VGT() { return getToken(RubyCParser.VGT, 0); }
		public TerminalNode VLE() { return getToken(RubyCParser.VLE, 0); }
		public TerminalNode VLT() { return getToken(RubyCParser.VLT, 0); }
		public Cond_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterCond_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitCond_num(this);
		}
	}

	public final Cond_numContext cond_num() throws RecognitionException {
		Cond_numContext _localctx = new Cond_numContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cond_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VGE) | (1L << VGT) | (1L << VLE) | (1L << VLT))) != 0)) ) {
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

	public static class Belong_statementContext extends ParserRuleContext {
		public TerminalNode BELONG() { return getToken(RubyCParser.BELONG, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Belong_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belong_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterBelong_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitBelong_statement(this);
		}
	}

	public final Belong_statementContext belong_statement() throws RecognitionException {
		Belong_statementContext _localctx = new Belong_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_belong_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(BELONG);
			setState(388);
			lvalue();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(RubyCParser.RETURN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(RETURN);
			setState(391);
			all_result();
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

	public static class Save_statementContext extends ParserRuleContext {
		public TerminalNode SAVE() { return getToken(RubyCParser.SAVE, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RubyCParser.DOT, 0); }
		public Save_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterSave_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitSave_statement(this);
		}
	}

	public final Save_statementContext save_statement() throws RecognitionException {
		Save_statementContext _localctx = new Save_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_save_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(393);
				class_name();
				setState(394);
				match(DOT);
				}
			}

			setState(398);
			match(SAVE);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext name;
		public Function_call_param_listContext params;
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyCParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyCParser.RIGHT_RBRACKET, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_call_param_listContext function_call_param_list() {
			return getRuleContext(Function_call_param_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_call);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				((Function_callContext)_localctx).name = function_name();
				setState(401);
				match(LEFT_RBRACKET);
				setState(402);
				((Function_callContext)_localctx).params = function_call_param_list();
				setState(403);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				((Function_callContext)_localctx).name = function_name();
				setState(406);
				((Function_callContext)_localctx).params = function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				((Function_callContext)_localctx).name = function_name();
				setState(409);
				match(LEFT_RBRACKET);
				setState(410);
				match(RIGHT_RBRACKET);
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

	public static class Function_call_param_listContext extends ParserRuleContext {
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_call_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_call_param_list(this);
		}
	}

	public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
		Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			function_call_params();
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

	public static class Function_call_paramsContext extends ParserRuleContext {
		public List<Function_paramContext> function_param() {
			return getRuleContexts(Function_paramContext.class);
		}
		public Function_paramContext function_param(int i) {
			return getRuleContext(Function_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RubyCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RubyCParser.COMMA, i);
		}
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_call_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_call_params(this);
		}
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_call_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			function_param();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					match(COMMA);
					setState(418);
					function_param();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Function_paramContext extends ParserRuleContext {
		public Function_unnamed_paramContext function_unnamed_param() {
			return getRuleContext(Function_unnamed_paramContext.class,0);
		}
		public Function_named_paramContext function_named_param() {
			return getRuleContext(Function_named_paramContext.class,0);
		}
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_param(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(424);
				function_unnamed_param();
				}
				break;
			case 2:
				{
				setState(425);
				function_named_param();
				}
				break;
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

	public static class Function_unnamed_paramContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_unnamed_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_unnamed_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_unnamed_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_unnamed_param(this);
		}
	}

	public final Function_unnamed_paramContext function_unnamed_param() throws RecognitionException {
		Function_unnamed_paramContext _localctx = new Function_unnamed_paramContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_unnamed_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(428);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(429);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(430);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(431);
				dynamic_result(0);
				}
				break;
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

	public static class Function_named_paramContext extends ParserRuleContext {
		public Token op;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyCParser.ASSIGN, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_named_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_named_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_named_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_named_param(this);
		}
	}

	public final Function_named_paramContext function_named_param() throws RecognitionException {
		Function_named_paramContext _localctx = new Function_named_paramContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_named_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			id();
			setState(435);
			((Function_named_paramContext)_localctx).op = match(ASSIGN);
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(436);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(437);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(438);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(439);
				dynamic_result(0);
				}
				break;
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

	public static class Function_call_assignmentContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_call_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFunction_call_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFunction_call_assignment(this);
		}
	}

	public final Function_call_assignmentContext function_call_assignment() throws RecognitionException {
		Function_call_assignmentContext _localctx = new Function_call_assignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function_call_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			function_call();
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

	public static class All_resultContext extends ParserRuleContext {
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public List<String_resultContext> string_result() {
			return getRuleContexts(String_resultContext.class);
		}
		public String_resultContext string_result(int i) {
			return getRuleContext(String_resultContext.class,i);
		}
		public List<Dynamic_resultContext> dynamic_result() {
			return getRuleContexts(Dynamic_resultContext.class);
		}
		public Dynamic_resultContext dynamic_result(int i) {
			return getRuleContext(Dynamic_resultContext.class,i);
		}
		public List<Global_resultContext> global_result() {
			return getRuleContexts(Global_resultContext.class);
		}
		public Global_resultContext global_result(int i) {
			return getRuleContext(Global_resultContext.class,i);
		}
		public List<Bool_tContext> bool_t() {
			return getRuleContexts(Bool_tContext.class);
		}
		public Bool_tContext bool_t(int i) {
			return getRuleContext(Bool_tContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public All_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterAll_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitAll_result(this);
		}
	}

	public final All_resultContext all_result() throws RecognitionException {
		All_resultContext _localctx = new All_resultContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_all_result);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(450);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(444);
						int_result(0);
						}
						break;
					case 2:
						{
						setState(445);
						float_result(0);
						}
						break;
					case 3:
						{
						setState(446);
						string_result(0);
						}
						break;
					case 4:
						{
						setState(447);
						dynamic_result(0);
						}
						break;
					case 5:
						{
						setState(448);
						global_result();
						}
						break;
					case 6:
						{
						setState(449);
						bool_t();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(452); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(454);
				expression();
				}
				break;
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

	public static class Elsif_statementContext extends ParserRuleContext {
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterElsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitElsif_statement(this);
		}
	}

	public final Elsif_statementContext elsif_statement() throws RecognitionException {
		Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			if_elsif_statement();
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

	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(RubyCParser.ELSIF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterIf_elsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitIf_elsif_statement(this);
		}
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_if_elsif_statement);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(ELSIF);
				setState(460);
				cond_expression();
				setState(461);
				crlf();
				setState(462);
				statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(ELSIF);
				setState(465);
				cond_expression();
				setState(466);
				crlf();
				setState(467);
				statement_body();
				setState(468);
				else_token();
				setState(469);
				crlf();
				setState(470);
				statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				match(ELSIF);
				setState(473);
				cond_expression();
				setState(474);
				crlf();
				setState(475);
				statement_body();
				setState(476);
				if_elsif_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RubyCParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyCParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_if_statement);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(IF);
				setState(481);
				cond_expression();
				setState(482);
				crlf();
				setState(483);
				statement_body();
				setState(484);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(IF);
				setState(487);
				cond_expression();
				setState(488);
				crlf();
				setState(489);
				statement_body();
				setState(490);
				else_token();
				setState(491);
				crlf();
				setState(492);
				statement_body();
				setState(493);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(IF);
				setState(496);
				cond_expression();
				setState(497);
				crlf();
				setState(498);
				statement_body();
				setState(499);
				elsif_statement();
				setState(500);
				match(END);
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

	public static class Unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(RubyCParser.UNLESS, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyCParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterUnless_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitUnless_statement(this);
		}
	}

	public final Unless_statementContext unless_statement() throws RecognitionException {
		Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unless_statement);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(UNLESS);
				setState(505);
				cond_expression();
				setState(506);
				crlf();
				setState(507);
				statement_body();
				setState(508);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(UNLESS);
				setState(511);
				cond_expression();
				setState(512);
				crlf();
				setState(513);
				statement_body();
				setState(514);
				else_token();
				setState(515);
				crlf();
				setState(516);
				statement_body();
				setState(517);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				match(UNLESS);
				setState(520);
				cond_expression();
				setState(521);
				crlf();
				setState(522);
				statement_body();
				setState(523);
				elsif_statement();
				setState(524);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(526);
				match(UNLESS);
				setState(527);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				match(UNLESS);
				setState(529);
				id();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RubyCParser.WHILE, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyCParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(WHILE);
			setState(533);
			cond_expression();
			setState(534);
			crlf();
			setState(535);
			statement_body();
			setState(536);
			match(END);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RubyCParser.FOR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyCParser.LEFT_RBRACKET, 0); }
		public Init_expressionContext init_expression() {
			return getRuleContext(Init_expressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RubyCParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RubyCParser.SEMICOLON, i);
		}
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyCParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyCParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_for_statement);
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(FOR);
				setState(539);
				match(LEFT_RBRACKET);
				setState(540);
				init_expression();
				setState(541);
				match(SEMICOLON);
				setState(542);
				cond_expression();
				setState(543);
				match(SEMICOLON);
				setState(544);
				loop_expression();
				setState(545);
				match(RIGHT_RBRACKET);
				setState(546);
				crlf();
				setState(547);
				statement_body();
				setState(548);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(FOR);
				setState(551);
				init_expression();
				setState(552);
				match(SEMICOLON);
				setState(553);
				cond_expression();
				setState(554);
				match(SEMICOLON);
				setState(555);
				loop_expression();
				setState(556);
				crlf();
				setState(557);
				statement_body();
				setState(558);
				match(END);
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

	public static class Init_expressionContext extends ParserRuleContext {
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public Init_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterInit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitInit_expression(this);
		}
	}

	public final Init_expressionContext init_expression() throws RecognitionException {
		Init_expressionContext _localctx = new Init_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_init_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			for_init_list(0);
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

	public static class All_assignmentContext extends ParserRuleContext {
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public All_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterAll_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitAll_assignment(this);
		}
	}

	public final All_assignmentContext all_assignment() throws RecognitionException {
		All_assignmentContext _localctx = new All_assignmentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_all_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(564);
				int_assignment();
				}
				break;
			case 2:
				{
				setState(565);
				float_assignment();
				}
				break;
			case 3:
				{
				setState(566);
				string_assignment();
				}
				break;
			case 4:
				{
				setState(567);
				dynamic_assignment();
				}
				break;
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

	public static class For_init_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyCParser.COMMA, 0); }
		public For_init_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFor_init_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFor_init_list(this);
		}
	}

	public final For_init_listContext for_init_list() throws RecognitionException {
		return for_init_list(0);
	}

	private For_init_listContext for_init_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_init_listContext _localctx = new For_init_listContext(_ctx, _parentState);
		For_init_listContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_for_init_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(571);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_init_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_init_list);
					setState(573);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(574);
					match(COMMA);
					setState(575);
					all_assignment();
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cond_expressionContext extends ParserRuleContext {
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterCond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitCond_expression(this);
		}
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cond_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			comparison_list();
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

	public static class Loop_expressionContext extends ParserRuleContext {
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterLoop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitLoop_expression(this);
		}
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			for_loop_list(0);
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

	public static class For_loop_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyCParser.COMMA, 0); }
		public For_loop_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFor_loop_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFor_loop_list(this);
		}
	}

	public final For_loop_listContext for_loop_list() throws RecognitionException {
		return for_loop_list(0);
	}

	private For_loop_listContext for_loop_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_loop_listContext _localctx = new For_loop_listContext(_ctx, _parentState);
		For_loop_listContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_for_loop_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(586);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_loop_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_loop_list);
					setState(588);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(589);
					match(COMMA);
					setState(590);
					all_assignment();
					}
					} 
				}
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Statement_bodyContext extends ParserRuleContext {
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitStatement_body(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			statement_expression_list(0);
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

	public static class Statement_expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(RubyCParser.RETRY, 0); }
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterStatement_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitStatement_expression_list(this);
		}
	}

	public final Statement_expression_listContext statement_expression_list() throws RecognitionException {
		return statement_expression_list(0);
	}

	private Statement_expression_listContext statement_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_expression_listContext _localctx = new Statement_expression_listContext(_ctx, _parentState);
		Statement_expression_listContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(599);
				expression();
				setState(600);
				terminator(0);
				}
				break;
			case 2:
				{
				setState(602);
				match(RETRY);
				setState(603);
				terminator(0);
				}
				break;
			case 3:
				{
				setState(604);
				break_expression();
				setState(605);
				terminator(0);
				}
				break;
			case 4:
				{
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(607);
						expression();
						}
						} 
					}
					setState(612);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(626);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(615);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(616);
						expression();
						setState(617);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(619);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(620);
						match(RETRY);
						setState(621);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(622);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(623);
						break_expression();
						setState(624);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Primary_exprContext primary_expr() {
			return getRuleContext(Primary_exprContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(RubyCParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(RubyCParser.ASSIGN, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			((AssignmentContext)_localctx).var_id = lvalue();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGN) {
				{
				{
				setState(632);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
			primary_expr();
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

	public static class Primary_exprContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Int_plusContext int_plus() {
			return getRuleContext(Int_plusContext.class,0);
		}
		public Int_minusContext int_minus() {
			return getRuleContext(Int_minusContext.class,0);
		}
		public New_statementContext new_statement() {
			return getRuleContext(New_statementContext.class,0);
		}
		public Primary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterPrimary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitPrimary_expr(this);
		}
	}

	public final Primary_exprContext primary_expr() throws RecognitionException {
		Primary_exprContext _localctx = new Primary_exprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primary_expr);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				int_plus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				int_minus();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				new_statement();
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

	public static class Dynamic_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyCParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyCParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyCParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyCParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyCParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyCParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyCParser.EXP_ASSIGN, 0); }
		public Dynamic_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterDynamic_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitDynamic_assignment(this);
		}
	}

	public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
		Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_dynamic_assignment);
		int _la;
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(647);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(648);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(651);
				((Dynamic_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Dynamic_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(652);
				dynamic_result(0);
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

	public static class Int_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyCParser.ASSIGN, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterInt_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitInt_assignment(this);
		}
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_int_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			((Int_assignmentContext)_localctx).var_id = lvalue();
			setState(657);
			((Int_assignmentContext)_localctx).op = match(ASSIGN);
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(658);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(659);
				dynamic_result(0);
				}
				break;
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

	public static class Int_plusContext extends ParserRuleContext {
		public LvalueContext var_id;
		public TerminalNode PLUS() { return getToken(RubyCParser.PLUS, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyCParser.PLUS_ASSIGN, 0); }
		public Int_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterInt_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitInt_plus(this);
		}
	}

	public final Int_plusContext int_plus() throws RecognitionException {
		Int_plusContext _localctx = new Int_plusContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_int_plus);
		try {
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				((Int_plusContext)_localctx).var_id = lvalue();
				setState(663);
				match(PLUS);
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(664);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(665);
					dynamic_result(0);
					}
					break;
				}
				}
				break;
			case PLUS_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(PLUS_ASSIGN);
				setState(671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(669);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(670);
					dynamic_result(0);
					}
					break;
				}
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

	public static class Int_minusContext extends ParserRuleContext {
		public LvalueContext var_id;
		public TerminalNode MINUS() { return getToken(RubyCParser.MINUS, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyCParser.MINUS_ASSIGN, 0); }
		public Int_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterInt_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitInt_minus(this);
		}
	}

	public final Int_minusContext int_minus() throws RecognitionException {
		Int_minusContext _localctx = new Int_minusContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_int_minus);
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				((Int_minusContext)_localctx).var_id = lvalue();
				setState(676);
				match(MINUS);
				setState(679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(677);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(678);
					dynamic_result(0);
					}
					break;
				}
				}
				break;
			case MINUS_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				match(MINUS_ASSIGN);
				setState(684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(682);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(683);
					dynamic_result(0);
					}
					break;
				}
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

	public static class Float_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyCParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyCParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyCParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyCParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyCParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyCParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyCParser.EXP_ASSIGN, 0); }
		public Float_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFloat_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFloat_assignment(this);
		}
	}

	public final Float_assignmentContext float_assignment() throws RecognitionException {
		Float_assignmentContext _localctx = new Float_assignmentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_float_assignment);
		int _la;
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(689);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(690);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(693);
				((Float_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Float_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(694);
				float_result(0);
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

	public static class String_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyCParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyCParser.PLUS_ASSIGN, 0); }
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterString_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitString_assignment(this);
		}
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_string_assignment);
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(699);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(700);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(703);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(704);
				string_result(0);
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

	public static class Initial_array_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyCParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyCParser.RIGHT_SBRACKET, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyCParser.ASSIGN, 0); }
		public Initial_array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterInitial_array_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitInitial_array_assignment(this);
		}
	}

	public final Initial_array_assignmentContext initial_array_assignment() throws RecognitionException {
		Initial_array_assignmentContext _localctx = new Initial_array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_initial_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			((Initial_array_assignmentContext)_localctx).var_id = lvalue();
			setState(709);
			((Initial_array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(710);
			match(LEFT_SBRACKET);
			setState(711);
			match(RIGHT_SBRACKET);
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

	public static class Array_assignmentContext extends ParserRuleContext {
		public Array_selectorContext arr_def;
		public Token op;
		public All_resultContext arr_val;
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyCParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterArray_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitArray_assignment(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			((Array_assignmentContext)_localctx).arr_def = array_selector();
			setState(714);
			((Array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(715);
			((Array_assignmentContext)_localctx).arr_val = all_result();
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

	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyCParser.LEFT_SBRACKET, 0); }
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyCParser.RIGHT_SBRACKET, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitArray_definition(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(LEFT_SBRACKET);
			setState(718);
			array_definition_elements(0);
			setState(719);
			match(RIGHT_SBRACKET);
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

	public static class Array_definition_elementsContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyCParser.COMMA, 0); }
		public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterArray_definition_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitArray_definition_elements(this);
		}
	}

	public final Array_definition_elementsContext array_definition_elements() throws RecognitionException {
		return array_definition_elements(0);
	}

	private Array_definition_elementsContext array_definition_elements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_definition_elementsContext _localctx = new Array_definition_elementsContext(_ctx, _parentState);
		Array_definition_elementsContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(722);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(723);
				dynamic_result(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
					setState(726);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(727);
					match(COMMA);
					setState(730);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(728);
						int_result(0);
						}
						break;
					case 2:
						{
						setState(729);
						dynamic_result(0);
						}
						break;
					}
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Array_selectorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyCParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyCParser.RIGHT_SBRACKET, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Array_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterArray_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitArray_selector(this);
		}
	}

	public final Array_selectorContext array_selector() throws RecognitionException {
		Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_array_selector);
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				id();
				setState(738);
				match(LEFT_SBRACKET);
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(739);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(740);
					dynamic_result(0);
					}
					break;
				}
				setState(743);
				match(RIGHT_SBRACKET);
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				id_global();
				setState(746);
				match(LEFT_SBRACKET);
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(747);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(748);
					dynamic_result(0);
					}
					break;
				}
				setState(751);
				match(RIGHT_SBRACKET);
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

	public static class Dynamic_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Dynamic_resultContext> dynamic_result() {
			return getRuleContexts(Dynamic_resultContext.class);
		}
		public Dynamic_resultContext dynamic_result(int i) {
			return getRuleContext(Dynamic_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyCParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyCParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyCParser.MOD, 0); }
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RubyCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyCParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyCParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyCParser.RIGHT_RBRACKET, 0); }
		public DynamicContext dynamic() {
			return getRuleContext(DynamicContext.class,0);
		}
		public Dynamic_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterDynamic_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitDynamic_result(this);
		}
	}

	public final Dynamic_resultContext dynamic_result() throws RecognitionException {
		return dynamic_result(0);
	}

	private Dynamic_resultContext dynamic_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dynamic_resultContext _localctx = new Dynamic_resultContext(_ctx, _parentState);
		Dynamic_resultContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_dynamic_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(756);
				int_result(0);
				setState(757);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(758);
				dynamic_result(13);
				}
				break;
			case 2:
				{
				setState(760);
				float_result(0);
				setState(761);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(762);
				dynamic_result(11);
				}
				break;
			case 3:
				{
				setState(764);
				string_result(0);
				setState(765);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(766);
				dynamic_result(8);
				}
				break;
			case 4:
				{
				setState(768);
				int_result(0);
				setState(769);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(770);
				dynamic_result(6);
				}
				break;
			case 5:
				{
				setState(772);
				float_result(0);
				setState(773);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(774);
				dynamic_result(4);
				}
				break;
			case 6:
				{
				setState(776);
				match(LEFT_RBRACKET);
				setState(777);
				dynamic_result(0);
				setState(778);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(780);
				dynamic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(804);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(783);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(784);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(785);
						dynamic_result(11);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(786);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(787);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(788);
						dynamic_result(4);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(789);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(790);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(791);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(792);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(793);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(794);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(795);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(796);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(797);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(798);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(799);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(800);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(801);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(802);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(803);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DynamicContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_call_assignmentContext function_call_assignment() {
			return getRuleContext(Function_call_assignmentContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public DynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterDynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitDynamic(this);
		}
	}

	public final DynamicContext dynamic() throws RecognitionException {
		DynamicContext _localctx = new DynamicContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_dynamic);
		try {
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				function_call_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(811);
				array_selector();
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

	public static class Int_resultContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyCParser.LEFT_RBRACKET, 0); }
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyCParser.RIGHT_RBRACKET, 0); }
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RubyCParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyCParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyCParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyCParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterInt_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitInt_result(this);
		}
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(815);
				match(LEFT_RBRACKET);
				setState(816);
				int_result(0);
				setState(817);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(819);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(828);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(822);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(823);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(824);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(825);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(826);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(827);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Float_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyCParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyCParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyCParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyCParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyCParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyCParser.RIGHT_RBRACKET, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFloat_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFloat_result(this);
		}
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(834);
				int_result(0);
				setState(835);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(836);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(838);
				int_result(0);
				setState(839);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(840);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(842);
				match(LEFT_RBRACKET);
				setState(843);
				float_result(0);
				setState(844);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(846);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(861);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(849);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(850);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(851);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(852);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(853);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(854);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(855);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(856);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(857);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(858);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(859);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(860);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class String_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<String_resultContext> string_result() {
			return getRuleContexts(String_resultContext.class);
		}
		public String_resultContext string_result(int i) {
			return getRuleContext(String_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyCParser.MUL, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RubyCParser.PLUS, 0); }
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterString_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitString_result(this);
		}
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
			case INT:
				{
				setState(867);
				int_result(0);
				setState(868);
				((String_resultContext)_localctx).op = match(MUL);
				setState(869);
				string_result(3);
				}
				break;
			case LITERAL:
				{
				setState(871);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(880);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(874);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(875);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(876);
						string_result(3);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(877);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(878);
						((String_resultContext)_localctx).op = match(MUL);
						setState(879);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comparison_listContext extends ParserRuleContext {
		public ComparisonContext left;
		public Token op;
		public Comparison_listContext right;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BIT_AND() { return getToken(RubyCParser.BIT_AND, 0); }
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(RubyCParser.AND, 0); }
		public TerminalNode BIT_OR() { return getToken(RubyCParser.BIT_OR, 0); }
		public TerminalNode OR() { return getToken(RubyCParser.OR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyCParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyCParser.RIGHT_RBRACKET, 0); }
		public Comparison_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterComparison_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitComparison_list(this);
		}
	}

	public final Comparison_listContext comparison_list() throws RecognitionException {
		Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_comparison_list);
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				((Comparison_listContext)_localctx).left = comparison();
				setState(886);
				((Comparison_listContext)_localctx).op = match(BIT_AND);
				setState(887);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				((Comparison_listContext)_localctx).left = comparison();
				setState(890);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(891);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
				((Comparison_listContext)_localctx).left = comparison();
				setState(894);
				((Comparison_listContext)_localctx).op = match(BIT_OR);
				setState(895);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(897);
				((Comparison_listContext)_localctx).left = comparison();
				setState(898);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(899);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(901);
				match(LEFT_RBRACKET);
				setState(902);
				comparison_list();
				setState(903);
				match(RIGHT_RBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(905);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public Comp_varContext left;
		public Token op;
		public Comp_varContext right;
		public List<Comp_varContext> comp_var() {
			return getRuleContexts(Comp_varContext.class);
		}
		public Comp_varContext comp_var(int i) {
			return getRuleContext(Comp_varContext.class,i);
		}
		public TerminalNode LESS() { return getToken(RubyCParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RubyCParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RubyCParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RubyCParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RubyCParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RubyCParser.NOT_EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_comparison);
		int _la;
		try {
			setState(916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				((ComparisonContext)_localctx).left = comp_var();
				setState(909);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(910);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				((ComparisonContext)_localctx).left = comp_var();
				setState(913);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(914);
				((ComparisonContext)_localctx).right = comp_var();
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

	public static class Comp_varContext extends ParserRuleContext {
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Comp_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterComp_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitComp_var(this);
		}
	}

	public final Comp_varContext comp_var() throws RecognitionException {
		Comp_varContext _localctx = new Comp_varContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_comp_var);
		try {
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				array_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
				id();
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

	public static class LvalueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RubyCParser.DOT, 0); }
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_lvalue);
		try {
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(923);
					class_name();
					setState(924);
					match(DOT);
					}
					break;
				}
				setState(928);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				id_global();
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

	public static class RvalueContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Initial_array_assignmentContext initial_array_assignment() {
			return getRuleContext(Initial_array_assignmentContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Global_setContext global_set() {
			return getRuleContext(Global_setContext.class,0);
		}
		public Global_getContext global_get() {
			return getRuleContext(Global_getContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(RubyCParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(RubyCParser.BIT_NOT, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyCParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyCParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(RubyCParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(RubyCParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyCParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyCParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyCParser.MINUS, 0); }
		public TerminalNode BIT_SHL() { return getToken(RubyCParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(RubyCParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(RubyCParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(RubyCParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(RubyCParser.BIT_XOR, 0); }
		public TerminalNode LESS() { return getToken(RubyCParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RubyCParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RubyCParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RubyCParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RubyCParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RubyCParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(RubyCParser.OR, 0); }
		public TerminalNode AND() { return getToken(RubyCParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(934);
				lvalue();
				}
				break;
			case 2:
				{
				setState(935);
				initial_array_assignment();
				}
				break;
			case 3:
				{
				setState(936);
				array_assignment();
				}
				break;
			case 4:
				{
				setState(937);
				int_result(0);
				}
				break;
			case 5:
				{
				setState(938);
				float_result(0);
				}
				break;
			case 6:
				{
				setState(939);
				string_result(0);
				}
				break;
			case 7:
				{
				setState(940);
				global_set();
				}
				break;
			case 8:
				{
				setState(941);
				global_get();
				}
				break;
			case 9:
				{
				setState(942);
				dynamic_assignment();
				}
				break;
			case 10:
				{
				setState(943);
				string_assignment();
				}
				break;
			case 11:
				{
				setState(944);
				float_assignment();
				}
				break;
			case 12:
				{
				setState(945);
				int_assignment();
				}
				break;
			case 13:
				{
				setState(946);
				assignment();
				}
				break;
			case 14:
				{
				setState(947);
				function_call();
				}
				break;
			case 15:
				{
				setState(948);
				literal_t();
				}
				break;
			case 16:
				{
				setState(949);
				bool_t();
				}
				break;
			case 17:
				{
				setState(950);
				float_t();
				}
				break;
			case 18:
				{
				setState(951);
				int_t();
				}
				break;
			case 19:
				{
				setState(952);
				nil_t();
				}
				break;
			case 20:
				{
				setState(953);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(954);
				rvalue(10);
				}
				break;
			case 21:
				{
				setState(955);
				match(LEFT_RBRACKET);
				setState(956);
				rvalue(0);
				setState(957);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(988);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(961);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(962);
						match(EXP);
						setState(963);
						rvalue(12);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(964);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(965);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(966);
						rvalue(10);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(967);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(968);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(969);
						rvalue(9);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(970);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(971);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(972);
						rvalue(8);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(973);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(974);
						match(BIT_AND);
						setState(975);
						rvalue(7);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(976);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(977);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(978);
						rvalue(6);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(979);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(980);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(981);
						rvalue(5);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(982);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(983);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(984);
						rvalue(4);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(985);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(986);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(987);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Break_expressionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(RubyCParser.BREAK, 0); }
		public Break_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterBreak_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitBreak_expression(this);
		}
	}

	public final Break_expressionContext break_expression() throws RecognitionException {
		Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_break_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(BREAK);
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

	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(RubyCParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterLiteral_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitLiteral_t(this);
		}
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(LITERAL);
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

	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RubyCParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterFloat_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitFloat_t(this);
		}
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(FLOAT);
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

	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RubyCParser.INT, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterInt_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitInt_t(this);
		}
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(INT);
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

	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(RubyCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RubyCParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterBool_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitBool_t(this);
		}
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(RubyCParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterNil_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitNil_t(this);
		}
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(NIL);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RubyCParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
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

	public static class Id_globalContext extends ParserRuleContext {
		public TerminalNode ID_GLOBAL() { return getToken(RubyCParser.ID_GLOBAL, 0); }
		public Id_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterId_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitId_global(this);
		}
	}

	public final Id_globalContext id_global() throws RecognitionException {
		Id_globalContext _localctx = new Id_globalContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(ID_GLOBAL);
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

	public static class Id_functionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RubyCParser.ID, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RubyCParser.DOT, 0); }
		public TerminalNode ID_FUNCTION() { return getToken(RubyCParser.ID_FUNCTION, 0); }
		public TerminalNode SELF() { return getToken(RubyCParser.SELF, 0); }
		public Id_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterId_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitId_function(this);
		}
	}

	public final Id_functionContext id_function() throws RecognitionException {
		Id_functionContext _localctx = new Id_functionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_id_function);
		int _la;
		try {
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(1009);
					class_name();
					setState(1010);
					match(DOT);
					}
					break;
				}
				setState(1014);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELF) {
					{
					setState(1015);
					match(SELF);
					setState(1016);
					match(DOT);
					}
				}

				setState(1019);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==ID_FUNCTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RubyCParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(1023);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(1024);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1031);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(1027);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1028);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(1029);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1030);
						crlf();
						}
						break;
					}
					} 
				}
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Else_tokenContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RubyCParser.ELSE, 0); }
		public Else_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterElse_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitElse_token(this);
		}
	}

	public final Else_tokenContext else_token() throws RecognitionException {
		Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_else_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(ELSE);
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

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(RubyCParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RubyCListener ) ((RubyCListener)listener).exitCrlf(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(CRLF);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return function_definition_params_list_sempred((Function_definition_params_listContext)_localctx, predIndex);
		case 48:
			return for_init_list_sempred((For_init_listContext)_localctx, predIndex);
		case 51:
			return for_loop_list_sempred((For_loop_listContext)_localctx, predIndex);
		case 53:
			return statement_expression_list_sempred((Statement_expression_listContext)_localctx, predIndex);
		case 65:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 67:
			return dynamic_result_sempred((Dynamic_resultContext)_localctx, predIndex);
		case 69:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 70:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 71:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 76:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 86:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_definition_params_list_sempred(Function_definition_params_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean for_init_list_sempred(For_init_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean for_loop_list_sempred(For_loop_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statement_expression_list_sempred(Statement_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dynamic_result_sempred(Dynamic_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 11);
		case 23:
			return precpred(_ctx, 9);
		case 24:
			return precpred(_ctx, 8);
		case 25:
			return precpred(_ctx, 7);
		case 26:
			return precpred(_ctx, 6);
		case 27:
			return precpred(_ctx, 5);
		case 28:
			return precpred(_ctx, 4);
		case 29:
			return precpred(_ctx, 3);
		case 30:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 4);
		case 32:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u0413\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\7\2\u00b7\n\2\f\2\16\2\u00ba"+
		"\13\2\7\2\u00bc\n\2\f\2\16\2\u00bf\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\6\4\u00ca\n\4\r\4\16\4\u00cb\3\5\3\5\3\6\3\6\6\6\u00d2\n\6\r\6"+
		"\16\6\u00d3\7\6\u00d6\n\6\f\6\16\6\u00d9\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00eb\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\7\21"+
		"\u010f\n\21\f\21\16\21\u0112\13\21\3\21\7\21\u0115\n\21\f\21\16\21\u0118"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0127\n\22\3\23\3\23\3\23\3\23\7\23\u012d\n\23\f\23\16\23\u0130"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u013d"+
		"\n\24\3\25\3\25\5\25\u0141\n\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0149"+
		"\n\26\f\26\16\26\u014c\13\26\3\26\3\26\5\26\u0150\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u0158\n\27\f\27\16\27\u015b\13\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0168\n\31\3\32\3\32\3\33"+
		"\3\33\7\33\u016e\n\33\f\33\16\33\u0171\13\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\7\34\u0179\n\34\f\34\16\34\u017c\13\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\5!\u018f\n!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u019f\n\"\3#\3#\3$\3"+
		"$\3$\7$\u01a6\n$\f$\16$\u01a9\13$\3%\3%\5%\u01ad\n%\3&\3&\3&\3&\5&\u01b3"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01bb\n\'\3(\3(\3)\3)\3)\3)\3)\3)\6)\u01c5"+
		"\n)\r)\16)\u01c6\3)\5)\u01ca\n)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01e1\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01f9\n,\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0215\n-\3"+
		".\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u0233\n/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u023b\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0243\n\62\f\62\16\62\u0246\13\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0252\n\65\f\65"+
		"\16\65\u0255\13\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\7\67\u0263\n\67\f\67\16\67\u0266\13\67\5\67\u0268\n\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0275\n\67\f\67"+
		"\16\67\u0278\13\67\38\38\78\u027c\n8\f8\168\u027f\138\38\38\39\39\39\3"+
		"9\59\u0287\n9\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0291\n:\3;\3;\3;\3;\5;\u0297"+
		"\n;\3<\3<\3<\3<\5<\u029d\n<\3<\3<\3<\5<\u02a2\n<\5<\u02a4\n<\3=\3=\3="+
		"\3=\5=\u02aa\n=\3=\3=\3=\5=\u02af\n=\5=\u02b1\n=\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\5>\u02bb\n>\3?\3?\3?\3?\3?\3?\3?\3?\5?\u02c5\n?\3@\3@\3@\3@\3@\3A"+
		"\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\5C\u02d7\nC\3C\3C\3C\3C\5C\u02dd\nC\7C"+
		"\u02df\nC\fC\16C\u02e2\13C\3D\3D\3D\3D\5D\u02e8\nD\3D\3D\3D\3D\3D\3D\5"+
		"D\u02f0\nD\3D\3D\5D\u02f4\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0310\nE\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0327\nE\fE\16E\u032a\13"+
		"E\3F\3F\3F\5F\u032f\nF\3G\3G\3G\3G\3G\3G\5G\u0337\nG\3G\3G\3G\3G\3G\3"+
		"G\7G\u033f\nG\fG\16G\u0342\13G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\5H\u0352\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u0360\nH\fH\16"+
		"H\u0363\13H\3I\3I\3I\3I\3I\3I\5I\u036b\nI\3I\3I\3I\3I\3I\3I\7I\u0373\n"+
		"I\fI\16I\u0376\13I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\5J\u038d\nJ\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0397\nK\3L\3L\3L"+
		"\5L\u039c\nL\3M\3M\3M\5M\u03a1\nM\3M\3M\3M\5M\u03a6\nM\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u03c2"+
		"\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\7N\u03df\nN\fN\16N\u03e2\13N\3O\3O\3P\3P\3Q\3Q\3R\3R\3"+
		"S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3W\5W\u03f7\nW\3W\3W\3W\5W\u03fc\nW\3W\5"+
		"W\u03ff\nW\3X\3X\3X\5X\u0404\nX\3X\3X\3X\3X\7X\u040a\nX\fX\16X\u040d\13"+
		"X\3Y\3Y\3Z\3Z\3Z\2\r,bhl\u0084\u0088\u008c\u008e\u0090\u009a\u00ae[\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\2\16\3\2\36!\3\29>\3\2.\60\3\2,-"+
		"\3\2\64\67\3\2\62\63\4\2BBGG\3\2CD\3\2@A\3\2EF\3\2\"#\4\2TTVV\2\u0468"+
		"\2\u00bd\3\2\2\2\4\u00c0\3\2\2\2\6\u00c4\3\2\2\2\b\u00cd\3\2\2\2\n\u00d7"+
		"\3\2\2\2\f\u00ea\3\2\2\2\16\u00ec\3\2\2\2\20\u00f3\3\2\2\2\22\u00f6\3"+
		"\2\2\2\24\u00fa\3\2\2\2\26\u00fe\3\2\2\2\30\u0100\3\2\2\2\32\u0102\3\2"+
		"\2\2\34\u0105\3\2\2\2\36\u010a\3\2\2\2 \u010c\3\2\2\2\"\u0126\3\2\2\2"+
		"$\u0128\3\2\2\2&\u013c\3\2\2\2(\u0140\3\2\2\2*\u014f\3\2\2\2,\u0151\3"+
		"\2\2\2.\u015c\3\2\2\2\60\u0167\3\2\2\2\62\u0169\3\2\2\2\64\u016f\3\2\2"+
		"\2\66\u0174\3\2\2\28\u017d\3\2\2\2:\u0183\3\2\2\2<\u0185\3\2\2\2>\u0188"+
		"\3\2\2\2@\u018e\3\2\2\2B\u019e\3\2\2\2D\u01a0\3\2\2\2F\u01a2\3\2\2\2H"+
		"\u01ac\3\2\2\2J\u01b2\3\2\2\2L\u01b4\3\2\2\2N\u01bc\3\2\2\2P\u01c4\3\2"+
		"\2\2R\u01cb\3\2\2\2T\u01e0\3\2\2\2V\u01f8\3\2\2\2X\u0214\3\2\2\2Z\u0216"+
		"\3\2\2\2\\\u0232\3\2\2\2^\u0234\3\2\2\2`\u023a\3\2\2\2b\u023c\3\2\2\2"+
		"d\u0247\3\2\2\2f\u0249\3\2\2\2h\u024b\3\2\2\2j\u0256\3\2\2\2l\u0267\3"+
		"\2\2\2n\u0279\3\2\2\2p\u0286\3\2\2\2r\u0290\3\2\2\2t\u0292\3\2\2\2v\u02a3"+
		"\3\2\2\2x\u02b0\3\2\2\2z\u02ba\3\2\2\2|\u02c4\3\2\2\2~\u02c6\3\2\2\2\u0080"+
		"\u02cb\3\2\2\2\u0082\u02cf\3\2\2\2\u0084\u02d3\3\2\2\2\u0086\u02f3\3\2"+
		"\2\2\u0088\u030f\3\2\2\2\u008a\u032e\3\2\2\2\u008c\u0336\3\2\2\2\u008e"+
		"\u0351\3\2\2\2\u0090\u036a\3\2\2\2\u0092\u038c\3\2\2\2\u0094\u0396\3\2"+
		"\2\2\u0096\u039b\3\2\2\2\u0098\u03a5\3\2\2\2\u009a\u03c1\3\2\2\2\u009c"+
		"\u03e3\3\2\2\2\u009e\u03e5\3\2\2\2\u00a0\u03e7\3\2\2\2\u00a2\u03e9\3\2"+
		"\2\2\u00a4\u03eb\3\2\2\2\u00a6\u03ed\3\2\2\2\u00a8\u03ef\3\2\2\2\u00aa"+
		"\u03f1\3\2\2\2\u00ac\u03fe\3\2\2\2\u00ae\u0403\3\2\2\2\u00b0\u040e\3\2"+
		"\2\2\u00b2\u0410\3\2\2\2\u00b4\u00b8\5\4\3\2\u00b5\u00b7\5\u00aeX\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\3\3\2\2\2"+
		"\u00bf\u00bd\3\2\2\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\5\n\6\2\u00c2\u00c3"+
		"\7\13\2\2\u00c3\5\3\2\2\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\5\b\5\2\u00c6"+
		"\u00c7\7\65\2\2\u00c7\u00c9\7\26\2\2\u00c8\u00ca\5\u00b2Z\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\7\3\2\2\2\u00cd\u00ce\7T\2\2\u00ce\t\3\2\2\2\u00cf\u00d1\5\f\7\2\u00d0"+
		"\u00d2\5\u00aeX\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\13\3\2\2"+
		"\2\u00d9\u00d7\3\2\2\2\u00da\u00eb\5 \21\2\u00db\u00eb\5\30\r\2\u00dc"+
		"\u00eb\5\32\16\2\u00dd\u00eb\5V,\2\u00de\u00eb\5X-\2\u00df\u00eb\5\u009a"+
		"N\2\u00e0\u00eb\5> \2\u00e1\u00eb\5Z.\2\u00e2\u00eb\5\\/\2\u00e3\u00eb"+
		"\5\34\17\2\u00e4\u00eb\5\66\34\2\u00e5\u00eb\58\35\2\u00e6\u00eb\5<\37"+
		"\2\u00e7\u00eb\5\20\t\2\u00e8\u00eb\5> \2\u00e9\u00eb\5\16\b\2\u00ea\u00da"+
		"\3\2\2\2\u00ea\u00db\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00dd\3\2\2\2\u00ea"+
		"\u00de\3\2\2\2\u00ea\u00df\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e1\3\2"+
		"\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00e9\3\2\2\2\u00eb\r\3\2\2\2\u00ec\u00ed\7\34\2\2\u00ed\u00ee"+
		"\7\35\2\2\u00ee\u00ef\7\3\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1\5\u00a4S"+
		"\2\u00f1\u00f2\7\4\2\2\u00f2\17\3\2\2\2\u00f3\u00f4\7\27\2\2\u00f4\u00f5"+
		"\5\u0090I\2\u00f5\21\3\2\2\2\u00f6\u00f7\5\u0098M\2\u00f7\u00f8\78\2\2"+
		"\u00f8\u00f9\5\u00aaV\2\u00f9\23\3\2\2\2\u00fa\u00fb\5\u00aaV\2\u00fb"+
		"\u00fc\78\2\2\u00fc\u00fd\5P)\2\u00fd\25\3\2\2\2\u00fe\u00ff\5\u00aaV"+
		"\2\u00ff\27\3\2\2\2\u0100\u0101\5B\"\2\u0101\31\3\2\2\2\u0102\u0103\7"+
		"\n\2\2\u0103\u0104\5\u009eP\2\u0104\33\3\2\2\2\u0105\u0106\7\16\2\2\u0106"+
		"\u0107\5\u00b2Z\2\u0107\u0108\5\36\20\2\u0108\u0109\7\13\2\2\u0109\35"+
		"\3\2\2\2\u010a\u010b\5\f\7\2\u010b\37\3\2\2\2\u010c\u0110\5&\24\2\u010d"+
		"\u010f\5\"\22\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3"+
		"\2\2\2\u0110\u0111\3\2\2\2\u0111\u0116\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0115\5\u00b2Z\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\7\13\2\2\u011a!\3\2\2\2\u011b\u0127\5\20\t\2\u011c\u0127\5\60\31"+
		"\2\u011d\u0127\5n8\2\u011e\u0127\5\u00b2Z\2\u011f\u0127\5\62\32\2\u0120"+
		"\u0127\5> \2\u0121\u0127\5$\23\2\u0122\u0127\5\30\r\2\u0123\u0127\5@!"+
		"\2\u0124\u0127\5V,\2\u0125\u0127\5\16\b\2\u0126\u011b\3\2\2\2\u0126\u011c"+
		"\3\2\2\2\u0126\u011d\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u011f\3\2\2\2\u0126"+
		"\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127#\3\2\2\2\u0128\u0129"+
		"\7\32\2\2\u0129\u012a\7\33\2\2\u012a\u012e\5\u00b2Z\2\u012b\u012d\5\""+
		"\22\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\13"+
		"\2\2\u0132%\3\2\2\2\u0133\u0134\7\f\2\2\u0134\u0135\5(\25\2\u0135\u0136"+
		"\5\u00b2Z\2\u0136\u013d\3\2\2\2\u0137\u0138\7\f\2\2\u0138\u0139\5(\25"+
		"\2\u0139\u013a\5*\26\2\u013a\u013b\5\u00b2Z\2\u013b\u013d\3\2\2\2\u013c"+
		"\u0133\3\2\2\2\u013c\u0137\3\2\2\2\u013d\'\3\2\2\2\u013e\u0141\5\u00ac"+
		"W\2\u013f\u0141\5\u00a8U\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141"+
		")\3\2\2\2\u0142\u0143\7I\2\2\u0143\u0150\7J\2\2\u0144\u0145\7I\2\2\u0145"+
		"\u014a\5\u00a8U\2\u0146\u0147\7\6\2\2\u0147\u0149\5.\30\2\u0148\u0146"+
		"\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7J\2\2\u014e\u0150\3\2"+
		"\2\2\u014f\u0142\3\2\2\2\u014f\u0144\3\2\2\2\u0150+\3\2\2\2\u0151\u0152"+
		"\b\27\1\2\u0152\u0153\5.\30\2\u0153\u0159\3\2\2\2\u0154\u0155\f\3\2\2"+
		"\u0155\u0156\7\6\2\2\u0156\u0158\5.\30\2\u0157\u0154\3\2\2\2\u0158\u015b"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a-\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015d\5\u00a8U\2\u015d/\3\2\2\2\u015e\u0168\7\17"+
		"\2\2\u015f\u0160\7\17\2\2\u0160\u0161\7I\2\2\u0161\u0162\5\64\33\2\u0162"+
		"\u0163\7J\2\2\u0163\u0168\3\2\2\2\u0164\u0165\7\17\2\2\u0165\u0166\7I"+
		"\2\2\u0166\u0168\7J\2\2\u0167\u015e\3\2\2\2\u0167\u015f\3\2\2\2\u0167"+
		"\u0164\3\2\2\2\u0168\61\3\2\2\2\u0169\u016a\7\20\2\2\u016a\63\3\2\2\2"+
		"\u016b\u016c\7\6\2\2\u016c\u016e\5\u00a8U\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0173\5\u0098M\2\u0173\65\3\2\2\2\u0174"+
		"\u0175\7\21\2\2\u0175\u017a\7U\2\2\u0176\u0177\7\6\2\2\u0177\u0179\7U"+
		"\2\2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\67\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\22\2"+
		"\2\u017e\u017f\7U\2\2\u017f\u0180\7\6\2\2\u0180\u0181\5:\36\2\u0181\u0182"+
		"\5\u009aN\2\u01829\3\2\2\2\u0183\u0184\t\2\2\2\u0184;\3\2\2\2\u0185\u0186"+
		"\7\24\2\2\u0186\u0187\5\u0098M\2\u0187=\3\2\2\2\u0188\u0189\7\r\2\2\u0189"+
		"\u018a\5P)\2\u018a?\3\2\2\2\u018b\u018c\5\b\5\2\u018c\u018d\7H\2\2\u018d"+
		"\u018f\3\2\2\2\u018e\u018b\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\7\31\2\2\u0191A\3\2\2\2\u0192\u0193\5(\25\2\u0193\u0194"+
		"\7I\2\2\u0194\u0195\5D#\2\u0195\u0196\7J\2\2\u0196\u019f\3\2\2\2\u0197"+
		"\u0198\5(\25\2\u0198\u0199\5D#\2\u0199\u019f\3\2\2\2\u019a\u019b\5(\25"+
		"\2\u019b\u019c\7I\2\2\u019c\u019d\7J\2\2\u019d\u019f\3\2\2\2\u019e\u0192"+
		"\3\2\2\2\u019e\u0197\3\2\2\2\u019e\u019a\3\2\2\2\u019fC\3\2\2\2\u01a0"+
		"\u01a1\5F$\2\u01a1E\3\2\2\2\u01a2\u01a7\5H%\2\u01a3\u01a4\7\6\2\2\u01a4"+
		"\u01a6\5H%\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2"+
		"\2\u01a7\u01a8\3\2\2\2\u01a8G\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad"+
		"\5J&\2\u01ab\u01ad\5L\'\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad"+
		"I\3\2\2\2\u01ae\u01b3\5\u008cG\2\u01af\u01b3\5\u008eH\2\u01b0\u01b3\5"+
		"\u0090I\2\u01b1\u01b3\5\u0088E\2\u01b2\u01ae\3\2\2\2\u01b2\u01af\3\2\2"+
		"\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3K\3\2\2\2\u01b4\u01b5"+
		"\5\u00a8U\2\u01b5\u01ba\78\2\2\u01b6\u01bb\5\u008cG\2\u01b7\u01bb\5\u008e"+
		"H\2\u01b8\u01bb\5\u0090I\2\u01b9\u01bb\5\u0088E\2\u01ba\u01b6\3\2\2\2"+
		"\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bbM\3"+
		"\2\2\2\u01bc\u01bd\5B\"\2\u01bdO\3\2\2\2\u01be\u01c5\5\u008cG\2\u01bf"+
		"\u01c5\5\u008eH\2\u01c0\u01c5\5\u0090I\2\u01c1\u01c5\5\u0088E\2\u01c2"+
		"\u01c5\5\26\f\2\u01c3\u01c5\5\u00a4S\2\u01c4\u01be\3\2\2\2\u01c4\u01bf"+
		"\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\5\f\7\2\u01c9\u01c8\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01caQ\3\2\2\2\u01cb\u01cc\5T+\2\u01ccS\3\2\2\2\u01cd\u01ce"+
		"\7&\2\2\u01ce\u01cf\5d\63\2\u01cf\u01d0\5\u00b2Z\2\u01d0\u01d1\5j\66\2"+
		"\u01d1\u01e1\3\2\2\2\u01d2\u01d3\7&\2\2\u01d3\u01d4\5d\63\2\u01d4\u01d5"+
		"\5\u00b2Z\2\u01d5\u01d6\5j\66\2\u01d6\u01d7\5\u00b0Y\2\u01d7\u01d8\5\u00b2"+
		"Z\2\u01d8\u01d9\5j\66\2\u01d9\u01e1\3\2\2\2\u01da\u01db\7&\2\2\u01db\u01dc"+
		"\5d\63\2\u01dc\u01dd\5\u00b2Z\2\u01dd\u01de\5j\66\2\u01de\u01df\5T+\2"+
		"\u01df\u01e1\3\2\2\2\u01e0\u01cd\3\2\2\2\u01e0\u01d2\3\2\2\2\u01e0\u01da"+
		"\3\2\2\2\u01e1U\3\2\2\2\u01e2\u01e3\7$\2\2\u01e3\u01e4\5d\63\2\u01e4\u01e5"+
		"\5\u00b2Z\2\u01e5\u01e6\5j\66\2\u01e6\u01e7\7\13\2\2\u01e7\u01f9\3\2\2"+
		"\2\u01e8\u01e9\7$\2\2\u01e9\u01ea\5d\63\2\u01ea\u01eb\5\u00b2Z\2\u01eb"+
		"\u01ec\5j\66\2\u01ec\u01ed\5\u00b0Y\2\u01ed\u01ee\5\u00b2Z\2\u01ee\u01ef"+
		"\5j\66\2\u01ef\u01f0\7\13\2\2\u01f0\u01f9\3\2\2\2\u01f1\u01f2\7$\2\2\u01f2"+
		"\u01f3\5d\63\2\u01f3\u01f4\5\u00b2Z\2\u01f4\u01f5\5j\66\2\u01f5\u01f6"+
		"\5R*\2\u01f6\u01f7\7\13\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01e2\3\2\2\2\u01f8"+
		"\u01e8\3\2\2\2\u01f8\u01f1\3\2\2\2\u01f9W\3\2\2\2\u01fa\u01fb\7\'\2\2"+
		"\u01fb\u01fc\5d\63\2\u01fc\u01fd\5\u00b2Z\2\u01fd\u01fe\5j\66\2\u01fe"+
		"\u01ff\7\13\2\2\u01ff\u0215\3\2\2\2\u0200\u0201\7\'\2\2\u0201\u0202\5"+
		"d\63\2\u0202\u0203\5\u00b2Z\2\u0203\u0204\5j\66\2\u0204\u0205\5\u00b0"+
		"Y\2\u0205\u0206\5\u00b2Z\2\u0206\u0207\5j\66\2\u0207\u0208\7\13\2\2\u0208"+
		"\u0215\3\2\2\2\u0209\u020a\7\'\2\2\u020a\u020b\5d\63\2\u020b\u020c\5\u00b2"+
		"Z\2\u020c\u020d\5j\66\2\u020d\u020e\5R*\2\u020e\u020f\7\13\2\2\u020f\u0215"+
		"\3\2\2\2\u0210\u0211\7\'\2\2\u0211\u0215\5B\"\2\u0212\u0213\7\'\2\2\u0213"+
		"\u0215\5\u00a8U\2\u0214\u01fa\3\2\2\2\u0214\u0200\3\2\2\2\u0214\u0209"+
		"\3\2\2\2\u0214\u0210\3\2\2\2\u0214\u0212\3\2\2\2\u0215Y\3\2\2\2\u0216"+
		"\u0217\7(\2\2\u0217\u0218\5d\63\2\u0218\u0219\5\u00b2Z\2\u0219\u021a\5"+
		"j\66\2\u021a\u021b\7\13\2\2\u021b[\3\2\2\2\u021c\u021d\7+\2\2\u021d\u021e"+
		"\7I\2\2\u021e\u021f\5^\60\2\u021f\u0220\7\7\2\2\u0220\u0221\5d\63\2\u0221"+
		"\u0222\7\7\2\2\u0222\u0223\5f\64\2\u0223\u0224\7J\2\2\u0224\u0225\5\u00b2"+
		"Z\2\u0225\u0226\5j\66\2\u0226\u0227\7\13\2\2\u0227\u0233\3\2\2\2\u0228"+
		"\u0229\7+\2\2\u0229\u022a\5^\60\2\u022a\u022b\7\7\2\2\u022b\u022c\5d\63"+
		"\2\u022c\u022d\7\7\2\2\u022d\u022e\5f\64\2\u022e\u022f\5\u00b2Z\2\u022f"+
		"\u0230\5j\66\2\u0230\u0231\7\13\2\2\u0231\u0233\3\2\2\2\u0232\u021c\3"+
		"\2\2\2\u0232\u0228\3\2\2\2\u0233]\3\2\2\2\u0234\u0235\5b\62\2\u0235_\3"+
		"\2\2\2\u0236\u023b\5t;\2\u0237\u023b\5z>\2\u0238\u023b\5|?\2\u0239\u023b"+
		"\5r:\2\u023a\u0236\3\2\2\2\u023a\u0237\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u0239\3\2\2\2\u023ba\3\2\2\2\u023c\u023d\b\62\1\2\u023d\u023e\5`\61\2"+
		"\u023e\u0244\3\2\2\2\u023f\u0240\f\4\2\2\u0240\u0241\7\6\2\2\u0241\u0243"+
		"\5`\61\2\u0242\u023f\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245c\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\5\u0092"+
		"J\2\u0248e\3\2\2\2\u0249\u024a\5h\65\2\u024ag\3\2\2\2\u024b\u024c\b\65"+
		"\1\2\u024c\u024d\5`\61\2\u024d\u0253\3\2\2\2\u024e\u024f\f\4\2\2\u024f"+
		"\u0250\7\6\2\2\u0250\u0252\5`\61\2\u0251\u024e\3\2\2\2\u0252\u0255\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254i\3\2\2\2\u0255\u0253"+
		"\3\2\2\2\u0256\u0257\5l\67\2\u0257k\3\2\2\2\u0258\u0259\b\67\1\2\u0259"+
		"\u025a\5\f\7\2\u025a\u025b\5\u00aeX\2\u025b\u0268\3\2\2\2\u025c\u025d"+
		"\7)\2\2\u025d\u0268\5\u00aeX\2\u025e\u025f\5\u009cO\2\u025f\u0260\5\u00ae"+
		"X\2\u0260\u0268\3\2\2\2\u0261\u0263\5\f\7\2\u0262\u0261\3\2\2\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0268\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0267\u0258\3\2\2\2\u0267\u025c\3\2\2\2\u0267"+
		"\u025e\3\2\2\2\u0267\u0264\3\2\2\2\u0268\u0276\3\2\2\2\u0269\u026a\f\6"+
		"\2\2\u026a\u026b\5\f\7\2\u026b\u026c\5\u00aeX\2\u026c\u0275\3\2\2\2\u026d"+
		"\u026e\f\5\2\2\u026e\u026f\7)\2\2\u026f\u0275\5\u00aeX\2\u0270\u0271\f"+
		"\4\2\2\u0271\u0272\5\u009cO\2\u0272\u0273\5\u00aeX\2\u0273\u0275\3\2\2"+
		"\2\u0274\u0269\3\2\2\2\u0274\u026d\3\2\2\2\u0274\u0270\3\2\2\2\u0275\u0278"+
		"\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277m\3\2\2\2\u0278"+
		"\u0276\3\2\2\2\u0279\u027d\5\u0098M\2\u027a\u027c\78\2\2\u027b\u027a\3"+
		"\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0281\5p9\2\u0281o\3\2\2\2\u0282"+
		"\u0287\5\u008cG\2\u0283\u0287\5v<\2\u0284\u0287\5x=\2\u0285\u0287\5\60"+
		"\31\2\u0286\u0282\3\2\2\2\u0286\u0283\3\2\2\2\u0286\u0284\3\2\2\2\u0286"+
		"\u0285\3\2\2\2\u0287q\3\2\2\2\u0288\u0289\5\u0098M\2\u0289\u028a\78\2"+
		"\2\u028a\u028b\5\u0088E\2\u028b\u0291\3\2\2\2\u028c\u028d\5\u0098M\2\u028d"+
		"\u028e\t\3\2\2\u028e\u028f\5\u0088E\2\u028f\u0291\3\2\2\2\u0290\u0288"+
		"\3\2\2\2\u0290\u028c\3\2\2\2\u0291s\3\2\2\2\u0292\u0293\5\u0098M\2\u0293"+
		"\u0296\78\2\2\u0294\u0297\5\u008cG\2\u0295\u0297\5\u0088E\2\u0296\u0294"+
		"\3\2\2\2\u0296\u0295\3\2\2\2\u0297u\3\2\2\2\u0298\u0299\5\u0098M\2\u0299"+
		"\u029c\7,\2\2\u029a\u029d\5\u008cG\2\u029b\u029d\5\u0088E\2\u029c\u029a"+
		"\3\2\2\2\u029c\u029b\3\2\2\2\u029d\u02a4\3\2\2\2\u029e\u02a1\79\2\2\u029f"+
		"\u02a2\5\u008cG\2\u02a0\u02a2\5\u0088E\2\u02a1\u029f\3\2\2\2\u02a1\u02a0"+
		"\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u0298\3\2\2\2\u02a3\u029e\3\2\2\2\u02a4"+
		"w\3\2\2\2\u02a5\u02a6\5\u0098M\2\u02a6\u02a9\7-\2\2\u02a7\u02aa\5\u008c"+
		"G\2\u02a8\u02aa\5\u0088E\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa"+
		"\u02b1\3\2\2\2\u02ab\u02ae\7:\2\2\u02ac\u02af\5\u008cG\2\u02ad\u02af\5"+
		"\u0088E\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b1\3\2\2\2"+
		"\u02b0\u02a5\3\2\2\2\u02b0\u02ab\3\2\2\2\u02b1y\3\2\2\2\u02b2\u02b3\5"+
		"\u0098M\2\u02b3\u02b4\78\2\2\u02b4\u02b5\5\u008eH\2\u02b5\u02bb\3\2\2"+
		"\2\u02b6\u02b7\5\u0098M\2\u02b7\u02b8\t\3\2\2\u02b8\u02b9\5\u008eH\2\u02b9"+
		"\u02bb\3\2\2\2\u02ba\u02b2\3\2\2\2\u02ba\u02b6\3\2\2\2\u02bb{\3\2\2\2"+
		"\u02bc\u02bd\5\u0098M\2\u02bd\u02be\78\2\2\u02be\u02bf\5\u0090I\2\u02bf"+
		"\u02c5\3\2\2\2\u02c0\u02c1\5\u0098M\2\u02c1\u02c2\79\2\2\u02c2\u02c3\5"+
		"\u0090I\2\u02c3\u02c5\3\2\2\2\u02c4\u02bc\3\2\2\2\u02c4\u02c0\3\2\2\2"+
		"\u02c5}\3\2\2\2\u02c6\u02c7\5\u0098M\2\u02c7\u02c8\78\2\2\u02c8\u02c9"+
		"\7K\2\2\u02c9\u02ca\7L\2\2\u02ca\177\3\2\2\2\u02cb\u02cc\5\u0086D\2\u02cc"+
		"\u02cd\78\2\2\u02cd\u02ce\5P)\2\u02ce\u0081\3\2\2\2\u02cf\u02d0\7K\2\2"+
		"\u02d0\u02d1\5\u0084C\2\u02d1\u02d2\7L\2\2\u02d2\u0083\3\2\2\2\u02d3\u02d6"+
		"\bC\1\2\u02d4\u02d7\5\u008cG\2\u02d5\u02d7\5\u0088E\2\u02d6\u02d4\3\2"+
		"\2\2\u02d6\u02d5\3\2\2\2\u02d7\u02e0\3\2\2\2\u02d8\u02d9\f\3\2\2\u02d9"+
		"\u02dc\7\6\2\2\u02da\u02dd\5\u008cG\2\u02db\u02dd\5\u0088E\2\u02dc\u02da"+
		"\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02d8\3\2\2\2\u02df"+
		"\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u0085\3\2"+
		"\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\5\u00a8U\2\u02e4\u02e7\7K\2\2\u02e5"+
		"\u02e8\5\u008cG\2\u02e6\u02e8\5\u0088E\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6"+
		"\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\7L\2\2\u02ea\u02f4\3\2\2\2\u02eb"+
		"\u02ec\5\u00aaV\2\u02ec\u02ef\7K\2\2\u02ed\u02f0\5\u008cG\2\u02ee\u02f0"+
		"\5\u0088E\2\u02ef\u02ed\3\2\2\2\u02ef\u02ee\3\2\2\2\u02f0\u02f1\3\2\2"+
		"\2\u02f1\u02f2\7L\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02e3\3\2\2\2\u02f3\u02eb"+
		"\3\2\2\2\u02f4\u0087\3\2\2\2\u02f5\u02f6\bE\1\2\u02f6\u02f7\5\u008cG\2"+
		"\u02f7\u02f8\t\4\2\2\u02f8\u02f9\5\u0088E\17\u02f9\u0310\3\2\2\2\u02fa"+
		"\u02fb\5\u008eH\2\u02fb\u02fc\t\4\2\2\u02fc\u02fd\5\u0088E\r\u02fd\u0310"+
		"\3\2\2\2\u02fe\u02ff\5\u0090I\2\u02ff\u0300\7.\2\2\u0300\u0301\5\u0088"+
		"E\n\u0301\u0310\3\2\2\2\u0302\u0303\5\u008cG\2\u0303\u0304\t\5\2\2\u0304"+
		"\u0305\5\u0088E\b\u0305\u0310\3\2\2\2\u0306\u0307\5\u008eH\2\u0307\u0308"+
		"\t\5\2\2\u0308\u0309\5\u0088E\6\u0309\u0310\3\2\2\2\u030a\u030b\7I\2\2"+
		"\u030b\u030c\5\u0088E\2\u030c\u030d\7J\2\2\u030d\u0310\3\2\2\2\u030e\u0310"+
		"\5\u008aF\2\u030f\u02f5\3\2\2\2\u030f\u02fa\3\2\2\2\u030f\u02fe\3\2\2"+
		"\2\u030f\u0302\3\2\2\2\u030f\u0306\3\2\2\2\u030f\u030a\3\2\2\2\u030f\u030e"+
		"\3\2\2\2\u0310\u0328\3\2\2\2\u0311\u0312\f\f\2\2\u0312\u0313\t\4\2\2\u0313"+
		"\u0327\5\u0088E\r\u0314\u0315\f\5\2\2\u0315\u0316\t\5\2\2\u0316\u0327"+
		"\5\u0088E\6\u0317\u0318\f\20\2\2\u0318\u0319\t\4\2\2\u0319\u0327\5\u008c"+
		"G\2\u031a\u031b\f\16\2\2\u031b\u031c\t\4\2\2\u031c\u0327\5\u008eH\2\u031d"+
		"\u031e\f\13\2\2\u031e\u031f\7.\2\2\u031f\u0327\5\u0090I\2\u0320\u0321"+
		"\f\t\2\2\u0321\u0322\t\5\2\2\u0322\u0327\5\u008cG\2\u0323\u0324\f\7\2"+
		"\2\u0324\u0325\t\5\2\2\u0325\u0327\5\u008eH\2\u0326\u0311\3\2\2\2\u0326"+
		"\u0314\3\2\2\2\u0326\u0317\3\2\2\2\u0326\u031a\3\2\2\2\u0326\u031d\3\2"+
		"\2\2\u0326\u0320\3\2\2\2\u0326\u0323\3\2\2\2\u0327\u032a\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u0089\3\2\2\2\u032a\u0328\3\2"+
		"\2\2\u032b\u032f\5\u00a8U\2\u032c\u032f\5N(\2\u032d\u032f\5\u0086D\2\u032e"+
		"\u032b\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032d\3\2\2\2\u032f\u008b\3\2"+
		"\2\2\u0330\u0331\bG\1\2\u0331\u0332\7I\2\2\u0332\u0333\5\u008cG\2\u0333"+
		"\u0334\7J\2\2\u0334\u0337\3\2\2\2\u0335\u0337\5\u00a2R\2\u0336\u0330\3"+
		"\2\2\2\u0336\u0335\3\2\2\2\u0337\u0340\3\2\2\2\u0338\u0339\f\6\2\2\u0339"+
		"\u033a\t\4\2\2\u033a\u033f\5\u008cG\7\u033b\u033c\f\5\2\2\u033c\u033d"+
		"\t\5\2\2\u033d\u033f\5\u008cG\6\u033e\u0338\3\2\2\2\u033e\u033b\3\2\2"+
		"\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u008d"+
		"\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0344\bH\1\2\u0344\u0345\5\u008cG\2"+
		"\u0345\u0346\t\4\2\2\u0346\u0347\5\u008eH\t\u0347\u0352\3\2\2\2\u0348"+
		"\u0349\5\u008cG\2\u0349\u034a\t\5\2\2\u034a\u034b\5\u008eH\6\u034b\u0352"+
		"\3\2\2\2\u034c\u034d\7I\2\2\u034d\u034e\5\u008eH\2\u034e\u034f\7J\2\2"+
		"\u034f\u0352\3\2\2\2\u0350\u0352\5\u00a0Q\2\u0351\u0343\3\2\2\2\u0351"+
		"\u0348\3\2\2\2\u0351\u034c\3\2\2\2\u0351\u0350\3\2\2\2\u0352\u0361\3\2"+
		"\2\2\u0353\u0354\f\n\2\2\u0354\u0355\t\4\2\2\u0355\u0360\5\u008eH\13\u0356"+
		"\u0357\f\7\2\2\u0357\u0358\t\5\2\2\u0358\u0360\5\u008eH\b\u0359\u035a"+
		"\f\b\2\2\u035a\u035b\t\4\2\2\u035b\u0360\5\u008cG\2\u035c\u035d\f\5\2"+
		"\2\u035d\u035e\t\5\2\2\u035e\u0360\5\u008cG\2\u035f\u0353\3\2\2\2\u035f"+
		"\u0356\3\2\2\2\u035f\u0359\3\2\2\2\u035f\u035c\3\2\2\2\u0360\u0363\3\2"+
		"\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u008f\3\2\2\2\u0363"+
		"\u0361\3\2\2\2\u0364\u0365\bI\1\2\u0365\u0366\5\u008cG\2\u0366\u0367\7"+
		".\2\2\u0367\u0368\5\u0090I\5\u0368\u036b\3\2\2\2\u0369\u036b\5\u009eP"+
		"\2\u036a\u0364\3\2\2\2\u036a\u0369\3\2\2\2\u036b\u0374\3\2\2\2\u036c\u036d"+
		"\f\4\2\2\u036d\u036e\7,\2\2\u036e\u0373\5\u0090I\5\u036f\u0370\f\6\2\2"+
		"\u0370\u0371\7.\2\2\u0371\u0373\5\u008cG\2\u0372\u036c\3\2\2\2\u0372\u036f"+
		"\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0091\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0378\5\u0094K\2\u0378\u0379"+
		"\7?\2\2\u0379\u037a\5\u0092J\2\u037a\u038d\3\2\2\2\u037b\u037c\5\u0094"+
		"K\2\u037c\u037d\7E\2\2\u037d\u037e\5\u0092J\2\u037e\u038d\3\2\2\2\u037f"+
		"\u0380\5\u0094K\2\u0380\u0381\7@\2\2\u0381\u0382\5\u0092J\2\u0382\u038d"+
		"\3\2\2\2\u0383\u0384\5\u0094K\2\u0384\u0385\7F\2\2\u0385\u0386\5\u0092"+
		"J\2\u0386\u038d\3\2\2\2\u0387\u0388\7I\2\2\u0388\u0389\5\u0092J\2\u0389"+
		"\u038a\7J\2\2\u038a\u038d\3\2\2\2\u038b\u038d\5\u0094K\2\u038c\u0377\3"+
		"\2\2\2\u038c\u037b\3\2\2\2\u038c\u037f\3\2\2\2\u038c\u0383\3\2\2\2\u038c"+
		"\u0387\3\2\2\2\u038c\u038b\3\2\2\2\u038d\u0093\3\2\2\2\u038e\u038f\5\u0096"+
		"L\2\u038f\u0390\t\6\2\2\u0390\u0391\5\u0096L\2\u0391\u0397\3\2\2\2\u0392"+
		"\u0393\5\u0096L\2\u0393\u0394\t\7\2\2\u0394\u0395\5\u0096L\2\u0395\u0397"+
		"\3\2\2\2\u0396\u038e\3\2\2\2\u0396\u0392\3\2\2\2\u0397\u0095\3\2\2\2\u0398"+
		"\u039c\5P)\2\u0399\u039c\5\u0086D\2\u039a\u039c\5\u00a8U\2\u039b\u0398"+
		"\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039a\3\2\2\2\u039c\u0097\3\2\2\2\u039d"+
		"\u039e\5\b\5\2\u039e\u039f\7H\2\2\u039f\u03a1\3\2\2\2\u03a0\u039d\3\2"+
		"\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a6\5\u00a8U\2\u03a3"+
		"\u03a6\5\u00a8U\2\u03a4\u03a6\5\u00aaV\2\u03a5\u03a0\3\2\2\2\u03a5\u03a3"+
		"\3\2\2\2\u03a5\u03a4\3\2\2\2\u03a6\u0099\3\2\2\2\u03a7\u03a8\bN\1\2\u03a8"+
		"\u03c2\5\u0098M\2\u03a9\u03c2\5~@\2\u03aa\u03c2\5\u0080A\2\u03ab\u03c2"+
		"\5\u008cG\2\u03ac\u03c2\5\u008eH\2\u03ad\u03c2\5\u0090I\2\u03ae\u03c2"+
		"\5\24\13\2\u03af\u03c2\5\22\n\2\u03b0\u03c2\5r:\2\u03b1\u03c2\5|?\2\u03b2"+
		"\u03c2\5z>\2\u03b3\u03c2\5t;\2\u03b4\u03c2\5n8\2\u03b5\u03c2\5B\"\2\u03b6"+
		"\u03c2\5\u009eP\2\u03b7\u03c2\5\u00a4S\2\u03b8\u03c2\5\u00a0Q\2\u03b9"+
		"\u03c2\5\u00a2R\2\u03ba\u03c2\5\u00a6T\2\u03bb\u03bc\t\b\2\2\u03bc\u03c2"+
		"\5\u009aN\f\u03bd\u03be\7I\2\2\u03be\u03bf\5\u009aN\2\u03bf\u03c0\7J\2"+
		"\2\u03c0\u03c2\3\2\2\2\u03c1\u03a7\3\2\2\2\u03c1\u03a9\3\2\2\2\u03c1\u03aa"+
		"\3\2\2\2\u03c1\u03ab\3\2\2\2\u03c1\u03ac\3\2\2\2\u03c1\u03ad\3\2\2\2\u03c1"+
		"\u03ae\3\2\2\2\u03c1\u03af\3\2\2\2\u03c1\u03b0\3\2\2\2\u03c1\u03b1\3\2"+
		"\2\2\u03c1\u03b2\3\2\2\2\u03c1\u03b3\3\2\2\2\u03c1\u03b4\3\2\2\2\u03c1"+
		"\u03b5\3\2\2\2\u03c1\u03b6\3\2\2\2\u03c1\u03b7\3\2\2\2\u03c1\u03b8\3\2"+
		"\2\2\u03c1\u03b9\3\2\2\2\u03c1\u03ba\3\2\2\2\u03c1\u03bb\3\2\2\2\u03c1"+
		"\u03bd\3\2\2\2\u03c2\u03e0\3\2\2\2\u03c3\u03c4\f\r\2\2\u03c4\u03c5\7\61"+
		"\2\2\u03c5\u03df\5\u009aN\16\u03c6\u03c7\f\13\2\2\u03c7\u03c8\t\4\2\2"+
		"\u03c8\u03df\5\u009aN\f\u03c9\u03ca\f\n\2\2\u03ca\u03cb\t\5\2\2\u03cb"+
		"\u03df\5\u009aN\13\u03cc\u03cd\f\t\2\2\u03cd\u03ce\t\t\2\2\u03ce\u03df"+
		"\5\u009aN\n\u03cf\u03d0\f\b\2\2\u03d0\u03d1\7?\2\2\u03d1\u03df\5\u009a"+
		"N\t\u03d2\u03d3\f\7\2\2\u03d3\u03d4\t\n\2\2\u03d4\u03df\5\u009aN\b\u03d5"+
		"\u03d6\f\6\2\2\u03d6\u03d7\t\6\2\2\u03d7\u03df\5\u009aN\7\u03d8\u03d9"+
		"\f\5\2\2\u03d9\u03da\t\7\2\2\u03da\u03df\5\u009aN\6\u03db\u03dc\f\4\2"+
		"\2\u03dc\u03dd\t\13\2\2\u03dd\u03df\5\u009aN\5\u03de\u03c3\3\2\2\2\u03de"+
		"\u03c6\3\2\2\2\u03de\u03c9\3\2\2\2\u03de\u03cc\3\2\2\2\u03de\u03cf\3\2"+
		"\2\2\u03de\u03d2\3\2\2\2\u03de\u03d5\3\2\2\2\u03de\u03d8\3\2\2\2\u03de"+
		"\u03db\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2"+
		"\2\2\u03e1\u009b\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3\u03e4\7*\2\2\u03e4"+
		"\u009d\3\2\2\2\u03e5\u03e6\7\5\2\2\u03e6\u009f\3\2\2\2\u03e7\u03e8\7S"+
		"\2\2\u03e8\u00a1\3\2\2\2\u03e9\u03ea\7R\2\2\u03ea\u00a3\3\2\2\2\u03eb"+
		"\u03ec\t\f\2\2\u03ec\u00a5\3\2\2\2\u03ed\u03ee\7M\2\2\u03ee\u00a7\3\2"+
		"\2\2\u03ef\u03f0\7T\2\2\u03f0\u00a9\3\2\2\2\u03f1\u03f2\7U\2\2\u03f2\u00ab"+
		"\3\2\2\2\u03f3\u03f4\5\b\5\2\u03f4\u03f5\7H\2\2\u03f5\u03f7\3\2\2\2\u03f6"+
		"\u03f3\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03ff\7T"+
		"\2\2\u03f9\u03fa\7\30\2\2\u03fa\u03fc\7H\2\2\u03fb\u03f9\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\t\r\2\2\u03fe\u03f6\3\2"+
		"\2\2\u03fe\u03fb\3\2\2\2\u03ff\u00ad\3\2\2\2\u0400\u0401\bX\1\2\u0401"+
		"\u0404\7\7\2\2\u0402\u0404\5\u00b2Z\2\u0403\u0400\3\2\2\2\u0403\u0402"+
		"\3\2\2\2\u0404\u040b\3\2\2\2\u0405\u0406\f\6\2\2\u0406\u040a\7\7\2\2\u0407"+
		"\u0408\f\5\2\2\u0408\u040a\5\u00b2Z\2\u0409\u0405\3\2\2\2\u0409\u0407"+
		"\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"\u00af\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u040f\7%\2\2\u040f\u00b1\3\2"+
		"\2\2\u0410\u0411\7\b\2\2\u0411\u00b3\3\2\2\2U\u00b8\u00bd\u00cb\u00d3"+
		"\u00d7\u00ea\u0110\u0116\u0126\u012e\u013c\u0140\u014a\u014f\u0159\u0167"+
		"\u016f\u017a\u018e\u019e\u01a7\u01ac\u01b2\u01ba\u01c4\u01c6\u01c9\u01e0"+
		"\u01f8\u0214\u0232\u023a\u0244\u0253\u0264\u0267\u0274\u0276\u027d\u0286"+
		"\u0290\u0296\u029c\u02a1\u02a3\u02a9\u02ae\u02b0\u02ba\u02c4\u02d6\u02dc"+
		"\u02e0\u02e7\u02ef\u02f3\u030f\u0326\u0328\u032e\u0336\u033e\u0340\u0351"+
		"\u035f\u0361\u036a\u0372\u0374\u038c\u0396\u039b\u03a0\u03a5\u03c1\u03de"+
		"\u03e0\u03f6\u03fb\u03fe\u0403\u0409\u040b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}