package in.ExceptionHandling.RandomArith_4_2;

public class TestMain {

	public static void checkExp(int chk) throws CustomArithmeticException{
		for(int i=0;i<10;i++) {
			int randInt=(int)(Math.random()*(10-i))+i;
			if(chk==randInt) {
				throw new CustomArithmeticException(i);
			}
		}
	}
	public static void main(String[] args) { 
		try {
			checkExp(3);
		}
		catch(CustomArithmeticException ae) {
			ae.printStackTrace();
		}
	}

}
