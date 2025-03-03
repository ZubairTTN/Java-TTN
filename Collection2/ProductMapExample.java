import java.util.HashMap;
import java.util.Map;

public class ProductMapExample {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 50000);
        productPrices.put("Phone", 20000);
        productPrices.put("Tablet", 15000);

        for (Map.Entry<String, Integer> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue());
        }
    }
}
