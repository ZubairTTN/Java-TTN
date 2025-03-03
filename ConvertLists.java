import java.util.*;

public class ConvertLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C"));

        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println("ArrayList: " + arrayList);

        LinkedList<String> newLinkedList = new LinkedList<>(arrayList);
        System.out.println("LinkedList: " + newLinkedList);
    }
}
