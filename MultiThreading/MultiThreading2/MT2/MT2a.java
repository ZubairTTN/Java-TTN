package MultiThreading2.MT2;

public class MT2a extends Thread{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getState() + " RUNNING ");
        try {
            Thread.sleep(2000);  //here t1 thread execution is paused using Thread.sleep();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception{
        MT2a t1 = new MT2a(); //NEW
        System.out.println(t1.getState()); 
        t1.start(); //RUNNABLE
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());

        try {
            Thread.sleep(1000); //checked exception
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState()); //TIMED WAITING 

        t1.join(); //main() method will wait for the t1 Thread to finish its execution before going further
        /*on whichever Thread .join() is used the program will wait for that Thread execution to finish  */
        System.out.println(t1.getState()); //TERMINATED
        
    }
}
