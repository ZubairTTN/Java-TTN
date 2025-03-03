import java.util.*;

public class HashSetVsTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(5, 2, 8, 1, 9));
        System.out.println("HashSet (No order): " + hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet (Sorted): " + treeSet);
    }
}
