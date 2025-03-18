package com.tothenew.exceptionhandling;

public class P {
    public static void main(String[] args) {
        try {
            System.out.println(10 + 20 + "Zubair");
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()
            );
        }
    }
}
