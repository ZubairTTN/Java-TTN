import java.util.Scanner;

public class OrderProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter delivery area (Local/Remote): ");
        String area = scanner.next().toLowerCase();
        System.out.print("Enter order amount: ");
        double amount = scanner.nextDouble();

        String deliveryType = switch (area) {
            case "local" -> (amount >= 100) ? "Fast Track" : "Standard Delivery";
            case "remote" -> (amount >= 200) ? "Priority Delivery" : "Normal Delivery";
            default -> "Area not supported.";
        };

        System.out.println(deliveryType);
        scanner.close();
    }
}
