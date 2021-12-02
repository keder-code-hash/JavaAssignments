package in.ExceptionHandling.RandomArith_4_2;

public class CustomArithmeticException extends ArithmeticException{
	public CustomArithmeticException(int num) { 
		super("Exception occurs at : "+num);
	}
}
