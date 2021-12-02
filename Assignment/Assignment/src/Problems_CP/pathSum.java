package Problems_CP;
public class pathSum {
	public static int[][] dp=new int[4][4];
	public static int[][] visited=new int[4][4];
	public static int [][] path=new int[4][4];
	
	public static int maximumPath(int i,int j,int row,int col,int mat[][]) {
		if(i==row-1 && j==col-1) {
			return mat[i][j];
		}
		if(visited[i][j]!=0) {
			return mat[i][j];
		} 
		visited[i][j]=1;
		int totSum=0;
		if(i<row-1 && j<col-1) {
			int sum=Math.max(maximumPath(i, j+1, row, col, mat),maximumPath(i+1, j, row, col, mat));
			totSum=sum+mat[i][j];
		}
		else if(i==row-1) { 
			totSum=mat[i][j]+maximumPath(i, j+1, row, col, mat);
		}
		else {
			totSum=mat[i][j]+maximumPath(i+1, j, row, col, mat);
		}
		dp[i][j]=totSum;
		return totSum;
	}
	public static void calculatePath(int[][] mat) {
		int maxTot=dp[0][0];
		
	}
	public static void main(String[] args) { 
		int[][] mat= {{2,100,3,1},{200,1,4,1},{2,4,3,1},{5,3,2,2}};
		System.out.println(maximumPath(0, 0, 4, 4, mat));
		for(int[] i:dp) {
			String reString="";
			for(int j:i) {
				reString+=j+" ";
			}
			System.out.println(reString);
		}
	}
}

/**
 * 
 * 2 1 3 1
 * 1 2 4 1
 * 2 4 3 1
 * 5 3 2 2
 * 
 * 2 100 3 1
 * 1 2 4 1
 * 2 4 3 1
 * 5 3 2 2
 * 
 * 2 100 3 1
 * 200 1 4 1
 * 2 4 3 1
 * 5 3 2 2
 * 
 * */ 