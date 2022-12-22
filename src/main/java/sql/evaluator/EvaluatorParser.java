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
		T__9=10, MUL=11, DIV=12, ADD=13, SUB=14, AND=15, OR=16, ID=17, INT=18, 
		FLOAT=19, NEWLINE=20, WS=21;
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
				_localctx = new ParensConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(7);
				match(T__0);
				setState(8);
				conditions(0);
				setState(9);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(11);
				match(T__2);
				setState(12);
				conditions(2);
				}
				break;
			case 3:
				{
				_localctx = new SingleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				condition();
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
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(17);
						match(AND);
						setState(18);
						conditions(5);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ConditionsContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(19);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(20);
						match(OR);
						setState(21);
						conditions(4);
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				expression(0);
				setState(28);
				match(T__3);
				setState(29);
				expression(0);
				}
				break;
			case 2:
				_localctx = new LtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				expression(0);
				setState(32);
				match(T__4);
				setState(33);
				expression(0);
				}
				break;
			case 3:
				_localctx = new GeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				expression(0);
				setState(36);
				match(T__5);
				setState(37);
				expression(0);
				}
				break;
			case 4:
				_localctx = new LeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				expression(0);
				setState(40);
				match(T__6);
				setState(41);
				expression(0);
				}
				break;
			case 5:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				expression(0);
				setState(44);
				match(T__7);
				setState(45);
				expression(0);
				}
				break;
			case 6:
				_localctx = new NEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				expression(0);
				setState(48);
				match(T__8);
				setState(49);
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
		public TerminalNode ID() { return getToken(EvaluatorParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new PIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new NIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(SUB);
				setState(56);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(ID);
				setState(59);
				match(T__0);
				setState(60);
				expression(0);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(61);
					match(T__9);
					setState(62);
					expression(0);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(T__0);
				setState(71);
				expression(0);
				setState(72);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new PFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(FLOAT);
				}
				break;
			case 7:
				{
				_localctx = new NFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(SUB);
				setState(76);
				match(FLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(80);
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
						setState(81);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(83);
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
						setState(84);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000f\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00014\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002@\b\u0002"+
		"\n\u0002\f\u0002C\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"N\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002V\b\u0002\n\u0002\f\u0002Y\t\u0002\u0001\u0002"+
		"\u0000\u0002\u0000\u0004\u0003\u0000\u0002\u0004\u0000\u0002\u0001\u0000"+
		"\u000b\f\u0001\u0000\r\u000ei\u0000\u000e\u0001\u0000\u0000\u0000\u0002"+
		"3\u0001\u0000\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006\u0007\u0006"+
		"\u0000\uffff\uffff\u0000\u0007\b\u0005\u0001\u0000\u0000\b\t\u0003\u0000"+
		"\u0000\u0000\t\n\u0005\u0002\u0000\u0000\n\u000f\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0005\u0003\u0000\u0000\f\u000f\u0003\u0000\u0000\u0002\r\u000f"+
		"\u0003\u0002\u0001\u0000\u000e\u0006\u0001\u0000\u0000\u0000\u000e\u000b"+
		"\u0001\u0000\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f\u0018\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\n\u0004\u0000\u0000\u0011\u0012\u0005\u000f"+
		"\u0000\u0000\u0012\u0017\u0003\u0000\u0000\u0005\u0013\u0014\n\u0003\u0000"+
		"\u0000\u0014\u0015\u0005\u0010\u0000\u0000\u0015\u0017\u0003\u0000\u0000"+
		"\u0004\u0016\u0010\u0001\u0000\u0000\u0000\u0016\u0013\u0001\u0000\u0000"+
		"\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0001\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0003\u0004\u0002"+
		"\u0000\u001c\u001d\u0005\u0004\u0000\u0000\u001d\u001e\u0003\u0004\u0002"+
		"\u0000\u001e4\u0001\u0000\u0000\u0000\u001f \u0003\u0004\u0002\u0000 "+
		"!\u0005\u0005\u0000\u0000!\"\u0003\u0004\u0002\u0000\"4\u0001\u0000\u0000"+
		"\u0000#$\u0003\u0004\u0002\u0000$%\u0005\u0006\u0000\u0000%&\u0003\u0004"+
		"\u0002\u0000&4\u0001\u0000\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0005"+
		"\u0007\u0000\u0000)*\u0003\u0004\u0002\u0000*4\u0001\u0000\u0000\u0000"+
		"+,\u0003\u0004\u0002\u0000,-\u0005\b\u0000\u0000-.\u0003\u0004\u0002\u0000"+
		".4\u0001\u0000\u0000\u0000/0\u0003\u0004\u0002\u000001\u0005\t\u0000\u0000"+
		"12\u0003\u0004\u0002\u000024\u0001\u0000\u0000\u00003\u001b\u0001\u0000"+
		"\u0000\u00003\u001f\u0001\u0000\u0000\u00003#\u0001\u0000\u0000\u0000"+
		"3\'\u0001\u0000\u0000\u00003+\u0001\u0000\u0000\u00003/\u0001\u0000\u0000"+
		"\u00004\u0003\u0001\u0000\u0000\u000056\u0006\u0002\uffff\uffff\u0000"+
		"6N\u0005\u0012\u0000\u000078\u0005\u000e\u0000\u00008N\u0005\u0012\u0000"+
		"\u00009N\u0005\u0011\u0000\u0000:;\u0005\u0011\u0000\u0000;<\u0005\u0001"+
		"\u0000\u0000<A\u0003\u0004\u0002\u0000=>\u0005\n\u0000\u0000>@\u0003\u0004"+
		"\u0002\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DE\u0005\u0002\u0000\u0000EN\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0001\u0000\u0000GH\u0003\u0004\u0002\u0000HI\u0005\u0002"+
		"\u0000\u0000IN\u0001\u0000\u0000\u0000JN\u0005\u0013\u0000\u0000KL\u0005"+
		"\u000e\u0000\u0000LN\u0005\u0013\u0000\u0000M5\u0001\u0000\u0000\u0000"+
		"M7\u0001\u0000\u0000\u0000M9\u0001\u0000\u0000\u0000M:\u0001\u0000\u0000"+
		"\u0000MF\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NW\u0001\u0000\u0000\u0000OP\n\t\u0000\u0000PQ\u0007\u0000"+
		"\u0000\u0000QV\u0003\u0004\u0002\nRS\n\b\u0000\u0000ST\u0007\u0001\u0000"+
		"\u0000TV\u0003\u0004\u0002\tUO\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000X\u0005\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"\b\u000e\u0016\u00183AMUW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}