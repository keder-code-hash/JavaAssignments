package in.assign.demo33;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String inpString=scanner.next();
		
		
		RestricA a=new BasicCalculator().getObject(inpString);
		System.out.println(a.addition(1.2, 1.3));
		

		RestricS sCal=new ScientificCal();
//		sCal.
		
//		restricS s=new ScientificCal().getObject(inpString);
//		System.out.println(s.exponen(1.2));
//		
//		BasicCalculator b=(BasicCalculator) new BasicCalculator().getObject(inpString);
//		System.out.println(b.multiplication(1.0, 1.2));
		
		scanner.close();
	}
}
