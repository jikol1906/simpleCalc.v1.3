// Generated from simpleCalc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OP1=8, OP2=9, 
		NUM=10, ID=11, WHITESPACE=12, COMMENT=13, VAR=14, CONST=15, IF=16, ELSE=17, 
		WHILE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "OP1", "OP2", 
		"NUM", "ID", "WHITESPACE", "COMMENT", "VAR", "CONST", "IF", "ELSE", "WHILE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'=='", "'!='", "'&&'", "'||'", null, null, 
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


	public simpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13?\n\13\r\13\16\13@\3\f\6\fD\n\f"+
		"\r\f\16\fE\3\r\6\rI\n\r\r\r\16\rJ\3\r\3\r\3\16\3\16\3\16\3\16\7\16S\n"+
		"\16\f\16\16\16V\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\4\2,,\61\61\4\2--//\4\2C\\c|\5"+
		"\2\13\f\17\17\"\"\3\2\f\f\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3"+
		"\2\2\2\t-\3\2\2\2\13\60\3\2\2\2\r\63\3\2\2\2\17\66\3\2\2\2\219\3\2\2\2"+
		"\23;\3\2\2\2\25>\3\2\2\2\27C\3\2\2\2\31H\3\2\2\2\33N\3\2\2\2\35Y\3\2\2"+
		"\2\37]\3\2\2\2!c\3\2\2\2#f\3\2\2\2%k\3\2\2\2\'(\7?\2\2(\4\3\2\2\2)*\7"+
		"*\2\2*\6\3\2\2\2+,\7+\2\2,\b\3\2\2\2-.\7?\2\2./\7?\2\2/\n\3\2\2\2\60\61"+
		"\7#\2\2\61\62\7?\2\2\62\f\3\2\2\2\63\64\7(\2\2\64\65\7(\2\2\65\16\3\2"+
		"\2\2\66\67\7~\2\2\678\7~\2\28\20\3\2\2\29:\t\2\2\2:\22\3\2\2\2;<\t\3\2"+
		"\2<\24\3\2\2\2=?\4\62;\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\26\3"+
		"\2\2\2BD\t\4\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\30\3\2\2\2G"+
		"I\t\5\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\b\r\2\2"+
		"M\32\3\2\2\2NO\7\61\2\2OP\7\61\2\2PT\3\2\2\2QS\n\6\2\2RQ\3\2\2\2SV\3\2"+
		"\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\b\16\2\2X\34\3\2\2\2YZ"+
		"\7x\2\2Z[\7c\2\2[\\\7t\2\2\\\36\3\2\2\2]^\7e\2\2^_\7q\2\2_`\7p\2\2`a\7"+
		"u\2\2ab\7v\2\2b \3\2\2\2cd\7k\2\2de\7h\2\2e\"\3\2\2\2fg\7g\2\2gh\7n\2"+
		"\2hi\7u\2\2ij\7g\2\2j$\3\2\2\2kl\7y\2\2lm\7j\2\2mn\7k\2\2no\7n\2\2op\7"+
		"g\2\2p&\3\2\2\2\7\2@EJT\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}