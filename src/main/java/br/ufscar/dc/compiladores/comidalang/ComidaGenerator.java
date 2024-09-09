package br.ufscar.dc.compiladores.comidalang;

import java.io.PrintWriter;
import java.util.List;

public class ComidaGenerator extends ComidaLangBaseVisitor<Void> {
    StringBuilder out = new StringBuilder();
    List<String> errosSemanticos;

    public ComidaGenerator(List<String> errosSemanticos) {
        this.errosSemanticos = errosSemanticos;
    }

    @Override
    public Void visitProgram(ComidaLangParser.ProgramContext ctx) {
        out.append("<html><body>\n");

        if (!errosSemanticos.isEmpty()) {
            out.append("<h2>Erros Encontrados</h2>\n<ul>\n");
            for (String erro : errosSemanticos) {
                out.append("<li>").append(erro).append("</li>\n");
            }
            out.append("</ul>\n");
        } else {
            visitBody(ctx.body());
        }

        out.append("</body></html>\n");
        return null;
    }
    

    @Override
    public Void visitBloco_refeicao(ComidaLangParser.Bloco_refeicaoContext ctx) {
        out.append("<h2>Refeicao: ").append(ctx.alimentos().getText()).append("</h2>\n");
        out.append("<p>Tipo: ").append(ctx.TIPO_REFEICAO().getText()).append("</p>\n");
        out.append("<p>Horario: ").append(ctx.NUMINT(0).getText()).append(" horas e ")
                .append(ctx.NUMINT(1).getText()).append(" minutos</p>\n");
        out.append("<p>Calorias: ").append(ctx.NUMINT(2).getText()).append(" kcal</p>\n");
        return null;
    }
    
    @Override
    public Void visitBloco_gostos(ComidaLangParser.Bloco_gostosContext ctx) {
        out.append("<h2>Gostos</h2>\n<ul>\n");
        for (ComidaLangParser.GostoContext gostoCtx : ctx.gosto()) {
            out.append("<li>").append(gostoCtx.NOME().getText()).append("</li>\n");
        }
        out.append("</ul>\n");
        return null;
    }

    public void gerarHTML(String outputFile) throws Exception {
        try (PrintWriter pw = new PrintWriter(outputFile)) {
            pw.print(out.toString());
        }
    }
}