package com.tothenew.corejava.accessmodifiers.test;

public class University {
    // this is the example of Eager way of creating a singleton design pattern 

    // this is the another method of making a singleton design pattern for only one object creation of any class
    private static University uni = new University();

    // private constructor
    private University()
    {

    }

    public static University getUni()
    {
        return uni;
    }
}
