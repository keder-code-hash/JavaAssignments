package in.ExceptionHandling.Matrix_4_1;

public class TestMain {

	public static void main(String[] args) {
		Matrix m1=new Matrix(2,3);
		Matrix m3=new Matrix(2,3);
//		Matrix m2=new Matrix(3,2);
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				m1.setElementAt(i, j, i+j); 
				m3.setElementAt(i, j,i-j);
			}
		}  
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<2;j++) { 
//				m2.setElementAt(i, j, i-j);
//			}
//		}
		Matrix res=null;
		try {
			res=m1.addMatrix(m3);
		}
		catch(AdditionNotPossibleException e) {
			e.printStackTrace();
		}
		finally { 
			if(res !=null) {
				for(int[] i : res.matrix) {
					String result="";
					for(int j: i) {
						result+=j;
					}
					System.out.println(result);
				}
			}
		}
	}

}
