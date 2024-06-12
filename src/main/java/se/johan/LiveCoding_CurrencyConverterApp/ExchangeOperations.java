package se.johan.LiveCoding_CurrencyConverterApp;

public class ExchangeOperations {

    public static double convertSekToUsd(double sekAmount) {

        return sekAmount * ExchangeRates.sekToUsdRate;

    }

    public static double convertUsdToSek(double usdAmount) {
        return usdAmount * ExchangeRates.usdToSekRate;

    }

    public static double convertSekToEuro(double sekAmount) {

        return sekAmount * ExchangeRates.sekToEuroRate;

    }

    public static double convertEuroToSek(double usdAmount) {
        return usdAmount * ExchangeRates.euroToSekRate;

    }
}
