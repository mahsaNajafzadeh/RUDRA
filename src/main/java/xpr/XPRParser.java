// Generated from XPR.g4 by ANTLR 4.5.1
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
public class XPRParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            LITERAL = 1, COMMA = 2, SEMICOLON = 3, CRLF = 4, COLON = 5, REQUIRE = 6, END = 7, DEF = 8,
            RETURN = 9, PIR = 10, NEW = 11, DEL = 12, VPRE = 13, VNUM = 14, VALIDATE = 15, BELONG = 16,
            HAS_MANY = 17, DEP = 18, DESTROY = 19, CLAS = 20, PARENT = 21, PUT = 22, SELF = 23,
            SAVE = 24, TRANS = 25, DO = 26, VGE = 27, VGT = 28, VLE = 29, VLT = 30, FALSE = 31, TRUE = 32,
            IF = 33, ELSE = 34, ELSIF = 35, UNLESS = 36, WHILE = 37, RETRY = 38, BREAK = 39, FOR = 40,
            PLUS = 41, MINUS = 42, MUL = 43, DIV = 44, MOD = 45, EXP = 46, EQUAL = 47, NOT_EQUAL = 48,
            GREATER = 49, LESS = 50, LESS_EQUAL = 51, GREATER_EQUAL = 52, ASSIGN = 53, PLUS_ASSIGN = 54,
            MINUS_ASSIGN = 55, MUL_ASSIGN = 56, DIV_ASSIGN = 57, MOD_ASSIGN = 58, EXP_ASSIGN = 59,
            BIT_AND = 60, BIT_OR = 61, BIT_XOR = 62, BIT_NOT = 63, BIT_SHL = 64, BIT_SHR = 65,
            AND = 66, OR = 67, NOT = 68, DOT = 69, LEFT_RBRACKET = 70, RIGHT_RBRACKET = 71, LEFT_SBRACKET = 72,
            RIGHT_SBRACKET = 73, NIL = 74, SL_COMMENT = 75, ML_COMMENT = 76, WS = 77, INT = 78,
            FLOAT = 79, ID = 80, ID_GLOBAL = 81, ID_FUNCTION = 82;
    public static final int
            RULE_prog = 0, RULE_class_definition = 1, RULE_class_declaration = 2,
            RULE_class_name = 3, RULE_class_body = 4, RULE_expression = 5, RULE_put_statement = 6,
            RULE_global_get = 7, RULE_global_set = 8, RULE_global_result = 9, RULE_function_inline_call = 10,
            RULE_require_block = 11, RULE_pir_inline = 12, RULE_pir_expression_list = 13,
            RULE_function_definition = 14, RULE_function_definition_body = 15, RULE_trans_statement = 16,
            RULE_function_definition_header = 17, RULE_function_name = 18, RULE_function_definition_params = 19,
            RULE_function_definition_params_list = 20, RULE_function_definition_param_id = 21,
            RULE_new_statement = 22, RULE_remove_statement = 23, RULE_arguments = 24,
            RULE_validate_presence = 25, RULE_validate_num = 26, RULE_cond_num = 27,
            RULE_belong_statement = 28, RULE_has_many_statement = 29, RULE_del_expr = 30,
            RULE_return_statement = 31, RULE_save_statement = 32, RULE_function_call = 33,
            RULE_function_call_param_list = 34, RULE_function_call_params = 35, RULE_function_param = 36,
            RULE_function_unnamed_param = 37, RULE_function_named_param = 38, RULE_function_call_assignment = 39,
            RULE_all_result = 40, RULE_elsif_statement = 41, RULE_if_elsif_statement = 42,
            RULE_if_statement = 43, RULE_unless_statement = 44, RULE_while_statement = 45,
            RULE_for_statement = 46, RULE_init_expression = 47, RULE_all_assignment = 48,
            RULE_for_init_list = 49, RULE_cond_expression = 50, RULE_loop_expression = 51,
            RULE_for_loop_list = 52, RULE_statement_body = 53, RULE_statement_expression_list = 54,
            RULE_assignment = 55, RULE_primary_expr = 56, RULE_dynamic_assignment = 57,
            RULE_int_assignment = 58, RULE_int_plus = 59, RULE_int_minus = 60, RULE_float_assignment = 61,
            RULE_string_assignment = 62, RULE_initial_array_assignment = 63, RULE_array_assignment = 64,
            RULE_array_definition = 65, RULE_array_definition_elements = 66, RULE_array_selector = 67,
            RULE_dynamic_result = 68, RULE_dynamic = 69, RULE_int_result = 70, RULE_float_result = 71,
            RULE_string_result = 72, RULE_comparison_list = 73, RULE_nil_check = 74,
            RULE_comparison = 75, RULE_comp_var = 76, RULE_lvalue = 77, RULE_rvalue = 78,
            RULE_break_expression = 79, RULE_literal_t = 80, RULE_float_t = 81, RULE_int_t = 82,
            RULE_bool_t = 83, RULE_nil_t = 84, RULE_id = 85, RULE_id_global = 86,
            RULE_id_function = 87, RULE_terminator = 88, RULE_else_token = 89, RULE_crlf = 90;
    public static final String[] ruleNames = {
            "prog", "class_definition", "class_declaration", "class_name", "class_body",
            "expression", "put_statement", "global_get", "global_set", "global_result",
            "function_inline_call", "require_block", "pir_inline", "pir_expression_list",
            "function_definition", "function_definition_body", "trans_statement",
            "function_definition_header", "function_name", "function_definition_params",
            "function_definition_params_list", "function_definition_param_id", "new_statement",
            "remove_statement", "arguments", "validate_presence", "validate_num",
            "cond_num", "belong_statement", "has_many_statement", "del_expr", "return_statement",
            "save_statement", "function_call", "function_call_param_list", "function_call_params",
            "function_param", "function_unnamed_param", "function_named_param", "function_call_assignment",
            "all_result", "elsif_statement", "if_elsif_statement", "if_statement",
            "unless_statement", "while_statement", "for_statement", "init_expression",
            "all_assignment", "for_init_list", "cond_expression", "loop_expression",
            "for_loop_list", "statement_body", "statement_expression_list", "assignment",
            "primary_expr", "dynamic_assignment", "int_assignment", "int_plus", "int_minus",
            "float_assignment", "string_assignment", "initial_array_assignment", "array_assignment",
            "array_definition", "array_definition_elements", "array_selector", "dynamic_result",
            "dynamic", "int_result", "float_result", "string_result", "comparison_list",
            "nil_check", "comparison", "comp_var", "lvalue", "rvalue", "break_expression",
            "literal_t", "float_t", "int_t", "bool_t", "nil_t", "id", "id_global",
            "id_function", "terminator", "else_token", "crlf"
    };

    private static final String[] _LITERAL_NAMES = {
            null, null, "','", "';'", null, "':'", "'require'", "'end'", "'def'",
            "'return'", "'pir'", "'new'", null, "'validates_presence_of'", "'validates_numericality_of'",
            "'validates'", "'belongs_to'", "'has_many'", "'dependent:'", "':destroy'",
            "'class'", "'ApplicationRecord'", "'puts'", "'self'", "'save!'", "'transaction'",
            "'do'", "'greater_than_or_equal_to:'", "'greater_than:'", "'less_than_or_equal_to:'",
            "'less_than:'", "'false'", "'true'", "'if'", "'else'", "'elsif'", "'unless'",
            "'while'", "'retry'", "'break'", "'for'", "'+'", "'-'", "'*'", "'/'",
            "'%'", "'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='",
            "'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", "'<<'",
            "'>>'", null, null, null, "'.'", "'('", "')'", "'['", "']'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "COLON", "REQUIRE", "END",
            "DEF", "RETURN", "PIR", "NEW", "DEL", "VPRE", "VNUM", "VALIDATE", "BELONG",
            "HAS_MANY", "DEP", "DESTROY", "CLAS", "PARENT", "PUT", "SELF", "SAVE",
            "TRANS", "DO", "VGE", "VGT", "VLE", "VLT", "FALSE", "TRUE", "IF", "ELSE",
            "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "PLUS", "MINUS",
            "MUL", "DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL",
            "GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN",
            "DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR",
            "BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "DOT", "LEFT_RBRACKET",
            "RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT",
            "ML_COMMENT", "WS", "INT", "FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
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
        return "XPR.g4";
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

    public XPRParser(TokenStream input) {
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitProg(this);
        }
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(191);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CLAS) {
                    {
                        {
                            setState(182);
                            class_definition();
                            setState(186);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == SEMICOLON || _la == CRLF) {
                                {
                                    {
                                        setState(183);
                                        terminator(0);
                                    }
                                }
                                setState(188);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }
                    setState(193);
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

        public Class_bodyContext class_body() {
            return getRuleContext(Class_bodyContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(XPRParser.END, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterClass_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitClass_definition(this);
        }
    }

    public final Class_definitionContext class_definition() throws RecognitionException {
        Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_class_definition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
                class_declaration();
                setState(195);
                class_body();
                setState(196);
                match(END);
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
        public TerminalNode CLAS() {
            return getToken(XPRParser.CLAS, 0);
        }

        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public TerminalNode LESS() {
            return getToken(XPRParser.LESS, 0);
        }

        public TerminalNode PARENT() {
            return getToken(XPRParser.PARENT, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterClass_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitClass_declaration(this);
        }
    }

    public final Class_declarationContext class_declaration() throws RecognitionException {
        Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_class_declaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(198);
                match(CLAS);
                setState(199);
                class_name();
                setState(200);
                match(LESS);
                setState(201);
                match(PARENT);
                setState(203);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(202);
                            crlf();
                        }
                    }
                    setState(205);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == CRLF);
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
            return getToken(XPRParser.ID, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterClass_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitClass_name(this);
        }
    }

    public final Class_nameContext class_name() throws RecognitionException {
        Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_class_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(207);
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

    public static class Class_bodyContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterClass_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitClass_body(this);
        }
    }

    public final Class_bodyContext class_body() throws RecognitionException {
        Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_class_body);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << REQUIRE) | (1L << DEF) | (1L << RETURN) | (1L << PIR) | (1L << VPRE) | (1L << VNUM) | (1L << BELONG) | (1L << HAS_MANY) | (1L << PUT) | (1L << SELF) | (1L << FALSE) | (1L << TRUE) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << FOR) | (1L << BIT_NOT))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (NOT - 68)) | (1L << (LEFT_RBRACKET - 68)) | (1L << (NIL - 68)) | (1L << (INT - 68)) | (1L << (FLOAT - 68)) | (1L << (ID - 68)) | (1L << (ID_GLOBAL - 68)) | (1L << (ID_FUNCTION - 68)))) != 0)) {
                    {
                        {
                            setState(209);
                            expression();
                            setState(211);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(210);
                                        terminator(0);
                                    }
                                }
                                setState(213);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            } while (_la == SEMICOLON || _la == CRLF);
                        }
                    }
                    setState(219);
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
        public Function_definitionContext function_definition() {
            return getRuleContext(Function_definitionContext.class, 0);
        }

        public Function_inline_callContext function_inline_call() {
            return getRuleContext(Function_inline_callContext.class, 0);
        }

        public Require_blockContext require_block() {
            return getRuleContext(Require_blockContext.class, 0);
        }

        public If_statementContext if_statement() {
            return getRuleContext(If_statementContext.class, 0);
        }

        public Unless_statementContext unless_statement() {
            return getRuleContext(Unless_statementContext.class, 0);
        }

        public RvalueContext rvalue() {
            return getRuleContext(RvalueContext.class, 0);
        }

        public Return_statementContext return_statement() {
            return getRuleContext(Return_statementContext.class, 0);
        }

        public While_statementContext while_statement() {
            return getRuleContext(While_statementContext.class, 0);
        }

        public For_statementContext for_statement() {
            return getRuleContext(For_statementContext.class, 0);
        }

        public Pir_inlineContext pir_inline() {
            return getRuleContext(Pir_inlineContext.class, 0);
        }

        public Validate_presenceContext validate_presence() {
            return getRuleContext(Validate_presenceContext.class, 0);
        }

        public Validate_numContext validate_num() {
            return getRuleContext(Validate_numContext.class, 0);
        }

        public Belong_statementContext belong_statement() {
            return getRuleContext(Belong_statementContext.class, 0);
        }

        public Has_many_statementContext has_many_statement() {
            return getRuleContext(Has_many_statementContext.class, 0);
        }

        public Put_statementContext put_statement() {
            return getRuleContext(Put_statementContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitExpression(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_expression);
        try {
            setState(237);
            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(220);
                    function_definition();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(221);
                    function_inline_call();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(222);
                    require_block();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(223);
                    if_statement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(224);
                    unless_statement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(225);
                    rvalue(0);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(226);
                    return_statement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(227);
                    while_statement();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(228);
                    for_statement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(229);
                    pir_inline();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(230);
                    validate_presence();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(231);
                    validate_num();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(232);
                    belong_statement();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(233);
                    has_many_statement();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(234);
                    put_statement();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(235);
                    assignment();
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(236);
                    return_statement();
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

    public static class Put_statementContext extends ParserRuleContext {
        public TerminalNode PUT() {
            return getToken(XPRParser.PUT, 0);
        }

        public String_resultContext string_result() {
            return getRuleContext(String_resultContext.class, 0);
        }

        public Put_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_put_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterPut_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitPut_statement(this);
        }
    }

    public final Put_statementContext put_statement() throws RecognitionException {
        Put_statementContext _localctx = new Put_statementContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_put_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                match(PUT);
                setState(240);
                string_result(0);
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

    public static class Global_getContext extends ParserRuleContext {
        public LvalueContext var_name;
        public Token op;
        public Id_globalContext global_name;

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(XPRParser.ASSIGN, 0);
        }

        public Id_globalContext id_global() {
            return getRuleContext(Id_globalContext.class, 0);
        }

        public Global_getContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_global_get;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterGlobal_get(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitGlobal_get(this);
        }
    }

    public final Global_getContext global_get() throws RecognitionException {
        Global_getContext _localctx = new Global_getContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_global_get);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(242);
                ((Global_getContext) _localctx).var_name = lvalue();
                setState(243);
                ((Global_getContext) _localctx).op = match(ASSIGN);
                setState(244);
                ((Global_getContext) _localctx).global_name = id_global();
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

    public static class Global_setContext extends ParserRuleContext {
        public Id_globalContext global_name;
        public Token op;
        public All_resultContext result;

        public Id_globalContext id_global() {
            return getRuleContext(Id_globalContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(XPRParser.ASSIGN, 0);
        }

        public All_resultContext all_result() {
            return getRuleContext(All_resultContext.class, 0);
        }

        public Global_setContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_global_set;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterGlobal_set(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitGlobal_set(this);
        }
    }

    public final Global_setContext global_set() throws RecognitionException {
        Global_setContext _localctx = new Global_setContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_global_set);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(246);
                ((Global_setContext) _localctx).global_name = id_global();
                setState(247);
                ((Global_setContext) _localctx).op = match(ASSIGN);
                setState(248);
                ((Global_setContext) _localctx).result = all_result();
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

    public static class Global_resultContext extends ParserRuleContext {
        public Id_globalContext id_global() {
            return getRuleContext(Id_globalContext.class, 0);
        }

        public Global_resultContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_global_result;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterGlobal_result(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitGlobal_result(this);
        }
    }

    public final Global_resultContext global_result() throws RecognitionException {
        Global_resultContext _localctx = new Global_resultContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_global_result);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(250);
                id_global();
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

    public static class Function_inline_callContext extends ParserRuleContext {
        public Function_callContext function_call() {
            return getRuleContext(Function_callContext.class, 0);
        }

        public Function_inline_callContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_inline_call;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_inline_call(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_inline_call(this);
        }
    }

    public final Function_inline_callContext function_inline_call() throws RecognitionException {
        Function_inline_callContext _localctx = new Function_inline_callContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_function_inline_call);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(252);
                function_call();
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

    public static class Require_blockContext extends ParserRuleContext {
        public TerminalNode REQUIRE() {
            return getToken(XPRParser.REQUIRE, 0);
        }

        public Literal_tContext literal_t() {
            return getRuleContext(Literal_tContext.class, 0);
        }

        public Require_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_require_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterRequire_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitRequire_block(this);
        }
    }

    public final Require_blockContext require_block() throws RecognitionException {
        Require_blockContext _localctx = new Require_blockContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_require_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                match(REQUIRE);
                setState(255);
                literal_t();
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

    public static class Pir_inlineContext extends ParserRuleContext {
        public TerminalNode PIR() {
            return getToken(XPRParser.PIR, 0);
        }

        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public Pir_expression_listContext pir_expression_list() {
            return getRuleContext(Pir_expression_listContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(XPRParser.END, 0);
        }

        public Pir_inlineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pir_inline;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterPir_inline(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitPir_inline(this);
        }
    }

    public final Pir_inlineContext pir_inline() throws RecognitionException {
        Pir_inlineContext _localctx = new Pir_inlineContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_pir_inline);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(257);
                match(PIR);
                setState(258);
                crlf();
                setState(259);
                pir_expression_list();
                setState(260);
                match(END);
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

    public static class Pir_expression_listContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Pir_expression_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pir_expression_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterPir_expression_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitPir_expression_list(this);
        }
    }

    public final Pir_expression_listContext pir_expression_list() throws RecognitionException {
        Pir_expression_listContext _localctx = new Pir_expression_listContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_pir_expression_list);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(262);
                expression();
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

    public static class Function_definitionContext extends ParserRuleContext {
        public Function_definition_headerContext function_definition_header() {
            return getRuleContext(Function_definition_headerContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(XPRParser.END, 0);
        }

        public List<Function_definition_bodyContext> function_definition_body() {
            return getRuleContexts(Function_definition_bodyContext.class);
        }

        public Function_definition_bodyContext function_definition_body(int i) {
            return getRuleContext(Function_definition_bodyContext.class, i);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public Function_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_definition(this);
        }
    }

    public final Function_definitionContext function_definition() throws RecognitionException {
        Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_function_definition);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(264);
                function_definition_header();
                setState(268);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(265);
                                function_definition_body();
                            }
                        }
                    }
                    setState(270);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                }
                setState(274);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CRLF) {
                    {
                        {
                            setState(271);
                            crlf();
                        }
                    }
                    setState(276);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(277);
                match(END);
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

    public static class Function_definition_bodyContext extends ParserRuleContext {
        public Put_statementContext put_statement() {
            return getRuleContext(Put_statementContext.class, 0);
        }

        public New_statementContext new_statement() {
            return getRuleContext(New_statementContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public Remove_statementContext remove_statement() {
            return getRuleContext(Remove_statementContext.class, 0);
        }

        public Return_statementContext return_statement() {
            return getRuleContext(Return_statementContext.class, 0);
        }

        public Trans_statementContext trans_statement() {
            return getRuleContext(Trans_statementContext.class, 0);
        }

        public Function_inline_callContext function_inline_call() {
            return getRuleContext(Function_inline_callContext.class, 0);
        }

        public Save_statementContext save_statement() {
            return getRuleContext(Save_statementContext.class, 0);
        }

        public If_statementContext if_statement() {
            return getRuleContext(If_statementContext.class, 0);
        }

        public Cond_expressionContext cond_expression() {
            return getRuleContext(Cond_expressionContext.class, 0);
        }

        public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_definition_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_definition_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_definition_body(this);
        }
    }

    public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
        Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_function_definition_body);
        try {
            setState(290);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(279);
                    put_statement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(280);
                    new_statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(281);
                    assignment();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(282);
                    crlf();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(283);
                    remove_statement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(284);
                    return_statement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(285);
                    trans_statement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(286);
                    function_inline_call();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(287);
                    save_statement();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(288);
                    if_statement();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(289);
                    cond_expression();
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

    public static class Trans_statementContext extends ParserRuleContext {
        public TerminalNode TRANS() {
            return getToken(XPRParser.TRANS, 0);
        }

        public TerminalNode DO() {
            return getToken(XPRParser.DO, 0);
        }

        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(XPRParser.END, 0);
        }

        public List<Function_definition_bodyContext> function_definition_body() {
            return getRuleContexts(Function_definition_bodyContext.class);
        }

        public Function_definition_bodyContext function_definition_body(int i) {
            return getRuleContext(Function_definition_bodyContext.class, i);
        }

        public Trans_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_trans_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterTrans_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitTrans_statement(this);
        }
    }

    public final Trans_statementContext trans_statement() throws RecognitionException {
        Trans_statementContext _localctx = new Trans_statementContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_trans_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(292);
                match(TRANS);
                setState(293);
                match(DO);
                setState(294);
                crlf();
                setState(298);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << CRLF) | (1L << RETURN) | (1L << NEW) | (1L << DEL) | (1L << PUT) | (1L << SELF) | (1L << SAVE) | (1L << TRANS) | (1L << FALSE) | (1L << TRUE) | (1L << IF))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (LEFT_RBRACKET - 70)) | (1L << (NIL - 70)) | (1L << (INT - 70)) | (1L << (FLOAT - 70)) | (1L << (ID - 70)) | (1L << (ID_GLOBAL - 70)) | (1L << (ID_FUNCTION - 70)))) != 0)) {
                    {
                        {
                            setState(295);
                            function_definition_body();
                        }
                    }
                    setState(300);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(301);
                match(END);
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

    public static class Function_definition_headerContext extends ParserRuleContext {
        public TerminalNode DEF() {
            return getToken(XPRParser.DEF, 0);
        }

        public Function_nameContext function_name() {
            return getRuleContext(Function_nameContext.class, 0);
        }

        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public Function_definition_paramsContext function_definition_params() {
            return getRuleContext(Function_definition_paramsContext.class, 0);
        }

        public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_definition_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_definition_header(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_definition_header(this);
        }
    }

    public final Function_definition_headerContext function_definition_header() throws RecognitionException {
        Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_function_definition_header);
        try {
            setState(312);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(303);
                    match(DEF);
                    setState(304);
                    function_name();
                    setState(305);
                    crlf();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(307);
                    match(DEF);
                    setState(308);
                    function_name();
                    setState(309);
                    function_definition_params();
                    setState(310);
                    crlf();
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

    public static class Function_nameContext extends ParserRuleContext {
        public Id_functionContext id_function() {
            return getRuleContext(Id_functionContext.class, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Function_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_name(this);
        }
    }

    public final Function_nameContext function_name() throws RecognitionException {
        Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_function_name);
        try {
            setState(316);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(314);
                    id_function();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(315);
                    id();
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

    public static class Function_definition_paramsContext extends ParserRuleContext {
        public TerminalNode LEFT_RBRACKET() {
            return getToken(XPRParser.LEFT_RBRACKET, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(XPRParser.RIGHT_RBRACKET, 0);
        }

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(XPRParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(XPRParser.COMMA, i);
        }

        public List<Function_definition_param_idContext> function_definition_param_id() {
            return getRuleContexts(Function_definition_param_idContext.class);
        }

        public Function_definition_param_idContext function_definition_param_id(int i) {
            return getRuleContext(Function_definition_param_idContext.class, i);
        }

        public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_definition_params;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_definition_params(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_definition_params(this);
        }
    }

    public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
        Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_function_definition_params);
        int _la;
        try {
            setState(331);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(318);
                    match(LEFT_RBRACKET);
                    setState(319);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(320);
                    match(LEFT_RBRACKET);
                    setState(321);
                    id();
                    setState(326);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(322);
                                match(COMMA);
                                setState(323);
                                function_definition_param_id();
                            }
                        }
                        setState(328);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
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

    public static class Function_definition_params_listContext extends ParserRuleContext {
        public Function_definition_param_idContext function_definition_param_id() {
            return getRuleContext(Function_definition_param_idContext.class, 0);
        }

        public Function_definition_params_listContext function_definition_params_list() {
            return getRuleContext(Function_definition_params_listContext.class, 0);
        }

        public TerminalNode COMMA() {
            return getToken(XPRParser.COMMA, 0);
        }

        public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_definition_params_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_definition_params_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_definition_params_list(this);
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
        int _startState = 40;
        enterRecursionRule(_localctx, 40, RULE_function_definition_params_list, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(334);
                    function_definition_param_id();
                }
                _ctx.stop = _input.LT(-1);
                setState(341);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new Function_definition_params_listContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
                                setState(336);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(337);
                                match(COMMA);
                                setState(338);
                                function_definition_param_id();
                            }
                        }
                    }
                    setState(343);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
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

    public static class Function_definition_param_idContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Function_definition_param_idContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_definition_param_id;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_definition_param_id(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_definition_param_id(this);
        }
    }

    public final Function_definition_param_idContext function_definition_param_id() throws RecognitionException {
        Function_definition_param_idContext _localctx = new Function_definition_param_idContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_function_definition_param_id);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(344);
                id();
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

    public static class New_statementContext extends ParserRuleContext {
        public TerminalNode NEW() {
            return getToken(XPRParser.NEW, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(XPRParser.LEFT_RBRACKET, 0);
        }

        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(XPRParser.RIGHT_RBRACKET, 0);
        }

        public New_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_new_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterNew_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitNew_statement(this);
        }
    }

    public final New_statementContext new_statement() throws RecognitionException {
        New_statementContext _localctx = new New_statementContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_new_statement);
        try {
            setState(355);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(346);
                    match(NEW);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(347);
                    match(NEW);
                    setState(348);
                    match(LEFT_RBRACKET);
                    setState(349);
                    arguments();
                    setState(350);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(352);
                    match(NEW);
                    setState(353);
                    match(LEFT_RBRACKET);
                    setState(354);
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

    public static class Remove_statementContext extends ParserRuleContext {
        public TerminalNode DEL() {
            return getToken(XPRParser.DEL, 0);
        }

        public Remove_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_remove_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterRemove_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitRemove_statement(this);
        }
    }

    public final Remove_statementContext remove_statement() throws RecognitionException {
        Remove_statementContext _localctx = new Remove_statementContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_remove_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(357);
                match(DEL);
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

    public static class ArgumentsContext extends ParserRuleContext {
        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(XPRParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(XPRParser.COMMA, i);
        }

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public ArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arguments;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterArguments(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitArguments(this);
        }
    }

    public final ArgumentsContext arguments() throws RecognitionException {
        ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_arguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(363);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(359);
                            match(COMMA);
                            setState(360);
                            id();
                        }
                    }
                    setState(365);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(366);
                lvalue();
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

    public static class Validate_presenceContext extends ParserRuleContext {
        public TerminalNode VPRE() {
            return getToken(XPRParser.VPRE, 0);
        }

        public List<TerminalNode> ID_GLOBAL() {
            return getTokens(XPRParser.ID_GLOBAL);
        }

        public TerminalNode ID_GLOBAL(int i) {
            return getToken(XPRParser.ID_GLOBAL, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(XPRParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(XPRParser.COMMA, i);
        }

        public Validate_presenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_validate_presence;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterValidate_presence(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitValidate_presence(this);
        }
    }

    public final Validate_presenceContext validate_presence() throws RecognitionException {
        Validate_presenceContext _localctx = new Validate_presenceContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_validate_presence);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(368);
                match(VPRE);
                setState(369);
                match(ID_GLOBAL);
                setState(374);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(370);
                                match(COMMA);
                                setState(371);
                                match(ID_GLOBAL);
                            }
                        }
                    }
                    setState(376);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
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

    public static class Validate_numContext extends ParserRuleContext {
        public TerminalNode VNUM() {
            return getToken(XPRParser.VNUM, 0);
        }

        public TerminalNode ID_GLOBAL() {
            return getToken(XPRParser.ID_GLOBAL, 0);
        }

        public TerminalNode COMMA() {
            return getToken(XPRParser.COMMA, 0);
        }

        public Cond_numContext cond_num() {
            return getRuleContext(Cond_numContext.class, 0);
        }

        public All_resultContext all_result() {
            return getRuleContext(All_resultContext.class, 0);
        }

        public Validate_numContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_validate_num;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterValidate_num(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitValidate_num(this);
        }
    }

    public final Validate_numContext validate_num() throws RecognitionException {
        Validate_numContext _localctx = new Validate_numContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_validate_num);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(377);
                match(VNUM);
                setState(378);
                match(ID_GLOBAL);
                setState(379);
                match(COMMA);
                setState(380);
                cond_num();
                setState(381);
                all_result();
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

    public static class Cond_numContext extends ParserRuleContext {
        public TerminalNode VGE() {
            return getToken(XPRParser.VGE, 0);
        }

        public TerminalNode VGT() {
            return getToken(XPRParser.VGT, 0);
        }

        public TerminalNode VLE() {
            return getToken(XPRParser.VLE, 0);
        }

        public TerminalNode VLT() {
            return getToken(XPRParser.VLT, 0);
        }

        public Cond_numContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_cond_num;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterCond_num(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitCond_num(this);
        }
    }

    public final Cond_numContext cond_num() throws RecognitionException {
        Cond_numContext _localctx = new Cond_numContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_cond_num);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(383);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VGE) | (1L << VGT) | (1L << VLE) | (1L << VLT))) != 0))) {
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

    public static class Belong_statementContext extends ParserRuleContext {
        public TerminalNode BELONG() {
            return getToken(XPRParser.BELONG, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public Belong_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_belong_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterBelong_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitBelong_statement(this);
        }
    }

    public final Belong_statementContext belong_statement() throws RecognitionException {
        Belong_statementContext _localctx = new Belong_statementContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_belong_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(385);
                match(BELONG);
                setState(386);
                lvalue();
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

    public static class Has_many_statementContext extends ParserRuleContext {
        public TerminalNode HAS_MANY() {
            return getToken(XPRParser.HAS_MANY, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public Del_exprContext del_expr() {
            return getRuleContext(Del_exprContext.class, 0);
        }

        public Has_many_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_has_many_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterHas_many_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitHas_many_statement(this);
        }
    }

    public final Has_many_statementContext has_many_statement() throws RecognitionException {
        Has_many_statementContext _localctx = new Has_many_statementContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_has_many_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(388);
                match(HAS_MANY);
                setState(389);
                lvalue();
                setState(391);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                    case 1: {
                        setState(390);
                        del_expr();
                    }
                    break;
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

    public static class Del_exprContext extends ParserRuleContext {
        public TerminalNode COMMA() {
            return getToken(XPRParser.COMMA, 0);
        }

        public TerminalNode DEP() {
            return getToken(XPRParser.DEP, 0);
        }

        public TerminalNode DESTROY() {
            return getToken(XPRParser.DESTROY, 0);
        }

        public Del_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_del_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterDel_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitDel_expr(this);
        }
    }

    public final Del_exprContext del_expr() throws RecognitionException {
        Del_exprContext _localctx = new Del_exprContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_del_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(393);
                match(COMMA);
                setState(394);
                match(DEP);
                setState(395);
                match(DESTROY);
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

    public static class Return_statementContext extends ParserRuleContext {
        public TerminalNode RETURN() {
            return getToken(XPRParser.RETURN, 0);
        }

        public All_resultContext all_result() {
            return getRuleContext(All_resultContext.class, 0);
        }

        public Return_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_return_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterReturn_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitReturn_statement(this);
        }
    }

    public final Return_statementContext return_statement() throws RecognitionException {
        Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_return_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(397);
                match(RETURN);
                setState(398);
                all_result();
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

    public static class Save_statementContext extends ParserRuleContext {
        public TerminalNode SAVE() {
            return getToken(XPRParser.SAVE, 0);
        }

        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(XPRParser.DOT, 0);
        }

        public Save_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_save_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterSave_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitSave_statement(this);
        }
    }

    public final Save_statementContext save_statement() throws RecognitionException {
        Save_statementContext _localctx = new Save_statementContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_save_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(403);
                _la = _input.LA(1);
                if (_la == ID) {
                    {
                        setState(400);
                        class_name();
                        setState(401);
                        match(DOT);
                    }
                }

                setState(405);
                match(SAVE);
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

    public static class Function_callContext extends ParserRuleContext {
        public Function_nameContext name;
        public Function_call_param_listContext params;

        public TerminalNode LEFT_RBRACKET() {
            return getToken(XPRParser.LEFT_RBRACKET, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(XPRParser.RIGHT_RBRACKET, 0);
        }

        public Function_nameContext function_name() {
            return getRuleContext(Function_nameContext.class, 0);
        }

        public Function_call_param_listContext function_call_param_list() {
            return getRuleContext(Function_call_param_listContext.class, 0);
        }

        public Function_callContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_call;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_call(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_call(this);
        }
    }

    public final Function_callContext function_call() throws RecognitionException {
        Function_callContext _localctx = new Function_callContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_function_call);
        try {
            setState(419);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(407);
                    ((Function_callContext) _localctx).name = function_name();
                    setState(408);
                    match(LEFT_RBRACKET);
                    setState(409);
                    ((Function_callContext) _localctx).params = function_call_param_list();
                    setState(410);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(412);
                    ((Function_callContext) _localctx).name = function_name();
                    setState(413);
                    ((Function_callContext) _localctx).params = function_call_param_list();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(415);
                    ((Function_callContext) _localctx).name = function_name();
                    setState(416);
                    match(LEFT_RBRACKET);
                    setState(417);
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

    public static class Function_call_param_listContext extends ParserRuleContext {
        public Function_call_paramsContext function_call_params() {
            return getRuleContext(Function_call_paramsContext.class, 0);
        }

        public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_call_param_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_call_param_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_call_param_list(this);
        }
    }

    public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
        Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_function_call_param_list);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(421);
                function_call_params();
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

    public static class Function_call_paramsContext extends ParserRuleContext {
        public List<Function_paramContext> function_param() {
            return getRuleContexts(Function_paramContext.class);
        }

        public Function_paramContext function_param(int i) {
            return getRuleContext(Function_paramContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(XPRParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(XPRParser.COMMA, i);
        }

        public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_call_params;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_call_params(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_call_params(this);
        }
    }

    public final Function_call_paramsContext function_call_params() throws RecognitionException {
        Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_function_call_params);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(423);
                function_param();
                setState(428);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(424);
                                match(COMMA);
                                setState(425);
                                function_param();
                            }
                        }
                    }
                    setState(430);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
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

    public static class Function_paramContext extends ParserRuleContext {
        public Function_unnamed_paramContext function_unnamed_param() {
            return getRuleContext(Function_unnamed_paramContext.class, 0);
        }

        public Function_named_paramContext function_named_param() {
            return getRuleContext(Function_named_paramContext.class, 0);
        }

        public Function_paramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_param(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_param(this);
        }
    }

    public final Function_paramContext function_param() throws RecognitionException {
        Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_function_param);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(433);
                switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                    case 1: {
                        setState(431);
                        function_unnamed_param();
                    }
                    break;
                    case 2: {
                        setState(432);
                        function_named_param();
                    }
                    break;
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

    public static class Function_unnamed_paramContext extends ParserRuleContext {
        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Float_resultContext float_result() {
            return getRuleContext(Float_resultContext.class, 0);
        }

        public String_resultContext string_result() {
            return getRuleContext(String_resultContext.class, 0);
        }

        public Dynamic_resultContext dynamic_result() {
            return getRuleContext(Dynamic_resultContext.class, 0);
        }

        public Function_unnamed_paramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_unnamed_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_unnamed_param(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_unnamed_param(this);
        }
    }

    public final Function_unnamed_paramContext function_unnamed_param() throws RecognitionException {
        Function_unnamed_paramContext _localctx = new Function_unnamed_paramContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_function_unnamed_param);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(439);
                switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                    case 1: {
                        setState(435);
                        int_result(0);
                    }
                    break;
                    case 2: {
                        setState(436);
                        float_result(0);
                    }
                    break;
                    case 3: {
                        setState(437);
                        string_result(0);
                    }
                    break;
                    case 4: {
                        setState(438);
                        dynamic_result(0);
                    }
                    break;
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

    public static class Function_named_paramContext extends ParserRuleContext {
        public Token op;

        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(XPRParser.ASSIGN, 0);
        }

        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Float_resultContext float_result() {
            return getRuleContext(Float_resultContext.class, 0);
        }

        public String_resultContext string_result() {
            return getRuleContext(String_resultContext.class, 0);
        }

        public Dynamic_resultContext dynamic_result() {
            return getRuleContext(Dynamic_resultContext.class, 0);
        }

        public Function_named_paramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_named_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_named_param(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_named_param(this);
        }
    }

    public final Function_named_paramContext function_named_param() throws RecognitionException {
        Function_named_paramContext _localctx = new Function_named_paramContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_function_named_param);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(441);
                id();
                setState(442);
                ((Function_named_paramContext) _localctx).op = match(ASSIGN);
                setState(447);
                switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                    case 1: {
                        setState(443);
                        int_result(0);
                    }
                    break;
                    case 2: {
                        setState(444);
                        float_result(0);
                    }
                    break;
                    case 3: {
                        setState(445);
                        string_result(0);
                    }
                    break;
                    case 4: {
                        setState(446);
                        dynamic_result(0);
                    }
                    break;
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

    public static class Function_call_assignmentContext extends ParserRuleContext {
        public Function_callContext function_call() {
            return getRuleContext(Function_callContext.class, 0);
        }

        public Function_call_assignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_call_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFunction_call_assignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFunction_call_assignment(this);
        }
    }

    public final Function_call_assignmentContext function_call_assignment() throws RecognitionException {
        Function_call_assignmentContext _localctx = new Function_call_assignmentContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_function_call_assignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(449);
                function_call();
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

    public static class All_resultContext extends ParserRuleContext {
        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Float_resultContext float_result() {
            return getRuleContext(Float_resultContext.class, 0);
        }

        public Nil_tContext nil_t() {
            return getRuleContext(Nil_tContext.class, 0);
        }

        public String_resultContext string_result() {
            return getRuleContext(String_resultContext.class, 0);
        }

        public Dynamic_resultContext dynamic_result() {
            return getRuleContext(Dynamic_resultContext.class, 0);
        }

        public Global_resultContext global_result() {
            return getRuleContext(Global_resultContext.class, 0);
        }

        public Bool_tContext bool_t() {
            return getRuleContext(Bool_tContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public All_resultContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_all_result;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterAll_result(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitAll_result(this);
        }
    }

    public final All_resultContext all_result() throws RecognitionException {
        All_resultContext _localctx = new All_resultContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_all_result);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(461);
                switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                    case 1: {
                        setState(451);
                        int_result(0);
                    }
                    break;
                    case 2: {
                        setState(452);
                        float_result(0);
                    }
                    break;
                    case 3: {
                        setState(453);
                        nil_t();
                    }
                    break;
                    case 4: {
                        setState(454);
                        string_result(0);
                    }
                    break;
                    case 5: {
                        setState(455);
                        dynamic_result(0);
                    }
                    break;
                    case 6: {
                        setState(456);
                        global_result();
                    }
                    break;
                    case 7: {
                        setState(457);
                        bool_t();
                        setState(459);
                        switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                            case 1: {
                                setState(458);
                                expression();
                            }
                            break;
                        }
                    }
                    break;
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

    public static class Elsif_statementContext extends ParserRuleContext {
        public If_elsif_statementContext if_elsif_statement() {
            return getRuleContext(If_elsif_statementContext.class, 0);
        }

        public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elsif_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterElsif_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitElsif_statement(this);
        }
    }

    public final Elsif_statementContext elsif_statement() throws RecognitionException {
        Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_elsif_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(463);
                if_elsif_statement();
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

    public static class If_elsif_statementContext extends ParserRuleContext {
        public TerminalNode ELSIF() {
            return getToken(XPRParser.ELSIF, 0);
        }

        public Cond_expressionContext cond_expression() {
            return getRuleContext(Cond_expressionContext.class, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public List<Statement_bodyContext> statement_body() {
            return getRuleContexts(Statement_bodyContext.class);
        }

        public Statement_bodyContext statement_body(int i) {
            return getRuleContext(Statement_bodyContext.class, i);
        }

        public Else_tokenContext else_token() {
            return getRuleContext(Else_tokenContext.class, 0);
        }

        public If_elsif_statementContext if_elsif_statement() {
            return getRuleContext(If_elsif_statementContext.class, 0);
        }

        public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_elsif_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterIf_elsif_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitIf_elsif_statement(this);
        }
    }

    public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
        If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_if_elsif_statement);
        try {
            setState(484);
            switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(465);
                    match(ELSIF);
                    setState(466);
                    cond_expression();
                    setState(467);
                    crlf();
                    setState(468);
                    statement_body();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(470);
                    match(ELSIF);
                    setState(471);
                    cond_expression();
                    setState(472);
                    crlf();
                    setState(473);
                    statement_body();
                    setState(474);
                    else_token();
                    setState(475);
                    crlf();
                    setState(476);
                    statement_body();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(478);
                    match(ELSIF);
                    setState(479);
                    cond_expression();
                    setState(480);
                    crlf();
                    setState(481);
                    statement_body();
                    setState(482);
                    if_elsif_statement();
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

    public static class If_statementContext extends ParserRuleContext {
        public TerminalNode IF() {
            return getToken(XPRParser.IF, 0);
        }

        public Cond_expressionContext cond_expression() {
            return getRuleContext(Cond_expressionContext.class, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public List<Statement_bodyContext> statement_body() {
            return getRuleContexts(Statement_bodyContext.class);
        }

        public Statement_bodyContext statement_body(int i) {
            return getRuleContext(Statement_bodyContext.class, i);
        }

        public TerminalNode END() {
            return getToken(XPRParser.END, 0);
        }

        public Else_tokenContext else_token() {
            return getRuleContext(Else_tokenContext.class, 0);
        }

        public Elsif_statementContext elsif_statement() {
            return getRuleContext(Elsif_statementContext.class, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterIf_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitIf_statement(this);
        }
    }

    public final If_statementContext if_statement() throws RecognitionException {
        If_statementContext _localctx = new If_statementContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_if_statement);
        try {
            setState(508);
            switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
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
                    match(END);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(492);
                    match(IF);
                    setState(493);
                    cond_expression();
                    setState(494);
                    crlf();
                    setState(495);
                    statement_body();
                    setState(496);
                    else_token();
                    setState(497);
                    crlf();
                    setState(498);
                    statement_body();
                    setState(499);
                    match(END);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(501);
                    match(IF);
                    setState(502);
                    cond_expression();
                    setState(503);
                    crlf();
                    setState(504);
                    statement_body();
                    setState(505);
                    elsif_statement();
                    setState(506);
                    match(END);
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

    public static class Unless_statementContext extends ParserRuleContext {
        public TerminalNode UNLESS() {
            return getToken(XPRParser.UNLESS, 0);
        }

        public Cond_expressionContext cond_expression() {
            return getRuleContext(Cond_expressionContext.class, 0);
        }

        public List<CrlfContext> crlf() {
            return getRuleContexts(CrlfContext.class);
        }

        public CrlfContext crlf(int i) {
            return getRuleContext(CrlfContext.class, i);
        }

        public List<Statement_bodyContext> statement_body() {
            return getRuleContexts(Statement_bodyContext.class);
        }

        public Statement_bodyContext statement_body(int i) {
            return getRuleContext(Statement_bodyContext.class, i);
        }

        public TerminalNode END() {
            return getToken(XPRParser.END, 0);
        }

        public Else_tokenContext else_token() {
            return getRuleContext(Else_tokenContext.class, 0);
        }

        public Elsif_statementContext elsif_statement() {
            return getRuleContext(Elsif_statementContext.class, 0);
        }

        public Function_callContext function_call() {
            return getRuleContext(Function_callContext.class, 0);
        }

        public Unless_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unless_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterUnless_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitUnless_statement(this);
        }
    }

    public final Unless_statementContext unless_statement() throws RecognitionException {
        Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_unless_statement);
        try {
            setState(534);
            switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
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
                    match(END);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(516);
                    match(UNLESS);
                    setState(517);
                    cond_expression();
                    setState(518);
                    crlf();
                    setState(519);
                    statement_body();
                    setState(520);
                    else_token();
                    setState(521);
                    crlf();
                    setState(522);
                    statement_body();
                    setState(523);
                    match(END);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(525);
                    match(UNLESS);
                    setState(526);
                    cond_expression();
                    setState(527);
                    crlf();
                    setState(528);
                    statement_body();
                    setState(529);
                    elsif_statement();
                    setState(530);
                    match(END);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(532);
                    match(UNLESS);
                    setState(533);
                    function_call();
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

    public static class While_statementContext extends ParserRuleContext {
        public TerminalNode WHILE() {
            return getToken(XPRParser.WHILE, 0);
        }

        public Cond_expressionContext cond_expression() {
            return getRuleContext(Cond_expressionContext.class, 0);
        }

        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public Statement_bodyContext statement_body() {
            return getRuleContext(Statement_bodyContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(XPRParser.END, 0);
        }

        public While_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_while_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterWhile_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitWhile_statement(this);
        }
    }

    public final While_statementContext while_statement() throws RecognitionException {
        While_statementContext _localctx = new While_statementContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_while_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(536);
                match(WHILE);
                setState(537);
                cond_expression();
                setState(538);
                crlf();
                setState(539);
                statement_body();
                setState(540);
                match(END);
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

    public static class For_statementContext extends ParserRuleContext {
        public TerminalNode FOR() {
            return getToken(XPRParser.FOR, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(XPRParser.LEFT_RBRACKET, 0);
        }

        public Init_expressionContext init_expression() {
            return getRuleContext(Init_expressionContext.class, 0);
        }

        public List<TerminalNode> SEMICOLON() {
            return getTokens(XPRParser.SEMICOLON);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(XPRParser.SEMICOLON, i);
        }

        public Cond_expressionContext cond_expression() {
            return getRuleContext(Cond_expressionContext.class, 0);
        }

        public Loop_expressionContext loop_expression() {
            return getRuleContext(Loop_expressionContext.class, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(XPRParser.RIGHT_RBRACKET, 0);
        }

        public CrlfContext crlf() {
            return getRuleContext(CrlfContext.class, 0);
        }

        public Statement_bodyContext statement_body() {
            return getRuleContext(Statement_bodyContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(XPRParser.END, 0);
        }

        public For_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFor_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFor_statement(this);
        }
    }

    public final For_statementContext for_statement() throws RecognitionException {
        For_statementContext _localctx = new For_statementContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_for_statement);
        try {
            setState(564);
            switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(542);
                    match(FOR);
                    setState(543);
                    match(LEFT_RBRACKET);
                    setState(544);
                    init_expression();
                    setState(545);
                    match(SEMICOLON);
                    setState(546);
                    cond_expression();
                    setState(547);
                    match(SEMICOLON);
                    setState(548);
                    loop_expression();
                    setState(549);
                    match(RIGHT_RBRACKET);
                    setState(550);
                    crlf();
                    setState(551);
                    statement_body();
                    setState(552);
                    match(END);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(554);
                    match(FOR);
                    setState(555);
                    init_expression();
                    setState(556);
                    match(SEMICOLON);
                    setState(557);
                    cond_expression();
                    setState(558);
                    match(SEMICOLON);
                    setState(559);
                    loop_expression();
                    setState(560);
                    crlf();
                    setState(561);
                    statement_body();
                    setState(562);
                    match(END);
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

    public static class Init_expressionContext extends ParserRuleContext {
        public For_init_listContext for_init_list() {
            return getRuleContext(For_init_listContext.class, 0);
        }

        public Init_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_init_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterInit_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitInit_expression(this);
        }
    }

    public final Init_expressionContext init_expression() throws RecognitionException {
        Init_expressionContext _localctx = new Init_expressionContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_init_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(566);
                for_init_list(0);
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

    public static class All_assignmentContext extends ParserRuleContext {
        public Int_assignmentContext int_assignment() {
            return getRuleContext(Int_assignmentContext.class, 0);
        }

        public Float_assignmentContext float_assignment() {
            return getRuleContext(Float_assignmentContext.class, 0);
        }

        public String_assignmentContext string_assignment() {
            return getRuleContext(String_assignmentContext.class, 0);
        }

        public Dynamic_assignmentContext dynamic_assignment() {
            return getRuleContext(Dynamic_assignmentContext.class, 0);
        }

        public All_assignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_all_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterAll_assignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitAll_assignment(this);
        }
    }

    public final All_assignmentContext all_assignment() throws RecognitionException {
        All_assignmentContext _localctx = new All_assignmentContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_all_assignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(572);
                switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                    case 1: {
                        setState(568);
                        int_assignment();
                    }
                    break;
                    case 2: {
                        setState(569);
                        float_assignment();
                    }
                    break;
                    case 3: {
                        setState(570);
                        string_assignment();
                    }
                    break;
                    case 4: {
                        setState(571);
                        dynamic_assignment();
                    }
                    break;
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

    public static class For_init_listContext extends ParserRuleContext {
        public All_assignmentContext all_assignment() {
            return getRuleContext(All_assignmentContext.class, 0);
        }

        public For_init_listContext for_init_list() {
            return getRuleContext(For_init_listContext.class, 0);
        }

        public TerminalNode COMMA() {
            return getToken(XPRParser.COMMA, 0);
        }

        public For_init_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_init_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFor_init_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFor_init_list(this);
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
        int _startState = 98;
        enterRecursionRule(_localctx, 98, RULE_for_init_list, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(575);
                    all_assignment();
                }
                _ctx.stop = _input.LT(-1);
                setState(582);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new For_init_listContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_for_init_list);
                                setState(577);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(578);
                                match(COMMA);
                                setState(579);
                                all_assignment();
                            }
                        }
                    }
                    setState(584);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
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

    public static class Cond_expressionContext extends ParserRuleContext {
        public Comparison_listContext comparison_list() {
            return getRuleContext(Comparison_listContext.class, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterCond_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitCond_expression(this);
        }
    }

    public final Cond_expressionContext cond_expression() throws RecognitionException {
        Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_cond_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(585);
                comparison_list();
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

    public static class Loop_expressionContext extends ParserRuleContext {
        public For_loop_listContext for_loop_list() {
            return getRuleContext(For_loop_listContext.class, 0);
        }

        public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loop_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterLoop_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitLoop_expression(this);
        }
    }

    public final Loop_expressionContext loop_expression() throws RecognitionException {
        Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_loop_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(587);
                for_loop_list(0);
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

    public static class For_loop_listContext extends ParserRuleContext {
        public All_assignmentContext all_assignment() {
            return getRuleContext(All_assignmentContext.class, 0);
        }

        public For_loop_listContext for_loop_list() {
            return getRuleContext(For_loop_listContext.class, 0);
        }

        public TerminalNode COMMA() {
            return getToken(XPRParser.COMMA, 0);
        }

        public For_loop_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_loop_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFor_loop_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFor_loop_list(this);
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
        int _startState = 104;
        enterRecursionRule(_localctx, 104, RULE_for_loop_list, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(590);
                    all_assignment();
                }
                _ctx.stop = _input.LT(-1);
                setState(597);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 33, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new For_loop_listContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_for_loop_list);
                                setState(592);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(593);
                                match(COMMA);
                                setState(594);
                                all_assignment();
                            }
                        }
                    }
                    setState(599);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 33, _ctx);
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

    public static class Statement_bodyContext extends ParserRuleContext {
        public Statement_expression_listContext statement_expression_list() {
            return getRuleContext(Statement_expression_listContext.class, 0);
        }

        public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterStatement_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitStatement_body(this);
        }
    }

    public final Statement_bodyContext statement_body() throws RecognitionException {
        Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_statement_body);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(600);
                statement_expression_list(0);
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

    public static class Statement_expression_listContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminatorContext> terminator() {
            return getRuleContexts(TerminatorContext.class);
        }

        public TerminatorContext terminator(int i) {
            return getRuleContext(TerminatorContext.class, i);
        }

        public TerminalNode RETRY() {
            return getToken(XPRParser.RETRY, 0);
        }

        public Break_expressionContext break_expression() {
            return getRuleContext(Break_expressionContext.class, 0);
        }

        public Statement_expression_listContext statement_expression_list() {
            return getRuleContext(Statement_expression_listContext.class, 0);
        }

        public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement_expression_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterStatement_expression_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitStatement_expression_list(this);
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
        int _startState = 108;
        enterRecursionRule(_localctx, 108, RULE_statement_expression_list, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(616);
                switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                    case 1: {
                        setState(608);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 34, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(603);
                                        expression();
                                        setState(604);
                                        terminator(0);
                                    }
                                }
                            }
                            setState(610);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 34, _ctx);
                        }
                    }
                    break;
                    case 2: {
                        setState(611);
                        match(RETRY);
                        setState(612);
                        terminator(0);
                    }
                    break;
                    case 3: {
                        setState(613);
                        break_expression();
                        setState(614);
                        terminator(0);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(631);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 37, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(629);
                            switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                                case 1: {
                                    _localctx = new Statement_expression_listContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
                                    setState(618);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(619);
                                    expression();
                                    setState(620);
                                    terminator(0);
                                }
                                break;
                                case 2: {
                                    _localctx = new Statement_expression_listContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
                                    setState(622);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(623);
                                    match(RETRY);
                                    setState(624);
                                    terminator(0);
                                }
                                break;
                                case 3: {
                                    _localctx = new Statement_expression_listContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
                                    setState(625);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(626);
                                    break_expression();
                                    setState(627);
                                    terminator(0);
                                }
                                break;
                            }
                        }
                    }
                    setState(633);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 37, _ctx);
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

    public static class AssignmentContext extends ParserRuleContext {
        public LvalueContext var_id;
        public Token op;

        public Primary_exprContext primary_expr() {
            return getRuleContext(Primary_exprContext.class, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public List<TerminalNode> ASSIGN() {
            return getTokens(XPRParser.ASSIGN);
        }

        public TerminalNode ASSIGN(int i) {
            return getToken(XPRParser.ASSIGN, i);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitAssignment(this);
        }
    }

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_assignment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(634);
                ((AssignmentContext) _localctx).var_id = lvalue();
                setState(638);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ASSIGN) {
                    {
                        {
                            setState(635);
                            ((AssignmentContext) _localctx).op = match(ASSIGN);
                        }
                    }
                    setState(640);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(641);
                primary_expr();
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
        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Int_plusContext int_plus() {
            return getRuleContext(Int_plusContext.class, 0);
        }

        public Int_minusContext int_minus() {
            return getRuleContext(Int_minusContext.class, 0);
        }

        public New_statementContext new_statement() {
            return getRuleContext(New_statementContext.class, 0);
        }

        public Function_callContext function_call() {
            return getRuleContext(Function_callContext.class, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterPrimary_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitPrimary_expr(this);
        }
    }

    public final Primary_exprContext primary_expr() throws RecognitionException {
        Primary_exprContext _localctx = new Primary_exprContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_primary_expr);
        try {
            setState(649);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(643);
                    int_result(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(644);
                    int_plus();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(645);
                    int_minus();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(646);
                    new_statement();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(647);
                    function_call();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(648);
                    lvalue();
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

    public static class Dynamic_assignmentContext extends ParserRuleContext {
        public LvalueContext var_id;
        public Token op;

        public Dynamic_resultContext dynamic_result() {
            return getRuleContext(Dynamic_resultContext.class, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(XPRParser.ASSIGN, 0);
        }

        public TerminalNode PLUS_ASSIGN() {
            return getToken(XPRParser.PLUS_ASSIGN, 0);
        }

        public TerminalNode MINUS_ASSIGN() {
            return getToken(XPRParser.MINUS_ASSIGN, 0);
        }

        public TerminalNode MUL_ASSIGN() {
            return getToken(XPRParser.MUL_ASSIGN, 0);
        }

        public TerminalNode DIV_ASSIGN() {
            return getToken(XPRParser.DIV_ASSIGN, 0);
        }

        public TerminalNode MOD_ASSIGN() {
            return getToken(XPRParser.MOD_ASSIGN, 0);
        }

        public TerminalNode EXP_ASSIGN() {
            return getToken(XPRParser.EXP_ASSIGN, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterDynamic_assignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitDynamic_assignment(this);
        }
    }

    public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
        Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_dynamic_assignment);
        int _la;
        try {
            setState(659);
            switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(651);
                    ((Dynamic_assignmentContext) _localctx).var_id = lvalue();
                    setState(652);
                    ((Dynamic_assignmentContext) _localctx).op = match(ASSIGN);
                    setState(653);
                    dynamic_result(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(655);
                    ((Dynamic_assignmentContext) _localctx).var_id = lvalue();
                    setState(656);
                    ((Dynamic_assignmentContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0))) {
                        ((Dynamic_assignmentContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(657);
                    dynamic_result(0);
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

    public static class Int_assignmentContext extends ParserRuleContext {
        public LvalueContext var_id;
        public Token op;

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(XPRParser.ASSIGN, 0);
        }

        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Dynamic_resultContext dynamic_result() {
            return getRuleContext(Dynamic_resultContext.class, 0);
        }

        public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_int_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterInt_assignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitInt_assignment(this);
        }
    }

    public final Int_assignmentContext int_assignment() throws RecognitionException {
        Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_int_assignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(661);
                ((Int_assignmentContext) _localctx).var_id = lvalue();
                setState(662);
                ((Int_assignmentContext) _localctx).op = match(ASSIGN);
                setState(665);
                switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                    case 1: {
                        setState(663);
                        int_result(0);
                    }
                    break;
                    case 2: {
                        setState(664);
                        dynamic_result(0);
                    }
                    break;
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

    public static class Int_plusContext extends ParserRuleContext {
        public LvalueContext var_id;

        public TerminalNode PLUS() {
            return getToken(XPRParser.PLUS, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Dynamic_resultContext dynamic_result() {
            return getRuleContext(Dynamic_resultContext.class, 0);
        }

        public TerminalNode PLUS_ASSIGN() {
            return getToken(XPRParser.PLUS_ASSIGN, 0);
        }

        public Int_plusContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_int_plus;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterInt_plus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitInt_plus(this);
        }
    }

    public final Int_plusContext int_plus() throws RecognitionException {
        Int_plusContext _localctx = new Int_plusContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_int_plus);
        try {
            setState(678);
            switch (_input.LA(1)) {
                case ID:
                case ID_GLOBAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(667);
                    ((Int_plusContext) _localctx).var_id = lvalue();
                    setState(668);
                    match(PLUS);
                    setState(671);
                    switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                        case 1: {
                            setState(669);
                            int_result(0);
                        }
                        break;
                        case 2: {
                            setState(670);
                            dynamic_result(0);
                        }
                        break;
                    }
                }
                break;
                case PLUS_ASSIGN:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(673);
                    match(PLUS_ASSIGN);
                    setState(676);
                    switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                        case 1: {
                            setState(674);
                            int_result(0);
                        }
                        break;
                        case 2: {
                            setState(675);
                            dynamic_result(0);
                        }
                        break;
                    }
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

    public static class Int_minusContext extends ParserRuleContext {
        public LvalueContext var_id;

        public TerminalNode MINUS() {
            return getToken(XPRParser.MINUS, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Dynamic_resultContext dynamic_result() {
            return getRuleContext(Dynamic_resultContext.class, 0);
        }

        public TerminalNode MINUS_ASSIGN() {
            return getToken(XPRParser.MINUS_ASSIGN, 0);
        }

        public Int_minusContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_int_minus;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterInt_minus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitInt_minus(this);
        }
    }

    public final Int_minusContext int_minus() throws RecognitionException {
        Int_minusContext _localctx = new Int_minusContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_int_minus);
        try {
            setState(691);
            switch (_input.LA(1)) {
                case ID:
                case ID_GLOBAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(680);
                    ((Int_minusContext) _localctx).var_id = lvalue();
                    setState(681);
                    match(MINUS);
                    setState(684);
                    switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
                        case 1: {
                            setState(682);
                            int_result(0);
                        }
                        break;
                        case 2: {
                            setState(683);
                            dynamic_result(0);
                        }
                        break;
                    }
                }
                break;
                case MINUS_ASSIGN:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(686);
                    match(MINUS_ASSIGN);
                    setState(689);
                    switch (getInterpreter().adaptivePredict(_input, 46, _ctx)) {
                        case 1: {
                            setState(687);
                            int_result(0);
                        }
                        break;
                        case 2: {
                            setState(688);
                            dynamic_result(0);
                        }
                        break;
                    }
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

    public static class Float_assignmentContext extends ParserRuleContext {
        public LvalueContext var_id;
        public Token op;

        public Float_resultContext float_result() {
            return getRuleContext(Float_resultContext.class, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(XPRParser.ASSIGN, 0);
        }

        public TerminalNode PLUS_ASSIGN() {
            return getToken(XPRParser.PLUS_ASSIGN, 0);
        }

        public TerminalNode MINUS_ASSIGN() {
            return getToken(XPRParser.MINUS_ASSIGN, 0);
        }

        public TerminalNode MUL_ASSIGN() {
            return getToken(XPRParser.MUL_ASSIGN, 0);
        }

        public TerminalNode DIV_ASSIGN() {
            return getToken(XPRParser.DIV_ASSIGN, 0);
        }

        public TerminalNode MOD_ASSIGN() {
            return getToken(XPRParser.MOD_ASSIGN, 0);
        }

        public TerminalNode EXP_ASSIGN() {
            return getToken(XPRParser.EXP_ASSIGN, 0);
        }

        public Float_assignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_float_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFloat_assignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFloat_assignment(this);
        }
    }

    public final Float_assignmentContext float_assignment() throws RecognitionException {
        Float_assignmentContext _localctx = new Float_assignmentContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_float_assignment);
        int _la;
        try {
            setState(701);
            switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(693);
                    ((Float_assignmentContext) _localctx).var_id = lvalue();
                    setState(694);
                    ((Float_assignmentContext) _localctx).op = match(ASSIGN);
                    setState(695);
                    float_result(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(697);
                    ((Float_assignmentContext) _localctx).var_id = lvalue();
                    setState(698);
                    ((Float_assignmentContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0))) {
                        ((Float_assignmentContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(699);
                    float_result(0);
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

    public static class String_assignmentContext extends ParserRuleContext {
        public LvalueContext var_id;
        public Token op;

        public String_resultContext string_result() {
            return getRuleContext(String_resultContext.class, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(XPRParser.ASSIGN, 0);
        }

        public TerminalNode PLUS_ASSIGN() {
            return getToken(XPRParser.PLUS_ASSIGN, 0);
        }

        public String_assignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_string_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterString_assignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitString_assignment(this);
        }
    }

    public final String_assignmentContext string_assignment() throws RecognitionException {
        String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_string_assignment);
        try {
            setState(711);
            switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(703);
                    ((String_assignmentContext) _localctx).var_id = lvalue();
                    setState(704);
                    ((String_assignmentContext) _localctx).op = match(ASSIGN);
                    setState(705);
                    string_result(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(707);
                    ((String_assignmentContext) _localctx).var_id = lvalue();
                    setState(708);
                    ((String_assignmentContext) _localctx).op = match(PLUS_ASSIGN);
                    setState(709);
                    string_result(0);
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

    public static class Initial_array_assignmentContext extends ParserRuleContext {
        public LvalueContext var_id;
        public Token op;

        public TerminalNode LEFT_SBRACKET() {
            return getToken(XPRParser.LEFT_SBRACKET, 0);
        }

        public TerminalNode RIGHT_SBRACKET() {
            return getToken(XPRParser.RIGHT_SBRACKET, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(XPRParser.ASSIGN, 0);
        }

        public Initial_array_assignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_initial_array_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterInitial_array_assignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitInitial_array_assignment(this);
        }
    }

    public final Initial_array_assignmentContext initial_array_assignment() throws RecognitionException {
        Initial_array_assignmentContext _localctx = new Initial_array_assignmentContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_initial_array_assignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(713);
                ((Initial_array_assignmentContext) _localctx).var_id = lvalue();
                setState(714);
                ((Initial_array_assignmentContext) _localctx).op = match(ASSIGN);
                setState(715);
                match(LEFT_SBRACKET);
                setState(716);
                match(RIGHT_SBRACKET);
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

    public static class Array_assignmentContext extends ParserRuleContext {
        public Array_selectorContext arr_def;
        public Token op;
        public All_resultContext arr_val;

        public Array_selectorContext array_selector() {
            return getRuleContext(Array_selectorContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(XPRParser.ASSIGN, 0);
        }

        public All_resultContext all_result() {
            return getRuleContext(All_resultContext.class, 0);
        }

        public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterArray_assignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitArray_assignment(this);
        }
    }

    public final Array_assignmentContext array_assignment() throws RecognitionException {
        Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_array_assignment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(718);
                ((Array_assignmentContext) _localctx).arr_def = array_selector();
                setState(719);
                ((Array_assignmentContext) _localctx).op = match(ASSIGN);
                setState(720);
                ((Array_assignmentContext) _localctx).arr_val = all_result();
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

    public static class Array_definitionContext extends ParserRuleContext {
        public TerminalNode LEFT_SBRACKET() {
            return getToken(XPRParser.LEFT_SBRACKET, 0);
        }

        public Array_definition_elementsContext array_definition_elements() {
            return getRuleContext(Array_definition_elementsContext.class, 0);
        }

        public TerminalNode RIGHT_SBRACKET() {
            return getToken(XPRParser.RIGHT_SBRACKET, 0);
        }

        public Array_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterArray_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitArray_definition(this);
        }
    }

    public final Array_definitionContext array_definition() throws RecognitionException {
        Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_array_definition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(722);
                match(LEFT_SBRACKET);
                setState(723);
                array_definition_elements(0);
                setState(724);
                match(RIGHT_SBRACKET);
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

    public static class Array_definition_elementsContext extends ParserRuleContext {
        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Dynamic_resultContext dynamic_result() {
            return getRuleContext(Dynamic_resultContext.class, 0);
        }

        public Array_definition_elementsContext array_definition_elements() {
            return getRuleContext(Array_definition_elementsContext.class, 0);
        }

        public TerminalNode COMMA() {
            return getToken(XPRParser.COMMA, 0);
        }

        public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_definition_elements;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterArray_definition_elements(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitArray_definition_elements(this);
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
        int _startState = 132;
        enterRecursionRule(_localctx, 132, RULE_array_definition_elements, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(729);
                    switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
                        case 1: {
                            setState(727);
                            int_result(0);
                        }
                        break;
                        case 2: {
                            setState(728);
                            dynamic_result(0);
                        }
                        break;
                    }
                }
                _ctx.stop = _input.LT(-1);
                setState(739);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 52, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new Array_definition_elementsContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
                                setState(731);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(732);
                                match(COMMA);
                                setState(735);
                                switch (getInterpreter().adaptivePredict(_input, 51, _ctx)) {
                                    case 1: {
                                        setState(733);
                                        int_result(0);
                                    }
                                    break;
                                    case 2: {
                                        setState(734);
                                        dynamic_result(0);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    setState(741);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 52, _ctx);
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

    public static class Array_selectorContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public TerminalNode LEFT_SBRACKET() {
            return getToken(XPRParser.LEFT_SBRACKET, 0);
        }

        public TerminalNode RIGHT_SBRACKET() {
            return getToken(XPRParser.RIGHT_SBRACKET, 0);
        }

        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Dynamic_resultContext dynamic_result() {
            return getRuleContext(Dynamic_resultContext.class, 0);
        }

        public Id_globalContext id_global() {
            return getRuleContext(Id_globalContext.class, 0);
        }

        public Array_selectorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_array_selector;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterArray_selector(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitArray_selector(this);
        }
    }

    public final Array_selectorContext array_selector() throws RecognitionException {
        Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_array_selector);
        try {
            setState(758);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(742);
                    id();
                    setState(743);
                    match(LEFT_SBRACKET);
                    setState(746);
                    switch (getInterpreter().adaptivePredict(_input, 53, _ctx)) {
                        case 1: {
                            setState(744);
                            int_result(0);
                        }
                        break;
                        case 2: {
                            setState(745);
                            dynamic_result(0);
                        }
                        break;
                    }
                    setState(748);
                    match(RIGHT_SBRACKET);
                }
                break;
                case ID_GLOBAL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(750);
                    id_global();
                    setState(751);
                    match(LEFT_SBRACKET);
                    setState(754);
                    switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
                        case 1: {
                            setState(752);
                            int_result(0);
                        }
                        break;
                        case 2: {
                            setState(753);
                            dynamic_result(0);
                        }
                        break;
                    }
                    setState(756);
                    match(RIGHT_SBRACKET);
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

    public static class Dynamic_resultContext extends ParserRuleContext {
        public Token op;

        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public List<Dynamic_resultContext> dynamic_result() {
            return getRuleContexts(Dynamic_resultContext.class);
        }

        public Dynamic_resultContext dynamic_result(int i) {
            return getRuleContext(Dynamic_resultContext.class, i);
        }

        public TerminalNode MUL() {
            return getToken(XPRParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(XPRParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(XPRParser.MOD, 0);
        }

        public Float_resultContext float_result() {
            return getRuleContext(Float_resultContext.class, 0);
        }

        public String_resultContext string_result() {
            return getRuleContext(String_resultContext.class, 0);
        }

        public TerminalNode PLUS() {
            return getToken(XPRParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(XPRParser.MINUS, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(XPRParser.LEFT_RBRACKET, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(XPRParser.RIGHT_RBRACKET, 0);
        }

        public DynamicContext dynamic() {
            return getRuleContext(DynamicContext.class, 0);
        }

        public Dynamic_resultContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dynamic_result;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterDynamic_result(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitDynamic_result(this);
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
        int _startState = 136;
        enterRecursionRule(_localctx, 136, RULE_dynamic_result, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(786);
                switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
                    case 1: {
                        setState(761);
                        int_result(0);
                        setState(762);
                        ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                            ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(763);
                        dynamic_result(13);
                    }
                    break;
                    case 2: {
                        setState(765);
                        float_result(0);
                        setState(766);
                        ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                            ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(767);
                        dynamic_result(11);
                    }
                    break;
                    case 3: {
                        setState(769);
                        string_result(0);
                        setState(770);
                        ((Dynamic_resultContext) _localctx).op = match(MUL);
                        setState(771);
                        dynamic_result(8);
                    }
                    break;
                    case 4: {
                        setState(773);
                        int_result(0);
                        setState(774);
                        ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(775);
                        dynamic_result(6);
                    }
                    break;
                    case 5: {
                        setState(777);
                        float_result(0);
                        setState(778);
                        ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(779);
                        dynamic_result(4);
                    }
                    break;
                    case 6: {
                        setState(781);
                        match(LEFT_RBRACKET);
                        setState(782);
                        dynamic_result(0);
                        setState(783);
                        match(RIGHT_RBRACKET);
                    }
                    break;
                    case 7: {
                        setState(785);
                        dynamic();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(811);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(809);
                            switch (getInterpreter().adaptivePredict(_input, 57, _ctx)) {
                                case 1: {
                                    _localctx = new Dynamic_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
                                    setState(788);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(789);
                                    ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(790);
                                    dynamic_result(11);
                                }
                                break;
                                case 2: {
                                    _localctx = new Dynamic_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
                                    setState(791);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(792);
                                    ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(793);
                                    dynamic_result(4);
                                }
                                break;
                                case 3: {
                                    _localctx = new Dynamic_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
                                    setState(794);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(795);
                                    ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(796);
                                    int_result(0);
                                }
                                break;
                                case 4: {
                                    _localctx = new Dynamic_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
                                    setState(797);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(798);
                                    ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(799);
                                    float_result(0);
                                }
                                break;
                                case 5: {
                                    _localctx = new Dynamic_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
                                    setState(800);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(801);
                                    ((Dynamic_resultContext) _localctx).op = match(MUL);
                                    setState(802);
                                    string_result(0);
                                }
                                break;
                                case 6: {
                                    _localctx = new Dynamic_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
                                    setState(803);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(804);
                                    ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(805);
                                    int_result(0);
                                }
                                break;
                                case 7: {
                                    _localctx = new Dynamic_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
                                    setState(806);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(807);
                                    ((Dynamic_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((Dynamic_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(808);
                                    float_result(0);
                                }
                                break;
                            }
                        }
                    }
                    setState(813);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
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

    public static class DynamicContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Function_call_assignmentContext function_call_assignment() {
            return getRuleContext(Function_call_assignmentContext.class, 0);
        }

        public Array_selectorContext array_selector() {
            return getRuleContext(Array_selectorContext.class, 0);
        }

        public DynamicContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dynamic;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterDynamic(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitDynamic(this);
        }
    }

    public final DynamicContext dynamic() throws RecognitionException {
        DynamicContext _localctx = new DynamicContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_dynamic);
        try {
            setState(817);
            switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(814);
                    id();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(815);
                    function_call_assignment();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(816);
                    array_selector();
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

    public static class Int_resultContext extends ParserRuleContext {
        public Token op;

        public TerminalNode LEFT_RBRACKET() {
            return getToken(XPRParser.LEFT_RBRACKET, 0);
        }

        public List<Int_resultContext> int_result() {
            return getRuleContexts(Int_resultContext.class);
        }

        public Int_resultContext int_result(int i) {
            return getRuleContext(Int_resultContext.class, i);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(XPRParser.RIGHT_RBRACKET, 0);
        }

        public Int_tContext int_t() {
            return getRuleContext(Int_tContext.class, 0);
        }

        public TerminalNode MUL() {
            return getToken(XPRParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(XPRParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(XPRParser.MOD, 0);
        }

        public TerminalNode PLUS() {
            return getToken(XPRParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(XPRParser.MINUS, 0);
        }

        public Int_resultContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_int_result;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterInt_result(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitInt_result(this);
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
        int _startState = 140;
        enterRecursionRule(_localctx, 140, RULE_int_result, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(825);
                switch (_input.LA(1)) {
                    case LEFT_RBRACKET: {
                        setState(820);
                        match(LEFT_RBRACKET);
                        setState(821);
                        int_result(0);
                        setState(822);
                        match(RIGHT_RBRACKET);
                    }
                    break;
                    case INT: {
                        setState(824);
                        int_t();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(835);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(833);
                            switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
                                case 1: {
                                    _localctx = new Int_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_int_result);
                                    setState(827);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(828);
                                    ((Int_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((Int_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(829);
                                    int_result(5);
                                }
                                break;
                                case 2: {
                                    _localctx = new Int_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_int_result);
                                    setState(830);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(831);
                                    ((Int_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((Int_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(832);
                                    int_result(4);
                                }
                                break;
                            }
                        }
                    }
                    setState(837);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
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

    public static class Float_resultContext extends ParserRuleContext {
        public Token op;

        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public List<Float_resultContext> float_result() {
            return getRuleContexts(Float_resultContext.class);
        }

        public Float_resultContext float_result(int i) {
            return getRuleContext(Float_resultContext.class, i);
        }

        public TerminalNode MUL() {
            return getToken(XPRParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(XPRParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(XPRParser.MOD, 0);
        }

        public TerminalNode PLUS() {
            return getToken(XPRParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(XPRParser.MINUS, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(XPRParser.LEFT_RBRACKET, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(XPRParser.RIGHT_RBRACKET, 0);
        }

        public Float_tContext float_t() {
            return getRuleContext(Float_tContext.class, 0);
        }

        public Float_resultContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_float_result;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFloat_result(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFloat_result(this);
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
        int _startState = 142;
        enterRecursionRule(_localctx, 142, RULE_float_result, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(852);
                switch (getInterpreter().adaptivePredict(_input, 63, _ctx)) {
                    case 1: {
                        setState(839);
                        int_result(0);
                        setState(840);
                        ((Float_resultContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                            ((Float_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(841);
                        float_result(7);
                    }
                    break;
                    case 2: {
                        setState(843);
                        int_result(0);
                        setState(844);
                        ((Float_resultContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS)) {
                            ((Float_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(845);
                        float_result(4);
                    }
                    break;
                    case 3: {
                        setState(847);
                        match(LEFT_RBRACKET);
                        setState(848);
                        float_result(0);
                        setState(849);
                        match(RIGHT_RBRACKET);
                    }
                    break;
                    case 4: {
                        setState(851);
                        float_t();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(868);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 65, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(866);
                            switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
                                case 1: {
                                    _localctx = new Float_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_float_result);
                                    setState(854);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(855);
                                    ((Float_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((Float_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(856);
                                    float_result(9);
                                }
                                break;
                                case 2: {
                                    _localctx = new Float_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_float_result);
                                    setState(857);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(858);
                                    ((Float_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((Float_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(859);
                                    float_result(6);
                                }
                                break;
                                case 3: {
                                    _localctx = new Float_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_float_result);
                                    setState(860);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(861);
                                    ((Float_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        ((Float_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(862);
                                    int_result(0);
                                }
                                break;
                                case 4: {
                                    _localctx = new Float_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_float_result);
                                    setState(863);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(864);
                                    ((Float_resultContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        ((Float_resultContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(865);
                                    int_result(0);
                                }
                                break;
                            }
                        }
                    }
                    setState(870);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 65, _ctx);
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

    public static class String_resultContext extends ParserRuleContext {
        public Token op;

        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public List<String_resultContext> string_result() {
            return getRuleContexts(String_resultContext.class);
        }

        public String_resultContext string_result(int i) {
            return getRuleContext(String_resultContext.class, i);
        }

        public TerminalNode MUL() {
            return getToken(XPRParser.MUL, 0);
        }

        public Literal_tContext literal_t() {
            return getRuleContext(Literal_tContext.class, 0);
        }

        public TerminalNode PLUS() {
            return getToken(XPRParser.PLUS, 0);
        }

        public String_resultContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_string_result;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterString_result(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitString_result(this);
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
        int _startState = 144;
        enterRecursionRule(_localctx, 144, RULE_string_result, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(877);
                switch (_input.LA(1)) {
                    case LEFT_RBRACKET:
                    case INT: {
                        setState(872);
                        int_result(0);
                        setState(873);
                        ((String_resultContext) _localctx).op = match(MUL);
                        setState(874);
                        string_result(3);
                    }
                    break;
                    case LITERAL: {
                        setState(876);
                        literal_t();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(887);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(885);
                            switch (getInterpreter().adaptivePredict(_input, 67, _ctx)) {
                                case 1: {
                                    _localctx = new String_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_string_result);
                                    setState(879);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(880);
                                    ((String_resultContext) _localctx).op = match(PLUS);
                                    setState(881);
                                    string_result(3);
                                }
                                break;
                                case 2: {
                                    _localctx = new String_resultContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_string_result);
                                    setState(882);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(883);
                                    ((String_resultContext) _localctx).op = match(MUL);
                                    setState(884);
                                    int_result(0);
                                }
                                break;
                            }
                        }
                    }
                    setState(889);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
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

    public static class Comparison_listContext extends ParserRuleContext {
        public ComparisonContext left;
        public Token op;
        public Comparison_listContext right;

        public ComparisonContext comparison() {
            return getRuleContext(ComparisonContext.class, 0);
        }

        public TerminalNode BIT_AND() {
            return getToken(XPRParser.BIT_AND, 0);
        }

        public Comparison_listContext comparison_list() {
            return getRuleContext(Comparison_listContext.class, 0);
        }

        public TerminalNode AND() {
            return getToken(XPRParser.AND, 0);
        }

        public TerminalNode BIT_OR() {
            return getToken(XPRParser.BIT_OR, 0);
        }

        public TerminalNode OR() {
            return getToken(XPRParser.OR, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(XPRParser.LEFT_RBRACKET, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(XPRParser.RIGHT_RBRACKET, 0);
        }

        public Nil_checkContext nil_check() {
            return getRuleContext(Nil_checkContext.class, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterComparison_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitComparison_list(this);
        }
    }

    public final Comparison_listContext comparison_list() throws RecognitionException {
        Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_comparison_list);
        try {
            setState(912);
            switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(890);
                    ((Comparison_listContext) _localctx).left = comparison();
                    setState(891);
                    ((Comparison_listContext) _localctx).op = match(BIT_AND);
                    setState(892);
                    ((Comparison_listContext) _localctx).right = comparison_list();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(894);
                    ((Comparison_listContext) _localctx).left = comparison();
                    setState(895);
                    ((Comparison_listContext) _localctx).op = match(AND);
                    setState(896);
                    ((Comparison_listContext) _localctx).right = comparison_list();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(898);
                    ((Comparison_listContext) _localctx).left = comparison();
                    setState(899);
                    ((Comparison_listContext) _localctx).op = match(BIT_OR);
                    setState(900);
                    ((Comparison_listContext) _localctx).right = comparison_list();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(902);
                    ((Comparison_listContext) _localctx).left = comparison();
                    setState(903);
                    ((Comparison_listContext) _localctx).op = match(OR);
                    setState(904);
                    ((Comparison_listContext) _localctx).right = comparison_list();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(906);
                    match(LEFT_RBRACKET);
                    setState(907);
                    comparison_list();
                    setState(908);
                    match(RIGHT_RBRACKET);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(910);
                    comparison();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(911);
                    nil_check();
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

    public static class Nil_checkContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(XPRParser.ID, 0);
        }

        public TerminalNode DOT() {
            return getToken(XPRParser.DOT, 0);
        }

        public Nil_tContext nil_t() {
            return getRuleContext(Nil_tContext.class, 0);
        }

        public Nil_checkContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nil_check;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterNil_check(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitNil_check(this);
        }
    }

    public final Nil_checkContext nil_check() throws RecognitionException {
        Nil_checkContext _localctx = new Nil_checkContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_nil_check);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(914);
                match(ID);
                setState(915);
                match(DOT);
                setState(916);
                nil_t();
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

    public static class ComparisonContext extends ParserRuleContext {
        public Comp_varContext left;
        public Token op;
        public Comp_varContext right;

        public List<Comp_varContext> comp_var() {
            return getRuleContexts(Comp_varContext.class);
        }

        public Comp_varContext comp_var(int i) {
            return getRuleContext(Comp_varContext.class, i);
        }

        public TerminalNode LESS() {
            return getToken(XPRParser.LESS, 0);
        }

        public TerminalNode GREATER() {
            return getToken(XPRParser.GREATER, 0);
        }

        public TerminalNode LESS_EQUAL() {
            return getToken(XPRParser.LESS_EQUAL, 0);
        }

        public TerminalNode GREATER_EQUAL() {
            return getToken(XPRParser.GREATER_EQUAL, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(XPRParser.EQUAL, 0);
        }

        public TerminalNode NOT_EQUAL() {
            return getToken(XPRParser.NOT_EQUAL, 0);
        }

        public ComparisonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comparison;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterComparison(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitComparison(this);
        }
    }

    public final ComparisonContext comparison() throws RecognitionException {
        ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_comparison);
        int _la;
        try {
            setState(926);
            switch (getInterpreter().adaptivePredict(_input, 70, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(918);
                    ((ComparisonContext) _localctx).left = comp_var();
                    setState(919);
                    ((ComparisonContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0))) {
                        ((ComparisonContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(920);
                    ((ComparisonContext) _localctx).right = comp_var();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(922);
                    ((ComparisonContext) _localctx).left = comp_var();
                    setState(923);
                    ((ComparisonContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == EQUAL || _la == NOT_EQUAL)) {
                        ((ComparisonContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(924);
                    ((ComparisonContext) _localctx).right = comp_var();
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

    public static class Comp_varContext extends ParserRuleContext {
        public All_resultContext all_result() {
            return getRuleContext(All_resultContext.class, 0);
        }

        public Array_selectorContext array_selector() {
            return getRuleContext(Array_selectorContext.class, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public Comp_varContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comp_var;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterComp_var(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitComp_var(this);
        }
    }

    public final Comp_varContext comp_var() throws RecognitionException {
        Comp_varContext _localctx = new Comp_varContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_comp_var);
        try {
            setState(931);
            switch (getInterpreter().adaptivePredict(_input, 71, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(928);
                    all_result();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(929);
                    array_selector();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(930);
                    lvalue();
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

    public static class LvalueContext extends ParserRuleContext {
        public IdContext id() {
            return getRuleContext(IdContext.class, 0);
        }

        public Class_nameContext class_name() {
            return getRuleContext(Class_nameContext.class, 0);
        }

        public TerminalNode DOT() {
            return getToken(XPRParser.DOT, 0);
        }

        public Id_globalContext id_global() {
            return getRuleContext(Id_globalContext.class, 0);
        }

        public LvalueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lvalue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterLvalue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitLvalue(this);
        }
    }

    public final LvalueContext lvalue() throws RecognitionException {
        LvalueContext _localctx = new LvalueContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_lvalue);
        try {
            setState(941);
            switch (getInterpreter().adaptivePredict(_input, 73, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(936);
                    switch (getInterpreter().adaptivePredict(_input, 72, _ctx)) {
                        case 1: {
                            setState(933);
                            class_name();
                            setState(934);
                            match(DOT);
                        }
                        break;
                    }
                    setState(938);
                    id();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(939);
                    id();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(940);
                    id_global();
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

    public static class RvalueContext extends ParserRuleContext {
        public List<RvalueContext> rvalue() {
            return getRuleContexts(RvalueContext.class);
        }

        public RvalueContext rvalue(int i) {
            return getRuleContext(RvalueContext.class, i);
        }

        public TerminalNode NOT() {
            return getToken(XPRParser.NOT, 0);
        }

        public TerminalNode BIT_NOT() {
            return getToken(XPRParser.BIT_NOT, 0);
        }

        public LvalueContext lvalue() {
            return getRuleContext(LvalueContext.class, 0);
        }

        public Initial_array_assignmentContext initial_array_assignment() {
            return getRuleContext(Initial_array_assignmentContext.class, 0);
        }

        public Array_assignmentContext array_assignment() {
            return getRuleContext(Array_assignmentContext.class, 0);
        }

        public Int_resultContext int_result() {
            return getRuleContext(Int_resultContext.class, 0);
        }

        public Float_resultContext float_result() {
            return getRuleContext(Float_resultContext.class, 0);
        }

        public String_resultContext string_result() {
            return getRuleContext(String_resultContext.class, 0);
        }

        public Global_setContext global_set() {
            return getRuleContext(Global_setContext.class, 0);
        }

        public Global_getContext global_get() {
            return getRuleContext(Global_getContext.class, 0);
        }

        public Dynamic_assignmentContext dynamic_assignment() {
            return getRuleContext(Dynamic_assignmentContext.class, 0);
        }

        public String_assignmentContext string_assignment() {
            return getRuleContext(String_assignmentContext.class, 0);
        }

        public Float_assignmentContext float_assignment() {
            return getRuleContext(Float_assignmentContext.class, 0);
        }

        public Int_assignmentContext int_assignment() {
            return getRuleContext(Int_assignmentContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public Function_callContext function_call() {
            return getRuleContext(Function_callContext.class, 0);
        }

        public Literal_tContext literal_t() {
            return getRuleContext(Literal_tContext.class, 0);
        }

        public Bool_tContext bool_t() {
            return getRuleContext(Bool_tContext.class, 0);
        }

        public Float_tContext float_t() {
            return getRuleContext(Float_tContext.class, 0);
        }

        public Int_tContext int_t() {
            return getRuleContext(Int_tContext.class, 0);
        }

        public Nil_tContext nil_t() {
            return getRuleContext(Nil_tContext.class, 0);
        }

        public TerminalNode LEFT_RBRACKET() {
            return getToken(XPRParser.LEFT_RBRACKET, 0);
        }

        public TerminalNode RIGHT_RBRACKET() {
            return getToken(XPRParser.RIGHT_RBRACKET, 0);
        }

        public TerminalNode EXP() {
            return getToken(XPRParser.EXP, 0);
        }

        public TerminalNode MUL() {
            return getToken(XPRParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(XPRParser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(XPRParser.MOD, 0);
        }

        public TerminalNode PLUS() {
            return getToken(XPRParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(XPRParser.MINUS, 0);
        }

        public TerminalNode BIT_SHL() {
            return getToken(XPRParser.BIT_SHL, 0);
        }

        public TerminalNode BIT_SHR() {
            return getToken(XPRParser.BIT_SHR, 0);
        }

        public TerminalNode BIT_AND() {
            return getToken(XPRParser.BIT_AND, 0);
        }

        public TerminalNode BIT_OR() {
            return getToken(XPRParser.BIT_OR, 0);
        }

        public TerminalNode BIT_XOR() {
            return getToken(XPRParser.BIT_XOR, 0);
        }

        public TerminalNode LESS() {
            return getToken(XPRParser.LESS, 0);
        }

        public TerminalNode GREATER() {
            return getToken(XPRParser.GREATER, 0);
        }

        public TerminalNode LESS_EQUAL() {
            return getToken(XPRParser.LESS_EQUAL, 0);
        }

        public TerminalNode GREATER_EQUAL() {
            return getToken(XPRParser.GREATER_EQUAL, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(XPRParser.EQUAL, 0);
        }

        public TerminalNode NOT_EQUAL() {
            return getToken(XPRParser.NOT_EQUAL, 0);
        }

        public TerminalNode OR() {
            return getToken(XPRParser.OR, 0);
        }

        public TerminalNode AND() {
            return getToken(XPRParser.AND, 0);
        }

        public RvalueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rvalue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterRvalue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitRvalue(this);
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
        int _startState = 156;
        enterRecursionRule(_localctx, 156, RULE_rvalue, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(969);
                switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
                    case 1: {
                        setState(944);
                        _la = _input.LA(1);
                        if (!(_la == BIT_NOT || _la == NOT)) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(945);
                        rvalue(10);
                    }
                    break;
                    case 2: {
                        setState(946);
                        lvalue();
                    }
                    break;
                    case 3: {
                        setState(947);
                        initial_array_assignment();
                    }
                    break;
                    case 4: {
                        setState(948);
                        array_assignment();
                    }
                    break;
                    case 5: {
                        setState(949);
                        int_result(0);
                    }
                    break;
                    case 6: {
                        setState(950);
                        float_result(0);
                    }
                    break;
                    case 7: {
                        setState(951);
                        string_result(0);
                    }
                    break;
                    case 8: {
                        setState(952);
                        global_set();
                    }
                    break;
                    case 9: {
                        setState(953);
                        global_get();
                    }
                    break;
                    case 10: {
                        setState(954);
                        dynamic_assignment();
                    }
                    break;
                    case 11: {
                        setState(955);
                        string_assignment();
                    }
                    break;
                    case 12: {
                        setState(956);
                        float_assignment();
                    }
                    break;
                    case 13: {
                        setState(957);
                        int_assignment();
                    }
                    break;
                    case 14: {
                        setState(958);
                        assignment();
                    }
                    break;
                    case 15: {
                        setState(959);
                        function_call();
                    }
                    break;
                    case 16: {
                        setState(960);
                        literal_t();
                    }
                    break;
                    case 17: {
                        setState(961);
                        bool_t();
                    }
                    break;
                    case 18: {
                        setState(962);
                        float_t();
                    }
                    break;
                    case 19: {
                        setState(963);
                        int_t();
                    }
                    break;
                    case 20: {
                        setState(964);
                        nil_t();
                    }
                    break;
                    case 21: {
                        setState(965);
                        match(LEFT_RBRACKET);
                        setState(966);
                        rvalue(0);
                        setState(967);
                        match(RIGHT_RBRACKET);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1000);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 76, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(998);
                            switch (getInterpreter().adaptivePredict(_input, 75, _ctx)) {
                                case 1: {
                                    _localctx = new RvalueContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
                                    setState(971);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(972);
                                    match(EXP);
                                    setState(973);
                                    rvalue(12);
                                }
                                break;
                                case 2: {
                                    _localctx = new RvalueContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
                                    setState(974);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(975);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(976);
                                    rvalue(10);
                                }
                                break;
                                case 3: {
                                    _localctx = new RvalueContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
                                    setState(977);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(978);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(979);
                                    rvalue(9);
                                }
                                break;
                                case 4: {
                                    _localctx = new RvalueContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
                                    setState(980);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(981);
                                    _la = _input.LA(1);
                                    if (!(_la == BIT_SHL || _la == BIT_SHR)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(982);
                                    rvalue(8);
                                }
                                break;
                                case 5: {
                                    _localctx = new RvalueContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
                                    setState(983);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(984);
                                    match(BIT_AND);
                                    setState(985);
                                    rvalue(7);
                                }
                                break;
                                case 6: {
                                    _localctx = new RvalueContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
                                    setState(986);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(987);
                                    _la = _input.LA(1);
                                    if (!(_la == BIT_OR || _la == BIT_XOR)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(988);
                                    rvalue(6);
                                }
                                break;
                                case 7: {
                                    _localctx = new RvalueContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
                                    setState(989);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(990);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0))) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(991);
                                    rvalue(5);
                                }
                                break;
                                case 8: {
                                    _localctx = new RvalueContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
                                    setState(992);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(993);
                                    _la = _input.LA(1);
                                    if (!(_la == EQUAL || _la == NOT_EQUAL)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(994);
                                    rvalue(4);
                                }
                                break;
                                case 9: {
                                    _localctx = new RvalueContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
                                    setState(995);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(996);
                                    _la = _input.LA(1);
                                    if (!(_la == AND || _la == OR)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        consume();
                                    }
                                    setState(997);
                                    rvalue(3);
                                }
                                break;
                            }
                        }
                    }
                    setState(1002);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 76, _ctx);
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

    public static class Break_expressionContext extends ParserRuleContext {
        public TerminalNode BREAK() {
            return getToken(XPRParser.BREAK, 0);
        }

        public Break_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_break_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterBreak_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitBreak_expression(this);
        }
    }

    public final Break_expressionContext break_expression() throws RecognitionException {
        Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_break_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1003);
                match(BREAK);
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

    public static class Literal_tContext extends ParserRuleContext {
        public TerminalNode LITERAL() {
            return getToken(XPRParser.LITERAL, 0);
        }

        public Literal_tContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal_t;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterLiteral_t(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitLiteral_t(this);
        }
    }

    public final Literal_tContext literal_t() throws RecognitionException {
        Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_literal_t);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1005);
                match(LITERAL);
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

    public static class Float_tContext extends ParserRuleContext {
        public TerminalNode FLOAT() {
            return getToken(XPRParser.FLOAT, 0);
        }

        public Float_tContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_float_t;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterFloat_t(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitFloat_t(this);
        }
    }

    public final Float_tContext float_t() throws RecognitionException {
        Float_tContext _localctx = new Float_tContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_float_t);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1007);
                match(FLOAT);
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

    public static class Int_tContext extends ParserRuleContext {
        public TerminalNode INT() {
            return getToken(XPRParser.INT, 0);
        }

        public Int_tContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_int_t;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterInt_t(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitInt_t(this);
        }
    }

    public final Int_tContext int_t() throws RecognitionException {
        Int_tContext _localctx = new Int_tContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_int_t);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1009);
                match(INT);
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
            return getToken(XPRParser.TRUE, 0);
        }

        public TerminalNode FALSE() {
            return getToken(XPRParser.FALSE, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterBool_t(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitBool_t(this);
        }
    }

    public final Bool_tContext bool_t() throws RecognitionException {
        Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_bool_t);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1011);
                _la = _input.LA(1);
                if (!(_la == FALSE || _la == TRUE)) {
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

    public static class Nil_tContext extends ParserRuleContext {
        public TerminalNode NIL() {
            return getToken(XPRParser.NIL, 0);
        }

        public Nil_tContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_nil_t;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterNil_t(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitNil_t(this);
        }
    }

    public final Nil_tContext nil_t() throws RecognitionException {
        Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_nil_t);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1013);
                match(NIL);
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

    public static class IdContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(XPRParser.ID, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitId(this);
        }
    }

    public final IdContext id() throws RecognitionException {
        IdContext _localctx = new IdContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_id);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1015);
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

    public static class Id_globalContext extends ParserRuleContext {
        public TerminalNode ID_GLOBAL() {
            return getToken(XPRParser.ID_GLOBAL, 0);
        }

        public Id_globalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_id_global;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterId_global(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitId_global(this);
        }
    }

    public final Id_globalContext id_global() throws RecognitionException {
        Id_globalContext _localctx = new Id_globalContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_id_global);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1017);
                match(ID_GLOBAL);
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

    public static class Id_functionContext extends ParserRuleContext {
        public List<TerminalNode> ID() {
            return getTokens(XPRParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(XPRParser.ID, i);
        }

        public TerminalNode DOT() {
            return getToken(XPRParser.DOT, 0);
        }

        public TerminalNode ID_FUNCTION() {
            return getToken(XPRParser.ID_FUNCTION, 0);
        }

        public TerminalNode SELF() {
            return getToken(XPRParser.SELF, 0);
        }

        public Id_functionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_id_function;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).enterId_function(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitId_function(this);
        }
    }

    public final Id_functionContext id_function() throws RecognitionException {
        Id_functionContext _localctx = new Id_functionContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_id_function);
        int _la;
        try {
            setState(1027);
            switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1019);
                    match(ID);
                    setState(1020);
                    match(DOT);
                    setState(1021);
                    match(ID);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1024);
                    _la = _input.LA(1);
                    if (_la == SELF) {
                        {
                            setState(1022);
                            match(SELF);
                            setState(1023);
                            match(DOT);
                        }
                    }

                    setState(1026);
                    _la = _input.LA(1);
                    if (!(_la == ID || _la == ID_FUNCTION)) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
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

    public static class TerminatorContext extends ParserRuleContext {
        public TerminalNode SEMICOLON() {
            return getToken(XPRParser.SEMICOLON, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterTerminator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitTerminator(this);
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
        int _startState = 176;
        enterRecursionRule(_localctx, 176, RULE_terminator, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1032);
                switch (_input.LA(1)) {
                    case SEMICOLON: {
                        setState(1030);
                        match(SEMICOLON);
                    }
                    break;
                    case CRLF: {
                        setState(1031);
                        crlf();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(1040);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 81, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(1038);
                            switch (getInterpreter().adaptivePredict(_input, 80, _ctx)) {
                                case 1: {
                                    _localctx = new TerminatorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_terminator);
                                    setState(1034);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(1035);
                                    match(SEMICOLON);
                                }
                                break;
                                case 2: {
                                    _localctx = new TerminatorContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_terminator);
                                    setState(1036);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(1037);
                                    crlf();
                                }
                                break;
                            }
                        }
                    }
                    setState(1042);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 81, _ctx);
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

    public static class Else_tokenContext extends ParserRuleContext {
        public TerminalNode ELSE() {
            return getToken(XPRParser.ELSE, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterElse_token(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitElse_token(this);
        }
    }

    public final Else_tokenContext else_token() throws RecognitionException {
        Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_else_token);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1043);
                match(ELSE);
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
            return getToken(XPRParser.CRLF, 0);
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
            if (listener instanceof XPRListener) ((XPRListener) listener).enterCrlf(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XPRListener) ((XPRListener) listener).exitCrlf(this);
        }
    }

    public final CrlfContext crlf() throws RecognitionException {
        CrlfContext _localctx = new CrlfContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_crlf);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1045);
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

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 20:
                return function_definition_params_list_sempred((Function_definition_params_listContext) _localctx, predIndex);
            case 49:
                return for_init_list_sempred((For_init_listContext) _localctx, predIndex);
            case 52:
                return for_loop_list_sempred((For_loop_listContext) _localctx, predIndex);
            case 54:
                return statement_expression_list_sempred((Statement_expression_listContext) _localctx, predIndex);
            case 66:
                return array_definition_elements_sempred((Array_definition_elementsContext) _localctx, predIndex);
            case 68:
                return dynamic_result_sempred((Dynamic_resultContext) _localctx, predIndex);
            case 70:
                return int_result_sempred((Int_resultContext) _localctx, predIndex);
            case 71:
                return float_result_sempred((Float_resultContext) _localctx, predIndex);
            case 72:
                return string_result_sempred((String_resultContext) _localctx, predIndex);
            case 78:
                return rvalue_sempred((RvalueContext) _localctx, predIndex);
            case 88:
                return terminator_sempred((TerminatorContext) _localctx, predIndex);
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
                return precpred(_ctx, 3);
            case 4:
                return precpred(_ctx, 2);
            case 5:
                return precpred(_ctx, 1);
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u041a\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT" +
                    "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\7\2\u00bb\n" +
                    "\2\f\2\16\2\u00be\13\2\7\2\u00c0\n\2\f\2\16\2\u00c3\13\2\3\3\3\3\3\3\3" +
                    "\3\3\4\3\4\3\4\3\4\3\4\6\4\u00ce\n\4\r\4\16\4\u00cf\3\5\3\5\3\6\3\6\6" +
                    "\6\u00d6\n\6\r\6\16\6\u00d7\7\6\u00da\n\6\f\6\16\6\u00dd\13\6\3\7\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f0" +
                    "\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r" +
                    "\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\7\20\u010d\n\20" +
                    "\f\20\16\20\u0110\13\20\3\20\7\20\u0113\n\20\f\20\16\20\u0116\13\20\3" +
                    "\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0125" +
                    "\n\21\3\22\3\22\3\22\3\22\7\22\u012b\n\22\f\22\16\22\u012e\13\22\3\22" +
                    "\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013b\n\23\3\24" +
                    "\3\24\5\24\u013f\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0147\n\25\f" +
                    "\25\16\25\u014a\13\25\3\25\3\25\5\25\u014e\n\25\3\26\3\26\3\26\3\26\3" +
                    "\26\3\26\7\26\u0156\n\26\f\26\16\26\u0159\13\26\3\27\3\27\3\30\3\30\3" +
                    "\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0166\n\30\3\31\3\31\3\32\3\32" +
                    "\7\32\u016c\n\32\f\32\16\32\u016f\13\32\3\32\3\32\3\33\3\33\3\33\3\33" +
                    "\7\33\u0177\n\33\f\33\16\33\u017a\13\33\3\34\3\34\3\34\3\34\3\34\3\34" +
                    "\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u018a\n\37\3 \3 \3 \3 \3" +
                    "!\3!\3!\3\"\3\"\3\"\5\"\u0196\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3" +
                    "#\3#\3#\5#\u01a6\n#\3$\3$\3%\3%\3%\7%\u01ad\n%\f%\16%\u01b0\13%\3&\3&" +
                    "\5&\u01b4\n&\3\'\3\'\3\'\3\'\5\'\u01ba\n\'\3(\3(\3(\3(\3(\3(\5(\u01c2" +
                    "\n(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01ce\n*\5*\u01d0\n*\3+\3+\3,\3," +
                    "\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01e7\n,\3-\3-" +
                    "\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01ff" +
                    "\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3." +
                    "\3.\3.\5.\u0219\n.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60" +
                    "\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60" +
                    "\3\60\5\60\u0237\n\60\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u023f\n\62\3" +
                    "\63\3\63\3\63\3\63\3\63\3\63\7\63\u0247\n\63\f\63\16\63\u024a\13\63\3" +
                    "\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0256\n\66\f\66" +
                    "\16\66\u0259\13\66\3\67\3\67\38\38\38\38\78\u0261\n8\f8\168\u0264\138" +
                    "\38\38\38\38\38\58\u026b\n8\38\38\38\38\38\38\38\38\38\38\38\78\u0278" +
                    "\n8\f8\168\u027b\138\39\39\79\u027f\n9\f9\169\u0282\139\39\39\3:\3:\3" +
                    ":\3:\3:\3:\5:\u028c\n:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0296\n;\3<\3<\3<\3" +
                    "<\5<\u029c\n<\3=\3=\3=\3=\5=\u02a2\n=\3=\3=\3=\5=\u02a7\n=\5=\u02a9\n" +
                    "=\3>\3>\3>\3>\5>\u02af\n>\3>\3>\3>\5>\u02b4\n>\5>\u02b6\n>\3?\3?\3?\3" +
                    "?\3?\3?\3?\3?\5?\u02c0\n?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u02ca\n@\3A\3A\3" +
                    "A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\5D\u02dc\nD\3D\3D\3D\3D\5D\u02e2" +
                    "\nD\7D\u02e4\nD\fD\16D\u02e7\13D\3E\3E\3E\3E\5E\u02ed\nE\3E\3E\3E\3E\3" +
                    "E\3E\5E\u02f5\nE\3E\3E\5E\u02f9\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3" +
                    "F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0315\nF\3F\3F\3F\3F\3" +
                    "F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u032c\nF\fF\16F\u032f" +
                    "\13F\3G\3G\3G\5G\u0334\nG\3H\3H\3H\3H\3H\3H\5H\u033c\nH\3H\3H\3H\3H\3" +
                    "H\3H\7H\u0344\nH\fH\16H\u0347\13H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I" +
                    "\3I\3I\5I\u0357\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u0365\nI\fI" +
                    "\16I\u0368\13I\3J\3J\3J\3J\3J\3J\5J\u0370\nJ\3J\3J\3J\3J\3J\3J\7J\u0378" +
                    "\nJ\fJ\16J\u037b\13J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3" +
                    "K\3K\3K\3K\3K\3K\5K\u0393\nK\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\5M\u03a1" +
                    "\nM\3N\3N\3N\5N\u03a6\nN\3O\3O\3O\5O\u03ab\nO\3O\3O\3O\5O\u03b0\nO\3P" +
                    "\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P" +
                    "\3P\3P\5P\u03cc\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P" +
                    "\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\7P\u03e9\nP\fP\16P\u03ec\13P\3Q\3Q\3R\3" +
                    "R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\5Y\u0403\nY\3Y\5" +
                    "Y\u0406\nY\3Z\3Z\3Z\5Z\u040b\nZ\3Z\3Z\3Z\3Z\7Z\u0411\nZ\fZ\16Z\u0414\13" +
                    "Z\3[\3[\3\\\3\\\3\\\2\r*djn\u0086\u008a\u008e\u0090\u0092\u009e\u00b2" +
                    "]\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF" +
                    "HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c" +
                    "\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4" +
                    "\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\2\16\3\2\35 \3" +
                    "\28=\3\2-/\3\2+,\3\2\63\66\3\2\61\62\4\2AAFF\3\2BC\3\2?@\3\2DE\3\2!\"" +
                    "\4\2RRTT\u046f\2\u00c1\3\2\2\2\4\u00c4\3\2\2\2\6\u00c8\3\2\2\2\b\u00d1" +
                    "\3\2\2\2\n\u00db\3\2\2\2\f\u00ef\3\2\2\2\16\u00f1\3\2\2\2\20\u00f4\3\2" +
                    "\2\2\22\u00f8\3\2\2\2\24\u00fc\3\2\2\2\26\u00fe\3\2\2\2\30\u0100\3\2\2" +
                    "\2\32\u0103\3\2\2\2\34\u0108\3\2\2\2\36\u010a\3\2\2\2 \u0124\3\2\2\2\"" +
                    "\u0126\3\2\2\2$\u013a\3\2\2\2&\u013e\3\2\2\2(\u014d\3\2\2\2*\u014f\3\2" +
                    "\2\2,\u015a\3\2\2\2.\u0165\3\2\2\2\60\u0167\3\2\2\2\62\u016d\3\2\2\2\64" +
                    "\u0172\3\2\2\2\66\u017b\3\2\2\28\u0181\3\2\2\2:\u0183\3\2\2\2<\u0186\3" +
                    "\2\2\2>\u018b\3\2\2\2@\u018f\3\2\2\2B\u0195\3\2\2\2D\u01a5\3\2\2\2F\u01a7" +
                    "\3\2\2\2H\u01a9\3\2\2\2J\u01b3\3\2\2\2L\u01b9\3\2\2\2N\u01bb\3\2\2\2P" +
                    "\u01c3\3\2\2\2R\u01cf\3\2\2\2T\u01d1\3\2\2\2V\u01e6\3\2\2\2X\u01fe\3\2" +
                    "\2\2Z\u0218\3\2\2\2\\\u021a\3\2\2\2^\u0236\3\2\2\2`\u0238\3\2\2\2b\u023e" +
                    "\3\2\2\2d\u0240\3\2\2\2f\u024b\3\2\2\2h\u024d\3\2\2\2j\u024f\3\2\2\2l" +
                    "\u025a\3\2\2\2n\u026a\3\2\2\2p\u027c\3\2\2\2r\u028b\3\2\2\2t\u0295\3\2" +
                    "\2\2v\u0297\3\2\2\2x\u02a8\3\2\2\2z\u02b5\3\2\2\2|\u02bf\3\2\2\2~\u02c9" +
                    "\3\2\2\2\u0080\u02cb\3\2\2\2\u0082\u02d0\3\2\2\2\u0084\u02d4\3\2\2\2\u0086" +
                    "\u02d8\3\2\2\2\u0088\u02f8\3\2\2\2\u008a\u0314\3\2\2\2\u008c\u0333\3\2" +
                    "\2\2\u008e\u033b\3\2\2\2\u0090\u0356\3\2\2\2\u0092\u036f\3\2\2\2\u0094" +
                    "\u0392\3\2\2\2\u0096\u0394\3\2\2\2\u0098\u03a0\3\2\2\2\u009a\u03a5\3\2" +
                    "\2\2\u009c\u03af\3\2\2\2\u009e\u03cb\3\2\2\2\u00a0\u03ed\3\2\2\2\u00a2" +
                    "\u03ef\3\2\2\2\u00a4\u03f1\3\2\2\2\u00a6\u03f3\3\2\2\2\u00a8\u03f5\3\2" +
                    "\2\2\u00aa\u03f7\3\2\2\2\u00ac\u03f9\3\2\2\2\u00ae\u03fb\3\2\2\2\u00b0" +
                    "\u0405\3\2\2\2\u00b2\u040a\3\2\2\2\u00b4\u0415\3\2\2\2\u00b6\u0417\3\2" +
                    "\2\2\u00b8\u00bc\5\4\3\2\u00b9\u00bb\5\u00b2Z\2\u00ba\u00b9\3\2\2\2\u00bb" +
                    "\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2" +
                    "\2\2\u00be\u00bc\3\2\2\2\u00bf\u00b8\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1" +
                    "\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\3\3\2\2\2\u00c3\u00c1\3\2\2\2" +
                    "\u00c4\u00c5\5\6\4\2\u00c5\u00c6\5\n\6\2\u00c6\u00c7\7\t\2\2\u00c7\5\3" +
                    "\2\2\2\u00c8\u00c9\7\26\2\2\u00c9\u00ca\5\b\5\2\u00ca\u00cb\7\64\2\2\u00cb" +
                    "\u00cd\7\27\2\2\u00cc\u00ce\5\u00b6\\\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf" +
                    "\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\7\3\2\2\2\u00d1" +
                    "\u00d2\7R\2\2\u00d2\t\3\2\2\2\u00d3\u00d5\5\f\7\2\u00d4\u00d6\5\u00b2" +
                    "Z\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7" +
                    "\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d3\3\2\2\2\u00da\u00dd\3\2" +
                    "\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\13\3\2\2\2\u00dd\u00db" +
                    "\3\2\2\2\u00de\u00f0\5\36\20\2\u00df\u00f0\5\26\f\2\u00e0\u00f0\5\30\r" +
                    "\2\u00e1\u00f0\5X-\2\u00e2\u00f0\5Z.\2\u00e3\u00f0\5\u009eP\2\u00e4\u00f0" +
                    "\5@!\2\u00e5\u00f0\5\\/\2\u00e6\u00f0\5^\60\2\u00e7\u00f0\5\32\16\2\u00e8" +
                    "\u00f0\5\64\33\2\u00e9\u00f0\5\66\34\2\u00ea\u00f0\5:\36\2\u00eb\u00f0" +
                    "\5<\37\2\u00ec\u00f0\5\16\b\2\u00ed\u00f0\5p9\2\u00ee\u00f0\5@!\2\u00ef" +
                    "\u00de\3\2\2\2\u00ef\u00df\3\2\2\2\u00ef\u00e0\3\2\2\2\u00ef\u00e1\3\2" +
                    "\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e4\3\2\2\2\u00ef" +
                    "\u00e5\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2" +
                    "\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef" +
                    "\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\r\3\2\2\2" +
                    "\u00f1\u00f2\7\30\2\2\u00f2\u00f3\5\u0092J\2\u00f3\17\3\2\2\2\u00f4\u00f5" +
                    "\5\u009cO\2\u00f5\u00f6\7\67\2\2\u00f6\u00f7\5\u00aeX\2\u00f7\21\3\2\2" +
                    "\2\u00f8\u00f9\5\u00aeX\2\u00f9\u00fa\7\67\2\2\u00fa\u00fb\5R*\2\u00fb" +
                    "\23\3\2\2\2\u00fc\u00fd\5\u00aeX\2\u00fd\25\3\2\2\2\u00fe\u00ff\5D#\2" +
                    "\u00ff\27\3\2\2\2\u0100\u0101\7\b\2\2\u0101\u0102\5\u00a2R\2\u0102\31" +
                    "\3\2\2\2\u0103\u0104\7\f\2\2\u0104\u0105\5\u00b6\\\2\u0105\u0106\5\34" +
                    "\17\2\u0106\u0107\7\t\2\2\u0107\33\3\2\2\2\u0108\u0109\5\f\7\2\u0109\35" +
                    "\3\2\2\2\u010a\u010e\5$\23\2\u010b\u010d\5 \21\2\u010c\u010b\3\2\2\2\u010d" +
                    "\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0114\3\2" +
                    "\2\2\u0110\u010e\3\2\2\2\u0111\u0113\5\u00b6\\\2\u0112\u0111\3\2\2\2\u0113" +
                    "\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2" +
                    "\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\t\2\2\u0118\37\3\2\2\2\u0119\u0125" +
                    "\5\16\b\2\u011a\u0125\5.\30\2\u011b\u0125\5p9\2\u011c\u0125\5\u00b6\\" +
                    "\2\u011d\u0125\5\60\31\2\u011e\u0125\5@!\2\u011f\u0125\5\"\22\2\u0120" +
                    "\u0125\5\26\f\2\u0121\u0125\5B\"\2\u0122\u0125\5X-\2\u0123\u0125\5f\64" +
                    "\2\u0124\u0119\3\2\2\2\u0124\u011a\3\2\2\2\u0124\u011b\3\2\2\2\u0124\u011c" +
                    "\3\2\2\2\u0124\u011d\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124" +
                    "\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2" +
                    "\2\2\u0125!\3\2\2\2\u0126\u0127\7\33\2\2\u0127\u0128\7\34\2\2\u0128\u012c" +
                    "\5\u00b6\\\2\u0129\u012b\5 \21\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2" +
                    "\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c" +
                    "\3\2\2\2\u012f\u0130\7\t\2\2\u0130#\3\2\2\2\u0131\u0132\7\n\2\2\u0132" +
                    "\u0133\5&\24\2\u0133\u0134\5\u00b6\\\2\u0134\u013b\3\2\2\2\u0135\u0136" +
                    "\7\n\2\2\u0136\u0137\5&\24\2\u0137\u0138\5(\25\2\u0138\u0139\5\u00b6\\" +
                    "\2\u0139\u013b\3\2\2\2\u013a\u0131\3\2\2\2\u013a\u0135\3\2\2\2\u013b%" +
                    "\3\2\2\2\u013c\u013f\5\u00b0Y\2\u013d\u013f\5\u00acW\2\u013e\u013c\3\2" +
                    "\2\2\u013e\u013d\3\2\2\2\u013f\'\3\2\2\2\u0140\u0141\7H\2\2\u0141\u014e" +
                    "\7I\2\2\u0142\u0143\7H\2\2\u0143\u0148\5\u00acW\2\u0144\u0145\7\4\2\2" +
                    "\u0145\u0147\5,\27\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146" +
                    "\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b" +
                    "\u014c\7I\2\2\u014c\u014e\3\2\2\2\u014d\u0140\3\2\2\2\u014d\u0142\3\2" +
                    "\2\2\u014e)\3\2\2\2\u014f\u0150\b\26\1\2\u0150\u0151\5,\27\2\u0151\u0157" +
                    "\3\2\2\2\u0152\u0153\f\3\2\2\u0153\u0154\7\4\2\2\u0154\u0156\5,\27\2\u0155" +
                    "\u0152\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2" +
                    "\2\2\u0158+\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5\u00acW\2\u015b-" +
                    "\3\2\2\2\u015c\u0166\7\r\2\2\u015d\u015e\7\r\2\2\u015e\u015f\7H\2\2\u015f" +
                    "\u0160\5\62\32\2\u0160\u0161\7I\2\2\u0161\u0166\3\2\2\2\u0162\u0163\7" +
                    "\r\2\2\u0163\u0164\7H\2\2\u0164\u0166\7I\2\2\u0165\u015c\3\2\2\2\u0165" +
                    "\u015d\3\2\2\2\u0165\u0162\3\2\2\2\u0166/\3\2\2\2\u0167\u0168\7\16\2\2" +
                    "\u0168\61\3\2\2\2\u0169\u016a\7\4\2\2\u016a\u016c\5\u00acW\2\u016b\u0169" +
                    "\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e" +
                    "\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\5\u009cO\2\u0171\63\3\2" +
                    "\2\2\u0172\u0173\7\17\2\2\u0173\u0178\7S\2\2\u0174\u0175\7\4\2\2\u0175" +
                    "\u0177\7S\2\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2" +
                    "\2\2\u0178\u0179\3\2\2\2\u0179\65\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c" +
                    "\7\20\2\2\u017c\u017d\7S\2\2\u017d\u017e\7\4\2\2\u017e\u017f\58\35\2\u017f" +
                    "\u0180\5R*\2\u0180\67\3\2\2\2\u0181\u0182\t\2\2\2\u01829\3\2\2\2\u0183" +
                    "\u0184\7\22\2\2\u0184\u0185\5\u009cO\2\u0185;\3\2\2\2\u0186\u0187\7\23" +
                    "\2\2\u0187\u0189\5\u009cO\2\u0188\u018a\5> \2\u0189\u0188\3\2\2\2\u0189" +
                    "\u018a\3\2\2\2\u018a=\3\2\2\2\u018b\u018c\7\4\2\2\u018c\u018d\7\24\2\2" +
                    "\u018d\u018e\7\25\2\2\u018e?\3\2\2\2\u018f\u0190\7\13\2\2\u0190\u0191" +
                    "\5R*\2\u0191A\3\2\2\2\u0192\u0193\5\b\5\2\u0193\u0194\7G\2\2\u0194\u0196" +
                    "\3\2\2\2\u0195\u0192\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197" +
                    "\u0198\7\32\2\2\u0198C\3\2\2\2\u0199\u019a\5&\24\2\u019a\u019b\7H\2\2" +
                    "\u019b\u019c\5F$\2\u019c\u019d\7I\2\2\u019d\u01a6\3\2\2\2\u019e\u019f" +
                    "\5&\24\2\u019f\u01a0\5F$\2\u01a0\u01a6\3\2\2\2\u01a1\u01a2\5&\24\2\u01a2" +
                    "\u01a3\7H\2\2\u01a3\u01a4\7I\2\2\u01a4\u01a6\3\2\2\2\u01a5\u0199\3\2\2" +
                    "\2\u01a5\u019e\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a6E\3\2\2\2\u01a7\u01a8" +
                    "\5H%\2\u01a8G\3\2\2\2\u01a9\u01ae\5J&\2\u01aa\u01ab\7\4\2\2\u01ab\u01ad" +
                    "\5J&\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae" +
                    "\u01af\3\2\2\2\u01afI\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\5L\'\2\u01b2" +
                    "\u01b4\5N(\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4K\3\2\2\2\u01b5" +
                    "\u01ba\5\u008eH\2\u01b6\u01ba\5\u0090I\2\u01b7\u01ba\5\u0092J\2\u01b8" +
                    "\u01ba\5\u008aF\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7" +
                    "\3\2\2\2\u01b9\u01b8\3\2\2\2\u01baM\3\2\2\2\u01bb\u01bc\5\u00acW\2\u01bc" +
                    "\u01c1\7\67\2\2\u01bd\u01c2\5\u008eH\2\u01be\u01c2\5\u0090I\2\u01bf\u01c2" +
                    "\5\u0092J\2\u01c0\u01c2\5\u008aF\2\u01c1\u01bd\3\2\2\2\u01c1\u01be\3\2" +
                    "\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2O\3\2\2\2\u01c3\u01c4" +
                    "\5D#\2\u01c4Q\3\2\2\2\u01c5\u01d0\5\u008eH\2\u01c6\u01d0\5\u0090I\2\u01c7" +
                    "\u01d0\5\u00aaV\2\u01c8\u01d0\5\u0092J\2\u01c9\u01d0\5\u008aF\2\u01ca" +
                    "\u01d0\5\24\13\2\u01cb\u01cd\5\u00a8U\2\u01cc\u01ce\5\f\7\2\u01cd\u01cc" +
                    "\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01c5\3\2\2\2\u01cf" +
                    "\u01c6\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01c8\3\2\2\2\u01cf\u01c9\3\2" +
                    "\2\2\u01cf\u01ca\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d0S\3\2\2\2\u01d1\u01d2" +
                    "\5V,\2\u01d2U\3\2\2\2\u01d3\u01d4\7%\2\2\u01d4\u01d5\5f\64\2\u01d5\u01d6" +
                    "\5\u00b6\\\2\u01d6\u01d7\5l\67\2\u01d7\u01e7\3\2\2\2\u01d8\u01d9\7%\2" +
                    "\2\u01d9\u01da\5f\64\2\u01da\u01db\5\u00b6\\\2\u01db\u01dc\5l\67\2\u01dc" +
                    "\u01dd\5\u00b4[\2\u01dd\u01de\5\u00b6\\\2\u01de\u01df\5l\67\2\u01df\u01e7" +
                    "\3\2\2\2\u01e0\u01e1\7%\2\2\u01e1\u01e2\5f\64\2\u01e2\u01e3\5\u00b6\\" +
                    "\2\u01e3\u01e4\5l\67\2\u01e4\u01e5\5V,\2\u01e5\u01e7\3\2\2\2\u01e6\u01d3" +
                    "\3\2\2\2\u01e6\u01d8\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e7W\3\2\2\2\u01e8" +
                    "\u01e9\7#\2\2\u01e9\u01ea\5f\64\2\u01ea\u01eb\5\u00b6\\\2\u01eb\u01ec" +
                    "\5l\67\2\u01ec\u01ed\7\t\2\2\u01ed\u01ff\3\2\2\2\u01ee\u01ef\7#\2\2\u01ef" +
                    "\u01f0\5f\64\2\u01f0\u01f1\5\u00b6\\\2\u01f1\u01f2\5l\67\2\u01f2\u01f3" +
                    "\5\u00b4[\2\u01f3\u01f4\5\u00b6\\\2\u01f4\u01f5\5l\67\2\u01f5\u01f6\7" +
                    "\t\2\2\u01f6\u01ff\3\2\2\2\u01f7\u01f8\7#\2\2\u01f8\u01f9\5f\64\2\u01f9" +
                    "\u01fa\5\u00b6\\\2\u01fa\u01fb\5l\67\2\u01fb\u01fc\5T+\2\u01fc\u01fd\7" +
                    "\t\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01e8\3\2\2\2\u01fe\u01ee\3\2\2\2\u01fe" +
                    "\u01f7\3\2\2\2\u01ffY\3\2\2\2\u0200\u0201\7&\2\2\u0201\u0202\5f\64\2\u0202" +
                    "\u0203\5\u00b6\\\2\u0203\u0204\5l\67\2\u0204\u0205\7\t\2\2\u0205\u0219" +
                    "\3\2\2\2\u0206\u0207\7&\2\2\u0207\u0208\5f\64\2\u0208\u0209\5\u00b6\\" +
                    "\2\u0209\u020a\5l\67\2\u020a\u020b\5\u00b4[\2\u020b\u020c\5\u00b6\\\2" +
                    "\u020c\u020d\5l\67\2\u020d\u020e\7\t\2\2\u020e\u0219\3\2\2\2\u020f\u0210" +
                    "\7&\2\2\u0210\u0211\5f\64\2\u0211\u0212\5\u00b6\\\2\u0212\u0213\5l\67" +
                    "\2\u0213\u0214\5T+\2\u0214\u0215\7\t\2\2\u0215\u0219\3\2\2\2\u0216\u0217" +
                    "\7&\2\2\u0217\u0219\5D#\2\u0218\u0200\3\2\2\2\u0218\u0206\3\2\2\2\u0218" +
                    "\u020f\3\2\2\2\u0218\u0216\3\2\2\2\u0219[\3\2\2\2\u021a\u021b\7\'\2\2" +
                    "\u021b\u021c\5f\64\2\u021c\u021d\5\u00b6\\\2\u021d\u021e\5l\67\2\u021e" +
                    "\u021f\7\t\2\2\u021f]\3\2\2\2\u0220\u0221\7*\2\2\u0221\u0222\7H\2\2\u0222" +
                    "\u0223\5`\61\2\u0223\u0224\7\5\2\2\u0224\u0225\5f\64\2\u0225\u0226\7\5" +
                    "\2\2\u0226\u0227\5h\65\2\u0227\u0228\7I\2\2\u0228\u0229\5\u00b6\\\2\u0229" +
                    "\u022a\5l\67\2\u022a\u022b\7\t\2\2\u022b\u0237\3\2\2\2\u022c\u022d\7*" +
                    "\2\2\u022d\u022e\5`\61\2\u022e\u022f\7\5\2\2\u022f\u0230\5f\64\2\u0230" +
                    "\u0231\7\5\2\2\u0231\u0232\5h\65\2\u0232\u0233\5\u00b6\\\2\u0233\u0234" +
                    "\5l\67\2\u0234\u0235\7\t\2\2\u0235\u0237\3\2\2\2\u0236\u0220\3\2\2\2\u0236" +
                    "\u022c\3\2\2\2\u0237_\3\2\2\2\u0238\u0239\5d\63\2\u0239a\3\2\2\2\u023a" +
                    "\u023f\5v<\2\u023b\u023f\5|?\2\u023c\u023f\5~@\2\u023d\u023f\5t;\2\u023e" +
                    "\u023a\3\2\2\2\u023e\u023b\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2" +
                    "\2\2\u023fc\3\2\2\2\u0240\u0241\b\63\1\2\u0241\u0242\5b\62\2\u0242\u0248" +
                    "\3\2\2\2\u0243\u0244\f\4\2\2\u0244\u0245\7\4\2\2\u0245\u0247\5b\62\2\u0246" +
                    "\u0243\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2" +
                    "\2\2\u0249e\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\5\u0094K\2\u024cg" +
                    "\3\2\2\2\u024d\u024e\5j\66\2\u024ei\3\2\2\2\u024f\u0250\b\66\1\2\u0250" +
                    "\u0251\5b\62\2\u0251\u0257\3\2\2\2\u0252\u0253\f\4\2\2\u0253\u0254\7\4" +
                    "\2\2\u0254\u0256\5b\62\2\u0255\u0252\3\2\2\2\u0256\u0259\3\2\2\2\u0257" +
                    "\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258k\3\2\2\2\u0259\u0257\3\2\2\2" +
                    "\u025a\u025b\5n8\2\u025bm\3\2\2\2\u025c\u0262\b8\1\2\u025d\u025e\5\f\7" +
                    "\2\u025e\u025f\5\u00b2Z\2\u025f\u0261\3\2\2\2\u0260\u025d\3\2\2\2\u0261" +
                    "\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u026b\3\2" +
                    "\2\2\u0264\u0262\3\2\2\2\u0265\u0266\7(\2\2\u0266\u026b\5\u00b2Z\2\u0267" +
                    "\u0268\5\u00a0Q\2\u0268\u0269\5\u00b2Z\2\u0269\u026b\3\2\2\2\u026a\u025c" +
                    "\3\2\2\2\u026a\u0265\3\2\2\2\u026a\u0267\3\2\2\2\u026b\u0279\3\2\2\2\u026c" +
                    "\u026d\f\5\2\2\u026d\u026e\5\f\7\2\u026e\u026f\5\u00b2Z\2\u026f\u0278" +
                    "\3\2\2\2\u0270\u0271\f\4\2\2\u0271\u0272\7(\2\2\u0272\u0278\5\u00b2Z\2" +
                    "\u0273\u0274\f\3\2\2\u0274\u0275\5\u00a0Q\2\u0275\u0276\5\u00b2Z\2\u0276" +
                    "\u0278\3\2\2\2\u0277\u026c\3\2\2\2\u0277\u0270\3\2\2\2\u0277\u0273\3\2" +
                    "\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a" +
                    "o\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u0280\5\u009cO\2\u027d\u027f\7\67" +
                    "\2\2\u027e\u027d\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280" +
                    "\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\5r" +
                    ":\2\u0284q\3\2\2\2\u0285\u028c\5\u008eH\2\u0286\u028c\5x=\2\u0287\u028c" +
                    "\5z>\2\u0288\u028c\5.\30\2\u0289\u028c\5D#\2\u028a\u028c\5\u009cO\2\u028b" +
                    "\u0285\3\2\2\2\u028b\u0286\3\2\2\2\u028b\u0287\3\2\2\2\u028b\u0288\3\2" +
                    "\2\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2\2\2\u028cs\3\2\2\2\u028d\u028e" +
                    "\5\u009cO\2\u028e\u028f\7\67\2\2\u028f\u0290\5\u008aF\2\u0290\u0296\3" +
                    "\2\2\2\u0291\u0292\5\u009cO\2\u0292\u0293\t\3\2\2\u0293\u0294\5\u008a" +
                    "F\2\u0294\u0296\3\2\2\2\u0295\u028d\3\2\2\2\u0295\u0291\3\2\2\2\u0296" +
                    "u\3\2\2\2\u0297\u0298\5\u009cO\2\u0298\u029b\7\67\2\2\u0299\u029c\5\u008e" +
                    "H\2\u029a\u029c\5\u008aF\2\u029b\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029c" +
                    "w\3\2\2\2\u029d\u029e\5\u009cO\2\u029e\u02a1\7+\2\2\u029f\u02a2\5\u008e" +
                    "H\2\u02a0\u02a2\5\u008aF\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2" +
                    "\u02a9\3\2\2\2\u02a3\u02a6\78\2\2\u02a4\u02a7\5\u008eH\2\u02a5\u02a7\5" +
                    "\u008aF\2\u02a6\u02a4\3\2\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02a9\3\2\2\2" +
                    "\u02a8\u029d\3\2\2\2\u02a8\u02a3\3\2\2\2\u02a9y\3\2\2\2\u02aa\u02ab\5" +
                    "\u009cO\2\u02ab\u02ae\7,\2\2\u02ac\u02af\5\u008eH\2\u02ad\u02af\5\u008a" +
                    "F\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b6\3\2\2\2\u02b0" +
                    "\u02b3\79\2\2\u02b1\u02b4\5\u008eH\2\u02b2\u02b4\5\u008aF\2\u02b3\u02b1" +
                    "\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02aa\3\2\2\2\u02b5" +
                    "\u02b0\3\2\2\2\u02b6{\3\2\2\2\u02b7\u02b8\5\u009cO\2\u02b8\u02b9\7\67" +
                    "\2\2\u02b9\u02ba\5\u0090I\2\u02ba\u02c0\3\2\2\2\u02bb\u02bc\5\u009cO\2" +
                    "\u02bc\u02bd\t\3\2\2\u02bd\u02be\5\u0090I\2\u02be\u02c0\3\2\2\2\u02bf" +
                    "\u02b7\3\2\2\2\u02bf\u02bb\3\2\2\2\u02c0}\3\2\2\2\u02c1\u02c2\5\u009c" +
                    "O\2\u02c2\u02c3\7\67\2\2\u02c3\u02c4\5\u0092J\2\u02c4\u02ca\3\2\2\2\u02c5" +
                    "\u02c6\5\u009cO\2\u02c6\u02c7\78\2\2\u02c7\u02c8\5\u0092J\2\u02c8\u02ca" +
                    "\3\2\2\2\u02c9\u02c1\3\2\2\2\u02c9\u02c5\3\2\2\2\u02ca\177\3\2\2\2\u02cb" +
                    "\u02cc\5\u009cO\2\u02cc\u02cd\7\67\2\2\u02cd\u02ce\7J\2\2\u02ce\u02cf" +
                    "\7K\2\2\u02cf\u0081\3\2\2\2\u02d0\u02d1\5\u0088E\2\u02d1\u02d2\7\67\2" +
                    "\2\u02d2\u02d3\5R*\2\u02d3\u0083\3\2\2\2\u02d4\u02d5\7J\2\2\u02d5\u02d6" +
                    "\5\u0086D\2\u02d6\u02d7\7K\2\2\u02d7\u0085\3\2\2\2\u02d8\u02db\bD\1\2" +
                    "\u02d9\u02dc\5\u008eH\2\u02da\u02dc\5\u008aF\2\u02db\u02d9\3\2\2\2\u02db" +
                    "\u02da\3\2\2\2\u02dc\u02e5\3\2\2\2\u02dd\u02de\f\3\2\2\u02de\u02e1\7\4" +
                    "\2\2\u02df\u02e2\5\u008eH\2\u02e0\u02e2\5\u008aF\2\u02e1\u02df\3\2\2\2" +
                    "\u02e1\u02e0\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02dd\3\2\2\2\u02e4\u02e7" +
                    "\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u0087\3\2\2\2\u02e7" +
                    "\u02e5\3\2\2\2\u02e8\u02e9\5\u00acW\2\u02e9\u02ec\7J\2\2\u02ea\u02ed\5" +
                    "\u008eH\2\u02eb\u02ed\5\u008aF\2\u02ec\u02ea\3\2\2\2\u02ec\u02eb\3\2\2" +
                    "\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\7K\2\2\u02ef\u02f9\3\2\2\2\u02f0\u02f1" +
                    "\5\u00aeX\2\u02f1\u02f4\7J\2\2\u02f2\u02f5\5\u008eH\2\u02f3\u02f5\5\u008a" +
                    "F\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6" +
                    "\u02f7\7K\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02e8\3\2\2\2\u02f8\u02f0\3\2" +
                    "\2\2\u02f9\u0089\3\2\2\2\u02fa\u02fb\bF\1\2\u02fb\u02fc\5\u008eH\2\u02fc" +
                    "\u02fd\t\4\2\2\u02fd\u02fe\5\u008aF\17\u02fe\u0315\3\2\2\2\u02ff\u0300" +
                    "\5\u0090I\2\u0300\u0301\t\4\2\2\u0301\u0302\5\u008aF\r\u0302\u0315\3\2" +
                    "\2\2\u0303\u0304\5\u0092J\2\u0304\u0305\7-\2\2\u0305\u0306\5\u008aF\n" +
                    "\u0306\u0315\3\2\2\2\u0307\u0308\5\u008eH\2\u0308\u0309\t\5\2\2\u0309" +
                    "\u030a\5\u008aF\b\u030a\u0315\3\2\2\2\u030b\u030c\5\u0090I\2\u030c\u030d" +
                    "\t\5\2\2\u030d\u030e\5\u008aF\6\u030e\u0315\3\2\2\2\u030f\u0310\7H\2\2" +
                    "\u0310\u0311\5\u008aF\2\u0311\u0312\7I\2\2\u0312\u0315\3\2\2\2\u0313\u0315" +
                    "\5\u008cG\2\u0314\u02fa\3\2\2\2\u0314\u02ff\3\2\2\2\u0314\u0303\3\2\2" +
                    "\2\u0314\u0307\3\2\2\2\u0314\u030b\3\2\2\2\u0314\u030f\3\2\2\2\u0314\u0313" +
                    "\3\2\2\2\u0315\u032d\3\2\2\2\u0316\u0317\f\f\2\2\u0317\u0318\t\4\2\2\u0318" +
                    "\u032c\5\u008aF\r\u0319\u031a\f\5\2\2\u031a\u031b\t\5\2\2\u031b\u032c" +
                    "\5\u008aF\6\u031c\u031d\f\20\2\2\u031d\u031e\t\4\2\2\u031e\u032c\5\u008e" +
                    "H\2\u031f\u0320\f\16\2\2\u0320\u0321\t\4\2\2\u0321\u032c\5\u0090I\2\u0322" +
                    "\u0323\f\13\2\2\u0323\u0324\7-\2\2\u0324\u032c\5\u0092J\2\u0325\u0326" +
                    "\f\t\2\2\u0326\u0327\t\5\2\2\u0327\u032c\5\u008eH\2\u0328\u0329\f\7\2" +
                    "\2\u0329\u032a\t\5\2\2\u032a\u032c\5\u0090I\2\u032b\u0316\3\2\2\2\u032b" +
                    "\u0319\3\2\2\2\u032b\u031c\3\2\2\2\u032b\u031f\3\2\2\2\u032b\u0322\3\2" +
                    "\2\2\u032b\u0325\3\2\2\2\u032b\u0328\3\2\2\2\u032c\u032f\3\2\2\2\u032d" +
                    "\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u008b\3\2\2\2\u032f\u032d\3\2" +
                    "\2\2\u0330\u0334\5\u00acW\2\u0331\u0334\5P)\2\u0332\u0334\5\u0088E\2\u0333" +
                    "\u0330\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0332\3\2\2\2\u0334\u008d\3\2" +
                    "\2\2\u0335\u0336\bH\1\2\u0336\u0337\7H\2\2\u0337\u0338\5\u008eH\2\u0338" +
                    "\u0339\7I\2\2\u0339\u033c\3\2\2\2\u033a\u033c\5\u00a6T\2\u033b\u0335\3" +
                    "\2\2\2\u033b\u033a\3\2\2\2\u033c\u0345\3\2\2\2\u033d\u033e\f\6\2\2\u033e" +
                    "\u033f\t\4\2\2\u033f\u0344\5\u008eH\7\u0340\u0341\f\5\2\2\u0341\u0342" +
                    "\t\5\2\2\u0342\u0344\5\u008eH\6\u0343\u033d\3\2\2\2\u0343\u0340\3\2\2" +
                    "\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u008f" +
                    "\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u0349\bI\1\2\u0349\u034a\5\u008eH\2" +
                    "\u034a\u034b\t\4\2\2\u034b\u034c\5\u0090I\t\u034c\u0357\3\2\2\2\u034d" +
                    "\u034e\5\u008eH\2\u034e\u034f\t\5\2\2\u034f\u0350\5\u0090I\6\u0350\u0357" +
                    "\3\2\2\2\u0351\u0352\7H\2\2\u0352\u0353\5\u0090I\2\u0353\u0354\7I\2\2" +
                    "\u0354\u0357\3\2\2\2\u0355\u0357\5\u00a4S\2\u0356\u0348\3\2\2\2\u0356" +
                    "\u034d\3\2\2\2\u0356\u0351\3\2\2\2\u0356\u0355\3\2\2\2\u0357\u0366\3\2" +
                    "\2\2\u0358\u0359\f\n\2\2\u0359\u035a\t\4\2\2\u035a\u0365\5\u0090I\13\u035b" +
                    "\u035c\f\7\2\2\u035c\u035d\t\5\2\2\u035d\u0365\5\u0090I\b\u035e\u035f" +
                    "\f\b\2\2\u035f\u0360\t\4\2\2\u0360\u0365\5\u008eH\2\u0361\u0362\f\5\2" +
                    "\2\u0362\u0363\t\5\2\2\u0363\u0365\5\u008eH\2\u0364\u0358\3\2\2\2\u0364" +
                    "\u035b\3\2\2\2\u0364\u035e\3\2\2\2\u0364\u0361\3\2\2\2\u0365\u0368\3\2" +
                    "\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0091\3\2\2\2\u0368" +
                    "\u0366\3\2\2\2\u0369\u036a\bJ\1\2\u036a\u036b\5\u008eH\2\u036b\u036c\7" +
                    "-\2\2\u036c\u036d\5\u0092J\5\u036d\u0370\3\2\2\2\u036e\u0370\5\u00a2R" +
                    "\2\u036f\u0369\3\2\2\2\u036f\u036e\3\2\2\2\u0370\u0379\3\2\2\2\u0371\u0372" +
                    "\f\4\2\2\u0372\u0373\7+\2\2\u0373\u0378\5\u0092J\5\u0374\u0375\f\6\2\2" +
                    "\u0375\u0376\7-\2\2\u0376\u0378\5\u008eH\2\u0377\u0371\3\2\2\2\u0377\u0374" +
                    "\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a" +
                    "\u0093\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u037d\5\u0098M\2\u037d\u037e" +
                    "\7>\2\2\u037e\u037f\5\u0094K\2\u037f\u0393\3\2\2\2\u0380\u0381\5\u0098" +
                    "M\2\u0381\u0382\7D\2\2\u0382\u0383\5\u0094K\2\u0383\u0393\3\2\2\2\u0384" +
                    "\u0385\5\u0098M\2\u0385\u0386\7?\2\2\u0386\u0387\5\u0094K\2\u0387\u0393" +
                    "\3\2\2\2\u0388\u0389\5\u0098M\2\u0389\u038a\7E\2\2\u038a\u038b\5\u0094" +
                    "K\2\u038b\u0393\3\2\2\2\u038c\u038d\7H\2\2\u038d\u038e\5\u0094K\2\u038e" +
                    "\u038f\7I\2\2\u038f\u0393\3\2\2\2\u0390\u0393\5\u0098M\2\u0391\u0393\5" +
                    "\u0096L\2\u0392\u037c\3\2\2\2\u0392\u0380\3\2\2\2\u0392\u0384\3\2\2\2" +
                    "\u0392\u0388\3\2\2\2\u0392\u038c\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0391" +
                    "\3\2\2\2\u0393\u0095\3\2\2\2\u0394\u0395\7R\2\2\u0395\u0396\7G\2\2\u0396" +
                    "\u0397\5\u00aaV\2\u0397\u0097\3\2\2\2\u0398\u0399\5\u009aN\2\u0399\u039a" +
                    "\t\6\2\2\u039a\u039b\5\u009aN\2\u039b\u03a1\3\2\2\2\u039c\u039d\5\u009a" +
                    "N\2\u039d\u039e\t\7\2\2\u039e\u039f\5\u009aN\2\u039f\u03a1\3\2\2\2\u03a0" +
                    "\u0398\3\2\2\2\u03a0\u039c\3\2\2\2\u03a1\u0099\3\2\2\2\u03a2\u03a6\5R" +
                    "*\2\u03a3\u03a6\5\u0088E\2\u03a4\u03a6\5\u009cO\2\u03a5\u03a2\3\2\2\2" +
                    "\u03a5\u03a3\3\2\2\2\u03a5\u03a4\3\2\2\2\u03a6\u009b\3\2\2\2\u03a7\u03a8" +
                    "\5\b\5\2\u03a8\u03a9\7G\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a7\3\2\2\2\u03aa" +
                    "\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b0\5\u00acW\2\u03ad\u03b0" +
                    "\5\u00acW\2\u03ae\u03b0\5\u00aeX\2\u03af\u03aa\3\2\2\2\u03af\u03ad\3\2" +
                    "\2\2\u03af\u03ae\3\2\2\2\u03b0\u009d\3\2\2\2\u03b1\u03b2\bP\1\2\u03b2" +
                    "\u03b3\t\b\2\2\u03b3\u03cc\5\u009eP\f\u03b4\u03cc\5\u009cO\2\u03b5\u03cc" +
                    "\5\u0080A\2\u03b6\u03cc\5\u0082B\2\u03b7\u03cc\5\u008eH\2\u03b8\u03cc" +
                    "\5\u0090I\2\u03b9\u03cc\5\u0092J\2\u03ba\u03cc\5\22\n\2\u03bb\u03cc\5" +
                    "\20\t\2\u03bc\u03cc\5t;\2\u03bd\u03cc\5~@\2\u03be\u03cc\5|?\2\u03bf\u03cc" +
                    "\5v<\2\u03c0\u03cc\5p9\2\u03c1\u03cc\5D#\2\u03c2\u03cc\5\u00a2R\2\u03c3" +
                    "\u03cc\5\u00a8U\2\u03c4\u03cc\5\u00a4S\2\u03c5\u03cc\5\u00a6T\2\u03c6" +
                    "\u03cc\5\u00aaV\2\u03c7\u03c8\7H\2\2\u03c8\u03c9\5\u009eP\2\u03c9\u03ca" +
                    "\7I\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03b1\3\2\2\2\u03cb\u03b4\3\2\2\2\u03cb" +
                    "\u03b5\3\2\2\2\u03cb\u03b6\3\2\2\2\u03cb\u03b7\3\2\2\2\u03cb\u03b8\3\2" +
                    "\2\2\u03cb\u03b9\3\2\2\2\u03cb\u03ba\3\2\2\2\u03cb\u03bb\3\2\2\2\u03cb" +
                    "\u03bc\3\2\2\2\u03cb\u03bd\3\2\2\2\u03cb\u03be\3\2\2\2\u03cb\u03bf\3\2" +
                    "\2\2\u03cb\u03c0\3\2\2\2\u03cb\u03c1\3\2\2\2\u03cb\u03c2\3\2\2\2\u03cb" +
                    "\u03c3\3\2\2\2\u03cb\u03c4\3\2\2\2\u03cb\u03c5\3\2\2\2\u03cb\u03c6\3\2" +
                    "\2\2\u03cb\u03c7\3\2\2\2\u03cc\u03ea\3\2\2\2\u03cd\u03ce\f\r\2\2\u03ce" +
                    "\u03cf\7\60\2\2\u03cf\u03e9\5\u009eP\16\u03d0\u03d1\f\13\2\2\u03d1\u03d2" +
                    "\t\4\2\2\u03d2\u03e9\5\u009eP\f\u03d3\u03d4\f\n\2\2\u03d4\u03d5\t\5\2" +
                    "\2\u03d5\u03e9\5\u009eP\13\u03d6\u03d7\f\t\2\2\u03d7\u03d8\t\t\2\2\u03d8" +
                    "\u03e9\5\u009eP\n\u03d9\u03da\f\b\2\2\u03da\u03db\7>\2\2\u03db\u03e9\5" +
                    "\u009eP\t\u03dc\u03dd\f\7\2\2\u03dd\u03de\t\n\2\2\u03de\u03e9\5\u009e" +
                    "P\b\u03df\u03e0\f\6\2\2\u03e0\u03e1\t\6\2\2\u03e1\u03e9\5\u009eP\7\u03e2" +
                    "\u03e3\f\5\2\2\u03e3\u03e4\t\7\2\2\u03e4\u03e9\5\u009eP\6\u03e5\u03e6" +
                    "\f\4\2\2\u03e6\u03e7\t\13\2\2\u03e7\u03e9\5\u009eP\5\u03e8\u03cd\3\2\2" +
                    "\2\u03e8\u03d0\3\2\2\2\u03e8\u03d3\3\2\2\2\u03e8\u03d6\3\2\2\2\u03e8\u03d9" +
                    "\3\2\2\2\u03e8\u03dc\3\2\2\2\u03e8\u03df\3\2\2\2\u03e8\u03e2\3\2\2\2\u03e8" +
                    "\u03e5\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2" +
                    "\2\2\u03eb\u009f\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03ee\7)\2\2\u03ee" +
                    "\u00a1\3\2\2\2\u03ef\u03f0\7\3\2\2\u03f0\u00a3\3\2\2\2\u03f1\u03f2\7Q" +
                    "\2\2\u03f2\u00a5\3\2\2\2\u03f3\u03f4\7P\2\2\u03f4\u00a7\3\2\2\2\u03f5" +
                    "\u03f6\t\f\2\2\u03f6\u00a9\3\2\2\2\u03f7\u03f8\7L\2\2\u03f8\u00ab\3\2" +
                    "\2\2\u03f9\u03fa\7R\2\2\u03fa\u00ad\3\2\2\2\u03fb\u03fc\7S\2\2\u03fc\u00af" +
                    "\3\2\2\2\u03fd\u03fe\7R\2\2\u03fe\u03ff\7G\2\2\u03ff\u0406\7R\2\2\u0400" +
                    "\u0401\7\31\2\2\u0401\u0403\7G\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2" +
                    "\2\2\u0403\u0404\3\2\2\2\u0404\u0406\t\r\2\2\u0405\u03fd\3\2\2\2\u0405" +
                    "\u0402\3\2\2\2\u0406\u00b1\3\2\2\2\u0407\u0408\bZ\1\2\u0408\u040b\7\5" +
                    "\2\2\u0409\u040b\5\u00b6\\\2\u040a\u0407\3\2\2\2\u040a\u0409\3\2\2\2\u040b" +
                    "\u0412\3\2\2\2\u040c\u040d\f\6\2\2\u040d\u0411\7\5\2\2\u040e\u040f\f\5" +
                    "\2\2\u040f\u0411\5\u00b6\\\2\u0410\u040c\3\2\2\2\u0410\u040e\3\2\2\2\u0411" +
                    "\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u00b3\3\2" +
                    "\2\2\u0414\u0412\3\2\2\2\u0415\u0416\7$\2\2\u0416\u00b5\3\2\2\2\u0417" +
                    "\u0418\7\6\2\2\u0418\u00b7\3\2\2\2T\u00bc\u00c1\u00cf\u00d7\u00db\u00ef" +
                    "\u010e\u0114\u0124\u012c\u013a\u013e\u0148\u014d\u0157\u0165\u016d\u0178" +
                    "\u0189\u0195\u01a5\u01ae\u01b3\u01b9\u01c1\u01cd\u01cf\u01e6\u01fe\u0218" +
                    "\u0236\u023e\u0248\u0257\u0262\u026a\u0277\u0279\u0280\u028b\u0295\u029b" +
                    "\u02a1\u02a6\u02a8\u02ae\u02b3\u02b5\u02bf\u02c9\u02db\u02e1\u02e5\u02ec" +
                    "\u02f4\u02f8\u0314\u032b\u032d\u0333\u033b\u0343\u0345\u0356\u0364\u0366" +
                    "\u036f\u0377\u0379\u0392\u03a0\u03a5\u03aa\u03af\u03cb\u03e8\u03ea\u0402" +
                    "\u0405\u040a\u0410\u0412";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}