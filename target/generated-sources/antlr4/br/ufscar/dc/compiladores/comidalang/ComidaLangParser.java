// Generated from br\u005Cufscar\dc\compiladores\comidalang\ComidaLang.g4 by ANTLR 4.9.2
package br.ufscar.dc.compiladores.comidalang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ComidaLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, NOME=21, TIPO_REFEICAO=22, NUMINT=23, DATA=24, 
		WS=25;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_info = 2, RULE_bloco_refeicao = 3, 
		RULE_alimentos = 4, RULE_bloco_gostos = 5, RULE_gosto = 6, RULE_bloco_planejamento = 7, 
		RULE_planejamento = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "info", "bloco_refeicao", "alimentos", "bloco_gostos", 
			"gosto", "bloco_planejamento", "planejamento"
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

	@Override
	public String getGrammarFileName() { return "ComidaLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ComidaLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ComidaLangParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComidaLangVisitor ) return ((ComidaLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			body();
			setState(19);
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

	public static class BodyContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public List<Bloco_refeicaoContext> bloco_refeicao() {
			return getRuleContexts(Bloco_refeicaoContext.class);
		}
		public Bloco_refeicaoContext bloco_refeicao(int i) {
			return getRuleContext(Bloco_refeicaoContext.class,i);
		}
		public Bloco_gostosContext bloco_gostos() {
			return getRuleContext(Bloco_gostosContext.class,0);
		}
		public Bloco_planejamentoContext bloco_planejamento() {
			return getRuleContext(Bloco_planejamentoContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComidaLangVisitor ) return ((ComidaLangVisitor<? extends T>)visitor).visitBody(this);
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
			setState(21);
			info();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(22);
				bloco_refeicao();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(28);
				bloco_gostos();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(31);
				bloco_planejamento();
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

	public static class InfoContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(ComidaLangParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(ComidaLangParser.NOME, i);
		}
		public TerminalNode DATA() { return getToken(ComidaLangParser.DATA, 0); }
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComidaLangVisitor ) return ((ComidaLangVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(NOME);
			setState(36);
			match(T__1);
			setState(37);
			match(NOME);
			setState(38);
			match(T__2);
			setState(39);
			match(DATA);
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

	public static class Bloco_refeicaoContext extends ParserRuleContext {
		public AlimentosContext alimentos() {
			return getRuleContext(AlimentosContext.class,0);
		}
		public TerminalNode TIPO_REFEICAO() { return getToken(ComidaLangParser.TIPO_REFEICAO, 0); }
		public List<TerminalNode> NUMINT() { return getTokens(ComidaLangParser.NUMINT); }
		public TerminalNode NUMINT(int i) {
			return getToken(ComidaLangParser.NUMINT, i);
		}
		public Bloco_refeicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_refeicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).enterBloco_refeicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).exitBloco_refeicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComidaLangVisitor ) return ((ComidaLangVisitor<? extends T>)visitor).visitBloco_refeicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_refeicaoContext bloco_refeicao() throws RecognitionException {
		Bloco_refeicaoContext _localctx = new Bloco_refeicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco_refeicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__3);
			setState(42);
			match(T__4);
			setState(43);
			alimentos();
			setState(44);
			match(T__5);
			setState(45);
			match(TIPO_REFEICAO);
			setState(46);
			match(T__6);
			setState(47);
			match(NUMINT);
			setState(48);
			match(T__7);
			setState(49);
			match(NUMINT);
			setState(50);
			match(T__8);
			setState(51);
			match(T__9);
			setState(52);
			match(NUMINT);
			setState(53);
			match(T__10);
			setState(54);
			match(T__11);
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

	public static class AlimentosContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(ComidaLangParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(ComidaLangParser.NOME, i);
		}
		public AlimentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alimentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).enterAlimentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).exitAlimentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComidaLangVisitor ) return ((ComidaLangVisitor<? extends T>)visitor).visitAlimentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlimentosContext alimentos() throws RecognitionException {
		AlimentosContext _localctx = new AlimentosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alimentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(NOME);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(57);
				match(T__12);
				setState(58);
				match(NOME);
				}
				}
				setState(63);
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

	public static class Bloco_gostosContext extends ParserRuleContext {
		public List<GostoContext> gosto() {
			return getRuleContexts(GostoContext.class);
		}
		public GostoContext gosto(int i) {
			return getRuleContext(GostoContext.class,i);
		}
		public Bloco_gostosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_gostos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).enterBloco_gostos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).exitBloco_gostos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComidaLangVisitor ) return ((ComidaLangVisitor<? extends T>)visitor).visitBloco_gostos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_gostosContext bloco_gostos() throws RecognitionException {
		Bloco_gostosContext _localctx = new Bloco_gostosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco_gostos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__13);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				gosto();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			setState(70);
			match(T__14);
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

	public static class GostoContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(ComidaLangParser.NOME, 0); }
		public GostoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gosto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).enterGosto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).exitGosto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComidaLangVisitor ) return ((ComidaLangVisitor<? extends T>)visitor).visitGosto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GostoContext gosto() throws RecognitionException {
		GostoContext _localctx = new GostoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gosto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__15);
			setState(73);
			match(NOME);
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

	public static class Bloco_planejamentoContext extends ParserRuleContext {
		public List<PlanejamentoContext> planejamento() {
			return getRuleContexts(PlanejamentoContext.class);
		}
		public PlanejamentoContext planejamento(int i) {
			return getRuleContext(PlanejamentoContext.class,i);
		}
		public Bloco_planejamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_planejamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).enterBloco_planejamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).exitBloco_planejamento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComidaLangVisitor ) return ((ComidaLangVisitor<? extends T>)visitor).visitBloco_planejamento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloco_planejamentoContext bloco_planejamento() throws RecognitionException {
		Bloco_planejamentoContext _localctx = new Bloco_planejamentoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco_planejamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__16);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				planejamento();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			setState(81);
			match(T__17);
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

	public static class PlanejamentoContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(ComidaLangParser.DATA, 0); }
		public AlimentosContext alimentos() {
			return getRuleContext(AlimentosContext.class,0);
		}
		public PlanejamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planejamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).enterPlanejamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComidaLangListener ) ((ComidaLangListener)listener).exitPlanejamento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComidaLangVisitor ) return ((ComidaLangVisitor<? extends T>)visitor).visitPlanejamento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanejamentoContext planejamento() throws RecognitionException {
		PlanejamentoContext _localctx = new PlanejamentoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_planejamento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__18);
			setState(84);
			match(DATA);
			setState(85);
			match(T__19);
			setState(86);
			alimentos();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\5\3 \n\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\7\3\7\6\7E\n\7\r\7\16"+
		"\7F\3\7\3\7\3\b\3\b\3\b\3\t\3\t\6\tP\n\t\r\t\16\tQ\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2W\2\24\3\2\2\2\4\27\3\2"+
		"\2\2\6$\3\2\2\2\b+\3\2\2\2\n:\3\2\2\2\fB\3\2\2\2\16J\3\2\2\2\20M\3\2\2"+
		"\2\22U\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27\33\5\6\4\2"+
		"\30\32\5\b\5\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2"+
		"\34\37\3\2\2\2\35\33\3\2\2\2\36 \5\f\7\2\37\36\3\2\2\2\37 \3\2\2\2 \""+
		"\3\2\2\2!#\5\20\t\2\"!\3\2\2\2\"#\3\2\2\2#\5\3\2\2\2$%\7\3\2\2%&\7\27"+
		"\2\2&\'\7\4\2\2\'(\7\27\2\2()\7\5\2\2)*\7\32\2\2*\7\3\2\2\2+,\7\6\2\2"+
		",-\7\7\2\2-.\5\n\6\2./\7\b\2\2/\60\7\30\2\2\60\61\7\t\2\2\61\62\7\31\2"+
		"\2\62\63\7\n\2\2\63\64\7\31\2\2\64\65\7\13\2\2\65\66\7\f\2\2\66\67\7\31"+
		"\2\2\678\7\r\2\289\7\16\2\29\t\3\2\2\2:?\7\27\2\2;<\7\17\2\2<>\7\27\2"+
		"\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2A?\3\2\2\2BD\7\20"+
		"\2\2CE\5\16\b\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7"+
		"\21\2\2I\r\3\2\2\2JK\7\22\2\2KL\7\27\2\2L\17\3\2\2\2MO\7\23\2\2NP\5\22"+
		"\n\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\24\2\2T\21"+
		"\3\2\2\2UV\7\25\2\2VW\7\32\2\2WX\7\26\2\2XY\5\n\6\2Y\23\3\2\2\2\b\33\37"+
		"\"?FQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}