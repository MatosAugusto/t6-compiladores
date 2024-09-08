package br.ufscar.dc.compiladores.comidalang;

import br.ufscar.dc.compiladores.comidalang.ComidaLangBaseVisitor;
import br.ufscar.dc.compiladores.comidalang.ComidaLangParser;
import java.util.HashSet;
import java.util.Set;

public class ComidaSemantico extends ComidaLangBaseVisitor<Void> {
    Set<String> refeicoesDeclaradas = new HashSet<>();
    Set<String> refeicoesUsadas = new HashSet<>();

    @Override
    public Void visitBloco_refeicao(ComidaLangParser.Bloco_refeicaoContext ctx) {
        String nomeRefeicao = ctx.alimentos().getText();
        refeicoesDeclaradas.add(nomeRefeicao);
        return null;
    }

    @Override
    public Void visitPlanejamento(ComidaLangParser.PlanejamentoContext ctx) {
        String nomeRefeicao = ctx.NOME().getText();
        refeicoesUsadas.add(nomeRefeicao);
        return null;
    }

    public void verificarRefeicoesNaoUsadas() {
        for (String refeicao : refeicoesDeclaradas) {
            if (!refeicoesUsadas.contains(refeicao)) {
                System.out.println("Refeição não utilizada no planejamento: " + refeicao);
            }
        }
    }
}
