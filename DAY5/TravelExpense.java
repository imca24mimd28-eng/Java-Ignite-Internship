package day5assginment;
import java.util.Scanner;

public class TravelExpense {
	

	    public static double calculateCost(double distance, double mileage, double petrolPrice) {

	        double petrolNeeded = distance / mileage;
	        double travelCost = petrolNeeded * petrolPrice;

	        return travelCost;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Distance (km): ");
	        double distance = sc.nextDouble();

	        System.out.print("Enter Mileage (km/litre): ");
	        double mileage = sc.nextDouble();

	        System.out.print("Enter Petrol Price per litre: ");
	        double petrolPrice = sc.nextDouble();

	        double cost = calculateCost(distance, mileage, petrolPrice);

	        System.out.println("Estimated Travel Cost = " + cost);

	        sc.close();
	    }
	}


