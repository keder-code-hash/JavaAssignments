package Problems_CP;

import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
public class Solution {
	public static int solve(int[] inpList,int size) {
		int cost=0;
		for(int i=0;i<size-1;i++) {
			int minIndex=0;
			int minVal=Integer.MAX_VALUE;
			
			for(int j=i;j<size;j++) {
				if(inpList[j]<minVal) {
					minVal=inpList[j];
					minIndex=j;
				}
			}
			
			for(int k=i,x=minIndex;k<(int)(((minIndex-i)/2)+i);k++,x--) {
				int temp=inpList[k];
				inpList[k]=inpList[x];
				inpList[x]=temp;
				} 
			cost+=minIndex-i+1;
			
		}
		return cost;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T=sc.nextInt();
		for (int i = 0; i < T; i++) {
			int size=sc.nextInt();
			int[] inpList=new int[size];
			for(int j=0;j<size;j++) {
				int inp=sc.nextInt();
				inpList[j]=inp; 
			} 
			System.out.println("Case #"+(i+1)+":"+solve(inpList, size));
//			System.out.println(opString);
		}
		sc.close();
	}

}
