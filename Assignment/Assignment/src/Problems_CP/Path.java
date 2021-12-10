package Problems_CP;

public class Path {
	public int count=0;
    public void countPath(int row,int col,int m,int n){ 
        if(row==m-1 && col==n-1){ 
            count++;
            return;
        }
        if(row+1<m && row+1>=0 && col<n && col>=0){
            countPath(row+1,col,m,n);
        }
        if(row<m && row>=0 && col+1<n && col+1>=0 ){
            countPath(row,col+1,m,n);
        }
    }
    public int uniquePaths(int m, int n) { 
        countPath(0,0,m,n);
        return count;
    }
    public int uniqueDpPaths(int m,int n) {
    	int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]+=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
	public static void main(String[] args) {
		Path p1=new Path();
		System.out.println(p1.uniqueDpPaths(21, 9));
		System.out.println(p1.uniquePaths(21, 9));
	}

}
