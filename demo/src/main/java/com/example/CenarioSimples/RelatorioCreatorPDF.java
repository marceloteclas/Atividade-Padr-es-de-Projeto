package com.example.CenarioSimples;

//Foi criado a classe de criação de relatorio PDF extendendo a classe abstrata Relatorio Creator
// implementando E sobrescrevendo o medoto relatorio para trazer no formato PDF.

public class RelatorioCreatorPDF extends RelatorioCreator {

    @Override
    Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }

}
