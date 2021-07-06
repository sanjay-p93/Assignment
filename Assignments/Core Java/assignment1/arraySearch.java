  
import java.io.*;
import java.util.Scanner;

public class arraySearch {

	public static void main(String[] args){
		int[] a = new int[15];
		int num=0;
		boolean flag= false;
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter a array elements:");
		for(int i=0;i<15;i++){
			a[i]= s.nextInt();
		}
		System.out.print("Enter a number to be searched :");
		num= s.nextInt();
		for(int i=0;i<15;i++){
			if(num == a[i]){
				System.out.println(num+" is in position : "+i+1);
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println(num+" not found in the array");
		}
	}
}