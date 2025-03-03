import java.util.*;


public class DqueueExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>(); 
        dq.add(20);
        dq.add(30);
        dq.remove(50);
        // System.out.println(dq.remove(50));
    }
}
