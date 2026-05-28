package day3assginment;
import java.util.Scanner;

public class ElectricityBill {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("1. Domestic");
	        System.out.println("2. Commercial");
	        System.out.println("3. Industrial");

	        System.out.print("Enter connection type");
	        int choice = sc.nextInt();

	        System.out.print("Enter units consumed");
	        int units = sc.nextInt();

	        double bill = 0;

	        switch (choice) {
	            case 1:
	                if (units <= 100)
	                    bill = 0;
	                else if (units <= 300)
	                    bill = (units - 100) * 5;
	                else
	                    bill = (200 * 5) + (units - 300) * 8;
	                System.out.println("Domestic Bill = Rs." + bill);
	                break;

	            case 2:
	                if (units < 200)
	                    bill = units * 10;
	                else
	                    bill = units * 15;
	                System.out.println("Commercial Bill = Rs." + bill);
	                break;

	            case 3:
	                System.out.print("Is power factor good? true/false");
	                boolean powerFactor = sc.nextBoolean();

	                bill = units * 20;

	                if (units > 500 && powerFactor) {
	                    bill = bill - (bill * 10 / 100);
	                }

	                System.out.println("Industrial Bill = Rs." + bill);
	                break;

	            default:
	                System.out.println("Invalid Connection Type");
	        }
	        sc.close();
	    }
	}

