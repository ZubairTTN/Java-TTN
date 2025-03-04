public class MultiThreadedTest {
    public static void main(String[] args) {
        Runnable test1 = () -> runTest("TC1");
        Runnable test2 = () -> runTest("TC2");

        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All test cases executed.");
    }

    private static void runTest(String testName) {
        System.out.println(testName + " started.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(testName + " finished.");
    }
}
