import java.util.*;
public class ElectivePract {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Acedemoc year(3/4)");
        int year = sc.nextInt();
        if(year == 3)
        {
            System.out.println("Elective Courses: Advanced English, Algebra");
        }
        else if(year == 4)
        {
            System.out.println("Enter the Branch (CSE/IT/ECE/Other): ");
            String branch = sc.next();
            System.out.println("Elective course: " + switch(branch)
            {
                case "CSE", "IT" -> "Machine Learning, Big Data";
                
            });
        }
    }
}
