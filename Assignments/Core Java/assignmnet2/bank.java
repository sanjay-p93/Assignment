import java.io.*;
import java.util.Scanner;

abstract class Account{
	private int accNum;
	private String name;
	public Account(int accNum,String name){
		this.accNum=accNum;
		this.name=name;
	}
	public void getDetails(){
		System.out.println("\nAcconunt Number 	: "+accNum);
		System.out.println("\nAcconunt Holder 	: "+name);
	}
	public abstract void checkBalance();
	public abstract void addMoney(int i);
}

class Savings extends Account{
	private int fixeDeposits=0;

	public Savings(int accNum,String name){
		super(accNum,name);
	}

	public void checkBalance(){
		super.getDetails();
		System.out.println("\nType of Account 	: Savings");
		System.out.println("\nBlance 			: "+fixeDeposits);
	}

	public void addMoney(int add){
		fixeDeposits=fixeDeposits+add;
	}

}

class Current extends Account{
	private int cashCredit=0;

	public Current(int accNum,String name){
		super(accNum,name);
	}

	public void checkBalance(){
		super.getDetails();
		System.out.println("\nType of Account 	: Current");
		System.out.println("\nBlance          	: "+cashCredit);
	}

	public void addMoney(int add){
		cashCredit=cashCredit+add;
	}

}

public class bank {

	public static void main(String[] args){
		Savings acc1= new Savings(102,"RAJ");
		Current acc2= new Current(201,"Sumech");
		acc1.addMoney(10000);
		acc1.checkBalance();
		acc2.addMoney(500);
		acc2.checkBalance();
		acc2.addMoney(9000);
		acc2.checkBalance();

	}
}