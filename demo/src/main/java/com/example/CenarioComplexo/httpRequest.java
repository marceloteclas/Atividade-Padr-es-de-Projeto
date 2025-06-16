package com.example.CenarioComplexo;

import java.util.HashMap;
import java.util.Map;

// Produto final
class HttpRequest {
    private String url;
    private String metodo;
    private Map<String, String> headers;
    private String body;
    private int timeout;

    private HttpRequest() {
    }

    public void mostrar() {
        System.out.println("Método: " + metodo);
        System.out.println("URL: " + url);
        System.out.println("Timeout: " + timeout);
        System.out.println("Headers: " + headers);
        System.out.println("Body: " + body);
        System.out.println("------------------------");
    }

    public static class Builder {
        private HttpRequest request;

        public Builder() {
            request = new HttpRequest();
            request.headers = new HashMap<>();
        }

        public Builder url(String url) {
            request.url = url;
            return this;
        }

        public Builder metodo(String metodo) {
            request.metodo = metodo;
            return this;
        }

        public Builder addHeader(String chave, String valor) {
            request.headers.put(chave, valor);
            return this;
        }

        public Builder body(String body) {
            request.body = body;
            return this;
        }

        public Builder timeout(int segundos) {
            request.timeout = segundos;
            return this;
        }

        public HttpRequest build() {
            return request;
        }
    }
}
