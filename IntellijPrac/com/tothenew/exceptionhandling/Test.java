package com.tothenew.exceptionhandling;

public class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(3000);
    try{
        BankAccount.withdraw(5000.00);
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    }
}
