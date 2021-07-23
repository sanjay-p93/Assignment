package springCoreQ4;

public interface AnnotationBankAccountRepository {

	public double getBalance(long accountId);

	public double updateBalance(long accountId, double newBalance);

}
