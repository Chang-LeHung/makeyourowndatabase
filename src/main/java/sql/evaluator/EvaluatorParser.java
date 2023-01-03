// Generated from /Users/huchang/IdeaProjects/makeyourdatabase/src/main/java/sql/evaluator/Evaluator.g4 by ANTLR 4.10.1
package sql.evaluator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EvaluatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MUL=12, DIV=13, ADD=14, SUB=15, AND=16, OR=17, LIKE=18, 
		INT=19, ID=20, FLOAT=21, NEWLINE=22, WS=23;
	public static final int
		RULE_conditions = 0, RULE_condition = 1, RULE_expression = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"conditions", "condition", "expression"
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

	@Override
	public String getGrammarFileName() { return "Evaluator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EvaluatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	 
		public ConditionsContext() { }
		public void copyFrom(ConditionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ConditionsContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public NotContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ConditionsContext {
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public TerminalNode OR() { return getToken(EvaluatorParser.OR, 0); }
		public OrContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleContext extends ConditionsContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SingleContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensConditionContext extends ConditionsContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ParensConditionContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterParensCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitParensCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitParensCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ConditionsContext {
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public TerminalNode AND() { return getToken(EvaluatorParser.AND, 0); }
		public AndContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		return conditions(0);
	}

	private ConditionsContext conditions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionsContext _localctx = new ConditionsContext(_ctx, _parentState);
		ConditionsContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_conditions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new SingleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(7);
				condition();
				}
				break;
			case 2:
				{
				_localctx = new ParensConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(8);
				match(T__0);
				setState(9);
				conditions(0);
				setState(10);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				match(T__2);
				setState(13);
				conditions(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(24);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(22);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(16);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(17);
						match(AND);
						setState(18);
						conditions(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(19);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(20);
						match(OR);
						setState(21);
						conditions(3);
						}
						break;
					}
					} 
				}
				setState(26);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LikeSingleContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(EvaluatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EvaluatorParser.ID, i);
		}
		public TerminalNode LIKE() { return getToken(EvaluatorParser.LIKE, 0); }
		public LikeSingleContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterLikeSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitLikeSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitLikeSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeDoubleContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(EvaluatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EvaluatorParser.ID, i);
		}
		public TerminalNode LIKE() { return getToken(EvaluatorParser.LIKE, 0); }
		public LikeDoubleContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterLikeDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitLikeDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitLikeDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(EvaluatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EvaluatorParser.ID, i);
		}
		public TerminalNode LIKE() { return getToken(EvaluatorParser.LIKE, 0); }
		public LikeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LtContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GtContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NEqualContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NEqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterNEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitNEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitNEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_condition);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new LikeSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(ID);
				setState(28);
				match(LIKE);
				setState(29);
				match(T__3);
				setState(30);
				match(ID);
				setState(31);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new LikeDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(ID);
				setState(33);
				match(LIKE);
				setState(34);
				match(T__4);
				setState(35);
				match(ID);
				setState(36);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(ID);
				setState(38);
				match(LIKE);
				setState(39);
				match(ID);
				}
				break;
			case 4:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				expression(0);
				setState(41);
				match(T__5);
				setState(42);
				expression(0);
				}
				break;
			case 5:
				_localctx = new LtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				expression(0);
				setState(45);
				match(T__6);
				setState(46);
				expression(0);
				}
				break;
			case 6:
				_localctx = new GeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				expression(0);
				setState(49);
				match(T__7);
				setState(50);
				expression(0);
				}
				break;
			case 7:
				_localctx = new LeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				expression(0);
				setState(53);
				match(T__8);
				setState(54);
				expression(0);
				}
				break;
			case 8:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				expression(0);
				setState(57);
				match(T__9);
				setState(58);
				expression(0);
				}
				break;
			case 9:
				_localctx = new NEqualContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				expression(0);
				setState(61);
				match(T__10);
				setState(62);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(EvaluatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EvaluatorParser.ID, i);
		}
		public FunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleStringContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(EvaluatorParser.ID, 0); }
		public SingleStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterSingleString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitSingleString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitSingleString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NIntContext extends ExpressionContext {
		public TerminalNode SUB() { return getToken(EvaluatorParser.SUB, 0); }
		public TerminalNode INT() { return getToken(EvaluatorParser.INT, 0); }
		public NIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterNInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitNInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitNInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(EvaluatorParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(EvaluatorParser.DIV, 0); }
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(EvaluatorParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(EvaluatorParser.SUB, 0); }
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleStringContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(EvaluatorParser.ID, 0); }
		public DoubleStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterDoubleString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitDoubleString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitDoubleString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NFloatContext extends ExpressionContext {
		public TerminalNode SUB() { return getToken(EvaluatorParser.SUB, 0); }
		public TerminalNode FLOAT() { return getToken(EvaluatorParser.FLOAT, 0); }
		public NFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterNFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitNFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitNFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PIntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(EvaluatorParser.INT, 0); }
		public PIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterPInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitPInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitPInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(EvaluatorParser.ID, 0); }
		public IDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PFloatContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(EvaluatorParser.FLOAT, 0); }
		public PFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).enterPFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaluatorListener ) ((EvaluatorListener)listener).exitPFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaluatorVisitor ) return ((EvaluatorVisitor<? extends T>)visitor).visitPFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new PIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(67);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new NIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(SUB);
				setState(69);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new SingleStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(T__3);
				setState(72);
				match(ID);
				setState(73);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new DoubleStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(T__4);
				setState(75);
				match(ID);
				setState(76);
				match(T__4);
				}
				break;
			case 6:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(ID);
				setState(78);
				match(T__0);
				setState(79);
				match(ID);
				setState(80);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(T__0);
				setState(82);
				expression(0);
				setState(83);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new PFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(FLOAT);
				}
				break;
			case 9:
				{
				_localctx = new NFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(SUB);
				setState(87);
				match(FLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(91);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(94);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 0:
			return conditions_sempred((ConditionsContext)_localctx, predIndex);
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditions_sempred(ConditionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000f\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"A\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"Y\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002a\b\u0002\n\u0002\f\u0002d\t\u0002\u0001\u0002"+
		"\u0000\u0002\u0000\u0004\u0003\u0000\u0002\u0004\u0000\u0002\u0001\u0000"+
		"\f\r\u0001\u0000\u000e\u000fx\u0000\u000e\u0001\u0000\u0000\u0000\u0002"+
		"@\u0001\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006\u0007\u0006"+
		"\u0000\uffff\uffff\u0000\u0007\u000f\u0003\u0002\u0001\u0000\b\t\u0005"+
		"\u0001\u0000\u0000\t\n\u0003\u0000\u0000\u0000\n\u000b\u0005\u0002\u0000"+
		"\u0000\u000b\u000f\u0001\u0000\u0000\u0000\f\r\u0005\u0003\u0000\u0000"+
		"\r\u000f\u0003\u0000\u0000\u0001\u000e\u0006\u0001\u0000\u0000\u0000\u000e"+
		"\b\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000f\u0018"+
		"\u0001\u0000\u0000\u0000\u0010\u0011\n\u0003\u0000\u0000\u0011\u0012\u0005"+
		"\u0010\u0000\u0000\u0012\u0017\u0003\u0000\u0000\u0004\u0013\u0014\n\u0002"+
		"\u0000\u0000\u0014\u0015\u0005\u0011\u0000\u0000\u0015\u0017\u0003\u0000"+
		"\u0000\u0003\u0016\u0010\u0001\u0000\u0000\u0000\u0016\u0013\u0001\u0000"+
		"\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0001\u0001\u0000"+
		"\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0014"+
		"\u0000\u0000\u001c\u001d\u0005\u0012\u0000\u0000\u001d\u001e\u0005\u0004"+
		"\u0000\u0000\u001e\u001f\u0005\u0014\u0000\u0000\u001fA\u0005\u0004\u0000"+
		"\u0000 !\u0005\u0014\u0000\u0000!\"\u0005\u0012\u0000\u0000\"#\u0005\u0005"+
		"\u0000\u0000#$\u0005\u0014\u0000\u0000$A\u0005\u0005\u0000\u0000%&\u0005"+
		"\u0014\u0000\u0000&\'\u0005\u0012\u0000\u0000\'A\u0005\u0014\u0000\u0000"+
		"()\u0003\u0004\u0002\u0000)*\u0005\u0006\u0000\u0000*+\u0003\u0004\u0002"+
		"\u0000+A\u0001\u0000\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0005\u0007"+
		"\u0000\u0000./\u0003\u0004\u0002\u0000/A\u0001\u0000\u0000\u000001\u0003"+
		"\u0004\u0002\u000012\u0005\b\u0000\u000023\u0003\u0004\u0002\u00003A\u0001"+
		"\u0000\u0000\u000045\u0003\u0004\u0002\u000056\u0005\t\u0000\u000067\u0003"+
		"\u0004\u0002\u00007A\u0001\u0000\u0000\u000089\u0003\u0004\u0002\u0000"+
		"9:\u0005\n\u0000\u0000:;\u0003\u0004\u0002\u0000;A\u0001\u0000\u0000\u0000"+
		"<=\u0003\u0004\u0002\u0000=>\u0005\u000b\u0000\u0000>?\u0003\u0004\u0002"+
		"\u0000?A\u0001\u0000\u0000\u0000@\u001b\u0001\u0000\u0000\u0000@ \u0001"+
		"\u0000\u0000\u0000@%\u0001\u0000\u0000\u0000@(\u0001\u0000\u0000\u0000"+
		"@,\u0001\u0000\u0000\u0000@0\u0001\u0000\u0000\u0000@4\u0001\u0000\u0000"+
		"\u0000@8\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000A\u0003\u0001"+
		"\u0000\u0000\u0000BC\u0006\u0002\uffff\uffff\u0000CY\u0005\u0013\u0000"+
		"\u0000DE\u0005\u000f\u0000\u0000EY\u0005\u0013\u0000\u0000FY\u0005\u0014"+
		"\u0000\u0000GH\u0005\u0004\u0000\u0000HI\u0005\u0014\u0000\u0000IY\u0005"+
		"\u0004\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0005\u0014\u0000\u0000"+
		"LY\u0005\u0005\u0000\u0000MN\u0005\u0014\u0000\u0000NO\u0005\u0001\u0000"+
		"\u0000OP\u0005\u0014\u0000\u0000PY\u0005\u0002\u0000\u0000QR\u0005\u0001"+
		"\u0000\u0000RS\u0003\u0004\u0002\u0000ST\u0005\u0002\u0000\u0000TY\u0001"+
		"\u0000\u0000\u0000UY\u0005\u0015\u0000\u0000VW\u0005\u000f\u0000\u0000"+
		"WY\u0005\u0015\u0000\u0000XB\u0001\u0000\u0000\u0000XD\u0001\u0000\u0000"+
		"\u0000XF\u0001\u0000\u0000\u0000XG\u0001\u0000\u0000\u0000XJ\u0001\u0000"+
		"\u0000\u0000XM\u0001\u0000\u0000\u0000XQ\u0001\u0000\u0000\u0000XU\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Yb\u0001\u0000\u0000\u0000"+
		"Z[\n\u000b\u0000\u0000[\\\u0007\u0000\u0000\u0000\\a\u0003\u0004\u0002"+
		"\f]^\n\n\u0000\u0000^_\u0007\u0001\u0000\u0000_a\u0003\u0004\u0002\u000b"+
		"`Z\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0005\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000\u0007\u000e\u0016\u0018@"+
		"X`b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}