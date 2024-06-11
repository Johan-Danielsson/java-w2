package se.johan;

public class Calculations {

    // Calculations for CurrencyConverter

    // SEK to USD conversion
    public static void convertSekUsd(double num1, double sekUsd) {
        double answer = num1 * sekUsd;
        System.out.println("-------------------");
        System.out.println(num1 + " SEK" + " = " + answer + " USD");
        System.out.println("1 SEK="+CurrencyValues.sekUsd+" USD");
        System.out.println("1 USD="+CurrencyValues.usdSek+" SEK");
        System.out.println("-------------------");

    }

    // USD to SEK conversion
    public static void convertUsdSek(double num1, double usdSek) {
        double answer = num1 * usdSek;
        System.out.println("-------------------");
        System.out.println(num1 + " USD" + " = " + answer + " SEK");
        System.out.println("1 USD="+CurrencyValues.usdSek+" SEK");
        System.out.println("1 SEK="+CurrencyValues.sekUsd+" USD");
        System.out.println("-------------------");


    }
    // SEK to EUR conversion
    public static void convertSekEur(double num1, double sekEur) {
        double answer = num1 * sekEur;
        System.out.println("-------------------");
        System.out.println(num1 + " SEK" + " = " + answer + " EUR");
        System.out.println("1 SEK="+CurrencyValues.sekEur+" EUR");
        System.out.println("1 EUR="+CurrencyValues.eurSek+" SEK");
        System.out.println("-------------------");
    }

    // EUR to SEK conversion
    public static void convertEurSek(double num1, double eurSek) {
        double answer = num1 * eurSek;
        System.out.println("-------------------");
        System.out.println(num1 + " EUR" + " = " + answer + " SEK");
        System.out.println("1 EUR="+CurrencyValues.eurSek+" SE)");
        System.out.println("1 SEK="+CurrencyValues.sekEur+" EUR");
        System.out.println("-------------------");


    }

}
