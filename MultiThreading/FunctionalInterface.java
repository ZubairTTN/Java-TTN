interface Calculator{
    int square(int x);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Calculator cal = (x) -> x*x;
        System.out.println(cal.square(4));
    }
}
