package in.design_pattern.Singleton_10_1;

public class TestMain {

	public static void main(String[] args) { 
		Singleton singletonObj=Singleton.getSingleton();
		singletonObj.setVal(12);
		System.out.println(singletonObj.getVal());
		System.out.println(singletonObj.hashCode());
		
		Singleton singletonObj1=Singleton.getSingleton(); 
		System.out.println(singletonObj1.getVal());
		System.out.println(singletonObj1.hashCode());
	}

}
