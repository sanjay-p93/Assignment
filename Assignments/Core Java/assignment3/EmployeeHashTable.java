package assignment3;

import java.util.*;

public class EmployeeHashTable {

	public static void main(String[] args) {

		Employee e1=new Employee("Jack",160);
		Employee e2=new Employee("zed",175);
		Employee e3=new Employee("john",175);
		Hashtable<Employee,String >  EmpHash = new Hashtable<>();
		EmpHash.put(e1,"first");	
		EmpHash.put(e2,"second");	
		EmpHash.put(e3,"third");	
		System.out.println(EmpHash.get(e1));
		System.out.println(EmpHash.get(e2));
		System.out.println(EmpHash.get(e3));
		System.out.println(EmpHash);
	}

}
