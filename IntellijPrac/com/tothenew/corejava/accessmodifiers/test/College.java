package com.tothenew.corejava.accessmodifiers.test;

// this is singleton design pattern that makes sure only single object is created of a class 
public class College {
    private static College college;
    // constructor
    private College() {}; 
    //here we are making the constructor private so that no object can be created 

    public static College getCollege()
    {
        if(college == null)
        {
            college = new College();
        }

        return college;
    }


}
