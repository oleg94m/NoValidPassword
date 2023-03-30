package HomeTask4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String text = "Це текстовий файл. Його створено програмно.";

        // Запис тексту у файл
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(text);
            writer.close();
            System.out.println("Текст успішно записано у файxdfd;ljzdzgл " + fileName);
        } catch (IOException e) {
            System.out.println("Помилка запису у файл " + fileName);
            e.printStackTrace();
        }

        // Виведення вмісту файлу на екран
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            System.out.println("\nВміст файлу " + fileName + ":");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Помилка читання файлу " + fileName);
            e.printStackTrace();
        }
    }
}
