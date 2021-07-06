  
import java.io.*;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args){
		int[] a = new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.print("\nUnsorted array : ");
		for(int i=0;i<15;i++){
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<14;i++){
			for(int j=0;j<14-i;j++){
				if(a[j]>a[j+1]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("\nSorted array   : ");
		for(int i=0;i<15;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}