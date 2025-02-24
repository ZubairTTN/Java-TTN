class MyThread1 extends Thread{
    // constructor
    MyThread1(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 0;
        while(i<50)
        {
            System.out.println(this.getName());
            i++;
        }
    }
}
class MyThread2 extends Thread{
    MyThread2(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 0;
        while(i<50)
        {
            System.out.println(this.getName());
            try{
                Thread.sleep(455);
                // sleep mekthod of the Thread class sleeps the process for 455 sec here 
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Zubair");
        MyThread2 t2 = new MyThread2("Sonu");
        t1.start();
        try{
            t1.join();
            // t1.join(); states that dont start t2 untill t1 is not finished
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();
    }
}
