import java.util.LinkedList;
import java.util.*;
public class LinkedL {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(34);
        l1.add(54);
        l1.add(23);
        l1.addFirst(1);
        l1.addLast(44);

        for(int i : l1)
        {
            System.out.println(i);
        }
    }
}
