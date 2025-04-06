interface Calculator{
    int square(int x);
}

// functional interface are those interface classes that have only one functions/methods 
public class FunctionalInterface {
    public static void main(String[] args) {
        Calculator cal = (x) -> x*x;
        System.out.println(cal.square(4));
    }
}
