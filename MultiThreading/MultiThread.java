import java.util.*;
class MyThread1 extends Thread{
    @Override
    public void run()
    {
        int i = 0;
        while(i<100)
        {
            System.out.println("My thread 1 is Running!");
            System.out.println("This is a MultiThreading eg");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run()
    {
        int i = 0;
        while(i<100)
        System.out.println("My Thread 2 is running ");
        System.out.println("This is a MultiThreading Eg");
        i++;
    }
}
public class MultiThread{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        // start() method internally calls the run method in Thread class 
    }
}