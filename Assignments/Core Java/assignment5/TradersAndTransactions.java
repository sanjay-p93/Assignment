package stream;

import java.util.*;

public class TradersAndTransactions {

	public static void main(String[] args) {
		Trader t1 = new Trader("JOHN","PUNE");
		Trader t2 = new Trader("JAMES","DELHI");
		Trader t3 = new Trader("JANE","INDORE");
		Trader t4 = new Trader("ROMAN","PUNE");
		Trader t5 = new Trader("ANGELA","COHIN");
		Trader t6 = new Trader("MARK","DELHI");
		
		List<Trader> traders =new ArrayList<>(Arrays.asList(t1,t2,t3,t4,t5,t6));

		List<Transaction> transactions =new ArrayList<>();
		transactions.add(new Transaction(t1,2020,30000));
		transactions.add(new Transaction(t2,2011,4000));
		transactions.add(new Transaction(t1,2013,300));
		transactions.add(new Transaction(t3,2018,1000));
		transactions.add(new Transaction(t4,2019,30000));
		transactions.add(new Transaction(t5,2011,49000));
		transactions.add(new Transaction(t1,2011,34500));
		transactions.add(new Transaction(t6,2016,5670));
		transactions.add(new Transaction(t3,2011,67870));
		transactions.add(new Transaction(t5,2013,650));
		
		//Q8
		transactions.stream()
					.filter(trn-> trn.getYear()==2011)
					.sorted((trn1, trn2) -> trn1.getValue() - trn2.getValue())
					.forEach(System.out::println);
		System.out.println("\n\n");
		
		
		//Q9
        traders.stream()
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
		System.out.println("\n\n");
		
		
		
		//Q10
        traders.stream()
        		.filter(t-> t.getCity().equals("PUNE"))
				.sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
        System.out.println("\n\n");
        
        
		//Q11
        traders.stream()
				.sorted(Comparator.comparing(Trader::getName))
        		.map(Trader::getName)
                .forEach(System.out::println);
        System.out.println("\n\n");
        
        
        //Q12
        if( traders.stream()
        		.anyMatch(t-> t.getCity().equals("INDORE")) 
        		)
        	System.out.println("YES");
        else
    		System.out.println("NO");
		System.out.println("\n\n");
		
		
		//Q13
		transactions.stream()
        		.filter(trn-> trn.getTrader().getCity().equals("DELHI"))
                .forEach(System.out::println);
		System.out.println("\n\n");
		
		
		//Q14
		System.out.println("Max Transaction : "+transactions.stream()
        		.max(Comparator.comparing(Transaction::getValue)).get());
		
		
		//Q14
		System.out.println("Min Transaction : "+transactions.stream()
        		.min(Comparator.comparing(Transaction::getValue)).get());
		
	}

}
