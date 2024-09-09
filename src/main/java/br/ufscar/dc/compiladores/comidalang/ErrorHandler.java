/*
 * ErrorHandler.java is a class where some ANTLR default errors are overwritten.
 * Instead of them, I defined my set of error messages
 */


package br.ufscar.dc.compiladores.comidalang;

import java.io.PrintWriter;
import java.util.BitSet;
import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class ErrorHandler implements ANTLRErrorListener {

    private List<String> errosSintaticos;

    public ErrorHandler(List<String> errosSintaticos) {
        this.errosSintaticos = errosSintaticos;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Token t = (Token) offendingSymbol;
        String erro = "Linha " + line + ": erro sintatico proximo a " + t.getText();
        errosSintaticos.add(erro);
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        // Não será necessário para este projeto
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        // Não será necessário para este projeto
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {

    }

}