package bankAccounts;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		BankAccountList accList= new BankAccountList();
		
		accList.addUser(new SavingsAccount(1215,"jack",1000000f, false));
		accList.addUser(new SavingsAccount(12113,"ram",330000f, true));
		accList.addUser(new SavingsAccount(1212,"joice",234000.50f, true));
		accList.addUser(new SavingsAccount(1214,"hannah",6000000f, false));
		accList.addUser(new SavingsAccount(1212,"veeer",123123123112f, false));


		System.out.println(accList);

	}

}
