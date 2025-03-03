import java.util.*;

public class MostFrequentElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2, 5, 1, 1));
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0, mostFrequent = -1;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent element: " + mostFrequent);
    }
}
