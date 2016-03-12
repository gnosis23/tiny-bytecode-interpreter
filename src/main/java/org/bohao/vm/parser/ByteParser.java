// Generated from E:/workspace/tiny-bytecode-interp/src/main/java/org/bohao/vm/parser\Byte.g4 by ANTLR 4.5.1
package org.bohao.vm.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ByteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INT=5, REGISTER=6, NAME=7, NEWLINE=8, 
		WS=9;
	public static final int
		RULE_line = 0, RULE_stat = 1, RULE_func = 2, RULE_command = 3, RULE_label = 4, 
		RULE_operand = 5;
	public static final String[] ruleNames = {
		"line", "stat", "func", "command", "label", "operand"
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

	@Override
	public String getGrammarFileName() { return "Byte.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    void addFunction(String name, int nArgs){;}
	    void addLabel(String name){;}
	    void addCode(String instruction){;}
	    void addCode(String instruction, String a){;}
	    void addCode(String instruction, String a, String b){;}
	    void addCode(String instruction, String a, String b, String c){;}

	public ByteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LineContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NAME) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ByteParser.NEWLINE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(27);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				func();
				setState(18);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				label();
				setState(21);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				command();
				setState(24);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(NEWLINE);
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

	public static class FuncContext extends ParserRuleContext {
		public Token NAME;
		public Token INT;
		public TerminalNode NAME() { return getToken(ByteParser.NAME, 0); }
		public TerminalNode INT() { return getToken(ByteParser.INT, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			((FuncContext)_localctx).NAME = match(NAME);
			setState(31);
			match(T__1);
			setState(32);
			((FuncContext)_localctx).INT = match(INT);
			addFunction((((FuncContext)_localctx).NAME!=null?((FuncContext)_localctx).NAME.getText():null), (((FuncContext)_localctx).INT!=null?Integer.valueOf(((FuncContext)_localctx).INT.getText()):0));
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

	public static class CommandContext extends ParserRuleContext {
		public Token NAME;
		public OperandContext a;
		public OperandContext b;
		public OperandContext c;
		public TerminalNode NAME() { return getToken(ByteParser.NAME, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((CommandContext)_localctx).NAME = match(NAME);
				addCode((((CommandContext)_localctx).NAME!=null?((CommandContext)_localctx).NAME.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				((CommandContext)_localctx).NAME = match(NAME);
				setState(38);
				((CommandContext)_localctx).a = operand();
				addCode((((CommandContext)_localctx).NAME!=null?((CommandContext)_localctx).NAME.getText():null), (((CommandContext)_localctx).a!=null?_input.getText(((CommandContext)_localctx).a.start,((CommandContext)_localctx).a.stop):null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				((CommandContext)_localctx).NAME = match(NAME);
				setState(42);
				((CommandContext)_localctx).a = operand();
				setState(43);
				match(T__2);
				setState(44);
				((CommandContext)_localctx).b = operand();
				addCode((((CommandContext)_localctx).NAME!=null?((CommandContext)_localctx).NAME.getText():null), (((CommandContext)_localctx).a!=null?_input.getText(((CommandContext)_localctx).a.start,((CommandContext)_localctx).a.stop):null), (((CommandContext)_localctx).b!=null?_input.getText(((CommandContext)_localctx).b.start,((CommandContext)_localctx).b.stop):null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				((CommandContext)_localctx).NAME = match(NAME);
				setState(48);
				((CommandContext)_localctx).a = operand();
				setState(49);
				match(T__2);
				setState(50);
				((CommandContext)_localctx).b = operand();
				setState(51);
				match(T__2);
				setState(52);
				((CommandContext)_localctx).c = operand();
				addCode((((CommandContext)_localctx).NAME!=null?((CommandContext)_localctx).NAME.getText():null), (((CommandContext)_localctx).a!=null?_input.getText(((CommandContext)_localctx).a.start,((CommandContext)_localctx).a.stop):null), (((CommandContext)_localctx).b!=null?_input.getText(((CommandContext)_localctx).b.start,((CommandContext)_localctx).b.stop):null), (((CommandContext)_localctx).c!=null?_input.getText(((CommandContext)_localctx).c.start,((CommandContext)_localctx).c.stop):null));
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

	public static class LabelContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode NAME() { return getToken(ByteParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((LabelContext)_localctx).NAME = match(NAME);
			setState(58);
			match(T__3);
			addLabel((((LabelContext)_localctx).NAME!=null?((LabelContext)_localctx).NAME.getText():null));
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ByteParser.INT, 0); }
		public TerminalNode REGISTER() { return getToken(ByteParser.REGISTER, 0); }
		public TerminalNode NAME() { return getToken(ByteParser.NAME, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << REGISTER) | (1L << NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3"+
		"\2\7\tB\2\17\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b9\3\2\2\2\n;\3\2\2\2\f"+
		"?\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22"+
		"\3\2\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24\25\7\n\2\2\25\36\3\2\2\2\26\27"+
		"\5\n\6\2\27\30\7\n\2\2\30\36\3\2\2\2\31\32\5\b\5\2\32\33\7\n\2\2\33\36"+
		"\3\2\2\2\34\36\7\n\2\2\35\23\3\2\2\2\35\26\3\2\2\2\35\31\3\2\2\2\35\34"+
		"\3\2\2\2\36\5\3\2\2\2\37 \7\3\2\2 !\7\t\2\2!\"\7\4\2\2\"#\7\7\2\2#$\b"+
		"\4\1\2$\7\3\2\2\2%&\7\t\2\2&:\b\5\1\2\'(\7\t\2\2()\5\f\7\2)*\b\5\1\2*"+
		":\3\2\2\2+,\7\t\2\2,-\5\f\7\2-.\7\5\2\2./\5\f\7\2/\60\b\5\1\2\60:\3\2"+
		"\2\2\61\62\7\t\2\2\62\63\5\f\7\2\63\64\7\5\2\2\64\65\5\f\7\2\65\66\7\5"+
		"\2\2\66\67\5\f\7\2\678\b\5\1\28:\3\2\2\29%\3\2\2\29\'\3\2\2\29+\3\2\2"+
		"\29\61\3\2\2\2:\t\3\2\2\2;<\7\t\2\2<=\7\6\2\2=>\b\6\1\2>\13\3\2\2\2?@"+
		"\t\2\2\2@\r\3\2\2\2\5\21\359";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}