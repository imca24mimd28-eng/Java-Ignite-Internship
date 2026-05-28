package day3assginment;
import java.util.Scanner;

public class EmployeeBonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter years of exprience");
		int years = sc.nextInt();
		
		System.out.println("Enter attendance percentage");
		double attendance = sc.nextDouble();
		
		System.out.println("Enter performance rating");
		int rating = sc.nextInt();
		
		int bonus = 0;
		
		if(attendance<60) {
			System.out.println("Not Eligible");
			System.out.println("Bonus Rejected");
		}
		else if(years >3 && attendance > 85) {
			if(rating == 5)
				bonus = 50000;
			else if(rating == 4)
				bonus = 30000;
			else if(rating == 3)
				bonus = 10000;
			
			if(bonus>0) {
				System.out.println("No Eligible");
				System.out.println("Bonus Amount = Rs."+bonus);
				
			}
			else
			{
				System.out.println("Not Eligible");
			}
			}
		else {
			System.out.println("Not Eligible");
			}
		sc.close();
	}

}
