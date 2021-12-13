package in.assign.demo34;

import java.rmi.Naming;

public class Server {
	public static void main(String[] args) {
		try {
			LocalUserInt lclcalInt=new ScientificCalculator();
			RemoteUserInt rmcalIntStub=new BasicCalculator();
			Naming.bind("rmi://localhost:5000/cal", rmcalIntStub);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
