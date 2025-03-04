import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            int testCaseNum = i;
            executor.execute(() -> {
                long start = System.currentTimeMillis();
                System.out.println("Executing TC" + testCaseNum);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long end = System.currentTimeMillis();
                System.out.println("TC" + testCaseNum + " completed in " + (end - start) + "ms");
            });
        }

        executor.shutdown();
    }
}
