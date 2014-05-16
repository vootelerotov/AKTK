// Generated from /home/vootele/AKTK/AKTK/src/bilbo.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bilboParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, Visibility=9, 
		Simplejava=10, Number=11, String=12, TypeName=13, Name=14, Whitespace=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'~>'", "'{'", "')'", "','", "'('", "'}'", "';'", "'static'", 
		"Visibility", "Simplejava", "Number", "String", "TypeName", "Name", "Whitespace"
	};
	public static final int
		RULE_header = 0, RULE_body = 1, RULE_line = 2, RULE_java = 3, RULE_head = 4, 
		RULE_args = 5, RULE_arg = 6, RULE_var = 7, RULE_match = 8, RULE_name = 9, 
		RULE_type = 10, RULE_trree = 11;
	public static final String[] ruleNames = {
		"header", "body", "line", "java", "head", "args", "arg", "var", "match", 
		"name", "type", "trree"
	};

	@Override
	public String getGrammarFileName() { return "bilbo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bilboParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HeaderContext extends ParserRuleContext {
		public TrreeContext trree() {
			return getRuleContext(TrreeContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode Visibility() { return getToken(bilboParser.Visibility, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if (_la==Visibility) {
				{
				setState(24); match(Visibility);
				}
			}

			setState(27); match(T__0);
			setState(28); type();
			setState(29); name();
			setState(30); match(T__3);
			setState(31); type();
			setState(32); trree();
			setState(33); match(T__5);
			setState(34); match(T__6);
			setState(35); body();
			setState(36); match(T__2);
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

	public static class BodyContext extends ParserRuleContext {
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); line();
				setState(39); match(T__1);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TypeName );
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

	public static class LineContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public JavaContext java() {
			return getRuleContext(JavaContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); head();
			setState(46); match(T__7);
			setState(47); java();
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

	public static class JavaContext extends ParserRuleContext {
		public List<TerminalNode> Simplejava() { return getTokens(bilboParser.Simplejava); }
		public TerminalNode Simplejava(int i) {
			return getToken(bilboParser.Simplejava, i);
		}
		public JavaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterJava(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitJava(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitJava(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaContext java() throws RecognitionException {
		JavaContext _localctx = new JavaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_java);
		int _la;
		try {
			setState(58);
			switch (_input.LA(1)) {
			case Simplejava:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); match(Simplejava);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(T__6);
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51); match(Simplejava);
					setState(52); match(T__1);
					}
					}
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Simplejava );
				setState(57); match(T__2);
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

	public static class HeadContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); type();
			setState(61); match(T__3);
			setState(63);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << String) | (1L << Name))) != 0)) {
				{
				setState(62); args();
				}
			}

			setState(65); match(T__5);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); arg();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(68); match(T__4);
				setState(69); arg();
				}
				}
				setState(74);
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

	public static class ArgContext extends ParserRuleContext {
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arg);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); var();
				}
				break;
			case Number:
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(bilboParser.Name, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(Name);
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

	public static class MatchContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(bilboParser.String, 0); }
		public TerminalNode Number() { return getToken(bilboParser.Number, 0); }
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(bilboParser.Name, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(Name);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TypeName() { return getToken(bilboParser.TypeName, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(TypeName);
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

	public static class TrreeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(bilboParser.Name, 0); }
		public TrreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).enterTrree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bilboListener ) ((bilboListener)listener).exitTrree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bilboVisitor ) return ((bilboVisitor<? extends T>)visitor).visitTrree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrreeContext trree() throws RecognitionException {
		TrreeContext _localctx = new TrreeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_trree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(Name);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\4\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\6\58\n\5\r\5\16\59\3\5\5\5=\n\5\3\6\3\6\3\6\5\6B\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\7\7I\n\7\f\7\16\7L\13\7\3\b\3\b\5\bP\n\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\r\16"+
		"V\2\33\3\2\2\2\4+\3\2\2\2\6/\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\fE\3\2\2\2"+
		"\16O\3\2\2\2\20Q\3\2\2\2\22S\3\2\2\2\24U\3\2\2\2\26W\3\2\2\2\30Y\3\2\2"+
		"\2\32\34\7\13\2\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\n"+
		"\2\2\36\37\5\26\f\2\37 \5\24\13\2 !\7\7\2\2!\"\5\26\f\2\"#\5\30\r\2#$"+
		"\7\5\2\2$%\7\4\2\2%&\5\4\3\2&\'\7\b\2\2\'\3\3\2\2\2()\5\6\4\2)*\7\t\2"+
		"\2*,\3\2\2\2+(\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/\60\5"+
		"\n\6\2\60\61\7\3\2\2\61\62\5\b\5\2\62\7\3\2\2\2\63=\7\f\2\2\64\67\7\4"+
		"\2\2\65\66\7\f\2\2\668\7\t\2\2\67\65\3\2\2\289\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:;\3\2\2\2;=\7\b\2\2<\63\3\2\2\2<\64\3\2\2\2=\t\3\2\2\2>?\5\26\f"+
		"\2?A\7\7\2\2@B\5\f\7\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\5\2\2D\13\3\2"+
		"\2\2EJ\5\16\b\2FG\7\6\2\2GI\5\16\b\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2K\r\3\2\2\2LJ\3\2\2\2MP\5\20\t\2NP\5\22\n\2OM\3\2\2\2ON\3\2\2\2"+
		"P\17\3\2\2\2QR\7\20\2\2R\21\3\2\2\2ST\t\2\2\2T\23\3\2\2\2UV\7\20\2\2V"+
		"\25\3\2\2\2WX\7\17\2\2X\27\3\2\2\2YZ\7\20\2\2Z\31\3\2\2\2\t\33-9<AJO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}