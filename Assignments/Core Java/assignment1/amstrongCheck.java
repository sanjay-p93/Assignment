  
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class amstrongCheck {

	public static void main(String[] args){
		int num=0,sum=0,i=0;
		System.out.println("Enter the number :");
		Scanner s = new Scanner(System.in);
		num= s.nextInt();
		i=num;
		while(i>0){
			sum=sum+(int) Math.pow(i%10,3);
			i=i/10;
		}
		if(sum==num){
			System.out.println(num+" is an amstrong number");
		}
		else{
			System.out.println(num+" is not an amstrong number");
		}
	}
}