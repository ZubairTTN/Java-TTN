import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Cherry", 150);

        // Using Iterator
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using forEach
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        // Using entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
