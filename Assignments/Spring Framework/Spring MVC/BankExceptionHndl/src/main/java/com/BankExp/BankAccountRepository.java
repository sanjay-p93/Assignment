package com.BankExp;

public interface BankAccountRepository {

	public double getBalance(long accountId) throws BankAccountNotFoundException;

	public double updateBalance(long accountId, double newBalance) throws BankAccountNotFoundException;

}
