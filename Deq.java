import java.util.ArrayDeque;

public class Deq {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(30);
        dq.addLast(4);
        dq.addLast(32);
        dq.offerFirst(12);
        dq.offerLast(11);
        dq.push(45);
        System.out.println(dq);
        System.out.println(dq.pop());
        System.out.println(dq);

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
        System.out.println(dq);

        int age = Integer.parseInt("34");
        System.out.println(age);
    }
}
