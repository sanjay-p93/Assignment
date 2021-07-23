package springCoreQ3;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	BankAccounts bankAccounts;

	@Override
	public double getBalance(long accountId) {
		BankAccount acc = bankAccounts.getAccList().stream().filter(x -> x.getAccountId() == accountId).findFirst()
				.get();
		if (acc != null)
			return acc.getAccountBalance();
		// no accounts found
		return 0;
	}


	@Override
	public double updateBalance(long accountId, double newBalance) {
		BankAccount acc = bankAccounts.getAccList().stream().filter(x -> x.getAccountId() == accountId).findFirst()
				.get();

		if (acc != null) {
			acc.setAccountBalance(newBalance);
		}
		// no accounts found
		return 0;

	}

	public void setBankAccounts(BankAccounts bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

}
