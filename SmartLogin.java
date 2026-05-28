package day3assginment;
import java.util.Scanner;

public class SmartLogin {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String correctUser = "admin";
	        String correctPass = "Java@123";

	        System.out.print("Enter username: ");
	        String username = sc.nextLine();

	        int attempts = 0;
	        boolean loginSuccess = false;

	        while (attempts < 3) {
	            System.out.print("Enter password: ");
	            String password = sc.nextLine();

	            if (username.equals(correctUser) && password.equals(correctPass)) {
	                loginSuccess = true;
	                break;
	            } else {
	                attempts++;

	                if (username.equals(correctUser) &&
	                    password.startsWith("Java") &&
	                    password.endsWith("123")) {
	                    System.out.println("Almost correct password");
	                }

	                System.out.println("Wrong password");
	            }
	        }

	        if (!loginSuccess) {
	            System.out.println("Account Blocked");
	        } else {
	            System.out.print("Enter OTP: ");
	            int otp = sc.nextInt();

	            if (otp >= 1000 && otp <= 9999) {
	                System.out.println("Login Successful");
	            } else {
	                System.out.println("Invalid OTP");
	            }
	            sc.close();
	        }
	    }
	}
        
    


	
			

			
		
	


