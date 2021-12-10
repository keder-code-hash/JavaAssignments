package in.ExceptionHandling.BankLoanException;

public class TestMain { 
	public static void main(String[] args) {
		SavingsAccount aString=(SavingsAccount)GetBankTypeFactory.getAccountType("SavingsAccount", "Ram", "ABC", "123112", "Aadhar");
		try {
			aString.deposit(12342.12); 
			aString.withdrawl(1234.0);    
			aString.withdrawl(12245.0);
		} catch (BankWithDrawlException | NegativeBalanceException e) { 
			e.printStackTrace();
		}
	}
}


// throw : need to be handled in proper way.Compile time handle.
// throws: Runtime handle.