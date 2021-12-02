package in.multithreading.MyClass_5_1;
 
/**
 * 5.1 Question
 * Define a class, MyClass, by inheriting Thread class and create 4 threads with random priority in
 * the range of 1...5. Update a counter for 10 mili-seconds in each of the threads. In these threads
 * priority will be increased by 1, 2, 2, 1 respectively in every 30 millisecond. Print the priority and
 * the value of counter for each threads in every 10 milliseconds
 * */
public class MyClass extends Thread{
	private int x; 
	public MyClass(int x) {
		this.x=x; 
	} 
	public void run() {  
//		for (int i = 0; i < 5; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) { 
//				e.printStackTrace();
//			}
//			finally {
				System.out.println("Thread prority: "+this.getPriority()+"Thread Id : "+this.getName()); 
				
//			}
			
//		}
	}
}
