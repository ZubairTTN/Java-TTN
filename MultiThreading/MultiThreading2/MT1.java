package MultiThreading2;
// LifeCycle of a Thread
/*
 * 1. New
 * 2. Runnable
 * 3. Running
 * 4. Blocked/Waiting
 * 5. Terminated
 */
public class MT1 {
    public static void main(String[] args) {
        System.out.println("Helllo This is Multithreading demo");
        System.out.println(Thread.currentThread().getName());

        MT1a t1 = new MT1a(); //NEW
        t1.start(); //RUNNABLE

        MT1b t2 = new MT1b();
        Thread t = new Thread(t2);
        t.start();
        
    }
}
