import java.util.LinkedHashMap;
import java.util.Map;

public class BankingTransactions {
    public static void main(String[] args) {
        Map<Integer, String> transactions = new LinkedHashMap<>(10, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 10;
            }
        };

        for (int i = 1; i <= 12; i++) {
            transactions.put(i, "Transaction " + i);
        }

        System.out.println(transactions);
    }
}
