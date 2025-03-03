import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Dog"); // Ignored

        System.out.println("Set: " + set);
    }
}
