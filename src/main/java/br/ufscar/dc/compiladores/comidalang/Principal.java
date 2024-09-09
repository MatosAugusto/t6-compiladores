package br.ufscar.dc.compiladores.comidalang;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {
    public static void main(String[] args) throws IOException {
        //leitura do arquivo
        String inputFile = args[0];
        String outputFile = args[1];


        //lê o arquivo de entrada e transforma o conteúdo em tokens (unidades léxicas).
        ComidaLangLexer lexer = new ComidaLangLexer(CharStreams.fromFileName(inputFile));
        //Armazena os tokens gerados pelo lexer.
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //analisar a sequência de tokens para garantir que ela obedece às regras sintáticas da gramática.
        ComidaLangParser parser = new ComidaLangParser(tokens);

        //analise sintatico
        List<String> errosSintaticos = new ArrayList<>();
        ErrorHandler errorHandler = new ErrorHandler(errosSintaticos);
        parser.removeErrorListeners();
        parser.addErrorListener(errorHandler);

        //constrói a árvore sintática a partir da regra inicial da gramática program. 
        //O parser vai percorrer o arquivo de entrada de acordo com as regras da gramática e 
        //gerar uma estrutura hierárquica (a árvore) que representa o programa.
        ComidaLangParser.ProgramContext tree = parser.program();

        // Análise Semântica
        ComidaSemantico semantico = new ComidaSemantico();
        //método visit(tree) percorre a árvore sintática (tree) para verificar erros semânticos, 
        //como inconsistências de tipo, referências a variáveis não declaradas, entre outros.
        semantico.visit(tree);
        List<String> errosSemanticos = semantico.getErrosSemanticos();


        //combinando os erros semanticos e sintaticos
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
