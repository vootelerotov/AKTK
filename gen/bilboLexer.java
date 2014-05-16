// Generated from /home/vootele/AKTK/AKTK/src/bilbo.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bilboLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, Visibility=9, 
		Simplejava=10, Number=11, String=12, TypeName=13, Name=14, Whitespace=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "Visibility", 
		"Simplejava", "Number", "String", "TypeName", "Name", "Whitespace"
	};


	public bilboLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bilbo.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\nN\n\n\3\13\7\13Q\n\13\f\13\16\13T\13\13\3\f\5"+
		"\fW\n\f\3\f\7\fZ\n\f\f\f\16\f]\13\f\3\f\5\f`\n\f\3\f\6\fc\n\f\r\f\16\f"+
		"d\3\r\3\r\7\ri\n\r\f\r\16\rl\13\r\3\r\3\r\3\16\3\16\7\16r\n\16\f\16\16"+
		"\16u\13\16\3\17\3\17\7\17y\n\17\f\17\16\17|\13\17\3\20\6\20\177\n\20\r"+
		"\20\16\20\u0080\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\t\4\2--//\3\2\62;\5\2\62;C\\"+
		"c|\3\2C\\\5\2\62;aac|\3\2c|\5\2\13\f\17\17\"\"\u008e\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5$\3\2\2\2\7&\3\2\2\2\t(\3"+
		"\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21\60\3\2\2\2\23M\3\2\2\2\25"+
		"R\3\2\2\2\27V\3\2\2\2\31f\3\2\2\2\33o\3\2\2\2\35v\3\2\2\2\37~\3\2\2\2"+
		"!\"\7\u0080\2\2\"#\7@\2\2#\4\3\2\2\2$%\7}\2\2%\6\3\2\2\2&\'\7+\2\2\'\b"+
		"\3\2\2\2()\7.\2\2)\n\3\2\2\2*+\7*\2\2+\f\3\2\2\2,-\7\177\2\2-\16\3\2\2"+
		"\2./\7=\2\2/\20\3\2\2\2\60\61\7u\2\2\61\62\7v\2\2\62\63\7c\2\2\63\64\7"+
		"v\2\2\64\65\7k\2\2\65\66\7e\2\2\66\22\3\2\2\2\678\7r\2\289\7w\2\29:\7"+
		"d\2\2:;\7n\2\2;<\7k\2\2<N\7e\2\2=>\7r\2\2>?\7t\2\2?@\7k\2\2@A\7x\2\2A"+
		"B\7c\2\2BC\7v\2\2CN\7g\2\2DE\7r\2\2EF\7t\2\2FG\7q\2\2GH\7v\2\2HI\7g\2"+
		"\2IJ\7e\2\2JK\7v\2\2KL\7g\2\2LN\7f\2\2M\67\3\2\2\2M=\3\2\2\2MD\3\2\2\2"+
		"N\24\3\2\2\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\26\3"+
		"\2\2\2TR\3\2\2\2UW\t\2\2\2VU\3\2\2\2VW\3\2\2\2W[\3\2\2\2XZ\t\3\2\2YX\3"+
		"\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^`\7\60\2\2"+
		"_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\t\3\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2e\30\3\2\2\2fj\7$\2\2gi\t\4\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2"+
		"\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7$\2\2n\32\3\2\2\2os\t\5\2\2pr\t\6"+
		"\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\34\3\2\2\2us\3\2\2\2vz\t"+
		"\7\2\2wy\t\6\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\36\3\2\2\2|"+
		"z\3\2\2\2}\177\t\b\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\20\2\2\u0083 \3\2\2\2"+
		"\r\2MRV[_djsz\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}