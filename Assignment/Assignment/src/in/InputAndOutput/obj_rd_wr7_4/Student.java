package in.InputAndOutput.obj_rd_wr7_4;
import java.io.Serializable;

public class Student implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int rollNo;
    public String name;
    public double score;
    public Student(int rollNo, String name, double score) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }
    public int getRollNo() {
        return rollNo;
    } 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String toString() { 
        return new StringBuffer().append("Name : ").append(this.name)
        .append(" Score : ").append(this.score).append(" Roll: ").append(this.rollNo).append("\n").toString();
    }
    
}
