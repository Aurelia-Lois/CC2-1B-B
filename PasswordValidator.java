import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter your password:");
            String password = sc.nextLine();
            int length = password.length();

            if (length < 8) {
                System.out.println("Password must be at least 8 characters.");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("Password must contain at least one uppercase letter.");
            } else if (!password.matches(".*\\d.*")) {
                System.out.println("Password must contain at least one number.");
            } else {
                System.out.println("Your password is valid!");
                break; // Exit the loop if the password is valid
            }
        }
        
        sc.close(); // Close the scanner after the loop
    }
}
