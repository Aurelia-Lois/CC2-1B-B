/**Angwani,Aurelia Lois M
 *CC2
 *10/04/2024
 */
 import java.util.Scanner;
 public class GroceryStoreDiscountCalculator{
 	public static void main(String[] args){
 	//Enter the user input
 	Scanner sc = new Scanner(System.in);
 	//Enter the total purchase amount
 	System.out.print("Enter the total purchase amount:");
 	double totalPurchaseAmount  =  sc.nextDouble();
 	double discount = 0.0;
    double finalPrice;
 	// Determine the discount based on the total purchase amount
 	if(totalPurchaseAmount < 1000){
 		discount = 0.0;//No discount
 	}else if(totalPurchaseAmount >= 1000 && totalPurchaseAmount <= 5000){
 		discount = 0.05;//5% discount
 	}else if(totalPurchaseAmount >= 5001 && totalPurchaseAmount <= 10000){
 		discount = 0.10;//5% discount
 	}else{
 		discount = 0.15;//15% dicount
 	}
 	//Calculate
 	finalPrice = totalPurchaseAmount * (1 - discount);
	// Display the discount and the final price
    System.out.printf("Discount applied: %.0f%%%n", discount * 100);
    System.out.printf("Final price after discount: PHP %.2f%n", finalPrice);
 	}
 }