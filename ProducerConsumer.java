import java.util.concurrent.*;

public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put("Log " + i);
                    System.out.println("Produced: Log " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException ignored) {}
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Consumed: " + queue.take());
                }
            } catch (InterruptedException ignored) {}
        }).start();
    }
}
