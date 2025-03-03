import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 1));
        HashSet<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println("List after removing duplicates: " + list);
    }
}
