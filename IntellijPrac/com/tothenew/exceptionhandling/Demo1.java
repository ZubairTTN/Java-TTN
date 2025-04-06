package com.tothenew.exceptionhandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo1 {
    public static void level3(){
        int array[] = new int[5];
        array[5] = 10;
    }
    public static void level2()
    {
        level3();
    }
    public static void level1()
    {
        level2();
    }

    public static void method2()
    {
        try{
            method1();
        }
        catch(Exception a)
        {
            System.out.println(a.getMessage());
        }
        
    }
    public static void method1() throws FileNotFoundException
    {
            FileReader fileReader = new FileReader("Zubair.txt");
        
    }

    public static void method3()
    {
        try{
            FileReader fileR = new FileReader("Zubair.txt");
        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException();
            // if we want to throw a custom error then we use "throw new(customErrorName)"
        }
    }

    public static int divide(int a, int b)
    {
        try{
            return a/b;
        }
        catch(Exception e)
        {
            return -1;
        }
        finally
        {
            System.out.println("Hello this is the finally block and it will execute even after an Exception has been encountered");
        }
    }
    // we can handle exceptions using 2 ways either by using try catch blocks or by using throws keyword directly in the method with the exception name 

    
    public static void main(String[] args) throws FileNotFoundException{
        try{
            level1();
    }
    catch(Exception o)
    {
        // StackTraceElement[] stackTrace = o.getStackTrace();

        // for(int i = 0; i<stackTrace.length; i++)
        // {
        //     System.out.println(stackTrace[i]);
        // }
        o.printStackTrace();
    }

    System.out.println(divide(4, 9));

    
}
}
