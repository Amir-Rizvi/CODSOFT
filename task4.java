package CODSOFT;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class task4 {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency code  - Country\n\nUSD    -    United States Dollar\nEUR    -    Euro\nINR    -    Indian Rupee\nJPY    -    Japanese Yen\nGBP    -    British Pound Sterling\nAUD    -    Australian Dollar\nCAD    -    Canadian Dollar\nCNY    -    Chinese Yuan\nNZD    -    New Zealand Dollar\nSGD    -    Singapore Dollar\nHKD    -    Hong Kong Dollar\nKRW    -    South Korean Won");

        System.out.print("Enter the base currency code: ");
        String baseCurrency = scanner.next();

        System.out.print("Enter the target currency code: ");
        String targetCurrency = scanner.next();

        String exchangeRates = fetchExchangeRates(baseCurrency);

        if (exchangeRates != null) {
            System.out.print("Enter the amount to convert: ");
            double amountToConvert = scanner.nextDouble();

            double exchangeRate = extractExchangeRate(exchangeRates, targetCurrency);
            double convertedAmount = amountToConvert * exchangeRate;

            System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Error fetching exchange rates. Please try again later.");
        }
    }

    private static String fetchExchangeRates(String baseCurrency) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL.replace("USD", baseCurrency)))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            System.out.println("Error fetching exchange rates: " + e.getMessage());
            return null;
        }
    }

    private static double extractExchangeRate(String exchangeRatesJson, String targetCurrency) {
        int start = exchangeRatesJson.indexOf(targetCurrency) + 6;
        int end = exchangeRatesJson.indexOf(",", start);
        String rateString = exchangeRatesJson.substring(start, end);

        return Double.parseDouble(rateString);
    }
}
