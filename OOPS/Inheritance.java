// import java.util.*;
// import Bank;
class Shape {
    String color;
    public void area()
    {
        System.out.println("Displays area: ");
    }
}
// this is Single level inheritance
// here Traingle class is inheriting the parent class Shape hence can use Shape class property and methods 
class Triangle extends Shape {

    // method
    public void area(int l, int h)
    {
        System.out.println(1/2*l*h);
    }
}

// now this multilevel inheritance here EquilateralTriangle inherits Triangle class properties and methods 
// here shape is inherited by Triangle and Triangle os inherited by EquilateralTriangle hence making a multilevel inheritance 
class EquilateralTriangle extends Triangle 
{

}

// here Circle and Triangle both class are inheriting from Shape hence it is Hierarchical inheritance
class Circle extends Shape {
    public void area(int r)
    {
        System.out.print(3.14*2*r);
    }
    
}

// here Hybrid inheritance is occuring as Shpere is inheriting from circle 
class Sphere extends Circle {

}
public class Inheritance {
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle();
        t1.color = "Red";

    }
}
