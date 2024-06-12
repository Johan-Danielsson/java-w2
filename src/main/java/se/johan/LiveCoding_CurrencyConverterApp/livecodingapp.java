package se.johan.LiveCoding_CurrencyConverterApp;

import java.util.Scanner;

public class livecodingapp {

    public static void main(String[] args) {
        // step 1: display menu
        // step 2: ask for user choice from the scanner
        // step 3: perform operations

        // Scanner for input
        Scanner scanner = new Scanner(System.in);
        int choice;
        //calling displayMenu from the same app


        do {
            displayMenu();
            choice = scanner.nextInt();
            performOperations(choice);
        } while (choice != 0); //as long as the value is not 0 it will loop, otherwise it will move on
    } //end of method

    // performOperations

    public static void displayMenu() {
        System.out.println("Currency Converter App");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to EURO");
        System.out.println("4. Convert EURO to SEK");
        System.out.println("0. Exit ");
        System.out.println("Enter your choice");
    }

    public static void performOperations(int operationNumber) {

        double usdAmount, sekAmount, euroAmount;
        switch (operationNumber) { // switch because we only have one single input

            case 0:
                //display GoodBye message
                System.out.println("Exiting Converter!");

                break;
            case 1:
                sekAmount = getAmount("SEK"); // getAmount(String currency)
                usdAmount = ExchangeOperations.convertSekToUsd(sekAmount);
                displayConversationResult(sekAmount, usdAmount, "SEK", "USD");
                //perform sek to usd
                break;


            case 2:

                usdAmount = getAmount("USD");
                sekAmount = ExchangeOperations.convertUsdToSek(usdAmount);
                displayConversationResult(usdAmount, sekAmount, "USD", "SEK");
                //perform usd to sek
                break;


            case 3:
                sekAmount = getAmount("SEK");
                euroAmount = ExchangeOperations.convertSekToEuro(sekAmount);
                displayConversationResult(sekAmount, euroAmount, "SEK", "EUR");
                //perform sek to euro
                break;


            case 4:
                euroAmount = getAmount("EUR");
                sekAmount = ExchangeOperations.convertEuroToSek(euroAmount);
                displayConversationResult(euroAmount, sekAmount, "EUR", "SEK");
                //perform euro to sek
                break;


            default:
                System.out.println("Invalid choice, Please enter a valid option");


        }
    }

    public static double getAmount(String currency) { // (String currency) will take the input from the cases stated, like "SEK", to make it dynamic in presenting the result
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in " + currency + " :");
        return scanner.nextDouble();
    }

    // private static because we only need to use it within this class
    private static void displayConversationResult(double fromAmount, double toAmount, String fromCurrency, String toCurrency) {
        System.out.println(fromAmount + " " + fromCurrency + " is equal to " + toAmount + " " + toCurrency + " .");

    }
}



