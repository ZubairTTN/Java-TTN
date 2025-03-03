package com.tothenew.corejava.accessmodifiers.test;

import com.tothenew.corejava.accessmodifiers.school.Student;

public class Test {
    public static void main(String[] args) {
//        if we want to restrict the creation of any object of any particular class we can make its constructor private hence no object can be made and we can make its methods and attributes static so that we can access them directly from class not using object
        Student student = new Student();
        student.age = 10;
        student.name = "Zubair";
        System.out.println(student.name);
        student.hello();
//        here we are accessing the bye method of the Student class without any object student because of bye method being a static function/method
        System.out.println(Student.bye());
        Student.hi();

        School school1 = School.getSchool();
        System.out.println(school1.hashCode());
        School school2 = School.getSchool();
        System.out.println(school2.hashCode());
        // here School1 and School2 both have the same hasCode hence both are single and same object as only one object can be made using singleton pattern design 

        College college1 = College.getCollege();
        College college2 = College.getCollege();
        System.out.println(college1.hashCode());
        System.out.println(college2.hashCode());
        // hashCode() is a method in Java that returns an integer (hash code) representing the memory address of an object. It helps Java quickly locate objects in hash-based collections like HashMap, HashSet, and HashTable.
        
        University uni1 = University.getUni();
        System.out.println(uni1.hashCode());
        // hashCode() returns the integer that is memory address of the object that is created in memory 
    }
}
