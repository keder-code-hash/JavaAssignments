package in.InputAndOutput.obj_rd_wr7_4; 
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream; 

public class TestMain {
    public static void main(String[] args) {
        try {
            String filePathName="D:\\Java\\Assignment\\Assignment\\src\\in\\InputAndOutput\\obj_rd_wr7_4\\student.txt";
            FileOutputStream bWriter=new FileOutputStream(new File(filePathName));
            ObjectOutputStream objStr=new ObjectOutputStream(bWriter);

            bWriter.flush();
            Student std1=new Student(1, "keder", 100);
            Student std2=new Student(2, "Ram", 100);
            
            objStr.flush();
            objStr.writeObject(std1.toString());
            objStr.flush();
            objStr.writeObject(std2.toString());

            objStr.close();
            bWriter.close();
       
       
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
