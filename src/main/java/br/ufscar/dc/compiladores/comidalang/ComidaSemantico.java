package br.ufscar.dc.compiladores.comidalang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComidaSemantico extends ComidaLangBaseVisitor<Void> {
    Set<String> refeicoesDeclaradas = new HashSet<>();
    Set<String> refeicoesUsadas = new HashSet<>();
    List<String> errosSemanticos = new ArrayList<>();
    Set<String> gostosDeclarados = new HashSet<>();  

    @Override
    public Void visitBloco_refeicao(ComidaLangParser.Bloco_refeicaoContext ctx) {
        String nomeRefeicao = ctx.alimentos().getText();
        refeicoesDeclaradas.add(nomeRefeicao);
        return null;
    }

    @Override
    public Void visitPlanejamento(ComidaLangParser.PlanejamentoContext ctx) {
        String nomeRefeicao = ctx.alimentos().getText();
        refeicoesUsadas.add(nomeRefeicao);
        return null;
    }


    @Override
    public Void visitBloco_gostos(ComidaLangParser.Bloco_gostosContext ctx) {
        for (ComidaLangParser.GostoContext gostoCtx : ctx.gosto()) {
            String gosto = gostoCtx.NOME().getText();  // Obtem o nome do gosto
            gostosDeclarados.add(gosto);  // Armazena o gosto
        }
        return null;
    }


    public void verificarRefeicoesNaoUsadas() {
        for (String refeicao : refeicoesDeclaradas) {
            if (!refeicoesUsadas.contains(refeicao)) {
                errosSemanticos.add("Refeicao nao utilizada no planejamento: " + refeicao);
            }
        }
    }


    public List<String> getErrosSemanticos() {
        verificarRefeicoesNaoUsadas();
        return errosSemanticos;
    }
}
