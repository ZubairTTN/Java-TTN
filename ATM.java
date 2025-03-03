import java.util.*;

public class ATM {
    public static void main(String[] args) {
        int balance = 1000, attempts = 3;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.print("Enter withdrawal amount (Multiple of 50): ");
            int amount = scanner.nextInt();

            if (amount % 50 != 0) {
                System.out.println("Invalid amount! Must be a multiple of 50.");
            } else if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful! Remaining balance: " + balance);
                break;
            }
            attempts--;
            if (attempts == 0) {
                System.out.println("Too many failed attempts. Try again later.");
            }
        }
        scanner.close();
    }
}
