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
		T__9=10, T__10=11, MUL=12, DIV=13, ADD=14, SUB=15, AND=16, OR=17, INT=18, 
		ID=19, FLOAT=20, NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "MUL", "DIV", "ADD", "SUB", "AND", "OR", "INT", "ID", 
			"FLOAT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'''", "'\"'", "'*'", "'/'", "'+'", "'-'", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"MUL", "DIV", "ADD", "SUB", "AND", "OR", "INT", "ID", "FLOAT", "NEWLINE", 
			"WS"
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
		"\u0004\u0000\u0016\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011"+
		"Y\b\u0011\n\u0011\f\u0011\\\t\u0011\u0001\u0012\u0004\u0012_\b\u0012\u000b"+
		"\u0012\f\u0012`\u0001\u0013\u0001\u0013\u0004\u0013e\b\u0013\u000b\u0013"+
		"\f\u0013f\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013"+
		"m\b\u0013\u000b\u0013\f\u0013n\u0001\u0013\u0001\u0013\u0001\u0013\u0004"+
		"\u0013t\b\u0013\u000b\u0013\f\u0013u\u0003\u0013x\b\u0013\u0001\u0014"+
		"\u0003\u0014{\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015"+
		"\u0080\b\u0015\u000b\u0015\f\u0015\u0081\u0001\u0015\u0001\u0015\u0000"+
		"\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"\u0001\u0000\u0004\u0001\u000019\u0001\u000009\u0002\u0000AZaz\u0003\u0000"+
		"\t\n\r\r  \u008d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u0003/\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007"+
		"3\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000"+
		"\u0000\u0000\r:\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000"+
		"\u0011@\u0001\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000\u0015E"+
		"\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000\u0000\u0019I\u0001\u0000"+
		"\u0000\u0000\u001bK\u0001\u0000\u0000\u0000\u001dM\u0001\u0000\u0000\u0000"+
		"\u001fO\u0001\u0000\u0000\u0000!S\u0001\u0000\u0000\u0000#V\u0001\u0000"+
		"\u0000\u0000%^\u0001\u0000\u0000\u0000\'w\u0001\u0000\u0000\u0000)z\u0001"+
		"\u0000\u0000\u0000+\u007f\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000"+
		".\u0002\u0001\u0000\u0000\u0000/0\u0005)\u0000\u00000\u0004\u0001\u0000"+
		"\u0000\u000012\u0005!\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005"+
		">\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005<\u0000\u00006\n\u0001"+
		"\u0000\u0000\u000078\u0005>\u0000\u000089\u0005=\u0000\u00009\f\u0001"+
		"\u0000\u0000\u0000:;\u0005<\u0000\u0000;<\u0005=\u0000\u0000<\u000e\u0001"+
		"\u0000\u0000\u0000=>\u0005=\u0000\u0000>?\u0005=\u0000\u0000?\u0010\u0001"+
		"\u0000\u0000\u0000@A\u0005!\u0000\u0000AB\u0005=\u0000\u0000B\u0012\u0001"+
		"\u0000\u0000\u0000CD\u0005\'\u0000\u0000D\u0014\u0001\u0000\u0000\u0000"+
		"EF\u0005\"\u0000\u0000F\u0016\u0001\u0000\u0000\u0000GH\u0005*\u0000\u0000"+
		"H\u0018\u0001\u0000\u0000\u0000IJ\u0005/\u0000\u0000J\u001a\u0001\u0000"+
		"\u0000\u0000KL\u0005+\u0000\u0000L\u001c\u0001\u0000\u0000\u0000MN\u0005"+
		"-\u0000\u0000N\u001e\u0001\u0000\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005"+
		"n\u0000\u0000QR\u0005d\u0000\u0000R \u0001\u0000\u0000\u0000ST\u0005o"+
		"\u0000\u0000TU\u0005r\u0000\u0000U\"\u0001\u0000\u0000\u0000VZ\u0007\u0000"+
		"\u0000\u0000WY\u0007\u0001\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[$\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0007\u0002\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000a&\u0001\u0000\u0000\u0000bd\u0005"+
		".\u0000\u0000ce\u0007\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gx\u0001\u0000\u0000\u0000hi\u00050\u0000\u0000ij\u0005.\u0000\u0000j"+
		"l\u0001\u0000\u0000\u0000km\u0007\u0001\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000ox\u0001\u0000\u0000\u0000pq\u0003#\u0011\u0000qs\u0005.\u0000"+
		"\u0000rt\u0007\u0001\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001"+
		"\u0000\u0000\u0000wb\u0001\u0000\u0000\u0000wh\u0001\u0000\u0000\u0000"+
		"wp\u0001\u0000\u0000\u0000x(\u0001\u0000\u0000\u0000y{\u0005\r\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0005\n\u0000\u0000}*\u0001\u0000\u0000\u0000~\u0080\u0007\u0003"+
		"\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u0015\u0000"+
		"\u0000\u0084,\u0001\u0000\u0000\u0000\t\u0000Z`fnuwz\u0081\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}