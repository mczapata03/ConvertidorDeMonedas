import servicios.convertidorDeMoneda;
import servicios.tipoDeCambio;

import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        tipoDeCambio rateService = new tipoDeCambio();
        Map<String, Double> rates = rateService.fetchRates();

        convertidorDeMoneda converter = new convertidorDeMoneda(rates);
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n===== Conversor de Monedas =====");
            System.out.println("Elija una opción valida:");
            System.out.println("1) Dólar =>> Peso colombiano");
            System.out.println("2) Peso colombiano =>> Dólar");
            System.out.println("3) Dólar =>> Peso argentino");
            System.out.println("4) Peso argentino =>> Dólar");
            System.out.println("5) Dólar =>> Real brasileño");
            System.out.println("6) Real brasileño =>> Dólar");
            System.out.println("7) Salir");
            System.out.print("Opción: ");
            option = scanner.nextInt();

            if (option >= 1 && option <= 6) {
                System.out.print("Ingrese la cantidad: ");
                double amount = scanner.nextDouble();
                converter.convertCurrency(option, amount);
            }

        } while (option != 7);

        converter.showHistory();
        System.out.println("¡Gracias por usar el conversor!");
    }
}
