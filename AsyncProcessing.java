import java.util.concurrent.*;

public class AsyncProcessing {
    public static void main(String[] args) {
        CompletableFuture<Void> task = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Processing logs...");
                Thread.sleep(2000);
                System.out.println("Logs processed.");
            } catch (InterruptedException ignored) {}
        });

        task.join();
        System.out.println("All logs processed.");
    }
}
