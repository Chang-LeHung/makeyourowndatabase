// Generated from /Users/huchang/IdeaProjects/makeyourdatabase/src/main/java/sql/evaluator/Evaluator.g4 by ANTLR 4.10.1
package sql.evaluator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EvaluatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, MUL=11, DIV=12, ADD=13, SUB=14, AND=15, OR=16, ID=17, INT=18, 
		FLOAT=19, NEWLINE=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "MUL", "DIV", "ADD", "SUB", "AND", "OR", "ID", "INT", "FLOAT", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"','", "'*'", "'/'", "'+'", "'-'", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "MUL", 
			"DIV", "ADD", "SUB", "AND", "OR", "ID", "INT", "FLOAT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public EvaluatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Evaluator.g4"; }

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
		"\u0004\u0000\u0015\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010T\b\u0010\u000b\u0010\f\u0010U\u0001\u0011\u0001\u0011\u0005"+
		"\u0011Z\b\u0011\n\u0011\f\u0011]\t\u0011\u0001\u0012\u0001\u0012\u0004"+
		"\u0012a\b\u0012\u000b\u0012\f\u0012b\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0004\u0012i\b\u0012\u000b\u0012\f\u0012j\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0004\u0012p\b\u0012\u000b\u0012\f\u0012q\u0003\u0012"+
		"t\b\u0012\u0001\u0013\u0003\u0013w\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0004\u0014|\b\u0014\u000b\u0014\f\u0014}\u0001\u0014\u0001\u0014"+
		"\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u000019\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u0089\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000"+
		"\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t"+
		"3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r8\u0001\u0000"+
		"\u0000\u0000\u000f;\u0001\u0000\u0000\u0000\u0011>\u0001\u0000\u0000\u0000"+
		"\u0013A\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017E"+
		"\u0001\u0000\u0000\u0000\u0019G\u0001\u0000\u0000\u0000\u001bI\u0001\u0000"+
		"\u0000\u0000\u001dK\u0001\u0000\u0000\u0000\u001fO\u0001\u0000\u0000\u0000"+
		"!S\u0001\u0000\u0000\u0000#W\u0001\u0000\u0000\u0000%s\u0001\u0000\u0000"+
		"\u0000\'v\u0001\u0000\u0000\u0000){\u0001\u0000\u0000\u0000+,\u0005(\u0000"+
		"\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\u0004\u0001"+
		"\u0000\u0000\u0000/0\u0005!\u0000\u00000\u0006\u0001\u0000\u0000\u0000"+
		"12\u0005>\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005<\u0000\u0000"+
		"4\n\u0001\u0000\u0000\u000056\u0005>\u0000\u000067\u0005=\u0000\u0000"+
		"7\f\u0001\u0000\u0000\u000089\u0005<\u0000\u00009:\u0005=\u0000\u0000"+
		":\u000e\u0001\u0000\u0000\u0000;<\u0005=\u0000\u0000<=\u0005=\u0000\u0000"+
		"=\u0010\u0001\u0000\u0000\u0000>?\u0005!\u0000\u0000?@\u0005=\u0000\u0000"+
		"@\u0012\u0001\u0000\u0000\u0000AB\u0005,\u0000\u0000B\u0014\u0001\u0000"+
		"\u0000\u0000CD\u0005*\u0000\u0000D\u0016\u0001\u0000\u0000\u0000EF\u0005"+
		"/\u0000\u0000F\u0018\u0001\u0000\u0000\u0000GH\u0005+\u0000\u0000H\u001a"+
		"\u0001\u0000\u0000\u0000IJ\u0005-\u0000\u0000J\u001c\u0001\u0000\u0000"+
		"\u0000KL\u0005a\u0000\u0000LM\u0005n\u0000\u0000MN\u0005d\u0000\u0000"+
		"N\u001e\u0001\u0000\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005r\u0000\u0000"+
		"Q \u0001\u0000\u0000\u0000RT\u0007\u0000\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000V\"\u0001\u0000\u0000\u0000W[\u0007\u0001\u0000\u0000XZ\u0007"+
		"\u0002\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\$\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^`\u0005.\u0000\u0000_a\u0007\u0002\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ct\u0001\u0000\u0000\u0000de\u0005"+
		"0\u0000\u0000ef\u0005.\u0000\u0000fh\u0001\u0000\u0000\u0000gi\u0007\u0002"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kt\u0001\u0000\u0000\u0000"+
		"lm\u0003#\u0011\u0000mo\u0005.\u0000\u0000np\u0007\u0002\u0000\u0000o"+
		"n\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000s^\u0001\u0000"+
		"\u0000\u0000sd\u0001\u0000\u0000\u0000sl\u0001\u0000\u0000\u0000t&\u0001"+
		"\u0000\u0000\u0000uw\u0005\r\u0000\u0000vu\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\n\u0000\u0000y(\u0001"+
		"\u0000\u0000\u0000z|\u0007\u0003\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u0014\u0000\u0000"+
		"\u0080*\u0001\u0000\u0000\u0000\t\u0000U[bjqsv}\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}