package in.assign.demo33;

public class ScientificCal extends BasicCalculator implements RestricS{
	public double exponen(double a) {
		return a;
	}
	public double logarithmFn(double a) {
		return a;
	}
	
	public RestricS getObject(String name) {
		if(name.charAt(0)=='S') {
			RestricS rsS=new ScientificCal();
			return rsS;
		}
		return null;
	}
}
