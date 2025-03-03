import java.util.Queue;
import java.util.LinkedList;

public class QueueOfferAddExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 3; i++) {
            queue.add(i);
        }

        System.out.println("Queue: " + queue);

        System.out.println("Adding element using add(): ");
        try {
            queue.add(4);
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Adding element using offer(): " + queue.offer(5));
        System.out.println("Final Queue: " + queue);
    }
}
