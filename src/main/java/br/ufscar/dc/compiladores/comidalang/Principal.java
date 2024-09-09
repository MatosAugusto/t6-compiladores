package br.ufscar.dc.compiladores.comidalang;
import br.ufscar.dc.compiladores.comidalang.ComidaLangLexer;
import br.ufscar.dc.compiladores.comidalang.ComidaLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        String inputFile = args[0];
        String outputFile = args[1];

        ComidaLangLexer lexer = new ComidaLangLexer(CharStreams.fromFileName(inputFile));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ComidaLangParser parser = new ComidaLangParser(tokens);

        List<String> errosSintaticos = new ArrayList<>();
        ErrorHandler errorHandler = new ErrorHandler(errosSintaticos);
        parser.removeErrorListeners();
        parser.addErrorListener(errorHandler);


        ComidaLangParser.ProgramContext tree = parser.program();

        // Análise Semântica
        ComidaSemantico semantico = new ComidaSemantico();
        semantico.visit(tree);
        List<String> errosSemanticos = semantico.getErrosSemanticos();

        List<String> todosErros = new ArrayList<>();
        todosErros.addAll(errosSintaticos);
        todosErros.addAll(errosSemanticos);

        // Geração de Código
        ComidaGenerator generator = new ComidaGenerator(todosErros);
        generator.visit(tree);
        try {
            generator.gerarHTML(outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
