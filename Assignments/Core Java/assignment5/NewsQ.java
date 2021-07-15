package stream;

import java.util.*;
import java.util.stream.*;

public class NewsQ {

	public static void main(String[] args) {
		
		List<News> newsList = new ArrayList<>() {{
				add(new News( 1,"John","jAMES",  "AWESOME "));
				add(new News( 1,"John","JANE",  "COOL budget"));
				add(new News( 2,"jAMES","JANE",  "hey"));
				add(new News( 1,"John","Rambo",  "thats amazing budget"));
				add(new News( 2,"jAMES","John",  "hello there generel"));
				add(new News( 3,"Rambo","jAMES",  "thats tough"));
				add(new News( 3,"Rambo","Rocky",  "omg"));
				add(new News( 1,"John","Rocky",  "good budget"));
				add(new News( 4,"JANE","jAMES",  "wow"));
				add(new News( 2,"jAMES","John",  "kenobi"));
		}};
		
		//Q4
		Map<Integer, Long> idCountMap = newsList.stream()
				  .collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()));
		
		System.out.println("Maximum commented ID : "+idCountMap.entrySet().stream()
							 .max((nId1,nId2)->(int)(nId1.getValue()-nId2.getValue())).get().getKey());
		
		//Q5
        long budgetCount = newsList.stream()
                .filter(x -> x.getComment().contains("budget"))
                .count();
        
        System.out.println("Count of \"budget\" :"+budgetCount);
        

		
		//Q6-7
		Map<String, Long> userCommentCount = newsList.stream()
				  .collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
		
		System.out.println("Maximum commented user : "+userCommentCount.entrySet().stream()
							 .max((u1,u2)->(int)(u1.getValue()-u2.getValue())).get().getKey());
		
		userCommentCount.entrySet().stream()
								   .sorted((u1,u2)->u1.getKey().compareToIgnoreCase(u2.getKey()))
								   .forEach(System.out::println);
	}

}
