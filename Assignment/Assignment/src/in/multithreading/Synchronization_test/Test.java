package in.multithreading.Synchronization_test;

public class Test{
	public synchronized void print(int t) {
		for(int i=0;i<t;i++) {
			System.out.println("Counter Value : "+i);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
