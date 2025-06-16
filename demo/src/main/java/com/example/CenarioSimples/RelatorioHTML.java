package com.example.CenarioSimples;

//Foi criado uma classe de relatorio especifica para relatorios HTMLs ,
// e este classe implementara o metodo da sua interface Relatorio; 

public class RelatorioHTML implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Relatorio HTML");
    }

}
