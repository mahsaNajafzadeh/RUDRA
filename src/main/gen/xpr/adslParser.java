// Generated from /Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/adsl.g4 by ANTLR 4.7
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
public class adslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LITERAL=2, COMMA=3, SEMICOLON=4, CRLF=5, COLON=6, ASSIGN=7, ACTION=8, 
		CREAT=9, DEL=10, ONEOF=11, SUBSET=12, OBRACKET=13, CBRACKET=14, LEFT_RBRACKET=15, 
		RIGHT_RBRACKET=16, ID=17, ID_GLOBAL=18, ID_ACTION=19, AT=20;
	public static final int
		RULE_prog = 0, RULE_action_definition = 1, RULE_action_declaration = 2, 
		RULE_action_name = 3, RULE_action_body = 4, RULE_expression = 5, RULE_assignment = 6, 
		RULE_primary_expr = 7, RULE_create_statement = 8, RULE_delete_statement = 9, 
		RULE_find_statement = 10, RULE_var_id = 11, RULE_crlf = 12, RULE_terminator = 13;
	public static final String[] ruleNames = {
		"prog", "action_definition", "action_declaration", "action_name", "action_body", 
		"expression", "assignment", "primary_expr", "create_statement", "delete_statement", 
		"find_statement", "var_id", "crlf", "terminator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'__'", null, "','", "';'", null, "':'", "'='", "'action'", "'create'", 
		"'delete'", "'oneof'", "'subset'", "'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "COLON", "ASSIGN", 
		"ACTION", "CREAT", "DEL", "ONEOF", "SUBSET", "OBRACKET", "CBRACKET", "LEFT_RBRACKET", 
		"RIGHT_RBRACKET", "ID", "ID_GLOBAL", "ID_ACTION", "AT"
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
	public String getGrammarFileName() { return "adsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public adslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<Action_definitionContext> action_definition() {
			return getRuleContexts(Action_definitionContext.class);
		}
		public Action_definitionContext action_definition(int i) {
			return getRuleContext(Action_definitionContext.class,i);
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
			if ( listener instanceof adslListener ) ((adslListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTION) {
				{
				{
				setState(28);
				action_definition();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON || _la==CRLF) {
					{
					{
					setState(29);
					terminator(0);
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(39);
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

	public static class Action_definitionContext extends ParserRuleContext {
		public Action_declarationContext action_declaration() {
			return getRuleContext(Action_declarationContext.class,0);
		}
		public TerminalNode OBRACKET() { return getToken(adslParser.OBRACKET, 0); }
		public Action_bodyContext action_body() {
			return getRuleContext(Action_bodyContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(adslParser.CBRACKET, 0); }
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public Action_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterAction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitAction_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitAction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_definitionContext action_definition() throws RecognitionException {
		Action_definitionContext _localctx = new Action_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			action_declaration();
			setState(41);
			match(OBRACKET);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					crlf();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(48);
			action_body();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CRLF) {
				{
				{
				setState(49);
				crlf();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(CBRACKET);
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

	public static class Action_declarationContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(adslParser.ACTION, 0); }
		public Action_nameContext action_name() {
			return getRuleContext(Action_nameContext.class,0);
		}
		public Action_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterAction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitAction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitAction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_declarationContext action_declaration() throws RecognitionException {
		Action_declarationContext _localctx = new Action_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_action_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ACTION);
			setState(58);
			action_name();
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

	public static class Action_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(adslParser.ID, 0); }
		public Action_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterAction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitAction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitAction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_nameContext action_name() throws RecognitionException {
		Action_nameContext _localctx = new Action_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_action_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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

	public static class Action_bodyContext extends ParserRuleContext {
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
		public Action_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterAction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitAction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitAction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Action_bodyContext action_body() throws RecognitionException {
		Action_bodyContext _localctx = new Action_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==AT) {
				{
				{
				setState(62);
				expression();
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(63);
						terminator(0);
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				}
				setState(73);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(adslParser.ASSIGN, 0); }
		public Primary_exprContext primary_expr() {
			return getRuleContext(Primary_exprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			var_id();
			setState(77);
			match(ASSIGN);
			setState(78);
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
		public TerminalNode ID() { return getToken(adslParser.ID, 0); }
		public Create_statementContext create_statement() {
			return getRuleContext(Create_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Find_statementContext find_statement() {
			return getRuleContext(Find_statementContext.class,0);
		}
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public Primary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterPrimary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitPrimary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitPrimary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_exprContext primary_expr() throws RecognitionException {
		Primary_exprContext _localctx = new Primary_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primary_expr);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				create_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				delete_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				find_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				var_id();
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

	public static class Create_statementContext extends ParserRuleContext {
		public TerminalNode CREAT() { return getToken(adslParser.CREAT, 0); }
		public TerminalNode ID() { return getToken(adslParser.ID, 0); }
		public Create_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterCreate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitCreate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitCreate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_statementContext create_statement() throws RecognitionException {
		Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(CREAT);
			setState(88);
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

	public static class Delete_statementContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(adslParser.DEL, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminalNode ID() { return getToken(adslParser.ID, 0); }
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitDelete_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delete_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(DEL);
			setState(91);
			crlf();
			setState(92);
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

	public static class Find_statementContext extends ParserRuleContext {
		public TerminalNode ONEOF() { return getToken(adslParser.ONEOF, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(adslParser.LEFT_RBRACKET, 0); }
		public TerminalNode ID() { return getToken(adslParser.ID, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(adslParser.RIGHT_RBRACKET, 0); }
		public TerminalNode SUBSET() { return getToken(adslParser.SUBSET, 0); }
		public Find_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_find_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterFind_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitFind_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitFind_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Find_statementContext find_statement() throws RecognitionException {
		Find_statementContext _localctx = new Find_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_find_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONEOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(ONEOF);
				setState(95);
				match(LEFT_RBRACKET);
				setState(96);
				match(ID);
				setState(97);
				match(RIGHT_RBRACKET);
				}
				break;
			case SUBSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(SUBSET);
				setState(99);
				match(LEFT_RBRACKET);
				setState(100);
				match(ID);
				setState(101);
				match(RIGHT_RBRACKET);
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

	public static class Var_idContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(adslParser.AT, 0); }
		public TerminalNode ID() { return getToken(adslParser.ID, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterVar_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitVar_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitVar_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_id);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(AT);
				setState(105);
				match(T__0);
				setState(106);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ID);
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

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(adslParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitCrlf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitCrlf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(adslParser.SEMICOLON, 0); }
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
			if ( listener instanceof adslListener ) ((adslListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof adslListener ) ((adslListener)listener).exitTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof adslVisitor ) return ((adslVisitor<? extends T>)visitor).visitTerminator(this);
			else return visitor.visitChildren(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(113);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(114);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(117);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(118);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						crlf();
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\7\6C"+
		"\n\6\f\6\16\6F\13\6\7\6H\n\6\f\6\16\6K\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\tX\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\fi\n\f\3\r\3\r\3\r\3\r\5\ro\n\r\3\16\3\16\3\17"+
		"\3\17\3\17\5\17v\n\17\3\17\3\17\3\17\3\17\7\17|\n\17\f\17\16\17\177\13"+
		"\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u0081\2\'"+
		"\3\2\2\2\4*\3\2\2\2\6;\3\2\2\2\b>\3\2\2\2\nI\3\2\2\2\fL\3\2\2\2\16N\3"+
		"\2\2\2\20W\3\2\2\2\22Y\3\2\2\2\24\\\3\2\2\2\26h\3\2\2\2\30n\3\2\2\2\32"+
		"p\3\2\2\2\34u\3\2\2\2\36\"\5\4\3\2\37!\5\34\17\2 \37\3\2\2\2!$\3\2\2\2"+
		"\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2$\"\3\2\2\2%\36\3\2\2\2&)\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(\3\3\2\2\2)\'\3\2\2\2*+\5\6\4\2+/\7\17\2\2,.\5\32\16"+
		"\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2"+
		"\2\62\66\5\n\6\2\63\65\5\32\16\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2"+
		"\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\20\2\2:\5\3\2\2\2;<\7\n\2"+
		"\2<=\5\b\5\2=\7\3\2\2\2>?\7\23\2\2?\t\3\2\2\2@D\5\f\7\2AC\5\34\17\2BA"+
		"\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2G@\3\2\2\2H"+
		"K\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2\2LM\5\16\b\2M\r\3\2"+
		"\2\2NO\5\30\r\2OP\7\t\2\2PQ\5\20\t\2Q\17\3\2\2\2RX\7\23\2\2SX\5\22\n\2"+
		"TX\5\24\13\2UX\5\26\f\2VX\5\30\r\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2"+
		"\2\2WV\3\2\2\2X\21\3\2\2\2YZ\7\13\2\2Z[\7\23\2\2[\23\3\2\2\2\\]\7\f\2"+
		"\2]^\5\32\16\2^_\7\23\2\2_\25\3\2\2\2`a\7\r\2\2ab\7\21\2\2bc\7\23\2\2"+
		"ci\7\22\2\2de\7\16\2\2ef\7\21\2\2fg\7\23\2\2gi\7\22\2\2h`\3\2\2\2hd\3"+
		"\2\2\2i\27\3\2\2\2jk\7\26\2\2kl\7\3\2\2lo\7\23\2\2mo\7\23\2\2nj\3\2\2"+
		"\2nm\3\2\2\2o\31\3\2\2\2pq\7\7\2\2q\33\3\2\2\2rs\b\17\1\2sv\7\6\2\2tv"+
		"\5\32\16\2ur\3\2\2\2ut\3\2\2\2v}\3\2\2\2wx\f\6\2\2x|\7\6\2\2yz\f\5\2\2"+
		"z|\5\32\16\2{w\3\2\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\35"+
		"\3\2\2\2\177}\3\2\2\2\16\"\'/\66DIWhnu{}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}