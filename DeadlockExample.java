class Resource {
    public synchronized void use(Resource other) {
        System.out.println(Thread.currentThread().getName() + " locked " + this);
        try { 
            Thread.sleep(50);
        } catch (InterruptedException ignored) {}

        other.finish();
    }

    public synchronized void finish() {
        System.out.println(Thread.currentThread().getName() + " executing finish.");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        new Thread(() -> r1.use(r2), "Thread-1").start();
        new Thread(() -> r2.use(r1), "Thread-2").start();
    }
}
