class Employee{
    private int id;
    private String name;

    // constructor
    Employee()
    {
        System.out.println("Non Parametrized constructor called ");
    }
    // parameterized constructor
    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    void display()
    {
        System.out.println("The name of Employee is " + this.name + " The id of Employee is " + this.id);
    }

    // getter 
    public int getId()
    {
        return this.id;
    }
    // getter name
    public String getName()
    {
        return this.name;
    }

    // setter name
    public void setName(String name)
    {
        this.name = name;

    }
    public void setId(int id )
    {
        this.id = id;
    }
}

// inheritance
class Competency extends Employee{

}
public class Inhertit {
    public static void main(String[] args) {
        Employee ep1 = new Employee();
        // cannot access name and id because they are private and we can access them using getter and setter 
        // ep1.name = "Zubair";
        // ep1.id = 1234;
        ep1.display();
    }
}
