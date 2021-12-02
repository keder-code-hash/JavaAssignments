package in.ExceptionHandling.BankingExcetion;

public class CurrentAccount extends AccountDet implements Account{
	private float balance=0.0f;
	private float minimumBalance=0.0f;
	private float serviceCharge=0.0f;
	
	public CurrentAccount(String customerName, String accountNumber,float balance,float minimumBalance,float serviceCharge) {
		super(customerName, accountNumber, "Current Account");
		this.balance=balance;
		this.minimumBalance=minimumBalance;
		this.serviceCharge=serviceCharge;
	}
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float amount) {
		this.balance=amount;
	}
	public float getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(float minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public float getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(float serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public void deposit(float amount) { 
		this.balance+=amount;
		System.out.println(amount+"is added.Available balance is: "+this.balance);
	}
 
	public void withdrawl(float amount){
		try {
			checkBalance(amount);
			this.balance-=amount;
		}
		catch(BankBalanceExcetion be){
			be.printStackTrace();
		}
	}
	
	public void checkBalance(float withdrawl) throws BankBalanceExcetion{
		if(this.balance<=this.minimumBalance) {
			throw new BankBalanceExcetion(this);
		}
		if(this.balance < withdrawl) {
			throw new BankBalanceExcetion(this.balance,withdrawl);
		}
	}
}
