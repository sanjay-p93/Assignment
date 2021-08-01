package com.BankExp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository {

	@Autowired
	BankAccounts bankAccounts;

	@Override
	public double getBalance(long accountId) throws BankAccountNotFoundException {

		System.out.println("here");
		BankAccount acc = bankAccounts.getAccList().stream().filter(x -> x.getAccountId() == accountId).findFirst()
				.get();
		System.out.println("acc");
		System.out.println(acc);
		if (acc == null) {
			throw new BankAccountNotFoundException("Invalid Account.");
		}
		return acc.getAccountBalance();
	}


	@Override
	public double updateBalance(long accountId, double newBalance) throws BankAccountNotFoundException {
		BankAccount acc = bankAccounts.getAccList().stream().filter(x -> x.getAccountId() == accountId).findFirst()
				.get();

		if (acc == null) {
			throw new BankAccountNotFoundException("Invalid Account.");
		}
		acc.setAccountBalance(newBalance);
		return newBalance;

	}

	public void setBankAccounts(BankAccounts bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

}
