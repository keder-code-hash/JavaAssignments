package in.ExceptionHandling.BankLoanException;

public abstract class Account {
	private static int genId=0;
	private int id;
	public String customerName;
	public String addressString;
	public String PANId;
	public String addressProof;
	public Account(String customerName, String addressString, String pANId, String addressProof) { 
		this.customerName = customerName;
		this.addressString = addressString;
		PANId = pANId;
		this.addressProof = addressProof;
		this.id=genId++;
	}
	
	public int getId() {
		return id;
	} 

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddressString() {
		return addressString;
	}

	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	public String getPANId() {
		return PANId;
	}

	public void setPANId(String pANId) {
		PANId = pANId;
	}

	public String getAddressProof() {
		return addressProof;
	}

	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}

	public abstract void addInterst(int years,int noOfInterestPeriod);
	public abstract double getBalance();
	public abstract String getBankType();
	public abstract void deposit(double amount);
	public abstract double withdrawl(double amount)throws BankWithDrawlException, NegativeBalanceException;
}
