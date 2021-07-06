  
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class intrestCal {

	public static void main(String[] args){
		float p=0f,r=0f,t=0f,si=0f,ci=0f,i=0f;
		Scanner s = new Scanner(System.in);

		System.out.print("\nEnter the principal amount : ");
		p = s.nextFloat();
		System.out.print("Enter the rate of interest in % : ");
		r = s.nextFloat();
		System.out.print("Enter the number of years : ");
		t = s.nextFloat();
		si = p*r*t/100;
		i=1+(r/100);
		ci = p*((float) Math.pow(i,t))-p;
		System.out.println("Simple Interest = "+si);
		System.out.println("Compound Interest = "+ci+"\n");
	}
}