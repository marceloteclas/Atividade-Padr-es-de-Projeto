package com.example.CenarioSimples;

//Foi criado uma classe de relatorio para criação de PDFs , e este classe implementara o metodo da sua interface Relatorio; 

public class RelatorioPDF implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Relatorio PDF");
    }

}
