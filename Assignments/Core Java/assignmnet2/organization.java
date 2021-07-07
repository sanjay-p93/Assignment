import java.io.*;
import java.util.Scanner;

class Employee{
	int id,basicPay;
	String name;
	public Employee(int id,String name,int basicPay){
		this.id=id;
		this.name=name;
		this.basicPay=basicPay;
	}
	public void totalSalary(){
		System.out.println("\nTotal salary for Employee Id "+id+"  = BasicPay :"+basicPay);
	}
}

class Manager extends Employee{
	private int incentives,total;

	public Manager(int id,String name,int basicPay,int incentives){
		super(id,name,basicPay);
		this.incentives=incentives;
	}

	public void totalSalary(){
		total=basicPay+incentives;
		System.out.println("\nTotal salary manager "+name+" = Basic Pay + Incentives : "+total);
	}

}

class Labour extends Employee{
	private int overtime,total;

	public Labour(int id,String name,int basicPay,int overtime){
		super(id,name,basicPay);
		this.overtime=overtime;
	}

	public void totalSalary(){
		total=overtime+basicPay;
		System.out.println("\nTotal salary for labour "+name+" = Basic Pay + Overtime   : "+total);
	}
}

public class organization {

	public static void main(String[] args){
		Manager Manager1= new Manager(1,"RAJ",100000,5000);
		Labour Labour1= new Labour(2,"Sumech",30000,2000);
		Manager Manager2= new Manager(1,"rahul",70000,3000);
		Labour Labour2= new Labour(1,"yadhu",30000,1500);
		Employee Employee1= new Employee(1,"hari",50000);
		Manager1.totalSalary();
		Labour1.totalSalary();
		Manager2.totalSalary();
		Labour2.totalSalary();
		Employee1.totalSalary();

	}
}