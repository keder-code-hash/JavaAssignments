import java.util.*;
public class MainTime {

	public static void main(String[] args) {
		System.out.println("Enter The time: \n");
		Scanner scObj=new Scanner(System.in);
		System.out.println("Hour: \n");
		int h=scObj.nextInt();
		System.out.println("Minute: \n");
		int m=scObj.nextInt();
		System.out.println("Second: \n");
		int s=scObj.nextInt();
		
		Time converter=new Time(h, m, s);
		String result=converter.convert();
		
		System.out.println("Converted Time Is: "+result);
		

	}

}
