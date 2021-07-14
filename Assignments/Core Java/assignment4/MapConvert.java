package lambda;

import java.util.HashMap;
import java.util.Map;



public class MapConvert {
	public static void main(String[] args) {

		Map<Integer,Integer >  map1 = new HashMap<>();
        StringBuilder str = new StringBuilder();
		
		map1.put(1,123);	
		map1.put(2,234);	
		map1.put(3,345);	
		map1.put(4,456);	
		
		map1.forEach((k, v) -> str.append(k.toString()).append(v.toString()));
		System.out.println(str);
		
	}

}
