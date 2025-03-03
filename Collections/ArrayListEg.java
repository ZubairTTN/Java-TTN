import java.util.*;
public class ArrayListEg{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(6);
        l1.add(78);
        l1.add(67);
        l1.add(0, 9);
        for(int i: l1)
        {
            System.out.println(i);
        }
        System.out.println(l1.size());
    }
}