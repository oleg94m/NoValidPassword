package Home4Task3;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task3{
    public static void main(String[] args) {
        String birthDateStr = "1994-04-11"; // дата народження у форматі "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date birthDate = dateFormat.parse(birthDateStr);
            Date currentDate = new Date();
            long timeDiff = currentDate.getTime() - birthDate.getTime();

            long seconds = timeDiff / 1000;
            long minutes = seconds / 60;
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long months = (days % 365) / 30;
            days = (days % 365) % 30;

            System.out.printf("Вам виповнилося %d років, %d місяців, %d днів, %d годин, %d хвилин, %d секунд\n",
                    years, months, days, hours % 24, minutes % 60, seconds % 60);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}