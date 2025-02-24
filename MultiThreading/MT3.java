class MeraThread extends Thread {
    public MeraThread(String name)
    {
        super(name);
    }
    @Override
    public void run() {
        // try {
        // Thread.sleep(3000);
        // System.out.println("Thread is running...");
        // } catch (InterruptedException e) {
        // System.out.println(e.getMessage());

        // }

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running ");
            Thread.yield(); // give hint to the processor to give execution chance to other Thread also and
                            // not just execute himself only
        }
    }

}

public class MT3 {
    public static void main(String[] args) {
        MeraThread t1 = new MeraThread("t1");
        MeraThread t2 = new MeraThread("t2");
        t2.start();
        t1.start();
        t1.interrupt();
    }
}

// ***********Important 
// DAEMON THREADS are the Threads that run in background and JVM does not wait for them to finish if the user Thread is Finished it terminates the program and does not wait for the DEAMON Thread to finish 