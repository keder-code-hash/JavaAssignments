package Problems_CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FarmerSwan {
	public static int Calculate(List<Integer> list) {
		int eggs=0;
		for(Integer k:list) {
			for(int i=1;i<=k;i++) {
				if(i>=52) {
					eggs+=4;
				} 
			}
//			System.out.println(eggs);
		}
//		System.out.println(eggs);
		return eggs;
	}
	public static void main(String[] args) throws IOException {  
		BufferedReader bfReader=new BufferedReader(new InputStreamReader(System.in));
		String inpString=bfReader.readLine();
		String[] splString=inpString.split("\\s");
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=Integer.parseInt(splString[0]);i++) {
			list.add(Integer.parseInt(splString[i]));
		}
		System.out.println(list);
		bfReader.close();
		System.out.println(Calculate(list)); 
	}
	
}

// 4 51 52 53 54
// 5 51 52 53 54 60
