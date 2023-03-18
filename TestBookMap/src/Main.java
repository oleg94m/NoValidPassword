import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Read the input file
        ArrayList<String[]> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] row = line.split(",");
                data.add(row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Convert the ArrayList to a two-dimensional array
        Object[][] table = new Object[data.size()][];
        for (int i = 0; i < data.size(); i++) {
            table[i] = data.get(i);
        }

        // Print the table header
        String[] columns = {"ID", "Name", "Age", "Gender"};
        for (String column : columns) {
            System.out.printf("%-10s", column);
        }
        System.out.println();

        // Print the table rows
        for (Object[] row : table) {
            for (Object cell : row) {
                System.out.printf("%-10s", cell);
            }
            System.out.println();
        }
        String data1 = "Це мій текст для запису в файл output.txt";

        try {
            // Створюємо FileWriter з параметром true, щоб дописувати в кінець файлу
            FileWriter fileWriter = new FileWriter("output.txt", true);
            // Створюємо BufferedWriter для ефективного запису даних
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Записуємо дані у файл
            bufferedWriter.write(data1);

            // Закриваємо BufferedWriter та FileWriter
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Дані успішно записані у файл output.txt");
        } catch (IOException e) {
            System.out.println("Помилка запису даних у файл: " + e.getMessage());
        }
    }


    public class ReadFile {



        }

    }

