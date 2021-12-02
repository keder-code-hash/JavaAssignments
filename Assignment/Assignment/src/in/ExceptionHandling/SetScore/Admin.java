package in.ExceptionHandling.SetScore;

public class Admin{ 
	public void setScore(int score,Student stud) throws ScoreException{
		if(score < 0 || score >100) {
			throw new ScoreException("Score exception has occured");
		}
		else {
			stud.setScore(score);
		}
	}
}
