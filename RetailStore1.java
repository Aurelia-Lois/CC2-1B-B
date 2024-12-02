import java.util.Scanner;

public class RetailStore1 {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner lois = new Scanner(System.in);
        
        // Declare arrays to store quantities and prices for 10 products
        int[] quantities = new int[10];
        double[] prices = new double[10];
        
        // Variable to store the total value of stock
        double totalValue = 0;
        
        // Loop through to input quantities and prices for each product
        for (int i = 0; i < 10; i++) {
            // Get the quantity for the product
            System.out.println("Enter the quantity for product " + (i + 1) + ":");
            quantities[i] = lois.nextInt();
            
            // Get the price for the product
            System.out.println("Enter the price for product " + (i + 1) + ":");
            prices[i] = lois.nextDouble();
            
            // Calculate the value for this product and add it to the total value
            totalValue += quantities[i] * prices[i];
        }
        
        // Display the total value of the inventory
        System.out.printf("The total value of all items in stock is: Php %.2f\n", totalValue);
        
        // Close the scanner to prevent resource leaks
        lois.close();
    }
}
