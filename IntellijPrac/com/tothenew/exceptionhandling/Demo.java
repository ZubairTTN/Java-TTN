package com.tothenew.exceptionhandling;

public class Demo {

    public static int divide(int a, int b)
    {
        try{
            return (a/b);
        }
        // here Excpetion e is the parent class of the exception hence the code flow will never reach down to ArithmeticException
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return -1;
        }
        // we can give any name to the e object of the exception like here i have used a variable 
        catch(ArithmeticException a)
        {
            System.out.println(a.getMessage());
            return -1;
        }
        catch(RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        int num[] = {10, 200, 0, 40};

    int denom[] = {1, 2, 0, 4};

    for(int i = 0; i<num.length; i++)
    {
        System.out.println(divide(num[i], denom[i]));
    }
    }
}
