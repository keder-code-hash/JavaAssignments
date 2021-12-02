package in.ExceptionHandling.BankLoanException;

public class DepositAccount extends Account{
	private double balance=0.0;
	private String accountType="Deposit Account";
	private double interestRate=0.0;
	
	public DepositAccount(String customerName, String addressString, String pANId, String addressProof,double interestRate) {
		super(customerName, addressString, pANId, addressProof); 
		this.interestRate=interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) { 
		this.balance+=amount;
	}

	@Override
	public double withdrawl(double amount) { 
		this.balance-=amount;
		return this.balance;
	}

	@Override
	public void addInterst(int years, int noOfInterestPeriod) { 
		double interest=this.balance*Math.pow((1+(this.interestRate/noOfInterestPeriod)),(noOfInterestPeriod*years)) ;
		this.balance+=(float)interest;
	}

	@Override
	public double getBalance() {
		return this.balance; 
	}

	@Override
	public String getBankType() {
		return this.accountType;
	}

}
