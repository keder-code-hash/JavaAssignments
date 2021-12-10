package in.multithreading.TestTehread;

public class MyRunnable implements Runnable{
	Thread r1;
	public MyRunnable() {
		this.r1=new Thread(this);
		r1.start();
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("TRU"+i);
		}
	}

}
