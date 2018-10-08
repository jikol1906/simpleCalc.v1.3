// Generated from simpleCalc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OP1=8, OP2=9, 
		NUM=10, ID=11, WHITESPACE=12, COMMENT=13, VAR=14, CONST=15, IF=16, ELSE=17, 
		WHILE=18;
	public static final int
		RULE_start = 0, RULE_assign = 1, RULE_prog = 2, RULE_stmt = 3, RULE_stmts = 4, 
		RULE_cond = 5, RULE_expr = 6;
	public static final String[] ruleNames = {
		"start", "assign", "prog", "stmt", "stmts", "cond", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'=='", "'!=='", "'&&'", "'||'", null, null, 
		null, null, null, null, "'var'", "'const'", "'if'", "'else'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "OP1", "OP2", "NUM", "ID", 
		"WHITESPACE", "COMMENT", "VAR", "CONST", "IF", "ELSE", "WHILE"
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
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public AssignContext assign;
		public List<AssignContext> as = new ArrayList<AssignContext>();
		public ExprContext e;
		public TerminalNode EOF() { return getToken(simpleCalcParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(14);
					((StartContext)_localctx).assign = assign();
					((StartContext)_localctx).as.add(((StartContext)_localctx).assign);
					}
					} 
				}
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(20);
			((StartContext)_localctx).e = expr(0);
			setState(21);
			match(EOF);
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
		public Token x;
		public ExprContext e;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			((AssignContext)_localctx).x = match(ID);
			setState(24);
			match(T__0);
			setState(25);
			((AssignContext)_localctx).e = expr(0);
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

	public static class ProgContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(simpleCalcParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IF() { return getToken(simpleCalcParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(simpleCalcParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(simpleCalcParser.WHILE, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(VAR);
				setState(30);
				match(T__0);
				setState(31);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(IF);
				setState(33);
				match(T__1);
				setState(34);
				cond(0);
				setState(35);
				match(T__2);
				setState(36);
				prog();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(IF);
				setState(39);
				match(T__1);
				setState(40);
				cond(0);
				setState(41);
				match(T__2);
				setState(42);
				prog();
				setState(43);
				match(ELSE);
				setState(44);
				prog();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(WHILE);
				setState(47);
				match(T__1);
				setState(48);
				cond(0);
				setState(49);
				match(T__2);
				setState(50);
				expr(0);
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

	public static class StmtsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			stmt();
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

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(57);
				expr(0);
				setState(58);
				match(T__3);
				setState(59);
				expr(0);
				}
				break;
			case 2:
				{
				setState(61);
				expr(0);
				setState(62);
				match(T__4);
				setState(63);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(67);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(68);
						match(T__5);
						setState(69);
						cond(3);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(70);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(71);
						match(T__6);
						setState(72);
						cond(2);
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExprContext {
		public Token n;
		public TerminalNode NUM() { return getToken(simpleCalcParser.NUM, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(simpleCalcParser.VAR, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementContext extends ExprContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StatementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalculateContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP1() { return getToken(simpleCalcParser.OP1, 0); }
		public TerminalNode OP2() { return getToken(simpleCalcParser.OP2, 0); }
		public CalculateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterCalculate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitCalculate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(79);
				((ConstantContext)_localctx).n = match(NUM);
				}
				break;
			case 2:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(T__1);
				setState(82);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(83);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(VAR);
				}
				break;
			case 5:
				{
				_localctx = new StatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				stmt();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new CalculateContext(new ExprContext(_parentctx, _parentState));
						((CalculateContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(90);
						((CalculateContext)_localctx).op = match(OP1);
						setState(91);
						((CalculateContext)_localctx).e2 = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new CalculateContext(new ExprContext(_parentctx, _parentState));
						((CalculateContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(93);
						((CalculateContext)_localctx).op = match(OP2);
						setState(94);
						((CalculateContext)_localctx).e2 = expr(7);
						}
						break;
					}
					} 
				}
				setState(99);
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
		case 5:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\67"+
		"\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7D\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bZ\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bb\n\b\f\b\16\be\13\b\3\b\2\4\f"+
		"\16\t\2\4\6\b\n\f\16\2\2\2l\2\23\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2\2\b\66"+
		"\3\2\2\2\n8\3\2\2\2\fC\3\2\2\2\16Y\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2"+
		"\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2"+
		"\26\27\5\16\b\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32\7\r\2\2\32\33\7\3\2\2"+
		"\33\34\5\16\b\2\34\5\3\2\2\2\35\36\5\b\5\2\36\7\3\2\2\2\37 \7\20\2\2 "+
		"!\7\3\2\2!\67\5\16\b\2\"#\7\22\2\2#$\7\4\2\2$%\5\f\7\2%&\7\5\2\2&\'\5"+
		"\6\4\2\'\67\3\2\2\2()\7\22\2\2)*\7\4\2\2*+\5\f\7\2+,\7\5\2\2,-\5\6\4\2"+
		"-.\7\23\2\2./\5\6\4\2/\67\3\2\2\2\60\61\7\24\2\2\61\62\7\4\2\2\62\63\5"+
		"\f\7\2\63\64\7\5\2\2\64\65\5\16\b\2\65\67\3\2\2\2\66\37\3\2\2\2\66\"\3"+
		"\2\2\2\66(\3\2\2\2\66\60\3\2\2\2\67\t\3\2\2\289\5\b\5\29\13\3\2\2\2:;"+
		"\b\7\1\2;<\5\16\b\2<=\7\6\2\2=>\5\16\b\2>D\3\2\2\2?@\5\16\b\2@A\7\7\2"+
		"\2AB\5\16\b\2BD\3\2\2\2C:\3\2\2\2C?\3\2\2\2DM\3\2\2\2EF\f\4\2\2FG\7\b"+
		"\2\2GL\5\f\7\5HI\f\3\2\2IJ\7\t\2\2JL\5\f\7\4KE\3\2\2\2KH\3\2\2\2LO\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2N\r\3\2\2\2OM\3\2\2\2PQ\b\b\1\2QZ\7\f\2\2RZ\7"+
		"\r\2\2ST\7\4\2\2TU\5\16\b\2UV\7\5\2\2VZ\3\2\2\2WZ\7\20\2\2XZ\5\b\5\2Y"+
		"P\3\2\2\2YR\3\2\2\2YS\3\2\2\2YW\3\2\2\2YX\3\2\2\2Zc\3\2\2\2[\\\f\t\2\2"+
		"\\]\7\n\2\2]b\5\16\b\n^_\f\b\2\2_`\7\13\2\2`b\5\16\b\ta[\3\2\2\2a^\3\2"+
		"\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ec\3\2\2\2\n\23\66CKMYa"+
		"c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}