import java.util.*;

public class ComplexMain {

	public static void main(String[] args) {
		ComplexNum num1=new ComplexNum();
		ComplexNum num2=new ComplexNum();
		
		System.out.println("Enter the first number: \n");
		Scanner scObj=new Scanner(System.in);
		System.out.println("Real Part: ");
		num1.realPart=scObj.nextInt();
		System.out.println("Imaginary Part: ");
		num1.complexPart=scObj.nextInt();
		
		System.out.println("Enter the second number: \n");
		System.out.println("Real Part: ");
		num2.realPart=scObj.nextInt();
		System.out.println("Imaginary Part: ");
		num2.complexPart=scObj.nextInt();
		
		ComplexConverter newObj=new ComplexConverter(num1, num2);
		
		
		newObj.addition();
		System.out.println("Addition of Two Number: "+newObj.res.realPart+" "+newObj.res.complexPart+"i");
		
		
		newObj.substraction();
		System.out.println("Substraction of Two Number: "+newObj.res.realPart+" "+newObj.res.complexPart+"i");
		
		
		newObj.multiplication();
		System.out.println("Multiplication of Two Number: "+newObj.res.realPart+" "+newObj.res.complexPart+"i");
		
	}

}
