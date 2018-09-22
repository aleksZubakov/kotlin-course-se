// Generated from /Users/alekseyzubakov/Documents/edu/kotlin-course-se/src/main/antlr/FunParser.g4 by ANTLR 4.7
package org.ifmo;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SKIP_=1, MultiLineComment=2, LineComment=3, IF=4, ELSE=5, WHILE=6, DO=7, 
		FUN=8, VAR=9, RETURN=10, PLUS=11, MINUS=12, ASTERISK=13, DIVISION=14, 
		MOD=15, EQUAL=16, NOTEQUAL=17, GREATER=18, GREQUAL=19, LESS=20, LEQUAL=21, 
		AND=22, OR=23, ASSIGN=24, COLON=25, LPAREN=26, RPAREN=27, LBRACE=28, RBRACE=29, 
		COMMA=30, DOUBLE=31, INT_NUM=32, ID=33;
	public static final int
		RULE_file = 0, RULE_literal = 1, RULE_logical_expr = 2, RULE_atom = 3, 
		RULE_logical_op = 4, RULE_compare_op = 5, RULE_plumin = 6, RULE_divast = 7, 
		RULE_arithm_expr = 8, RULE_binary_expr = 9, RULE_expr = 10, RULE_var_def = 11, 
		RULE_var_assign = 12, RULE_stmt = 13, RULE_return_stmt = 14, RULE_func_def = 15, 
		RULE_func_def_args = 16, RULE_if_stmt = 17, RULE_while_stmt = 18, RULE_func_invoke = 19, 
		RULE_func_arguments = 20, RULE_block_with_braces = 21, RULE_block = 22;
	public static final String[] ruleNames = {
		"file", "literal", "logical_expr", "atom", "logical_op", "compare_op", 
		"plumin", "divast", "arithm_expr", "binary_expr", "expr", "var_def", "var_assign", 
		"stmt", "return_stmt", "func_def", "func_def_args", "if_stmt", "while_stmt", 
		"func_invoke", "func_arguments", "block_with_braces", "block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'if'", "'else'", "'while'", "'do'", "'fun'", 
		"'var'", "'return'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", 
		"'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'='", "';'", "'('", "')'", 
		"'{'", "'}'", "','", "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SKIP_", "MultiLineComment", "LineComment", "IF", "ELSE", "WHILE", 
		"DO", "FUN", "VAR", "RETURN", "PLUS", "MINUS", "ASTERISK", "DIVISION", 
		"MOD", "EQUAL", "NOTEQUAL", "GREATER", "GREQUAL", "LESS", "LEQUAL", "AND", 
		"OR", "ASSIGN", "COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", 
		"DOUBLE", "INT_NUM", "ID"
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
	public String getGrammarFileName() { return "FunParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			block();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_NUM() { return getToken(FunParser.INT_NUM, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(INT_NUM);
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

	public static class Logical_exprContext extends ParserRuleContext {
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
	 
		public Logical_exprContext() { }
		public void copyFrom(Logical_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalCompareExprContext extends Logical_exprContext {
		public Arithm_exprContext left;
		public Compare_opContext op;
		public Arithm_exprContext right;
		public List<Arithm_exprContext> arithm_expr() {
			return getRuleContexts(Arithm_exprContext.class);
		}
		public Arithm_exprContext arithm_expr(int i) {
			return getRuleContext(Arithm_exprContext.class,i);
		}
		public Compare_opContext compare_op() {
			return getRuleContext(Compare_opContext.class,0);
		}
		public LogicalCompareExprContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterLogicalCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitLogicalCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitLogicalCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryExprContext extends Logical_exprContext {
		public Logical_exprContext left;
		public Logical_opContext op;
		public Logical_exprContext right;
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public Logical_opContext logical_op() {
			return getRuleContext(Logical_opContext.class,0);
		}
		public LogicalBinaryExprContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterLogicalBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitLogicalBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitLogicalBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalParensExprContext extends Logical_exprContext {
		public TerminalNode LPAREN() { return getToken(FunParser.LPAREN, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunParser.RPAREN, 0); }
		public LogicalParensExprContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterLogicalParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitLogicalParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitLogicalParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAtomExprContext extends Logical_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public LogicalAtomExprContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterLogicalAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitLogicalAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitLogicalAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_logical_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalCompareExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				((LogicalCompareExprContext)_localctx).left = arithm_expr(0);
				setState(52);
				((LogicalCompareExprContext)_localctx).op = compare_op();
				setState(53);
				((LogicalCompareExprContext)_localctx).right = arithm_expr(0);
				}
				break;
			case 2:
				{
				_localctx = new LogicalParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(LPAREN);
				setState(56);
				logical_expr(0);
				setState(57);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new LogicalAtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalBinaryExprContext(new Logical_exprContext(_parentctx, _parentState));
					((LogicalBinaryExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(62);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(63);
					((LogicalBinaryExprContext)_localctx).op = logical_op();
					setState(64);
					((LogicalBinaryExprContext)_localctx).right = logical_expr(4);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public Func_invokeContext func_invoke() {
			return getRuleContext(Func_invokeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				func_invoke();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(ID);
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

	public static class Logical_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunParser.OR, 0); }
		public Logical_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterLogical_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitLogical_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitLogical_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logical_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Compare_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(FunParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(FunParser.NOTEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(FunParser.GREATER, 0); }
		public TerminalNode GREQUAL() { return getToken(FunParser.GREQUAL, 0); }
		public TerminalNode LESS() { return getToken(FunParser.LESS, 0); }
		public TerminalNode LEQUAL() { return getToken(FunParser.LEQUAL, 0); }
		public Compare_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterCompare_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitCompare_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitCompare_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_opContext compare_op() throws RecognitionException {
		Compare_opContext _localctx = new Compare_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compare_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << GREATER) | (1L << GREQUAL) | (1L << LESS) | (1L << LEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PluminContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FunParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunParser.MINUS, 0); }
		public PluminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plumin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterPlumin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitPlumin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitPlumin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluminContext plumin() throws RecognitionException {
		PluminContext _localctx = new PluminContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_plumin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DivastContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(FunParser.DIVISION, 0); }
		public TerminalNode ASTERISK() { return getToken(FunParser.ASTERISK, 0); }
		public DivastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterDivast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitDivast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitDivast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivastContext divast() throws RecognitionException {
		DivastContext _localctx = new DivastContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_divast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==ASTERISK || _la==DIVISION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Arithm_exprContext extends ParserRuleContext {
		public Arithm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithm_expr; }
	 
		public Arithm_exprContext() { }
		public void copyFrom(Arithm_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmeticParensExprContext extends Arithm_exprContext {
		public TerminalNode LPAREN() { return getToken(FunParser.LPAREN, 0); }
		public Arithm_exprContext arithm_expr() {
			return getRuleContext(Arithm_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunParser.RPAREN, 0); }
		public ArithmeticParensExprContext(Arithm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterArithmeticParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitArithmeticParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitArithmeticParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticDABinaryExprContext extends Arithm_exprContext {
		public Arithm_exprContext left;
		public DivastContext op;
		public Arithm_exprContext right;
		public List<Arithm_exprContext> arithm_expr() {
			return getRuleContexts(Arithm_exprContext.class);
		}
		public Arithm_exprContext arithm_expr(int i) {
			return getRuleContext(Arithm_exprContext.class,i);
		}
		public DivastContext divast() {
			return getRuleContext(DivastContext.class,0);
		}
		public ArithmeticDABinaryExprContext(Arithm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterArithmeticDABinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitArithmeticDABinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitArithmeticDABinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticPMBinaryExprContext extends Arithm_exprContext {
		public Arithm_exprContext left;
		public PluminContext op;
		public Arithm_exprContext right;
		public List<Arithm_exprContext> arithm_expr() {
			return getRuleContexts(Arithm_exprContext.class);
		}
		public Arithm_exprContext arithm_expr(int i) {
			return getRuleContext(Arithm_exprContext.class,i);
		}
		public PluminContext plumin() {
			return getRuleContext(PluminContext.class,0);
		}
		public ArithmeticPMBinaryExprContext(Arithm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterArithmeticPMBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitArithmeticPMBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitArithmeticPMBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticAtomExprContext extends Arithm_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ArithmeticAtomExprContext(Arithm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterArithmeticAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitArithmeticAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitArithmeticAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithm_exprContext arithm_expr() throws RecognitionException {
		return arithm_expr(0);
	}

	private Arithm_exprContext arithm_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithm_exprContext _localctx = new Arithm_exprContext(_ctx, _parentState);
		Arithm_exprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_arithm_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ArithmeticParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				match(LPAREN);
				setState(86);
				arithm_expr(0);
				setState(87);
				match(RPAREN);
				}
				break;
			case INT_NUM:
			case ID:
				{
				_localctx = new ArithmeticAtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticDABinaryExprContext(new Arithm_exprContext(_parentctx, _parentState));
						((ArithmeticDABinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithm_expr);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						((ArithmeticDABinaryExprContext)_localctx).op = divast();
						setState(94);
						((ArithmeticDABinaryExprContext)_localctx).right = arithm_expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticPMBinaryExprContext(new Arithm_exprContext(_parentctx, _parentState));
						((ArithmeticPMBinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithm_expr);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						((ArithmeticPMBinaryExprContext)_localctx).op = plumin();
						setState(98);
						((ArithmeticPMBinaryExprContext)_localctx).right = arithm_expr(4);
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Binary_exprContext extends ParserRuleContext {
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public Arithm_exprContext arithm_expr() {
			return getRuleContext(Arithm_exprContext.class,0);
		}
		public Binary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterBinary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitBinary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitBinary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_exprContext binary_expr() throws RecognitionException {
		Binary_exprContext _localctx = new Binary_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_binary_expr);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				logical_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				arithm_expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public Func_invokeContext func_invoke() {
			return getRuleContext(Func_invokeContext.class,0);
		}
		public Binary_exprContext binary_expr() {
			return getRuleContext(Binary_exprContext.class,0);
		}
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				func_invoke();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				binary_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(LPAREN);
				setState(114);
				expr();
				setState(115);
				match(RPAREN);
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

	public static class Var_defContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(FunParser.VAR, 0); }
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(VAR);
			setState(120);
			match(ID);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(121);
				match(ASSIGN);
				setState(122);
				expr();
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

	public static class Var_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(ASSIGN);
			setState(127);
			expr();
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
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public Func_invokeContext func_invoke() {
			return getRuleContext(Func_invokeContext.class,0);
		}
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				func_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				func_invoke();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				var_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				while_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				if_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				var_assign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				return_stmt();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RETURN);
			setState(140);
			expr();
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

	public static class Func_defContext extends ParserRuleContext {
		public Block_with_bracesContext func_body;
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public Func_def_argsContext func_def_args() {
			return getRuleContext(Func_def_argsContext.class,0);
		}
		public Block_with_bracesContext block_with_braces() {
			return getRuleContext(Block_with_bracesContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FUN);
			setState(143);
			match(ID);
			setState(144);
			match(LPAREN);
			setState(145);
			func_def_args();
			setState(146);
			match(RPAREN);
			setState(147);
			((Func_defContext)_localctx).func_body = block_with_braces();
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

	public static class Func_def_argsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FunParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FunParser.ID, i);
		}
		public Func_def_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterFunc_def_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitFunc_def_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitFunc_def_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_def_argsContext func_def_args() throws RecognitionException {
		Func_def_argsContext _localctx = new Func_def_argsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_def_args);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(149);
					match(ID);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(ID);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(153);
					match(COMMA);
					setState(154);
					match(ID);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class If_stmtContext extends ParserRuleContext {
		public Block_with_bracesContext if_body;
		public Block_with_bracesContext else_body;
		public TerminalNode IF() { return getToken(FunParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Block_with_bracesContext> block_with_braces() {
			return getRuleContexts(Block_with_bracesContext.class);
		}
		public Block_with_bracesContext block_with_braces(int i) {
			return getRuleContext(Block_with_bracesContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FunParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(IF);
			setState(163);
			match(LPAREN);
			setState(164);
			expr();
			setState(165);
			match(RPAREN);
			setState(166);
			((If_stmtContext)_localctx).if_body = block_with_braces();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(167);
				match(ELSE);
				setState(168);
				((If_stmtContext)_localctx).else_body = block_with_braces();
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

	public static class While_stmtContext extends ParserRuleContext {
		public Block_with_bracesContext while_body;
		public TerminalNode WHILE() { return getToken(FunParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Block_with_bracesContext block_with_braces() {
			return getRuleContext(Block_with_bracesContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(WHILE);
			setState(172);
			match(LPAREN);
			setState(173);
			expr();
			setState(174);
			match(RPAREN);
			setState(175);
			((While_stmtContext)_localctx).while_body = block_with_braces();
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

	public static class Func_invokeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FunParser.ID, 0); }
		public Func_argumentsContext func_arguments() {
			return getRuleContext(Func_argumentsContext.class,0);
		}
		public Func_invokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_invoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterFunc_invoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitFunc_invoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitFunc_invoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_invokeContext func_invoke() throws RecognitionException {
		Func_invokeContext _localctx = new Func_invokeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_invoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(LPAREN);
			setState(179);
			func_arguments();
			setState(180);
			match(RPAREN);
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

	public static class Func_argumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Func_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterFunc_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitFunc_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitFunc_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_argumentsContext func_arguments() throws RecognitionException {
		Func_argumentsContext _localctx = new Func_argumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_arguments);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << INT_NUM) | (1L << ID))) != 0)) {
					{
					setState(182);
					expr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				expr();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(186);
					match(COMMA);
					setState(187);
					expr();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Block_with_bracesContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_with_bracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_with_braces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterBlock_with_braces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitBlock_with_braces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitBlock_with_braces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_with_bracesContext block_with_braces() throws RecognitionException {
		Block_with_bracesContext _localctx = new Block_with_bracesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block_with_braces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(LBRACE);
			setState(196);
			block();
			setState(197);
			match(RBRACE);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunParserListener ) ((FunParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunParserVisitor ) return ((FunParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FUN) | (1L << VAR) | (1L << RETURN) | (1L << LPAREN) | (1L << INT_NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(199);
				stmt();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		case 8:
			return arithm_expr_sempred((Arithm_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean arithm_expr_sempred(Arithm_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3"+
		"\4\7\4E\n\4\f\4\16\4H\13\4\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n]\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\ng\n\n\f\n\16\nj\13\n\3\13\3\13\5\13n\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\fx\n\f\3\r\3\r\3\r\3\r\5\r~\n\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008c\n\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\5\22\u0099\n\22\3\22\3\22\3\22"+
		"\7\22\u009e\n\22\f\22\16\22\u00a1\13\22\5\22\u00a3\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00ac\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\5\26\u00ba\n\26\3\26\3\26\3\26\7\26\u00bf\n"+
		"\26\f\26\16\26\u00c2\13\26\5\26\u00c4\n\26\3\27\3\27\3\27\3\27\3\30\7"+
		"\30\u00cb\n\30\f\30\16\30\u00ce\13\30\3\30\2\4\6\22\31\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\2\6\3\2\30\31\3\2\22\27\3\2\r\16\3\2"+
		"\17\20\2\u00d5\2\60\3\2\2\2\4\62\3\2\2\2\6>\3\2\2\2\bL\3\2\2\2\nN\3\2"+
		"\2\2\fP\3\2\2\2\16R\3\2\2\2\20T\3\2\2\2\22\\\3\2\2\2\24m\3\2\2\2\26w\3"+
		"\2\2\2\30y\3\2\2\2\32\177\3\2\2\2\34\u008b\3\2\2\2\36\u008d\3\2\2\2 \u0090"+
		"\3\2\2\2\"\u00a2\3\2\2\2$\u00a4\3\2\2\2&\u00ad\3\2\2\2(\u00b3\3\2\2\2"+
		"*\u00c3\3\2\2\2,\u00c5\3\2\2\2.\u00cc\3\2\2\2\60\61\5.\30\2\61\3\3\2\2"+
		"\2\62\63\7\"\2\2\63\5\3\2\2\2\64\65\b\4\1\2\65\66\5\22\n\2\66\67\5\f\7"+
		"\2\678\5\22\n\28?\3\2\2\29:\7\34\2\2:;\5\6\4\2;<\7\35\2\2<?\3\2\2\2=?"+
		"\5\b\5\2>\64\3\2\2\2>9\3\2\2\2>=\3\2\2\2?F\3\2\2\2@A\f\5\2\2AB\5\n\6\2"+
		"BC\5\6\4\6CE\3\2\2\2D@\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\7\3\2\2"+
		"\2HF\3\2\2\2IM\5(\25\2JM\5\4\3\2KM\7#\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2"+
		"\2M\t\3\2\2\2NO\t\2\2\2O\13\3\2\2\2PQ\t\3\2\2Q\r\3\2\2\2RS\t\4\2\2S\17"+
		"\3\2\2\2TU\t\5\2\2U\21\3\2\2\2VW\b\n\1\2WX\7\34\2\2XY\5\22\n\2YZ\7\35"+
		"\2\2Z]\3\2\2\2[]\5\b\5\2\\V\3\2\2\2\\[\3\2\2\2]h\3\2\2\2^_\f\6\2\2_`\5"+
		"\20\t\2`a\5\22\n\7ag\3\2\2\2bc\f\5\2\2cd\5\16\b\2de\5\22\n\6eg\3\2\2\2"+
		"f^\3\2\2\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\23\3\2\2\2jh\3\2\2"+
		"\2kn\5\6\4\2ln\5\22\n\2mk\3\2\2\2ml\3\2\2\2n\25\3\2\2\2ox\5(\25\2px\5"+
		"\24\13\2qx\7#\2\2rx\5\4\3\2st\7\34\2\2tu\5\26\f\2uv\7\35\2\2vx\3\2\2\2"+
		"wo\3\2\2\2wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2\2x\27\3\2\2\2yz\7\13"+
		"\2\2z}\7#\2\2{|\7\32\2\2|~\5\26\f\2}{\3\2\2\2}~\3\2\2\2~\31\3\2\2\2\177"+
		"\u0080\7#\2\2\u0080\u0081\7\32\2\2\u0081\u0082\5\26\f\2\u0082\33\3\2\2"+
		"\2\u0083\u008c\5 \21\2\u0084\u008c\5(\25\2\u0085\u008c\5\30\r\2\u0086"+
		"\u008c\5\26\f\2\u0087\u008c\5&\24\2\u0088\u008c\5$\23\2\u0089\u008c\5"+
		"\32\16\2\u008a\u008c\5\36\20\2\u008b\u0083\3\2\2\2\u008b\u0084\3\2\2\2"+
		"\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\35\3\2\2\2\u008d"+
		"\u008e\7\f\2\2\u008e\u008f\5\26\f\2\u008f\37\3\2\2\2\u0090\u0091\7\n\2"+
		"\2\u0091\u0092\7#\2\2\u0092\u0093\7\34\2\2\u0093\u0094\5\"\22\2\u0094"+
		"\u0095\7\35\2\2\u0095\u0096\5,\27\2\u0096!\3\2\2\2\u0097\u0099\7#\2\2"+
		"\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a3\3\2\2\2\u009a\u009f"+
		"\7#\2\2\u009b\u009c\7 \2\2\u009c\u009e\7#\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u009a\3\2\2\2\u00a3"+
		"#\3\2\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7\5\26\f"+
		"\2\u00a7\u00a8\7\35\2\2\u00a8\u00ab\5,\27\2\u00a9\u00aa\7\7\2\2\u00aa"+
		"\u00ac\5,\27\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac%\3\2\2\2"+
		"\u00ad\u00ae\7\b\2\2\u00ae\u00af\7\34\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1"+
		"\7\35\2\2\u00b1\u00b2\5,\27\2\u00b2\'\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4"+
		"\u00b5\7\34\2\2\u00b5\u00b6\5*\26\2\u00b6\u00b7\7\35\2\2\u00b7)\3\2\2"+
		"\2\u00b8\u00ba\5\26\f\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00c4\3\2\2\2\u00bb\u00c0\5\26\f\2\u00bc\u00bd\7 \2\2\u00bd\u00bf\5\26"+
		"\f\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00b9\3\2"+
		"\2\2\u00c3\u00bb\3\2\2\2\u00c4+\3\2\2\2\u00c5\u00c6\7\36\2\2\u00c6\u00c7"+
		"\5.\30\2\u00c7\u00c8\7\37\2\2\u00c8-\3\2\2\2\u00c9\u00cb\5\34\17\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd/\3\2\2\2\u00ce\u00cc\3\2\2\2\24>FL\\fhmw}\u008b\u0098\u009f"+
		"\u00a2\u00ab\u00b9\u00c0\u00c3\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}