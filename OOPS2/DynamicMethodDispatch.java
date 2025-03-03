class Zubair{
    public void name()
    {
        System.out.println("My name is Zubair in class Zubair");
    }

    public void greet()
    {
        System.out.println("Hello this is greeting from Class Zubair");
    }
}

class Sonu extends Zubair{
    public void name()
    {
        System.out.println("My name is Sonu in class Sonu");
    }

    public void salam()
    {
        System.out.println("AssalamWalaikum from class Sonu");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Zubair obj1 = new Zubair();
        obj1.name();

        Sonu sn1 = new Sonu();
        sn1.name();

        // super class reference can be equal to sub class object but not vic e  versa
        // This is the example of run time polymorphism as object creation is done in run time and at that only compiler get to know which method to call
        Zubair obj2 = new Sonu();
        obj2.name();
        // here object name method will be called that is Sonu not Zubair 
    }
}
