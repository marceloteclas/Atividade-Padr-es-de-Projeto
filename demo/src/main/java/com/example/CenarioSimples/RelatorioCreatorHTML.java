package com.example.CenarioSimples;

//Foi criado a classe de criação de relatorio HTML extendendo a classe abstrata Relatorio Creator
// implementando E sobrescrevendo o medoto relatorio para trazer no formato HTML.
public class RelatorioCreatorHTML extends RelatorioCreator {

    @Override
    Relatorio criarRelatorio() {
        return new RelatorioHTML();
    }

}
