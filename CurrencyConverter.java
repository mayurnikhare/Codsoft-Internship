import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulated exchange rates (you can replace this with real API data)
        double usdToEurRate = 0.85;
        double usdToJpyRate = 110.25;

        System.out.println("Available currencies:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. JPY (Japanese Yen)");

        System.out.print("Enter the base currency (1/2/3): ");
        int baseCurrencyChoice = scanner.nextInt();
        System.out.print("Enter the target currency (1/2/3): ");
        int targetCurrencyChoice = scanner.nextInt();

        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        double convertedAmount = 0;
        String targetCurrencySymbol = "";

        // Perform currency conversion
        switch (baseCurrencyChoice) {
            case 1: // USD
                if (targetCurrencyChoice == 2) { // EUR
                    convertedAmount = amountToConvert * usdToEurRate;
                    targetCurrencySymbol = "EUR";
                } else if (targetCurrencyChoice == 3) { // JPY
                    convertedAmount = amountToConvert * usdToJpyRate;
                    targetCurrencySymbol = "JPY";
                }
                break;
            case 2: // EUR
                // Add cases for other currency conversions
                break;
            case 3: // JPY
                // Add cases for other currency conversions
                break;
            default:
                System.out.println("Invalid currency choice.");
        }

        // Display the result
        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrencySymbol);

        scanner.close();
    }
}
