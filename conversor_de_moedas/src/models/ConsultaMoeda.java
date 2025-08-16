package models;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public Conversao buscaTaxas(String moedaBase) {
        
        var apiKey = "3bb930e51b22d38da2dc1999";
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            
            return new Gson().fromJson(response.body(), Conversao.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter as taxas de conversão!");
        }
    }
}