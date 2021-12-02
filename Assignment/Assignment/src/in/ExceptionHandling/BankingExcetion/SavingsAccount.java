package in.ExceptionHandling.BankingExcetion;

import in.ExceptionHandling.BankLoanException.BankWithDrawlException;

public class SavingsAccount extends AccountDet implements Account{
	private float interestRate=0.0f;
	private float balance=0.0f;
	
	
	public SavingsAccount(String customerName, String accountNumber, float balance) {
		super(customerName, accountNumber, "Savings Account");
		this.balance=balance;
	}
	
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public float getBalance() {
		return balance;
	}
	
	public void deposit(float amount) {
		this.balance+=amount;
		System.out.println(amount+"is added.Available balance is: "+this.balance);
	}
	
	public void withdrawl(float amount){ 
		this.balance-=amount;
		System.out.println(amount+"is deducted.Available balance is: "+this.balance);
	}  
	
	public void addInterest(int noOfPeroidsPerYear,int time) {
		double interest=this.balance*Math.pow((1+(this.interestRate/noOfPeroidsPerYear)),(noOfPeroidsPerYear*time)) ;
		this.balance+=(float)interest;
	}
}
