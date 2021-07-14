package lambda;

import java.util.function.*;

public class JavaFunctionalInterfaces {

	public static void main(String[] args) {
		
		String name="john";
		String nam2="jaffer";
		
		Consumer c = (n)-> System.out.println(n);
		c.accept(name);
		
		Supplier<String> s=()-> "code123";
		System.out.println(s.get());
		

        Predicate<Integer> p= i->i<100;
        System.out.println(p.test(211));
        

        Function<String,Integer> f = a->a.length();
        System.out.println(f.apply(name));
	}

}
