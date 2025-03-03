import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "John");
        studentMap.put(2, "Emma");

        System.out.println(studentMap);
    }
}
