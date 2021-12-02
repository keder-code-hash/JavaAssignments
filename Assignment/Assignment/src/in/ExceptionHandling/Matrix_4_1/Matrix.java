package in.ExceptionHandling.Matrix_4_1;

public class Matrix {
	private int row;
	private int col;
	int[][] matrix;
	public Matrix(int row,int col) {
		this.row=row;
		this.col=col;
		this.matrix=new int[this.row][this.col];
	}
	public int getElementAt(int i,int j) {
		return this.matrix[i][j]; 
	}
	public void setElementAt(int i,int j,int el) {
		this.matrix[i][j]=el;
	}
	public int findElement(int el) {
		for(int[] i: this.matrix) {
			for(int j : i) {
				if(j==el) {
					return el;
				}
			}
		}
		return -1;
	}
	public Matrix addMatrix(Matrix m2) throws AdditionNotPossibleException{
		if(m2.row==this.row && m2.col==this.col) {
			Matrix res=new Matrix(this.row, this.col);
			for(int i=0;i<this.row;i++) {
				for(int j=0;j<this.col;j++) {
					res.setElementAt(i, j,this.getElementAt(i, j)+m2.getElementAt(i, j));
				}
			}
			return res;
		}
		else {
			throw new AdditionNotPossibleException();
		}
	}
}
