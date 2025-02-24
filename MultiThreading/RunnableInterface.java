class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("This is Thread 1 running...");
            i++;
        }

    }
}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("This is Thread 2 runnning...");
            i++;
        }

    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread thread1 = new Thread(t1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        thread1.start();
        gun2.start();

    }
}
