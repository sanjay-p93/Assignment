package com.BankExp;

public interface BankAccountService {

	public double withdrawAmount(long accountId, double amount) throws BankAccountNotFoundException, LowBalanceException;

}
