package com.tothenew.corejava.accessmodifiers.school;

public class Student {
    public String name;
    public int age;
    public void hello()
    {
        System.out.println("Greetings this is Zubair ");
    }
//    constructor
    public Student()
    {
        System.out.println("Constructor called");
    }
//    we use static keyword if we want to access the Method or the attribute without making the object of that class, using static the method or the attribute get attached to the class not to the object of that class
    public static String bye()
    {
        return "Bye..";
    }
    public static void hi()
    {
        System.out.println("This is the static method that does not need object for calling it ");
    }
}
