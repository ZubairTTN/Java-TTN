package MultiThreading2.MT2;

// In this program we are learning about the Thread Interrupt

public class InterruptM extends Thread{
    @Override
    public void run()
    {
        try {
            Thread.sleep(2000);
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Thread is Interrupted " + e);
        }
    }
    public static void main(String[] args) {
        InterruptM t1 = new InterruptM();
        t1.start();
        t1.interrupt(); //this Thread Method (.interrupt() stops the execution of the Thread turant)
        
    }
}
