
class Zubair{
    public void greet()
    {
        System.out.println("Hello my name is Zubair");
    }
}
class Sonu extends Zubair{
    @Override
    public void greet()
    {
        System.out.println("Hello my name is Sonu");
    }
}


public class Polymorphism {
    public static void main(String[] args)
    {
        Zubair z = new Zubair();
        z.greet();
        Sonu s = new Sonu();
        s.greet();

        // Eg of Run time Polymorphism
        Zubair z1 = new Sonu();
        z1.greet();
    }
}
