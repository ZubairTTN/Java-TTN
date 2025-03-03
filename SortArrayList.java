import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

        Collections.sort(list);
        System.out.println("Ascending Order: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order: " + list);
    }
}
