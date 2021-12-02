package in.ExceptionHandling.BankLoanException;

public class HomeLoan extends LoanAccount{
	public HomeLoan(String customerName, String addressString, String pANId, String addressProof) {
		super(customerName, addressString, pANId, addressProof); 
	}
	public static SavingsAccount aString=(SavingsAccount)GetBankTypeFactory.getAccountType("SavingsAccount", "Ram", "ABC", "123112", "Aadhar");
	private static void asb() { 
		try {
			aString.deposit(12342.12); 
			aString.withdrawl(1234.0); 
			aString.withdrawl(12245.0);
		} catch (BankWithDrawlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		asb();
	}
}
