package assignment3;

import java.util.*;

public class People{

	public static void main(String[] args) {
		Person p1=new Person("Jack",180,83);
		Person p2=new Person("max",154,60);
		Person p3=new Person("WILL",195,100);
		Person p4=new Person("DUKE",160,55);
		Person p5=new Person("rj",175,60);
		
		TreeSet<Person> personSet= new TreeSet<>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		personSet.add(p5);
		
		System.out.println(personSet);
	}

	public float weight;

}
