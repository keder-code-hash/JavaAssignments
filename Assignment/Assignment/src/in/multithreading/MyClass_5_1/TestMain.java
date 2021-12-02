package in.multithreading.MyClass_5_1;
 

public class TestMain {

	public static void main(String[] args) { 
		MyClass m1=new MyClass(12);
		MyClass m2=new MyClass(112);
		MyClass m3=new MyClass(122);
		MyClass m4=new MyClass(123);
		
		m1.setPriority((int)(Math.random()*(5-1))+1); 
		m2.setPriority((int)(Math.random()*(5-1))+1);
		m3.setPriority((int)(Math.random()*(5-1))+1);
		m4.setPriority((int)(Math.random()*(5-1))+1); 
		
		m1.start();
		m3.start();
		m2.start();
		m4.start(); 
	}

}
