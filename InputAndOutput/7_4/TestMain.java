import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class TestMain {
    public static void main(String[] args) {
        try {
            String filePathName="D:/Java/InputAndOutput/7_4/student.txt";
            FileOutputStream bWriter=new FileOutputStream(new File(filePathName));
            ObjectOutputStream objStr=new ObjectOutputStream(bWriter);

            Student std1=new Student(1, "keder", 100);
            Student std2=new Student(2, "Ram", 100);
            
            objStr.

            objStr.writeObject(std1.toString());
            objStr.writeObject(std2.toString());

            objStr.close();
            bWriter.close();
       
       
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
