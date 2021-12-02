package in.ExceptionHandling.BankLoanException;

public class BankWithDrawlException	extends Exception {
	public BankWithDrawlException(double amount,double balance) {
		System.out.println("Balanace : "+balance+".Withdrawl Amount: "+amount);
		System.out.println("Operation can't be performed");
	}
	public BankWithDrawlException(double permissableAmount,double afterWithdrwal,double Balance) {
		System.out.println("Current Balance: "+Balance+".After withdrawl amount : "+afterWithdrwal+".Permissable Minimum Amount: "+permissableAmount);
	}
}
