// Generated from /Users/mnajafza/Downloads/CISE-master/src/main/java/xpr/adsl.g4 by ANTLR 4.7
package xpr;
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LITERAL=2, COMMA=3, SEMICOLON=4, CRLF=5, COLON=6, ASSIGN=7, ACTION=8, 
		CREAT=9, DEL=10, ONEOF=11, SUBSET=12, OBRACKET=13, CBRACKET=14, LEFT_RBRACKET=15, 
		RIGHT_RBRACKET=16, ID=17, ID_GLOBAL=18, ID_ACTION=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "COLON", 
		"ASSIGN", "ACTION", "CREAT", "DEL", "ONEOF", "SUBSET", "OBRACKET", "CBRACKET", 
		"LEFT_RBRACKET", "RIGHT_RBRACKET", "ID", "ID_GLOBAL", "ID_ACTION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'__'", null, "','", "';'", null, "':'", "'='", "'action'", "'create'", 
		"'delete'", "'oneof'", "'subset'", "'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "COLON", "ASSIGN", 
		"ACTION", "CREAT", "DEL", "ONEOF", "SUBSET", "OBRACKET", "CBRACKET", "LEFT_RBRACKET", 
		"RIGHT_RBRACKET", "ID", "ID_GLOBAL", "ID_ACTION"
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
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "adsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\7\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3"+
		"\4\5\4D\n\4\3\5\3\5\3\6\3\6\3\7\5\7K\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23\177\n\23"+
		"\f\23\16\23\u0082\13\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u0090\n\25\4\66?\2\26\3\3\5\2\7\4\t\5\13\6\r\7\17\b"+
		"\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25\3\2"+
		"\6\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\3\2<<\2\u0097\2\3\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\3+\3\2\2\2\5.\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2"+
		"\rJ\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25Y\3\2\2\2\27`\3\2\2"+
		"\2\31g\3\2\2\2\33m\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!x\3\2\2\2#z\3\2\2\2"+
		"%|\3\2\2\2\'\u0083\3\2\2\2)\u008f\3\2\2\2+,\7a\2\2,-\7a\2\2-\4\3\2\2\2"+
		"./\7^\2\2/\60\7$\2\2\60\6\3\2\2\2\61\66\7$\2\2\62\65\5\5\3\2\63\65\n\2"+
		"\2\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\67\3\2\2\2\66\64\3\2\2"+
		"\2\679\3\2\2\28\66\3\2\2\29D\7$\2\2:?\7)\2\2;>\5\5\3\2<>\n\2\2\2=;\3\2"+
		"\2\2=<\3\2\2\2>A\3\2\2\2?@\3\2\2\2?=\3\2\2\2@B\3\2\2\2A?\3\2\2\2BD\7)"+
		"\2\2C\61\3\2\2\2C:\3\2\2\2D\b\3\2\2\2EF\7.\2\2F\n\3\2\2\2GH\7=\2\2H\f"+
		"\3\2\2\2IK\7\17\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\f\2\2M\16\3\2\2"+
		"\2NO\7<\2\2O\20\3\2\2\2PQ\7?\2\2Q\22\3\2\2\2RS\7c\2\2ST\7e\2\2TU\7v\2"+
		"\2UV\7k\2\2VW\7q\2\2WX\7p\2\2X\24\3\2\2\2YZ\7e\2\2Z[\7t\2\2[\\\7g\2\2"+
		"\\]\7c\2\2]^\7v\2\2^_\7g\2\2_\26\3\2\2\2`a\7f\2\2ab\7g\2\2bc\7n\2\2cd"+
		"\7g\2\2de\7v\2\2ef\7g\2\2f\30\3\2\2\2gh\7q\2\2hi\7p\2\2ij\7g\2\2jk\7q"+
		"\2\2kl\7h\2\2l\32\3\2\2\2mn\7u\2\2no\7w\2\2op\7d\2\2pq\7u\2\2qr\7g\2\2"+
		"rs\7v\2\2s\34\3\2\2\2tu\7}\2\2u\36\3\2\2\2vw\7\177\2\2w \3\2\2\2xy\7*"+
		"\2\2y\"\3\2\2\2z{\7+\2\2{$\3\2\2\2|\u0080\t\3\2\2}\177\t\4\2\2~}\3\2\2"+
		"\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081&\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0084\7<\2\2\u0084\u0085\5%\23\2\u0085(\3\2"+
		"\2\2\u0086\u0087\5%\23\2\u0087\u0088\7a\2\2\u0088\u0089\7a\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\5%\23\2\u008b\u0090\3\2\2\2\u008c\u008d\5%\23\2\u008d"+
		"\u008e\t\5\2\2\u008e\u0090\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u008c\3\2"+
		"\2\2\u0090*\3\2\2\2\13\2\64\66=?CJ\u0080\u008f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}