import java.util.*;
public class ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(23);
        l1.add(66);
        l1.add(23);
        l1.add(34);
        l2.add(90);
        l2.add(67);
        l2.add(17);
        l1.addAll(2, l2);
        l1.addFirst(4);
        l1.addLast(3);
        l1.add(1, 11);
    
        for(int i : l1)
        {
            System.out.println(i);
        }
        // System.out.println(l1.size());
        // System.out.println(l2.size());
        System.out.println(l1.contains(23));
        System.out.println(l1.indexOf(66));
        System.out.println(l1.get(3));
    }
}
