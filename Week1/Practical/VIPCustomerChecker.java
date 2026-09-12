import java.util.Scanner;

public class VIPCustomerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine().trim();

        String result = validateCustomerId(customerId);
        System.out.println(result);

        scanner.close();
    }

    public static String validateCustomerId(String customerId) {
        if (customerId != null && customerId.startsWith("VIP-")) {
            return "VIP Customer";
        }
        return "Regular Customer";
    }
}
