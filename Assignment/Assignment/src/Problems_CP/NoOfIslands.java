package Problems_CP;

public class NoOfIslands {
	public static char[][] g;
    public static void dfsCount(int row,int col){
        int r=g.length;
        int c=g[0].length;
        if(r<=row || row<0 || col<0 || col>=c || g[row][col]=='0'){
            return;
        } 
        g[row][col]='0';
        dfsCount(row-1,col);
        dfsCount(row+1,col);
        dfsCount(row,col-1);
        dfsCount(row,col+1);
    }
    public static int numIslands(char[][] grid) {
        g=grid;
        int r=g.length;
        int c=g[0].length;   
        if(c==0 && r==0){
            return 0;
        }
        int noOfIslands=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c ;j++){
                if(g[i][j]=='1'){
                    noOfIslands++;
                    dfsCount(i,j);
                }
            }
        }
         
        return noOfIslands;
    }
	public static void main(String[] args) {
		char[][] grid= {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		System.out.println(numIslands(grid));

	}

}
