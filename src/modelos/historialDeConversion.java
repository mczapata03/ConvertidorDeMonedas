package modelos;

import java.time.LocalDateTime;

public class historialDeConversion {
    private LocalDateTime dateTime;
    private String fromCurrency;
    private String toCurrency;
    private double originalAmount;
    private double convertedAmount;

    public historialDeConversion(LocalDateTime dateTime, String fromCurrency, String toCurrency, double originalAmount, double convertedAmount) {
        this.dateTime = dateTime;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.originalAmount = originalAmount;
        this.convertedAmount = convertedAmount;
    }

    @Override
    public String toString() {
        return dateTime + " | " + originalAmount + " " + fromCurrency + " => " + convertedAmount + " " + toCurrency;
    }
}
