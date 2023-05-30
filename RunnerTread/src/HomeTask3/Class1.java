package HomeTask3;
public class Class1 {
    public synchronized void printMessageA() {
        System.out.print("Class1 ");
        try {
            Thread.sleep(1000); // wait 1 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1 ");
    }
}
