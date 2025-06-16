package com.example.CenarioSimples;

//Foi criado uma classe abstrata com o metodo criar relatorio padrão e sem parametros 
// para as classes que extenderem da mesma implementar seu metodo no formato especifico da subclasse. 

abstract class RelatorioCreator {

    abstract Relatorio criarRelatorio();

}
