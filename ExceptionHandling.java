/*Angwani,Aurelua Lois
CC2 1B
Final Challenge5
*/
import java.util.Scanner;  // Import the Scanner class to read input from the user

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {  // Define a custom exception for insufficient funds
    public InsufficientFundsException(String message) {  // Constructor takes an error message
        super(message);  // Call the parent class constructor with the message
    }
}

// Custom exception for invalid quantity
class InvalidQuantityException extends Exception {  // Define a custom exception for invalid quantity
    public InvalidQuantityException(String message) {  // Constructor takes an error message
        super(message);  // Call the parent class constructor with the message
    }
}

public class ExceptionHandling{  

    public static void main(String[] args) {  

        Scanner scanner = new Scanner(System.in);  
        double balance = 1000.00;  
        int availableStock = 10;  

        // Banking System - Handle withdrawal
        while (true) {  // Start an infinite loop to repeatedly ask for input until successful withdrawal
            try {  // Begin a try-catch block to handle exceptions
                System.out.print("Enter withdrawal amount: ");  
                double withdrawalAmount = scanner.nextDouble();  
                
                if (withdrawalAmount > balance) {  
                    throw new InsufficientFundsException("Insufficient funds. Your balance is: " + balance);  // Throw an exception with a custom error message
                }
                
                balance -= withdrawalAmount;  // If withdrawal is valid, update the balance by subtracting the withdrawal amount
                System.out.println("Withdrawal successful. New balance: " + balance);  // Print the success message with the new balance
                break;  // Exit the loop after a successful withdrawal
            } catch (InsufficientFundsException e) {  // Catch the InsufficientFundsException if thrown
                System.out.println("Error: " + e.getMessage());  // Print the error message from the exception
            }
        }

        // Online Shopping Cart - Handle product quantity
        while (true) {  
            try {  
                System.out.print("Enter product quantity: ");  
                int quantity = scanner.nextInt(); 
                
                if (quantity <= 0 || quantity > availableStock) {  
                    throw new InvalidQuantityException("Invalid quantity. Please enter a quantity between 1 and " + availableStock + ".");  // Throw an exception with a custom error message
                }
                
                System.out.println("Item added to cart."); 
                break;  // Exit the loop after successfully adding the item to the cart
            } catch (InvalidQuantityException e) {  // Catch the InvalidQuantityException if thrown
                System.out.println("Error: " + e.getMessage());  // Print the error message from the exception
            }
        }

        scanner.close();  // Close the Scanner object to release the resources after use
    }
}