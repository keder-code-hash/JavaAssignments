package in.assign.demo34;

import java.rmi.Naming;

public class Client {
	public static void main(String[] args) {
		try {
			RemoteUserInt rmtInt=(RemoteUserInt) Naming.lookup("rmi://localhost:5000/cal");
			System.out.println("Addition:--> "+rmtInt.addition(12.2, 11.1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
