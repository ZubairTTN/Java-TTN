class A {
    static int a = 3;
}

public class StaticExample {
    public static void main(String[] args) {
        A s = new A();
        s.a = 10;

        System.out.println(A.a);

        A.a = 8;
        System.out.println(A.a);
    }
}
