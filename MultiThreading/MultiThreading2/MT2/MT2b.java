package MultiThreading2.MT2;

// In this program we are understanding the Thread Priority (MAX, MIN, NORM), Thread.MAX/MIN/NORM_PRIORITY
public class MT2b extends Thread{
    @Override
    public void run()
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " -Count " + i);

            // simulating work 
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Constructor
    public MT2b(String name )
    {
        super(name);
    }
    public static void main(String[] args) {
        MT2b t1 = new MT2b("Thread_1_Max");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        MT2b t2 = new MT2b("Thread_2_Norm");
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();

        MT2b t3 = new MT2b("Thread_3_Min");
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();
    }
}
