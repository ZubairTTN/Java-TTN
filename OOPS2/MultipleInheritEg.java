interface Animal{
    public void eat();
}

interface Bird{
    public void fly();
}


class Crow implements Animal, Bird{
    @Override
    public void eat()
    {
        System.out.println("eating...");
    }

    @Override
    public void fly()
    {
        System.out.println("Flying...");
    }
}
public class MultipleInheritEg {
    public static void main(String[] args) {
        Crow c = new Crow();
        c.eat();
        c.fly();
    }
}
