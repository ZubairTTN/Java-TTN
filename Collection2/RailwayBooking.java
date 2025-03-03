import java.util.LinkedList;
import java.util.Queue;

public class RailwayBooking {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();

        customers.add("Alice");
        customers.add("Bob");
        customers.add("Charlie");

        System.out.println("Serving: " + customers.poll());
        System.out.println("Next customer: " + customers.peek());
        System.out.println("Remaining Queue: " + customers);
    }
}
