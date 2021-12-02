package in.multithreading.Printer_5_2;

public class Printer extends Thread{ 
	public int userId;
	public int pageNo;
	
	public Printer(int userId, int pageNo) { 
		this.userId = userId;
		this.pageNo = pageNo;
	}

	public synchronized void print(int page) {
		System.out.println(page+" no page is printing for user"+this.userId);
	}

	public void run() {
		for(int i=0;i<pageNo;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			print(i);
		}
	}
}
