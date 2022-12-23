// Generated from /Users/huchang/IdeaProjects/makeyourdatabase/src/main/java/sql/sql/SQL.g4 by ANTLR 4.10.1
package sql.sql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, MUL=15, DIV=16, ADD=17, 
		SUB=18, AND=19, OR=20, MINT=21, MFLOAT=22, CREATE=23, SELECT=24, DELETE=25, 
		INSERT=26, UPDATE=27, TABLE=28, WHERE=29, GROUP=30, HAVING=31, BY=32, 
		SET=33, INTO=34, FROM=35, NOT=36, VALUES=37, VALUE=38, NULL=39, UNIQUE=40, 
		FOREIGN=41, REFERENCE=42, TYPE=43, PRIMARY=44, KEY=45, FLOAT=46, INT=47, 
		CHAR=48, VARCHAR=49, STRING=50, ID=51, WS=52;
	public static final int
		RULE_create = 0, RULE_select = 1, RULE_insert = 2, RULE_update = 3, RULE_delete = 4, 
		RULE_assign = 5, RULE_group = 6, RULE_data = 7, RULE_itemexpre = 8, RULE_where = 9, 
		RULE_having = 10, RULE_groupby = 11, RULE_pkeys = 12, RULE_rkeys = 13, 
		RULE_fk = 14, RULE_rk = 15, RULE_item = 16, RULE_constrain = 17, RULE_conditions = 18, 
		RULE_condition = 19, RULE_expression = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"create", "select", "insert", "update", "delete", "assign", "group", 
			"data", "itemexpre", "where", "having", "groupby", "pkeys", "rkeys", 
			"fk", "rk", "item", "constrain", "conditions", "condition", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "';'", "'='", "'''", "'\"'", "'!'", "'>'", 
			"'<'", "'>='", "'<='", "'=='", "'!='", "'*'", "'/'", "'+'", "'-'", "'and'", 
			"'or'", null, null, "'create'", "'select'", "'delete'", "'insert'", "'update'", 
			"'table'", "'where'", "'group'", "'having'", "'by'", "'set'", "'into'", 
			"'from'", "'not'", "'values'", "'value'", "'null'", "'unique'", "'foreign'", 
			"'references'", null, "'primary'", "'key'", "'float'", "'int'", "'char'", 
			"'varchar'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "MUL", "DIV", "ADD", "SUB", "AND", "OR", "MINT", "MFLOAT", 
			"CREATE", "SELECT", "DELETE", "INSERT", "UPDATE", "TABLE", "WHERE", "GROUP", 
			"HAVING", "BY", "SET", "INTO", "FROM", "NOT", "VALUES", "VALUE", "NULL", 
			"UNIQUE", "FOREIGN", "REFERENCE", "TYPE", "PRIMARY", "KEY", "FLOAT", 
			"INT", "CHAR", "VARCHAR", "STRING", "ID", "WS"
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
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CreateContext extends ParserRuleContext {
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
	 
		public CreateContext() { }
		public void copyFrom(CreateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SQLCreateContext extends CreateContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public PkeysContext pkeys() {
			return getRuleContext(PkeysContext.class,0);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public RkeysContext rkeys() {
			return getRuleContext(RkeysContext.class,0);
		}
		public SQLCreateContext(CreateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSQLCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSQLCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSQLCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_create);
		int _la;
		try {
			_localctx = new SQLCreateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(CREATE);
			setState(43);
			match(TABLE);
			setState(44);
			match(ID);
			setState(45);
			match(T__0);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(46);
				item();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(52);
				pkeys();
				setState(53);
				match(T__1);
				setState(54);
				rkeys();
				}
				}
				break;
			case 2:
				{
				setState(56);
				pkeys();
				}
				break;
			}
			setState(59);
			match(T__2);
			setState(60);
			match(T__3);
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

	public static class SelectContext extends ParserRuleContext {
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	 
		public SelectContext() { }
		public void copyFrom(SelectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SQLSelectContext extends SelectContext {
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode MUL() { return getToken(SQLParser.MUL, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public GroupbyContext groupby() {
			return getRuleContext(GroupbyContext.class,0);
		}
		public HavingContext having() {
			return getRuleContext(HavingContext.class,0);
		}
		public List<ItemexpreContext> itemexpre() {
			return getRuleContexts(ItemexpreContext.class);
		}
		public ItemexpreContext itemexpre(int i) {
			return getRuleContext(ItemexpreContext.class,i);
		}
		public SQLSelectContext(SelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSQLSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSQLSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSQLSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			_localctx = new SQLSelectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(SELECT);
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(63);
				match(MUL);
				}
				break;
			case ID:
				{
				{
				setState(64);
				itemexpre();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(65);
					match(T__1);
					setState(66);
					itemexpre();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(74);
			match(FROM);
			setState(75);
			match(ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(76);
				where();
				}
			}

			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(79);
				groupby();
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(82);
				having();
				}
			}

			setState(85);
			match(T__3);
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

	public static class InsertContext extends ParserRuleContext {
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
	 
		public InsertContext() { }
		public void copyFrom(InsertContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SQLInsertOneContext extends InsertContext {
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TerminalNode VALUE() { return getToken(SQLParser.VALUE, 0); }
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public SQLInsertOneContext(InsertContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSQLInsertOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSQLInsertOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSQLInsertOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SQLInsertManyContext extends InsertContext {
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public List<GroupContext> group() {
			return getRuleContexts(GroupContext.class);
		}
		public GroupContext group(int i) {
			return getRuleContext(GroupContext.class,i);
		}
		public SQLInsertManyContext(InsertContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSQLInsertMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSQLInsertMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSQLInsertMany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insert);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SQLInsertOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(INSERT);
				setState(88);
				match(INTO);
				setState(89);
				match(ID);
				setState(90);
				match(T__0);
				setState(91);
				match(ID);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(92);
					match(T__1);
					setState(93);
					match(ID);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(T__2);
				setState(100);
				match(VALUE);
				setState(101);
				group();
				setState(102);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new SQLInsertManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(INSERT);
				setState(105);
				match(INTO);
				setState(106);
				match(ID);
				setState(107);
				match(T__0);
				setState(108);
				match(ID);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(109);
					match(T__1);
					setState(110);
					match(ID);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(T__2);
				setState(117);
				match(VALUES);
				setState(118);
				match(T__0);
				setState(119);
				group();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(120);
					match(T__1);
					setState(121);
					group();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__2);
				setState(128);
				match(T__3);
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

	public static class UpdateContext extends ParserRuleContext {
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	 
		public UpdateContext() { }
		public void copyFrom(UpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SQLUpdateContext extends UpdateContext {
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public SQLUpdateContext(UpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSQLUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSQLUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSQLUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_update);
		int _la;
		try {
			_localctx = new SQLUpdateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(UPDATE);
			setState(133);
			match(ID);
			setState(134);
			match(SET);
			setState(135);
			assign();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(136);
				match(T__1);
				setState(137);
				assign();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			where();
			setState(144);
			match(T__3);
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

	public static class DeleteContext extends ParserRuleContext {
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	 
		public DeleteContext() { }
		public void copyFrom(DeleteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SQLDeleteContext extends DeleteContext {
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public SQLDeleteContext(DeleteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSQLDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSQLDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSQLDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delete);
		try {
			_localctx = new SQLDeleteContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(DELETE);
			setState(147);
			match(FROM);
			setState(148);
			match(ID);
			setState(149);
			where();
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

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdateAssignContext extends AssignContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public UpdateAssignContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdateAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdateAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdateAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			_localctx = new UpdateAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ID);
			setState(152);
			match(T__4);
			setState(153);
			data();
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

	public static class GroupContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__0);
			{
			setState(156);
			data();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(157);
				match(T__1);
				setState(158);
				data();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(164);
			match(T__2);
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode MFLOAT() { return getToken(SQLParser.MFLOAT, 0); }
		public TerminalNode MINT() { return getToken(SQLParser.MINT, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_data);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__5);
				setState(167);
				match(ID);
				setState(168);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__6);
				setState(170);
				match(ID);
				setState(171);
				match(T__6);
				}
				break;
			case MFLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(MFLOAT);
				}
				break;
			case MINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(MINT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ItemexpreContext extends ParserRuleContext {
		public ItemexpreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemexpre; }
	 
		public ItemexpreContext() { }
		public void copyFrom(ItemexpreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrdinaryItemContext extends ItemexpreContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public OrdinaryItemContext(ItemexpreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrdinaryItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrdinaryItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrdinaryItem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionItemContext extends ItemexpreContext {
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public FunctionItemContext(ItemexpreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunctionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunctionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunctionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemexpreContext itemexpre() throws RecognitionException {
		ItemexpreContext _localctx = new ItemexpreContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_itemexpre);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new OrdinaryItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(ID);
				}
				break;
			case 2:
				_localctx = new FunctionItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(ID);
				setState(178);
				match(T__0);
				setState(179);
				match(ID);
				setState(180);
				match(T__2);
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

	public static class WhereContext extends ParserRuleContext {
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
	 
		public WhereContext() { }
		public void copyFrom(WhereContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereConditionContext extends WhereContext {
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public WhereConditionContext(WhereContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhereCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhereCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhereCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_where);
		try {
			_localctx = new WhereConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(WHERE);
			setState(184);
			conditions(0);
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

	public static class HavingContext extends ParserRuleContext {
		public HavingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having; }
	 
		public HavingContext() { }
		public void copyFrom(HavingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingConditionContext extends HavingContext {
		public TerminalNode HAVING() { return getToken(SQLParser.HAVING, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public HavingConditionContext(HavingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHavingCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHavingCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHavingCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingContext having() throws RecognitionException {
		HavingContext _localctx = new HavingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_having);
		try {
			_localctx = new HavingConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(HAVING);
			setState(187);
			conditions(0);
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

	public static class GroupbyContext extends ParserRuleContext {
		public GroupbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby; }
	 
		public GroupbyContext() { }
		public void copyFrom(GroupbyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupByContext extends GroupbyContext {
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public GroupByContext(GroupbyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupbyContext groupby() throws RecognitionException {
		GroupbyContext _localctx = new GroupbyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_groupby);
		try {
			_localctx = new GroupByContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(GROUP);
			setState(190);
			match(BY);
			setState(191);
			match(ID);
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

	public static class PkeysContext extends ParserRuleContext {
		public PkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkeys; }
	 
		public PkeysContext() { }
		public void copyFrom(PkeysContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryKeyContext extends PkeysContext {
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public PrimaryKeyContext(PkeysContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkeysContext pkeys() throws RecognitionException {
		PkeysContext _localctx = new PkeysContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pkeys);
		int _la;
		try {
			_localctx = new PrimaryKeyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(193);
				match(PRIMARY);
				setState(194);
				match(KEY);
				setState(195);
				match(T__0);
				setState(196);
				match(ID);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(197);
					match(T__1);
					setState(198);
					match(ID);
					}
				}

				setState(201);
				match(T__2);
				}
			}

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

	public static class RkeysContext extends ParserRuleContext {
		public FkContext fk() {
			return getRuleContext(FkContext.class,0);
		}
		public RkContext rk() {
			return getRuleContext(RkContext.class,0);
		}
		public RkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rkeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRkeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRkeys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRkeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RkeysContext rkeys() throws RecognitionException {
		RkeysContext _localctx = new RkeysContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rkeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(204);
				fk();
				setState(205);
				rk();
				}
			}

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

	public static class FkContext extends ParserRuleContext {
		public FkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk; }
	 
		public FkContext() { }
		public void copyFrom(FkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForeignKeyContext extends FkContext {
		public TerminalNode FOREIGN() { return getToken(SQLParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public ForeignKeyContext(FkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeignKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeignKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeignKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FkContext fk() throws RecognitionException {
		FkContext _localctx = new FkContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fk);
		int _la;
		try {
			_localctx = new ForeignKeyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(FOREIGN);
			setState(210);
			match(KEY);
			setState(211);
			match(T__0);
			setState(212);
			match(ID);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(213);
				match(T__1);
				setState(214);
				match(ID);
				}
			}

			setState(217);
			match(T__2);
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

	public static class RkContext extends ParserRuleContext {
		public RkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rk; }
	 
		public RkContext() { }
		public void copyFrom(RkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReferenceKeyContext extends RkContext {
		public TerminalNode REFERENCE() { return getToken(SQLParser.REFERENCE, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public ReferenceKeyContext(RkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReferenceKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReferenceKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReferenceKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RkContext rk() throws RecognitionException {
		RkContext _localctx = new RkContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rk);
		int _la;
		try {
			_localctx = new ReferenceKeyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(REFERENCE);
			setState(220);
			match(ID);
			setState(221);
			match(T__0);
			setState(222);
			match(ID);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(223);
				match(T__1);
				setState(224);
				match(ID);
				}
			}

			setState(227);
			match(T__2);
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

	public static class ItemContext extends ParserRuleContext {
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
	 
		public ItemContext() { }
		public void copyFrom(ItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleItemContext extends ItemContext {
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(SQLParser.TYPE, 0); }
		public ConstrainContext constrain() {
			return getRuleContext(ConstrainContext.class,0);
		}
		public SingleItemContext(ItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSingleItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSingleItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSingleItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_item);
		int _la;
		try {
			_localctx = new SingleItemContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ID);
			setState(230);
			match(TYPE);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << UNIQUE) | (1L << PRIMARY))) != 0)) {
				{
				setState(231);
				constrain();
				}
			}

			setState(234);
			match(T__1);
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

	public static class ConstrainContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(SQLParser.UNIQUE, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public ConstrainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterConstrain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitConstrain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitConstrain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrainContext constrain() throws RecognitionException {
		ConstrainContext _localctx = new ConstrainContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constrain);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(PRIMARY);
				setState(237);
				match(KEY);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(UNIQUE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(NOT);
				setState(240);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLParser.OR, 0); }
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitConditions(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_conditions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(244);
				match(T__0);
				setState(245);
				conditions(0);
				setState(246);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(248);
				match(T__7);
				setState(249);
				conditions(2);
				}
				break;
			case 3:
				{
				setState(250);
				condition();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(253);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(254);
						match(AND);
						setState(255);
						conditions(5);
						}
						break;
					case 2:
						{
						_localctx = new ConditionsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(256);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(257);
						match(OR);
						setState(258);
						conditions(4);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				expression(0);
				setState(265);
				match(T__8);
				setState(266);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				expression(0);
				setState(269);
				match(T__9);
				setState(270);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				expression(0);
				setState(273);
				match(T__10);
				setState(274);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				expression(0);
				setState(277);
				match(T__11);
				setState(278);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				expression(0);
				setState(281);
				match(T__12);
				setState(282);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				expression(0);
				setState(285);
				match(T__13);
				setState(286);
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
		public Token op;
		public TerminalNode MINT() { return getToken(SQLParser.MINT, 0); }
		public TerminalNode SUB() { return getToken(SQLParser.SUB, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MFLOAT() { return getToken(SQLParser.MFLOAT, 0); }
		public TerminalNode MUL() { return getToken(SQLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(SQLParser.ADD, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(291);
				match(MINT);
				}
				break;
			case 2:
				{
				setState(292);
				match(SUB);
				setState(293);
				match(MINT);
				}
				break;
			case 3:
				{
				setState(294);
				match(ID);
				}
				break;
			case 4:
				{
				setState(295);
				match(T__5);
				setState(296);
				match(ID);
				setState(297);
				match(T__5);
				}
				break;
			case 5:
				{
				setState(298);
				match(T__6);
				setState(299);
				match(ID);
				setState(300);
				match(T__6);
				}
				break;
			case 6:
				{
				setState(301);
				match(ID);
				setState(302);
				match(T__0);
				setState(303);
				expression(0);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(304);
					match(T__1);
					setState(305);
					expression(0);
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311);
				match(T__2);
				}
				break;
			case 7:
				{
				setState(313);
				match(T__0);
				setState(314);
				expression(0);
				setState(315);
				match(T__2);
				}
				break;
			case 8:
				{
				setState(317);
				match(MFLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(321);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(322);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(323);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(324);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(325);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		case 18:
			return conditions_sempred((ConditionsContext)_localctx, predIndex);
		case 20:
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
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u014c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000:\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001D\b\u0001"+
		"\n\u0001\f\u0001G\t\u0001\u0003\u0001I\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0001\u0003\u0001Q\b\u0001\u0001"+
		"\u0001\u0003\u0001T\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002_\b\u0002\n\u0002\f\u0002b\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002p\b\u0002\n\u0002"+
		"\f\u0002s\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002{\b\u0002\n\u0002\f\u0002~\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0083\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008b"+
		"\b\u0003\n\u0003\f\u0003\u008e\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00a0\b\u0006\n\u0006\f\u0006\u00a3\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00af\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b6\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c8\b\f\u0001"+
		"\f\u0003\f\u00cb\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00d0\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00d8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e2\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e9\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00f2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00fc\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0104\b\u0012\n\u0012\f\u0012\u0107\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0121\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0133\b\u0014\n\u0014\f\u0014\u0136\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u013f\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0147\b\u0014\n\u0014\f\u0014\u014a\t\u0014\u0001"+
		"\u0014\u0000\u0002$(\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0002\u0001\u0000\u000f"+
		"\u0010\u0001\u0000\u0011\u0012\u0162\u0000*\u0001\u0000\u0000\u0000\u0002"+
		">\u0001\u0000\u0000\u0000\u0004\u0082\u0001\u0000\u0000\u0000\u0006\u0084"+
		"\u0001\u0000\u0000\u0000\b\u0092\u0001\u0000\u0000\u0000\n\u0097\u0001"+
		"\u0000\u0000\u0000\f\u009b\u0001\u0000\u0000\u0000\u000e\u00ae\u0001\u0000"+
		"\u0000\u0000\u0010\u00b5\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000"+
		"\u0000\u0000\u0014\u00ba\u0001\u0000\u0000\u0000\u0016\u00bd\u0001\u0000"+
		"\u0000\u0000\u0018\u00ca\u0001\u0000\u0000\u0000\u001a\u00cf\u0001\u0000"+
		"\u0000\u0000\u001c\u00d1\u0001\u0000\u0000\u0000\u001e\u00db\u0001\u0000"+
		"\u0000\u0000 \u00e5\u0001\u0000\u0000\u0000\"\u00f1\u0001\u0000\u0000"+
		"\u0000$\u00fb\u0001\u0000\u0000\u0000&\u0120\u0001\u0000\u0000\u0000("+
		"\u013e\u0001\u0000\u0000\u0000*+\u0005\u0017\u0000\u0000+,\u0005\u001c"+
		"\u0000\u0000,-\u00053\u0000\u0000-1\u0005\u0001\u0000\u0000.0\u0003 \u0010"+
		"\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000029\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000045\u0003\u0018\f\u000056\u0005\u0002\u0000\u000067\u0003"+
		"\u001a\r\u00007:\u0001\u0000\u0000\u00008:\u0003\u0018\f\u000094\u0001"+
		"\u0000\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";<\u0005\u0003\u0000\u0000<=\u0005\u0004\u0000\u0000=\u0001\u0001\u0000"+
		"\u0000\u0000>H\u0005\u0018\u0000\u0000?I\u0005\u000f\u0000\u0000@E\u0003"+
		"\u0010\b\u0000AB\u0005\u0002\u0000\u0000BD\u0003\u0010\b\u0000CA\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000H?\u0001\u0000\u0000\u0000H@\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JK\u0005#\u0000\u0000KM\u00053\u0000\u0000LN\u0003\u0012\t"+
		"\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000"+
		"\u0000\u0000OQ\u0003\u0016\u000b\u0000PO\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RT\u0003\u0014\n\u0000SR\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0005\u0004\u0000\u0000V\u0003\u0001\u0000\u0000\u0000WX\u0005\u001a"+
		"\u0000\u0000XY\u0005\"\u0000\u0000YZ\u00053\u0000\u0000Z[\u0005\u0001"+
		"\u0000\u0000[`\u00053\u0000\u0000\\]\u0005\u0002\u0000\u0000]_\u00053"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cd\u0005\u0003\u0000\u0000de\u0005&\u0000\u0000"+
		"ef\u0003\f\u0006\u0000fg\u0005\u0004\u0000\u0000g\u0083\u0001\u0000\u0000"+
		"\u0000hi\u0005\u001a\u0000\u0000ij\u0005\"\u0000\u0000jk\u00053\u0000"+
		"\u0000kl\u0005\u0001\u0000\u0000lq\u00053\u0000\u0000mn\u0005\u0002\u0000"+
		"\u0000np\u00053\u0000\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0003\u0000\u0000uv\u0005"+
		"%\u0000\u0000vw\u0005\u0001\u0000\u0000w|\u0003\f\u0006\u0000xy\u0005"+
		"\u0002\u0000\u0000y{\u0003\f\u0006\u0000zx\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0003\u0000\u0000\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082W\u0001\u0000\u0000\u0000\u0082h\u0001\u0000"+
		"\u0000\u0000\u0083\u0005\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u001b"+
		"\u0000\u0000\u0085\u0086\u00053\u0000\u0000\u0086\u0087\u0005!\u0000\u0000"+
		"\u0087\u008c\u0003\n\u0005\u0000\u0088\u0089\u0005\u0002\u0000\u0000\u0089"+
		"\u008b\u0003\n\u0005\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u0012\t\u0000\u0090\u0091\u0005"+
		"\u0004\u0000\u0000\u0091\u0007\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"\u0019\u0000\u0000\u0093\u0094\u0005#\u0000\u0000\u0094\u0095\u00053\u0000"+
		"\u0000\u0095\u0096\u0003\u0012\t\u0000\u0096\t\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u00053\u0000\u0000\u0098\u0099\u0005\u0005\u0000\u0000\u0099"+
		"\u009a\u0003\u000e\u0007\u0000\u009a\u000b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\u0001\u0000\u0000\u009c\u00a1\u0003\u000e\u0007\u0000\u009d"+
		"\u009e\u0005\u0002\u0000\u0000\u009e\u00a0\u0003\u000e\u0007\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0003\u0000\u0000\u00a5\r\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0006\u0000\u0000\u00a7\u00a8\u00053\u0000\u0000\u00a8\u00af\u0005"+
		"\u0006\u0000\u0000\u00a9\u00aa\u0005\u0007\u0000\u0000\u00aa\u00ab\u0005"+
		"3\u0000\u0000\u00ab\u00af\u0005\u0007\u0000\u0000\u00ac\u00af\u0005\u0016"+
		"\u0000\u0000\u00ad\u00af\u0005\u0015\u0000\u0000\u00ae\u00a6\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a9\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u000f\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b6\u00053\u0000\u0000\u00b1\u00b2\u00053\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3\u00b4\u00053\u0000\u0000\u00b4"+
		"\u00b6\u0005\u0003\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u001d\u0000\u0000\u00b8\u00b9\u0003$\u0012\u0000\u00b9\u0013"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u001f\u0000\u0000\u00bb\u00bc"+
		"\u0003$\u0012\u0000\u00bc\u0015\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"\u001e\u0000\u0000\u00be\u00bf\u0005 \u0000\u0000\u00bf\u00c0\u00053\u0000"+
		"\u0000\u00c0\u0017\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005,\u0000\u0000"+
		"\u00c2\u00c3\u0005-\u0000\u0000\u00c3\u00c4\u0005\u0001\u0000\u0000\u00c4"+
		"\u00c7\u00053\u0000\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000\u00c6\u00c8"+
		"\u00053\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005"+
		"\u0003\u0000\u0000\u00ca\u00c1\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u0019\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003"+
		"\u001c\u000e\u0000\u00cd\u00ce\u0003\u001e\u000f\u0000\u00ce\u00d0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u001b\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		")\u0000\u0000\u00d2\u00d3\u0005-\u0000\u0000\u00d3\u00d4\u0005\u0001\u0000"+
		"\u0000\u00d4\u00d7\u00053\u0000\u0000\u00d5\u00d6\u0005\u0002\u0000\u0000"+
		"\u00d6\u00d8\u00053\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\u0003\u0000\u0000\u00da\u001d\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005*\u0000\u0000\u00dc\u00dd\u00053\u0000\u0000\u00dd\u00de\u0005"+
		"\u0001\u0000\u0000\u00de\u00e1\u00053\u0000\u0000\u00df\u00e0\u0005\u0002"+
		"\u0000\u0000\u00e0\u00e2\u00053\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u001f\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u00053\u0000\u0000\u00e6\u00e8\u0005+\u0000\u0000\u00e7"+
		"\u00e9\u0003\"\u0011\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0002\u0000\u0000\u00eb!\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		",\u0000\u0000\u00ed\u00f2\u0005-\u0000\u0000\u00ee\u00f2\u0005(\u0000"+
		"\u0000\u00ef\u00f0\u0005$\u0000\u0000\u00f0\u00f2\u0005\'\u0000\u0000"+
		"\u00f1\u00ec\u0001\u0000\u0000\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2#\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0006\u0012\uffff\uffff\u0000\u00f4\u00f5\u0005\u0001\u0000\u0000"+
		"\u00f5\u00f6\u0003$\u0012\u0000\u00f6\u00f7\u0005\u0003\u0000\u0000\u00f7"+
		"\u00fc\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\b\u0000\u0000\u00f9\u00fc"+
		"\u0003$\u0012\u0002\u00fa\u00fc\u0003&\u0013\u0000\u00fb\u00f3\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u0105\u0001\u0000\u0000\u0000\u00fd\u00fe\n\u0004\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0013\u0000\u0000\u00ff\u0104\u0003$\u0012\u0005"+
		"\u0100\u0101\n\u0003\u0000\u0000\u0101\u0102\u0005\u0014\u0000\u0000\u0102"+
		"\u0104\u0003$\u0012\u0004\u0103\u00fd\u0001\u0000\u0000\u0000\u0103\u0100"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106%\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0003"+
		"(\u0014\u0000\u0109\u010a\u0005\t\u0000\u0000\u010a\u010b\u0003(\u0014"+
		"\u0000\u010b\u0121\u0001\u0000\u0000\u0000\u010c\u010d\u0003(\u0014\u0000"+
		"\u010d\u010e\u0005\n\u0000\u0000\u010e\u010f\u0003(\u0014\u0000\u010f"+
		"\u0121\u0001\u0000\u0000\u0000\u0110\u0111\u0003(\u0014\u0000\u0111\u0112"+
		"\u0005\u000b\u0000\u0000\u0112\u0113\u0003(\u0014\u0000\u0113\u0121\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0003(\u0014\u0000\u0115\u0116\u0005\f"+
		"\u0000\u0000\u0116\u0117\u0003(\u0014\u0000\u0117\u0121\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0003(\u0014\u0000\u0119\u011a\u0005\r\u0000\u0000"+
		"\u011a\u011b\u0003(\u0014\u0000\u011b\u0121\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0003(\u0014\u0000\u011d\u011e\u0005\u000e\u0000\u0000\u011e\u011f"+
		"\u0003(\u0014\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0108\u0001"+
		"\u0000\u0000\u0000\u0120\u010c\u0001\u0000\u0000\u0000\u0120\u0110\u0001"+
		"\u0000\u0000\u0000\u0120\u0114\u0001\u0000\u0000\u0000\u0120\u0118\u0001"+
		"\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0121\'\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0006\u0014\uffff\uffff\u0000\u0123\u013f\u0005"+
		"\u0015\u0000\u0000\u0124\u0125\u0005\u0012\u0000\u0000\u0125\u013f\u0005"+
		"\u0015\u0000\u0000\u0126\u013f\u00053\u0000\u0000\u0127\u0128\u0005\u0006"+
		"\u0000\u0000\u0128\u0129\u00053\u0000\u0000\u0129\u013f\u0005\u0006\u0000"+
		"\u0000\u012a\u012b\u0005\u0007\u0000\u0000\u012b\u012c\u00053\u0000\u0000"+
		"\u012c\u013f\u0005\u0007\u0000\u0000\u012d\u012e\u00053\u0000\u0000\u012e"+
		"\u012f\u0005\u0001\u0000\u0000\u012f\u0134\u0003(\u0014\u0000\u0130\u0131"+
		"\u0005\u0002\u0000\u0000\u0131\u0133\u0003(\u0014\u0000\u0132\u0130\u0001"+
		"\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0001"+
		"\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"\u0003\u0000\u0000\u0138\u013f\u0001\u0000\u0000\u0000\u0139\u013a\u0005"+
		"\u0001\u0000\u0000\u013a\u013b\u0003(\u0014\u0000\u013b\u013c\u0005\u0003"+
		"\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013f\u0005\u0016"+
		"\u0000\u0000\u013e\u0122\u0001\u0000\u0000\u0000\u013e\u0124\u0001\u0000"+
		"\u0000\u0000\u013e\u0126\u0001\u0000\u0000\u0000\u013e\u0127\u0001\u0000"+
		"\u0000\u0000\u013e\u012a\u0001\u0000\u0000\u0000\u013e\u012d\u0001\u0000"+
		"\u0000\u0000\u013e\u0139\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013f\u0148\u0001\u0000\u0000\u0000\u0140\u0141\n\n\u0000"+
		"\u0000\u0141\u0142\u0007\u0000\u0000\u0000\u0142\u0147\u0003(\u0014\u000b"+
		"\u0143\u0144\n\t\u0000\u0000\u0144\u0145\u0007\u0001\u0000\u0000\u0145"+
		"\u0147\u0003(\u0014\n\u0146\u0140\u0001\u0000\u0000\u0000\u0146\u0143"+
		"\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149)\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u001e19EHMPS`q"+
		"|\u0082\u008c\u00a1\u00ae\u00b5\u00c7\u00ca\u00cf\u00d7\u00e1\u00e8\u00f1"+
		"\u00fb\u0103\u0105\u0120\u0134\u013e\u0146\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}