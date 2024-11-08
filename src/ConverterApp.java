import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class ConverterApp {
        private final String API_KEY = "46402d48f4743b3137d90093";
        private final String API_URL = "https://v6.exchangerate-api.com/v6/";
        private final String[] baseCurrencies = {"USD", "ARS", "USD", "BRL", "USD", "COP"};
        private final String[] targetCurrencies = {"ARS", "USD", "BRL", "USD", "COP", "USD"};
        double convertedValue;

        public void processOption(int option, Scanner input) throws IOException, InterruptedException {
            String baseCurrency = baseCurrencies[option - 1];
            String targetCurrency = targetCurrencies[option - 1];

            String urlAddress = conversionUrl(baseCurrency, targetCurrency);
            String json = ApiConsumption.getData(urlAddress);
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
            double conversionRate = jsonObject.get("conversion_rate").getAsDouble();

            System.out.println("Digite o valor que deseja converter:");
            double valueForConversion;
            try {
                valueForConversion = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. ");
                input.nextLine();
                return;
            }

            double conversionResult = convertCurrency(valueForConversion, conversionRate);
            System.out.println("O valor " + valueForConversion + " [" + baseCurrency + "]" + " corresponde ao valor final de " + conversionResult + " [" + targetCurrency + "]");
            System.out.println("************************");
            System.out.println();
        }

        public String conversionUrl(String baseCurrency, String targetCurrency) {
            return API_URL + API_KEY + "/" + "pair" + "/" +
                    baseCurrency + "/" + targetCurrency;
        }

        public double convertCurrency(double value, double rate) {
            this.convertedValue = value * rate;
            return convertedValue;

        }
    }

