
// import java.util.*;
class Employee{
    private int id;
    private String name;

    // parameterized constructor
    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    // non parameterized constructor
    Employee()
    {
        System.out.println("Constructor called");
    }
    public void display()
    {
        System.out.println(this.id + " " + this.name);
    }

    // getter 
    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    // setter
    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
public class AccessMod {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(1234);
        emp1.setName("Zubair");
        emp1.display();
        System.out.println(emp1.getName());

    }
}
