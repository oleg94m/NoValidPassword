package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerchText {
    public static void main(String[] args) throws IOException {
        // Відкриваємо файл та зчитуємо його у вигляді рядка
        BufferedReader reader = new BufferedReader(new FileReader("Text.txt"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        String text = sb.toString();

        // Запитуємо користувача про слово для пошуку та стоп-слово
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово для пошуку:");
        String searchWord = scanner.nextLine();
        System.out.println("Введіть стоп-слово (можливо використовувати регулярні вирази):");
        String stopWord = scanner.nextLine();

        // Створюємо регулярний вираз для пошуку слова та для стоп-слова
        Pattern searchPattern = Pattern.compile("\\b" + searchWord + "\\b", Pattern.CASE_INSENSITIVE);
        Pattern stopPattern = Pattern.compile(stopWord, Pattern.CASE_INSENSITIVE);

        // Шукаємо всі збіги слова та рахуємо їх кількість до стоп-слова
        Matcher searchMatcher = searchPattern.matcher(text);
        int count = 0;
        int lastIndex = 0;
        while (searchMatcher.find(lastIndex)) {
            if (stopPattern.matcher(text.substring(lastIndex, searchMatcher.start())).find()) {
                break;
            }
            count++;
            lastIndex = searchMatcher.end();
        }


        System.out.printf("Кількість згадувань слова \"%s\" у тексті до стоп-слова \"%s\": %d", searchWord, stopWord, count);
    }
}