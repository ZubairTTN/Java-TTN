import java.util.*;

public class SetIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        set1.retainAll(set2); 
        System.out.println("Intersection: " + set1);
    }
}
