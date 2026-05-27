package day2;
import java.util.Scanner;

public class boolen {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("are you a student (true/false)");
		boolean isStudent = sc.nextBoolean();
		
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Student status : " + isStudent);
		sc.close();
		
		 
		
	}

}
