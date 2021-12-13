package in.assign.demo31;

public class TestMain {
	public static void main(String[] args) {
		String string="Hello world12345";
		char[] filterOut= {1,2,3,4,5,6,7,8,9,0 };
		NumberFIlter nFIlter=new NumberFIlter();
		System.out.println(nFIlter.filter(string,filterOut));
	}
}
