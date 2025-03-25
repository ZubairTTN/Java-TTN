package MultiThreading2.MT2;

// In this program we are understanding the Daemon Threads
/*daemon Threads are those threads that run in background and the jvm does not wait for thier execution to finish */
public class DaemonThread extends Thread{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Hello World !");
        }
    }
    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        t1.start(); //This is  known as User Thread
        System.out.println(t1.isDaemon());
        System.out.println("Main Done");
    }
}
