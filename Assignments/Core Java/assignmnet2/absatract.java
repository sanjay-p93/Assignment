import java.io.*;
import java.util.Scanner;
abstract class Animal{
	private String name;
	public Animal(String name){
		this.name=name;
	}
	public abstract void move();
}

class Dog extends Animal{

	public Dog(String name){
		super(name);
	}

	public void move(){
		System.out.println("\nDog runs");
	}


}

class Monkey extends Animal{
	private int cashCredit=0;

	public Monkey(String name){
		super(name);
	}

	public void move(){
		System.out.println("\nMonkey climbs");
	}


}

public class absatract {

	public static void main(String[] args){
		Monkey m= new Monkey("Ceacer");
		Dog d= new Dog("Rambo");
		m.move();
		d.move();
	}
}