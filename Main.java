import java.util.*;
class hello {
    int a = 20;

    hello(int a){
        this.a = a;
    }

    void print()
    {
        System.out.println("Using this keyword" + this.a);
        System.out.println("a: " + a);
    }

}
public class Main{
    public static void main(String[] args)
    {
        hello obj1 = new hello(20);
        obj1.print();

        hello obj2 = new hello(30);
        obj2.print();
    }
}
