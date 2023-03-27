package HomeTask3;
public class Exsample {
    public static void main(String[] args) {
        String text = "Java - це потужна мова програмування. Вона використовується для розробки різноманітних додатків, від простих консольних утиліт до складних веб-порталів.";

        // Розбиття рядка на 2 підрядки рівної довжини
        int middle = text.length() / 2;
        String substring1 = text.substring(0, middle);
        String substring2 = text.substring(middle);

        // Виведення кожного речення з нового рядка
        String[] sentences1 = substring1.split("\\. ");
        String[] sentences2 = substring2.split("\\. ");

        System.out.println("Перший підрядок:");
        for (String sentence : sentences1) {
            System.out.println(sentence + ".");
        }

        System.out.println("\nДругий підрядок:");
        for (String sentence : sentences2) {
            System.out.println(sentence + ".");
        }
    }
}
