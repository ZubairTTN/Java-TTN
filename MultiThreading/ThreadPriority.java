class MyThread extends Thread{
    MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        int i = 0;
        while(i<100)
        {
            System.out.println(this.getName());
            i++;
        }
    }

}
public class ThreadPriority {
    public static void main(String[] args) {
        // java has a ready queue
        // Ready Queue: T1, T2, T3, T4, T5
        MyThread t1 = new MyThread("Zubair Most Important Priority");
        MyThread t2 = new MyThread("Sonu");
        MyThread t3 = new MyThread("Farida");
        MyThread t4 = new MyThread("kaushtub");
        MyThread t5 = new MyThread("Wasif");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.setPriority(Thread.MIN_PRIORITY);
        t5.start();
    }
}
