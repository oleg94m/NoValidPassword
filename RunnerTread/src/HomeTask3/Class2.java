package HomeTask3;

public class Class2 {
    public synchronized void printMessageB() {
        System.out.print("Class2 ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2 ");
    }
}