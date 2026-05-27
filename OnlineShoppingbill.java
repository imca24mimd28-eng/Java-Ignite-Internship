package day2assginment;
import java.util.Scanner;


public class OnlineShoppingbill {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter Customer Name: ");
	        String customerName = sc.nextLine();

	        System.out.print("Enter Product Name: ");
	        String productName = sc.nextLine();

	        System.out.print("Enter Product Price: ");
	        double price = sc.nextDouble();

	        System.out.print("Enter Quantity: ");
	        int quantity = sc.nextInt();

	        // Calculation
	        double totalBill = price * quantity;

	        // Output
	        System.out.println("\n----- BILL -----");
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Product: " + productName);
	        System.out.println("Price: " + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total Bill: " + totalBill);

	        sc.close();
	    }
	}


