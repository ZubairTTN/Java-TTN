package MultiThreading2.MT2;

// in this program we will understand about the .yield() methos of the Thread class 
public class YieldM extends Thread{
    // constructor
    public YieldM(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        for(int i = 0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName() + " is Running...");
            Thread.yield(); //.yield() method is used to hint the compiler to give chance to other thread execution as well 
        }
    }
    public static void main(String[] args) {
        YieldM t1 = new YieldM("Thread_1");
        YieldM t2 = new YieldM("Thread_2");
        t1.start();
        t2.start();

    }
}
