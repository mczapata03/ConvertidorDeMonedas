package servicios;

import com.google.gson.Gson;
import modelos.respuestaApi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class tipoDeCambio {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/ac0ccff70243f88de58ebcff/latest/USD";

    public Map<String, Double> fetchRates() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            respuestaApi apiResponse = gson.fromJson(response.body(), respuestaApi.class);
            return apiResponse.conversion_rates;

        } catch (Exception e) {
            throw new RuntimeException("Error al obtener tasas de cambio: " + e.getMessage());
        }
    }
}
