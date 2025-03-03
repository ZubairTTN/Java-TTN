package com.tothenew.corejava.accessmodifiers.test;

//This Java code is an example of the Singleton Design Pattern, which ensures that only one object (school) of the class is created during the entire program execution.
public class School {
    private static School school;

//    if an object is not carrying any value then it is carrying null
//    constructor
    private School() {} //this is the constructor 
    public static School getSchool()
    {
        if(school == null)
//        If null, it means no object of School has been created yet.
//            If we don’t check, every time getInstance() is called, a new object will be created, breaking the Singleton rule.
        {
            school = new School();
//            If instance is null, we create a new object of School and assign it to instance.
        }
        return school;
    }
}
//if you cant understand this code please watch "https://www.youtube.com/watch?v=fs6ZUcF-nuc" this video for reference


// First Call to getSchool()
// school == null, so a new object of School is created.
// Subsequent Calls to getSchool()
// school != null, so the same instance is returned instead of creating a new one.
// This ensures that only one object is created!