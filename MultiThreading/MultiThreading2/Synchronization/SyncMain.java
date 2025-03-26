package MultiThreading2.Synchronization;

public class SyncMain {
    public static void main(String[] args) {
        Counter1 counter = new Counter1();
        SyncThread t1 = new SyncThread(counter);
        SyncThread t2 = new SyncThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println(counter.getCount());
    }

}
