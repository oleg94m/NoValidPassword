package Home4Task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        String searchPattern = "\\b(in|on|at|with|from|to|by)\\b";
        String replaceText = "Java";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            Pattern pattern = Pattern.compile(searchPattern);

            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                line = matcher.replaceAll(replaceText);
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Заміна завершена. Результат збережено у файлі " + outputFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}