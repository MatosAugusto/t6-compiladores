package br.ufscar.dc.compiladores.comidalang;

import br.ufscar.dc.compiladores.comidalang.ComidaLangBaseVisitor;
import br.ufscar.dc.compiladores.comidalang.ComidaLangParser;

import java.io.PrintWriter;

public class ComidaGenerator extends ComidaLangBaseVisitor<Void> {
    StringBuilder out = new StringBuilder();

    @Override
    public Void visitProgram(ComidaLangParser.ProgramContext ctx) {
        out.append("<html><body>\n");
        visitBody(ctx.body());
        out.append("</body></html>\n");
        return null;
    }

    @Override
    public Void visitBloco_refeicao(ComidaLangParser.Bloco_refeicaoContext ctx) {
        out.append("<h2>Refeicao: ").append(ctx.alimentos().getText()).append("</h2>\n");

        if (ctx.TIPO_REFEICAO() != null) {
            out.append("<p>Tipo: ").append(ctx.TIPO_REFEICAO().getText()).append("</p>\n");
        } else {
            out.append("<p>Tipo: Nao especificado</p>\n");
        }

        out.append("<p>Horario: ").append(ctx.NUMINT(0).getText()).append(" horas e ")
                .append(ctx.NUMINT(1).getText()).append(" minutos</p>\n");
        out.append("<p>Calorias: ").append(ctx.NUMINT(2).getText()).append(" kcal</p>\n");
        return null;
    }

    public void gerarHTML(String outputFile) throws Exception {
        try (PrintWriter pw = new PrintWriter(outputFile)) {
            pw.print(out.toString());
        }
    }
}