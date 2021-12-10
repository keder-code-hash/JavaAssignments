package in.ExceptionHandling.BankLoanException;

public class HomeLoan extends LoanAccount{
	public HomeLoan(String customerName, String addressString, String pANId, String addressProof) {
		super(customerName, addressString, pANId, addressProof); 
	}
}
