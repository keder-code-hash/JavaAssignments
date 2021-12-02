package Problems_CP; 
import java.util.Vector;

public class coinSum {
	public static void calCoins(int target,int coins[],int dp[]) {
		for(int i=0;i<=target;i++) {
			dp[i]=target+1;
		}
		dp[0]=0;
		for(int i=1;i<target+1;i++) {
			for(int j=0;j<coins.length;j++) {
				if(coins[j]<=i) {
					dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
				}
			}
		}
		if(dp[target]>target) {
			System.out.println("not possible");
		}
		else {
			printCoins(dp, coins, target);
		}
	}
	public static void printCoins(int[] dp,int[] coins,int target) {
		Vector<Integer> vector=new Vector<Integer>();
		int j=target;
		while(j>0) {
			int i=0;
			for(i=0;i<coins.length;i++) {  
				if(j-coins[i]>=0 && dp[j-coins[i]]==dp[j]-1) {
					vector.add(coins[i]);
				    break;
				}
			}
			j=j-coins[i];
		}
//		String reString="";
//		for(int i:dp) {
//			reString+=i+" ";
//		}
		
//		System.out.println(reString);
		System.out.println("Total no of coins: "+dp[target]);
		System.out.println(vector);
	}
	public static void main(String[] args) {
		int[] coins={4,9,10};
		int[] dp=new int[9+1];
		calCoins(9, coins, dp);
	}

}
