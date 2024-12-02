/**Angwani,Aurelia Lois M
 *CC2
 *10/06/2024
 */
 import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Display menu
        System.out.println("MENU");
        System.out.println("1. Burger    - PHP 100");
        System.out.println("2. Fries     - PHP 50");
        System.out.println("3. Soda      - PHP 30");
        System.out.println("4. Ice Cream - PHP 45");
        System.out.println("5. Exit");
        
        // Prompt user for menu selection
        System.out.print("Enter the menu number of your choice: ");
        int choice = sc.nextInt();

        // Check for exit option
        if (choice == 5) {
            System.out.println("Thank you for visiting!");
            sc.close();
            return;
        }

        // Validate menu choice
        if (choice < 1 && choice > 4) {
            System.out.println("Invalid choice. Please select a valid menu number.");
            sc.close();
            return;
        }

        // Prompt user for quantity
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();
        
        // Validate quantity
        if (quantity <= 0) {
            System.out.println("Invalid quantity. Please enter a positive integer.");
            sc.close();
            return;
        }

        // Calculate total amount based on choice
        int price = 0;
        String itemName = "";

        switch (choice) {
            case 1:
                price = 100;
                itemName = "Burger";
                break;
            case 2:
                price = 50;
                itemName = "Fries";
                break;
            case 3:
                price = 30;
                itemName = "Soda";
                break;
            case 4:
                price = 45;
                itemName = "Ice Cream";
                break;
        }

        // Calculate total cost
        int totalAmount = price * quantity;

        // Display the total bill
        System.out.println("You ordered " + itemName + ".");
        System.out.println("Total amount: " + totalAmount + " PHP");
        
        // Close the scanner
        sc.close();
    }
}