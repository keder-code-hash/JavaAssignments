package Problems_CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
 

public class Hlputkarsh {
	
	public static int cal(List<String> inpString) {
		int hash[]=new int[26];
		int count=0;
		for(String i:inpString) {
			for(int x=0;x<i.length();x++) {
				if(hash[((int)i.charAt(x))-97]==0) {
					count++;
					System.out.println("Char : "+i.charAt(x));
				} 					
				hash[((int)i.charAt(x))-97]++; 
			}
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfReader=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		count=Integer.parseInt(bfReader.readLine());
		for(int i=0;i<count;i++) {
			int noStr=Integer.parseInt(bfReader.readLine());
			List<String> strList=new ArrayList<String>();
			for(int j=0;j<noStr;j++) {
				String inpString=bfReader.readLine();
				strList.add(inpString);
			}
			System.out.println("Output : " +cal(strList));
		}
		bfReader.close(); 
		
	}
}
