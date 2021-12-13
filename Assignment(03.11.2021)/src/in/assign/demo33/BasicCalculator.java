package in.assign.demo33;
//Integer

//
//justin time compiler--->byte-->system Instruction

public class BasicCalculator implements RestricA {
	public double addition(double a,double b) {
		return a+b;
	}
	public double substraction(double a,double b) {
		return a-b;
	}
	public double multiplication(double a,double b) {
		return a*b;
	}
	public double modulo(double a,double b) {
		return a%b;
	}
	public RestricA getObject(String name) {
		if(name.charAt(0)=='A') {
			RestricA rsA=new BasicCalculator();
			return rsA;
		}
		else {
			BasicCalculator bs=new BasicCalculator();
			return bs;
		}
	} 
}
