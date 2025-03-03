package com.tothenew.corejava.accessmodifiers.game;

public class AC {
    private String name;
    protected String company;
    public static final double pi;

    // this is a static block 
    static{
        pi = 3.14;
    }
    // the final keyword is like a constant, if any variable has been assigned final keyword it cannot be changed neither its setter can be made but yes getter can be made 
    static{
        System.out.println("Hello this is Static block ");
    }
    // Constructor
    public AC(String name, String company)
    {
        this.name = name;
        this.company = company;
    }

    // here in this method we are changing the company name 
    public void compName()
    {
        System.out.println(this.company);
    }

    // here in this method we are changing the game name 
    protected void changeName(String name)
    {
        this.name = name;
    }
}
