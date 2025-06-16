package com.example.CenarioSimples;

public class Main {
    public static void main(String[] args) {

        RelatorioCreator creatorPDF = new RelatorioCreatorPDF();
        Relatorio relatorioPDF = creatorPDF.criarRelatorio();
        relatorioPDF.gerar();

        RelatorioCreator creatorHTML = new RelatorioCreatorHTML();
        Relatorio relatorioHTML = creatorHTML.criarRelatorio();
        relatorioHTML.gerar();

        RelatorioCreator creatorJSON = new RelatorioCreatorJASON();
        Relatorio relatorioJSON = creatorJSON.criarRelatorio();
        relatorioJSON.gerar();
    }
}