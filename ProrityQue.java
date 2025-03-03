import java.util.PriorityQueue;

public class ProrityQue {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pque = new PriorityQueue<>();
        pque.add(10);
        pque.add(20);
        pque.add(15);
        pque.add(5);
        pque.add(25);
        pque.add(30);
        pque.add(20);
        System.out.println(pque);
    }
}
