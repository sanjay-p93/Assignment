package com.BankExp;

import org.springframework.stereotype.Component;

@Component
public class TransactionObj {

	private long accountId;
	private double amount;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TransactionObj() {
		super();
	}
}
