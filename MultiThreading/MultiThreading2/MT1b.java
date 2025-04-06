package MultiThreading2;

public class MT1b implements Runnable{
    @Override
    public void run()
    {
        int i = 1;
        while(i <100)
        {
            System.out.println("Hello Runnable Thread");
            System.out.println(Thread.currentThread().getName());
            i++;

            Thread.yield();
            
        }

        

    }
}
