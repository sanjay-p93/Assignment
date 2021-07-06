  
import java.io.*;
import java.util.Scanner;

public class taxCalc {

	public static void main(String[] args){
		float ctc=0f,tx=0f;
		Scanner s = new Scanner(System.in);

		System.out.println("\nEnter your ctc: ");
		ctc= s.nextFloat();
		if(ctc<=180000){
			System.out.println("You have been exempted from tax");
		}
		else if (ctc>180000 && ctc<=300000) {
			tx=ctc*10/100;
			System.out.println("Your tax amount is : "+tx);
		}
		else if (ctc>300000 && ctc<=500000) {
			tx=ctc*20/100;
			System.out.println("Your tax amount is : "+tx);
		}
		else{
			tx=ctc*30/100;
			System.out.println("Your tax amount is : "+tx);
		}
	}
}