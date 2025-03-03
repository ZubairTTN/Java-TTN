import java.util.ArrayList;
import java.util.HashSet;

public class ListSeteg {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(45);
        arr.add(55);
        arr.add(2);

        for(int a : arr)
        {
            System.out.println(a);
        }

    

    HashSet<Integer> h1 = new HashSet<>();
    h1.add(45);
    h1.add(3);
    h1.add(98);
    System.out.print(h1);
    
}
}