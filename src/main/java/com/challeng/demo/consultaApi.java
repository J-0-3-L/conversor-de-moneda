package com.challeng.demo;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.github.cdimascio.dotenv.Dotenv;

public class consultaApi {

    public static final Dotenv dotenv = Dotenv.load();

    public double obtenerCambioMoneda(String monedaOrigen, String monedaDestino){
     
        String apiKey = dotenv.get("API_KEY");

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+ apiKey +"/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
    
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
    
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = jsonResponse.getAsJsonObject("conversion_rates");

            // Obtener las tasas de cambio para las monedas de origen y destino
            double rateOrigen = rates.get(monedaOrigen).getAsDouble();
            double rateDestino = rates.get(monedaDestino).getAsDouble();

            if (monedaOrigen.equals("USD")) {
            // Si la moneda de origen es USD, se realiza el cambio
                return rateDestino;
            } else if (monedaDestino.equals("USD")) {
            // Si la moneda de destino es USD, se ejecuta la operacion de division trayendo el valor
                return 1/rateOrigen;
            } else {
                System.out.println("Conversion no soportada");
                return 0.0;
            }

        } catch (Exception e) {
            throw new RuntimeException("Error al obtener las tasas de conversion: " + e.getMessage());
        }
    
    }

}
