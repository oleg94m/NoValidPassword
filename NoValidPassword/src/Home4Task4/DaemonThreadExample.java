package Home4Task4;
public class DaemonThreadExample implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Daemon thread is running");
        }
    }

    public static void main(String[] args) {
        DaemonThreadExample daemon = new DaemonThreadExample();
        Thread daemonThread = new Thread(daemon);
        daemonThread.setDaemon(true); // Встановлюємо потік-демон
        daemonThread.start(); // Запускаємо потік-демон

        // Головний потік закінчує свою роботу через 5 секунд
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Кінець");
    }
}