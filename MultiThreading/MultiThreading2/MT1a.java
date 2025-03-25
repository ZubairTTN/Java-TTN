package MultiThreading2;

public class MT1a extends Thread{
    @Override
    public void run()
    {
        int i =1;
        while(i <100)
        {
            System.out.println("Hello Extended Thread");
            System.out.println(Thread.currentThread().getName());
            i++;
            Thread.yield();
            
        }

        
    }
}
