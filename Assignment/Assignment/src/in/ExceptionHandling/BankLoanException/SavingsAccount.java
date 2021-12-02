package in.ExceptionHandling.BankLoanException;

public class SavingsAccount extends Account{
	private double balance=0.0;
	private String accountType="Savings Account";
	private double interestRate=0.0;
	private double minimumAount=100.0;
	
	public SavingsAccount(String customerName, String addressString, String pANId, String addressProof ) {
		super(customerName, addressString, pANId, addressProof); 
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
	public double withdrawl(double amount) throws BankWithDrawlException {
		if(amount > this.balance) {
			throw new BankWithDrawlException(amount,balance);
		}
		if(this.balance-amount < this.minimumAount) {
			throw new BankWithDrawlException(this.minimumAount, this.balance-amount,this.balance);
		}
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
