package springCoreQ4;

import java.util.HashSet;
import java.util.Set;

public class AnnotationBankAccounts {

	private Set<AnnotationBankAccount> accList = new HashSet<>();

	AnnotationBankAccounts() {
		this.accList.add(new AnnotationBankAccount(101, "john", "SAVINGS", 100000));
		this.accList.add(new AnnotationBankAccount(102, "sarah", "SAVINGS", 300000));
		this.accList.add(new AnnotationBankAccount(103, "rambo", "SALARY", 1000000));
		this.accList.add(new AnnotationBankAccount(104, "abe", "SAVINGS", 90000));
		this.accList.add(new AnnotationBankAccount(105, "taka", "SALARY", 800000));
	}

	public Set<AnnotationBankAccount> getAccList() {
		return accList;
	}

	public void setAccList(Set<AnnotationBankAccount> accList) {
		this.accList = accList;
	}


}
