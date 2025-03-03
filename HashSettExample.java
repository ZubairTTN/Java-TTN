import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(5);  // Duplicate, ignored

        System.out.println("HashSet: " + set); // Output may vary
    }
}
