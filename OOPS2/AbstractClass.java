
// Important we cannot make objects of Abstract class
// an Abstract class can have abstract methods as well as concrete methods(normal methods) here hello() method is a concrete method
abstract class Base{
    public Base(){
        System.out.println("Constructor called ");
    }

    public void hello()
    {
        System.out.println("hello this is a normal method saying hello");
    }
    // abstract class
    abstract public void greet();
}


class Derived extends Base{
    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }
}

class Derived2 extends Base{
    public void th()
    {
        System.out.println("All is Well");
    }

    @Override
    public void greet()
   {
    System.out.println("Good AfterNoon");
   } 
}
public class AbstractClass {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.greet();

        Base d2 = new Derived2();
        d2.greet();

        // we cannot make any object of Abstract class
        // Base b = new Base();

    }
}
