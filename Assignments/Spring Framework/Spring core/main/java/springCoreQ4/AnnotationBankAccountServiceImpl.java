package springCoreQ4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnotationBankAccountServiceImpl implements AnnotationBankAccountService {
	@Autowired
	AnnotationBankAccountRepositoryImpl annotationBankAccountRepositoryImpl;

	@Override
	public double wihtdraw(long accountId, double amount) {
		double bal = annotationBankAccountRepositoryImpl.getBalance(accountId);
		if (bal > amount) {
			bal -= amount;
			annotationBankAccountRepositoryImpl.updateBalance(accountId, bal);
			return bal;
		}
		return 0;
	}

	@Override
	public double deposit(long accountId, double amount) {
		double bal = annotationBankAccountRepositoryImpl.getBalance(accountId);
		if (bal > 0) {
			bal += amount;
			annotationBankAccountRepositoryImpl.updateBalance(accountId, bal);
			return bal;
		}
		return 0;
	}

	@Override
	public double getBalance(long accountId) {
		return annotationBankAccountRepositoryImpl.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		double fromAccountNewBal = annotationBankAccountRepositoryImpl.getBalance(fromAccount) - amount;
		double toAccountNewBal = annotationBankAccountRepositoryImpl.getBalance(toAccount) + amount;
		if (fromAccountNewBal > 0 && toAccountNewBal > 0) {
			annotationBankAccountRepositoryImpl.updateBalance(fromAccount, fromAccountNewBal);
			annotationBankAccountRepositoryImpl.updateBalance(toAccount, toAccountNewBal);
			return true;
		}

		return false;
	}

	public void setAnnotationBankAccountRepositoryImpl(
			AnnotationBankAccountRepositoryImpl annotationBankAccountRepositoryImpl) {
		this.annotationBankAccountRepositoryImpl = annotationBankAccountRepositoryImpl;
	}

}
