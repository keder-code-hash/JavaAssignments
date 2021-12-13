package in.qstn.autounboxing;

public class AutoUnBoxing {
	public static void main(String[] args) {
		int x=10;
//		Integer y=new Integer(x);// it will automatically convert to Integer no needs of creating 
//		//object.Autoboxing;
		Integer y=x;
		int i=y.intValue();// get the int value.
		int j=y;//it is also permissible in java.called unboxing.Automatically extract the int value from that object.
		System.out.println(y);
	}
}
