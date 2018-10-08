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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13@\n\13\r\13\16\13A\3\f\6\fE"+
		"\n\f\r\f\16\fF\3\r\6\rJ\n\r\r\r\16\rK\3\r\3\r\3\16\3\16\3\16\3\16\7\16"+
		"T\n\16\f\16\16\16W\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\4\2,,\61\61\4\2--//\4\2C"+
		"\\c|\5\2\13\f\17\17\"\"\3\2\f\f\2u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2"+
		"\2\7+\3\2\2\2\t-\3\2\2\2\13\60\3\2\2\2\r\64\3\2\2\2\17\67\3\2\2\2\21:"+
		"\3\2\2\2\23<\3\2\2\2\25?\3\2\2\2\27D\3\2\2\2\31I\3\2\2\2\33O\3\2\2\2\35"+
		"Z\3\2\2\2\37^\3\2\2\2!d\3\2\2\2#g\3\2\2\2%l\3\2\2\2\'(\7?\2\2(\4\3\2\2"+
		"\2)*\7*\2\2*\6\3\2\2\2+,\7+\2\2,\b\3\2\2\2-.\7?\2\2./\7?\2\2/\n\3\2\2"+
		"\2\60\61\7#\2\2\61\62\7?\2\2\62\63\7?\2\2\63\f\3\2\2\2\64\65\7(\2\2\65"+
		"\66\7(\2\2\66\16\3\2\2\2\678\7~\2\289\7~\2\29\20\3\2\2\2:;\t\2\2\2;\22"+
		"\3\2\2\2<=\t\3\2\2=\24\3\2\2\2>@\4\62;\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2"+
		"AB\3\2\2\2B\26\3\2\2\2CE\t\4\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2G\30\3\2\2\2HJ\t\5\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2"+
		"\2\2MN\b\r\2\2N\32\3\2\2\2OP\7\61\2\2PQ\7\61\2\2QU\3\2\2\2RT\n\6\2\2S"+
		"R\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\b\16\2\2"+
		"Y\34\3\2\2\2Z[\7x\2\2[\\\7c\2\2\\]\7t\2\2]\36\3\2\2\2^_\7e\2\2_`\7q\2"+
		"\2`a\7p\2\2ab\7u\2\2bc\7v\2\2c \3\2\2\2de\7k\2\2ef\7h\2\2f\"\3\2\2\2g"+
		"h\7g\2\2hi\7n\2\2ij\7u\2\2jk\7g\2\2k$\3\2\2\2lm\7y\2\2mn\7j\2\2no\7k\2"+
		"\2op\7n\2\2pq\7g\2\2q&\3\2\2\2\7\2AFKU\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}