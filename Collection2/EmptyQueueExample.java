import java.util.Queue;
import java.util.LinkedList;

public class EmptyQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Poll(): " + queue.poll());
        System.out.println("Peek(): " + queue.peek());

        try {
            System.out.println("Element(): " + queue.element());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
