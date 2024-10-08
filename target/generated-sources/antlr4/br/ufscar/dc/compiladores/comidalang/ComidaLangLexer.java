// Generated from br\u005Cufscar\dc\compiladores\comidalang\ComidaLang.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.comidalang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ComidaLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NOME=21, TIPO_REFEICAO=22, NUMINT=23, DATA=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "NOME", "TIPO_REFEICAO", "NUMINT", "DATA", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nome:'", "'dia da semana:'", "'data:'", "'REFEICAO'", "'alimentos:'", 
			"'tipo:'", "'horario:'", "'horas e'", "'minutos'", "'calorias:'", "'kcal'", 
			"'END_REFEICAO'", "'e'", "'GOSTOS'", "'END_GOSTOS'", "'gosto de'", "'PLANEJAMENTO'", 
			"'END_PLANEJAMENTO'", "'dia:'", "'refeicao:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NOME", "TIPO_REFEICAO", 
			"NUMINT", "DATA", "WS"
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


	public ComidaLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ComidaLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0125\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00ec"+
		"\n\26\f\26\16\26\u00ef\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0112\n\27"+
		"\3\30\6\30\u0115\n\30\r\30\16\30\u0116\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\6\32\u0120\n\32\r\32\16\32\u0121\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\3\2\4\6\2\f\f\17\17$$^^\5\2\13\f\17"+
		"\17\"\"\2\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5;\3\2\2\2\7J\3"+
		"\2\2\2\tP\3\2\2\2\13Y\3\2\2\2\rd\3\2\2\2\17j\3\2\2\2\21s\3\2\2\2\23{\3"+
		"\2\2\2\25\u0083\3\2\2\2\27\u008d\3\2\2\2\31\u0092\3\2\2\2\33\u009f\3\2"+
		"\2\2\35\u00a1\3\2\2\2\37\u00a8\3\2\2\2!\u00b3\3\2\2\2#\u00bc\3\2\2\2%"+
		"\u00c9\3\2\2\2\'\u00da\3\2\2\2)\u00df\3\2\2\2+\u00e9\3\2\2\2-\u0111\3"+
		"\2\2\2/\u0114\3\2\2\2\61\u0118\3\2\2\2\63\u011f\3\2\2\2\65\66\7p\2\2\66"+
		"\67\7q\2\2\678\7o\2\289\7g\2\29:\7<\2\2:\4\3\2\2\2;<\7f\2\2<=\7k\2\2="+
		">\7c\2\2>?\7\"\2\2?@\7f\2\2@A\7c\2\2AB\7\"\2\2BC\7u\2\2CD\7g\2\2DE\7o"+
		"\2\2EF\7c\2\2FG\7p\2\2GH\7c\2\2HI\7<\2\2I\6\3\2\2\2JK\7f\2\2KL\7c\2\2"+
		"LM\7v\2\2MN\7c\2\2NO\7<\2\2O\b\3\2\2\2PQ\7T\2\2QR\7G\2\2RS\7H\2\2ST\7"+
		"G\2\2TU\7K\2\2UV\7E\2\2VW\7C\2\2WX\7Q\2\2X\n\3\2\2\2YZ\7c\2\2Z[\7n\2\2"+
		"[\\\7k\2\2\\]\7o\2\2]^\7g\2\2^_\7p\2\2_`\7v\2\2`a\7q\2\2ab\7u\2\2bc\7"+
		"<\2\2c\f\3\2\2\2de\7v\2\2ef\7k\2\2fg\7r\2\2gh\7q\2\2hi\7<\2\2i\16\3\2"+
		"\2\2jk\7j\2\2kl\7q\2\2lm\7t\2\2mn\7c\2\2no\7t\2\2op\7k\2\2pq\7q\2\2qr"+
		"\7<\2\2r\20\3\2\2\2st\7j\2\2tu\7q\2\2uv\7t\2\2vw\7c\2\2wx\7u\2\2xy\7\""+
		"\2\2yz\7g\2\2z\22\3\2\2\2{|\7o\2\2|}\7k\2\2}~\7p\2\2~\177\7w\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7q\2\2\u0081\u0082\7u\2\2\u0082\24\3\2\2\2\u0083\u0084"+
		"\7e\2\2\u0084\u0085\7c\2\2\u0085\u0086\7n\2\2\u0086\u0087\7q\2\2\u0087"+
		"\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089\u008a\7c\2\2\u008a\u008b\7u\2\2"+
		"\u008b\u008c\7<\2\2\u008c\26\3\2\2\2\u008d\u008e\7m\2\2\u008e\u008f\7"+
		"e\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\30\3\2\2\2\u0092\u0093"+
		"\7G\2\2\u0093\u0094\7P\2\2\u0094\u0095\7F\2\2\u0095\u0096\7a\2\2\u0096"+
		"\u0097\7T\2\2\u0097\u0098\7G\2\2\u0098\u0099\7H\2\2\u0099\u009a\7G\2\2"+
		"\u009a\u009b\7K\2\2\u009b\u009c\7E\2\2\u009c\u009d\7C\2\2\u009d\u009e"+
		"\7Q\2\2\u009e\32\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\34\3\2\2\2\u00a1\u00a2"+
		"\7I\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7U\2\2\u00a4\u00a5\7V\2\2\u00a5"+
		"\u00a6\7Q\2\2\u00a6\u00a7\7U\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7G\2\2\u00a9"+
		"\u00aa\7P\2\2\u00aa\u00ab\7F\2\2\u00ab\u00ac\7a\2\2\u00ac\u00ad\7I\2\2"+
		"\u00ad\u00ae\7Q\2\2\u00ae\u00af\7U\2\2\u00af\u00b0\7V\2\2\u00b0\u00b1"+
		"\7Q\2\2\u00b1\u00b2\7U\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7i\2\2\u00b4\u00b5"+
		"\7q\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"\u00b9\7\"\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7g\2\2\u00bb\"\3\2\2\2\u00bc"+
		"\u00bd\7R\2\2\u00bd\u00be\7N\2\2\u00be\u00bf\7C\2\2\u00bf\u00c0\7P\2\2"+
		"\u00c0\u00c1\7G\2\2\u00c1\u00c2\7L\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4"+
		"\7O\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7V\2\2\u00c7"+
		"\u00c8\7Q\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7P\2\2\u00cb"+
		"\u00cc\7F\2\2\u00cc\u00cd\7a\2\2\u00cd\u00ce\7R\2\2\u00ce\u00cf\7N\2\2"+
		"\u00cf\u00d0\7C\2\2\u00d0\u00d1\7P\2\2\u00d1\u00d2\7G\2\2\u00d2\u00d3"+
		"\7L\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7O\2\2\u00d5\u00d6\7G\2\2\u00d6"+
		"\u00d7\7P\2\2\u00d7\u00d8\7V\2\2\u00d8\u00d9\7Q\2\2\u00d9&\3\2\2\2\u00da"+
		"\u00db\7f\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7<\2\2"+
		"\u00de(\3\2\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7h\2"+
		"\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6"+
		"\7c\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7<\2\2\u00e8*\3\2\2\2\u00e9\u00ed"+
		"\7$\2\2\u00ea\u00ec\n\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\7$\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7E\2\2\u00f3\u00f4"+
		"\7c\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7\"\2\2\u00f7"+
		"\u00f8\7f\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\7O\2"+
		"\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7j\2\2\u00fe\u0112"+
		"\7c\2\2\u00ff\u0100\7C\2\2\u0100\u0101\7n\2\2\u0101\u0102\7o\2\2\u0102"+
		"\u0103\7q\2\2\u0103\u0104\7e\2\2\u0104\u0112\7q\2\2\u0105\u0106\7N\2\2"+
		"\u0106\u0107\7c\2\2\u0107\u0108\7p\2\2\u0108\u0109\7e\2\2\u0109\u010a"+
		"\7j\2\2\u010a\u0112\7g\2\2\u010b\u010c\7L\2\2\u010c\u010d\7c\2\2\u010d"+
		"\u010e\7p\2\2\u010e\u010f\7v\2\2\u010f\u0110\7c\2\2\u0110\u0112\7t\2\2"+
		"\u0111\u00f2\3\2\2\2\u0111\u00ff\3\2\2\2\u0111\u0105\3\2\2\2\u0111\u010b"+
		"\3\2\2\2\u0112.\3\2\2\2\u0113\u0115\4\62;\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\60\3\2\2"+
		"\2\u0118\u0119\5/\30\2\u0119\u011a\7\61\2\2\u011a\u011b\5/\30\2\u011b"+
		"\u011c\7\61\2\2\u011c\u011d\5/\30\2\u011d\62\3\2\2\2\u011e\u0120\t\3\2"+
		"\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b\32\2\2\u0124\64\3\2\2\2\7\2"+
		"\u00ed\u0111\u0116\u0121\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}