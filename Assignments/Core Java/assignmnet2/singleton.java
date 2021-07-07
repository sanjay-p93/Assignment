import java.io.*;
import java.util.Scanner;

class singletonA{
	static singletonA obj =new singletonA();
	int i;
	String s="hello";
	private singletonA(){

	}
	public static singletonA getInstance(){
		return obj;
	}
	public void hello(){
		return obj;
		System.out.println(s);
	}
}

class singletonB extends singletonA{
	int a=0;

	public void bMethord(){
		System.out.println("hello fromB");
	}
}

public class singleton {

	public static void main(String[] args){
		singletonA obj1 = singletonA.getInstance();
		singletonA obj2 = singletonA.getInstance();
		System.out.println("value of obj1 " + obj1.i);
		System.out.println("value of obj2 " + obj2.i);
		obj1.i=10000;

		System.out.println("value of obj1 " + obj1.i);
		System.out.println("value of obj2 " + obj2.i);

		singletonB obj3 = new singletonB();
		obj3.bMethord();
		obj3.hello();
	}
}