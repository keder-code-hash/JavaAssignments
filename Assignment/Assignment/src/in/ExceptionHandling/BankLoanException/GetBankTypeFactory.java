package in.ExceptionHandling.BankLoanException;

public class GetBankTypeFactory {
	
	static Account getAccountType(String accountType,String customerName, String addressString, String pANId, String addressProof) {
		switch (accountType) {
		case "SavingsAccount":
			return new SavingsAccount(customerName, addressString, pANId, addressProof);
		case "DematAccount":
			return new DematAccount(customerName, addressString, pANId, addressProof, 0);
		case "LoanAccount":
			return new LoanAccount(customerName, addressString, pANId, addressProof);
		default:
			break;
		}
		return null;
	}

}
