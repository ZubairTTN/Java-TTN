
class Counter {
    private int count = 0;

    // the part of the code in the whole program where shared resources are accessed and modified is known as critical section ***here increment() function is a critical section as here t1 and t2 threads are accessing the count++ using single counter instance 
    public synchronized void increment() {
        // synchronized(this){
        //     count++;
        // }
        count++;
        
    }

    public int getCount() {
        return count;
    }
}

class MeraThread2 extends Thread {
    private Counter counter;

    public MeraThread2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Sync {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MeraThread2 t1 = new MeraThread2(counter);
        MeraThread2 t2 = new MeraThread2(counter);
        t1.start();
        t2.start();
        // System.out.println();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(counter.getCount());

    }
}

class Counter{
    private int count = 0;

    // if we do not use the sunchronized keyword then here it will be known as the race condition 
    // and when we remove the race condition using sunchronization keyword it is known as mutual exclusion

    // here we are locking the threads from accessing the shared resource, there exists two types of locking in the java, 1.Intrinsic and 2. Explicit
    public synchronized void increment()
    {
        count++;
    }

    // getter 
    public int getCount()
    {
        return count;
    }
}

class MeraThread2 extends Thread{
    private Counter counter;
    // here we are defining a variable counter of type Counter that is a class so the counter variable has all the properties of the Counter class 

    // we have made the counter variable private because we only want to access this counter variable in the MeraThread2 class only and nowhere else 

    // constructor(Parameterized)
    public MeraThread2(Counter counter)
    {
        this.counter = counter;
    }

    // run method override 
    @Override
    public void run()
    {
        for(int i = 0; i<1000; i++)
        {
            counter.increment();
        }
    }
}

public class Sync{
    public static void main(String[] args) {
        Counter counter = new Counter();
        MeraThread2 t1 = new MeraThread2(counter);
        MeraThread2 t2 = new MeraThread2(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(counter.getCount());

    }
}