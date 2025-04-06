import java.util.ArrayList;
import java.util.Scanner;

public class Gener {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        // here the above arrayList will store an object 
        arrayList.add("Str1");
        arrayList.add(67);
        arrayList.add(71);
         
        int a = (int)arrayList.get(2);
        System.out.println(a);
    }

}
