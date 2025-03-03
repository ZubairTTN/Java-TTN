
// abstract class Parent{
//     // constructor
//     Parent()
//     {
//         System.out.println("Constructor called for class Base");
//     }
//     public void hello()
//     {
//         System.out.println("Hello");
//     }

//     abstract public void greet();

// }

// class Child extends Parent{
//     public void greet()
//     {
//         System.out.println("Good Morning");
//     }
// }

// class Child2 extends Parent{
//     public void greet()

//     {
//         System.out.println("Hello this is greeting from the Child2 Class");
//     }
// }
// public class AbstractCM {
//     public static void main(String[] args) {
//         Parent p = new Parent();
//         Child2 c = new Child2();
//     }
// }




public class AbstractCM {
    public static void main(String[] args) {
        Baleno obj=new Baleno();
        obj.defaultSpecification();
        obj.model();
         Car obj1=new Car();
    }

    
}
 interface InnerAbstractCM {
    void model();
    default void defaultSpecification()
    {
        System.out.println("V12 engine and cng");
    }

    
}
class Ertiga implements InnerAbstractCM
{
    @Override
   public void model()
    {
        System.out.println("Ertiga");
    }
}
abstract class Car{
    abstract void model();
    void defaultSpecification()
    {
        System.out.println("V12 engine and cng");
    }
}
class Baleno extends Car{
    @Override
    void model()
    {
        System.out.println("Baleno model");
    }
}