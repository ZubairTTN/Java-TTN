import java.util.*;

public class SortHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(5, 2, 8, 1, 9));

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("Sorted Set: " + treeSet);
    }
}
