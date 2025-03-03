// import java.util.*;

import java.nio.channels.Pipe.SourceChannel;

class Pen {
    String color;
    String type; // ballpoint / gelpen

    public void write() {
        System.out.println("Writing");

    }

    public void printColor() {
        System.out.println(this.color); // here this keyword access which object pen1 or pen2 accessed the printColor()
                                        // function and print the color according to which object called it.
    }
}

// by convention class names always start from Capital letters
class Student {
    String name;
    int age;

    // by convention method or fuctions name always start from small letters
    // public void printInfo() {
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    // // constructor (non parameterized)
    // Student()
    // {
    //     System.out.println("Constructor called");
    // }
    // // contructor parameterized 
    // Student(String name, int age)
    // {
    //     this.name = name;
    //     this.age = age;
    // }

    public void printInfo(String name)
    {
        System.out.println(name);
    }

    public void printInfo(int age)
    {
        System.out.println(age);
    }

    public void printInfo(String name, int age)
    {
        System.out.println(name + " " + age);
    }
}

abstract class Animal {
    abstract void walk();
    public void eats()
    {
        System.out.println("Animal eats");
    }

    // contructor
    Animal()
    {
        System.out.println("Constructor called");
    }
    
}
class Horse extends Animal {
    public void walk()
    {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 Legs");
    }
}
public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Black";
        // pen1.type = "BallPoint";
        // System.out.println("Pen Color: " + pen1.color );
        // System.out.println("Pen Type " + pen1.type);
        // pen1.printColor();
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Blue";
        // pen2.type = "GelPen";
        // System.out.println("Pen Color: " + pen2.color );
        // System.out.println("Pen Type " + pen2.type);
        // pen2.printColor();
        // pen2.write();

        // Student st1 = new Student();
        // st1.name = "Zubair";
        // st1.age = 22;
        // st1.printInfo();

        // Student st2 = new Student();
        // st2.name = "Kaiff";
        // st2.age = 23;
        // st2.printInfo();

        // Student st3 = new Student("Kaushtub", 22);
        // st3.printInfo();

        // Student st4 = new Student();
        // st4.printInfo("Zubair");

        // st4.printInfo(22);

        // st4.printInfo("Zubair " + 22 );

        Animal a1 = new Animal();
        Horse horse = new Horse();
        horse.walk();
        horse.eats();

        Chicken ch1 = new Chicken();
        ch1.eats();

        
    }
}