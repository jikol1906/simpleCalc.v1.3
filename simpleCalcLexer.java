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
		T__0=1, T__1=2, T__2=3, OP1=4, OP2=5, NUM=6, ID=7, WHITESPACE=8, COMMENT=9, 
		VAR=10, CONST=11, IF=12, ELSE=13, WHILE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "OP1", "OP2", "NUM", "ID", "WHITESPACE", "COMMENT", 
		"VAR", "CONST", "IF", "ELSE", "WHILE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", null, null, null, null, null, null, "'var'", 
		"'const'", "'if'", "'else'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "OP1", "OP2", "NUM", "ID", "WHITESPACE", "COMMENT", 
		"VAR", "CONST", "IF", "ELSE", "WHILE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\6\7+\n\7\r\7\16\7,\3\b\6\b\60\n\b\r\b\16\b\61\3\t\6\t\65"+
		"\n\t\r\t\16\t\66\3\t\3\t\3\n\3\n\3\n\3\n\7\n?\n\n\f\n\16\nB\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\7\4\2,,\61\61\4"+
		"\2--//\4\2C\\c|\5\2\13\f\17\17\"\"\3\2\f\f\2`\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2"+
		"\2\2\r*\3\2\2\2\17/\3\2\2\2\21\64\3\2\2\2\23:\3\2\2\2\25E\3\2\2\2\27I"+
		"\3\2\2\2\31O\3\2\2\2\33R\3\2\2\2\35W\3\2\2\2\37 \7?\2\2 \4\3\2\2\2!\""+
		"\7*\2\2\"\6\3\2\2\2#$\7+\2\2$\b\3\2\2\2%&\t\2\2\2&\n\3\2\2\2\'(\t\3\2"+
		"\2(\f\3\2\2\2)+\4\62;\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\16\3"+
		"\2\2\2.\60\t\4\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\20\3\2\2\2\63\65\t\5\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\678\3\2\2\289\b\t\2\29\22\3\2\2\2:;\7\61\2\2;<\7\61\2\2<@"+
		"\3\2\2\2=?\n\6\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B"+
		"@\3\2\2\2CD\b\n\2\2D\24\3\2\2\2EF\7x\2\2FG\7c\2\2GH\7t\2\2H\26\3\2\2\2"+
		"IJ\7e\2\2JK\7q\2\2KL\7p\2\2LM\7u\2\2MN\7v\2\2N\30\3\2\2\2OP\7k\2\2PQ\7"+
		"h\2\2Q\32\3\2\2\2RS\7g\2\2ST\7n\2\2TU\7u\2\2UV\7g\2\2V\34\3\2\2\2WX\7"+
		"y\2\2XY\7j\2\2YZ\7k\2\2Z[\7n\2\2[\\\7g\2\2\\\36\3\2\2\2\7\2,\61\66@\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}