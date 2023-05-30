package task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("queries.sql");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String query = scanner.nextLine();
                // виконуємо запит
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
