package in.ExceptionHandling.SetScore;

public class Student {
	public String studName;
	public int rollNo;
	private int score;
	public Student(String studName, int rollNo) {
		super();
		this.studName = studName;
		this.rollNo = rollNo;
	}
	public void setScore(int score) {
		this.score=score;
	}
}
