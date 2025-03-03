package com.tothenew.corejava.innerclasses;

public class Car {

    private String model;
    private boolean isEngineOn;

    // constructor
    public Car(String model)
    {
        this.model = model;
        this.isEngineOn = false;
    }

    // This is Known as Member inner class
    class Engine{
        public void start()
        {
            if(!isEngineOn)
            {
                isEngineOn = true;
                System.out.println(model + " Engine Started.");
            }
            else
            {
                System.out.println(model + " Engine is already on.");
            }
        }
        
        public void stop()
        {
            if(isEngineOn)
            {
                isEngineOn = false;
                System.out.println(model + " Engine turned off");
            }
            else{
                System.out.println(model + "  Engine already turned off ");
            }
        }
    }
}
