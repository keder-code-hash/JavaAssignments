package in.multithreading.Synchronization_test;

public class TestMain {

	public static void main(String[] args) {
		final Test test=new Test();
		
		Thread t1=new Thread() {
			public void run() {
				test.print(4);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				test.print(5);
			}
		};
		
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		System.out.println("===end===");
		System.out.println(t2.getState());
		t2.start();
		System.out.println(t2.getState());

	}

}
