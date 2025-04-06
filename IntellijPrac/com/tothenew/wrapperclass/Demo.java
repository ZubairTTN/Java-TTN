package com.tothenew.wrapperclass;

// Wrapper classes convert primitive data type into Objects 
public class Demo {
    public static void main(String[] args) {
        
        int a = 8;
        float b = 8.9f;
        // primitive data types are not class as they do not have any methods associated with them
        // while string is an object and has methods associated with them such as toLowerCase() toUpperCase()
        String str = "Zubair";
        System.out.println(str.toUpperCase());
        System.out.println(str);


        Integer c = 10; //this is called autoboxing
        int g = c.intValue(); //this is called unboxing 
        // this is what happens in de when we write Integer cc = 10; 
        Integer cc = Integer.valueOf(23); //here Integer is a wrapper class for primitive data type int 
        // here Integer is an object and has many methods associated to it as it is not a primitive data type eg
        System.out.println(c.getClass());

        boolean isAdult = true;
        Boolean isTeen = true;
        // here Boolean is the wrapper class for the primitive data type  boolean and has methods associated with it, here isTeen is an object 
        // Eg: of wrapper classes 
        Float f = 1.2f;
        Double d = 1.2;
        Character e = 'c';
        Byte bb = 1;
        Short s = 2;
        Long l = 123878878l;

        // IMPORTANT
        Integer i = null; //this can hold null 
        // int ii = null; // this cannot hold null
        Integer gj = Integer.valueOf(3);
        int gg = gj.intValue();
        System.out.println(Integer.max(4, gg));
        System.out.println(Integer.toBinaryString(7));




    }

}
