package in.ExceptionHandling.BankLoanException;

public class LoanAccount extends Account{
	
	private String accountType;
	private double balance;
	private double interestRate;
	private double loanAmount;
	
	public LoanAccount(String customerName, String addressString, String pANId, String addressProof) {
		super(customerName, addressString, pANId, addressProof); 
	}

	@Override
	public void deposit(double amount) {
		this.loanAmount-=amount;
	}

	@Override
	public double withdrawl(double amount) {
		return 0.0f;
	}
	
	public void getLoan(double amount) {
		this.loanAmount=amount;
	}
	public double calculateEmi(int time) {
		return this.loanAmount/time;
	}
	
	public void addInterst(int years, int noOfInterestPeriod) { 
		double interest=this.balance*Math.pow((1+(this.interestRate/noOfInterestPeriod)),(noOfInterestPeriod*years));
		this.loanAmount+=(float)interest;
	}
 
	public double getBalance() {
		return this.balance-this.loanAmount;
	}
 
	public String getBankType() {
		return this.accountType;
	}
	

}
