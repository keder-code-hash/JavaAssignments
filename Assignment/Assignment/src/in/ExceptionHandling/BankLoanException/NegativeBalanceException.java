package in.ExceptionHandling.BankLoanException;

public class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String mssg) {
		super(mssg);
	}
}
