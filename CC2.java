import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price of Item1: ");
		int price1 = sc.nextInt();
		System.out.println("Enter the quantity of Item1: ");
		int quantity1 = sc.nextInt();
		System.out.print("Enter the price of Item2: ");
		int price2 = sc.nextInt();
		System.out.print(" Enter the quantity of Item2: ");
		int quantity2 = sc.nextInt();
			System.out.print("Enter the price of Item3: ");
		int price3 = sc.nextInt();
		System.out.print(" Enter the quantity of Item3: ");
		int quantity3 = sc.nextInt();
		int subtotal = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
		System.out.println("Subtotal: " + subtotal);
		double discount = 0.05 * subtotal;
		System.out.println("Discount: " + discount);
		double discountedamount = subtotal-discount;
		System.out.println("Discounted Amount: " +discountedamount);
		double tax = 0.12 * discountedamount;
		System.out.println("Sales Tax:" + tax);
		double total = tax + discountedamount;
		System.out.println("Final Total: " + total);
	}
}