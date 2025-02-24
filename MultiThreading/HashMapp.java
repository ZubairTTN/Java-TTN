import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);
        
        // Retrieving a value
        System.out.println("Bob's Marks: " + studentMarks.get("Bob"));
        System.out.println("Contains Alice? " + studentMarks.containsKey("Alice"));
        for(Map.Entry<String, Integer> entry: studentMarks.entrySet());
    }
}
