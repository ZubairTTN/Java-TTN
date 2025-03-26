package MultiThreading2.Strings;


// StringBuffer provides Thread safety and hence slower than StringBuilder

/*
 * 1. Speed: StringBuilder >>> StringBuffer
 * 2. Mutability: String(No), StringBuilder & StringBuffer(Yes)
 * 3. thread Safety: String(Yes), StringBuilder(No), StringBuffer(Yes)
 * 
 * 4. Performance: String(slow due to immutability), StringBuilder(fast due to no Synchronization), Stringbuffer(Slower due to synchronization and Thread safety)
 * 
 * 5. Storage: String(String pool), StringBuilder & StringBuffer(Heap)
 * 
 * 6. Use-Cases: String(small, fixed texts), StringBuilder(Single-Threaded apps), StringBuffer(Multi-Threaded apps)
 */
class Task extends Thread {
    private StringBuffer sb;

    // Constructor
    public Task(StringBuffer sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            sb.append("z");
        }
    }
}

public class ST3 {

    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer(); // here we are creating a single StringBuffer sb and below we passing the same sb in both the Task t1 and t2 threads 
        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final Length: " + sb.length());
    }
}
