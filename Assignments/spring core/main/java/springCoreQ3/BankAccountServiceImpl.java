package springCoreQ3;

public class BankAccountServiceImpl implements BankAccountService {

	BankAccount bankAccount;
	BankAccount bankAccount2;

	@Override
	public double wihtdraw(long accountId, double amount) {
		if (bankAccount.getAccountId() == accountId) {
			double newBalance = bankAccount.getAccountBalance() - amount;
			bankAccount.setAccountBalance(newBalance);
		}
		return 0;
	}

	@Override
	public double deposit(long accountId, double amount) {
		if (bankAccount.getAccountId() == accountId) {
			double newBalance = bankAccount.getAccountBalance() + amount;
			bankAccount.setAccountBalance(newBalance);
		}
		return 0;
	}

	@Override
	public double getBalance(long accountId) {
		if (bankAccount.getAccountId() == accountId)
			return bankAccount.getAccountBalance();
		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		if (bankAccount.getAccountId() == fromAccount && bankAccount2.getAccountId() == toAccount) {
			double newBalance = bankAccount.getAccountBalance() - amount;
			bankAccount.setAccountBalance(newBalance);
			double newBalance2 = bankAccount2.getAccountBalance() + amount;
			bankAccount2.setAccountBalance(newBalance);

			return true;
		}

		return false;
	}

}
