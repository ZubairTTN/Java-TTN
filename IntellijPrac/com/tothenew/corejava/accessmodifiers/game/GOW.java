package com.tothenew.corejava.accessmodifiers.game;

public class GOW extends AC{

    // private String name;
    // protected String company;
    public GOW(String name)
    {
        super(name, "God of War");
    }

    private String getName()
    {
        return getClass().getSimpleName();
    }
    public void slogan()
    {
        System.out.println(getName());
    }
}
