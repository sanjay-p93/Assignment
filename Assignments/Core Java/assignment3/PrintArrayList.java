package assignment3;

import java.util.*;

public class PrintArrayList {

	public static void main(String[] args) {

		 List<Integer> list= new ArrayList<>();
		 int[] a= {1,2,3,4,5,6};
		 
		 for(int e:a) {
			 list.add(e);
		 }
		 ListIterator<Integer> it = list.listIterator(list.size());
		 

		while(it.hasPrevious()){
			System.out.print(it.previous()+" ");
		}

	}

}
