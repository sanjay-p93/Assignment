package assignment3;

import java.util.*;

public class HashLinked {

	public static void main(String[] args) {
		
		 Set<Integer> hset = new HashSet <>();
		 Set<Integer> lset = new LinkedHashSet <>();
		 int[] a= {5,20,24,1,27,7,3,10};
		 
		 for(int e:a) {
			 hset.add(e);
			 lset.add(e);
		 }
		 
		 System.out.println("HashSet  " + hset);
		 System.out.println("LinkedHashSet " + lset);
	}

}
