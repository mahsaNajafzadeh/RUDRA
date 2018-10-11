// Generated from adsl.g4 by ANTLR 4.5.1
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
    static {
        RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, OR = 2, AT = 3, UNDER = 4, COMMA = 5, SEMICOLON = 6, CRLF = 7, COLON = 8, DOT = 9,
            ASSIGN = 10, PLUS_ASSIGN = 11, MINUS_ASSIGN = 12, ACTION = 13, CLASS = 14, CREAT = 15,
            DEL = 16, ONEOF = 17, SUBSET = 18, CC_UNIQUE = 19, ASSERT = 20, IF = 21, FOREACH = 22,
            EXTEND = 23, EMPTY = 24, EQUAL = 25, NEG = 26, ISINGROUP = 27, AND = 28, IN = 29, TRY = 30,
            ELSE = 31, ISEMPTY = 32, RAISE = 33, TRUE = 34, FALSE = 35, UNION = 36, OBRACKET = 37,
            CBRACKET = 38, LEFT_RBRACKET = 39, RIGHT_RBRACKET = 40, NUMBER = 41, STRING = 42,
            STRR = 43, ID_GLOBAL = 44, ID = 45, COMMENT = 46, WS = 47;
    public static final int
            RULE_prog = 0, RULE_class_definition = 1, RULE_class_declaration = 2,
            RULE_class_body = 3, RULE_class_name = 4, RULE_class_parent = 5, RULE_action_definition = 6,
            RULE_action_declaration = 7, RULE_action_name = 8, RULE_action_body = 9,
            RULE_expression = 10, RULE_bool_t = 11, RULE_dynamic_assignment = 12,
            RULE_foreach_statement = 13, RULE_if_statement = 14, RULE_else_token = 15,
            RULE_else_statement = 16, RULE_cond_expression = 17, RULE_inusergroup = 18,
            RULE_block_st = 19, RULE_comparison_list = 20, RULE_com = 21, RULE_in_func = 22,
            RULE_equal_func = 23, RULE_isempty_st = 24, RULE_assert_statement = 25,
            RULE_assert_body = 26, RULE_assert_expr = 27, RULE_set_expr = 28, RULE_exppp = 29,
            RULE_cc_statement = 30, RULE_cc_unique = 31, RULE_assignment = 32, RULE_multi_expr = 33,
            RULE_primary_expr = 34, RULE_union_st = 35, RULE_element = 36, RULE_create_statement = 37,
            RULE_create_expr = 38, RULE_delete_statement = 39, RULE_find_statement = 40,
            RULE_crlf = 41, RULE_terminator = 42, RULE_id = 43;
    public static final String[] ruleNames = {
            "prog", "class_definition", "class_declaration", "class_body", "class_name",
            "class_parent", "action_definition", "action_declaration", "action_name",
            "action_body", "expression", "bool_t", "dynamic_assignment", "foreach_statement",
            "if_statement", "else_token", "else_statement", "cond_expression", "inusergroup",
            "block_st", "comparison_list", "com", "in_func", "equal_func", "isempty_st",
            "assert_statement", "assert_body", "assert_expr", "set_expr", "exppp",
            "cc_statement", "cc_unique", "assignment", "multi_expr", "primary_expr",
            "union_st", "element", "create_statement", "create_expr", "delete_statement",
            "find_statement", "crlf", "terminator", "id"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'*'", "'or'", "'at'", "'__'", "','", "';'", null, "':'", "'.'",
            "'='", "'+='", "'-='", "'action'", "'class'", "'create'", "'delete'",
            "'oneof'", "'subset'", "'cc_unique'", "'assert'", "'if'", "'foreach'",
            "'extends'", "'empty'", "'equal'", "'not'", "'inusergroup'", "'and'",
            "'in'", "'tryoneof'", "'else'", "'isempty'", "'raise'", "'true'", "'false'",
            "'union'", "'{'", "'}'", "'('", "')'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, "OR", "AT", "UNDER", "COMMA", "SEMICOLON", "CRLF", "COLON",
            "DOT", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "ACTION", "CLASS", "CREAT",
            "DEL", "ONEOF", "SUBSET", "CC_UNIQUE", "ASSERT", "IF", "FOREACH", "EXTEND",
            "EMPTY", "EQUAL", "NEG", "ISINGROUP", "AND", "IN", "TRY", "ELSE", "ISEMPTY",
            "RAISE", "TRUE", "FALSE", "UNION", "OBRACKET", "CBRACKET", "LEFT_RBRACKET",
            "RIGHT_RBRACKET", "NUMBER", "STRING", "STRR", "ID_GLOBAL", "ID", "COMMENT",
            "WS"
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
    public String getGrammarFileName() {
        return "adsl.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public adslParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ProgContext extends ParserRuleContext {
        public List<Class_definitionContext> class_definition() {
            return getRuleContexts(Class_definitionContext.class);
        }

        public Class_definitionContext class_definition(int i) {
            return getRuleContext(Class_definitionContext.class, i);
        }

        public List<TerminatorContext> terminator() {
            return getRuleContexts(TerminatorContext.class);
        }

        public TerminatorContext terminator(int i) {
            return getRuleContext(TerminatorContext.class, i);
        }

        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitProg(this);
        }
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(97);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CLASS) {
                    {
                        {
                            setState(88);
                            class_definition();
                            setState(92);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == SEMICOLON || _la == CRLF) {
                                {
                                    {
                                        setState(89);
                                        terminator(0);
                                    }
                                }
                                setState(94);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }
                    setState(99);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_definitionContext extends ParserRuleContext {
        public Class_declarationContext class_declaration() {
            return getRuleContext(Class_declarationContext.class, 0);
        }

        public TerminalNode OBRACKET() {
            return getToken(adslParser.OBRACKET, 0);
        }

        public Class_bodyContext class_body() {
            return getRuleContext(Class_bodyContext.class, 0);
        }

        public TerminalNode CBRACKET() {
            return getToken(adslParser.CBRACKET, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public Class_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterClass_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitClass_definition(this);
        }
    }

    public final Class_definitionContext class_definition() throws RecognitionException {
        Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_class_definition);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(100);
                class_declaration();
                setState(101);
                match(OBRACKET);
                setState(105);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(102);
                                crlf();
                            }
                        }
                    }
                    setState(107);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                }
                setState(108);
                class_body();
                setState(112);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CRLF) {
                    {
                        {
                            setState(109);
                            crlf();
                        }
                    }
                    setState(114);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(115);
                match(CBRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_declarationContext extends ParserRuleContext {
        public TerminalNode CLASS() {
            return getToken(adslParser.CLASS, 0);
        }

        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public TerminalNode EXTEND() {
            return getToken(adslParser.EXTEND, 0);
        }

        public Class_parentContext class_parent() {
            return getRuleContext(Class_parentContext.class, 0);
        }

        public Class_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterClass_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitClass_declaration(this);
        }
    }

    public final Class_declarationContext class_declaration() throws RecognitionException {
        Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_class_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                match(CLASS);
                setState(118);
                class_name();
                setState(121);
                _la = _input.LA(1);
                if (_la == EXTEND) {
                    {
                        setState(119);
                        match(EXTEND);
                        setState(120);
                        class_parent();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_bodyContext extends ParserRuleContext {
        public List<Action_definitionContext> action_definition() {
            return getRuleContexts(Action_definitionContext.class);
        }

        public Action_definitionContext action_definition(int i) {
            return getRuleContext(Action_definitionContext.class, i);
        }

        public List<TerminatorContext> terminator() {
            return getRuleContexts(TerminatorContext.class);
        }

        public TerminatorContext terminator(int i) {
            return getRuleContext(TerminatorContext.class, i);
        }

        public Class_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterClass_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitClass_body(this);
        }
    }

    public final Class_bodyContext class_body() throws RecognitionException {
        Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_class_body);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(132);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ACTION) {
                    {
                        {
                            setState(123);
                            action_definition();
                            setState(127);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                if (_alt == 1) {
                                    {
                                        {
                                            setState(124);
                                            terminator(0);
                                        }
                                    }
                                }
                                setState(129);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                            }
                        }
                    }
                    setState(134);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_nameContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(adslParser.ID, 0);
        }

        public Class_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterClass_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitClass_name(this);
        }
    }

    public final Class_nameContext class_name() throws RecognitionException {
        Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_class_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_parentContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(adslParser.ID, 0);
        }

        public Class_parentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_parent;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterClass_parent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitClass_parent(this);
        }
    }

    public final Class_parentContext class_parent() throws RecognitionException {
        Class_parentContext _localctx = new Class_parentContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_class_parent);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(137);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Action_definitionContext extends ParserRuleContext {
        public Action_declarationContext action_declaration() {
            return getRuleContext(Action_declarationContext.class, 0);
        }

        public TerminalNode OBRACKET() {
            return getToken(adslParser.OBRACKET, 0);
        }

        public Action_bodyContext action_body() {
            return getRuleContext(Action_bodyContext.class, 0);
        }

        public TerminalNode CBRACKET() {
            return getToken(adslParser.CBRACKET, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public Action_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_action_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterAction_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitAction_definition(this);
        }
    }

    public final Action_definitionContext action_definition() throws RecognitionException {
        Action_definitionContext _localctx = new Action_definitionContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_action_definition);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(139);
                action_declaration();
                setState(140);
                match(OBRACKET);
                setState(144);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(141);
                                crlf();
                            }
                        }
                    }
                    setState(146);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                }
                setState(147);
                action_body();
                setState(151);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CRLF) {
                    {
                        {
                            setState(148);
                            crlf();
                        }
                    }
                    setState(153);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(154);
                match(CBRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Action_declarationContext extends ParserRuleContext {
        public TerminalNode ACTION() {
            return getToken(adslParser.ACTION, 0);
        }

        public Action_nameContext action_name() {
            return getRuleContext(Action_nameContext.class, 0);
        }

        public Action_declarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_action_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterAction_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitAction_declaration(this);
        }
    }

    public final Action_declarationContext action_declaration() throws RecognitionException {
        Action_declarationContext _localctx = new Action_declarationContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_action_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(156);
                match(ACTION);
                setState(157);
                action_name();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Action_nameContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(adslParser.ID, 0);
        }

        public Action_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_action_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterAction_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitAction_name(this);
        }
    }

    public final Action_nameContext action_name() throws RecognitionException {
        Action_nameContext _localctx = new Action_nameContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_action_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(159);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Action_bodyContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public Action_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_action_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterAction_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitAction_body(this);
        }
    }

    public final Action_bodyContext action_body() throws RecognitionException {
        Action_bodyContext _localctx = new Action_bodyContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_action_body);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(166);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREAT) | (1L << DEL) | (1L << ONEOF) | (1L << SUBSET) | (1L << CC_UNIQUE) | (1L << ASSERT) | (1L << IF) | (1L << FOREACH) | (1L << EMPTY) | (1L << EQUAL) | (1L << NEG) | (1L << ISINGROUP) | (1L << TRY) | (1L << ISEMPTY) | (1L << RAISE) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << STRING) | (1L << STRR) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(161);
                            expression();
                            setState(162);
                            crlf();
                        }
                    }
                    setState(168);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public Delete_statementContext delete_statement() {
            return getRuleContext(Delete_statementContext.class, 0);
        }

        public Cc_statementContext cc_statement() {
            return getRuleContext(Cc_statementContext.class, 0);
        }

        public Assert_statementContext assert_statement() {
            return getRuleContext(Assert_statementContext.class, 0);
        }

        public If_statementContext if_statement() {
            return getRuleContext(If_statementContext.class, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Foreach_statementContext foreach_statement() {
            return getRuleContext(Foreach_statementContext.class, 0);
        }

        public TerminalNode EMPTY() {
            return getToken(adslParser.EMPTY, 0);
        }

        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public Dynamic_assignmentContext dynamic_assignment() {
            return getRuleContext(Dynamic_assignmentContext.class, 0);
        }

        public Create_statementContext create_statement() {
            return getRuleContext(Create_statementContext.class, 0);
        }

        public TerminalNode RAISE() {
            return getToken(adslParser.RAISE, 0);
        }

        public Bool_tContext bool_t() {
            return getRuleContext(Bool_tContext.class, 0);
        }

        public ComContext com() {
            return getRuleContext(ComContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitExpression(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_expression);
        try {
            setState(184);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(169);
                    assignment();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(170);
                    delete_statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(171);
                    cc_statement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(172);
                    assert_statement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(173);
                    if_statement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(174);
                    id(0);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(175);
                    foreach_statement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(176);
                    match(EMPTY);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(177);
                    find_statement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(178);
                    dynamic_assignment();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(179);
                    create_statement();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(180);
                    match(RAISE);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(181);
                    bool_t();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(182);
                    com();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(183);
                    foreach_statement();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Bool_tContext extends ParserRuleContext {
        public TerminalNode TRUE() {
            return getToken(adslParser.TRUE, 0);
        }

        public TerminalNode FALSE() {
            return getToken(adslParser.FALSE, 0);
        }

        public Bool_tContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bool_t;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterBool_t(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitBool_t(this);
        }
    }

    public final Bool_tContext bool_t() throws RecognitionException {
        Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_bool_t);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(186);
                _la = _input.LA(1);
                if (!(_la == TRUE || _la == FALSE)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Dynamic_assignmentContext extends ParserRuleContext {
        public Token op;

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public TerminalNode PLUS_ASSIGN() {
            return getToken(adslParser.PLUS_ASSIGN, 0);
        }

        public TerminalNode MINUS_ASSIGN() {
            return getToken(adslParser.MINUS_ASSIGN, 0);
        }

        public TerminalNode EMPTY() {
            return getToken(adslParser.EMPTY, 0);
        }

        public Dynamic_assignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dynamic_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterDynamic_assignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitDynamic_assignment(this);
        }
    }

    public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
        Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_dynamic_assignment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(188);
                id(0);
                setState(189);
                ((Dynamic_assignmentContext) _localctx).op = _input.LT(1);
                _la = _input.LA(1);
                if (!(_la == PLUS_ASSIGN || _la == MINUS_ASSIGN)) {
                    ((Dynamic_assignmentContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                } else {
                    consume();
                }
                setState(192);
                switch (_input.LA(1)) {
                    case NUMBER:
                    case STRING:
                    case STRR:
                    case ID: {
                        setState(190);
                        id(0);
                    }
                    break;
                    case EMPTY: {
                        setState(191);
                        match(EMPTY);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Foreach_statementContext extends ParserRuleContext {
        public TerminalNode FOREACH() {
            return getToken(adslParser.FOREACH, 0);
        }

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public TerminalNode COLON() {
            return getToken(adslParser.COLON, 0);
        }

        public TerminalNode OBRACKET() {
            return getToken(adslParser.OBRACKET, 0);
        }

        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public Action_bodyContext action_body() {
            return getRuleContext(Action_bodyContext.class, 0);
        }

        public TerminalNode CBRACKET() {
            return getToken(adslParser.CBRACKET, 0);
        }

        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public Foreach_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_foreach_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterForeach_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitForeach_statement(this);
        }
    }

    public final Foreach_statementContext foreach_statement() throws RecognitionException {
        Foreach_statementContext _localctx = new Foreach_statementContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_foreach_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                match(FOREACH);
                setState(195);
                id(0);
                setState(196);
                match(COLON);
                setState(199);
                switch (_input.LA(1)) {
                    case NUMBER:
                    case STRING:
                    case STRR:
                    case ID: {
                        setState(197);
                        id(0);
                    }
                    break;
                    case ONEOF:
                    case SUBSET:
                    case TRY: {
                        setState(198);
                        find_statement();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(201);
                match(OBRACKET);
                setState(202);
                crlf();
                setState(203);
                action_body();
                setState(204);
                match(CBRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class If_statementContext extends ParserRuleContext {
        public TerminalNode IF() {
            return getToken(adslParser.IF, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public Cond_expressionContext cond_expression() {
            return getRuleContext(Cond_expressionContext.class, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public TerminalNode OBRACKET() {
            return getToken(adslParser.OBRACKET, 0);
        }

        public Action_bodyContext action_body() {
            return getRuleContext(Action_bodyContext.class, 0);
        }

        public TerminalNode CBRACKET() {
            return getToken(adslParser.CBRACKET, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public Else_tokenContext else_token() {
            return getRuleContext(Else_tokenContext.class, 0);
        }

        public If_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterIf_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitIf_statement(this);
        }
    }

    public final If_statementContext if_statement() throws RecognitionException {
        If_statementContext _localctx = new If_statementContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_if_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(206);
                match(IF);
                setState(207);
                match(LEFT_RBRACKET);
                setState(208);
                cond_expression();
                setState(209);
                match(RIGHT_RBRACKET);
                setState(210);
                match(OBRACKET);
                setState(214);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CRLF) {
                    {
                        {
                            setState(211);
                            crlf();
                        }
                    }
                    setState(216);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(217);
                action_body();
                setState(218);
                match(CBRACKET);
                setState(220);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(219);
                        else_token();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Else_tokenContext extends ParserRuleContext {
        public TerminalNode ELSE() {
            return getToken(adslParser.ELSE, 0);
        }

        public TerminalNode OBRACKET() {
            return getToken(adslParser.OBRACKET, 0);
        }

        public TerminalNode CBRACKET() {
            return getToken(adslParser.CBRACKET, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public List<Else_statementContext> else_statement() {
            return getRuleContexts(Else_statementContext.class);
        }

        public Else_statementContext else_statement(int i) {
            return getRuleContext(Else_statementContext.class, i);
        }

        public Else_tokenContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_else_token;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterElse_token(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitElse_token(this);
        }
    }

    public final Else_tokenContext else_token() throws RecognitionException {
        Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_else_token);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(222);
                match(ELSE);
                setState(223);
                match(OBRACKET);
                setState(227);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CRLF) {
                    {
                        {
                            setState(224);
                            crlf();
                        }
                    }
                    setState(229);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(235);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREAT) | (1L << ONEOF) | (1L << SUBSET) | (1L << IF) | (1L << EMPTY) | (1L << EQUAL) | (1L << NEG) | (1L << ISINGROUP) | (1L << TRY) | (1L << ISEMPTY) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << STRING) | (1L << STRR) | (1L << ID))) != 0)) {
                    {
                        {
                            setState(230);
                            else_statement();
                            setState(231);
                            crlf();
                        }
                    }
                    setState(237);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(238);
                match(CBRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Else_statementContext extends ParserRuleContext {
        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public If_statementContext if_statement() {
            return getRuleContext(If_statementContext.class, 0);
        }

        public Bool_tContext bool_t() {
            return getRuleContext(Bool_tContext.class, 0);
        }

        public TerminalNode EMPTY() {
            return getToken(adslParser.EMPTY, 0);
        }

        public ComContext com() {
            return getRuleContext(ComContext.class, 0);
        }

        public Dynamic_assignmentContext dynamic_assignment() {
            return getRuleContext(Dynamic_assignmentContext.class, 0);
        }

        public Create_statementContext create_statement() {
            return getRuleContext(Create_statementContext.class, 0);
        }

        public Else_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_else_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterElse_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitElse_statement(this);
        }
    }

    public final Else_statementContext else_statement() throws RecognitionException {
        Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_else_statement);
        try {
            setState(249);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(240);
                    find_statement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(241);
                    id(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(242);
                    assignment();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(243);
                    if_statement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(244);
                    bool_t();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(245);
                    match(EMPTY);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(246);
                    com();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(247);
                    dynamic_assignment();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(248);
                    create_statement();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Cond_expressionContext extends ParserRuleContext {
        public Comparison_listContext comparison_list() {
            return getRuleContext(Comparison_listContext.class, 0);
        }

        public Block_stContext block_st() {
            return getRuleContext(Block_stContext.class, 0);
        }

        public TerminalNode EMPTY() {
            return getToken(adslParser.EMPTY, 0);
        }

        public TerminalNode NEG() {
            return getToken(adslParser.NEG, 0);
        }

        public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cond_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterCond_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitCond_expression(this);
        }
    }

    public final Cond_expressionContext cond_expression() throws RecognitionException {
        Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_cond_expression);
        try {
            setState(257);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(251);
                    comparison_list();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(252);
                    match(T__0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(253);
                    block_st();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(254);
                    match(EMPTY);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(255);
                    match(NEG);
                    setState(256);
                    comparison_list();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InusergroupContext extends ParserRuleContext {
        public TerminalNode ISINGROUP() {
            return getToken(adslParser.ISINGROUP, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public List<ExpppContext> exppp() {
            return getRuleContexts(ExpppContext.class);
        }

        public ExpppContext exppp(int i) {
            return getRuleContext(ExpppContext.class, i);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(adslParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(adslParser.COMMA, i);
        }

        public InusergroupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inusergroup;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterInusergroup(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitInusergroup(this);
        }
    }

    public final InusergroupContext inusergroup() throws RecognitionException {
        InusergroupContext _localctx = new InusergroupContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_inusergroup);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(259);
                match(ISINGROUP);
                setState(260);
                match(LEFT_RBRACKET);
                setState(261);
                exppp();
                setState(266);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(262);
                            match(COMMA);
                            setState(263);
                            exppp();
                        }
                    }
                    setState(268);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(269);
                match(RIGHT_RBRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Block_stContext extends ParserRuleContext {
        public TerminalNode OBRACKET() {
            return getToken(adslParser.OBRACKET, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public TerminalNode CBRACKET() {
            return getToken(adslParser.CBRACKET, 0);
        }

        public List<Delete_statementContext> delete_statement() {
            return getRuleContexts(Delete_statementContext.class);
        }

        public Delete_statementContext delete_statement(int i) {
            return getRuleContext(Delete_statementContext.class, i);
        }

        public Block_stContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block_st;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterBlock_st(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitBlock_st(this);
        }
    }

    public final Block_stContext block_st() throws RecognitionException {
        Block_stContext _localctx = new Block_stContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_block_st);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                match(OBRACKET);
                setState(272);
                crlf();
                setState(278);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == DEL) {
                    {
                        {
                            setState(273);
                            delete_statement();
                            setState(274);
                            crlf();
                        }
                    }
                    setState(280);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(281);
                match(CBRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Comparison_listContext extends ParserRuleContext {
        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public List<Comparison_listContext> comparison_list() {
            return getRuleContexts(Comparison_listContext.class);
        }

        public Comparison_listContext comparison_list(int i) {
            return getRuleContext(Comparison_listContext.class, i);
        }

        public TerminalNode OR() {
            return getToken(adslParser.OR, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public ComContext com() {
            return getRuleContext(ComContext.class, 0);
        }

        public Comparison_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comparison_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterComparison_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitComparison_list(this);
        }
    }

    public final Comparison_listContext comparison_list() throws RecognitionException {
        Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_comparison_list);
        try {
            setState(290);
            switch (_input.LA(1)) {
                case LEFT_RBRACKET:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(283);
                    match(LEFT_RBRACKET);
                    setState(284);
                    comparison_list();
                    setState(285);
                    match(OR);
                    setState(286);
                    comparison_list();
                    setState(287);
                    match(RIGHT_RBRACKET);
                }
                break;
                case EQUAL:
                case NEG:
                case ISINGROUP:
                case ISEMPTY:
                case NUMBER:
                case STRING:
                case STRR:
                case ID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(289);
                    com();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ComContext extends ParserRuleContext {
        public InusergroupContext inusergroup() {
            return getRuleContext(InusergroupContext.class, 0);
        }

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public TerminalNode NEG() {
            return getToken(adslParser.NEG, 0);
        }

        public ComContext com() {
            return getRuleContext(ComContext.class, 0);
        }

        public Equal_funcContext equal_func() {
            return getRuleContext(Equal_funcContext.class, 0);
        }

        public In_funcContext in_func() {
            return getRuleContext(In_funcContext.class, 0);
        }

        public Isempty_stContext isempty_st() {
            return getRuleContext(Isempty_stContext.class, 0);
        }

        public ComContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_com;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterCom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitCom(this);
        }
    }

    public final ComContext com() throws RecognitionException {
        ComContext _localctx = new ComContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_com);
        try {
            setState(303);
            switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(292);
                    inusergroup();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(293);
                    id(0);
                    setState(294);
                    match(LEFT_RBRACKET);
                    setState(295);
                    id(0);
                    setState(296);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(298);
                    match(NEG);
                    setState(299);
                    com();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(300);
                    equal_func();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(301);
                    in_func();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(302);
                    isempty_st();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class In_funcContext extends ParserRuleContext {
        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public TerminalNode IN() {
            return getToken(adslParser.IN, 0);
        }

        public In_funcContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_in_func;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterIn_func(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitIn_func(this);
        }
    }

    public final In_funcContext in_func() throws RecognitionException {
        In_funcContext _localctx = new In_funcContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_in_func);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(305);
                id(0);
                setState(306);
                match(IN);
                setState(307);
                id(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Equal_funcContext extends ParserRuleContext {
        public TerminalNode EQUAL() {
            return getToken(adslParser.EQUAL, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public Equal_funcContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_equal_func;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterEqual_func(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitEqual_func(this);
        }
    }

    public final Equal_funcContext equal_func() throws RecognitionException {
        Equal_funcContext _localctx = new Equal_funcContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_equal_func);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(309);
                match(EQUAL);
                setState(310);
                match(LEFT_RBRACKET);
                setState(311);
                id(0);
                setState(312);
                match(COMMA);
                setState(313);
                id(0);
                setState(314);
                match(RIGHT_RBRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isempty_stContext extends ParserRuleContext {
        public TerminalNode ISEMPTY() {
            return getToken(adslParser.ISEMPTY, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public Isempty_stContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isempty_st;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterIsempty_st(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitIsempty_st(this);
        }
    }

    public final Isempty_stContext isempty_st() throws RecognitionException {
        Isempty_stContext _localctx = new Isempty_stContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_isempty_st);
        try {
            setState(331);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(316);
                    match(ISEMPTY);
                    setState(317);
                    match(LEFT_RBRACKET);
                    setState(318);
                    id(0);
                    setState(319);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(321);
                    match(ISEMPTY);
                    setState(322);
                    match(LEFT_RBRACKET);
                    setState(323);
                    assignment();
                    setState(324);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(326);
                    match(ISEMPTY);
                    setState(327);
                    match(LEFT_RBRACKET);
                    setState(328);
                    find_statement();
                    setState(329);
                    match(RIGHT_RBRACKET);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Assert_statementContext extends ParserRuleContext {
        public TerminalNode ASSERT() {
            return getToken(adslParser.ASSERT, 0);
        }

        public Assert_bodyContext assert_body() {
            return getRuleContext(Assert_bodyContext.class, 0);
        }

        public Assert_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assert_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterAssert_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitAssert_statement(this);
        }
    }

    public final Assert_statementContext assert_statement() throws RecognitionException {
        Assert_statementContext _localctx = new Assert_statementContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_assert_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(333);
                match(ASSERT);
                setState(334);
                assert_body();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Assert_bodyContext extends ParserRuleContext {
        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public Assert_exprContext assert_expr() {
            return getRuleContext(Assert_exprContext.class, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public Assert_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assert_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterAssert_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitAssert_body(this);
        }
    }

    public final Assert_bodyContext assert_body() throws RecognitionException {
        Assert_bodyContext _localctx = new Assert_bodyContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_assert_body);
        try {
            setState(341);
            switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(336);
                    match(LEFT_RBRACKET);
                    setState(337);
                    assert_expr();
                    setState(338);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(340);
                    assert_expr();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Assert_exprContext extends ParserRuleContext {
        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public InusergroupContext inusergroup() {
            return getRuleContext(InusergroupContext.class, 0);
        }

        public TerminalNode AND() {
            return getToken(adslParser.AND, 0);
        }

        public TerminalNode ID() {
            return getToken(adslParser.ID, 0);
        }

        public TerminalNode IN() {
            return getToken(adslParser.IN, 0);
        }

        public Set_exprContext set_expr() {
            return getRuleContext(Set_exprContext.class, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public ComContext com() {
            return getRuleContext(ComContext.class, 0);
        }

        public List<Assert_exprContext> assert_expr() {
            return getRuleContexts(Assert_exprContext.class);
        }

        public Assert_exprContext assert_expr(int i) {
            return getRuleContext(Assert_exprContext.class, i);
        }

        public TerminalNode OR() {
            return getToken(adslParser.OR, 0);
        }

        public Assert_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assert_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterAssert_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitAssert_expr(this);
        }
    }

    public final Assert_exprContext assert_expr() throws RecognitionException {
        Assert_exprContext _localctx = new Assert_exprContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_assert_expr);
        try {
            setState(368);
            switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(343);
                    match(LEFT_RBRACKET);
                    setState(344);
                    inusergroup();
                    setState(345);
                    match(AND);
                    setState(346);
                    match(ID);
                    setState(347);
                    match(IN);
                    setState(348);
                    set_expr();
                    setState(349);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(351);
                    inusergroup();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(352);
                    match(ID);
                    setState(353);
                    match(IN);
                    setState(354);
                    id(0);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(355);
                    com();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(356);
                    match(LEFT_RBRACKET);
                    setState(357);
                    assert_expr();
                    setState(358);
                    match(OR);
                    setState(359);
                    assert_expr();
                    setState(360);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(362);
                    match(LEFT_RBRACKET);
                    setState(363);
                    assert_expr();
                    setState(364);
                    match(AND);
                    setState(365);
                    assert_expr();
                    setState(366);
                    match(RIGHT_RBRACKET);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Set_exprContext extends ParserRuleContext {
        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(adslParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(adslParser.COMMA, i);
        }

        public Set_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_set_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterSet_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitSet_expr(this);
        }
    }

    public final Set_exprContext set_expr() throws RecognitionException {
        Set_exprContext _localctx = new Set_exprContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_set_expr);
        int _la;
        try {
            setState(383);
            switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(370);
                    id(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(371);
                    id(0);
                    setState(372);
                    match(LEFT_RBRACKET);
                    setState(373);
                    id(0);
                    setState(378);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(374);
                                match(COMMA);
                                setState(375);
                                id(0);
                            }
                        }
                        setState(380);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(381);
                    match(RIGHT_RBRACKET);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpppContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(adslParser.ID, 0);
        }

        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public ExpppContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_exppp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterExppp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitExppp(this);
        }
    }

    public final ExpppContext exppp() throws RecognitionException {
        ExpppContext _localctx = new ExpppContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_exppp);
        try {
            setState(387);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(385);
                    match(ID);
                }
                break;
                case ONEOF:
                case SUBSET:
                case TRY:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(386);
                    find_statement();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Cc_statementContext extends ParserRuleContext {
        public Cc_uniqueContext cc_unique() {
            return getRuleContext(Cc_uniqueContext.class, 0);
        }

        public Cc_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cc_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterCc_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitCc_statement(this);
        }
    }

    public final Cc_statementContext cc_statement() throws RecognitionException {
        Cc_statementContext _localctx = new Cc_statementContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_cc_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(389);
                cc_unique();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Cc_uniqueContext extends ParserRuleContext {
        public TerminalNode CC_UNIQUE() {
            return getToken(adslParser.CC_UNIQUE, 0);
        }

        public TerminalNode ID() {
            return getToken(adslParser.ID, 0);
        }

        public Cc_uniqueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cc_unique;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterCc_unique(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitCc_unique(this);
        }
    }

    public final Cc_uniqueContext cc_unique() throws RecognitionException {
        Cc_uniqueContext _localctx = new Cc_uniqueContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_cc_unique);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(391);
                match(CC_UNIQUE);
                setState(392);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(adslParser.ASSIGN, 0);
        }

        public Primary_exprContext primary_expr() {
            return getRuleContext(Primary_exprContext.class, 0);
        }

        public TerminalNode OBRACKET() {
            return getToken(adslParser.OBRACKET, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public TerminalNode CBRACKET() {
            return getToken(adslParser.CBRACKET, 0);
        }

        public List<Multi_exprContext> multi_expr() {
            return getRuleContexts(Multi_exprContext.class);
        }

        public Multi_exprContext multi_expr(int i) {
            return getRuleContext(Multi_exprContext.class, i);
        }

        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitAssignment(this);
        }
    }

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_assignment);
        try {
            int _alt;
            setState(411);
            switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(394);
                    id(0);
                    setState(395);
                    match(ASSIGN);
                    setState(396);
                    primary_expr();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(398);
                    id(0);
                    setState(399);
                    match(ASSIGN);
                    setState(400);
                    match(OBRACKET);
                    setState(401);
                    crlf();
                    setState(405);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(402);
                                    multi_expr();
                                }
                            }
                        }
                        setState(407);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                    }
                    setState(408);
                    crlf();
                    setState(409);
                    match(CBRACKET);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Multi_exprContext extends ParserRuleContext {
        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Create_statementContext create_statement() {
            return getRuleContext(Create_statementContext.class, 0);
        }

        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public TerminalNode EMPTY() {
            return getToken(adslParser.EMPTY, 0);
        }

        public If_statementContext if_statement() {
            return getRuleContext(If_statementContext.class, 0);
        }

        public Delete_statementContext delete_statement() {
            return getRuleContext(Delete_statementContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public Multi_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multi_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterMulti_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitMulti_expr(this);
        }
    }

    public final Multi_exprContext multi_expr() throws RecognitionException {
        Multi_exprContext _localctx = new Multi_exprContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_multi_expr);
        try {
            setState(426);
            switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(413);
                    crlf();
                    setState(414);
                    id(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(416);
                    create_statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(417);
                    find_statement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(418);
                    match(EMPTY);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(419);
                    crlf();
                    setState(420);
                    if_statement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(422);
                    crlf();
                    setState(423);
                    delete_statement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(425);
                    assignment();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Primary_exprContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Create_statementContext create_statement() {
            return getRuleContext(Create_statementContext.class, 0);
        }

        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public TerminalNode EMPTY() {
            return getToken(adslParser.EMPTY, 0);
        }

        public If_statementContext if_statement() {
            return getRuleContext(If_statementContext.class, 0);
        }

        public Delete_statementContext delete_statement() {
            return getRuleContext(Delete_statementContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public TerminalNode OBRACKET() {
            return getToken(adslParser.OBRACKET, 0);
        }

        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public Action_bodyContext action_body() {
            return getRuleContext(Action_bodyContext.class, 0);
        }

        public TerminalNode CBRACKET() {
            return getToken(adslParser.CBRACKET, 0);
        }

        public Union_stContext union_st() {
            return getRuleContext(Union_stContext.class, 0);
        }

        public Primary_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primary_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterPrimary_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitPrimary_expr(this);
        }
    }

    public final Primary_exprContext primary_expr() throws RecognitionException {
        Primary_exprContext _localctx = new Primary_exprContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_primary_expr);
        try {
            setState(441);
            switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(428);
                    id(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(429);
                    create_statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(430);
                    find_statement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(431);
                    match(EMPTY);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(432);
                    if_statement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(433);
                    delete_statement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(434);
                    assignment();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(435);
                    match(OBRACKET);
                    setState(436);
                    crlf();
                    setState(437);
                    action_body();
                    setState(438);
                    match(CBRACKET);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(440);
                    union_st();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Union_stContext extends ParserRuleContext {
        public TerminalNode UNION() {
            return getToken(adslParser.UNION, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public List<ElementContext> element() {
            return getRuleContexts(ElementContext.class);
        }

        public ElementContext element(int i) {
            return getRuleContext(ElementContext.class, i);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(adslParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(adslParser.COMMA, i);
        }

        public Union_stContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_union_st;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterUnion_st(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitUnion_st(this);
        }
    }

    public final Union_stContext union_st() throws RecognitionException {
        Union_stContext _localctx = new Union_stContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_union_st);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(443);
                match(UNION);
                setState(444);
                match(LEFT_RBRACKET);
                setState(445);
                element();
                setState(450);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(446);
                            match(COMMA);
                            setState(447);
                            element();
                        }
                    }
                    setState(452);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(453);
                match(RIGHT_RBRACKET);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public ElementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_element;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterElement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitElement(this);
        }
    }

    public final ElementContext element() throws RecognitionException {
        ElementContext _localctx = new ElementContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_element);
        try {
            setState(457);
            switch (_input.LA(1)) {
                case NUMBER:
                case STRING:
                case STRR:
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(455);
                    id(0);
                }
                break;
                case ONEOF:
                case SUBSET:
                case TRY:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(456);
                    find_statement();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Create_statementContext extends ParserRuleContext {
        public TerminalNode CREAT() {
            return getToken(adslParser.CREAT, 0);
        }

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public TerminalNode DOT() {
            return getToken(adslParser.DOT, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public Create_exprContext create_expr() {
            return getRuleContext(Create_exprContext.class, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public Create_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterCreate_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitCreate_statement(this);
        }
    }

    public final Create_statementContext create_statement() throws RecognitionException {
        Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_create_statement);
        int _la;
        try {
            setState(470);
            switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(459);
                    match(CREAT);
                    setState(460);
                    id(0);
                    setState(463);
                    _la = _input.LA(1);
                    if (_la == DOT) {
                        {
                            setState(461);
                            match(DOT);
                            setState(462);
                            id(0);
                        }
                    }

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(465);
                    match(CREAT);
                    setState(466);
                    match(LEFT_RBRACKET);
                    setState(467);
                    create_expr();
                    setState(468);
                    match(RIGHT_RBRACKET);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Create_exprContext extends ParserRuleContext {
        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public List<TerminalNode> DOT() {
            return getTokens(adslParser.DOT);
        }

        public TerminalNode DOT(int i) {
            return getToken(adslParser.DOT, i);
        }

        public List<TerminalNode> ID() {
            return getTokens(adslParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(adslParser.ID, i);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Create_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_create_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterCreate_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitCreate_expr(this);
        }
    }

    public final Create_exprContext create_expr() throws RecognitionException {
        Create_exprContext _localctx = new Create_exprContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_create_expr);
        int _la;
        try {
            setState(482);
            switch (_input.LA(1)) {
                case LEFT_RBRACKET:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(472);
                    match(LEFT_RBRACKET);
                    setState(473);
                    find_statement();
                    setState(474);
                    match(DOT);
                    setState(475);
                    match(ID);
                    setState(476);
                    match(RIGHT_RBRACKET);
                    setState(479);
                    _la = _input.LA(1);
                    if (_la == DOT) {
                        {
                            setState(477);
                            match(DOT);
                            setState(478);
                            match(ID);
                        }
                    }

                }
                break;
                case NUMBER:
                case STRING:
                case STRR:
                case ID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(481);
                    id(0);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Delete_statementContext extends ParserRuleContext {
        public TerminalNode DEL() {
            return getToken(adslParser.DEL, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public Find_statementContext find_statement() {
            return getRuleContext(Find_statementContext.class, 0);
        }

        public Delete_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_delete_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterDelete_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitDelete_statement(this);
        }
    }

    public final Delete_statementContext delete_statement() throws RecognitionException {
        Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_delete_statement);
        try {
            setState(494);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(484);
                    match(DEL);
                    setState(485);
                    match(LEFT_RBRACKET);
                    setState(486);
                    id(0);
                    setState(487);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(489);
                    match(DEL);
                    setState(490);
                    match(LEFT_RBRACKET);
                    setState(491);
                    find_statement();
                    setState(492);
                    match(RIGHT_RBRACKET);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Find_statementContext extends ParserRuleContext {
        public TerminalNode ONEOF() {
            return getToken(adslParser.ONEOF, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(adslParser.LEFT_RBRACKET, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(adslParser.RIGHT_RBRACKET, 0);
        }

        public TerminalNode DOT() {
            return getToken(adslParser.DOT, 0);
        }

        public TerminalNode ID() {
            return getToken(adslParser.ID, 0);
        }

        public TerminalNode SUBSET() {
            return getToken(adslParser.SUBSET, 0);
        }

        public If_statementContext if_statement() {
            return getRuleContext(If_statementContext.class, 0);
        }

        public TerminalNode TRY() {
            return getToken(adslParser.TRY, 0);
        }

        public Find_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_find_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterFind_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitFind_statement(this);
        }
    }

    public final Find_statementContext find_statement() throws RecognitionException {
        Find_statementContext _localctx = new Find_statementContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_find_statement);
        try {
            setState(517);
            switch (_input.LA(1)) {
                case ONEOF:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(496);
                    match(ONEOF);
                    setState(497);
                    match(LEFT_RBRACKET);
                    setState(498);
                    id(0);
                    setState(499);
                    match(RIGHT_RBRACKET);
                    setState(502);
                    switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                        case 1: {
                            setState(500);
                            match(DOT);
                            setState(501);
                            match(ID);
                        }
                        break;
                    }
                }
                break;
                case SUBSET:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(504);
                    match(SUBSET);
                    setState(505);
                    match(LEFT_RBRACKET);
                    setState(508);
                    switch (_input.LA(1)) {
                        case NUMBER:
                        case STRING:
                        case STRR:
                        case ID: {
                            setState(506);
                            id(0);
                        }
                        break;
                        case IF: {
                            setState(507);
                            if_statement();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(510);
                    match(RIGHT_RBRACKET);
                }
                break;
                case TRY:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(512);
                    match(TRY);
                    setState(513);
                    match(LEFT_RBRACKET);
                    setState(514);
                    id(0);
                    setState(515);
                    match(RIGHT_RBRACKET);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CrlfContext extends ParserRuleContext {
        public TerminalNode CRLF() {
            return getToken(adslParser.CRLF, 0);
        }

        public CrlfContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_crlf;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterCrlf(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitCrlf(this);
        }
    }

    public final CrlfContext crlf() throws RecognitionException {
        CrlfContext _localctx = new CrlfContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_crlf);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(519);
                match(CRLF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TerminatorContext extends ParserRuleContext {
        public TerminalNode SEMICOLON() {
            return getToken(adslParser.SEMICOLON, 0);
        }

        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public TerminatorContext terminator() {
            return getRuleContext(TerminatorContext.class, 0);
        }

        public TerminatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_terminator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterTerminator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitTerminator(this);
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
        int _startState = 84;
        enterRecursionRule(_localctx, 84, RULE_terminator, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(524);
                switch (_input.LA(1)) {
                    case SEMICOLON: {
                        setState(522);
                        match(SEMICOLON);
                    }
                    break;
                    case CRLF: {
                        setState(523);
                        crlf();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(532);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(530);
                            switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
                                case 1: {
                                    _localctx = new TerminatorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_terminator);
                                    setState(526);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(527);
                                    match(SEMICOLON);
                                }
                                break;
                                case 2: {
                                    _localctx = new TerminatorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_terminator);
                                    setState(528);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(529);
                                    crlf();
                                }
                                break;
                            }
                        }
                    }
                    setState(534);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class IdContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(adslParser.ID, 0);
        }

        public TerminalNode STRING() {
            return getToken(adslParser.STRING, 0);
        }

        public TerminalNode STRR() {
            return getToken(adslParser.STRR, 0);
        }

        public TerminalNode NUMBER() {
            return getToken(adslParser.NUMBER, 0);
        }

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public TerminalNode DOT() {
            return getToken(adslParser.DOT, 0);
        }

        public IdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_id;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).enterId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof adslListener) ((adslListener) listener).exitId(this);
        }
    }

    public final IdContext id() throws RecognitionException {
        return id(0);
    }

    private IdContext id(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        IdContext _localctx = new IdContext(_ctx, _parentState);
        IdContext _prevctx = _localctx;
        int _startState = 86;
        enterRecursionRule(_localctx, 86, RULE_id, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(540);
                switch (_input.LA(1)) {
                    case ID: {
                        setState(536);
                        match(ID);
                    }
                    break;
                    case STRING: {
                        setState(537);
                        match(STRING);
                    }
                    break;
                    case STRR: {
                        setState(538);
                        match(STRR);
                    }
                    break;
                    case NUMBER: {
                        setState(539);
                        match(NUMBER);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(547);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new IdContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_id);
                                setState(542);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(543);
                                match(DOT);
                                setState(544);
                                id(2);
                            }
                        }
                    }
                    setState(549);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 42:
                return terminator_sempred((TerminatorContext) _localctx, predIndex);
            case 43:
                return id_sempred((IdContext) _localctx, predIndex);
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

    private boolean id_sempred(IdContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return precpred(_ctx, 1);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0229\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\3\2\3\2\7\2]\n\2\f\2\16\2`\13\2\7\2b\n\2\f\2\16\2e\13\2\3\3" +
                    "\3\3\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\3\3\7\3q\n\3\f\3\16\3t\13\3\3\3\3" +
                    "\3\3\4\3\4\3\4\3\4\5\4|\n\4\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083\13\5" +
                    "\7\5\u0085\n\5\f\5\16\5\u0088\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b\u0091" +
                    "\n\b\f\b\16\b\u0094\13\b\3\b\3\b\7\b\u0098\n\b\f\b\16\b\u009b\13\b\3\b" +
                    "\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa" +
                    "\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f" +
                    "\u00bb\n\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00c3\n\16\3\17\3\17\3\17" +
                    "\3\17\3\17\5\17\u00ca\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20" +
                    "\3\20\3\20\7\20\u00d7\n\20\f\20\16\20\u00da\13\20\3\20\3\20\3\20\5\20" +
                    "\u00df\n\20\3\21\3\21\3\21\7\21\u00e4\n\21\f\21\16\21\u00e7\13\21\3\21" +
                    "\3\21\3\21\7\21\u00ec\n\21\f\21\16\21\u00ef\13\21\3\21\3\21\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fc\n\22\3\23\3\23\3\23\3\23" +
                    "\3\23\3\23\5\23\u0104\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u010b\n\24\f" +
                    "\24\16\24\u010e\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0117\n" +
                    "\25\f\25\16\25\u011a\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26" +
                    "\5\26\u0125\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\5\27\u0132\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\5\32\u014e\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0158" +
                    "\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35" +
                    "\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0173" +
                    "\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u017b\n\36\f\36\16\36\u017e\13" +
                    "\36\3\36\3\36\5\36\u0182\n\36\3\37\3\37\5\37\u0186\n\37\3 \3 \3!\3!\3" +
                    "!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0196\n\"\f\"\16\"\u0199\13" +
                    "\"\3\"\3\"\3\"\5\"\u019e\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5" +
                    "#\u01ad\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01bc\n$\3%\3%\3" +
                    "%\3%\3%\7%\u01c3\n%\f%\16%\u01c6\13%\3%\3%\3&\3&\5&\u01cc\n&\3\'\3\'\3" +
                    "\'\3\'\5\'\u01d2\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u01d9\n\'\3(\3(\3(\3(\3(" +
                    "\3(\3(\5(\u01e2\n(\3(\5(\u01e5\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01f1" +
                    "\n)\3*\3*\3*\3*\3*\3*\5*\u01f9\n*\3*\3*\3*\3*\5*\u01ff\n*\3*\3*\3*\3*" +
                    "\3*\3*\3*\5*\u0208\n*\3+\3+\3,\3,\3,\5,\u020f\n,\3,\3,\3,\3,\7,\u0215" +
                    "\n,\f,\16,\u0218\13,\3-\3-\3-\3-\3-\5-\u021f\n-\3-\3-\3-\7-\u0224\n-\f" +
                    "-\16-\u0227\13-\3-\2\4VX.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&" +
                    "(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\4\3\2$%\3\2\r\16\u025b\2c\3\2\2\2" +
                    "\4f\3\2\2\2\6w\3\2\2\2\b\u0086\3\2\2\2\n\u0089\3\2\2\2\f\u008b\3\2\2\2" +
                    "\16\u008d\3\2\2\2\20\u009e\3\2\2\2\22\u00a1\3\2\2\2\24\u00a8\3\2\2\2\26" +
                    "\u00ba\3\2\2\2\30\u00bc\3\2\2\2\32\u00be\3\2\2\2\34\u00c4\3\2\2\2\36\u00d0" +
                    "\3\2\2\2 \u00e0\3\2\2\2\"\u00fb\3\2\2\2$\u0103\3\2\2\2&\u0105\3\2\2\2" +
                    "(\u0111\3\2\2\2*\u0124\3\2\2\2,\u0131\3\2\2\2.\u0133\3\2\2\2\60\u0137" +
                    "\3\2\2\2\62\u014d\3\2\2\2\64\u014f\3\2\2\2\66\u0157\3\2\2\28\u0172\3\2" +
                    "\2\2:\u0181\3\2\2\2<\u0185\3\2\2\2>\u0187\3\2\2\2@\u0189\3\2\2\2B\u019d" +
                    "\3\2\2\2D\u01ac\3\2\2\2F\u01bb\3\2\2\2H\u01bd\3\2\2\2J\u01cb\3\2\2\2L" +
                    "\u01d8\3\2\2\2N\u01e4\3\2\2\2P\u01f0\3\2\2\2R\u0207\3\2\2\2T\u0209\3\2" +
                    "\2\2V\u020e\3\2\2\2X\u021e\3\2\2\2Z^\5\4\3\2[]\5V,\2\\[\3\2\2\2]`\3\2" +
                    "\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aZ\3\2\2\2be\3\2\2\2ca\3" +
                    "\2\2\2cd\3\2\2\2d\3\3\2\2\2ec\3\2\2\2fg\5\6\4\2gk\7\'\2\2hj\5T+\2ih\3" +
                    "\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2nr\5\b\5\2oq\5" +
                    "T+\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7(" +
                    "\2\2v\5\3\2\2\2wx\7\20\2\2x{\5\n\6\2yz\7\31\2\2z|\5\f\7\2{y\3\2\2\2{|" +
                    "\3\2\2\2|\7\3\2\2\2}\u0081\5\16\b\2~\u0080\5V,\2\177~\3\2\2\2\u0080\u0083" +
                    "\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083" +
                    "\u0081\3\2\2\2\u0084}\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2" +
                    "\u0086\u0087\3\2\2\2\u0087\t\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7" +
                    "/\2\2\u008a\13\3\2\2\2\u008b\u008c\7/\2\2\u008c\r\3\2\2\2\u008d\u008e" +
                    "\5\20\t\2\u008e\u0092\7\'\2\2\u008f\u0091\5T+\2\u0090\u008f\3\2\2\2\u0091" +
                    "\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2" +
                    "\2\2\u0094\u0092\3\2\2\2\u0095\u0099\5\24\13\2\u0096\u0098\5T+\2\u0097" +
                    "\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2" +
                    "\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7(\2\2\u009d" +
                    "\17\3\2\2\2\u009e\u009f\7\17\2\2\u009f\u00a0\5\22\n\2\u00a0\21\3\2\2\2" +
                    "\u00a1\u00a2\7/\2\2\u00a2\23\3\2\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5" +
                    "\5T+\2\u00a5\u00a7\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8" +
                    "\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00a8\3\2\2" +
                    "\2\u00ab\u00bb\5B\"\2\u00ac\u00bb\5P)\2\u00ad\u00bb\5> \2\u00ae\u00bb" +
                    "\5\64\33\2\u00af\u00bb\5\36\20\2\u00b0\u00bb\5X-\2\u00b1\u00bb\5\34\17" +
                    "\2\u00b2\u00bb\7\32\2\2\u00b3\u00bb\5R*\2\u00b4\u00bb\5\32\16\2\u00b5" +
                    "\u00bb\5L\'\2\u00b6\u00bb\7#\2\2\u00b7\u00bb\5\30\r\2\u00b8\u00bb\5,\27" +
                    "\2\u00b9\u00bb\5\34\17\2\u00ba\u00ab\3\2\2\2\u00ba\u00ac\3\2\2\2\u00ba" +
                    "\u00ad\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b0\3\2" +
                    "\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba" +
                    "\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2" +
                    "\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00bd" +
                    "\t\2\2\2\u00bd\31\3\2\2\2\u00be\u00bf\5X-\2\u00bf\u00c2\t\3\2\2\u00c0" +
                    "\u00c3\5X-\2\u00c1\u00c3\7\32\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2" +
                    "\2\2\u00c3\33\3\2\2\2\u00c4\u00c5\7\30\2\2\u00c5\u00c6\5X-\2\u00c6\u00c9" +
                    "\7\n\2\2\u00c7\u00ca\5X-\2\u00c8\u00ca\5R*\2\u00c9\u00c7\3\2\2\2\u00c9" +
                    "\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\'\2\2\u00cc\u00cd\5T" +
                    "+\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\7(\2\2\u00cf\35\3\2\2\2\u00d0\u00d1" +
                    "\7\27\2\2\u00d1\u00d2\7)\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7*\2\2\u00d4" +
                    "\u00d8\7\'\2\2\u00d5\u00d7\5T+\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2" +
                    "\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8" +
                    "\3\2\2\2\u00db\u00dc\5\24\13\2\u00dc\u00de\7(\2\2\u00dd\u00df\5 \21\2" +
                    "\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\37\3\2\2\2\u00e0\u00e1" +
                    "\7!\2\2\u00e1\u00e5\7\'\2\2\u00e2\u00e4\5T+\2\u00e3\u00e2\3\2\2\2\u00e4" +
                    "\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ed\3\2" +
                    "\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5\"\22\2\u00e9\u00ea\5T+\2\u00ea" +
                    "\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2" +
                    "\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0" +
                    "\u00f1\7(\2\2\u00f1!\3\2\2\2\u00f2\u00fc\5R*\2\u00f3\u00fc\5X-\2\u00f4" +
                    "\u00fc\5B\"\2\u00f5\u00fc\5\36\20\2\u00f6\u00fc\5\30\r\2\u00f7\u00fc\7" +
                    "\32\2\2\u00f8\u00fc\5,\27\2\u00f9\u00fc\5\32\16\2\u00fa\u00fc\5L\'\2\u00fb" +
                    "\u00f2\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fb\u00f5\3\2" +
                    "\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb" +
                    "\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc#\3\2\2\2\u00fd\u0104\5*\26\2" +
                    "\u00fe\u0104\7\3\2\2\u00ff\u0104\5(\25\2\u0100\u0104\7\32\2\2\u0101\u0102" +
                    "\7\34\2\2\u0102\u0104\5*\26\2\u0103\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2" +
                    "\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0104%\3" +
                    "\2\2\2\u0105\u0106\7\35\2\2\u0106\u0107\7)\2\2\u0107\u010c\5<\37\2\u0108" +
                    "\u0109\7\7\2\2\u0109\u010b\5<\37\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2" +
                    "\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e" +
                    "\u010c\3\2\2\2\u010f\u0110\7*\2\2\u0110\'\3\2\2\2\u0111\u0112\7\'\2\2" +
                    "\u0112\u0118\5T+\2\u0113\u0114\5P)\2\u0114\u0115\5T+\2\u0115\u0117\3\2" +
                    "\2\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118" +
                    "\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7(" +
                    "\2\2\u011c)\3\2\2\2\u011d\u011e\7)\2\2\u011e\u011f\5*\26\2\u011f\u0120" +
                    "\7\4\2\2\u0120\u0121\5*\26\2\u0121\u0122\7*\2\2\u0122\u0125\3\2\2\2\u0123" +
                    "\u0125\5,\27\2\u0124\u011d\3\2\2\2\u0124\u0123\3\2\2\2\u0125+\3\2\2\2" +
                    "\u0126\u0132\5&\24\2\u0127\u0128\5X-\2\u0128\u0129\7)\2\2\u0129\u012a" +
                    "\5X-\2\u012a\u012b\7*\2\2\u012b\u0132\3\2\2\2\u012c\u012d\7\34\2\2\u012d" +
                    "\u0132\5,\27\2\u012e\u0132\5\60\31\2\u012f\u0132\5.\30\2\u0130\u0132\5" +
                    "\62\32\2\u0131\u0126\3\2\2\2\u0131\u0127\3\2\2\2\u0131\u012c\3\2\2\2\u0131" +
                    "\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132-\3\2\2\2" +
                    "\u0133\u0134\5X-\2\u0134\u0135\7\37\2\2\u0135\u0136\5X-\2\u0136/\3\2\2" +
                    "\2\u0137\u0138\7\33\2\2\u0138\u0139\7)\2\2\u0139\u013a\5X-\2\u013a\u013b" +
                    "\7\7\2\2\u013b\u013c\5X-\2\u013c\u013d\7*\2\2\u013d\61\3\2\2\2\u013e\u013f" +
                    "\7\"\2\2\u013f\u0140\7)\2\2\u0140\u0141\5X-\2\u0141\u0142\7*\2\2\u0142" +
                    "\u014e\3\2\2\2\u0143\u0144\7\"\2\2\u0144\u0145\7)\2\2\u0145\u0146\5B\"" +
                    "\2\u0146\u0147\7*\2\2\u0147\u014e\3\2\2\2\u0148\u0149\7\"\2\2\u0149\u014a" +
                    "\7)\2\2\u014a\u014b\5R*\2\u014b\u014c\7*\2\2\u014c\u014e\3\2\2\2\u014d" +
                    "\u013e\3\2\2\2\u014d\u0143\3\2\2\2\u014d\u0148\3\2\2\2\u014e\63\3\2\2" +
                    "\2\u014f\u0150\7\26\2\2\u0150\u0151\5\66\34\2\u0151\65\3\2\2\2\u0152\u0153" +
                    "\7)\2\2\u0153\u0154\58\35\2\u0154\u0155\7*\2\2\u0155\u0158\3\2\2\2\u0156" +
                    "\u0158\58\35\2\u0157\u0152\3\2\2\2\u0157\u0156\3\2\2\2\u0158\67\3\2\2" +
                    "\2\u0159\u015a\7)\2\2\u015a\u015b\5&\24\2\u015b\u015c\7\36\2\2\u015c\u015d" +
                    "\7/\2\2\u015d\u015e\7\37\2\2\u015e\u015f\5:\36\2\u015f\u0160\7*\2\2\u0160" +
                    "\u0173\3\2\2\2\u0161\u0173\5&\24\2\u0162\u0163\7/\2\2\u0163\u0164\7\37" +
                    "\2\2\u0164\u0173\5X-\2\u0165\u0173\5,\27\2\u0166\u0167\7)\2\2\u0167\u0168" +
                    "\58\35\2\u0168\u0169\7\4\2\2\u0169\u016a\58\35\2\u016a\u016b\7*\2\2\u016b" +
                    "\u0173\3\2\2\2\u016c\u016d\7)\2\2\u016d\u016e\58\35\2\u016e\u016f\7\36" +
                    "\2\2\u016f\u0170\58\35\2\u0170\u0171\7*\2\2\u0171\u0173\3\2\2\2\u0172" +
                    "\u0159\3\2\2\2\u0172\u0161\3\2\2\2\u0172\u0162\3\2\2\2\u0172\u0165\3\2" +
                    "\2\2\u0172\u0166\3\2\2\2\u0172\u016c\3\2\2\2\u01739\3\2\2\2\u0174\u0182" +
                    "\5X-\2\u0175\u0176\5X-\2\u0176\u0177\7)\2\2\u0177\u017c\5X-\2\u0178\u0179" +
                    "\7\7\2\2\u0179\u017b\5X-\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c" +
                    "\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2" +
                    "\2\2\u017f\u0180\7*\2\2\u0180\u0182\3\2\2\2\u0181\u0174\3\2\2\2\u0181" +
                    "\u0175\3\2\2\2\u0182;\3\2\2\2\u0183\u0186\7/\2\2\u0184\u0186\5R*\2\u0185" +
                    "\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186=\3\2\2\2\u0187\u0188\5@!\2\u0188" +
                    "?\3\2\2\2\u0189\u018a\7\25\2\2\u018a\u018b\7/\2\2\u018bA\3\2\2\2\u018c" +
                    "\u018d\5X-\2\u018d\u018e\7\f\2\2\u018e\u018f\5F$\2\u018f\u019e\3\2\2\2" +
                    "\u0190\u0191\5X-\2\u0191\u0192\7\f\2\2\u0192\u0193\7\'\2\2\u0193\u0197" +
                    "\5T+\2\u0194\u0196\5D#\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197" +
                    "\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2" +
                    "\2\2\u019a\u019b\5T+\2\u019b\u019c\7(\2\2\u019c\u019e\3\2\2\2\u019d\u018c" +
                    "\3\2\2\2\u019d\u0190\3\2\2\2\u019eC\3\2\2\2\u019f\u01a0\5T+\2\u01a0\u01a1" +
                    "\5X-\2\u01a1\u01ad\3\2\2\2\u01a2\u01ad\5L\'\2\u01a3\u01ad\5R*\2\u01a4" +
                    "\u01ad\7\32\2\2\u01a5\u01a6\5T+\2\u01a6\u01a7\5\36\20\2\u01a7\u01ad\3" +
                    "\2\2\2\u01a8\u01a9\5T+\2\u01a9\u01aa\5P)\2\u01aa\u01ad\3\2\2\2\u01ab\u01ad" +
                    "\5B\"\2\u01ac\u019f\3\2\2\2\u01ac\u01a2\3\2\2\2\u01ac\u01a3\3\2\2\2\u01ac" +
                    "\u01a4\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac\u01ab\3\2" +
                    "\2\2\u01adE\3\2\2\2\u01ae\u01bc\5X-\2\u01af\u01bc\5L\'\2\u01b0\u01bc\5" +
                    "R*\2\u01b1\u01bc\7\32\2\2\u01b2\u01bc\5\36\20\2\u01b3\u01bc\5P)\2\u01b4" +
                    "\u01bc\5B\"\2\u01b5\u01b6\7\'\2\2\u01b6\u01b7\5T+\2\u01b7\u01b8\5\24\13" +
                    "\2\u01b8\u01b9\7(\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bc\5H%\2\u01bb\u01ae" +
                    "\3\2\2\2\u01bb\u01af\3\2\2\2\u01bb\u01b0\3\2\2\2\u01bb\u01b1\3\2\2\2\u01bb" +
                    "\u01b2\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bb\u01b4\3\2\2\2\u01bb\u01b5\3\2" +
                    "\2\2\u01bb\u01ba\3\2\2\2\u01bcG\3\2\2\2\u01bd\u01be\7&\2\2\u01be\u01bf" +
                    "\7)\2\2\u01bf\u01c4\5J&\2\u01c0\u01c1\7\7\2\2\u01c1\u01c3\5J&\2\u01c2" +
                    "\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2" +
                    "\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7*\2\2\u01c8" +
                    "I\3\2\2\2\u01c9\u01cc\5X-\2\u01ca\u01cc\5R*\2\u01cb\u01c9\3\2\2\2\u01cb" +
                    "\u01ca\3\2\2\2\u01ccK\3\2\2\2\u01cd\u01ce\7\21\2\2\u01ce\u01d1\5X-\2\u01cf" +
                    "\u01d0\7\13\2\2\u01d0\u01d2\5X-\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2" +
                    "\2\2\u01d2\u01d9\3\2\2\2\u01d3\u01d4\7\21\2\2\u01d4\u01d5\7)\2\2\u01d5" +
                    "\u01d6\5N(\2\u01d6\u01d7\7*\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01cd\3\2\2" +
                    "\2\u01d8\u01d3\3\2\2\2\u01d9M\3\2\2\2\u01da\u01db\7)\2\2\u01db\u01dc\5" +
                    "R*\2\u01dc\u01dd\7\13\2\2\u01dd\u01de\7/\2\2\u01de\u01e1\7*\2\2\u01df" +
                    "\u01e0\7\13\2\2\u01e0\u01e2\7/\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2" +
                    "\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e5\5X-\2\u01e4\u01da\3\2\2\2\u01e4\u01e3" +
                    "\3\2\2\2\u01e5O\3\2\2\2\u01e6\u01e7\7\22\2\2\u01e7\u01e8\7)\2\2\u01e8" +
                    "\u01e9\5X-\2\u01e9\u01ea\7*\2\2\u01ea\u01f1\3\2\2\2\u01eb\u01ec\7\22\2" +
                    "\2\u01ec\u01ed\7)\2\2\u01ed\u01ee\5R*\2\u01ee\u01ef\7*\2\2\u01ef\u01f1" +
                    "\3\2\2\2\u01f0\u01e6\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1Q\3\2\2\2\u01f2" +
                    "\u01f3\7\23\2\2\u01f3\u01f4\7)\2\2\u01f4\u01f5\5X-\2\u01f5\u01f8\7*\2" +
                    "\2\u01f6\u01f7\7\13\2\2\u01f7\u01f9\7/\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9" +
                    "\3\2\2\2\u01f9\u0208\3\2\2\2\u01fa\u01fb\7\24\2\2\u01fb\u01fe\7)\2\2\u01fc" +
                    "\u01ff\5X-\2\u01fd\u01ff\5\36\20\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2" +
                    "\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\7*\2\2\u0201\u0208\3\2\2\2\u0202" +
                    "\u0203\7 \2\2\u0203\u0204\7)\2\2\u0204\u0205\5X-\2\u0205\u0206\7*\2\2" +
                    "\u0206\u0208\3\2\2\2\u0207\u01f2\3\2\2\2\u0207\u01fa\3\2\2\2\u0207\u0202" +
                    "\3\2\2\2\u0208S\3\2\2\2\u0209\u020a\7\t\2\2\u020aU\3\2\2\2\u020b\u020c" +
                    "\b,\1\2\u020c\u020f\7\b\2\2\u020d\u020f\5T+\2\u020e\u020b\3\2\2\2\u020e" +
                    "\u020d\3\2\2\2\u020f\u0216\3\2\2\2\u0210\u0211\f\6\2\2\u0211\u0215\7\b" +
                    "\2\2\u0212\u0213\f\5\2\2\u0213\u0215\5T+\2\u0214\u0210\3\2\2\2\u0214\u0212" +
                    "\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217" +
                    "W\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\b-\1\2\u021a\u021f\7/\2\2\u021b" +
                    "\u021f\7,\2\2\u021c\u021f\7-\2\2\u021d\u021f\7+\2\2\u021e\u0219\3\2\2" +
                    "\2\u021e\u021b\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021f\u0225" +
                    "\3\2\2\2\u0220\u0221\f\3\2\2\u0221\u0222\7\13\2\2\u0222\u0224\5X-\4\u0223" +
                    "\u0220\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2" +
                    "\2\2\u0226Y\3\2\2\2\u0227\u0225\3\2\2\2\62^ckr{\u0081\u0086\u0092\u0099" +
                    "\u00a8\u00ba\u00c2\u00c9\u00d8\u00de\u00e5\u00ed\u00fb\u0103\u010c\u0118" +
                    "\u0124\u0131\u014d\u0157\u0172\u017c\u0181\u0185\u0197\u019d\u01ac\u01bb" +
                    "\u01c4\u01cb\u01d1\u01d8\u01e1\u01e4\u01f0\u01f8\u01fe\u0207\u020e\u0214" +
                    "\u0216\u021e\u0225";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}