package springCoreQ3;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	BankAccount bankAccount;

	@Override
	public double getBalance(long accountId) {
		if (bankAccount.getAccountId() == accountId)
			return bankAccount.getAccountBalance();
		return 0;
	}


	@Override
	public double updateBalance(long accountId, double newBalance) {
		if (bankAccount.getAccountId() == accountId) {
			bankAccount.setAccountBalance(newBalance);
			return bankAccount.getAccountBalance();
		}
		return 0;

	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

}
