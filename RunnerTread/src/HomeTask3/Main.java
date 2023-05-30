package HomeTask3;

public class Main {
    public static void main(String[] args) {
        Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                obj1.printMessageA();
            }
        });

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                obj2.printMessageB();
            }
        });

        threadA.start();
        threadB.start();
    }
}
