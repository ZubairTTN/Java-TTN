// import java.util.*;
class Employee{
    int id;
    int salary;
    String name;

    // constructor
    Employee(String name)
    {
        System.out.println("Constructor called");

        this.name = name;
    }

    // display
    public void display()
    {
        System.out.println("The name is " + this.name + " The id is " + this.id + " The salary is " + this.salary);
    }

    public int getSalary()
    {
        return this.salary;
    }
}
public class OopsPrac{
    public static void main(String[] args) {
        Employee e1 = new Employee("Zubair"); //instantiating a new employee object
        e1.id = 112;
        e1.name = "Zubair Ahmed";
        e1.salary = 15000;
        e1.display();
        System.out.println("The salary using getter is " + e1.getSalary());

        Employee e2 = new Employee("Sonu");
        e2.id = 123;
        e2.salary = 12000;
        System.out.println("The salary using getter is " + e2.getSalary());
        e2.display();
    }
}