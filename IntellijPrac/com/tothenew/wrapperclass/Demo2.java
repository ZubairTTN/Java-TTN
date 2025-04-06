package com.tothenew.wrapperclass;

public class Demo2 {
    private static void fun(Integer a)
    {
        a = 2;
    }
    public static void main(String[] args) {
        Integer b = 1;
        fun(b);
        System.out.println(b); //here also same concept as Demo1.java and we will get 1;
        Integer c = 3;
        Integer d = 5;
        System.out.println(c.equals(d)); //it will give false , .equals() is a method that compares two class objects, here c and d are Wrapper class objects
    }
}
