package servicios;

import modelos.historialDeConversion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class convertidorDeMoneda {
    private Map<String, Double> rates;
    private final List<historialDeConversion> historyList = new ArrayList<>();

    public convertidorDeMoneda(Map<String, Double> rates) {
        this.rates = rates;
    }

    public void convertCurrency(int option, double amount) {
        double result = 0;
        String fromCurrency = "";
        String toCurrency = "";

        switch (option) {
            case 1:
                result = amount * rates.get("COP");
                fromCurrency = "USD";
                toCurrency = "COP";
                break;
            case 2:
                result = amount / rates.get("COP");
                fromCurrency = "COP";
                toCurrency = "USD";
                break;
            case 3:
                result = amount * rates.get("ARS");
                fromCurrency = "USD";
                toCurrency = "ARS";
                break;
            case 4:
                result = amount / rates.get("ARS");
                fromCurrency = "ARS";
                toCurrency = "USD";
                break;
            case 5:
                result = amount * rates.get("BRL");
                fromCurrency = "USD";
                toCurrency = "BRL";
                break;
            case 6:
                result = amount / rates.get("BRL");
                fromCurrency = "BRL";
                toCurrency = "USD";
                break;
        }

        System.out.println(amount + " " + fromCurrency + " son " + result + " " + toCurrency);

        // Guardar historial
        historyList.add(new historialDeConversion(LocalDateTime.now(), fromCurrency, toCurrency, amount, result));
    }

    public void showHistory() {
        if (historyList.isEmpty()) {
            System.out.println("\nNo se realizaron conversiones.");
        } else {
            System.out.println("\n===== Historial de Conversiones =====");
            for (historialDeConversion history : historyList) {
                System.out.println(history);
            }
        }
    }
}
