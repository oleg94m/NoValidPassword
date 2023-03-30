package HomeTask4;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter firs number: ");
        double num1 = scanner.nextDouble();

        System.out.print("ВEnter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: ");
        System.out.println("1 - + ");
        System.out.println("2 - -");
        System.out.println("3 - *");
        System.out.println("4 - /");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                calculate(num1, num2, (x, y) -> x + y);
                break;
            case 2:
                calculate(num1, num2, (x, y) -> x - y);
                break;
            case 3:
                calculate(num1, num2, (x, y) -> x * y);
                break;
            case 4:
                calculate(num1, num2, (x, y) -> x / y);
                if (num1!=0){
                    calculate(num1, num2, (x, y) -> x / y);
                } else System.out.println("Number cann't be 0");
                break;
            default:
                System.out.println("mistake operration!");
        }

        scanner.close();
    }

    interface Operationable {
        double calculate(double x, double y);
    }

    public static void calculate(double x, double y, Operationable operation) {
        double result = operation.calculate(x, y);
        System.out.printf("Результат: %.2f", result);
    }
}