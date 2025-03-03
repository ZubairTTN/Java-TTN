package OOPS;
// Abstraction using interfaces
interface Animal {
    public void walk();
}

// in interfaces we implements instead of extends that is inheritance
class Horse implements Animal {
    public void walk()
    {
        System.out.println("Walks on 4 legs");
    }
}
public class Interfacess {
    public static void main(String[] args)
    {
        Horse h1 = new Horse();
        h1.walk();
    }
}
