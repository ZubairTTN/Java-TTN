package com.tothenew.enumDeo;

// this is an enum class 
public enum Day {
    // SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY ; //here all these constant values are instances of class Day 
    // which means at run time each constant changes into like Day SUNDAY = new Day();
    //   Day MONDAY = new Day();

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String lower;

    // This is the constructor
    private Day(String lower)
    {
        System.out.println("Constructor called");
        this.lower = lower;
    }

    public void display()
    {
        System.out.println("Today is "+ this.name()); 
    }
}
