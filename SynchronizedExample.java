class SharedResource {
    private int data = 0;

    public synchronized void updateData() {
        data++;
        System.out.println("Data updated: " + data);
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::updateData);
        Thread t2 = new Thread(resource::updateData);

        t1.start();
        t2.start();
    }
}
