package springCoreQ3;

public class BankAccountContoller {

	BankAccountServiceImpl bankAccountService;

	public double wihtdraw(long accountId, double amount) {
		return bankAccountService.wihtdraw(accountId, amount);
	}

	public double deposit(long accountId, double amount) {
		return bankAccountService.deposit(accountId, amount);
	}

	public double getBalance(long accountId) {
		return bankAccountService.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return bankAccountService.fundTransfer(fromAccount, toAccount, amount);
	}

	public void setBankAccountService(BankAccountServiceImpl bankAccountService) {
		this.bankAccountService = bankAccountService;
	}

	public BankAccountContoller(BankAccountServiceImpl bankAccountService) {
		super();
		this.bankAccountService = bankAccountService;
	}
}
