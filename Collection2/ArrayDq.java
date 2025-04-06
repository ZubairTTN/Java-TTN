import java.util.ArrayDeque;

public class ArrayDq {
    public static void main(String[] args) {
        ArrayDeque<Integer> l = new ArrayDeque<>();
        l.add(34);
        l.add(32);
        l.add(98);
        l.addFirst(3);
        l.addLast(11);
        l.remove(); //this removes from start || first element 
        l.removeLast(); //this remove the last element 
        l.add(61);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        for(int i: l )
        {
            System.out.println(i);
        }

    }
}
