package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            // Создание URL для подключения к API НБУ
            URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");

            // Открытие HTTP-соединения
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Получение ответа от сервера
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Чтение данных из ответа
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Обработка JSON-ответа
                // Здесь предполагается, что ответ содержит массив объектов JSON,
                // где каждый объект представляет курс одной валюты.
                // В этом примере мы будем выводить код валюты и ее курс.
                // Вам может понадобиться дополнительная обработка для получения конкретных валют.

                // Преобразование ответа в массив объектов JSON
                JSONArray currencies = new JSONArray(response.toString());

                // Перебор каждой валюты
                for (int i = 0; i < currencies.length(); i++) {
                    JSONObject currency = currencies.getJSONObject(i);
                    String currencyCode = currency.getString("cc");
                    double rate = currency.getDouble("rate");
                    System.out.println(currencyCode + ": " + rate);
                }
            } else {
                System.out.println("Ошибка соединения. Код ошибки: " + responseCode);
            }

            // Закрытие соединения
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}