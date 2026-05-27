package day2assginment;
import java.util.Scanner;


public class StudentResultAnalyzer {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Marks in Subject 1: ");
	        int sub1 = sc.nextInt();

	        System.out.print("Enter Marks in Subject 2: ");
	        int sub2 = sc.nextInt();

	        System.out.print("Enter Marks in Subject 3: ");
	        int sub3 = sc.nextInt();

	        // Calculation
	        int total = sub1 + sub2 + sub3;
	        double average = total / 3.0;

	        // Output
	        System.out.println("\n----- RESULT -----");
	        System.out.println("Student Name: " + name);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average Marks: " + average);

	        // Comparison Operator
	        if (average > 50) {
	            System.out.println("Average is greater than 50");
	        } else {
	            System.out.println("Average is not greater than 50");
	        }

	        sc.close();
	    }
	}


