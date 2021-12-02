package in.ExceptionHandling.BankingExcetion;

public class TestMain {

	public static void main(String[] args) {
//		1. Accept deposit from a customer and update the balance.
//		2. Display the balance.
//		3. Compute interest and add to balance.
//		4. Permit withdrawal and update the balance (Check for the minimum balance, impose
//		penalty if necessary).
		
		CurrentAccount cAccount=new CurrentAccount("Ram", "3212472", 200.0f, 100.0f, 50.0f);
		cAccount.deposit(10.0f);
		System.out.println("Balance : "+cAccount.getBalance());
		cAccount.withdrawl(520.0f);
		System.out.println("Balance: "+cAccount.getBalance());
//		cAccount.withdrawl(200.0f);
	}

}
