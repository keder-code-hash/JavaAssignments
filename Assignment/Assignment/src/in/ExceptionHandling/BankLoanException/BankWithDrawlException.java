package in.ExceptionHandling.BankLoanException;

public class BankWithDrawlException	extends Exception { 
	public BankWithDrawlException(double permissableAmount,double afterWithdrwal,double Balance) {
		System.out.println("\nCurrent Balance: "+Balance+".After withdrawl amount : "+afterWithdrwal+".\nPermissable Minimum Amount: "+permissableAmount);
	}
}
