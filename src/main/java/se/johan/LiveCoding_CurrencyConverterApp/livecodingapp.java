package se.johan.LiveCoding_CurrencyConverterApp;

import java.util.Scanner;

public class livecodingapp {

    public static void main(String[] args) {
        // step 1: display menu
        // step 2: ask for user choice from the scanner
        // step 3: perform operations

        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        //calling displayMenu from the same app
        displayMenu();
        int choice = scanner.nextInt();
        performOperations(choice);

        // performOperations

    }

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

        // switch because we only have one single input
        switch (operationNumber) {
            case 1:
                System.out.println("Operation 1 has been executed!");
                //perform sek to usd
                break;


            case 2:
                System.out.println("Operation 2 has been executed!");
                //perform sek to sek
                break;


            case 3:
                System.out.println("Operation 3 has been executed!");
                //perform sek to euro
                break;


            case 4:
                System.out.println("Operation 4 has been executed!");
                //perform euro to sek
                break;


            case 5:
                System.out.println("Operation 5 has been executed!");
                //display GoodBye message
                break;

            default:
                System.out.println("Display a valid choice");
        }
    }
}


