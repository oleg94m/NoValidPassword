package HomeTask2;
public class HomeTask2 {
    public static void main(String[] args) {
        Thread t1 = new PriorityThread("Thread 1", Thread.MIN_PRIORITY);
        Thread t2 = new PriorityThread("Thread 2", Thread.NORM_PRIORITY);
        Thread t3 = new PriorityThread("Thread 3", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

class PriorityThread extends Thread {
    public PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(getName() + " is running with priority " + getPriority() + " and value " + i);
        }
    }
}
