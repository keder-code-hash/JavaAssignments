package in.multithreading.TestTehread;

public class MyThread extends Thread{
	Thread r1;
	public MyThread() {
		this.r1=new Thread(this);
		r1.start();
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("TR"+i);
		}
	}
}
