package br.ufscar.dc.compiladores.comidalang;
import br.ufscar.dc.compiladores.comidalang.ComidaLangLexer;
import br.ufscar.dc.compiladores.comidalang.ComidaLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
    public static void main(String[] args) throws IOException {
        String inputFile = args[0];
        String outputFile = args[1];

        ComidaLangLexer lexer = new ComidaLangLexer(CharStreams.fromFileName(inputFile));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ComidaLangParser parser = new ComidaLangParser(tokens);

        ComidaLangParser.ProgramContext tree = parser.program();

        // Análise Semântica
        ComidaSemantico semantico = new ComidaSemantico();
        semantico.visit(tree);
        semantico.verificarRefeicoesNaoUsadas();

        // Geração de Código
        ComidaGenerator generator = new ComidaGenerator();
        generator.visit(tree);
        try {
            generator.gerarHTML(outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
