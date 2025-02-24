class MyThread extends Thread{
    @Override
    public void run()
    {
        System.out.println("RUNNING");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
       MyThread t1 = new MyThread(); //New state of Thread 
       System.out.println(t1.getState());
       t1.start();  // RUnnable State of Thread
       System.out.println(t1.getState());
       System.out.println(Thread.currentThread().getState());
    //    here we are making the main Thread Sleep so that run() method can run 
    //    try{
    //     Thread.sleep(3000);
    //    }
    //    catch(Exception e)
    //    {
    //     System.out.println(e.getMessage());
    //    }
       System.out.println(t1.getState());
       try {
        t1.join(); // main method will wait till the t1 Thread is executed completely
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
       System.out.println(t1.getState());
    }
}
