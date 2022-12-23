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
		T__9=10, T__10=11, T__11=12, MUL=13, DIV=14, ADD=15, SUB=16, AND=17, OR=18, 
		ID=19, INT=20, FLOAT=21, NEWLINE=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "MUL", "DIV", "ADD", "SUB", "AND", "OR", "ID", 
			"INT", "FLOAT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'''", "'\"'", "','", "'*'", "'/'", "'+'", "'-'", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "MUL", "DIV", "ADD", "SUB", "AND", "OR", "ID", "INT", "FLOAT", 
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
		"\u0004\u0000\u0017\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0004\u0012\\\b\u0012\u000b\u0012\f\u0012]\u0001"+
		"\u0013\u0001\u0013\u0005\u0013b\b\u0013\n\u0013\f\u0013e\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0004\u0014i\b\u0014\u000b\u0014\f\u0014j\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014q\b\u0014\u000b\u0014"+
		"\f\u0014r\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014x\b\u0014\u000b"+
		"\u0014\f\u0014y\u0003\u0014|\b\u0014\u0001\u0015\u0003\u0015\u007f\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u0084\b\u0016\u000b\u0016"+
		"\f\u0016\u0085\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0004\u0002"+
		"\u0000AZaz\u0001\u000019\u0001\u000009\u0003\u0000\t\n\r\r  \u0091\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/"+
		"\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00053\u0001\u0000"+
		"\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000"+
		"\u000b9\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000f?\u0001"+
		"\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000"+
		"\u0000\u0015G\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019"+
		"K\u0001\u0000\u0000\u0000\u001bM\u0001\u0000\u0000\u0000\u001dO\u0001"+
		"\u0000\u0000\u0000\u001fQ\u0001\u0000\u0000\u0000!S\u0001\u0000\u0000"+
		"\u0000#W\u0001\u0000\u0000\u0000%[\u0001\u0000\u0000\u0000\'_\u0001\u0000"+
		"\u0000\u0000){\u0001\u0000\u0000\u0000+~\u0001\u0000\u0000\u0000-\u0083"+
		"\u0001\u0000\u0000\u0000/0\u0005(\u0000\u00000\u0002\u0001\u0000\u0000"+
		"\u000012\u0005)\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005!\u0000"+
		"\u00004\u0006\u0001\u0000\u0000\u000056\u0005>\u0000\u00006\b\u0001\u0000"+
		"\u0000\u000078\u0005<\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005>"+
		"\u0000\u0000:;\u0005=\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005<"+
		"\u0000\u0000=>\u0005=\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005"+
		"=\u0000\u0000@A\u0005=\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005"+
		"!\u0000\u0000CD\u0005=\u0000\u0000D\u0012\u0001\u0000\u0000\u0000EF\u0005"+
		"\'\u0000\u0000F\u0014\u0001\u0000\u0000\u0000GH\u0005\"\u0000\u0000H\u0016"+
		"\u0001\u0000\u0000\u0000IJ\u0005,\u0000\u0000J\u0018\u0001\u0000\u0000"+
		"\u0000KL\u0005*\u0000\u0000L\u001a\u0001\u0000\u0000\u0000MN\u0005/\u0000"+
		"\u0000N\u001c\u0001\u0000\u0000\u0000OP\u0005+\u0000\u0000P\u001e\u0001"+
		"\u0000\u0000\u0000QR\u0005-\u0000\u0000R \u0001\u0000\u0000\u0000ST\u0005"+
		"a\u0000\u0000TU\u0005n\u0000\u0000UV\u0005d\u0000\u0000V\"\u0001\u0000"+
		"\u0000\u0000WX\u0005o\u0000\u0000XY\u0005r\u0000\u0000Y$\u0001\u0000\u0000"+
		"\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^&\u0001"+
		"\u0000\u0000\u0000_c\u0007\u0001\u0000\u0000`b\u0007\u0002\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000d(\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fh\u0005.\u0000\u0000gi\u0007\u0002\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000k|\u0001\u0000\u0000\u0000lm\u00050\u0000\u0000mn\u0005"+
		".\u0000\u0000np\u0001\u0000\u0000\u0000oq\u0007\u0002\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000s|\u0001\u0000\u0000\u0000tu\u0003\'\u0013\u0000"+
		"uw\u0005.\u0000\u0000vx\u0007\u0002\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{f\u0001\u0000\u0000\u0000{l\u0001\u0000"+
		"\u0000\u0000{t\u0001\u0000\u0000\u0000|*\u0001\u0000\u0000\u0000}\u007f"+
		"\u0005\r\u0000\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005\n\u0000\u0000"+
		"\u0081,\u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0003\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u0016\u0000\u0000\u0088"+
		".\u0001\u0000\u0000\u0000\t\u0000]cjry{~\u0085\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}