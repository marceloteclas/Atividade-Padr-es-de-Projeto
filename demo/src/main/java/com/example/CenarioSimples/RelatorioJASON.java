package com.example.CenarioSimples;

//Foi criado uma classe de relatorio especifica para geração de relatorios do tipo Jason,
// e esta classe implementara o metodo da sua interface Relatorio; 

public class RelatorioJASON implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Relatorio JASON");
    }

}
