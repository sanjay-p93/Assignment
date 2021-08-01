package com.BankExp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	BankAccountRepository bankAccountRepository;

	@Override
	public double withdrawAmount(long accountId, double amount) throws BankAccountNotFoundException, LowBalanceException {
		double bal = bankAccountRepository.getBalance(accountId);

		bal -= amount;
		if (bal < 0)
			throw new LowBalanceException("Account balance insufficient for transaction");
		if (bal > amount) {
			bal -= amount;
			bankAccountRepository.updateBalance(accountId, bal);
			return bal;
		}
		return 0;
	}

	public void setBankAccountRepository(BankAccountRepositoryImpl bankAccountRepository) {
		this.bankAccountRepository = bankAccountRepository;
	}

}
