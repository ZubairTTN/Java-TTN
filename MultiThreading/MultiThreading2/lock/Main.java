package MultiThreading2.lock;

public class Main {
    public static void main(String[] args) {
        BankAccount pnb = new BankAccount();
        // here we are using runnable interface class through anonymous class
        Runnable task = new Runnable() {
            @Override
            public void run()
            {
                pnb.withdraw(50);
            }
        };
        Thread t1 = new Thread(task, "Thread_1");
        Thread t2 = new Thread(task, "Thread_2");
        t1.start();
        t2.start();
    }
}
