import java.util.*;

public class CollC {
    public static void main(String[] args) {
        // this is the collection class
        // ArrayList is used for variable size collections
        // ArrayList is a class that implements the List interface
        // List is an interface that extends the Collection interface
        // List is an ordered collection (also known as a sequence)
        // List allows duplicate elements
        // List allows null elements

        // Set is used for distinct elements
        // Stack A lifo data structure
        // Queue A fifo data structure
        // HashMap A key value pair data structure
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(13);
        list2.add(91);
        list2.add(45);
        list.add(23);
        list.add(44);
        list.add(45);
        list.add(1, 66);

        for (int i : list) {
            System.out.println(i);
        }
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
