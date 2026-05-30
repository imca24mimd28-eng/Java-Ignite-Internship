package day5assginment;
import java.util.Scanner;

public class ShoppingDiscount {


	    public static double calculateBill(double bill, double discount) {
	        double finalBill = bill - (bill * discount / 100);
	        return finalBill;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Bill Amount: ");
	        double bill = sc.nextDouble();

	        System.out.print("Enter Discount Percentage: ");
	        double discount = sc.nextDouble();

	        double result = calculateBill(bill, discount);

	        System.out.println("Final Bill = " + result);

	        sc.close();
	    }
	}

