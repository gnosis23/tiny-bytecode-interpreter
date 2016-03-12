// Generated from E:/workspace/tiny-bytecode-interp/src/main/java/org/bohao/vm/parser\Byte.g4 by ANTLR 4.5.1
package org.bohao.vm.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ByteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INT=5, REGISTER=6, NAME=7, NEWLINE=8, 
		WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "INT", "REGISTER", "NAME", "CHAR", "DIGIT", 
		"NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.func'", "'.arg='", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "INT", "REGISTER", "NAME", "NEWLINE", "WS"
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


	    void addFunction(String name, int nArgs){;}
	    void addLabel(String name){;}
	    void addCode(String instruction){;}
	    void addCode(String instruction, String a){;}
	    void addCode(String instruction, String a, String b){;}
	    void addCode(String instruction, String a, String b, String c){;}


	public ByteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Byte.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\6\6+\n\6\r\6\16\6,\3\7\3\7\3\7\3\b\3\b\3\b\6\b\65\n\b\r\b\16"+
		"\b\66\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\7\13A\n\13\f\13\16\13D\13\13"+
		"\5\13F\n\13\3\13\5\13I\n\13\3\13\3\13\3\f\6\fN\n\f\r\f\16\fO\3\f\3\f\3"+
		"B\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\n\27\13\3\2\6\4\2TTt"+
		"t\4\2C\\c|\3\2\62;\4\2\13\13\"\"W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\3\31\3\2\2\2\5\37\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13*\3\2\2\2\r"+
		".\3\2\2\2\17\61\3\2\2\2\218\3\2\2\2\23:\3\2\2\2\25E\3\2\2\2\27M\3\2\2"+
		"\2\31\32\7\60\2\2\32\33\7h\2\2\33\34\7w\2\2\34\35\7p\2\2\35\36\7e\2\2"+
		"\36\4\3\2\2\2\37 \7\60\2\2 !\7c\2\2!\"\7t\2\2\"#\7i\2\2#$\7?\2\2$\6\3"+
		"\2\2\2%&\7.\2\2&\b\3\2\2\2\'(\7<\2\2(\n\3\2\2\2)+\5\23\n\2*)\3\2\2\2+"+
		",\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\f\3\2\2\2./\t\2\2\2/\60\5\13\6\2\60\16"+
		"\3\2\2\2\61\64\5\21\t\2\62\65\5\21\t\2\63\65\5\23\n\2\64\62\3\2\2\2\64"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\20\3\2\2\289"+
		"\t\3\2\29\22\3\2\2\2:;\t\4\2\2;\24\3\2\2\2<=\7\61\2\2=>\7\61\2\2>B\3\2"+
		"\2\2?A\13\2\2\2@?\3\2\2\2AD\3\2\2\2BC\3\2\2\2B@\3\2\2\2CF\3\2\2\2DB\3"+
		"\2\2\2E<\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\7\17\2\2HG\3\2\2\2HI\3\2\2\2IJ"+
		"\3\2\2\2JK\7\f\2\2K\26\3\2\2\2LN\t\5\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2PQ\3\2\2\2QR\b\f\2\2R\30\3\2\2\2\n\2,\64\66BEHO\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}