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
		T__9=10, T__10=11, MUL=12, DIV=13, ADD=14, SUB=15, AND=16, OR=17, LIKE=18, 
		INT=19, ID=20, FLOAT=21, NEWLINE=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "MUL", "DIV", "ADD", "SUB", "AND", "OR", "LIKE", "INT", 
			"ID", "FLOAT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'!'", "'''", "'\"'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'*'", "'/'", "'+'", "'-'", "'and'", "'or'", "'like'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"MUL", "DIV", "ADD", "SUB", "AND", "OR", "LIKE", "INT", "ID", "FLOAT", 
			"NEWLINE", "WS"
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
		"\u0004\u0000\u0017\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005"+
		"\u0012`\b\u0012\n\u0012\f\u0012c\t\u0012\u0001\u0013\u0004\u0013f\b\u0013"+
		"\u000b\u0013\f\u0013g\u0001\u0014\u0001\u0014\u0004\u0014l\b\u0014\u000b"+
		"\u0014\f\u0014m\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004"+
		"\u0014t\b\u0014\u000b\u0014\f\u0014u\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0004\u0014{\b\u0014\u000b\u0014\f\u0014|\u0003\u0014\u007f\b\u0014\u0001"+
		"\u0015\u0003\u0015\u0082\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004"+
		"\u0016\u0087\b\u0016\u000b\u0016\f\u0016\u0088\u0001\u0016\u0001\u0016"+
		"\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017\u0001\u0000\u0004\u0001\u000019\u0001\u000009\u0004\u0000"+
		"%%AZ__az\u0003\u0000\t\n\r\r  \u0094\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00031\u0001"+
		"\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000"+
		"\u0000\t7\u0001\u0000\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001"+
		"\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011@\u0001\u0000\u0000"+
		"\u0000\u0013C\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017"+
		"I\u0001\u0000\u0000\u0000\u0019K\u0001\u0000\u0000\u0000\u001bM\u0001"+
		"\u0000\u0000\u0000\u001dO\u0001\u0000\u0000\u0000\u001fQ\u0001\u0000\u0000"+
		"\u0000!U\u0001\u0000\u0000\u0000#X\u0001\u0000\u0000\u0000%]\u0001\u0000"+
		"\u0000\u0000\'e\u0001\u0000\u0000\u0000)~\u0001\u0000\u0000\u0000+\u0081"+
		"\u0001\u0000\u0000\u0000-\u0086\u0001\u0000\u0000\u0000/0\u0005(\u0000"+
		"\u00000\u0002\u0001\u0000\u0000\u000012\u0005)\u0000\u00002\u0004\u0001"+
		"\u0000\u0000\u000034\u0005!\u0000\u00004\u0006\u0001\u0000\u0000\u0000"+
		"56\u0005\'\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005\"\u0000\u0000"+
		"8\n\u0001\u0000\u0000\u00009:\u0005>\u0000\u0000:\f\u0001\u0000\u0000"+
		"\u0000;<\u0005<\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005>\u0000"+
		"\u0000>?\u0005=\u0000\u0000?\u0010\u0001\u0000\u0000\u0000@A\u0005<\u0000"+
		"\u0000AB\u0005=\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CD\u0005=\u0000"+
		"\u0000DE\u0005=\u0000\u0000E\u0014\u0001\u0000\u0000\u0000FG\u0005!\u0000"+
		"\u0000GH\u0005=\u0000\u0000H\u0016\u0001\u0000\u0000\u0000IJ\u0005*\u0000"+
		"\u0000J\u0018\u0001\u0000\u0000\u0000KL\u0005/\u0000\u0000L\u001a\u0001"+
		"\u0000\u0000\u0000MN\u0005+\u0000\u0000N\u001c\u0001\u0000\u0000\u0000"+
		"OP\u0005-\u0000\u0000P\u001e\u0001\u0000\u0000\u0000QR\u0005a\u0000\u0000"+
		"RS\u0005n\u0000\u0000ST\u0005d\u0000\u0000T \u0001\u0000\u0000\u0000U"+
		"V\u0005o\u0000\u0000VW\u0005r\u0000\u0000W\"\u0001\u0000\u0000\u0000X"+
		"Y\u0005l\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005k\u0000\u0000[\\\u0005"+
		"e\u0000\u0000\\$\u0001\u0000\u0000\u0000]a\u0007\u0000\u0000\u0000^`\u0007"+
		"\u0001\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b&\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000df\u0007\u0002\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000h(\u0001\u0000\u0000\u0000ik\u0005.\u0000\u0000jl\u0007"+
		"\u0001\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u007f\u0001\u0000"+
		"\u0000\u0000op\u00050\u0000\u0000pq\u0005.\u0000\u0000qs\u0001\u0000\u0000"+
		"\u0000rt\u0007\u0001\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u007f"+
		"\u0001\u0000\u0000\u0000wx\u0003%\u0012\u0000xz\u0005.\u0000\u0000y{\u0007"+
		"\u0001\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000"+
		"\u0000\u0000~i\u0001\u0000\u0000\u0000~o\u0001\u0000\u0000\u0000~w\u0001"+
		"\u0000\u0000\u0000\u007f*\u0001\u0000\u0000\u0000\u0080\u0082\u0005\r"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\n\u0000"+
		"\u0000\u0084,\u0001\u0000\u0000\u0000\u0085\u0087\u0007\u0003\u0000\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0006\u0016\u0000\u0000"+
		"\u008b.\u0001\u0000\u0000\u0000\t\u0000agmu|~\u0081\u0088\u0001\u0006"+
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