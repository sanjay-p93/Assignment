package bankAccounts;

import java.util.Objects;

public class SavingsAccount implements Comparable<SavingsAccount>{
	private int acc_ID;
	private String accountHolderName;
	private float acc_Balance;
	private boolean isSalaryAccount;
	
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public float getAcc_Balance() {
		return acc_Balance;
	}
	public void setAcc_Balance(float acc_Balance) {
		this.acc_Balance = acc_Balance;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public void withdraw(float amt) {
		this.acc_Balance -= amt;
	}
	
	public void deposit(float amt) {
		this.acc_Balance += amt;
	}
	@Override
	public String toString() {
		return "\n[acc_ID=" + acc_ID + ", accountHolderName=" + accountHolderName + ", acc_Balance="
				+ acc_Balance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	@Override
	public int compareTo(SavingsAccount o) {
		if(this.acc_ID > o.acc_ID)
			return 1;
		else if(this.acc_ID < o.acc_ID)
			return -1;
		else
			return 0;
	}

	public SavingsAccount(int acc_ID, String accountHolderName, float acc_Balance, boolean isSalaryAccount) {
		super();
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.acc_Balance = acc_Balance;
		this.isSalaryAccount = isSalaryAccount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(acc_ID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		return acc_ID == other.acc_ID;
	}

}
