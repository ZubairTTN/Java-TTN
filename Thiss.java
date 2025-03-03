
class A{
    int a = 3;
    static void run()
    {
        System.out.println(this.a);
    }
}
public class Thiss {
    public static void main(String[] args)
    {
        A age = new A();
        age.run();
    }
}
