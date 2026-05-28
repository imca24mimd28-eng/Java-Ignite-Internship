package day3assginment;
import java.util.Scanner;

public class ResataurantOrder {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Main Menu");
	        System.out.println("1. Veg");
	        System.out.println("2. Non-Veg");

	        System.out.print("Enter choice: ");
	        int mainChoice = sc.nextInt();

	        int price = 0;
	        String item = "";

	        if (mainChoice == 1) {
	            System.out.println("Veg Menu");
	            System.out.println("1. Fried Rice - Rs.150");
	            System.out.println("2. Noodles - Rs.120");

	            System.out.print("Enter item choice: ");
	            int vegChoice = sc.nextInt();

	            if (vegChoice == 1) {
	                item = "Fried Rice";
	                price = 150;
	            } else if (vegChoice == 2) {
	                item = "Noodles";
	                price = 120;
	            } else {
	                System.out.println("Invalid Selection");
	             
	            }

	        } else if (mainChoice == 2) {
	            System.out.println("Non-Veg Menu");
	            System.out.println("1. Chicken Biryani - Rs.250");
	            System.out.println("2. Grill Chicken - Rs.400");

	            System.out.print("Enter item choice: ");
	            int nonVegChoice = sc.nextInt();

	            if (nonVegChoice == 1) {
	                item = "Chicken Biryani";
	                price = 250;
	            } else if (nonVegChoice == 2) {
	                item = "Grill Chicken";
	                price = 400;
	            } else {
	                System.out.println("Invalid Selection");
	              
	            }

	        } else {
	            System.out.println("Invalid Selection");
	           
	        }

	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();

	        sc.nextLine();

	        System.out.print("Enter member status Gold/Silver/Normal: ");
	        String member = sc.nextLine();

	        double bill = price * quantity;
	        double discount = 0;

	        if (member.equalsIgnoreCase("Gold")) {
	            discount = bill * 20 / 100;
	        } else if (member.equalsIgnoreCase("Silver")) {
	            discount = bill * 10 / 100;
	        } else if (member.equalsIgnoreCase("Normal")) {
	            discount = 0;
	        } else {
	            System.out.println("Invalid Selection");
	            
	        }

	        double finalBill = bill - discount;

	        System.out.println("Item Ordered: " + item);
	        System.out.println("Total Bill = Rs." + bill);
	        System.out.println("Discount = Rs." + discount);
	        System.out.println("Final Bill = Rs." + finalBill);

	        if (finalBill > 2000 && member.equalsIgnoreCase("Gold")) {
	            System.out.println("Congratulations! You get a free dessert.");
	        }
	          sc.close();
	    }
	   
	}


