import java.util.Scanner;

public class ElectiveCourses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your academic year (3/4): ");
        int year = scanner.nextInt();

        if (year == 3) {
            System.out.println("Elective courses: Advanced English, Algebra");
        } else if (year == 4) {
            System.out.print("Enter your branch (CSE/IT/ECE/Other): ");
            String branch = scanner.next().toUpperCase();

            System.out.println("Elective courses: " + switch (branch) {
                case "CSE", "IT" -> "Machine Learning, Big Data";
                case "ECE" -> "Antenna Engineering";
                default -> "Optimization";
            });
        } else {
            System.out.println("Not Eligible for Elective courses");
        }
        
        scanner.close();
    }
}