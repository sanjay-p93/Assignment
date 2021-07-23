package springCoreQ4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationBankAccountContoller {

	@Autowired
	AnnotationBankAccountServiceImpl annotationBankAccountServiceImpl;

	public double wihtdraw(long accountId, double amount) {
		return annotationBankAccountServiceImpl.wihtdraw(accountId, amount);
	}

	public double deposit(long accountId, double amount) {
		return annotationBankAccountServiceImpl.deposit(accountId, amount);
	}

	public double getBalance(long accountId) {
		return annotationBankAccountServiceImpl.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return annotationBankAccountServiceImpl.fundTransfer(fromAccount, toAccount, amount);
	}

	public void setAnnotationBankAccountServiceImpl(AnnotationBankAccountServiceImpl annotationBankAccountServiceImpl) {
		this.annotationBankAccountServiceImpl = annotationBankAccountServiceImpl;
	}

}
