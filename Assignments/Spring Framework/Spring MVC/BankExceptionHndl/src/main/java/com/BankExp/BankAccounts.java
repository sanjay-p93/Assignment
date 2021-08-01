package com.BankExp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class BankAccounts {

	private Set<BankAccount> accList = new HashSet<>();

	private BankAccounts() {
		this.accList.add(new BankAccount(101, "john", "SAVINGS", 100000));
		this.accList.add(new BankAccount(102, "sarah", "SAVINGS", 300000));
		this.accList.add(new BankAccount(103, "rambo", "SALARY", 1000000));
		this.accList.add(new BankAccount(104, "abe", "SAVINGS", 0));
		this.accList.add(new BankAccount(105, "taka", "SALARY", 800000));
	}

	public Set<BankAccount> getAccList() {
		return accList;
	}

	public void setAccList(Set<BankAccount> accList) {
		this.accList = accList;
	}


}
