import java.util.HashMap;
import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(8, 0.5f);
        h.add(34);
        h.add(43);
        System.out.println(h);

        HashMap<Integer, String> m = new HashMap<>();
        m.put(8274, "Zubair");
        m.put(7612, "Kaushtub");
        m.put(5555, "Ahzem");
        System.out.println(m.get(8274));
        // System.out.println(m.get());
        System.out.println(m.containsValue("Kaushtub"));
        System.out.println(m.containsKey(5555));
        System.out.println(m);
        m.remove(8274);
        System.out.println(m);
     }
}
