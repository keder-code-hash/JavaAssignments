package in.ExceptionHandling.SetScore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int score;
		Student s1=new Student("ram",1);
		Student s2=new Student("raman",2);
		BufferedReader bfReader=new BufferedReader(new InputStreamReader(System.in));
		score=Integer.parseInt(bfReader.readLine());
		bfReader.close();
		Admin admin=new Admin(); 
		try {
			admin.setScore(score, s1);
		} catch (ScoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
