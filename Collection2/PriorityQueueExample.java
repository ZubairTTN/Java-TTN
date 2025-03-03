import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add('B');
        pq.add('C');
        pq.add('A');
        pq.add('B');
        pq.add('b');
        pq.add('a');
        pq.add('d');
        pq.add('c');

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
