package MultiThreading2.Synchronization;

public class SyncThread extends Thread{
    @Override
    public void run()
    {
        for(int i = 0; i<1000; i++)
        {
            counter.increment();
        }
    }

    private Counter1 counter;

    public SyncThread(Counter1 counter)
    {
        this.counter = counter;
    }

}
