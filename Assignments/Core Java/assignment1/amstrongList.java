  
import java.io.*;
import java.util.Scanner;

public class amstrongList {

	public static void main(String[] args){
		int p=0,r=0,t=0,si=0,ci=0;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the principal amount : ");
		p = s.nextInt();
		System.out.print("\nEnter the rate of interest in % : ");
		r = s.nextInt();
		System.out.print("\nEnter the number of years : ");
		t = s.nextInt();
		si = p*r*t/100;
		ci = (p*(Math.pow((100+r)/100,t)))-p;
		System.out.println("Simple Interest = "+si);
		System.out.println("Compound Interest = "+ci);
	}
}