package in.assign.demo34;

import java.rmi.RemoteException;
import java.rmi.server.*;

public class BasicCalculator extends UnicastRemoteObject implements RemoteUserInt{
 
	protected BasicCalculator() throws RemoteException {
		super();  
	}

	public double addition(double a, double b) { 
		return a+b;
	}
 
	public double substraction(double a, double b) { 
		return a-b;
	}
 
	public double multplication(double a, double b) { 
		return a*b;
	}
 
	public double division(double a, double b) { 
		return a/b;
	}
 
	public double modulo(double a, double b) { 
		return a%b;
	}

}
