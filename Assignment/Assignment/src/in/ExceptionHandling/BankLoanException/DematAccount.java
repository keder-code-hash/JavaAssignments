package in.ExceptionHandling.BankLoanException;

public class DematAccount extends DepositAccount{

	public DematAccount(String customerName, String addressString, String pANId, String addressProof,double interestRate) {
		super(customerName, addressString, pANId, addressProof, interestRate); 
	}

}
