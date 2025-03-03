import java.util.*;

public class MapTypesExample {
    public static void main(String[] args) {
        
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(3, "Three");
        hashMap.put(2, "Two");
        hashMap.put(null, "kaushtub" );
        System.out.println("HashMap: " + hashMap);
        System.out.println(hashMap.containsValue("kaushtub"));
    }
}
