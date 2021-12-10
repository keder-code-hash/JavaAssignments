package in.design_pattern.Singleton_10_1;

public class Singleton {
	public static Singleton singleton=null;
	public int x;
	private Singleton() { 
	}
	public void setVal(int x) {
		this.x=x;
	}
	public int getVal() {
		return this.x;
	}
	public static Singleton getSingleton() {
		if(singleton==null) {
			singleton=new Singleton();
			return singleton;
		}
		return singleton;
	}
}
