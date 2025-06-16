package com.example.CenarioComplexo;

public class mainRequisicoes {

    public static void main(String[] args) {
        // Exemplo com Requisição 1 com autenticação e headers
        HttpRequest requisicao1 = new HttpRequest.Builder()
                .metodo("POST")
                .url("https://api.marceloSystem.com/login")
                .addHeader("Authorization", "Bearer token9987")
                .addHeader("Content-Type", "application/json")
                .body("{\"usuario\":\"admin\", \"senha\":\"9987\"}")
                .timeout(30)
                .build();

        requisicao1.mostrar();

        // Exemplo com Requisição 2 simples, sem autenticação
        HttpRequest requisicao2 = new HttpRequest.Builder()
                .metodo("GET")
                .url("https://api.RonaldoSystem.com/cardapio")
                .timeout(10)
                .build();

        requisicao2.mostrar();
    }

}
