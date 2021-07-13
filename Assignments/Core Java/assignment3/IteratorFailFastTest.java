package assignment3;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorFailFastTest {

	public static void main(String[] args) {

		List<Integer> list= new ArrayList<>();
		List<Integer> list2= new CopyOnWriteArrayList<>();
		int[] a= {1,2,3,4,5,6};
		 
		for(int e:a) {
			list.add(e);
			list2.add(e);
		}
 
		Iterator<Integer> it = list.iterator();
		Iterator<Integer> it2 = list2.iterator();
		 

		while(it.hasNext()){
			int n = it.next();
			System.out.println(n);
			if(n==3) 
				it.remove();
				//list.remove(n);  //ConcurrentModificationException
		}
		System.out.println(list);
		 

		while(it2.hasNext()){
			int n = it2.next();
			System.out.println(n);
			if(n==3) 
				list2.remove(n);
		}
		System.out.println(list2);
		

		Map<String,String> map= new HashMap<>();
		Map<String,String> map2= new ConcurrentHashMap<>();
		
		map.put("color1","red");
		map2.put("color1","red");
		map.put("color2","yelllow");
		map2.put("color2","yelllow");
		map.put("color3","blue");
		map2.put("color3","blue");
		
		Set<String> keyset = map.keySet();
		Set<String> keyset2 = map2.keySet();
		
		Iterator<String> iterator = keyset.iterator();
		Iterator<String> iterator2 = keyset2.iterator();
		


		while(iterator.hasNext()){
			//map.put("color4","green");    //ConcurrentModificationException
			String color = iterator.next();
			System.out.println(color+"\t"+map.get(color));
		}

		while(iterator2.hasNext()){
			map.put("color4","green");
			String color2 = iterator2.next();
			System.out.println(color2+"\t"+map.get(color2));
		}
		
		
	}

}
