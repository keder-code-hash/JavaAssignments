package in.assign.demo34;

import java.rmi.RemoteException;

public class ScientificCalculator extends BasicCalculator implements LocalUserInt{
 
	protected ScientificCalculator() throws RemoteException {
		super(); 
	}

	public double log(double num, double base) { 
		return Math.log(num)/Math.log(base);
	}
 
	public double exponential(double base, double exponen) { 
		return Math.pow(base, exponen);
	}

}
