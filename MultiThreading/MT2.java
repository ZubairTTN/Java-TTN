class MyThreaddd extends Thread{
    public MyThreaddd(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        // for(int i = 0; i<10; i++)
        // {
        //     if(i ==3 )
        //     {
        //         try{
        //             Thread.sleep(5000);
        //             System.out.println(Thread.currentThread().getName());
        //         }
        //         catch(Exception e)
        //         {
        //             System.out.println(e.getMessage());
        //         }
        //     }
        //     System.out.println(i);
        // }



        for(int i = 0; i<5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " Priority " + Thread.currentThread().getPriority() + " Count " + i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MT2 {
    public static void main(String[] args) {
        // MyThreaddd t1 = new MyThreaddd("Zubair");
        // t1.setPriority(Thread.MIN_PRIORITY);
        // t1.start();
        // System.out.println(t1.getState());
        // try{
        //     t1.join();
        //     System.out.println(t1.getState()); //TURMINATED 
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage());

        // }
        // System.out.println(t1.getState()); // TURMINATED

        MyThreaddd l = new MyThreaddd("Low Priority");
        l.setPriority(Thread.MIN_PRIORITY);

        MyThreaddd m = new MyThreaddd("Medium Priority");
        m.setPriority(Thread.NORM_PRIORITY);

        MyThreaddd h = new MyThreaddd("High Priority");
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
