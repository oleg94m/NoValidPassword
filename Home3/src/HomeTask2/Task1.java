package HomeTask2;
import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try {
            // Створення файлу
            File file = new File("data.txt");

            // Запис даних до файлу
            FileWriter writer = new FileWriter(file);
            writer.write("Це довільний текст, який буде записаний до файлу.");
            writer.close();

            // Читання даних з файлу та виведення їх на консоль
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        }
    }
}
