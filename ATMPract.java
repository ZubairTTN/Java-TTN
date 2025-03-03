
import java.util.*;
public class ATMPract {
    public static void main(String[] args)
    {
        int balance = 1000, attempts = 3;
        Scanner sc = new Scanner(System.in);
        while(attempts > 0)
        {
            System.out.print("Enter the withdrawal amount(Multiple of 50): ");
            int amount = sc.nextInt();
            if(amount % 50 != 0)
            {
                System.out.print("Invalid amount ! must be multiple of 50: ");

            }else if(amount > balance)
            {
                System.out.println("Insufficient Balance ");
            }
            else
            {
                balance = balance-amount;
                System.out.print("Withdrawal Successfull remaining balance is " + balance);
                break;
            }
            attempts--;
            if(attempts == 0)
            {
                System.out.println("Too many failed attempts Try again later.");
            }
        }
        sc.close();
    }
}
