// Generated from adsl.g4 by ANTLR 4.5.1
package xpr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class adslLexer extends Lexer {
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
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
            "T__0", "OR", "AT", "UNDER", "COMMA", "SEMICOLON", "CRLF", "COLON", "DOT",
            "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "ACTION", "CLASS", "CREAT", "DEL",
            "ONEOF", "SUBSET", "CC_UNIQUE", "ASSERT", "IF", "FOREACH", "EXTEND", "EMPTY",
            "EQUAL", "NEG", "ISINGROUP", "AND", "IN", "TRY", "ELSE", "ISEMPTY", "RAISE",
            "TRUE", "FALSE", "UNION", "OBRACKET", "CBRACKET", "LEFT_RBRACKET", "RIGHT_RBRACKET",
            "NUMBER", "DIGIT", "STRING", "STRR", "ID_GLOBAL", "ID", "LETTER", "COMMENT",
            "WS"
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


    public adslLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u016e\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3" +
                    "\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\5\bv\n\b\3\b\3\b\3" +
                    "\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3" +
                    "\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3" +
                    "\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3" +
                    "\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3" +
                    "\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3" +
                    "\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3" +
                    "\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3" +
                    "\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3" +
                    "\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"" +
                    "\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&" +
                    "\3\'\3\'\3(\3(\3)\3)\3*\5*\u012b\n*\3*\3*\6*\u012f\n*\r*\16*\u0130\3*" +
                    "\6*\u0134\n*\r*\16*\u0135\3*\3*\7*\u013a\n*\f*\16*\u013d\13*\5*\u013f" +
                    "\n*\5*\u0141\n*\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\7/\u0153" +
                    "\n/\f/\16/\u0156\13/\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u015e\n\61\f\61" +
                    "\16\61\u0161\13\61\3\61\3\61\3\61\3\61\3\61\3\62\6\62\u0169\n\62\r\62" +
                    "\16\62\u016a\3\62\3\62\3\u015f\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n" +
                    "\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30" +
                    "/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W,Y-" +
                    "[.]/_\2a\60c\61\3\2\5\3\2\62;\6\2C\\aac|\u0082\u0101\4\2\13\13\"\"\u0176" +
                    "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2" +
                    "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2" +
                    "\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2" +
                    "\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2" +
                    "\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3" +
                    "\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2" +
                    "\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2" +
                    "W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3" +
                    "\2\2\2\5g\3\2\2\2\7j\3\2\2\2\tm\3\2\2\2\13p\3\2\2\2\rr\3\2\2\2\17u\3\2" +
                    "\2\2\21y\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\177\3\2\2\2\31\u0082\3\2\2" +
                    "\2\33\u0085\3\2\2\2\35\u008c\3\2\2\2\37\u0092\3\2\2\2!\u0099\3\2\2\2#" +
                    "\u00a0\3\2\2\2%\u00a6\3\2\2\2\'\u00ad\3\2\2\2)\u00b7\3\2\2\2+\u00be\3" +
                    "\2\2\2-\u00c1\3\2\2\2/\u00c9\3\2\2\2\61\u00d1\3\2\2\2\63\u00d7\3\2\2\2" +
                    "\65\u00dd\3\2\2\2\67\u00e1\3\2\2\29\u00ed\3\2\2\2;\u00f1\3\2\2\2=\u00f4" +
                    "\3\2\2\2?\u00fd\3\2\2\2A\u0102\3\2\2\2C\u010a\3\2\2\2E\u0110\3\2\2\2G" +
                    "\u0115\3\2\2\2I\u011b\3\2\2\2K\u0121\3\2\2\2M\u0123\3\2\2\2O\u0125\3\2" +
                    "\2\2Q\u0127\3\2\2\2S\u012a\3\2\2\2U\u0142\3\2\2\2W\u0144\3\2\2\2Y\u0148" +
                    "\3\2\2\2[\u014c\3\2\2\2]\u014f\3\2\2\2_\u0157\3\2\2\2a\u0159\3\2\2\2c" +
                    "\u0168\3\2\2\2ef\7,\2\2f\4\3\2\2\2gh\7q\2\2hi\7t\2\2i\6\3\2\2\2jk\7c\2" +
                    "\2kl\7v\2\2l\b\3\2\2\2mn\7a\2\2no\7a\2\2o\n\3\2\2\2pq\7.\2\2q\f\3\2\2" +
                    "\2rs\7=\2\2s\16\3\2\2\2tv\7\17\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\f" +
                    "\2\2x\20\3\2\2\2yz\7<\2\2z\22\3\2\2\2{|\7\60\2\2|\24\3\2\2\2}~\7?\2\2" +
                    "~\26\3\2\2\2\177\u0080\7-\2\2\u0080\u0081\7?\2\2\u0081\30\3\2\2\2\u0082" +
                    "\u0083\7/\2\2\u0083\u0084\7?\2\2\u0084\32\3\2\2\2\u0085\u0086\7c\2\2\u0086" +
                    "\u0087\7e\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2\u0089\u008a\7q\2\2" +
                    "\u008a\u008b\7p\2\2\u008b\34\3\2\2\2\u008c\u008d\7e\2\2\u008d\u008e\7" +
                    "n\2\2\u008e\u008f\7c\2\2\u008f\u0090\7u\2\2\u0090\u0091\7u\2\2\u0091\36" +
                    "\3\2\2\2\u0092\u0093\7e\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095" +
                    "\u0096\7c\2\2\u0096\u0097\7v\2\2\u0097\u0098\7g\2\2\u0098 \3\2\2\2\u0099" +
                    "\u009a\7f\2\2\u009a\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2" +
                    "\u009d\u009e\7v\2\2\u009e\u009f\7g\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7q" +
                    "\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5" +
                    "\7h\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9" +
                    "\7d\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac" +
                    "&\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7a\2\2\u00b0" +
                    "\u00b1\7w\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7s\2\2" +
                    "\u00b4\u00b5\7w\2\2\u00b5\u00b6\7g\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7c\2" +
                    "\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc" +
                    "\7t\2\2\u00bc\u00bd\7v\2\2\u00bd*\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0" +
                    "\7h\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4" +
                    "\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7e\2\2\u00c7" +
                    "\u00c8\7j\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7z\2\2\u00cb" +
                    "\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7f\2\2" +
                    "\u00cf\u00d0\7u\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7" +
                    "o\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7{\2\2\u00d6\62" +
                    "\3\2\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7s\2\2\u00d9\u00da\7w\2\2\u00da" +
                    "\u00db\7c\2\2\u00db\u00dc\7n\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7p\2\2\u00de" +
                    "\u00df\7q\2\2\u00df\u00e0\7v\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2" +
                    "\u00e3\7p\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7g\2\2" +
                    "\u00e6\u00e7\7t\2\2\u00e7\u00e8\7i\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea" +
                    "\7q\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7r\2\2\u00ec8\3\2\2\2\u00ed\u00ee" +
                    "\7c\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7f\2\2\u00f0:\3\2\2\2\u00f1\u00f2" +
                    "\7k\2\2\u00f2\u00f3\7p\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6" +
                    "\7t\2\2\u00f6\u00f7\7{\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7p\2\2\u00f9" +
                    "\u00fa\7g\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7h\2\2\u00fc>\3\2\2\2\u00fd" +
                    "\u00fe\7g\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7g\2\2" +
                    "\u0101@\3\2\2\2\u0102\u0103\7k\2\2\u0103\u0104\7u\2\2\u0104\u0105\7g\2" +
                    "\2\u0105\u0106\7o\2\2\u0106\u0107\7r\2\2\u0107\u0108\7v\2\2\u0108\u0109" +
                    "\7{\2\2\u0109B\3\2\2\2\u010a\u010b\7t\2\2\u010b\u010c\7c\2\2\u010c\u010d" +
                    "\7k\2\2\u010d\u010e\7u\2\2\u010e\u010f\7g\2\2\u010fD\3\2\2\2\u0110\u0111" +
                    "\7v\2\2\u0111\u0112\7t\2\2\u0112\u0113\7w\2\2\u0113\u0114\7g\2\2\u0114" +
                    "F\3\2\2\2\u0115\u0116\7h\2\2\u0116\u0117\7c\2\2\u0117\u0118\7n\2\2\u0118" +
                    "\u0119\7u\2\2\u0119\u011a\7g\2\2\u011aH\3\2\2\2\u011b\u011c\7w\2\2\u011c" +
                    "\u011d\7p\2\2\u011d\u011e\7k\2\2\u011e\u011f\7q\2\2\u011f\u0120\7p\2\2" +
                    "\u0120J\3\2\2\2\u0121\u0122\7}\2\2\u0122L\3\2\2\2\u0123\u0124\7\177\2" +
                    "\2\u0124N\3\2\2\2\u0125\u0126\7*\2\2\u0126P\3\2\2\2\u0127\u0128\7+\2\2" +
                    "\u0128R\3\2\2\2\u0129\u012b\7/\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2" +
                    "\2\2\u012b\u0140\3\2\2\2\u012c\u012e\7\60\2\2\u012d\u012f\5U+\2\u012e" +
                    "\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2" +
                    "\2\2\u0131\u0141\3\2\2\2\u0132\u0134\5U+\2\u0133\u0132\3\2\2\2\u0134\u0135" +
                    "\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013e\3\2\2\2\u0137" +
                    "\u013b\7\60\2\2\u0138\u013a\5U+\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2" +
                    "\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d" +
                    "\u013b\3\2\2\2\u013e\u0137\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2" +
                    "\2\2\u0140\u012c\3\2\2\2\u0140\u0133\3\2\2\2\u0141T\3\2\2\2\u0142\u0143" +
                    "\t\2\2\2\u0143V\3\2\2\2\u0144\u0145\7$\2\2\u0145\u0146\5]/\2\u0146\u0147" +
                    "\7$\2\2\u0147X\3\2\2\2\u0148\u0149\5]/\2\u0149\u014a\7\60\2\2\u014a\u014b" +
                    "\5]/\2\u014bZ\3\2\2\2\u014c\u014d\5]/\2\u014d\u014e\7<\2\2\u014e\\\3\2" +
                    "\2\2\u014f\u0154\5_\60\2\u0150\u0153\5_\60\2\u0151\u0153\5U+\2\u0152\u0150" +
                    "\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154" +
                    "\u0155\3\2\2\2\u0155^\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\t\3\2\2" +
                    "\u0158`\3\2\2\2\u0159\u015a\7\61\2\2\u015a\u015b\7,\2\2\u015b\u015f\3" +
                    "\2\2\2\u015c\u015e\13\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f" +
                    "\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2" +
                    "\2\2\u0162\u0163\7,\2\2\u0163\u0164\7\61\2\2\u0164\u0165\3\2\2\2\u0165" +
                    "\u0166\b\61\2\2\u0166b\3\2\2\2\u0167\u0169\t\4\2\2\u0168\u0167\3\2\2\2" +
                    "\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c" +
                    "\3\2\2\2\u016c\u016d\b\62\2\2\u016dd\3\2\2\2\16\2u\u012a\u0130\u0135\u013b" +
                    "\u013e\u0140\u0152\u0154\u015f\u016a\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}