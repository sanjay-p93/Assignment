package bankAccounts;

import java.util.TreeSet;
import java.util.Set;


public class BankAccountList {
	Set<SavingsAccount> accountList = new TreeSet<>();
	

	public void addUser(SavingsAccount acc) {
		this.accountList.add(acc);
	}


	@Override
	public String toString() {
		return "\nBankAccountList " + accountList;
	}
}
