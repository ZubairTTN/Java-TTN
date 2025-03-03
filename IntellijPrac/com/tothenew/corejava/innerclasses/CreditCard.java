package com.tothenew.corejava.innerclasses;

public class CreditCard implements Payment{
    private int creditCardNumber;

    // Constructor
    public CreditCard(int creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount)
    {
        System.out.println("Paid " + amount + " using Credit Card. ");
    }
}
