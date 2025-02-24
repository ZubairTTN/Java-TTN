class MyThread extends Thread{
    // constructors in Thread
    MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 0;
        while(i<100)
        {
            System.out.println("I am a thread");
            i++;
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Zubair");

        t1.start();
        System.out.println("The id of the Thread is " + t1.getName());
    }
}
