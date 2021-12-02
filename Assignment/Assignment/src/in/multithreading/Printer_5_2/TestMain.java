package in.multithreading.Printer_5_2;

public class TestMain {
	public static void main(String[] args) {
		
		GenerateRequests t1=new GenerateRequests(3);
		t1.start();  
		
	}
}
