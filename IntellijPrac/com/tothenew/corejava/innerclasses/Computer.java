package com.tothenew.corejava.innerclasses;

// Static Inner Class 
public class Computer {
    // An instance variable in Java is a variable that is declared inside a class but outside any method, constructor, or block. It is associated with an instance (object) of the class, meaning each object of the class has its own separate copy of the instance variable. here brand, model and os are instance variables

    private String brand;
    private String model;
    private OperatingSystem os;
    // os: Stores an instance of the inner class OperatingSystem, which represents the operating system (e.g., Windows, Linux, macOS).
    // How is private OperatingSystem os; declared before the OperatingSystem class is written? Shouldn't it be declared after the OperatingSystem class?


    // need for getOs getter in order to access the displayInfo():
    // In your Computer class, the os variable is private, This means it cannot be accessed directly from outside the Computer class. Instead, we need a getter method to retrieve the OperatingSystem instance.
    public OperatingSystem getOs()
    {
        return os;
    }

    // here we are creating a static inner class, this USB static inner class has no connection or dependencies on the Computer class
    static class USB{
        private String type;

        public USB(String type)
        {
            this.type = type;
        }

        public void displayInfo()
        {
            System.out.println("USB Type: " + type);
        }

    }

    // constructor

    public Computer(String brand, String model, String osName)
    {
        this.model = model;
        this.brand = brand;
        this.os = new OperatingSystem(osName); //this will call the OperatingSystem Constructor
        // Creates an instance of the inner class OperatingSystem.
        // Passes osName (the OS name) to the OperatingSystem constructor.
        // this.os refers to the current object's os field.

    }

    // inner member class 
    class OperatingSystem{
        private String osName;

        // constructor
        public OperatingSystem(String osName)
        {
            this.osName = osName;
        }

        public void displayInfo()
        {
            System.out.println("Computer Model: " + model + ", OS: " + osName);
        }
    }
}
