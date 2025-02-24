
class Counter {
    private int count = 0;

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
