package com.tothenew.wrapperclass;

class Student{
    public int id;
}
public class Demo1 {
    private static void fun(Student a) //4. here a is the new variable that having the address of the x object, so this variable is pointing towards the same object as which x is pointing 
    // in java parameters are passed as refernce varibale and new copy is created 
    {
        Student student = new Student();// 5. here we are creating a new object named student 
        student.id = 3; // here we are assigning 3 to the id of the student object 
        a = student; // 6. here we are assigning the student object variable instance to the variabl a which was previously holding the address of the variable x and now student 

        // 7. so in this way the x variable is still holding the same memory address and nothing is affected in it so sout(x.id will give 1 ).
    }
    public static void main(String[] args) {
        Student x = new Student();
        // 1. here x is the reference variable of the object new Student, so x is a variable that is holding the address of the memory of Student object 
        x.id = 1;
        // 2. here we are assigning 1 to the id of the x object 
        fun(x); //3. here we are passing the x to the function fun();
        System.out.println(x.id); //this will print 1 because 

        
    }

     
}
 