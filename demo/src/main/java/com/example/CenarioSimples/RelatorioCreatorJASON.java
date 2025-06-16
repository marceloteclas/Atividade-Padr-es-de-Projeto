package com.example.CenarioSimples;

//Foi criado a classe de criação de relatorio JASON extendendo a classe abstrata Relatorio Creator
// implementando E sobrescrevendo o medoto relatorio para trazer no formato JASON.

public class RelatorioCreatorJASON extends RelatorioCreator {

    @Override
    Relatorio criarRelatorio() {
        return new RelatorioJASON();
    }

}
