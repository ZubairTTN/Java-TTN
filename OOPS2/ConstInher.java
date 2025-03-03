
class Base{
    // non parameterized constructor
    Base()
    {
        System.out.println("Base class Constructor");

    }

    // parametrized constructot
    Base(int x)
    {
        System.out.println("This is the base class Consructor with value "+ x);
    }
}

class Derived extends Base{
    Derived()
    {
        // to call the parameterized constructor of the Base class we use the Super keyword inside the Derived class constructor
        // super(0);
        System.out.println("Derived Class Constructor called");
    }
    Derived(int x, int y)
    {
        super(x);
        System.out.println("This is the overloaded constructor class of the derived class with value of x and y " + x + " and " + y);
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived()
    {
        System.out.println(" constructor of the ChildOfDerived Class");
    }

    ChildOfDerived(int x, int y, int z)
    {
        super(x, y);
        System.out.println("parameterized constructor of the ChildDerivedClass");
    }
}
public class ConstInher {
    public static void main(String[] args) {
        // Base b = new Base();
        // Derived d = new Derived(14, 7);
        ChildOfDerived cd = new ChildOfDerived(23, 76, 88);
    }
}
