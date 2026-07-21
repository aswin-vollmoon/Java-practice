package rev;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the name:");
	        String name = sc.nextLine();

	        int mobile = 0;
	        while (true) {
	            try {
	                System.out.println("Enter the mobile number:");
	                mobile = sc.nextInt();

	                
	                if (String.valueOf(mobile).length() != 10) {
	                    System.out.println(" Please enter a 10-digit number.");
	                    //continue;
	                }
	                break; 
	            } catch (InputMismatchException e) {
	                System.out.println(" Invalid input. Please enter only numbers.");
	                sc.next(); 
	            }
	        }

	       sc.nextLine(); 
	        System.out.println("Enter the mail ID:");
	        String mail = sc.nextLine();

	        
	        System.out.println("Name: " + name);
	        System.out.println("Mobile No: " + mobile);
	        System.out.println("Mail ID: " + mail);
	}

}
