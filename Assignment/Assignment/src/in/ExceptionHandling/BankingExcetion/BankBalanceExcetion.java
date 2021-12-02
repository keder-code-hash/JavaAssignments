package in.ExceptionHandling.BankingExcetion;

public class BankBalanceExcetion extends Exception
{	
	public BankBalanceExcetion(float currBalance,float requestedMoney) 
	{
		System.out.println("Insufficient Balance.Curr balance: "+currBalance+" Requested for : "+requestedMoney);
	}
	public BankBalanceExcetion(CurrentAccount currentAccount) 
	{
		float bal=currentAccount.getBalance();
		System.out.println("Current balance: "+bal);
		float serviceCharge=currentAccount.getServiceCharge();
		currentAccount.setBalance(bal-serviceCharge);
		System.out.println("Service charge of "+ serviceCharge +" is added.Final Balance: "+currentAccount.getBalance());
	}
}
