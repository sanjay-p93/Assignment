  
import java.io.*;
import java.util.Scanner;

public class resultDeclare {

	public static void main(String[] args){
		int m1=0,m2=0,m3=0;
		Scanner s = new Scanner(System.in);

		System.out.println("\nEnter the marks for all 3 subjects : ");
		m1= s.nextInt();
		m2= s.nextInt();
		m3= s.nextInt();
		if(m1>60 && m2>60 && m3>60){
			System.out.println("Passed");
		}
		else if ((m1>60 && m2>60)||(m1>60 && m3>60)||(m2>60 && m3>60)) {
			System.out.println("Promoted");
		}
		else{
			System.out.println("Failed");
		}
	}
}