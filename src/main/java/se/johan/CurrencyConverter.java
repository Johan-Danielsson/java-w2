package se.johan;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        // Adding Scanner for user input
        Scanner input = new Scanner(System.in);

        // while loop to run the app until exit
        while (true) {
            System.out.println("Currency Converter App");
            System.out.println("1. Convert SEK to USD");
            System.out.println("2. Convert USD to SEK");
            System.out.println("3. Convert SEK to EUR");
            System.out.println("4. Convert EUR to SEK");
            System.out.println("5. Exit the converter");
            System.out.println("Enter your choice:");

            int option = input.nextInt();

            // Sending input to correct result
            if (option == 1) {
                System.out.println("Enter amount of SEK:");
                double num1 = input.nextDouble();
                Calculations.convertSekUsd(num1, CurrencyValues.sekUsd);
            }

            if (option == 2) {
                System.out.println("Enter amount of USD:");
                double num1 = input.nextDouble();
                Calculations.convertUsdSek(num1, CurrencyValues.usdSek);
            }
            if (option == 3) {
                System.out.println("Enter amount of SEK:");
                double num1 = input.nextDouble();
                Calculations.convertSekEur(num1, CurrencyValues.sekEur);
            }
            if (option == 4) {
                System.out.println("Enter amount of EUR:");
                double num1 = input.nextDouble();
                Calculations.convertEurSek(num1, CurrencyValues.eurSek);
            }
            if (option == 5) {
                System.out.println("Thank you for using the converter. Exiting..");
                System.exit(0);
            }

        }
    }
}
