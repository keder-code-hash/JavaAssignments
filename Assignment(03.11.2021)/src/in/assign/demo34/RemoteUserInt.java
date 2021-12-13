package in.assign.demo34;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteUserInt extends Remote{
	public double addition(double a,double b) throws RemoteException;
	public double substraction(double a,double b) throws RemoteException;
	public double multplication(double a,double b) throws RemoteException;
	public double division(double a,double b) throws RemoteException;
	public double modulo(double a,double b) throws RemoteException;
}
