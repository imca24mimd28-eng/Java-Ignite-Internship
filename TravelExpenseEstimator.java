package day2assginment;
import java.util.Scanner;
public class TravelExpenseEstimator {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter Travel Distance (KM): ");
	        double distance = sc.nextDouble();

	        System.out.print("Enter Petrol Price per Liter: ");
	        double petrolPrice = sc.nextDouble();

	        System.out.print("Enter Vehicle Mileage (KM/L): ");
	        double mileage = sc.nextDouble();

	        // Calculation
	        double petrolNeeded = distance / mileage;
	        double totalCost = petrolNeeded * petrolPrice;

	        // Output
	        System.out.println("\n----- TRAVEL EXPENSE -----");
	        System.out.println("Petrol Needed: " + petrolNeeded + " liters");
	        System.out.println("Total Travel Cost: " + totalCost);

	        sc.close();
	    }
	}

