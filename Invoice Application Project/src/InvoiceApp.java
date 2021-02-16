
import java.util.Scanner;

public class InvoiceApp {

	public static void main(String args[]) {
		
		//Declare scanner object
		Scanner sc = new Scanner(System.in);
		
		//Task 1 - Display prompt
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println("");
		System.out.println("");
		
		//Task 2 - Prompt user to enter subtotal
		System.out.print("Enter a subtotal: ");
		double subtotal = sc.nextDouble();
		
		//Task 3 - Calculate discount amount with rounding up
		double discount = 0.8;
		double totalDiscount = ((int)((subtotal * discount * 100) + 0.5))/100.0;
		double total = ((int)(((subtotal - totalDiscount) * 100) + 0.5))/100.0;
		
		//Task 4 - Display the results
		System.out.println("Discount percent value: 20%");
		System.out.println("Discount amount: " + totalDiscount);
		System.out.println("Invoice total: " + total);
	}
}
