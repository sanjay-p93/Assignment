package lambda;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int x=10;
		int y=2;
		
		ArithemeticInterface add = (a,b)-> a+b;
		System.out.println(add.operation(x,y));

		ArithemeticInterface sub = (a,b)-> a-b;
		System.out.println(sub.operation(x,y));

		ArithemeticInterface div = (a,b)-> a/b;
		System.out.println(div.operation(x,y));

		ArithemeticInterface mul = (a,b)-> a*b;
		System.out.println(mul.operation(x,y));
	}
		

}
