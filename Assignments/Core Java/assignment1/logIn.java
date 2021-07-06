  
import java.io.*;
import java.util.Scanner;

public class logIn {

	public static void main(String[] args){
		String username,usernameS,password,passwordS;
		int n=0;
		Scanner s = new Scanner(System.in);

		System.out.print("\nEnter a username :");
		usernameS= s.nextLine();
		System.out.print("Enter a password :");
		passwordS= s.nextLine();
		System.out.println("Credentials saved.");
		while(n<3){
			System.out.println("\nLog in");
			System.out.print("Enter your username :");
			username= s.nextLine();
			System.out.print("Enter your password :");
			password= s.nextLine();
			if(password.equals(passwordS) && username.equals(usernameS)){
				System.out.println("\nWelcome "+username);
				break;
			}
			if(n<2){
				System.out.println("Incorrect credentials! Please try again.");
			}
			n++;
		}
		if(n>2){
			System.out.println("\nYou have entered wrong credentials 3 times.");
			System.out.println("Contact Admin\n");
		}
	}
}