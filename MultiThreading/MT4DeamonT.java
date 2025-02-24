class MeraThread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello World");
        }
    }
}

public class MT4DeamonT {
    public static void main(String[] args) {
        MeraThread1 t1 = new MeraThread1();
        t1.setDaemon(true); // here we are setting the t1 that is a user Thread to deamon thread so as soon
                            // as the compiler reaches the last main method statement it terminates the t1
                            // execution as jvm considers it a deamon Thread and jvm does not wait for a
                            // deamon thread execution to complete so here inspite of t1.start() method is
                            // calling a infinite loop it terminates due to t1.setDeamon(true);
        t1.start();
    }
}

// ***********Important
// DAEMON THREADS are the Threads that run in background and JVM does not wait
// for them to finish if the user Thread is Finished it terminates the program
// and does not wait for the DEAMON Thread to finish