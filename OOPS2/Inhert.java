import java.util.*;
class Base{
    int x;

    // getter
    public int getX()
    {
        return this.x;
    }

    // setter
    public void setX(int x)
    {
        System.out.println("Setting the X now ");
        this.x = x;
    }

    // non parameterized constructor called
    Base()
    {
        System.out.println("Non Parameterized constructor called");
    }

    // parameterized constructor called 
    Base(int x)
    {
        this.x = x;
    }
}

// inheriting the Base class
class Derived extends Base{
    int y;
    public int getY()
    {
        return this.y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void display()
    {
        System.out.println("This is the derived class display");
    }

}
public class Inhert {
    public static void main(String[] args) {
        Base b = new Base();
        b.x = 1234;
        System.out.println(b.getX());

        Derived d = new Derived();
        d.x = 3456;
        d.setX(6789);
        System.out.println(d.getX());
        d.setY(34);
        System.out.println(d.getY());
    }
}
