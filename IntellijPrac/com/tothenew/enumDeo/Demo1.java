package com.tothenew.enumDeo;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        Day monday = Day.MONDAY;
        System.out.println(monday.ordinal()); // .ordinal gives the index/order of the constant that is present in the
                                              // enum class
        System.out.println(monday.name().toLowerCase());
        System.out.println(monday.name().toUpperCase());
        String mondayString = monday.name(); // this returns a string
        System.out.println(mondayString);
        Day[] values = Day.values();
        System.out.println();
        for (Day i : values) {
            System.out.println(i);
        }
        System.out.println();
        monday.display();

        // switch case
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY -> {
                System.out.println("Hello Today is Monday");

            }
            case TUESDAY -> {
                System.out.println("Hello Today is Tuesday");

            }
            case WEDNESDAY -> {
                System.out.println("Today is Wednesday");
            }

            default -> {
                System.out.println("Weekend aa gaya bhai !!!");
            }

        }
    }
}
