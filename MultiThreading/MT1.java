class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(Thread.currentThread().getName());
            i++;
        }

    }

}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i < 1000) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class MT1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.start();

        MyThread2 t2 = new MyThread2();
        Thread t = new Thread(t2);
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Zubair");
        }
    }
}

// We can extends Thread Class or we can Implement Runnable