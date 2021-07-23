package springCoreQ3;

public class BankAccountServiceImpl implements BankAccountService {

	BankAccountRepositoryImpl bankAccountRepository;

	@Override
	public double wihtdraw(long accountId, double amount) {
		double bal = bankAccountRepository.getBalance(accountId);
		if (bal > amount) {
			bal -= amount;
			bankAccountRepository.updateBalance(accountId, bal);
			return bal;
		}
		return 0;
	}

	@Override
	public double deposit(long accountId, double amount) {
		double bal = bankAccountRepository.getBalance(accountId);
		if (bal > 0) {
			bal += amount;
			bankAccountRepository.updateBalance(accountId, bal);
			return bal;
		}
		return 0;
	}

	@Override
	public double getBalance(long accountId) {
		return bankAccountRepository.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		double fromAccountNewBal = bankAccountRepository.getBalance(fromAccount) - amount;
		double toAccountNewBal = bankAccountRepository.getBalance(toAccount) + amount;
		if (fromAccountNewBal > 0 && toAccountNewBal > 0) {
			bankAccountRepository.updateBalance(fromAccount, fromAccountNewBal);
			bankAccountRepository.updateBalance(toAccount, toAccountNewBal);
			return true;
		}

		return false;
	}

	public void setBankAccountRepository(BankAccountRepositoryImpl bankAccountRepository) {
		this.bankAccountRepository = bankAccountRepository;
	}

}
