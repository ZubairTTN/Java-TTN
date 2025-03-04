class Shared {
    volatile boolean flag = true;

    void changeFlag() {
        System.out.println("Changing flag to false.");
        flag = false;
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        Shared shared = new Shared();

        new Thread(() -> {
            while (shared.flag) {}
            System.out.println("Flag changed, thread exiting.");
        }).start();

        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}

        shared.changeFlag();
    }
}
