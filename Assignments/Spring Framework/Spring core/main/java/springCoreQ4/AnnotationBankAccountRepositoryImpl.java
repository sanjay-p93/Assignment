package springCoreQ4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnnotationBankAccountRepositoryImpl implements AnnotationBankAccountRepository {
	@Autowired
	AnnotationBankAccounts bankAccounts;

	@Override
	public double getBalance(long accountId) {
		AnnotationBankAccount acc = bankAccounts.getAccList().stream().filter(x -> x.getAccountId() == accountId).findFirst()
				.get();
		if (acc != null)
			return acc.getAccountBalance();
		// no accounts found
		return 0;
	}


	@Override
	public double updateBalance(long accountId, double newBalance) {
		AnnotationBankAccount acc = bankAccounts.getAccList().stream().filter(x -> x.getAccountId() == accountId).findFirst()
				.get();

		if (acc != null) {
			acc.setAccountBalance(newBalance);
		}
		// no accounts found
		return 0;

	}

	public void setBankAccounts(AnnotationBankAccounts bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
}
